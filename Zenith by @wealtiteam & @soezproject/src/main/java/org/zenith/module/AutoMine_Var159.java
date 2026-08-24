package org.zenith.module;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

record AutoMine_Var159(BlockPos blockPos25, BlockState blockState) {

   public BlockPos pos() {
      return this.blockPos25;
   }

   public BlockState state() {
      return this.blockState;
   }
}
