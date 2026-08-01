package ru.metaculture.protection;

import net.minecraft.block.Blocks;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.AttributeModifiersComponent.Entry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier.Operation;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.Mutable;

public final class O000000O0O0OO implements MinecraftAccessor {
   private static final long O00000000 = 624L;
   private static final float O000000000 = 10.0F;
   private static final float O0000000000 = 8.0F;
   private static final float O00000000000 = 13.0F;
   private static long O000000000000 = System.currentTimeMillis();
   private static long O0000000000000;
   private static int O000000000000O;
   private static int O00000000000O = -1;

   private O000000O0O0OO() {
   }

   public static void O00000000() {
      O0000000000000 = System.currentTimeMillis();
      O00000000000O = -1;
   }

   public static void O000000000() {
      O00000000000O = -1;
   }

   public static void O0000000000() {
      O000000000000O++;
   }

   public static void O00000000000() {
      O000000000000 = System.currentTimeMillis();
   }

   public static void O000000000000() {
      O000000000000 = System.currentTimeMillis();
   }

   public static boolean O00000000(LivingEntity livingEntity, int i) {
      if (a_.player == null || a_.world == null || a_.options == null || livingEntity == null || !livingEntity.isAlive()) {
         return false;
      } else if (!O00000000(i)) {
         return false;
      } else if (!a_.player.isGliding() && !a_.player.getAbilities().flying) {
         O000000O0O0OO.W40 var2 = O000000000(i);
         if (O00000000(var2)) {
            return true;
         } else {
            boolean var3 = O00000000000(var2);
            boolean var4 = AttackAura.O00000000O00OO.O000000000("Умные криты");
            boolean var5 = O0000000000(var2);
            boolean var6 = O00000000000O0();
            if (O00000000(var2, var4, var5)) {
               return false;
            } else if (var6) {
               return true;
            } else if (i <= 0) {
               return O0000000000000(var2);
            } else {
               return var3 ? O000000000000(var2) : O00000000(var2, i);
            }
         }
      } else {
         return true;
      }
   }

   public static boolean O00000000(LivingEntity livingEntity) {
      return a_.player != null && a_.player.isSprinting() && !a_.player.isSwimming() && !a_.player.isGliding() ? O00000000(livingEntity, 1) : false;
   }

   public static boolean O000000000(LivingEntity livingEntity) {
      return a_.player == null || !a_.player.isSprinting() || a_.player.isSwimming() || a_.player.isGliding();
   }

   public static boolean O00000000(boolean bl) {
      if (!bl || a_.player == null || a_.interactionManager == null) {
         return true;
      } else if (O00000000000O == O000000000000O) {
         return false;
      } else if (a_.player.isUsingItem() && a_.player.getActiveItem().getItem() == Items.SHIELD) {
         a_.interactionManager.stopUsingItem(a_.player);
         a_.player.stopUsingItem();
         O00000000000O = O000000000000O;
         return false;
      } else {
         return true;
      }
   }

   private static boolean O00000000(int i) {
      float var1 = Math.max(0.0F, (float)i);
      float var2 = (float)Math.max(1.0, TpsTracker.O00000000());
      long var3 = Math.max(0L, (long)Math.round(Math.max(0.0F, O0000000000000() - var1) * 50.0F * (20.0F / var2)));
      return O00000000000O() >= var3;
   }

   private static float O0000000000000() {
      double var0 = O000000000000O();
      return MathHelper.clamp((float)(10.0 * (1.0 - var0)), 8.0F, 13.0F);
   }

   private static double O000000000000O() {
      if (a_.player == null) {
         return 0.0;
      } else {
         double var0 = 0.0;
         double var2 = 1.0;

         for (EquipmentSlot var7 : EquipmentSlot.values()) {
            ItemStack var8 = a_.player.getEquippedStack(var7);
            if (!var8.isEmpty()) {
               AttributeModifiersComponent var9 = (AttributeModifiersComponent)var8.get(DataComponentTypes.ATTRIBUTE_MODIFIERS);
               if (var9 != null) {
                  for (Entry var11 : var9.modifiers()) {
                     if (var11.attribute() == EntityAttributes.ATTACK_SPEED && var11.slot().matches(var7)) {
                        EntityAttributeModifier var12 = var11.modifier();
                        if (var12.operation() == Operation.ADD_MULTIPLIED_BASE) {
                           var0 += var12.value();
                        } else if (var12.operation() == Operation.ADD_MULTIPLIED_TOTAL) {
                           var2 *= 1.0 + var12.value();
                        }
                     }
                  }
               }
            }
         }

         return (1.0 + var0) * var2 - 1.0;
      }
   }

