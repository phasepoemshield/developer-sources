package zenith;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class Basefinder$l1lll11l1l {
   public final BlockPos I11lIIIlIl1l1II11ll11lll;
   public final Block I111II1I1III1I1l1l;

   public Basefinder$l1lll11l1l(BlockPos BlockPos, Block Block) {
      this.I11lIIIlIl1l1II11ll11lll = BlockPos;
      this.I111II1I1III1I1l1l = Block;
   }

   @Override
   public boolean equals(Object object) {
      if (this == object) {
         return true;
      } else {
         return !(object instanceof Basefinder$l1lll11l1l l1ii1iilii1i11lill1lll$l1lll11l1l)
            ? false
            : this.I11lIIIlIl1l1II11ll11lll.equals(l1ii1iilii1i11lill1lll$l1lll11l1l.I11lIIIlIl1l1II11ll11lll)
               && this.I111II1I1III1I1l1l.equals(l1ii1iilii1i11lill1lll$l1lll11l1l.I111II1I1III1I1l1l);
      }
   }

   @Override
   public int hashCode() {
      return this.I11lIIIlIl1l1II11ll11lll.hashCode() * 31 + this.I111II1I1III1I1l1l.hashCode();
   }
}
