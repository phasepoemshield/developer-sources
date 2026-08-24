package org.zenith.module;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.math.BlockPos;

class BaseFinder_Var143 {
   final List<BlockPos> val236 = new ArrayList<>();
   final List<BlockPos> val171 = new ArrayList<>();
   boolean val120 = false;
   boolean val373 = true;
   int size = 0;
   int val237 = Integer.MAX_VALUE;
   int minY = Integer.MAX_VALUE;
   int val240 = Integer.MAX_VALUE;
   int val238 = Integer.MIN_VALUE;
   int val239 = Integer.MIN_VALUE;
   int val241 = Integer.MIN_VALUE;

   public BaseFinder_Var143() {
   }

   int width() {
      return Math.max(this.val238 - this.val237 + 1, this.val241 - this.val240 + 1);
   }

   int height() {
      return this.val239 - this.minY + 1;
   }
}
