package l;

import fat.releon.teremok.impl.combat.Aura;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.jetbrains.annotations.NotNull;

public final class Helper349 implements Helper160 {
   public static Helper336 method3467(Vec2f var0) {
      return new Helper336(var0.y, var0.x);
   }

   public static float method3468(float var0, float var1) {
      return MathHelper.wrapDegrees(var0 - var1);
   }

   public static Helper336 method3469(Vec3d var0) {
      return new Helper336(
         (float)MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(var0.z, var0.x)) - 90.0),
         (float)MathHelper.wrapDegrees(Math.toDegrees(-Math.atan2(var0.y, Math.hypot(var0.x, var0.z))))
      );
   }

   public static Helper336 method3470(Helper336 var0, Helper336 var1) {
      float var2 = MathHelper.wrapDegrees(var1.method3333() - var0.method3333());
      float var3 = MathHelper.wrapDegrees(var1.method3334() - var0.method3334());
      return new Helper336(var2, var3);
   }

   public static Helper336 method3471(Vec3d var0) {
      return method3469(var0.subtract(mc.player.getEyePos()));
   }

   public static Helper336 method3472(float var0) {
      return new Helper336(mc.player.getYaw(), var0);
   }

   public static Helper336 method3473() {
      return new Helper336(mc.player.getYaw(), mc.player.getPitch());
   }

   public static boolean method3474(float var0, float var1, float var2, float var3, Entity var4) {
      HitResult var5 = method3475(var2, var0, var1);
      Vec3d var6 = mc.player.getPos().add(0.0, mc.player.getEyeHeight(mc.player.getPose()), 0.0);
      double var7 = Math.pow(var2, 2.0);
      Aura var9 = Aura.getInstance();
      if (var5 != null) {
         var7 = var6.squaredDistanceTo(var5.getPos());
      }

      Vec3d var10 = method3476(var1, var0).multiply(var2);
      Vec3d var11 = var6.add(var10);
      Box var12 = mc.player.getBoundingBox().stretch(var10).expand(1.0, 1.0, 1.0);
      double var14 = Math.max(var7, Math.pow(var3, 2.0));
      EntityHitResult var13 = ProjectileUtil.raycast(mc.player, var6, var11, var12, var1x -> !var1x.isSpectator() && var1x.canHit() && var1x == var4, var14);
      if (var13 != null) {
         boolean var16 = var6.squaredDistanceTo(var13.getPos()) <= Math.pow(var3, 2.0);
         boolean var17 = var5 == null;
         boolean var18 = var6.squaredDistanceTo(var13.getPos()) < var7;
         if (var6.squaredDistanceTo(var13.getPos()) <= Math.pow(var2, 2.0)) {
            double var19 = var4.getY();
            double var21 = var4.getHeight();
            double var23 = var19 + var21 * 0.3;
            if (var13.getPos().y >= var23) {
               return var13.getEntity() == var4;
            }
         }
      }

      return false;
   }

   public static HitResult method3475(double var0, float var2, float var3) {
      Vec3d var4 = mc.player.getCameraPosVec(1.0F);
      Vec3d var5 = method3476(var3, var2);
      Vec3d var6 = var4.add(var5.x * var0, var5.y * var0, var5.z * var0);
      return mc.world.raycast(new RaycastContext(var4, var6, ShapeType.OUTLINE, FluidHandling.NONE, mc.player));
   }

   @NotNull
   public static Vec3d method3476(float var0, float var1) {
      return new Vec3d(
         MathHelper.sin(-var1 * (float) (Math.PI / 180.0)) * MathHelper.cos(var0 * (float) (Math.PI / 180.0)),
         -MathHelper.sin(var0 * (float) (Math.PI / 180.0)),
         MathHelper.cos(-var1 * (float) (Math.PI / 180.0)) * MathHelper.cos(var0 * (float) (Math.PI / 180.0))
      );
   }

   private Helper349() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
