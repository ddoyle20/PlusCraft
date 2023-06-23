package com.pluscraft.pluscraft.entity.custom;

import com.pluscraft.pluscraft.item.ModItems;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.network.NetworkHooks;


public class RubyArrowEntity extends AbstractArrow {
    public RubyArrowEntity(EntityType<RubyArrowEntity> entityType, Level world) {
        super(entityType, world);
    }

    public RubyArrowEntity(EntityType<RubyArrowEntity> entityType, double x, double y, double z, Level world) {
        super(entityType, x, y, z, world);
    }

    public RubyArrowEntity(EntityType<RubyArrowEntity> entityType, LivingEntity shooter, Level world) {
        super(entityType, shooter, world);
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(ModItems.RUBY_ARROW.get());
    }
    @Override
    protected void onHitEntity(EntityHitResult ray) {
        if(ray.getEntity() instanceof LivingEntity){
            ((LivingEntity) ray.getEntity()).removeAllEffects();
        }
        super.onHitEntity(ray);
    }
    @Override
    public Packet<ClientGamePacketListener> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
