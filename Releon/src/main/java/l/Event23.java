package l;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class Event23 implements Helper41 {
   private final BlockState state;
   private final BlockPos pos;
   private final Helper403 type;

   public Event23(BlockState var1, BlockPos var2, Helper403 var3) {
      this.state = var1;
      this.pos = var2;
      this.type = var3;
   }

   public BlockState method4132() {
      return this.state;
   }

   public BlockPos method4133() {
      return this.pos;
   }

   public Helper403 method4134() {
      return this.type;
   }
}
