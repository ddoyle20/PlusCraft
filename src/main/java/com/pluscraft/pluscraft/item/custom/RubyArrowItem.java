package com.pluscraft.pluscraft.item.custom;

import com.pluscraft.pluscraft.entity.ModEntities;
import com.pluscraft.pluscraft.entity.custom.RubyArrowEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RubyArrowItem extends ArrowItem {

    public RubyArrowItem(Properties props) {
        super(props);
    }
    @Override
    public AbstractArrow createArrow(Level world, ItemStack ammoStack, LivingEntity shooter) {
        return new RubyArrowEntity(ModEntities.RUBY_ARROW_ENTITY.get(), shooter, world);
    }
}
