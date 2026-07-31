package l;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class Event25 implements Helper41 {
   private BlockPos blockPos;
   private BlockState state;

   public Event25(BlockPos var1, BlockState var2) {
      this.blockPos = var1;
      this.state = var2;
   }

   public BlockPos method4139() {
      return this.blockPos;
   }

   public BlockState method4140() {
      return this.state;
   }

   public void method4141(BlockPos var1) {
      this.blockPos = var1;
   }

   public void method4142(BlockState var1) {
      this.state = var1;
   }
}
