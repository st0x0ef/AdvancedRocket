package com.st0x0ef.advancedrocket.common.blocks;

import com.mojang.serialization.MapCodec;
import com.st0x0ef.advancedrocket.common.rocket.RocketData;
import com.st0x0ef.advancedrocket.common.rocket.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class ControlStationBlock extends BaseEntityBlock {

    public ControlStationBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return simpleCodec(ControlStationBlock::new);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        RocketData.Builder rocketBuilder = Utils.createRocketBuilder(pos, level);
        if (rocketBuilder != null) {
            Utils.destroyBlocksAndCreateRocketEntity(rocketBuilder, level);
        }

        return super.useWithoutItem(state, level, pos, player, hitResult);
    }
}
