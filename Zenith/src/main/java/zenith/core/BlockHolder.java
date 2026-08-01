package zenith;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class BlockHolder extends EventImpl_21 {
   private final Block lI1l1l1Il11I1ll;
   private final BlockPos Illlll1IlII11I1llI1111111;

   public Block Strafe() {
      return this.lI1l1l1Il11I1ll;
   }

   public BlockPos Velocity() {
      return this.Illlll1IlII11I1llI1111111;
   }

   public BlockHolder(Block Block, BlockPos BlockPos) {
      this.lI1l1l1Il11I1ll = Block;
      this.Illlll1IlII11I1llI1111111 = BlockPos;
   }
}
