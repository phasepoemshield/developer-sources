package zenith;

import java.util.Random;

public class RandomHolder {
   private final int ll1ll1l11IlIlIlIIIl;
   private final int lIlIlIIlll1IlIlI1II11llI1111;
   private final Random I1llIllI1IIlI1l11IIlI1llIIlI = new Random();

   public RandomHolder(int i, int j) {
      if (i > j) {
         throw new IllegalArgumentException("Start must be less than or equal to endInclusive");
      } else {
         this.ll1ll1l11IlIlIlIIIl = i;
         this.lIlIlIIlll1IlIlI1II11llI1111 = j;
      }
   }

   public int lII111l1lIIIl() {
      return this.ll1ll1l11IlIlIlIIIl + this.I1llIllI1IIlI1l11IIlI1llIIlI.nextInt(this.lIlIlIIlll1IlIlI1II11llI1111 - this.ll1ll1l11IlIlIlIIIl + 1);
   }

   @Override
   public String toString() {
      return this.ll1ll1l11IlIlIlIIIl + ".." + this.lIlIlIIlll1IlIlI1II11llI1111;
   }

   public int lI111IlI11() {
      return this.ll1ll1l11IlIlIlIIIl;
   }

   public int III1lI1l1lIl() {
      return this.lIlIlIIlll1IlIlI1II11llI1111;
   }
}
