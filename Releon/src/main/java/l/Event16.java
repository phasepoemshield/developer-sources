package l;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class Event16 implements Helper41 {
   private final BlockPos blockPos;
   private final Direction direction;

   public Event16(BlockPos var1, Direction var2) {
      this.blockPos = var1;
      this.direction = var2;
   }

   public BlockPos method3793() {
      return this.blockPos;
   }

   public Direction method3794() {
      return this.direction;
   }
}
