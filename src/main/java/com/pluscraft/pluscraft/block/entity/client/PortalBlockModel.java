package com.pluscraft.pluscraft.block.entity.client;

import com.pluscraft.pluscraft.PlusCraft;
import com.pluscraft.pluscraft.block.entity.PortalBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PortalBlockModel extends GeoModel<PortalBlockEntity> {
    @Override
    public ResourceLocation getModelResource(PortalBlockEntity animatable) {
        return new ResourceLocation(PlusCraft.MODID, "geo/portal_block.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PortalBlockEntity animatable) {
        return new ResourceLocation(PlusCraft.MODID, "textures/block/portal_block.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PortalBlockEntity animatable) {
        return new ResourceLocation(PlusCraft.MODID, "animations/portal_block.animation.json");
    }
}
