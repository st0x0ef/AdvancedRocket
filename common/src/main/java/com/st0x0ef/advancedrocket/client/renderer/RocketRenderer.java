package com.st0x0ef.advancedrocket.client.renderer;

import com.st0x0ef.advancedrocket.common.entities.RocketEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.resources.ResourceLocation;

public class RocketRenderer <T extends RocketEntity, M extends EntityModel<T>> extends EntityRenderer<T> implements RenderLayerParent<T, M> {
    protected RocketRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public M getModel() {
        return null;
    }

    @Override
    public ResourceLocation getTextureLocation(T entity) {
        return null;
    }
}
