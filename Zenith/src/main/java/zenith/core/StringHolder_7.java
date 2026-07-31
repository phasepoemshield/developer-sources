package zenith;

import java.util.concurrent.ThreadLocalRandom;

public class StringHolder_7 extends SetColorHandler_2 {
   private static final String IIllII1lII1l1lI11lIl1ll = "particle.texture.spaceStar";
   private final double l1lllII1lll1l1lI1;
   private final double Il1II1IlII1I1II;
   private final double I11lIIlIl;
   private final double llIllIl11lIllIl1lI1;
   private final double ll1lI1llI1l;
   private final double lIl1IIlIIIl11IIl;
   private final double I11l1IIl1I1lI1I;
   private final double ll11l11Ill1lI1III1;
   private final double llIIlI11lI;
   private final float I1111Il1I1I1ll1l11lIIIlII1Il;
   private final float llI1IlI1I1II1I111l1I;
   private final float lI11llllI11l11IlI1ll1111l;
   private double l1lIlI1l1l1II11l111l1l1II;
   private float IIIl1II1I1I1I = 1.0F;

   private StringHolder_7(
      net.minecraft.util.math.Vec3d Vec3d,
      int i,
      float f,
      ByteBufferHolder il1iliilli1l1iill,
      float f1,
      float f2,
      double d0,
      double d1,
      double d2,
      double d3,
      double d4,
      double d5,
      double d6,
      double d7,
      double d8,
      float f3,
      float f4,
      float f5
   ) {
      super(Vec3d, net.minecraft.util.math.Vec3d.ZERO, i, f, il1iliilli1l1iill, "particle.texture.spaceStar", f1, f2);
      this.l1lllII1lll1l1lI1 = d0;
      this.Il1II1IlII1I1II = d1;
      this.I11lIIlIl = d2;
      this.llIllIl11lIllIl1lI1 = d3;
      this.ll1lI1llI1l = d4;
      this.lIl1IIlIIIl11IIl = d5;
      this.I11l1IIl1I1lI1I = d6;
      this.ll11l11Ill1lI1III1 = d7;
      this.llIIlI11lI = d8;
      this.I1111Il1I1I1ll1l11lIIIlII1Il = f3;
      this.llI1IlI1I1II1I111l1I = f4;
      this.lI11llllI11l11IlI1ll1111l = f5;
   }

