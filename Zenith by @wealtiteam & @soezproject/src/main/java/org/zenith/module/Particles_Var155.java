package org.zenith.module;

import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;

import org.zenith.event.EventInjectPlaced;

import java.util.Random;
import net.minecraft.util.math.Vec3d;

class Particles_Var155 implements Particles_Var7 {
   final Vec3d val181;
   final long val299;
   final long val182;
   final int val393;
   final double val394;
   final double val395;
   final double val396;
   final double[] val030 = new double[32];
   final double[] val061 = new double[32];
   final double[] val062 = new double[32];
   final long[] val043 = new long[32];
   int count;
   long val397;
   long val044 = -1L;
   boolean val045;
   long val046 = -1L;
   int int92;

   Particles_Var155(Vec3d var1, double var2, long var4, long var6, Random var8, int var9, float var10) {
      this.val181 = var1;
      this.val299 = var4;
      this.val182 = var6;
      this.val393 = var9;
      float f = (float)var2 + (var8.nextBoolean() ? 0.0F : (float) Math.PI) + (var8.nextFloat() - 0.5F) * 0.75F;
      float f1 = (var8.nextFloat() - 0.5F) * 0.5F;
      float f2 = Math.max(2.6F, var10 * (0.35F + var8.nextFloat() * 0.45F));
      double d0 = Math.cos((double)f1) * (double)f2;
      this.val394 = Math.cos((double)f) * d0;
      this.val395 = Math.sin((double)f1) * (double)f2;
      this.val396 = Math.sin((double)f) * d0;
   }

   void on23(double var1, double var3, double var5, long var7) {
      if (this.count > 0 && var7 - this.val397 < 16L) {
         this.val030[0] = var1;
         this.val061[0] = var3;
         this.val062[0] = var5;
         this.val043[0] = var7;
      } else {
         int i = Math.min(this.count, this.val030.length - 1);

         for (int j = i; j > 0; j--) {
            this.val030[j] = this.val030[j - 1];
            this.val061[j] = this.val061[j - 1];
            this.val062[j] = this.val062[j - 1];
            this.val043[j] = this.val043[j - 1];
         }

         this.val030[0] = var1;
         this.val061[0] = var3;
         this.val062[0] = var5;
         this.val043[0] = var7;
         this.val397 = var7;
         if (this.count < this.val030.length) {
            this.count++;
         }
      }
   }

   @Override
   public boolean EventInjectPlaced(long var1) {
      return var1 - this.val299 > this.val182;
   }
}
