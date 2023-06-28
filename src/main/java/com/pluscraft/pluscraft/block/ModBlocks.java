package com.pluscraft.pluscraft.block;

import com.pluscraft.pluscraft.PlusCraft;
import com.pluscraft.pluscraft.block.custom.PortalBlock;
import com.pluscraft.pluscraft.block.custom.CustomPortalBlock;
import com.pluscraft.pluscraft.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PlusCraft.MODID);

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STONE_RUBY_ORE = registerBlock("stone_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));

    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(2,6)));
    public static final RegistryObject<Block> PORTAL_BLOCK = BLOCKS.register("portal_block",
            () -> new PortalBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(
                    BlockState -> 15)));
    public static final RegistryObject<Block> PORTAL_FRAME_BLOCK = registerBlock("portal_frame_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()));
    public static final RegistryObject<Block> DIM_PORTAL = registerBlockWithoutBlockItem("dim_portal",
            CustomPortalBlock::new);

    public static final RegistryObject<Block> DIM_STONE = registerBlock("dim_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIM_COBBLESTONE = registerBlock("dim_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIM_DIRT = registerBlock("dim_dirt",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(0.5f).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> DIM_GRASS_BLOCK = registerBlock("dim_grass_block",
            () -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS).strength(0.6f).randomTicks().sound(SoundType.GRASS)));

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
