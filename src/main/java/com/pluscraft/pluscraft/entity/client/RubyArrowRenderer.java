package com.pluscraft.pluscraft.entity.client;

import com.pluscraft.pluscraft.PlusCraft;
import com.pluscraft.pluscraft.entity.custom.RubyArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class RubyArrowRenderer extends ArrowRenderer<RubyArrowEntity> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(PlusCraft.MODID, "textures/entity/ruby_arrow.png");

    public RubyArrowRenderer(EntityRendererProvider.Context manager) {
        super(manager);
    }

    public ResourceLocation getTextureLocation(RubyArrowEntity arrow) {
        return TEXTURE;
    }
}