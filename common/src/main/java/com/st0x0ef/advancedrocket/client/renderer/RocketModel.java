package com.st0x0ef.advancedrocket.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.st0x0ef.advancedrocket.common.entities.RocketEntity;
import net.minecraft.client.model.EntityModel;

public class RocketModel <T extends RocketEntity> extends EntityModel<T> {
    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, int color) {

    }
}
