package org.zenith.module;

import org.zenith.ZenithClient;
import org.zenith.core.NbtItemSpec;
import org.zenith.core.ColorAnimator;
import org.zenith.core.Easing;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;


import net.minecraft.entity.EntityPose;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.Vec3d;

final class RotationRecorder_Var165 {
   public final float[] val136;
   public final float[] val137;
   public final float[] val138;
   public final float[] val139;
   public final float[] val035;
   public final long long93;
   public final int int129;
   public final float float74;

   public RotationRecorder_Var165(float[] var1, float[] var2, float[] var3, float[] var4, float[] var5, long var6, int var8, float var9) {
      this.val136 = (float[])var1.clone();
      this.val137 = (float[])var2.clone();
      this.val138 = (float[])var3.clone();
      this.val139 = (float[])var4.clone();
      this.val035 = (float[])var5.clone();
      this.long93 = var6;
      this.int129 = var8;
      this.float74 = var9;
   }

   public static RotationRecorder_Var165 on23(
      RotationRecorder_Var143 var0,
      RotationRecorder_Var143 var1,
      RotationRecorder_Var7 var2,
      float var3,
      float var4,
      boolean var5
   ) {
      boolean flag = var5
         || var0.boolean90
         || var1.boolean90
         || !var2.rotationRecorderVar160.boolean101
         || !var2.rotationRecorderVar1602.boolean101
         || !var2.rotationRecorderVar1603.boolean101
         || var2.float216();
      float[] afloat = on23(var0, var1);
      float[] afloat1 = on23(var0, var1, var2);
      float[] afloat2 = on23(var0, var1, var2, flag);
      float[] afloat3 = new float[]{flag ? 1.0F : 0.0F};
      return new RotationRecorder_Var165(
         afloat,
         afloat1,
         afloat2,
         afloat3,
         new float[]{NbtItemSpec(var3, var0.float76), NbtItemSpec(var4, var0.float76)},
         var0.long94,
         var0.int131,
         var0.float76
      );
   }

   public static float NbtItemSpec(float var0, float var1) {
      return (float)Math.round(var0 / var1);
   }

   public static float[] on23(
      RotationRecorder_Var143 var0,
      RotationRecorder_Var143 var1,
      RotationRecorder_Var7 var2,
      boolean var3
   ) {
      float[] afloat = (float[])var1.val013.clone();
      ColorAnimator(var0.val013, afloat);
      afloat[4] = var1.boolean91 ? 1.0F : 0.0F;
      boolean flag = !var3
         && var2.rotationRecorderVar160.boolean101
         && var2.rotationRecorderVar1602.boolean101
         && var2.rotationRecorderVar1603.boolean101
         && !var2.float216()
         && Easing(var0)
         && Easing(var1);
      afloat[1] = flag ? 1.0F : 0.0F;
      return afloat;
   }

   public static void ColorAnimator(float[] var0, float[] var1) {
      if (var0 != null && var1 != null && var0.length > 30 && var1.length > 30) {
         var1[3] = var0[3];

         for (int i = 23; i <= 30; i++) {
            var1[i] = var0[i];
         }
      }
   }

   public static boolean Easing(RotationRecorder_Var143 var0) {
      return var0 != null
         && !var0.boolean90
         && !var0.boolean93
         && !var0.boolean96
         && !var0.boolean97
         && !var0.boolean98
         && !var0.boolean94
         && !var0.boolean99
         && !var0.boolean100
         && !var0.playerInput.sneak()
         && on23(var0.entityPose)
         && var0.val013 != null
         && var0.val013.length == RotationRecorder.val192.length
         && var0.val013[6] == 0.0F
         && var0.val013[7] == 0.0F
         && var0.val013[8] == 0.0F
         && var0.val013[16] == 0.0F
         && var0.val013[17] == 0.0F
         && var0.val013[18] == 0.0F
         && var0.val013[19] == 0.0F
         && var0.val013[20] == 0.0F
         && (!var0.boolean91 || var0.val013[9] > 6.0F);
   }

   public static boolean on23(EntityPose var0) {
      return var0 == null || var0 == EntityPose.STANDING || var0 == EntityPose.CROUCHING;
   }

   public static float[] on23(RotationRecorder_Var143 var0, RotationRecorder_Var143 var1) {
      float[] afloat = (float[])var0.val067.clone();
      afloat[51] = var1.playerInput.forward() ? 1.0F : 0.0F;
      afloat[52] = var1.playerInput.backward() ? 1.0F : 0.0F;
      afloat[53] = var1.playerInput.left() ? 1.0F : 0.0F;
      afloat[54] = var1.playerInput.right() ? 1.0F : 0.0F;
      afloat[55] = var1.playerInput.jump() ? 1.0F : 0.0F;
      return afloat;
   }

