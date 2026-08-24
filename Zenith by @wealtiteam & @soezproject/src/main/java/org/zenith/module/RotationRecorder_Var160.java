package org.zenith.module;

import org.zenith.core.Easing;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;

import net.minecraft.util.math.Vec3d;

final class RotationRecorder_Var160 {
   public final boolean boolean101;
   public final Vec3d vec3d20;
   public final Vec3d vec3d21;
   public final Vec3d vec3d22;
   public final boolean boolean102;
   public final boolean boolean103;
   public final boolean boolean104;

   public RotationRecorder_Var160(boolean var1, Vec3d var2, Vec3d var3, Vec3d var4, boolean var5, boolean var6, boolean var7) {
      this.boolean101 = var1;
      this.vec3d20 = var2;
      this.vec3d21 = var3;
      this.vec3d22 = var4;
      this.boolean102 = var5;
      this.boolean103 = var6;
      this.boolean104 = var7;
   }

   public static RotationRecorder_Var160 Easing(Vec3d var0, Vec3d var1) {
      return new RotationRecorder_Var160(false, Vec3d.ZERO, var0, var1, false, false, false);
   }
}
