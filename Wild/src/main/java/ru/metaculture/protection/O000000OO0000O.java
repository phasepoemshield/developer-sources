package ru.metaculture.protection;

import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos.Mutable;

public final class O000000OO0000O {
   private static final float O00000000 = 0.9001F;
   private static final float O000000000 = 1.0E-6F;
   private static final double O0000000000 = 0.015;
   private static final long O00000000000 = 260L;
   private static final long O000000000000 = 70L;
   private static volatile boolean O0000000000000 = true;
   private static volatile boolean O000000000000O = false;
   private static volatile boolean O00000000000O = false;
   private static volatile boolean O00000000000O0 = false;
   private static volatile long O00000000000OO = 0L;
   private static volatile long O0000000000O = 0L;
   private static volatile long O0000000000O0 = 0L;
   private static volatile long O0000000000O00 = 0L;
   private static volatile long O0000000000O0O = 0L;
   private static volatile O000000OO00000 O0000000000OO = O000000OO00000.UNAVAILABLE;

   private O000000OO0000O() {
   }

   public static void O00000000() {
      O0000000000000 = true;
      O000000000O00O();
   }

   public static void O000000000() {
      O00000000(O00000000000() == O000000OO00000.READY);
   }

   public static void O00000000(boolean bl) {
      long var1 = System.currentTimeMillis();
      if (bl) {
         O0000000000OO = O000000OO00000.READY;
         O0000000000O0O = var1;
         O000000000O000();
      } else {
         O0000000000OO = O000000OO00000.UNAVAILABLE;
         O0000000000O00 = var1;
      }
   }

   public static boolean O0000000000() {
      return O00000000000O0() && O00000000000() == O000000OO00000.WAITING;
   }

   public static O000000OO00000 O00000000000() {
      MinecraftClient var0 = MinecraftClient.getInstance();
      if (var0.player != null && var0.world != null) {
         ClientPlayerEntity var1 = var0.player;
         if (O000000000(var1, var0)) {
            O000000000O000();
            return O000000OO00000.UNAVAILABLE;
         } else if (!O00000000(var1, var0)) {
            return O000000OO00000.UNAVAILABLE;
         } else {
            boolean var2 = O0000O00O00O0O.O000000000();
            boolean var3 = var1.isOnGround();
            float var4 = O0000O00O00O0O.O00000000();
            double var5 = O0000O00O00O0O.O000000000000();
            boolean var7 = !var2 && (var4 > 1.0E-6F || var5 < -1.0E-6 || O0000O00O00O0O.O000000000000O());
            if (var7) {
               if (O0000000000(var1)) {
                  return O000000OO00000.WAITING;
               } else {
                  return O00000000(var1) ? O000000OO00000.READY : O000000OO00000.WAITING;
               }
            } else if (!var2 || !var3) {
               return O000000OO00000.WAITING;
            } else if (!O0000000000(var1, var0)) {
               O000000000O0O();
               return O000000OO00000.UNAVAILABLE;
            } else if (O000000000O0O0()) {
               O000000000O0O();
               return O000000OO00000.UNAVAILABLE;
            } else {
               return O000000OO00000.WAITING;
            }
         }
      } else {
         return O000000OO00000.UNAVAILABLE;
      }
   }

   public static boolean O000000000000() {
      return O00000000000() == O000000OO00000.READY;
   }

   public static boolean O0000000000000() {
      return !O000000000000O();
   }

   public static boolean O000000000000O() {
      return O00000000000O();
   }

   public static boolean O00000000000O() {
      return !O00000000000O0() ? false : O00000000000() == O000000OO00000.WAITING;
   }

   public static boolean O00000000000O0() {
      MinecraftClient var0 = MinecraftClient.getInstance();
      if (var0.player != null && var0.world != null) {
         return O00000000(var0.player, var0);
      } else {
         O000000000O000();
         return false;
      }
   }

