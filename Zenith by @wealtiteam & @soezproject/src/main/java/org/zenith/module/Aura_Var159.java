package org.zenith.module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EmotePlayback;
import org.zenith.core.ClickFxController;

public class Aura_Var159 {
   public double x;
   public double y;
   public double z;
   public int ticks;

   public Aura_Var159(double var1, double var3, double var5) {
      this.x = var1;
      this.y = var3;
      this.z = var5;
   }

   public boolean var11810() {
      return this.ticks++ > 2;
   }

   public double getX() {
      return this.x;
   }

   public double getY() {
      return this.y;
   }

   public double getZ() {
      return this.z;
   }
}