   public static float[] on23(
      RotationRecorder_Var143 var0, RotationRecorder_Var143 var1, RotationRecorder_Var7 var2
   ) {
      float[] afloat = (float[])var0.val193.clone();
      on23(afloat, var1.playerInput);
      afloat[39] = var1.playerInput.jump() ? 1.0F : 0.0F;
      on23(afloat, var2);
      return afloat;
   }

   public static void on23(float[] var0, PlayerInput var1) {
      var0[20] = var1.forward() ? 1.0F : 0.0F;
      var0[21] = var1.backward() ? 1.0F : 0.0F;
      var0[22] = var1.left() ? 1.0F : 0.0F;
      var0[23] = var1.right() ? 1.0F : 0.0F;
      var0[24] = var1.jump() ? 1.0F : 0.0F;
      var0[25] = var1.sneak() ? 1.0F : 0.0F;
      var0[26] = var1.sprint() ? 1.0F : 0.0F;
   }

   public static void on23(float[] var0, RotationRecorder_Var7 var1) {
      RotationRecorder_Var160 illliiil11il11iiili1i11i1ii1_Var160 = var1.rotationRecorderVar160;
      RotationRecorder_Var160 illliiil11il11iiili1i11i1ii1_l1lll11l1l1 = var1.rotationRecorderVar1602;
      RotationRecorder_Var160 illliiil11il11iiili1i11i1ii1_l1lll11l1l2 = var1.rotationRecorderVar1603;
      var0[55] = illliiil11il11iiili1i11i1ii1_Var160.boolean101 ? 1.0F : 0.0F;
      var0[56] = illliiil11il11iiili1i11i1ii1_l1lll11l1l1.boolean101 ? 1.0F : 0.0F;
      var0[57] = illliiil11il11iiili1i11i1ii1_l1lll11l1l2.boolean101 ? 1.0F : 0.0F;
      on23(var0, 58, illliiil11il11iiili1i11i1ii1_Var160.vec3d20);
      on23(var0, 61, illliiil11il11iiili1i11i1ii1_Var160.vec3d21);
      on23(var0, 64, illliiil11il11iiili1i11i1ii1_Var160.vec3d22);
      var0[67] = illliiil11il11iiili1i11i1ii1_Var160.boolean102 ? 1.0F : 0.0F;
      var0[68] = illliiil11il11iiili1i11i1ii1_Var160.boolean103 ? 1.0F : 0.0F;
      var0[69] = illliiil11il11iiili1i11i1ii1_Var160.boolean104 ? 1.0F : 0.0F;
      on23(var0, 70, illliiil11il11iiili1i11i1ii1_l1lll11l1l1.vec3d20);
      on23(var0, 73, illliiil11il11iiili1i11i1ii1_l1lll11l1l2.vec3d20);
      var0[76] = (float)(
         (illliiil11il11iiili1i11i1ii1_l1lll11l1l1.vec3d20.x - illliiil11il11iiili1i11i1ii1_l1lll11l1l2.vec3d20.x) / 10.0
      );
      var0[77] = (float)(
         (illliiil11il11iiili1i11i1ii1_l1lll11l1l1.vec3d20.y - illliiil11il11iiili1i11i1ii1_l1lll11l1l2.vec3d20.y) / 10.0
      );
      var0[78] = (float)(
         (illliiil11il11iiili1i11i1ii1_l1lll11l1l1.vec3d20.z - illliiil11il11iiili1i11i1ii1_l1lll11l1l2.vec3d20.z) / 10.0
      );
   }

   public static void on23(float[] var0, int var1, Vec3d var2) {
      var0[var1] = (float)var2.x;
      var0[var1 + 1] = (float)var2.y;
      var0[var1 + 2] = (float)var2.z;
   }

   public boolean isValid() {
      return this.val136 != null
         && this.val137 != null
         && this.val138 != null
         && this.val139 != null
         && this.val035 != null
         && this.float74 > 0.0F
         && !Float.isNaN(this.float74)
         && !Float.isInfinite(this.float74)
         && this.val136.length == 59
         && this.val137.length == RotationRecorder.val311.length
         && this.val138.length == RotationRecorder.val192.length
         && this.val139.length == RotationRecorder.val420.length
         && this.val035.length == 2
         && BotFeatureRegistry(this.val136)
         && BotFeatureRegistry(this.val137)
         && BotFeatureRegistry(this.val138)
         && BotFeatureRegistry(this.val139)
         && BotFeatureRegistry(this.val035);
   }

   public static boolean BotFeatureRegistry(float[] var0) {
      if (var0 == null) {
         return false;
      } else {
         for (float f : var0) {
            if (Float.isNaN(f) || Float.isInfinite(f)) {
               return false;
            }
         }

         return true;
      }
   }
}
