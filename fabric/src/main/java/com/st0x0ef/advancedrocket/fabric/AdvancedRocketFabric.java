package com.st0x0ef.advancedrocket.fabric;

import com.st0x0ef.advancedrocket.AdvancedRocket;
import net.fabricmc.api.ModInitializer;

public class AdvancedRocketFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AdvancedRocket.init();
    }
}