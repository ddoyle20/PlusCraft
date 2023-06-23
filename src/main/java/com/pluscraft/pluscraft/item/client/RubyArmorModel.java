package com.pluscraft.pluscraft.item.client;

import com.pluscraft.pluscraft.PlusCraft;
import com.pluscraft.pluscraft.item.custom.RubyArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RubyArmorModel extends GeoModel<RubyArmorItem> {

    @Override
    public ResourceLocation getModelResource(RubyArmorItem animatable) {
        return new ResourceLocation(PlusCraft.MODID, "geo/ruby_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RubyArmorItem animatable) {
        return new ResourceLocation(PlusCraft.MODID, "textures/armor/ruby_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RubyArmorItem animatable) {
        return new ResourceLocation(PlusCraft.MODID, "animations/ruby_armor.animation.json");
    }
}
