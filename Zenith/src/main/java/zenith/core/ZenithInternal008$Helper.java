package zenith;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

final class Particles$EventTarget {
   net.minecraft.util.math.Vec3d l1l111I11I1I;
   net.minecraft.util.math.Vec3d I1I111ll;
   final long I1I1Il11l1I1l;
   final long l1I1I1I111Illl1lII1II111lI;
   final float IIl1I1ll1llIIllIIIII;
   final int ll1lIIIlI1llI1l1111II1lI;
   final float lIIl1IIl1lII11III1lI;
   final float II1IlII11I1I1I1Il11Il1;
   final float I1IIlI1lIIllI11I1III;
   double I1I11l1III;
   double ll1111lllllII;
   double IIIlllI111ll111lII1;
   final boolean l1IlllI;
   final boolean I1l11IlIlI1111lIlIlllI11IlIIl1;

   Particles$EventTarget(
      net.minecraft.util.math.Vec3d Vec3d,
      long i,
      long j,
      float f,
      double d0,
      double d1,
      double d2,
      float f1,
      float f2,
      float f3,
      boolean flag,
      boolean flag1,
      int k
   ) {
      this.l1l111I11I1I = Vec3d;
      this.I1I111ll = Vec3d;
      this.I1I1Il11l1I1l = i;
      this.l1I1I1I111Illl1lII1II111lI = j;
      this.IIl1I1ll1llIIllIIIII = f;
      this.ll1lIIIlI1llI1l1111II1lI = k;
      this.lIIl1IIl1lII11III1lI = f1;
      this.II1IlII11I1I1I1Il11Il1 = f2;
      this.I1IIlI1lIIllI11I1III = f3;
      this.I1I11l1III = d0 * 0.04;
      this.ll1111lllllII = d1 * 0.04;
      this.IIIlllI111ll111lII1 = d2 * 0.04;
      this.l1IlllI = flag;
      this.I1l11IlIlI1111lIlIlllI11IlIIl1 = flag1;
   }

   void StringHolder_8(World World) {
      this.I1I111ll = this.l1l111I11I1I;
      if (this.l1IlllI) {
         this.ll1111lllllII -= 0.015;
      }

      double d0 = this.l1l111I11I1I.x + this.I1I11l1III;
      double d1 = this.l1l111I11I1I.y + this.ll1111lllllII;
      double d2 = this.l1l111I11I1I.z + this.IIIlllI111ll111lII1;
      if (this.l1IlllI) {
         BlockPos BlockPos = BlockPos.ofFloored(d0, d1 - 0.02, d2);
         boolean flag = World.getBlockState(BlockPos).blocksMovement() && d1 <= (double)BlockPos.getY() + 1.001;
         if (flag && this.ll1111lllllII < 0.0) {
            d1 = (double)BlockPos.getY() + 1.001;
            if (this.I1l11IlIlI1111lIlIlllI11IlIIl1 && Math.abs(this.ll1111lllllII) > 0.01) {
               this.I1I11l1III *= 0.78;
               this.ll1111lllllII = -this.ll1111lllllII * 0.55;
               this.IIIlllI111ll111lII1 *= 0.78;
            } else {
               this.I1I11l1III *= 0.72;
               this.ll1111lllllII = 0.0;
               this.IIIlllI111ll111lII1 *= 0.72;
            }
         } else {
            this.I1I11l1III *= 0.98;
            this.ll1111lllllII *= 0.98;
            this.IIIlllI111ll111lII1 *= 0.98;
         }
      } else {
         this.I1I11l1III *= 0.98;
         this.ll1111lllllII *= 0.98;
         this.IIIlllI111ll111lII1 *= 0.98;
      }

      this.l1l111I11I1I = new net.minecraft.util.math.Vec3d(d0, d1, d2);
   }

   net.minecraft.util.math.Vec3d booleanHolder_2(float f) {
      return new net.minecraft.util.math.Vec3d(
         this.I1I111ll.x + (this.l1l111I11I1I.x - this.I1I111ll.x) * (double)f,
         this.I1I111ll.y + (this.l1l111I11I1I.y - this.I1I111ll.y) * (double)f,
         this.I1I111ll.z + (this.l1l111I11I1I.z - this.I1I111ll.z) * (double)f
      );
   }

   float ZenithInternal070(long i) {
      return MathHelper.clamp((float)(i - this.I1I1Il11l1I1l) / (float)this.l1I1I1I111Illl1lII1II111lI, 0.0F, 1.0F);
   }

   float longHolder_6(long i) {
      long j = i - this.I1I1Il11l1I1l;
      float f;
      if (j < 300L) {
         f = (float)j / 300.0F;
      } else if (j > this.l1I1I1I111Illl1lII1II111lI) {
         f = 1.0F - Math.min(1.0F, (float)(j - this.l1I1I1I111Illl1lII1II111lI) / 300.0F);
      } else {
         f = 1.0F;
      }

      return MathHelper.clamp(f, 0.0F, 1.0F);
   }

   boolean ListHolder_6(long i) {
      return i - this.I1I1Il11l1I1l > this.l1I1I1I111Illl1lII1II111lI + 1000L;
   }
}
