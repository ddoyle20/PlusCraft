package com.pluscraft.pluscraft.item.client;

import com.pluscraft.pluscraft.item.custom.PortalBlockItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class PortalBlockItemRenderer extends GeoItemRenderer<PortalBlockItem> {
    public PortalBlockItemRenderer() {
        super(new PortalBlockItemModel());
    }
}
