package org.zenith.module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;

import net.minecraft.util.Identifier;

final class KillEffect_Var143 {
   final long val313;
   final int val140;
   final int val141;
   final KillEffect_Var159[] val142;
   final Identifier val314;
   final float val422;

   KillEffect_Var143(long var1, int var3, int var4, KillEffect_Var159[] var5, Identifier var6) {
      this(var1, var3, var4, var5, var6, 1.0F);
   }

   KillEffect_Var143(long var1, int var3, int var4, KillEffect_Var159[] var5, Identifier var6, float var7) {
      this.val313 = var1;
      this.val140 = var3;
      this.val141 = var4;
      this.val142 = var5;
      this.val314 = var6;
      this.val422 = var7;
   }
}
