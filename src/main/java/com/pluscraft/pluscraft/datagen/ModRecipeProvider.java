package com.pluscraft.pluscraft.datagen;

import com.pluscraft.pluscraft.block.ModBlocks;
import com.pluscraft.pluscraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output){
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer){


        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY.get(),
                RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get());
    }
}
