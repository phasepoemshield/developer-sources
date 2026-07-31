package zenith;

import org.joml.Matrix4f;

final class IIl1III1I1IlllI1IlIllII1l1lIll$Event implements ZenithInternal043$Helper  {
   private final Matrix4f I1I1l11l1ll1;
   private final float II11I11II1;
   private final float l1I11lII11l1lIllllll1l;
   private final float l11IIIIIl11l1llIlIIIIII;
   private final float l1I1I11llllIIlIIIIII11;
   private final floatHolder_5 lIIl1l1I1Il1l1l1IllIIllI1II;
   private final ByteBufferHolder lllI1l11111l1IIII111II1IlI1l;

   private IIl1III1I1IlllI1IlIllII1l1lIll$Event(
      Matrix4f matrix4f, float f, float f1, float f2, float f3, floatHolder_5 iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder il1iliilli1l1iill
   ) {
      this.I1I1l11l1ll1 = matrix4f;
      this.II11I11II1 = f;
      this.l1I11lII11l1lIllllll1l = f1;
      this.l11IIIIIl11l1llIlIIIIII = f2;
      this.l1I1I11llllIIlIIIIII11 = f3;
      this.lIIl1l1I1Il1l1l1IllIIllI1II = iil11iill1il1l1llilll1l1i1i1;
      this.lllI1l11111l1IIII111II1IlI1l = il1iliilli1l1iill;
   }

   public Matrix4f I1lI1IlIIllllll1l11IIIII() {
      return this.I1I1l11l1ll1;
   }

   public float Il11lIlllI111I1l1111() {
      return this.II11I11II1;
   }

   public float I1II11l1I11Illl11IIl1l1lIl1II() {
      return this.l1I11lII11l1lIllllll1l;
   }

   public float width() {
      return this.l11IIIIIl11l1llIlIIIIII;
   }

   public float height() {
      return this.l1I1I11llllIIlIIIIII11;
   }

   public floatHolder_5 II1lIl1l1llI11II() {
      return this.lIIl1l1I1Il1l1l1IllIIllI1II;
   }

   public ByteBufferHolder lII11I1III1lll1I11I() {
      return this.lllI1l11111l1IIII111II1IlI1l;
   }
}
