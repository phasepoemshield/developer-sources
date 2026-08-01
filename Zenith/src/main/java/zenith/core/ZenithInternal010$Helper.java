package zenith;

import java.util.Random;

class Particles$l1IIl11lI {
   final net.minecraft.util.math.Vec3d lllI11IllIlI1I111lIlI1Ill;
   final long Il1l111I111III11I1111ll1;
   final long l1l11II1IIIl1IlIlIll;
   final int llIlI1lll1I1II111l1lII;
   final double IllII1ll1lIIIl1IllII;
   final double lIl1llIIlIlIlI111I;
   final double lI1lIIIIll1I1111l1;
   final double[] II1IllIIlI = new double[32];
   final double[] l11llIIIIll = new double[32];
   final double[] lll1ll1l11l1lIll1l11IlIIl = new double[32];
   final long[] llIl1lllIlII1IIIII = new long[32];
   int count;
   long l1111I11II1I1lI1llI1;

   Particles$l1IIl11lI(net.minecraft.util.math.Vec3d Vec3d, double d0, long i, long j, Random random, int k, float f) {
      this.lllI11IllIlI1I111lIlI1Ill = Vec3d;
      this.Il1l111I111III11I1111ll1 = i;
      this.l1l11II1IIIl1IlIlIll = j;
      this.llIlI1lll1I1II111l1lII = k;
      float f1 = (float)d0 + (random.nextBoolean() ? 0.0F : (float) Math.PI) + (random.nextFloat() - 0.5F) * 0.75F;
      float f2 = (random.nextFloat() - 0.5F) * 0.5F;
      float f3 = Math.max(2.6F, f * (0.35F + random.nextFloat() * 0.45F));
      double d1 = Math.cos((double)f2) * (double)f3;
      this.IllII1ll1lIIIl1IllII = Math.cos((double)f1) * d1;
      this.lIl1llIIlIlIlI111I = Math.sin((double)f2) * (double)f3;
      this.lI1lIIIIll1I1111l1 = Math.sin((double)f1) * d1;
   }

   void EventBus(net.minecraft.util.math.Vec3d Vec3d, long i) {
      if (this.count > 0 && i - this.l1111I11II1I1lI1llI1 < 16L) {
         this.II1IllIIlI[0] = Vec3d.x;
         this.l11llIIIIll[0] = Vec3d.y;
         this.lll1ll1l11l1lIll1l11IlIIl[0] = Vec3d.z;
         this.llIl1lllIlII1IIIII[0] = i;
      } else {
         int j = Math.min(this.count, this.II1IllIIlI.length - 1);

         for (int k = j; k > 0; k--) {
            this.II1IllIIlI[k] = this.II1IllIIlI[k - 1];
            this.l11llIIIIll[k] = this.l11llIIIIll[k - 1];
            this.lll1ll1l11l1lIll1l11IlIIl[k] = this.lll1ll1l11l1lIll1l11IlIIl[k - 1];
            this.llIl1lllIlII1IIIII[k] = this.llIl1lllIlII1IIIII[k - 1];
         }

         this.II1IllIIlI[0] = Vec3d.x;
         this.l11llIIIIll[0] = Vec3d.y;
         this.lll1ll1l11l1lIll1l11IlIIl[0] = Vec3d.z;
         this.llIl1lllIlII1IIIII[0] = i;
         this.l1111I11II1I1lI1llI1 = i;
         if (this.count < this.II1IllIIlI.length) {
            this.count++;
         }
      }
   }
}
