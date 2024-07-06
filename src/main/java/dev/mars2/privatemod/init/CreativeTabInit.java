package dev.mars2.privatemod.init;

import dev.mars2.privatemod.PrivateMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = PrivateMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrivateMod.MODID);

    public static final List<Supplier<? extends ItemLike>> EXAMPLE_TAB_ITEMS = new ArrayList<>();
    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = TABS.register("mod_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.mod_tab"))
                    .icon(ItemInit.EXAMPLE_ITEM.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        EXAMPLE_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .withSearchBar()
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        EXAMPLE_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ItemInit.EXAMPLE_BLOCK_ITEM);
            event.getEntries().putAfter(Items.ACACIA_LOG.getDefaultInstance(), ItemInit.EXAMPLE_BLOCK_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(event.getTab() == EXAMPLE_TAB.get()) {
            // Example of adding vanila items into tab event.accept(Items.CROSSBOW);
        }
    }
}
