package zenith;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.math.BlockPos;

final class Autocraft$Event {
   private final BlockPos I1lI1IIIl11I1lll1Ill1;
   private final List<Autocraft$l1IIl11lI> lI11IIlII1l11IIll11lllI;
   private int lIIl11111IIlI1lI1Il1I11lI1;

   private Autocraft$Event(Autocraft Autocraft, BlockPos BlockPos) {
      this.IllIl1Il1l = Autocraft;
      this.lI11IIlII1l11IIll11lllI = new ArrayList<>();
      this.I1lI1IIIl11I1lll1Ill1 = BlockPos;
   }

   private void StringHolder_8(Autocraft$l1IIl11lI Autocraft$l1iil11li) {
      if (Autocraft$l1iil11li.count() > 0) {
         this.lI11IIlII1l11IIll11lllI.add(Autocraft$l1iil11li);
      }
   }

   private int ClearHeadersHandler(String s, String s1) {
      int i = 0;

      for (Autocraft$l1IIl11lI Autocraft$l1iil11li : this.lI11IIlII1l11IIll11lllI) {
         if (this.IllIl1Il1l.StringHolder_8(Autocraft$l1iil11li, s, s1)) {
            i += Autocraft$l1iil11li.count();
         }
      }

      return i;
   }

   private boolean StringHolder_5(String s, String s1) {
      if (this.lIIl11111IIlI1lI1Il1I11lI1 > 0) {
         return true;
      } else {
         for (Autocraft$l1IIl11lI Autocraft$l1iil11li : this.lI11IIlII1l11IIll11lllI) {
            if (this.IllIl1Il1l.StringHolder_8(Autocraft$l1iil11li, s, s1)
               && Autocraft$l1iil11li.count() < Autocraft$l1iil11li.I1Il1I1l1lIllIII1I111lI()) {
               return true;
            }
         }

         return false;
      }
   }
}
