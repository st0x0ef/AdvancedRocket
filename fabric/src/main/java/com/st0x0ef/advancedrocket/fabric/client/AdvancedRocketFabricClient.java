package com.st0x0ef.advancedrocket.fabric.client;

import com.st0x0ef.advancedrocket.client.AdvancedRocketClient;
import net.fabricmc.api.ClientModInitializer;

public class AdvancedRocketFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AdvancedRocketClient.initClient();
    }
}
