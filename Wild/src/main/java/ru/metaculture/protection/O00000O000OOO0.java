package ru.metaculture.protection;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.Item;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public class O00000O000OOO0 {
   public static MinecraftClient O00000000 = MinecraftClient.getInstance();

   public static void O00000000(O0000000O0OO0 o0000000O0OO0, BlockPos blockPos, NumberSetting o000000O000, float f) {
      if (O00000000.player != null && O00000000.world != null && blockPos != null) {
         Vec3d var4 = O00000000.player.getPos();
         Vec3d var5 = new Vec3d(blockPos.getX() + 0.5, O00000000.player.getY(), blockPos.getZ() + 0.5);
         double var6 = var4.distanceTo(var5);
         if (var6 <= o000000O000.O0000000000()) {
            o0000000O0OO0.O00000000(0.0F);
            o0000000O0OO0.O000000000(0.0F);
            o0000000O0OO0.O00000000(false);
            o0000000O0OO0.O000000000(false);
         } else {
            float var8 = (float)Math.toDegrees(Math.atan2(var5.z - var4.z, var5.x - var4.x)) - 90.0F;
            O00000O000OOO0.W130 var9 = O00000000(f, 1.2, 0.4);
            boolean var10 = O00000000();
            o0000000O0OO0.O000000000(var10);
            float var11 = 0.0F;
            if (!var10 && var9.hitSolid) {
               float var12 = O0000O00OO0OO0.O000000000000O(var8 - f);
               var11 = var12 > 0.0F ? -0.8F : 0.8F;
            }

            boolean var13 = !var10 && O00000000(f);
            o0000000O0OO0.O00000000(var13);
            O00000000(o0000000O0OO0, f, var8, var11);
         }
      }
   }

   private static O00000O000OOO0.W130 O00000000(float f, double d, double e) {
      if (O00000000.player != null && O00000000.world != null) {
         Vec3d var5 = O00000000.player.getEyePos().add(0.0, e, 0.0);
         double var6 = -Math.sin(Math.toRadians(f));
         double var8 = Math.cos(Math.toRadians(f));
         Vec3d var10 = new Vec3d(var6, 0.0, var8).normalize();
         Vec3d var11 = var5.add(var10.multiply(d));
         RaycastContext var12 = new RaycastContext(var5, var11, ShapeType.OUTLINE, FluidHandling.NONE, O00000000.player);
         BlockHitResult var13 = O00000000.world.raycast(var12);
         if (var13.getType() != Type.BLOCK) {
            return new O00000O000OOO0.W130(false, BlockPos.ORIGIN);
         } else {
            BlockPos var14 = var13.getBlockPos();
            BlockState var15 = O00000000.world.getBlockState(var14);
            boolean var16 = !var15.isAir() && !var15.getCollisionShape(O00000000.world, var14).isEmpty();
            return new O00000O000OOO0.W130(var16, var14);
         }
      } else {
         return new O00000O000OOO0.W130(false, BlockPos.ORIGIN);
      }
   }

   public static boolean O00000000(float f) {
      if (O00000000.player == null || O00000000.world == null) {
         return false;
      } else if (!O00000000.player.isOnGround()) {
         return false;
      } else {
         Vec3d var1 = O00000000.player.getPos();
         double var2 = -Math.sin(Math.toRadians(f));
         double var4 = Math.cos(Math.toRadians(f));
         BlockPos var6 = BlockPos.ofFloored(var1);
         BlockPos var7 = BlockPos.ofFloored(var1.x + var2 * 0.8, var1.y, var1.z + var4 * 0.8);
         BlockPos var8 = var7.up();
         BlockState var9 = O00000000.world.getBlockState(var7);
         BlockState var10 = O00000000.world.getBlockState(var8);
         double var11 = var7.getY() - var6.getY();
         if (!(var11 < 0.6) && !(var11 > 1.25)) {
            boolean var13 = !var9.isAir() && !var9.getCollisionShape(O00000000.world, var7).isEmpty();
            boolean var14 = var10.isAir() || var10.getCollisionShape(O00000000.world, var8).isEmpty();
            if (var13 && var14) {
               BlockPos var15 = var7.add((int)Math.signum(var2), 0, (int)Math.signum(var4));
               BlockPos var16 = var15.down();
               BlockState var17 = O00000000.world.getBlockState(var16);
               return !var17.isAir() && !var17.getCollisionShape(O00000000.world, var16).isEmpty();
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public static void O00000000(BlockPos blockPos, NumberSetting o000000O000, NumberSetting o000000O0002) {
      if (blockPos != null && O00000000.player != null && O00000000.world != null) {
         Vec3d var3 = O00000000.player.getEyePos();
         Vec3d var4 = Vec3d.ofCenter(blockPos);
         Vec3d var5 = var4.subtract(var3).normalize();
         float var6 = (float)Math.toDegrees(Math.atan2(-var5.x, var5.z));
         float var7 = (float)(-Math.toDegrees(Math.atan2(var5.y, Math.sqrt(var5.x * var5.x + var5.z * var5.z))));
         long var8 = System.currentTimeMillis();
         float var10 = o000000O0002.O0000000000();
         float var11 = (float)Math.sin(var8 / 50.0) * var10;
         float var12 = (float)Math.cos(var8 / 40.0) * var10 * 10.0F;
         float var13 = (float)Math.sin(var8 / 40.0) * var10 * 0.5F;
         float var14 = var11 + var12;
         float var15 = var13 * 5.0F;
         O000000O0O00OO var16 = new O000000O0O00OO(var6 + var14, var7 + var15);
         O000000O0O0O0.O00000000(var16, o000000O000.O0000000000(), o000000O000.O0000000000(), 30.0F, 30.0F, 0, 18, false);
      }
   }

   public static void O000000000(BlockPos blockPos, NumberSetting o000000O000, NumberSetting o000000O0002) {
      if (blockPos != null && O00000000.player != null && O00000000.world != null) {
         Vec3d var3 = O00000000.player.getEyePos();
         Vec3d var4 = Vec3d.ofCenter(blockPos);
         Vec3d var5 = var4.subtract(var3).normalize();
         float var6 = (float)Math.toDegrees(Math.atan2(-var5.x, var5.z));
         float var7 = (float)(-Math.toDegrees(Math.atan2(var5.y, Math.sqrt(var5.x * var5.x + var5.z * var5.z))));
         long var8 = System.currentTimeMillis();
         float var10 = (float)Math.sin(var8 / 200.0) * 0.8F;
         O000000O0O00OO var11 = new O000000O0O00OO(var6 + var10 * 0.3F, var7 + var10 * 0.2F);
         O000000O0O0O0.O00000000(var11, o000000O000.O0000000000() * 1.5F, o000000O000.O0000000000() * 1.2F, 30.0F, 30.0F, 0, 10, false);
      }
   }

   public static boolean O00000000(BlockPos blockPos, float f) {
      if (blockPos != null && O00000000.player != null && O00000000.world != null) {
         Vec3d var2 = O00000000.player.getEyePos();
         Vec3d var3 = Vec3d.ofCenter(blockPos);
         Vec3d var4 = var3.subtract(var2).normalize();
         float var5 = (float)Math.toDegrees(Math.atan2(-var4.x, var4.z));
         float var6 = (float)(-Math.toDegrees(Math.atan2(var4.y, Math.sqrt(var4.x * var4.x + var4.z * var4.z))));
         float var7 = Math.abs(O0000O00OO0OO0.O000000000000O(var5 - O00000000.player.getYaw()));
         float var8 = Math.abs(O0000O00OO0OO0.O000000000000O(var6 - O00000000.player.getPitch()));
         return var7 <= f && var8 <= f;
      } else {
         return false;
      }
   }

   public static boolean O00000000(BlockPos blockPos, long l, NumberSetting o000000O000, NumberSetting o000000O0002) {
      if (blockPos != null && O00000000.player != null && O00000000.world != null) {
         double var5 = O00000000.player.squaredDistanceTo(blockPos.getX() + 0.5, blockPos.getY() + 0.5, blockPos.getZ() + 0.5);
         if (var5 > o000000O0002.O0000000000() * o000000O0002.O0000000000()) {
            return false;
         } else if ((float)(System.currentTimeMillis() - l) < o000000O000.O0000000000()) {
            return false;
         } else {
            O00000000.interactionManager.attackBlock(blockPos, Direction.UP);
            O00000000.player.swingHand(Hand.MAIN_HAND);
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean O00000000(BlockPos blockPos, Item item, long l) {
      if (blockPos != null && O00000000.player != null && O00000000.world != null && item != null) {
         if (System.currentTimeMillis() - l < 600L) {
            return false;
         } else {
            Hand var4 = null;
            if (O00000000.player.getOffHandStack().getItem() == item) {
               var4 = Hand.OFF_HAND;
            } else if (O00000000.player.getMainHandStack().getItem() == item) {
               var4 = Hand.MAIN_HAND;
            }

            if (var4 == null) {
               return false;
            } else {
               BlockPos var5 = blockPos.up();
               if (!O00000000.world.getBlockState(var5).isReplaceable()) {
                  return false;
               } else {
                  Vec3d var6 = Vec3d.ofCenter(blockPos).add(Vec3d.of(Direction.UP.getVector()).multiply(0.5));
                  BlockHitResult var7 = new BlockHitResult(var6, Direction.UP, blockPos, false);
                  O00000000.interactionManager.interactBlock(O00000000.player, var4, var7);
                  O00000000.player.swingHand(var4);
                  return true;
               }
            }
         }
      } else {
         return false;
      }
   }

   public static boolean O00000000() {
      if (O00000000.player == null || O00000000.world == null) {
         return false;
      } else if (O00000000.player.isOnGround()) {
         return false;
      } else {
         Vec3d var0 = O00000000.player.getPos();
         BlockPos var1 = BlockPos.ofFloored(var0.x, var0.y - 1.0, var0.z);
         if (O00000000(var1, 3)) {
            return true;
         } else {
            float var2 = O00000000.player.getYaw();
            double var3 = -Math.sin(Math.toRadians(var2));
            double var5 = Math.cos(Math.toRadians(var2));
            Vec3d var7 = var0.add(var3 * 0.8, 0.0, var5 * 0.8);
            BlockPos var8 = BlockPos.ofFloored(var7.x, var7.y - 1.0, var7.z);
            return O00000000(var8, 3);
         }
      }
   }

   public static boolean O00000000(BlockPos blockPos, int i) {
      if (O00000000.world == null) {
         return false;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < i; var3++) {
            BlockPos var4 = blockPos.down(var3);
            BlockState var5 = O00000000.world.getBlockState(var4);
            if (O00000000(var5, var4) || !var5.isAir() && !var5.getCollisionShape(O00000000.world, var4).isEmpty()) {
               break;
            }

            var2++;
         }

         return var2 >= i;
      }
   }

   private static boolean O00000000(BlockState blockState, BlockPos blockPos) {
      if (blockState.isAir()) {
         return false;
      } else {
         Block var2 = blockState.getBlock();
         if (var2 == Blocks.FARMLAND) {
            return true;
         } else if (var2 == Blocks.SOUL_SAND) {
            return true;
         } else {
            return var2 == Blocks.DIRT_PATH ? true : !blockState.getCollisionShape(O00000000.world, blockPos).isEmpty();
         }
      }
   }

   private static void O00000000(O0000000O0OO0 o0000000O0OO0, float f, float g, float h) {
      float var4 = o0000000O0OO0.O0000000000();
      float var5 = o0000000O0OO0.O00000000000();
      double var6 = O0000O00OO0OO0.O000000000000O((float)Math.toDegrees(O00000000(f, var4, var5)));
      if (var4 == 0.0F && var5 == 0.0F) {
         o0000000O0OO0.O00000000(1.0F);
         o0000000O0OO0.O000000000(h);
      } else {
         float var8 = 0.0F;
         float var9 = 0.0F;
         float var10 = Float.MAX_VALUE;

         for (float var11 = -1.0F; var11 <= 1.0F; var11++) {
            for (float var12 = -1.0F; var12 <= 1.0F; var12++) {
               if (var11 != 0.0F || var12 != 0.0F) {
                  double var13 = O0000O00OO0OO0.O000000000000O((float)Math.toDegrees(O00000000(g, var11, var12)));
                  float var15 = (float)Math.abs(var6 - var13);
                  if (var15 < var10) {
                     var10 = var15;
                     var8 = var11;
                     var9 = var12 + h;
                  }
               }
            }
         }

         o0000000O0OO0.O00000000(var8);
         o0000000O0OO0.O000000000(var9);
      }
   }

   private static double O00000000(float f, float g, float h) {
      if (g == 0.0F && h == 0.0F) {
         return 0.0;
      } else {
         double var3 = Math.atan2(h, g);
         return var3 + Math.toRadians(f);
      }
   }

   record W130(boolean hitSolid, BlockPos hitPos) {
   }
}
