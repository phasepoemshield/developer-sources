package zenith;

import org.joml.Matrix4f;

public final class HeightHandler$Helper  {
   private final Matrix4f Illl1IllIIlI1ll1lIIlI1Ill11I;
   private final float Ill1III1IIll1l111I1I;
   private final float IlIlllII1l1Ill1I1Il1ll;
   private final float IIllll1lll1;
   private final float IIlllI;
   private final floatHolder_5 lllIlIIlIl;
   private final ByteBufferHolder I1lllII11Ill1Il11llIlIll1I1lI;

   public HeightHandler$Helper(
      Matrix4f matrix4f, float f, float f1, float f2, float f3, floatHolder_5 iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder il1iliilli1l1iill
   ) {
      this.Illl1IllIIlI1ll1lIIlI1Ill11I = matrix4f;
      this.Ill1III1IIll1l111I1I = f;
      this.IlIlllII1l1Ill1I1Il1ll = f1;
      this.IIllll1lll1 = f2;
      this.IIlllI = f3;
      this.lllIlIIlIl = iil11iill1il1l1llilll1l1i1i1;
      this.I1lllII11Ill1Il11llIlIll1I1lI = il1iliilli1l1iill;
   }

   public Matrix4f I1lI1IlIIllllll1l11IIIII() {
      return this.Illl1IllIIlI1ll1lIIlI1Ill11I;
   }

   public float Il11lIlllI111I1l1111() {
      return this.Ill1III1IIll1l111I1I;
   }

   public float I1II11l1I11Illl11IIl1l1lIl1II() {
      return this.IlIlllII1l1Ill1I1Il1ll;
   }

   public float width() {
      return this.IIllll1lll1;
   }

   public float height() {
      return this.IIlllI;
   }

   public floatHolder_5 II1lIl1l1llI11II() {
      return this.lllIlIIlIl;
   }

   public ByteBufferHolder lII11I1III1lll1I11I() {
      return this.I1lllII11Ill1Il11llIlIll1I1lI;
   }
}
