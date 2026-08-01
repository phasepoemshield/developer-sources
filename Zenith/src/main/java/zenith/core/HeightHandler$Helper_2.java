package zenith;

import org.joml.Matrix4f;

final class IIl1III1I1IlllI1IlIllII1l1lIll$EventTarget implements ZenithInternal043$Helper  {
   private final Matrix4f I11I1IllllIl11l11ll11I1;
   private final float I1lIIlII1Il1Illl11IIIIlI1;
   private final float l111lI1IIIlIlllIl1l1IlI;
   private final float II1I1IIIII1l1I;
   private final float IlIl1Il1l11l;
   private final ByteBufferHolder lIl11I111llI;

   private IIl1III1I1IlllI1IlIllII1l1lIll$EventTarget(Matrix4f matrix4f, float f, float f1, float f2, float f3, ByteBufferHolder il1iliilli1l1iill) {
      this.I11I1IllllIl11l11ll11I1 = matrix4f;
      this.I1lIIlII1Il1Illl11IIIIlI1 = f;
      this.l111lI1IIIlIlllIl1l1IlI = f1;
      this.II1I1IIIII1l1I = f2;
      this.IlIl1Il1l11l = f3;
      this.lIl11I111llI = il1iliilli1l1iill;
   }

   public Matrix4f I1lI1IlIIllllll1l11IIIII() {
      return this.I11I1IllllIl11l11ll11I1;
   }

   public float Il11lIlllI111I1l1111() {
      return this.I1lIIlII1Il1Illl11IIIIlI1;
   }

   public float I1II11l1I11Illl11IIl1l1lIl1II() {
      return this.l111lI1IIIlIlllIl1l1IlI;
   }

   public float width() {
      return this.II1I1IIIII1l1I;
   }

   public float height() {
      return this.IlIl1Il1l11l;
   }

   public ByteBufferHolder lII11I1III1lll1I11I() {
      return this.lIl11I111llI;
   }
}
