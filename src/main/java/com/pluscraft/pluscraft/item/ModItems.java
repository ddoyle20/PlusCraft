package com.pluscraft.pluscraft.item;

import com.pluscraft.pluscraft.PlusCraft;
import com.pluscraft.pluscraft.block.ModBlocks;
import com.pluscraft.pluscraft.item.custom.*;
import net.minecraft.world.item.*;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PlusCraft.MODID);

    //Creating an item
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", CatalystItem::new);
    //Registers a new sword item first num -> attack damage second num -> attack speed
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(Tiers.RUBY, 4, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(Tiers.RUBY, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(Tiers.RUBY, -4, 0.0F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(Tiers.RUBY, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(Tiers.RUBY, 7, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_BOW = ITEMS.register("ruby_bow",
            () -> new BowItem(new Item.Properties().durability(3000)));
    public static final RegistryObject<Item> RUBY_ARROW = ITEMS.register("ruby_arrow",
            () -> new RubyArrowItem(new Item.Properties()));
    public static final RegistryObject<Item> PORTAL_BLOCK_CORE = ITEMS.register("portal_block_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PORTAL_BLOCK_ITEM = ITEMS.register("portal_block",
            () -> new PortalBlockItem(ModBlocks.PORTAL_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_ROD = ITEMS.register("netherite_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new RubyArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static class Tiers{
        public static final Tier RUBY = new ForgeTier(5, 3000, 15, 5, 16, null,
                () -> Ingredient.of(ModItems.RUBY.get()));
    }

}

