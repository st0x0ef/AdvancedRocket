package com.st0x0ef.advancedrocket.common.rocket;

import com.st0x0ef.advancedrocket.AdvancedRocket;
import com.st0x0ef.advancedrocket.common.entities.RocketEntity;
import com.st0x0ef.advancedrocket.common.registry.EntitiesRegistry;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.PushReaction;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Utils {
    public static RocketData.Builder createRocketBuilder(BlockPos controlStationPos, Level level) {
        Queue<BlockPos> positionsToCheck = new LinkedList<>();

        RocketData.Builder rocketBuilder = RocketData.Builder.create();

        for (Direction direction : Direction.values()) {
            positionsToCheck.offer(controlStationPos.relative(direction));
        }

        while (!positionsToCheck.isEmpty()) {
            BlockPos currentPos = positionsToCheck.poll();
            if (!level.getBlockState(currentPos).isAir() && !level.getBlockState(currentPos).is(Blocks.OBSIDIAN)) {
                if (rocketBuilder.addBlockPos(currentPos) != null) {
                    for (Direction direction : Direction.values()) {
                        if (!rocketBuilder.containBlockPos(currentPos.relative(direction))) {
                            positionsToCheck.offer(currentPos.relative(direction));
                        }
                    }
                } else {
                    return null;
                }
            }

            if (positionsToCheck.size() > 100) {
                AdvancedRocket.LOG.error("The rocket is too big :(");
                return null;
            }
        }

        return rocketBuilder;
    }

    public static LayerDefinition createRocketModel(List<BlockPos> blocks) {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        
        for (int i = 0; i < blocks.size(); i++) {
            partdefinition.addOrReplaceChild(String.valueOf(i), CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0f, 0f, 0f, 1f, 1f, 1f, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
        }

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static void destroyBlocksAndCreateRocketEntity(RocketData.Builder rocketBuilder, Level level) {
        rocketBuilder.getAllBlocksPos().forEach((pos) -> level.removeBlock(pos, false));

        RocketEntity rocket = new RocketEntity(EntitiesRegistry.ROCKET.get(), level, rocketBuilder.build());
        level.addFreshEntity(rocket);
    }
}
