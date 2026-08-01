package zenith;

public enum ZenithInternal068 {
   IlIl1I1lIIII1II1I1II1lI1IllIl(0),
   lII1lI1lII1l(1),
   l1lll1lIII1l11(2),
   lI1IIIl11IlI11I(3),
   IIlIl11lllll111l1ll11llIllI1(4),
   I1I1lI1I1III1IIlll111Ill1llI(5),
   ll11l1111lIll(6);

   private final int lIl1l1IllII1Il1lIlIIl1l;

   public static ZenithInternal068 StringHolder_24(int i) {
      for (ZenithInternal068 ill1iili11ii1l : values()) {
         if (ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == i) {
            return ill1iili11ii1l;
         }
      }

      return IlIl1I1lIIII1II1I1II1lI1IllIl;
   }

   private ZenithInternal068(int j) {
      this.lIl1l1IllII1Il1lIlIIl1l = j;
   }

   public int IlIllIlI1l1111IIlllIl11lIIIll() {
      return this.lIl1l1IllII1Il1lIlIIl1l;
   }
}
