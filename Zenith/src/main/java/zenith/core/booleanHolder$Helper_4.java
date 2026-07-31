package zenith;

public class booleanHolder$Helper_4 {
   private boolean IllI1llIlI11I11II1Ill1I;
   private int lllII1l1I1ll11IlII1lIlll1l1l;

   booleanHolder$Helper_4() {
   }

   public booleanHolder$Helper_4 permessagedeflate(int i) {
      this.lllII1l1I1ll11IlII1lIlll1l1l = i;
      this.IllI1llIlI11I11II1Ill1I = true;
      return this;
   }

   public ZenithInternal124 l1l1ll1IIlll1lIIl11I1II1lll() {
      int i = this.lllII1l1I1ll11IlII1lIlll1l1l;
      if (!this.IllI1llIlI11I11II1Ill1I) {
         i = ZenithInternal124.lllI1l1111l1IlIIl1I1lI();
      }

      return new ZenithInternal124(i);
   }

   @Override
   public String toString() {
      return "GownoRotationConfig.GownoRotationConfigBuilder(tick$value=" + this.lllII1l1I1ll11IlII1lIlll1l1l + ")";
   }
}
