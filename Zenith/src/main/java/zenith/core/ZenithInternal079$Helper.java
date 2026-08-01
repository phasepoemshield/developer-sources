package zenith;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.math.BlockPos;

class Basefinder$EventBus {
   final List<BlockPos> I1I1111lIIlIII111IlI1IlII1ll11 = new ArrayList<>();
   final List<BlockPos> I1lll1111lI = new ArrayList<>();
   boolean Il1Il11IIl1lIII1 = false;
   boolean I111l1I1IIll1lIlII1 = true;
   int size = 0;
   int IlII11ll11llIll1IIlIll1ll = Integer.MAX_VALUE;
   int l1III11lIIlII1Il1IlIl = Integer.MAX_VALUE;
   int lI1I1l1lll = Integer.MAX_VALUE;
   int Il1Il1IlIlllIlll1IIIIlIlIlI1I = Integer.MIN_VALUE;
   int I1Il1I11lIlllIII1lI1I1IIlI1lII = Integer.MIN_VALUE;
   int llII111I1IllIlIl1Illl = Integer.MIN_VALUE;

   private Basefinder$EventBus() {
   }

   int Il1ll1llllIl() {
      return Math.max(this.Il1Il1IlIlllIlll1IIIIlIlIlI1I - this.IlII11ll11llIll1IIlIll1ll + 1, this.llII111I1IllIlIl1Illl - this.lI1I1l1lll + 1);
   }

   int I111IIlI1Ill1IIlll() {
      return this.I1Il1I11lIlllIII1lI1I1IIlI1lII - this.l1III11lIIlII1Il1IlIl + 1;
   }
}
