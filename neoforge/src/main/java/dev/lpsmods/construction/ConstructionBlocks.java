package dev.lpsmods.construction;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class ConstructionBlocks {

    public ConstructionBlocks(IEventBus eventBus) {
        Bootstrap.init();
    }
}