package com.pluscraft.pluscraft;

import com.mojang.logging.LogUtils;
import com.pluscraft.pluscraft.block.ModBlocks;
import com.pluscraft.pluscraft.block.entity.ModBlockEntities;
import com.pluscraft.pluscraft.block.entity.client.PortalBlockRenderer;
import com.pluscraft.pluscraft.entity.ModEntities;
import com.pluscraft.pluscraft.entity.client.RubyArrowRenderer;
import com.pluscraft.pluscraft.item.ModCreativeModeTabs;
import com.pluscraft.pluscraft.item.ModItems;
import com.pluscraft.pluscraft.item.custom.ModItemProperties;
import com.pluscraft.pluscraft.poi.ModPOIs;
import com.pluscraft.pluscraft.world.biome.ModBiomes;
import com.pluscraft.pluscraft.world.dimension.ModDimensions;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PlusCraft.MODID)
public class PlusCraft {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "pluscraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public PlusCraft() {
        //Register stuff
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntities.register(modEventBus);
        ModDimensions.register();
        ModBiomes.register();
        ModPOIs.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        GeckoLib.initialize();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        //Adds items to creative mode tabs
        if(event.getTab() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.RUBY);
            event.accept(ModItems.NETHERITE_ROD);
            event.accept(ModItems.PORTAL_BLOCK_CORE);
        }
        if(event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(ModItems.RUBY_PICKAXE);
            event.accept(ModItems.RUBY_HOE);
            event.accept(ModItems.RUBY_SHOVEL);
        }
        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.STONE_RUBY_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(ModBlocks.DIM_STONE_RUBY_ORE);
            event.accept(ModItems.PORTAL_BLOCK_ITEM);
            event.accept(ModBlocks.PORTAL_FRAME_BLOCK);
            event.accept(ModBlocks.DIM_STONE);
            event.accept(ModBlocks.DIM_COBBLESTONE);
            event.accept(ModBlocks.DIM_DIRT);
            event.accept(ModBlocks.DIM_GRASS_BLOCK);

        }
        if(event.getTab() == CreativeModeTabs.COMBAT){
            event.accept(ModItems.RUBY_SWORD);
            event.accept(ModItems.RUBY_AXE);
            event.accept(ModItems.RUBY_BOW);
            event.accept(ModItems.RUBY_ARROW);
            event.accept(ModItems.RUBY_HELMET);
            event.accept(ModItems.RUBY_CHESTPLATE);
            event.accept(ModItems.RUBY_LEGGINGS);
            event.accept(ModItems.RUBY_BOOTS);
        }
        if(event.getTab() == ModCreativeModeTabs.PLUSCRAFT_TAB){
            event.accept(ModItems.RUBY);
            event.accept(ModItems.NETHERITE_ROD);
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.STONE_RUBY_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(ModBlocks.DIM_STONE_RUBY_ORE);
            event.accept(ModItems.PORTAL_BLOCK_ITEM);
            event.accept(ModBlocks.PORTAL_FRAME_BLOCK);
            event.accept(ModItems.RUBY_SWORD);
            event.accept(ModItems.RUBY_PICKAXE);
            event.accept(ModItems.RUBY_HOE);
            event.accept(ModItems.RUBY_SHOVEL);
            event.accept(ModItems.RUBY_AXE);
            event.accept(ModItems.RUBY_BOW);
            event.accept(ModItems.RUBY_ARROW);
            event.accept(ModItems.PORTAL_BLOCK_CORE);
            event.accept(ModItems.RUBY_HELMET);
            event.accept(ModItems.RUBY_CHESTPLATE);
            event.accept(ModItems.RUBY_LEGGINGS);
            event.accept(ModItems.RUBY_BOOTS);
            event.accept(ModBlocks.DIM_STONE);
            event.accept(ModBlocks.DIM_COBBLESTONE);
            event.accept(ModBlocks.DIM_DIRT);
            event.accept(ModBlocks.DIM_GRASS_BLOCK);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            BlockEntityRenderers.register(ModBlockEntities.PORTAL_BLOCK_ENTITY.get(), PortalBlockRenderer::new);
            ModItemProperties.addCustomItemProperties();
            EntityRenderers.register(ModEntities.RUBY_ARROW_ENTITY.get(), RubyArrowRenderer::new);
        }
    }
}
