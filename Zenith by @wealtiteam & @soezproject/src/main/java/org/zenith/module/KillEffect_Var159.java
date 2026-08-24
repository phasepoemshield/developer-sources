package org.zenith.module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;

import net.minecraft.util.math.Vec3d;

final class KillEffect_Var159 {
   final Vec3d val048;
   final Vec3d val020;
   final Vec3d val026;
   final Vec3d val027;
   final float val068;
   final float val194;
   final float val195;
   final float val143;
   final KillEffect_Var165[] val315;
   final int val316;

   KillEffect_Var159(
      Vec3d var1, Vec3d var2, Vec3d var3, Vec3d var4, float var5, float var6, float var7, float var8, KillEffect_Var165[] var9
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   KillEffect_Var159(
      Vec3d var1, Vec3d var2, Vec3d var3, Vec3d var4, float var5, float var6, float var7, float var8, KillEffect_Var165[] var9, int var10
   ) {
      this.val048 = var1;
      this.val020 = var2;
      this.val026 = var3;
      this.val027 = var4;
      this.val068 = var5;
      this.val194 = var6;
      this.val195 = var7;
      this.val143 = var8;
      this.val315 = var9;
      this.val316 = var10;
   }
}