   private static long O00000000000O() {
      return System.currentTimeMillis() - O000000000000;
   }

   private static O000000O0O0OO.W40 O000000000(int i) {
      ClientPlayerEntity var1 = a_.player;
      boolean var2 = O0000O00O00O0O.O0000000000O();
      boolean var3 = var2 ? O0000O00O00O0O.O000000000() : var1.isOnGround();
      float var4 = var2 ? O0000O00O00O0O.O00000000() : (float)var1.fallDistance;
      double var5 = var2 ? O0000O00O00O0O.O000000000000() : var1.getVelocity().y;
      double var7 = Math.max(0.0, var1.getAttributeValue(EntityAttributes.GRAVITY));
      Box var9 = var1.getBoundingBox();

      for (int var10 = 0; var10 < Math.max(0, i); var10++) {
         if (var3 && a_.options.jumpKey.isPressed()) {
            var3 = false;
            var5 = 0.42;
         } else if (!var3) {
            var5 = (var5 - var7) * 0.98;
            if (var5 < 0.0) {
               var4 += (float)(-var5);
            }
         }

         var9 = var9.offset(0.0, var5, 0.0);
      }

      return new O000000O0O0OO.W40(var3, var4, var5, var9, var1.horizontalCollision);
   }

   private static boolean O00000000(O000000O0O0OO.W40 o00000000) {
      return a_.player.hasStatusEffect(StatusEffects.BLINDNESS)
         || a_.player.hasStatusEffect(StatusEffects.LEVITATION)
         || O00000000(o00000000.box)
         || a_.player.isSubmergedIn(FluidTags.WATER)
         || a_.player.isInLava()
         || a_.player.isClimbing()
         || a_.player.getAbilities().flying;
   }

   private static boolean O000000000(O000000O0O0OO.W40 o00000000) {
      return a_.player.hasStatusEffect(StatusEffects.BLINDNESS)
         || a_.player.hasStatusEffect(StatusEffects.LEVITATION)
         || a_.player.isSubmergedIn(FluidTags.WATER)
         || a_.player.isInLava()
         || a_.player.isClimbing()
         || a_.player.isSwimming()
         || a_.player.isGliding()
         || a_.player.getAbilities().flying;
   }

   private static boolean O00000000000O0() {
      return a_.player.hasStatusEffect(StatusEffects.BLINDNESS) || a_.player.hasStatusEffect(StatusEffects.LEVITATION);
   }

   private static boolean O0000000000(O000000O0O0OO.W40 o00000000) {
      return a_.options.jumpKey.isPressed() || !o00000000.onGround && o00000000.velocityY > 0.08;
   }

   private static boolean O00000000(O000000O0O0OO.W40 o00000000, boolean bl, boolean bl2) {
      if (O0000000000000 <= 0L || System.currentTimeMillis() - O0000000000000 > 624L) {
         return false;
      } else {
         return bl && !bl2 ? false : !o00000000.onGround && o00000000.fallDistance <= 0.0F && o00000000.velocityY > -0.03;
      }
   }

   private static boolean O00000000000(O000000O0O0OO.W40 o00000000) {
      return o00000000.horizontalCollision || O00000000000O(o00000000) || O00000000000O0(o00000000) >= 2;
   }

   private static boolean O000000000000(O000000O0O0OO.W40 o00000000) {
      if (O000000000000O(o00000000)) {
         return true;
      } else {
         float var1 = O00000000(o00000000, true);
         double var2 = O000000000(o00000000, true);
         if (o00000000.horizontalCollision || O00000000000O(o00000000)) {
            var1 = Math.min(var1, 0.004F);
            var2 = Math.max(var2, -0.01);
         }

         return !o00000000.onGround && o00000000.fallDistance > var1 && o00000000.velocityY < var2;
      }
   }

