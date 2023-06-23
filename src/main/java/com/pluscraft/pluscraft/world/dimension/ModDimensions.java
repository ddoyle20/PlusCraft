package com.pluscraft.pluscraft.world.dimension;

import com.pluscraft.pluscraft.PlusCraft;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;



public class ModDimensions {
    public static final ResourceKey<Level> DIM_KEY = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(PlusCraft.MODID, "dim1"));
    public static final ResourceKey<DimensionType> DIM_TYPE =
            ResourceKey.create(Registries.DIMENSION_TYPE, DIM_KEY.registry());
    public static void register(){
        System.out.println("Registering ModDimensions for " + PlusCraft.MODID);
    }
}
