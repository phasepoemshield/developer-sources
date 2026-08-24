package org.zenith.module;

import org.zenith.rotation.Rotation;

import net.minecraft.util.hit.BlockHitResult;

record AutoMine_Var143(Rotation var1187, BlockHitResult blockHitResult3, int int149, double double35) {

   public Rotation rotation() {
      return this.var1187;
   }

   public BlockHitResult hitResult() {
      return this.blockHitResult3;
   }

   public int drillCoverage() {
      return this.int149;
   }

   public double distanceSquared() {
      return this.double35;
   }
}
