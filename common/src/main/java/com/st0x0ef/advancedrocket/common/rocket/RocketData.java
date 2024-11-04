package com.st0x0ef.advancedrocket.common.rocket;

import com.st0x0ef.advancedrocket.AdvancedRocket;
import net.minecraft.core.BlockPos;

import java.util.ArrayList;
import java.util.List;

public class RocketData {
    public RocketData() {

    }

    public static class Builder {
        private final List<BlockPos> normalBlockPos;
        private final List<BlockPos> specialBlockPos;

        private Builder() {
            normalBlockPos = new ArrayList<>();
            specialBlockPos = new ArrayList<>();
        }

        public static Builder create() {
            return new Builder();
        }

        public Builder addBlockPos(BlockPos pos) {
            // TODO : separate block between normal and special (motor, tank, etc.)

            if (normalBlockPos.size() + specialBlockPos.size() > 200) {
                AdvancedRocket.LOG.error("The rocket is too big :(");
                return null;
            }

            if (!normalBlockPos.contains(pos) && ! specialBlockPos.contains(pos)) {
                normalBlockPos.add(pos);
            }

            return this;
        }

        public boolean containBlockPos(BlockPos pos) {
            return normalBlockPos.contains(pos) || specialBlockPos.contains(pos);
        }

        public List<BlockPos> getAllBlocksPos() {
            List<BlockPos> allBlockPos = new ArrayList<>();
            allBlockPos.addAll(normalBlockPos);
            allBlockPos.addAll(specialBlockPos);
            return allBlockPos;
        }

        public RocketData build() {
            // TODO : add special block to rocket data
            return new RocketData();
        }
    }
}
