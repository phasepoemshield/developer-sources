package l;

import java.util.Objects;
import java.util.function.Predicate;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public final class Helper324 implements Helper160 {
   public static BlockHitResult method3223(double var0, Helper336 var2, boolean var3) {
      return method3224(Objects.requireNonNull(mc.player).getCameraPosVec(1.0F), var0, var2, var3);
   }

   public static BlockHitResult method3224(Vec3d var0, double var1, Helper336 var3, boolean var4) {
      Entity var5 = mc.cameraEntity;
      if (var5 == null) {
         return null;
      } else {
         Vec3d var6 = var3.method3329();
         Vec3d var7 = var0.add(var6.x * var1, var6.y * var1, var6.z * var1);
         ClientWorld var8 = mc.world;
         if (var8 == null) {
            return null;
         } else {
            FluidHandling var9 = var4 ? FluidHandling.ANY : FluidHandling.NONE;
            RaycastContext var10 = new RaycastContext(var0, var7, ShapeType.OUTLINE, var9, var5);
            return var8.raycast(var10);
         }
      }
   }

   public static BlockHitResult method3225(Vec3d var0, Vec3d var1, ShapeType var2) {
      return method3226(var0, var1, var2, mc.player);
   }

   public static BlockHitResult method3226(Vec3d var0, Vec3d var1, ShapeType var2, Entity var3) {
      return method3227(var0, var1, var2, FluidHandling.NONE, var3);
   }

   public static BlockHitResult method3227(Vec3d var0, Vec3d var1, ShapeType var2, FluidHandling var3, Entity var4) {
      return mc.world.raycast(new RaycastContext(var0, var1, var2, var3, var4));
   }

   public static EntityHitResult method3228(double var0, Helper336 var2, Predicate<Entity> var3) {
      ClientPlayerEntity var4 = mc.player;
      if (var4 == null) {
         return null;
      } else {
         Vec3d var5 = var4.getCameraPosVec(1.0F);
         Vec3d var6 = var2.method3329();
         Vec3d var7 = var5.add(var6.x * var0, var6.y * var0, var6.z * var0);
         Box var8 = var4.getBoundingBox().stretch(var6.multiply(var0)).expand(1.0, 1.0, 1.0);
         return ProjectileUtil.raycast(var4, var5, var7, var8, var1 -> !var1.isSpectator() && var3.test(var1), var0 * var0);
      }
   }

   public static boolean method3229(Helper326 var0) {
      if (var0 != null && var0.getBox() != null && mc.player != null) {
         boolean var1 = mc.player.isGliding() && var0.getTarget().isGliding();
         if (var1) {
            return true;
         } else {
            Helper336 var2 = var0.getAimMode() == null ? Helper349.method3473() : Helper351.INSTANCE.method3483();
            return method3231(var2.method3329(), var0.method3237(), var0.getBox());
         }
      } else {
         return false;
      }
   }

   public static boolean method3230(double var0, Box var2) {
      return method3231(Helper351.INSTANCE.method3483().method3329(), var0, var2);
   }

   public static boolean method3231(Vec3d var0, double var1, Box var3) {
      Vec3d var4 = Objects.requireNonNull(mc.player).getEyePos();
      return var3.contains(var4) || var3.raycast(var4, var4.add(var0.multiply(var1))).isPresent();
   }

   private Helper324() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
