package zenith;

import java.util.function.BooleanSupplier;

public final class ComparableImpl$Event implements Comparable<ComparableImpl$Event> {
   private int IllIIlIl11llIIlIIl1;
   private ZenithInternal022 IIII111l11llll;
   private BooleanSupplier lII11l1IllI1IIllI111Il;
   private int I1l111I11lIII11;

   public ComparableImpl$Event(int i, ZenithInternal022 i1ii1liil11ll1, BooleanSupplier booleansupplier, int j) {
      this.IllIIlIl11llIIlIIl1 = i;
      this.IIII111l11llll = i1ii1liil11ll1;
      this.lII11l1IllI1IIllI111Il = booleansupplier;
      this.I1l111I11lIII11 = j;
   }

   public int EventBus(ComparableImpl$Event i11ll1i1li$liil11l111liil1ll1) {
      return Integer.compare(i11ll1i1li$liil11l111liil1ll1.IlI1I111lIIll11(), this.IlI1I111lIIll11());
   }

   public void l11IIIIII111() {
      this.IllIIlIl11llIIlIIl1--;
   }

   public int I1l1II1II1Ill11IIIl() {
      return this.IllIIlIl11llIIlIIl1;
   }

   public ZenithInternal022 IIlI1IIlllllI1IIl() {
      return this.IIII111l11llll;
   }

   public BooleanSupplier lllII1IIllIIllIII1l1IIIIl1ll1() {
      return this.lII11l1IllI1IIllI111Il;
   }

   public int IlI1I111lIIll11() {
      return this.I1l111I11lIII11;
   }

   public ComparableImpl$Event ZenithInternal024(int i) {
      this.IllIIlIl11llIIlIIl1 = i;
      return this;
   }

   public ComparableImpl$Event EventBus(ZenithInternal022 i1ii1liil11ll1) {
      this.IIII111l11llll = i1ii1liil11ll1;
      return this;
   }

   public ComparableImpl$Event EventBus(BooleanSupplier booleansupplier) {
      this.lII11l1IllI1IIllI111Il = booleansupplier;
      return this;
   }

   public ComparableImpl$Event IsPriorityHandler(int i) {
      this.I1l111I11lIII11 = i;
      return this;
   }
}
