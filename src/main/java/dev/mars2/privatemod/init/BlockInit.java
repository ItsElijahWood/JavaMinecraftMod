package dev.mars2.privatemod.init;

import dev.mars2.privatemod.PrivateMod;
import net.minecraft.client.resources.model.Material;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            PrivateMod.MODID);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register(
            "example_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(6.5f, 4.5f)
            ));

    // Examples Above

    public static final RegistryObject<Block> PLANKS_BIRCH = BLOCKS.register(
            "planks_birch",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(2.5f, 0.5f)
            ));

    public static final RegistryObject<Block> PLANKS_BIRCH_BLUE = BLOCKS.register(
            "planks_birch_blue",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .strength(2.5f, 0.5f)
            ));

    public static final RegistryObject<Block> PLANKS_ORE = BLOCKS.register(
            "planks_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(8.5f, 4.5f)
            ));
};
