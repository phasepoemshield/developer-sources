package zenith;

public final class StringHolder_2  {
   private final ZenithInternal006$Helper llI1I1l1III1III1l1;
   private final String lIl1IlllI1I1l1I1l;
   private final String lI1IlI1lllIllllIlII11;
   private final String I11Illl1Il11Illl11;

   public StringHolder_2(ZenithInternal006$Helper i11li1li1lli1ll1il11111$ii1il11l111ii11iil, String s, String s1, String s2) {
      this.llI1I1l1III1III1l1 = i11li1li1lli1ll1il11111$ii1il11l111ii11iil;
      this.lIl1IlllI1I1l1I1l = s;
      this.lI1IlI1lllIllllIlII11 = s1;
      this.I11Illl1Il11Illl11 = s2;
   }

   public static StringHolder_2 l111lll1lIlIIIIll1Il1IlIl1() {
      return new StringHolder_2(null, "", "", "");
   }

   public boolean l1IllIIlIIl11l1I1IlI1IIl11Il1l() {
      return this.llI1I1l1III1III1l1 == null;
   }

   public String EventTarget(Autocraft Autocraft) {
      if (this.llI1I1l1III1III1l1 == ZenithInternal006$Helper.l111IIIl11lll1IlII111IlI11l) {
         return "Нажмите ПКМ по хранилищу с " + Autocraft.EventImpl_5(this.I11Illl1Il11Illl11) + " для автокрафта";
      } else if (this.llI1I1l1III1III1l1 == ZenithInternal006$Helper.I1lI1I1IIIl111I1ll1IlI1I11Il) {
         return "Нажмите ПКМ по сундуку склада для автокрафта";
      } else {
         return this.llI1I1l1III1III1l1 == ZenithInternal006$Helper.IlIlIl1I1II1l11Il
            ? "Нажмите ПКМ по верстаку для автокрафта"
            : "Нажмите ПКМ по блоку для привязки";
      }
   }

   public ZenithInternal006$Helper lI11lllIl1l1Il1IlI111lll1lI() {
      return this.llI1I1l1III1III1l1;
   }

   public String lll1lll1l1I1llII11lll() {
      return this.lIl1IlllI1I1l1I1l;
   }

   public String IlI1lIl1lIlII1lIlI1I1l1Ill() {
      return this.lI1IlI1lllIllllIlII11;
   }

   public String lI1l1lIl1I1111l1llIl1() {
      return this.I11Illl1Il11Illl11;
   }
}
