package dev.mars2.privatemod.init;

import dev.mars2.privatemod.PrivateMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static dev.mars2.privatemod.init.CreativeTabInit.addToTab;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PrivateMod.MODID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = addToTab(ITEMS.register("example_item",
            () -> new Item(new Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build()
                    ))));


    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = addToTab(ITEMS.register("example_block",
            () -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON)
            )));

    // Examples Above

    public static final RegistryObject<Item> PLANKS_BIRCH_YELLOW = addToTab(ITEMS.register("planks_birch",
            () -> new BlockItem(BlockInit.PLANKS_BIRCH.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON)
            )));

    public static final RegistryObject<Item> PLANKS_BIRCH_BLUE = addToTab(ITEMS.register("planks_birch_blue",
            () -> new BlockItem(BlockInit.PLANKS_BIRCH_BLUE.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON)
            )));

    public static final RegistryObject<Item> ORE = addToTab(ITEMS.register("planks_ore",
            () -> new BlockItem(BlockInit.PLANKS_ORE.get(),
                    new Item.Properties()
            )));


}