   private static boolean O00000000(ClientPlayerEntity clientPlayerEntity, MinecraftClient minecraftClient) {
      if (!O0000000000000) {
         O000000000O00O();
         return false;
      } else if (O000000000(clientPlayerEntity, minecraftClient)) {
         O000000000O000();
         return false;
      } else {
         long var2 = System.currentTimeMillis();
         boolean var4 = minecraftClient.options.jumpKey.isPressed();
         boolean var5 = clientPlayerEntity.isOnGround();
         boolean var6 = O0000O00O00O0O.O000000000();
         boolean var7 = !var5 || !var6;
         if (!var4) {
            O00000000000O0 = false;
         }

         if (O00000000000O0) {
            return false;
         } else if (var4) {
            if (!O000000000000O) {
               O000000000000O = true;
               O00000000000O = false;
               O00000000000OO = var2;
               O0000000000O = var2;
               O0000000000O0 = 0L;
            }

            return true;
         } else if (O000000000000O && var7) {
            O00000000000O = true;
            O0000000000O = var2;
            O0000000000O0 = var2 + 70L;
            return true;
         } else if (O000000000000O && var5 && var6) {
            if (!O00000000000O) {
               if (var2 - O00000000000OO <= 260L) {
                  return true;
               } else {
                  O000000000O0O();
                  return false;
               }
            } else if (var2 <= O0000000000O0) {
               return true;
            } else {
               O000000000O000();
               return false;
            }
         } else if (O000000000000O && var2 - O0000000000O <= 260L) {
            return true;
         } else {
            O000000000O000();
            return false;
         }
      }
   }

   public static boolean O00000000000OO() {
      MinecraftClient var0 = MinecraftClient.getInstance();
      if (var0.player != null && var0.world != null) {
         ClientPlayerEntity var1 = var0.player;
         if (!O00000000(var1, var0)) {
            return false;
         } else if (O000000000(var1, var0)) {
            return false;
         } else {
            O000000OO00000 var2 = O00000000000();
            return var2 == O000000OO00000.UNAVAILABLE ? false : var1.isSprinting() || O0000O00O00O0O.O0000000000();
         }
      } else {
         return false;
      }
   }

   public static boolean O0000000000O() {
      return O00000000000OO();
   }

   public static boolean O0000000000O0() {
      return false;
   }

   public static boolean O0000000000O00() {
      MinecraftClient var0 = MinecraftClient.getInstance();
      if (var0.player != null && var0.world != null) {
         ClientPlayerEntity var1 = var0.player;
         if (!O0000000000000) {
            return false;
         } else if (O000000000(var1, var0)) {
            return false;
         } else {
            return O0000000000(var1) ? false : var0.options.jumpKey.isPressed() && O0000O00O00O0O.O000000000() && var1.isOnGround() && O0000000000(var1, var0);
         }
      } else {
         return false;
      }
   }

   public static boolean O0000000000O0O() {
      return O00000000000O0() && O00000000000() == O000000OO00000.WAITING && !O0000O00O00O0O.O000000000();
   }

   public static boolean O0000000000OO() {
      MinecraftClient var0 = MinecraftClient.getInstance();
      return var0.player != null && var0.world != null ? !var0.player.isOnGround() || !O0000O00O00O0O.O000000000() : false;
   }

   public static void O000000000(boolean bl) {
      O0000000000000 = bl;
      if (!bl) {
         O000000000O00O();
      }
   }

   public static boolean O0000000000OO0() {
      return O0000000000000;
   }

   public static long O0000000000OOO() {
      return O0000000000O00;
   }

   public static long O000000000O() {
      return O0000000000O0O;
   }

   public static O000000OO00000 O000000000O0() {
      return O0000000000OO;
   }

   public static float O000000000O00() {
      MinecraftClient var0 = MinecraftClient.getInstance();
      if (var0.player != null && var0.world != null) {
         ClientPlayerEntity var1 = var0.player;
         float var2 = O00000000(var1, 0.0F);
         float var3 = O000000000(var1);
         float var4 = O000000000O0OO();
         return var2 >= var4 ? 0.0F : Math.max(0.0F, (var4 - var2) * var3);
      } else {
         return Float.POSITIVE_INFINITY;
      }
   }

   public static void O000000000O000() {
      O000000000000O = false;
      O00000000000O = false;
      O00000000000OO = 0L;
      O0000000000O = 0L;
      O0000000000O0 = 0L;
   }

   public static void O000000000O00O() {
      O000000000O000();
      O00000000000O0 = false;
   }

   private static void O000000000O0O() {
      O000000000O000();
      O00000000000O0 = true;
   }

