package com.pluscraft.pluscraft.worldgen;

import com.google.common.collect.ImmutableList;
import com.pluscraft.pluscraft.PlusCraft;
import com.pluscraft.pluscraft.block.ModBlocks;
import com.pluscraft.pluscraft.util.ModTags;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RuleTest DIM_STONE_ORE_REPLACEABLES = new TagMatchTest(ModTags.Blocks.DIM_STONE_ORE_REPLACEABLES);
    public static final RuleTest STONE_ORE_REPLACEABLES = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
    public static final RuleTest DEEPSLATE_ORE_REPLACEABLES = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
    public static final ResourceKey<ConfiguredFeature<?, ?>>    RUBY_ORE = registerKey("ruby_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        List<OreConfiguration.TargetBlockState> rubyOres = List.of(
                OreConfiguration.target(STONE_ORE_REPLACEABLES, ModBlocks.STONE_RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(DIM_STONE_ORE_REPLACEABLES, ModBlocks.STONE_RUBY_ORE.get().defaultBlockState()));

        register(context, RUBY_ORE, Feature.ORE, new OreConfiguration(rubyOres, 3));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(PlusCraft.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
