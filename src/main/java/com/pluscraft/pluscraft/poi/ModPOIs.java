package com.pluscraft.pluscraft.poi;

import com.google.common.collect.ImmutableSet;
import com.pluscraft.pluscraft.PlusCraft;
import com.pluscraft.pluscraft.block.ModBlocks;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.openjdk.nashorn.internal.ir.annotations.Immutable;

public class ModPOIs {
    public static final DeferredRegister<PoiType> POI
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, PlusCraft.MODID);

    public static final RegistryObject<PoiType> DIM_PORTAL =
            POI.register("dim1_portal", () -> new PoiType(
                    ImmutableSet.copyOf(ModBlocks.DIM_PORTAL.get().getStateDefinition().getPossibleStates())
                    ,0 , 1));
    public static void register(IEventBus eventBus){
        POI.register(eventBus);
    }
}
