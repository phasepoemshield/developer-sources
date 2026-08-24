package org.zenith.module;

import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.HudPreviewItem;
import org.zenith.config.CosmeticManager;
import org.zenith.core.PositionProvider;
import org.zenith.core.HudEffectIcons;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.BooleanValue;
import org.zenith.core.CloudResponse;

import org.zenith.event.ChatMessageEvent;
import org.zenith.event.EventInteractBlock;
import org.zenith.event.EventMouseScrollHook;


import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

final class Particles_Var165 {
   double x;
   double y;
   double z;
   double val183;
   double val184;
   double val185;
   final long val186;
   final long val131;
   final float val187;
   final int val399;
   final float val400;
   final float val301;
   final float val401;
   double val033;
   double val016;
   double val034;
   final boolean val302;
   final boolean val402;
   long val044 = -1L;
   boolean val045;
   long val097 = -1L;
   double val006;
   double val007;
   double val008;
   long val046 = -1L;
   int int92;

   Particles_Var165(
      Vec3d var1,
      long var2,
      long var4,
      float var6,
      double var7,
      double var9,
      double var11,
      float var13,
      float var14,
      float var15,
      boolean var16,
      boolean var17,
      int var18
   ) {
      this.x = var1.x;
      this.y = var1.y;
      this.z = var1.z;
      this.val183 = var1.x;
      this.val184 = var1.y;
      this.val185 = var1.z;
      this.val186 = var2;
      this.val131 = var4;
      this.val187 = var6;
      this.val399 = var18;
      this.val400 = var13;
      this.val301 = var14;
      this.val401 = var15;
      this.val033 = var7 * 0.04;
      this.val016 = var9 * 0.04;
      this.val034 = var11 * 0.04;
      this.val302 = var16;
      this.val402 = var17;
   }

   void on23(World var1) {
      this.val183 = this.x;
      this.val184 = this.y;
      this.val185 = this.z;
      if (this.val302) {
         this.val016 -= 0.015;
      }

      double d0 = this.x + this.val033;
      double d1 = this.y + this.val016;
      double d2 = this.z + this.val034;
      if (this.val302) {
         BlockPos blockpos = BlockPos.ofFloored(d0, d1 - 0.02, d2);
         boolean flag = var1.getBlockState(blockpos).blocksMovement() && d1 <= (double)blockpos.getY() + 1.001;
         if (flag && this.val016 < 0.0) {
            d1 = (double)blockpos.getY() + 1.001;
            if (this.val402 && Math.abs(this.val016) > 0.01) {
               this.val033 *= 0.78;
               this.val016 = -this.val016 * 0.55;
               this.val034 *= 0.78;
            } else {
               this.val033 *= 0.72;
               this.val016 = 0.0;
               this.val034 *= 0.72;
            }
         } else {
            this.val033 *= 0.98;
            this.val016 *= 0.98;
            this.val034 *= 0.98;
         }
      } else {
         this.val033 *= 0.98;
         this.val016 *= 0.98;
         this.val034 *= 0.98;
      }

      this.x = d0;
      this.y = d1;
      this.z = d2;
   }

   void on23(float var1, long var2) {
      this.val006 = this.val183 + (this.x - this.val183) * (double)var1;
      this.val007 = this.val184 + (this.y - this.val184) * (double)var1;
      this.val008 = this.val185 + (this.z - this.val185) * (double)var1;
      this.val097 = var2;
   }

   float ChatMessageEvent(long var1) {
      return MathHelper.clamp((float)(var1 - this.val186) / (float)this.val131, 0.0F, 1.0F);
   }

   float EventMouseScrollHook(long var1) {
      long i = var1 - this.val186;
      float f;
      if (i < 300L) {
         f = (float)i / 300.0F;
      } else if (i > this.val131) {
         f = 1.0F - Math.min(1.0F, (float)(i - this.val131) / 300.0F);
      } else {
         f = 1.0F;
      }

      return MathHelper.clamp(f, 0.0F, 1.0F);
   }

   boolean EventInteractBlock(long var1) {
      return var1 - this.val186 > this.val131 + 1000L;
   }
}
