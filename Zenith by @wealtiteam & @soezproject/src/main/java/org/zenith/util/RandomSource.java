package org.zenith.util;

import org.zenith.core.ItemServiceBase;
import org.zenith.core.CloudRouter;
import org.zenith.core.LineShader;
import org.zenith.event.Event08;
import org.zenith.managers.EmoteManager;
import org.zenith.module.Module;

import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.rotation.Rotation;
import org.zenith.rotation.RotationDelta;
import org.zenith.rotation.RotationMath;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.BotFeaturesDto;
import org.zenith.core.MediaTrackInfo;
import org.zenith.core.ModuleSnapshotDto;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.ClientProvider;

import org.zenith.module.Aura;


import net.minecraft.client.MinecraftClient;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public class RandomSource implements ClientProvider {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final double double138 = 0.15;
   public static final int int418 = 14;
   public static final int int419 = 14;
   public final Random random8 = new SecureRandom();
   public Vec3d vec3d42 = Vec3d.ZERO;

   public List<Vec3d> on23(Vec3d var1, Box var2, float var3, boolean var4) {
      double d0 = var2.getLengthX();
      double d1 = var2.getLengthY();
      double d2 = var2.getLengthZ();
      int i = this.MediaTrackInfo(d0);
      int j = this.MediaTrackInfo(d2);
      int k = Math.max(2, 14);
      double d3 = d1 / (double)(k - 1);
      double d4 = var2.minX;
      double d5 = var2.minY;
      double d6 = var2.minZ;
      double d7 = i <= 1 ? 0.0 : d0 / (double)(i - 1);
      double d8 = j <= 1 ? 0.0 : d2 / (double)(j - 1);
      List<Vec3d> arraylist = new ArrayList<>(k * i * j);

      for (int l = 0; l < k; l++) {
         double d9 = d5 + (double)l * d3;

         for (int i1 = 0; i1 < i; i1++) {
            double d10 = d4 + (double)i1 * d7;

            for (int j1 = 0; j1 < j; j1++) {
               double d11 = d6 + (double)j1 * d8;
               Vec3d vec3d = new Vec3d(d10, d9, d11);
               if (this.on23(var1, vec3d, var3, var4)) {
                  arraylist.add(vec3d);
               }
            }
         }
      }

      return arraylist;
   }

   public RandomSource() {
   }

   public Vec3d on23(Vec3d var1, Box var2, float var3, Vec3d var4, boolean var5) {
      var list = this.on23(var1, var2, var3, var5);
      var list1 = this.UiAnimation(list, var3);
      Vec3d vec3d = this.UiAnimation(var1, list1, var3, var5);
      if (vec3d == null) {
         vec3d = this.UiAnimation(var1, list, var3, var5);
      }

      if (vec3d == null) {
         vec3d = this.UiAnimation(var1, list);
      }

      this.BotFeaturesDto(var4);
      return (vec3d == null ? var2.getCenter() : vec3d).add(this.vec3d42);
   }

   public Vec3d UiAnimation(Vec3d var1, Box var2, float var3, Vec3d var4, boolean var5) {
      var list = this.on23(var1, var2, var3, var5);
      var list1 = this.UiAnimation(list, var3);
      Vec3d vec3d = this.on23(var1, list1, var3, var5);
      if (vec3d == null) {
         vec3d = this.on23(var1, list, var3, var5);
      }

      if (vec3d == null) {
         vec3d = this.on23(var1, list);
      }

      this.BotFeaturesDto(var4);
      return (vec3d == null ? var2.getCenter() : vec3d).add(this.vec3d42);
   }

   public boolean on23(LivingEntity var1, float var2, boolean var3) {
      Box box = var1.getBoundingBox();
      Vec3d vec3d = minecraftClient3.player.getEyePos();
      double d0 = box.getLengthX();
      double d1 = box.getLengthY();
      double d2 = box.getLengthZ();
      int i = this.MediaTrackInfo(d0);
      int j = this.MediaTrackInfo(d2);
      int k = Math.max(2, 14);
      double d3 = d1 / (double)(k - 1);
      double d4 = box.minX;
      double d5 = box.minY;
      double d6 = box.minZ;
      double d7 = i <= 1 ? 0.0 : d0 / (double)(i - 1);
      double d8 = j <= 1 ? 0.0 : d2 / (double)(j - 1);

      for (int l = 0; l < k; l++) {
         double d9 = d5 + (double)l * d3;

         for (int i1 = 0; i1 < i; i1++) {
            double d10 = d4 + (double)i1 * d7;

            for (int j1 = 0; j1 < j; j1++) {
               double d11 = d6 + (double)j1 * d8;
               Vec3d vec3d1 = new Vec3d(d10, d9, d11);
               if (this.on23(vec3d, vec3d1, var2, var3)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean on23(Vec3d var1, Vec3d var2, float var3, boolean var4) {
      if (var1.squaredDistanceTo(var2) > (double)var3 * (double)var3) {
         return false;
      } else if (var4) {
         return true;
      } else {
         RaycastContext raycastcontext = new RaycastContext(var1, var2, ShapeType.COLLIDER, FluidHandling.NONE, minecraftClient3.player);
         BlockHitResult blockhitresult = RaycastUtils.on23(
            raycastcontext, Aura.aura::on23
         );
         return blockhitresult.getType() != Type.BLOCK;
      }
   }

   public Vec3d on23(Vec3d var1, List<Vec3d> var2, float var3, boolean var4) {
      if (var2 != null && !var2.isEmpty()) {
         Vec3d vec3d = this.ModuleSnapshotDto(var2);
         return this.on23(var1, vec3d, var3, var4)
            ? vec3d
            : var2.stream()
               .filter(var4x -> this.on23(var1, var4x, var3, var4))
               .min(
                  Comparator.comparingDouble(
                     var1x -> {
                        RotationDelta liiilliiilil1l1i1111li1ii11 = ZenithClient.on23()
                           .CloudRouter()
                           .LineShader()
                           .EmoteManager(Rotation.ItemServiceBase(var1x, var1));
                        return (double)(
                           Math.abs(liiilliiilil1l1i1111li1ii11.type2()) + Math.abs(liiilliiilil1l1i1111li1ii11.path15())
                        );
                     }
                  )
               )
               .orElse(null);
      } else {
         return null;
      }
   }

   public Vec3d UiAnimation(Vec3d var1, List<Vec3d> var2, float var3, boolean var4) {
      if (var2 != null && !var2.isEmpty()) {
         Vec3d vec3d = this.ModuleSnapshotDto(var2);
         return this.on23(var1, vec3d, var3, var4)
            ? vec3d
            : var2.stream()
               .filter(var4x -> this.on23(var1, var4x, var3, var4))
               .min(Comparator.comparingDouble(var1x -> var1x.squaredDistanceTo(vec3d)))
               .orElse(null);
      } else {
         return null;
      }
   }

   public List<Vec3d> UiAnimation(List<Vec3d> var1, float var2) {
      if (var1 != null && !var1.isEmpty()) {
         Vec3d vec3d = minecraftClient3.player.getEyePos();
         double d0 = Math.max(0.0, (double)var2 - 0.3);
         double d1 = d0 * d0;
         List<Vec3d> arraylist = new ArrayList<>();

         for (Vec3d vec3d1 : var1) {
            if (vec3d.squaredDistanceTo(vec3d1) < d1) {
               arraylist.add(vec3d1);
            }
         }

         return arraylist;
      } else {
         return List.of();
      }
   }

   public Vec3d ModuleSnapshotDto(List<Vec3d> var1) {
      double d0 = 0.0;
      double d1 = 0.0;
      double d2 = 0.0;
      int i = var1.size();

      for (Vec3d vec3d : var1) {
         d0 += vec3d.x;
         d1 += vec3d.y;
         d2 += vec3d.z;
      }

      return new Vec3d(d0 / (double)i, d1 / (double)i, d2 / (double)i);
   }

   public Vec3d on23(Vec3d var1, List<Vec3d> var2) {
      return var2 != null && !var2.isEmpty()
         ? var2.stream()
            .min(
               Comparator.comparingDouble(
                  var1x -> {
                     RotationDelta liiilliiilil1l1i1111li1ii11 = ZenithClient.on23()
                        .CloudRouter()
                        .LineShader()
                        .EmoteManager(Rotation.ItemServiceBase(var1x, var1));
                     return (double)(
                        Math.abs(liiilliiilil1l1i1111li1ii11.type2()) + Math.abs(liiilliiilil1l1i1111li1ii11.path15())
                     );
                  }
               )
            )
            .orElse(null)
         : null;
   }

   public Vec3d UiAnimation(Vec3d var1, List<Vec3d> var2) {
      return var2 != null && !var2.isEmpty() ? var2.stream().min(Comparator.comparingDouble(var1x -> var1x.squaredDistanceTo(var1))).orElse(null) : null;
   }

   public void BotFeaturesDto(Vec3d var1) {
      this.vec3d42 = this.vec3d42
         .add(this.random8.nextGaussian(), this.random8.nextGaussian(), this.random8.nextGaussian())
         .multiply(var1);
   }

   public double on23(Vec3d var1, Vec3d var2, Rotation var3) {
      if (var3 == null) {
         return Double.POSITIVE_INFINITY;
      } else {
         Rotation ililiiili1ll1li11 = RotationMath.Event08(var2.subtract(var1));
         RotationDelta liiilliiilil1l1i1111li1ii11 = var3.EmoteManager(ililiiili1ll1li11);
         return Math.hypot((double)liiilliiilil1l1i1111li1ii11.type2(), (double)liiilliiilil1l1i1111li1ii11.path15());
      }
   }

   public int MediaTrackInfo(double var1) {
      if (var1 <= 0.0) {
         return 1;
      } else {
         int i = (int)Math.ceil(var1 / 0.15) + 1;
         int j = Math.min(i, 14);
         return Math.max(2, j);
      }
   }

   public Random call217() {
      return this.random8;
   }

   public Vec3d call218() {
      return this.vec3d42;
   }
}
