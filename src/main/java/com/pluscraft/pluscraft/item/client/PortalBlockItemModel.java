package com.pluscraft.pluscraft.item.client;

import com.pluscraft.pluscraft.PlusCraft;
import com.pluscraft.pluscraft.block.entity.PortalBlockEntity;
import com.pluscraft.pluscraft.item.custom.PortalBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PortalBlockItemModel extends GeoModel<PortalBlockItem> {

    @Override
    public ResourceLocation getModelResource(PortalBlockItem animatable) {
        return new ResourceLocation(PlusCraft.MODID, "geo/portal_block.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PortalBlockItem animatable) {
        return new ResourceLocation(PlusCraft.MODID, "textures/block/portal_block.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PortalBlockItem animatable) {
        return new ResourceLocation(PlusCraft.MODID, "animations/portal_block.animation.json");
    }
}
