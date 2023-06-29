package com.pluscraft.pluscraft.datagen;

import com.pluscraft.pluscraft.PlusCraft;
import com.pluscraft.pluscraft.block.ModBlocks;
import com.pluscraft.pluscraft.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class ModBlockTags extends IntrinsicHolderTagsProvider<Block> {
    public ModBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, Registries.BLOCK, future, block -> block.builtInRegistryHolder().key(), PlusCraft.MODID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Blocks.DIM_STONE_ORE_REPLACEABLES).add(ModBlocks.DIM_STONE.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.DIM_STONE.get(),
                ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                ModBlocks.DIM_COBBLESTONE.get(),
                ModBlocks.PORTAL_BLOCK.get(),
                ModBlocks.PORTAL_FRAME_BLOCK.get(),
                ModBlocks.RUBY_BLOCK.get(),
                ModBlocks.STONE_RUBY_ORE.get(),
                ModBlocks.DIM_STONE_RUBY_ORE.get()
        );
        tag(BlockTags.MINEABLE_WITH_SHOVEL).add(
                ModBlocks.DIM_GRASS_BLOCK.get(),
                ModBlocks.DIM_DIRT.get()
        );
        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(
                ModBlocks.DIM_STONE.get(),
                ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                ModBlocks.DIM_COBBLESTONE.get(),
                ModBlocks.STONE_RUBY_ORE.get(),
                ModBlocks.DIM_STONE_RUBY_ORE.get()
        );
    }
}
