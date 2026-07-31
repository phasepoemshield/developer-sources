package ru.metaculture.protection;

import java.util.Optional;
import java.util.function.Predicate;
import lombok.Generated;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public final class O000000O0O00 implements MinecraftAccessor {
   public static EntityHitResult O00000000(Entity entity, Vec3d vec3d, Vec3d vec3d2, Box box, Predicate<Entity> predicate, double d) {
      World var7 = entity.getWorld();
      double var8 = d;
      Entity var10 = null;
      Vec3d var11 = null;

      for (Entity var13 : var7.getOtherEntities(entity, box, predicate)) {
         Box var14 = var13.getBoundingBox().expand(var13.getTargetingMargin());
         Optional var15 = var14.raycast(vec3d, vec3d2);
         if (var14.contains(vec3d) || var15.isPresent()) {
            double var16 = ((Optional<Vec3d>)var15).<Double>map(vec3d::squaredDistanceTo).orElse(0.0);
            var16 = Math.sqrt(var16);
            if ((var16 < var8 || var8 == 0.0) && var13.getRootVehicle() != entity.getRootVehicle()) {
               var10 = var13;
               var11 = ((Optional<Vec3d>)var15).orElse(vec3d);
               var8 = var16;
            }
         }
      }

      return var10 == null ? null : new EntityHitResult(var10, var11);
   }

   public static HitResult O00000000(double d, float f, float g, Entity entity, boolean bl) {
      float var6 = a_.getRenderTickCounter().getTickProgress(true);
      Vec3d var7 = a_.player.getCameraPosVec(var6);
      Vec3d var8 = O00000000(g, f);
      Vec3d var9 = var7.add(var8.multiply(d));
      HitResult var10 = O00000000(var7, var9, ShapeType.COLLIDER, FluidHandling.NONE);
      double var11 = var10.getPos().squaredDistanceTo(var7);
      Box var13 = entity.getBoundingBox().stretch(var8.multiply(d)).expand(1.0);
      EntityHitResult var14 = ProjectileUtil.raycast(
         entity, var7, var9, var13, entityx -> !entityx.isSpectator() && entityx.isAlive() && entityx.canHit(), d * d
      );
      return (HitResult)(var14 == null || !bl && !(var14.getPos().squaredDistanceTo(var7) < var11) ? var10 : var14);
   }

   public static boolean O00000000(float f, float g, double d, Entity entity) {
      float var5 = a_.getRenderTickCounter().getTickProgress(true);
      Vec3d var6 = a_.player.getCameraPosVec(var5);
      Vec3d var7 = O00000000(g, f);
      Vec3d var8 = var6.add(var7.multiply(d));
      Box var9 = entity.getBoundingBox();
      return var9.contains(var6) || var9.raycast(var6, var8).isPresent();
   }

   public static boolean O00000000(float f, float g, double d, Entity entity, boolean bl) {
      return O000000000(f, g, d, entity, bl) != null;
   }

   public static EntityHitResult O000000000(float f, float g, double d, Entity entity, boolean bl) {
      if (a_.player != null && a_.world != null && entity != null) {
         return O00000000(d, f, g, a_.player, bl) instanceof EntityHitResult var7 && var7.getEntity().equals(entity) ? var7 : null;
      } else {
         return null;
      }
   }

   public static boolean O000000000(float f, float g, double d, Entity entity) {
      return O0000000000(f, g, d, entity, true);
   }

   public static boolean O0000000000(float f, float g, double d, Entity entity, boolean bl) {
      if (a_.player != null && a_.world != null && entity != null) {
         Vec3d var6 = a_.player.getEyePos();
         Vec3d var7 = O00000000(g, f);
         Vec3d var8 = var6.add(var7.multiply(d));
         Box var9 = entity.getBoundingBox().expand(entity.getTargetingMargin());
         Optional var10 = var9.raycast(var6, var8);
         if (var9.contains(var6)) {
            return true;
         } else if (var10.isEmpty()) {
            return false;
         } else if (bl) {
            return true;
         } else {
            HitResult var11 = O00000000(var6, var8, ShapeType.COLLIDER, FluidHandling.NONE);
            return var11.getType() == Type.MISS || ((Vec3d)var10.get()).squaredDistanceTo(var6) < var11.getPos().squaredDistanceTo(var6);
         }
      } else {
         return false;
      }
   }

   public static Vec3d O00000000(float f, float g) {
      float var2 = -g * (float) (Math.PI / 180.0) - (float) Math.PI;
      float var3 = -f * (float) (Math.PI / 180.0);
      float var4 = MathHelper.cos(var2);
      float var5 = MathHelper.sin(var2);
      float var6 = -MathHelper.cos(var3);
      float var7 = MathHelper.sin(var3);
      return new Vec3d(var5 * var6, var7, var4 * var6);
   }

   public static HitResult O00000000(Vec3d vec3d, Vec3d vec3d2, ShapeType shapeType, FluidHandling fluidHandling) {
      return a_.world.raycast(new RaycastContext(vec3d, vec3d2, shapeType, fluidHandling, a_.player));
   }

   public static Vec3d O000000000(float f, float g) {
      float var2 = (float)(g * (Math.PI / 180.0));
      float var3 = (float)(-f * (Math.PI / 180.0));
      float var4 = MathHelper.cos(var3);
      float var5 = MathHelper.sin(var3);
      float var6 = MathHelper.cos(var2);
      float var7 = MathHelper.sin(var2);
      return new Vec3d(var5 * var6, -var7, var4 * var6);
   }

   @Generated
   private O000000O0O00() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