   public static StringHolder_7 StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, float f, int i, float f1, ByteBufferHolder il1iliilli1l1iill) {
      ThreadLocalRandom threadlocalrandom = ThreadLocalRandom.current();
      double d0 = Math.pow(threadlocalrandom.nextDouble(0.08, 1.0), 0.72);
      double d1 = Math.max(6.0, (double)f * d0);
      double d2 = threadlocalrandom.nextDouble((double)(-f) * 0.34, (double)f * 0.42);
      double d3 = threadlocalrandom.nextDouble(Math.PI * 2);
      double d4 = (double)threadlocalrandom.nextInt(4) * (Math.PI / 2);
      double d5 = threadlocalrandom.nextDouble(0.0015, 0.0075) * (threadlocalrandom.nextBoolean() ? 1.0 : -1.0);
      double d6 = threadlocalrandom.nextDouble(Math.PI * 2);
      double d7 = threadlocalrandom.nextDouble(0.015, 0.035);
      double d8 = threadlocalrandom.nextDouble(1.2, 4.8);
      double d9 = threadlocalrandom.nextDouble(0.8, 3.6);
      float f2 = f1 * threadlocalrandom.nextFloat(0.55F, 1.65F);
      float f3 = threadlocalrandom.nextFloat(0.0F, 360.0F);
      float f4 = threadlocalrandom.nextFloat(-0.7F, 0.7F);
      float f5 = threadlocalrandom.nextFloat(0.65F, 1.35F);
      float f6 = threadlocalrandom.nextFloat(0.05F, 0.12F);
      float f7 = threadlocalrandom.nextFloat(0.0F, (float) (Math.PI * 2));
      StringHolder_7 i1lil1lliilli1lli1l = new StringHolder_7(
         Vec3d, i, f2, il1iliilli1l1iill, f3, f4, d1, d2, d3, d4, d5, d6, d7, d8, d9, f5, f6, f7
      );
      i1lil1lliilli1lli1l.l1lIlI1l1l1II11l111l1l1II = threadlocalrandom.nextDouble(0.0, 260.0);
      i1lil1lliilli1lli1l.ll1IIIllIlI1ll = threadlocalrandom.nextInt(Math.max(2, i / 3), i);
      i1lil1lliilli1lli1l.lIlIIIIIl1 = i1lil1lliilli1lli1l.ll1IIIllIlI1ll;
      i1lil1lliilli1lli1l.l1l111I11I1I = i1lil1lliilli1lli1l.ZenithInternal044(Vec3d);
      i1lil1lliilli1lli1l.I1I111ll = i1lil1lliilli1lli1l.l1l111I11I1I;
      return i1lil1lliilli1lli1l;
   }

   public void EventTarget(net.minecraft.util.math.Vec3d Vec3d, float f) {
      this.lIlIIIIIl1 = this.ll1IIIllIlI1ll;
      this.I1I111ll = this.l1l111I11I1I;
      this.ll1IIIllIlI1ll--;
      if (this.ll1IIIllIlI1ll > 0) {
         this.IIIl1II1I1I1I = Math.max(0.05F, f);
         this.l1lIlI1l1l1II11l111l1l1II = this.l1lIlI1l1l1II11l111l1l1II + (double)this.IIIl1II1I1I1I;
         this.l1l111I11I1I = this.ZenithInternal044(Vec3d);
         this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = this.l1l111I11I1I.subtract(this.I1I111ll);
         this.l11Il1IlllIllI();
      }
   }

   private net.minecraft.util.math.Vec3d ZenithInternal044(net.minecraft.util.math.Vec3d Vec3d) {
      double d0 = this.l1lIlI1l1l1II11l111l1l1II;
      double d1 = this.l1lllII1lll1l1lI1 * 0.055;
      double d2 = this.I11lIIlIl + this.llIllIl11lIllIl1lI1 + d1 + d0 * this.ll1lI1llI1l;
      double d3 = this.l1lllII1lll1l1lI1 + Math.sin(d0 * this.I11l1IIl1I1lI1I + this.lIl1IIlIIIl11IIl) * this.ll11l11Ill1lI1III1;
      double d4 = Math.cos(d2) * d3;
      double d5 = Math.sin(d2) * d3;
      double d6 = 4.5
         + this.Il1II1IlII1I1II
         + Math.sin(d0 * this.I11l1IIl1I1lI1I * 1.7 + this.lIl1IIlIIIl11IIl) * this.llIIlI11lI
         + Math.sin(d2 * 2.0 + this.lIl1IIlIIIl11IIl) * 0.85;
      return Vec3d.add(d4, d6, d5);
   }

   @Override
   public float lI1lI1llIlll1Il1lII1I1l() {
      return this.GetPayloadLengthHandler(1.0F);
   }

   @Override
   public float GetPayloadLengthHandler(float f) {
      float f1 = this.FilterInputStreamImpl(f);
      float f2 = Math.min(f1 / 0.12F, 1.0F);
      float f3 = f1 > 0.82F ? 1.0F - (f1 - 0.82F) / 0.18F : 1.0F;
      float f4 = 0.62F + 0.38F * this.BufferedOutputStreamImpl(f);
      return Math.max(0.0F, f2 * f3 * f4);
   }

   public float BufferedOutputStreamImpl(float f) {
      return (float)(
         (
               Math.sin(
                     (this.l1lIlI1l1l1II11l111l1l1II + (double)(f * this.IIIl1II1I1I1I)) * (double)this.llI1IlI1I1II1I111l1I
                        + (double)this.lI11llllI11l11IlI1ll1111l
                  )
                  + 1.0
            )
            * 0.5
      );
   }

   public float ZenithInternal033(float f) {
      return this.IIIII1I1II1llII * (4.0F + this.BufferedOutputStreamImpl(f) * 2.5F) * this.I1111Il1I1I1ll1l11lIIIlII1Il;
   }

   public float ThreadImpl(float f) {
      return this.IIIII1I1II1llII * (0.65F + this.BufferedOutputStreamImpl(f) * 0.35F);
   }

   public float WritingThread(float f) {
      return this.IIIII1I1II1llII * (1.35F + this.BufferedOutputStreamImpl(f) * 0.45F);
   }

   public float ZenithClient(float f) {
      return Math.min(10.0F, (float)this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.length() * 18.0F * f);
   }
}
