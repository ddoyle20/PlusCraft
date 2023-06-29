package com.pluscraft.pluscraft.datagen;

import com.pluscraft.pluscraft.block.ModBlocks;
import com.pluscraft.pluscraft.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables(){
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }
    @Override
    protected void generate(){
        //Generates a loot table in which the block drops itself
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.PORTAL_BLOCK.get());
        dropSelf(ModBlocks.PORTAL_FRAME_BLOCK.get());
        dropSelf(ModBlocks.DIM_COBBLESTONE.get());
        dropSelf(ModBlocks.DIM_DIRT.get());


        //Generates a loot table so that DIM_STONE will be dropped only if it is mined with a silk touch pickaxe, DIM_COBBLESTONE otherwise
        add(ModBlocks.DIM_STONE.get(),
                (block) -> createSingleItemTableWithSilkTouch(ModBlocks.DIM_STONE.get(), ModBlocks.DIM_COBBLESTONE.get()));
        add(ModBlocks.DIM_GRASS_BLOCK.get(),
                (block -> createSingleItemTableWithSilkTouch(ModBlocks.DIM_GRASS_BLOCK.get(), ModBlocks.DIM_DIRT.get())));

        //Generates a loot table for ore drops, similar to the one above
        add(ModBlocks.STONE_RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.STONE_RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlocks.DIM_STONE_RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DIM_STONE_RUBY_ORE.get(), ModItems.RUBY.get()));
    }
    @Override
    protected Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
