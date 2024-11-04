package com.st0x0ef.advancedrocket;

import com.st0x0ef.advancedrocket.common.registry.BlocksRegistry;
import com.st0x0ef.advancedrocket.common.registry.CreativeTabsRegistry;
import com.st0x0ef.advancedrocket.common.registry.EntitiesRegistry;
import com.st0x0ef.advancedrocket.common.registry.ItemsRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancedRocket {
    public static final String MODID = "advancedrocket";
    public static final Logger LOG = LoggerFactory.getLogger("Advanced Rocket");

    public static void init() {
        BlocksRegistry.BLOCKS.register();
        ItemsRegistry.ITEMS.register();
        CreativeTabsRegistry.TABS.register();
        EntitiesRegistry.ENTITY_TYPE.register();
    }
}
