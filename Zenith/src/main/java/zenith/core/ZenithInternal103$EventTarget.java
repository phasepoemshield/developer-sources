package zenith;

public class ZenithInternal103$EventTarget {
   public final int IlIIIIIl11lII1lIII11I1l11ll;
   private int lII1ll1l1I1lIlll1 = 0;

   public ZenithInternal103$EventTarget(int i) {
      this.IlIIIIIl11lII1lIII11I1l11ll = i;
   }

   public void reset() {
      this.lII1ll1l1I1lIlll1 = 0;
   }

   public boolean lIII1llIlIl1ll11lIl1I1Ill1() {
      return ++this.lII1ll1l1I1lIlll1 > 4;
   }
}
