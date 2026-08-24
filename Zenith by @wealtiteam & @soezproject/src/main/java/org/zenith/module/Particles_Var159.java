package org.zenith.module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.BlockPosEntry;
import org.zenith.core.PositionProvider;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.BooleanValue;
import org.zenith.core.CloudResponse;

import org.zenith.event.EventInjectPlaced;

import net.minecraft.util.math.Vec3d;

class Particles_Var159 implements Particles_Var7 {
   final Vec3d val130;
   final double val300;
   final long val031;
   final long val032;
   final int val398;
   final float val063;
   final float val064;
   final float val065;
   final double val033;
   final double val016;
   final double val034;
   long val044 = -1L;
   boolean val045;
   long val097 = -1L;
   double val006;
   double val007;
   double val008;
   long val046 = -1L;
   int int92;

   Particles_Var159(
      Vec3d var1, double var2, long var4, long var6, int var8, float var9, float var10, float var11, double var12, double var14, double var16
   ) {
      this.val130 = var1;
      this.val300 = var2;
      this.val031 = var4;
      this.val032 = var6;
      this.val398 = var8;
      this.val063 = var9;
      this.val064 = var10;
      this.val065 = var11;
      this.val033 = var12;
      this.val016 = var14;
      this.val034 = var16;
   }

   @Override
   public boolean EventInjectPlaced(long var1) {
      return var1 - this.val031 > this.val032;
   }
}