   private static boolean O00000000(O000000O0O0OO.W40 o00000000, int i) {
      if (o00000000.onGround || O000000000(o00000000)) {
         return false;
      } else if (O000000000000O(o00000000)) {
         return true;
      } else {
         boolean var2 = o00000000.fallDistance > O00000000(o00000000, false);
         boolean var3 = o00000000.velocityY < O000000000(o00000000, false);
         boolean var4 = i <= 0 || !o00000000.onGround;
         return var2 && var3 && var4;
      }
   }

   private static boolean O0000000000000(O000000O0O0OO.W40 o00000000) {
      float var1 = O00000000(o00000000, false);
      double var2 = O000000000(o00000000, false);
      if (a_.player.isOnGround()) {
         return false;
      } else if (!o00000000.onGround && !O000000000(o00000000)) {
         return !((float)a_.player.fallDistance <= var1) && !(a_.player.getVelocity().y >= var2)
            ? !O0000O00O00O0O.O0000000000O() || O0000O00O00O0O.O00000000() > var1 && O0000O00O00O0O.O000000000000() < var2
            : false;
      } else {
         return false;
      }
   }

   private static boolean O000000000000O(O000000O0O0OO.W40 o00000000) {
      return O00000000000OO() && !o00000000.onGround && o00000000.fallDistance > 0.0F && o00000000.velocityY < -0.01;
   }

   private static boolean O00000000000OO() {
      return a_.player.hurtTime > 0 || a_.player.hasStatusEffect(StatusEffects.SLOWNESS);
   }

   private static float O00000000(O000000O0O0OO.W40 o00000000, boolean bl) {
      float var2 = bl ? 0.01F : 0.03F;
      if (O00000000000OO()) {
         var2 = Math.min(var2, bl ? 0.008F : 0.012F);
      }

      if (o00000000.horizontalCollision) {
         var2 = Math.min(var2, 0.012F);
      }

      return var2;
   }

   private static double O000000000(O000000O0O0OO.W40 o00000000, boolean bl) {
      double var2 = bl ? -0.02 : -0.03;
      if (O00000000000OO()) {
         var2 = Math.max(var2, bl ? -0.012 : -0.018);
      }

      if (o00000000.horizontalCollision) {
         var2 = Math.max(var2, -0.015);
      }

      return var2;
   }

   private static boolean O00000000000O(O000000O0O0OO.W40 o00000000) {
      return !a_.world.isSpaceEmpty(a_.player, o00000000.box.expand(0.22, 0.0, 0.22).contract(1.0E-7));
   }

   private static int O00000000000O0(O000000O0O0OO.W40 o00000000) {
      Vec3d var1 = o00000000.box.getCenter();
      double var2 = o00000000.box.minY + 0.1;
      double var4 = Math.min(o00000000.box.maxY - 0.1, o00000000.box.minY + 0.95);
      int var6 = 0;
      var6 += O00000000(var1.x + 0.72, var1.z, var2, var4) ? 1 : 0;
      var6 += O00000000(var1.x - 0.72, var1.z, var2, var4) ? 1 : 0;
      var6 += O00000000(var1.x, var1.z + 0.72, var2, var4) ? 1 : 0;
      return var6 + (O00000000(var1.x, var1.z - 0.72, var2, var4) ? 1 : 0);
   }

   private static boolean O00000000(double d, double e, double f, double g) {
      return O00000000(BlockPos.ofFloored(d, f, e)) || O00000000(BlockPos.ofFloored(d, g, e));
   }

   private static boolean O00000000(BlockPos blockPos) {
      return !a_.world.getBlockState(blockPos).isAir() && !a_.world.getBlockState(blockPos).getCollisionShape(a_.world, blockPos).isEmpty();
   }

   private static boolean O00000000(Box box) {
      int var1 = (int)Math.floor(box.minX);
      int var2 = (int)Math.floor(box.maxX);
      int var3 = (int)Math.floor(box.minY);
      int var4 = (int)Math.floor(box.maxY);
      int var5 = (int)Math.floor(box.minZ);
      int var6 = (int)Math.floor(box.maxZ);
      Mutable var7 = new Mutable();

      for (int var8 = var1; var8 <= var2; var8++) {
         for (int var9 = var3; var9 <= var4; var9++) {
            for (int var10 = var5; var10 <= var6; var10++) {
               var7.set(var8, var9, var10);
               if (a_.world.getBlockState(var7).isOf(Blocks.COBWEB)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   record W40(boolean onGround, float fallDistance, double velocityY, Box box, boolean horizontalCollision) {
   }
}
