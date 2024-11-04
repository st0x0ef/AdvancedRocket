package com.st0x0ef.advancedrocket.common.registry;

import com.st0x0ef.advancedrocket.AdvancedRocket;
import com.st0x0ef.advancedrocket.common.blocks.ControlStationBlock;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class BlocksRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(AdvancedRocket.MODID, Registries.BLOCK);

    public static final RegistrySupplier<Block> CONTROL_STATION = BLOCKS.register("control_station", () -> new ControlStationBlock(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).sound(SoundType.METAL).strength(4f, 2.5f)));
}
