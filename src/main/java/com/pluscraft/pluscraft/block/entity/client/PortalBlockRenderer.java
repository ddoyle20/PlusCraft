package com.pluscraft.pluscraft.block.entity.client;

import com.pluscraft.pluscraft.block.entity.PortalBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.world.level.block.entity.BlockEntity;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class PortalBlockRenderer extends GeoBlockRenderer<PortalBlockEntity> {
    public PortalBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new PortalBlockModel());
    }

}
