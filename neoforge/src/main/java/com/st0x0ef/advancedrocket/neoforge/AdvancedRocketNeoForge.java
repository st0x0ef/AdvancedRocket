package com.st0x0ef.advancedrocket.neoforge;

import com.st0x0ef.advancedrocket.AdvancedRocket;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(AdvancedRocket.MODID)
public class AdvancedRocketNeoForge {
    public AdvancedRocketNeoForge(IEventBus bus) {
        AdvancedRocket.init();
    }
}