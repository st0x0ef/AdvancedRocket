package com.st0x0ef.advancedrocket.neoforge.client;

import com.st0x0ef.advancedrocket.AdvancedRocket;
import com.st0x0ef.advancedrocket.client.AdvancedRocketClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = AdvancedRocket.MODID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class AdvancedRocketNeoforgeClient {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(AdvancedRocketClient::initClient);
    }
}
