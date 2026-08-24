package org.zenith.module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.HudPreviewItem;
import org.zenith.core.EmotePlayback;
import org.zenith.core.ClickFxController;

class Predictions_Var165 {
   double x;
   double y;
   double z;
   double val095;
   double val060;
   double val096;
   int val140;
   long val320;

   Predictions_Var165(double var1, double var3, double var5, double var7, double var9, double var11, int var13, long var14) {
      this.x = var1;
      this.y = var3;
      this.z = var5;
      this.val095 = var7;
      this.val060 = var9;
      this.val096 = var11;
      this.val140 = var13;
      this.val320 = var14;
   }

   void update() {
      this.x = this.x + this.val095;
      this.y = this.y + this.val060;
      this.z = this.z + this.val096;
      this.val060 -= 0.002;
      this.val095 *= 0.98;
      this.val060 *= 0.98;
      this.val096 *= 0.98;
   }
}
