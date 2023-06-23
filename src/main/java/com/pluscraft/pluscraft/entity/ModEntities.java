package com.pluscraft.pluscraft.entity;

import com.pluscraft.pluscraft.PlusCraft;
import com.pluscraft.pluscraft.entity.custom.RubyArrowEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PlusCraft.MODID);
    public static final RegistryObject<EntityType<RubyArrowEntity>> RUBY_ARROW_ENTITY =
            ENTITY_TYPES.register("ruby_arrow_entity",
            () -> EntityType.Builder.of((EntityType.EntityFactory<RubyArrowEntity>) RubyArrowEntity::new,
                            MobCategory.MISC).sized(0.5f, 0.5f).build("ruby_arrow_entity"));
    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
