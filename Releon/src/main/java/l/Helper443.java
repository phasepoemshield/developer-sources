package l;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

class Helper443 {
   private final BlockPos pos;
   private final Direction side;
   private final double distanceSq;

   Helper443(BlockPos var1, Direction var2, double var3) {
      this.pos = var1;
      this.side = var2;
      this.distanceSq = var3;
   }

   public BlockPos method4644() {
      return this.pos;
   }

   public Direction method4645() {
      return this.side;
   }

   public double method4646() {
      return this.distanceSq;
   }
}
