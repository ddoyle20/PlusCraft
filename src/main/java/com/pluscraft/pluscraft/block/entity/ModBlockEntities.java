package com.pluscraft.pluscraft.block.entity;

import com.pluscraft.pluscraft.PlusCraft;
import com.pluscraft.pluscraft.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PlusCraft.MODID);

    public static final RegistryObject<BlockEntityType<PortalBlockEntity>> PORTAL_BLOCK_ENTITY =
                BLOCK_ENTITIES.register("portal_block_entity", () ->
                        BlockEntityType.Builder.of(PortalBlockEntity::new,
                                ModBlocks.PORTAL_BLOCK.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
