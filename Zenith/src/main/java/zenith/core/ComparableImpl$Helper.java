package zenith;

import java.util.function.BooleanSupplier;

public final class ComparableImpl$Helper implements Comparable<ComparableImpl$Helper> {
   private int lI1llllIl1I11IlI1I;
   private ZenithInternal022 IIII111l11llll;
   private BooleanSupplier lII11l1IllI1IIllI111Il;
   private int I1l111I11lIII11;

   public ComparableImpl$Helper(int i, ZenithInternal022 i1ii1liil11ll1, BooleanSupplier booleansupplier, int j) {
      this.lI1llllIl1I11IlI1I = i;
      this.IIII111l11llll = i1ii1liil11ll1;
      this.lII11l1IllI1IIllI111Il = booleansupplier;
      this.I1l111I11lIII11 = j;
   }

   public int EventBus(ComparableImpl$Helper i11ll1i1li$l1lll11l1l1) {
      return Integer.compare(i11ll1i1li$l1lll11l1l1.IlI1I111lIIll11(), this.IlI1I111lIIll11());
   }

   public int IIIllIlIIIll11lll() {
      return this.lI1llllIl1I11IlI1I;
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

   public ComparableImpl$Helper ZenithInternal087(int i) {
      this.lI1llllIl1I11IlI1I = i;
      return this;
   }

   public ComparableImpl$Helper StringHolder_8(ZenithInternal022 i1ii1liil11ll1) {
      this.IIII111l11llll = i1ii1liil11ll1;
      return this;
   }

   public ComparableImpl$Helper StringHolder_8(BooleanSupplier booleansupplier) {
      this.lII11l1IllI1IIllI111Il = booleansupplier;
      return this;
   }

   public ComparableImpl$Helper ZenithInternal100(int i) {
      this.I1l111I11lIII11 = i;
      return this;
   }
}
