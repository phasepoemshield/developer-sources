package zenith;

import net.minecraft.util.math.BlockPos;

final class Basefinder$Event {
   private final int IlIlI111Il111I11IIIlI1l11I;
   private final int ll1l111I1l111Ill1IIllIl111l11I;
   private final int Ill1I1I111IIlI;
   private final int Illl11llI1I1Il1l;
   private final int III1Il1Il1;
   private final int lIll1IIlI1IIIlI;

   private Basefinder$Event(int i, int j, int k, int l, int i1, int j1) {
      this.IlIlI111Il111I11IIIlI1l11I = i;
      this.ll1l111I1l111Ill1IIllIl111l11I = j;
      this.Ill1I1I111IIlI = k;
      this.Illl11llI1I1Il1l = l;
      this.III1Il1Il1 = i1;
      this.lIll1IIlI1IIIlI = j1;
   }

   private boolean StringHolder(BlockPos BlockPos) {
      return BlockPos.getX() >= this.IlIlI111Il111I11IIIlI1l11I
         && BlockPos.getX() <= this.ll1l111I1l111Ill1IIllIl111l11I
         && BlockPos.getY() >= this.Ill1I1I111IIlI
         && BlockPos.getY() <= this.Illl11llI1I1Il1l
         && BlockPos.getZ() >= this.III1Il1Il1
         && BlockPos.getZ() <= this.lIll1IIlI1IIIlI;
   }

   private int IIllIlII1I1() {
      return (this.ll1l111I1l111Ill1IIllIl111l11I - this.IlIlI111Il111I11IIIlI1l11I + 1)
         * (this.Illl11llI1I1Il1l - this.Ill1I1I111IIlI + 1)
         * (this.lIll1IIlI1IIIlI - this.III1Il1Il1 + 1);
   }
}
