package com.pluscraft.pluscraft.item.client;

import com.pluscraft.pluscraft.item.custom.RubyArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RubyArmorRenderer extends GeoArmorRenderer<RubyArmorItem> {
    public RubyArmorRenderer() {
        super(new RubyArmorModel());
    }
}
