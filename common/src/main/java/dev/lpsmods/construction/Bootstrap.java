package dev.lpsmods.construction;

import dev.lpsmods.construction.core.ModBlocks;
import dev.lpsmods.construction.core.ModCreativeModeTabs;
import dev.lpsmods.construction.core.ModItems;

public class Bootstrap {
    public static void init() {
        ModBlocks.init();
        ModItems.init();
        ModCreativeModeTabs.init();
    }
}