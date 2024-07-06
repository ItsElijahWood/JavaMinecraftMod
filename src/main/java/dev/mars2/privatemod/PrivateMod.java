package dev.mars2.privatemod;

import dev.mars2.privatemod.init.BlockInit;
import dev.mars2.privatemod.init.CreativeTabInit;
import dev.mars2.privatemod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PrivateMod.MODID)
public class PrivateMod {
    public static final String MODID = "privatemod";

    public PrivateMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
    }
}
