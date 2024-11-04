package com.st0x0ef.advancedrocket.common.registry;

import com.st0x0ef.advancedrocket.AdvancedRocket;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabsRegistry {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(AdvancedRocket.MODID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> ADVANCED_ROCKET_TAB = TABS.register(
            "advanced_rocket",
            () -> CreativeTabRegistry.create(
                    Component.translatable("categorie.advancedrocket.main"),
                    () -> new ItemStack(ItemsRegistry.CONTROL_STATION)
            )
    );
}