   private static boolean O000000000O0O0() {
      if (!O000000000000O) {
         return true;
      } else {
         return O00000000000O ? false : System.currentTimeMillis() - O00000000000OO > 260L;
      }
   }

   private static boolean O00000000(ClientPlayerEntity clientPlayerEntity) {
      return O00000000(clientPlayerEntity, 0.0F) >= O000000000O0OO();
   }

   private static float O00000000(ClientPlayerEntity clientPlayerEntity, float f) {
      float var2 = Math.max(0.0F, f);
      double var3 = TpsTracker.O00000000();
      if (var3 > 0.0 && var3 < 19.95) {
         var2 *= (float)(var3 / 20.0);
      }

      return clientPlayerEntity.getAttackCooldownProgress(0.5F + var2);
   }

   private static float O000000000O0OO() {
      double var0 = TpsTracker.O00000000();
      return !(var0 <= 0.0) && !(var0 >= 19.95) ? MathHelper.clamp(0.9001F * (20.0F / (float)var0), 0.9001F, 0.995F) : 0.9001F;
   }

   private static float O000000000(ClientPlayerEntity clientPlayerEntity) {
      double var1 = clientPlayerEntity.getAttributeValue(EntityAttributes.ATTACK_SPEED);
      return !(var1 <= 0.0) && !Double.isNaN(var1) && !Double.isInfinite(var1) ? (float)(20.0 / var1) : 20.0F;
   }

   private static boolean O000000000(ClientPlayerEntity clientPlayerEntity, MinecraftClient minecraftClient) {
      if (clientPlayerEntity.isSpectator()) {
         return true;
      } else if (clientPlayerEntity.isTouchingWater()) {
         return true;
      } else if (clientPlayerEntity.isInLava()) {
         return true;
      } else if (clientPlayerEntity.isSubmergedIn(FluidTags.WATER)) {
         return true;
      } else if (clientPlayerEntity.isSubmergedIn(FluidTags.LAVA)) {
         return true;
      } else if (clientPlayerEntity.isSwimming()) {
         return true;
      } else if (clientPlayerEntity.isClimbing()) {
         return true;
      } else if (O00000000000(clientPlayerEntity, minecraftClient)) {
         return true;
      } else if (clientPlayerEntity.hasStatusEffect(StatusEffects.BLINDNESS)) {
         return true;
      } else if (clientPlayerEntity.hasStatusEffect(StatusEffects.SLOW_FALLING)) {
         return true;
      } else if (clientPlayerEntity.hasStatusEffect(StatusEffects.LEVITATION)) {
         return true;
      } else if (clientPlayerEntity.hasVehicle()) {
         return true;
      } else {
         return clientPlayerEntity.getAbilities().flying ? true : clientPlayerEntity.isGliding();
      }
   }

   private static boolean O0000000000(ClientPlayerEntity clientPlayerEntity) {
      return clientPlayerEntity.isSprinting() || O0000O00O00O0O.O0000000000();
   }

   private static boolean O0000000000(ClientPlayerEntity clientPlayerEntity, MinecraftClient minecraftClient) {
      if (minecraftClient.world == null) {
         return false;
      } else {
         Box var2 = clientPlayerEntity.getBoundingBox().offset(0.0, 0.015, 0.0).contract(1.0E-7);
         return minecraftClient.world.isSpaceEmpty(clientPlayerEntity, var2);
      }
   }

   private static boolean O00000000000(ClientPlayerEntity clientPlayerEntity, MinecraftClient minecraftClient) {
      if (minecraftClient.world == null) {
         return false;
      } else {
         Box var2 = clientPlayerEntity.getBoundingBox().contract(1.0E-7);
         int var3 = MathHelper.floor(var2.minX);
         int var4 = MathHelper.floor(var2.maxX);
         int var5 = MathHelper.floor(var2.minY);
         int var6 = MathHelper.floor(var2.maxY);
         int var7 = MathHelper.floor(var2.minZ);
         int var8 = MathHelper.floor(var2.maxZ);
         Mutable var9 = new Mutable();

         for (int var10 = var3; var10 <= var4; var10++) {
            for (int var11 = var5; var11 <= var6; var11++) {
               for (int var12 = var7; var12 <= var8; var12++) {
                  var9.set(var10, var11, var12);
                  if (minecraftClient.world.getBlockState(var9).isOf(Blocks.COBWEB)) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }
}
