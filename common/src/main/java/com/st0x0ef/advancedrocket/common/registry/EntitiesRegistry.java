package com.st0x0ef.advancedrocket.common.registry;

import com.st0x0ef.advancedrocket.AdvancedRocket;
import com.st0x0ef.advancedrocket.common.entities.RocketEntity;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class EntitiesRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = DeferredRegister.create(AdvancedRocket.MODID, Registries.ENTITY_TYPE);

    public static final RegistrySupplier<EntityType<Entity>> ROCKET = ENTITY_TYPE.register("rocket", () -> EntityType.Builder.of(RocketEntity::new, MobCategory.MISC).sized(1.1f, 4.4f).fireImmune().build(ResourceLocation.fromNamespaceAndPath(AdvancedRocket.MODID, "rocket").toString()));
}
