package com.pluscraft.pluscraft.datagen;

import com.pluscraft.pluscraft.PlusCraft;
import com.pluscraft.pluscraft.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper){
        super(output, PlusCraft.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels(){
         blockWithItem(ModBlocks.RUBY_BLOCK);
         blockWithItem(ModBlocks.RUBY_ORE);
         blockWithItem(ModBlocks.PORTAL_FRAME_BLOCK);
         blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
         //blockWithItem(ModBlocks.DIM_PORTAL);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
