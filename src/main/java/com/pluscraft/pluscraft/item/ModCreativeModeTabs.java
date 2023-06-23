package com.pluscraft.pluscraft.item;

import com.pluscraft.pluscraft.PlusCraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PlusCraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab PLUSCRAFT_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        PLUSCRAFT_TAB = event.registerCreativeModeTab(new ResourceLocation(PlusCraft.MODID, "pluscraft_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.RUBY.get()))
                        .title(Component.translatable("creativemodetab.pluscraft_tab")));
    }
}