package zenith;

public final class HeightHandler  {
   private final float llIIl1l1IIllIIlIll1I1I1I1Il1;
   private final float llIl1IIlIIIllllII1l1l1II1Ill;
   private final float I1Il1llI1II1lIllII1IIIIIIl1;
   private final float II11I11l1IIll1llI1IllI1I1;

   public HeightHandler(float f, float f1, float f2, float f3) {
      this.llIIl1l1IIllIIlIll1I1I1I1Il1 = f;
      this.llIl1IIlIIIllllII1l1l1II1Ill = f1;
      this.I1Il1llI1II1lIllII1IIIIIIl1 = f2;
      this.II11I11l1IIll1llI1IllI1I1 = f3;
   }

   public boolean byteHolder(double d0, double d1) {
      return doubleHolder_3.StringHolder_8(
         d0,
         d1,
         (double)this.llIIl1l1IIllIIlIll1I1I1I1Il1,
         (double)this.llIl1IIlIIIllllII1l1l1II1Ill,
         (double)this.I1Il1llI1II1lIllII1IIIIIIl1,
         (double)this.II11I11l1IIll1llI1IllI1I1
      );
   }

   public boolean StringHolder_8(double d0, double d1, float f) {
      return doubleHolder_3.StringHolder_8(
         d0,
         d1,
         (double)(this.llIIl1l1IIllIIlIll1I1I1I1Il1 - f),
         (double)(this.llIl1IIlIIIllllII1l1l1II1Ill - f),
         (double)(this.I1Il1llI1II1lIllII1IIIIIIl1 + f * 2.0F),
         (double)(this.II11I11l1IIll1llI1IllI1I1 + f * 2.0F)
      );
   }

   public boolean StringHolder_8(HeightHandler li1il11i1iilii1iiili111li11) {
      return this.llIIl1l1IIllIIlIll1I1I1I1Il1 < li1il11i1iilii1iiili111li11.Il11lIlllI111I1l1111() + li1il11i1iilii1iiili111li11.width()
         && this.llIIl1l1IIllIIlIll1I1I1I1Il1 + this.I1Il1llI1II1lIllII1IIIIIIl1 > li1il11i1iilii1iiili111li11.Il11lIlllI111I1l1111()
         && this.llIl1IIlIIIllllII1l1l1II1Ill < li1il11i1iilii1iiili111li11.I1II11l1I11Illl11IIl1l1lIl1II() + li1il11i1iilii1iiili111li11.height()
         && this.llIl1IIlIIIllllII1l1l1II1Ill + this.II11I11l1IIll1llI1IllI1I1 > li1il11i1iilii1iiili111li11.I1II11l1I11Illl11IIl1l1lIl1II();
   }

   public float Il11lIlllI111I1l1111() {
      return this.llIIl1l1IIllIIlIll1I1I1I1Il1;
   }

   public float I1II11l1I11Illl11IIl1l1lIl1II() {
      return this.llIl1IIlIIIllllII1l1l1II1Ill;
   }

   public float width() {
      return this.I1Il1llI1II1lIllII1IIIIIIl1;
   }

   public float height() {
      return this.II11I11l1IIll1llI1IllI1I1;
   }
}
