package zenith;

import java.util.function.Supplier;

public final class SupplierHolder  {
   private final floatHolder_6 IlIll1l111II1I;
   private final Supplier<floatHolder_6> IllIlIII1I1IIIIll1ll;
   private final ZenithInternal115 l1II1lIIl1ll1l;

   public SupplierHolder(
      floatHolder_6 il1ll111liili1ll11liil, Supplier<floatHolder_6> supplier, ZenithInternal115 lii1lll1l1li1ii1iiillii
   ) {
      this.IlIll1l111II1I = il1ll111liili1ll11liil;
      this.IllIlIII1I1IIIIll1ll = supplier;
      this.l1II1lIIl1ll1l = lii1lll1l1li1ii1iiillii;
   }

   public floatHolder_6 I1l1I1IIIIl111I1Ill1ll1lI111I() {
      return this.IlIll1l111II1I;
   }

   public Supplier<floatHolder_6> I1111lII1IIl1Il1I1lIIIlI11llI() {
      return this.IllIlIII1I1IIIIll1ll;
   }

   public ZenithInternal115 IIlI1lI1lI1Il1l111lIl111IIlll() {
      return this.l1II1lIIl1ll1l;
   }
}
