package com.st0x0ef.advancedrocket.common.entities;

import com.st0x0ef.advancedrocket.common.rocket.RocketData;
import dev.architectury.networking.NetworkManager;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class RocketEntity extends Entity {
    private RocketData data;

    public RocketEntity(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    public RocketEntity(EntityType<?> entityType, Level level, RocketData data) {
        super(entityType, level);
        this.data = data;
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {

    }

    @Override
    protected void readAdditionalSaveData(CompoundTag compound) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundTag compound) {

    }

    @Override
    public Packet<ClientGamePacketListener> getAddEntityPacket(ServerEntity entity) {
        return NetworkManager.createAddEntityPacket(this, entity);
    }
}
