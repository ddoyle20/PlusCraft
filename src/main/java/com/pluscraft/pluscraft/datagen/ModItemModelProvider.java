package com.pluscraft.pluscraft.datagen;

import com.pluscraft.pluscraft.PlusCraft;
import com.pluscraft.pluscraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper exFileHelper){
        super(output, PlusCraft.MODID, exFileHelper);
    }
    @Override
    protected void registerModels(){
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.NETHERITE_ROD);
        simpleItem(ModItems.RUBY_ARROW);
        simpleItem(ModItems.RUBY_HELMET);
        simpleItem(ModItems.RUBY_CHESTPLATE);
        simpleItem(ModItems.RUBY_LEGGINGS);
        simpleItem(ModItems.RUBY_BOOTS);

    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(PlusCraft.MODID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(PlusCraft.MODID, "item/" + item.getId().getPath()));
    }
}
