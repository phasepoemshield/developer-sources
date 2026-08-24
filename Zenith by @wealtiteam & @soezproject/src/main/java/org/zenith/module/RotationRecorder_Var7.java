package org.zenith.module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;

final class RotationRecorder_Var7 {
   public final RotationRecorder_Var160 rotationRecorderVar160;
   public final RotationRecorder_Var160 rotationRecorderVar1602;
   public final RotationRecorder_Var160 rotationRecorderVar1603;

   public RotationRecorder_Var7(
      RotationRecorder_Var160 var1, RotationRecorder_Var160 var2, RotationRecorder_Var160 var3
   ) {
      this.rotationRecorderVar160 = var1;
      this.rotationRecorderVar1602 = var2;
      this.rotationRecorderVar1603 = var3;
   }

   public boolean float216() {
      return this.rotationRecorderVar160.boolean103
         || this.rotationRecorderVar1602.boolean103
         || this.rotationRecorderVar1603.boolean103;
   }
}
