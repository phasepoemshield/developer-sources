package org.zenith.rotation;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;

final class RotationBurstStrategy_Var143 {
   public final int[] val321;
   public final int[] val431;
   public final float float125;
   public int index;

   RotationBurstStrategy_Var143(int[] var1, int[] var2, float var3) {
      this.val321 = var1;
      this.val431 = var2;
      this.float125 = var3;
   }

   RotationBurstStrategy_Var165 botClient6() {
      RotationBurstStrategy_Var165 lilili1l1iil_illi1l1l1 = new RotationBurstStrategy_Var165(
         this.val321[this.index], this.val431[this.index]
      );
      this.index++;
      return lilili1l1iil_illi1l1l1;
   }

   boolean isDone() {
      return this.index >= this.val321.length;
   }
}
