package com.st0x0ef.advancedrocket.common.registry;

import com.st0x0ef.advancedrocket.AdvancedRocket;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(AdvancedRocket.MODID, Registries.ITEM);

    public static final RegistrySupplier<Item> CONTROL_STATION = ITEMS.register("control_station", () -> new BlockItem(BlocksRegistry.CONTROL_STATION.get(), new Item.Properties().arch$tab(CreativeTabsRegistry.ADVANCED_ROCKET_TAB)));

}
