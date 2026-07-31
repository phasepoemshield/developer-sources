package zenith;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

public class floatHolder_11 extends ZenithInternal057 {
   private static final int IIl11I1I111l11l11IIl1ll1II11 = 37;
   private static final int I111lI11l1I11lll1111lIlIl1lI = 13;
   private static final float Ill11IlI1IIlllllI1llI11 = 50.0F;
   private static final float IllIl11lIIll1111111II1l11l1I = 176.0F;
   private static final float IIll11IIl11l11IlllIlIIl1Il1 = 8.0F;
   private static final float l1lI1I111Ill = 8.0F;
   private static final float llIIIIllIIl11l11I1llll1I11I = 20.0F;
   private static final float I1llIlIl1lIlllIIllIll1 = 0.18F;
   private static final float lIlI1I11111I11lI1 = 0.055F;
   private static final float lII1llIIlII11Ill1I1IlIlIl = 0.08F;
   private static final float I111lII1 = 0.14F;
   private static final int l111ll11I1I1I = Integer.MIN_VALUE;
   private boolean II1llIl1I1Il1lII1I11 = false;
   private boolean lIlll111lIlll1l1l111lI1lI1 = false;
   private int Illll1Il11Illl1Il1Ill1IlIIII = Integer.MIN_VALUE;
   private float IIIlllllI1II1IIIll11I1 = 0.0F;
   private float IIl11Il1II = 0.0F;
   private float I1IIlI1l11IllIl = 0.0F;
   private float IIIIIlllIIlI1llIIIl11 = 0.0F;
   private float llI11lIl1lIII11 = 0.0F;
   private float l1I1ll1llIIIIllIIllIl1I = 0.0F;
   private boolean l1Il1lIl1Il1IlI1l1IIIIl1l1 = false;
   private boolean l111l1lI1ll = false;
   private float lI11IIIl111lI1IIII1lIIII = 0.0F;
   private float III11I1lI1I = 0.0F;
   private float IIll1I111 = 0.0F;
   private float llI11I1IlIl1I1l1l1ll1lIlI = 0.0F;
   private float ll1lIIIIIl1 = 0.0F;
   private float I1II1III1lII11lII = 0.0F;
   private float[] llIIlI111lII = null;
   private float[] ll111Il11IIIIl = null;
   private floatHolder$Helper_4 IIIIll1l1l1l = null;
   int lI1III11II1I11111III1IIII = 0;

   public floatHolder_6 StringHolder_8(ZenithInternal124 lil1lill1illillllil, floatHolder_6 il1ll111liili1ll11liil) {
      return this.StringHolder_8(lil1lill1illillllil, il1ll111liili1ll11liil, this.Ill1IIlll1IIl1III1l1I11I1());
   }

   public floatHolder_6 StringHolder_8(
      ZenithInternal124 lil1lill1illillllil, floatHolder_6 il1ll111liili1ll11liil2, LivingEntity LivingEntity
   ) {
      floatHolder_6 il1ll111liili1ll11liil = II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1();
      this.lI11llll1I11II1();
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && LivingEntity != null) {
         net.minecraft.util.math.Box Box = LivingEntity.getBoundingBox();
         if (Box == null) {
            this.lIIlII1IlII1IIl();
            return il1ll111liili1ll11liil;
         } else {
            float[] afloat = this.StringHolder_8(il1ll111liili1ll11liil, l11I1I1ll1Illll1I1l1111l1II.player.getEyePos(), Box);
            if (afloat != null && afloat.length == 37) {
               this.ll111Il11IIIIl = (float[])afloat.clone();
               float[] afloat1 = this.EventImpl_13(afloat);
               if (afloat1 == null) {
                  this.IIIIll1l1l1l = null;
                  return il1ll111liili1ll11liil;
               } else {
                  floatHolder$Helper_4 li1llil1lllil111il11l$i1liiii1iii1lilil1l = I1llIIIII11llIIl.EventBus(afloat1);
                  if (li1llil1lllil111il11l$i1liiii1iii1lilil1l == null) {
                     this.IIIIll1l1l1l = null;
                     return il1ll111liili1ll11liil;
                  } else {
                     this.IIIIll1l1l1l = li1llil1lllil111il11l$i1liiii1iii1lilil1l;
                     float f = li1llil1lllil111il11l$i1liiii1iii1lilil1l.l11I11IIIlIlIlIlll1I1II1I11();
                     float f1 = li1llil1lllil111il11l$i1liiii1iii1lilil1l.lIlIIlI1IlllI11();
                     if (this.isFinite(f) && this.isFinite(f1)) {
                        floatHolder_6 il1ll111liili1ll11liil1 = il1ll111liili1ll11liil.hasTimeElapsed(f, f1);
                        float f2 = MathHelper.clamp(il1ll111liili1ll11liil1.Basefinder(), -90.0F, 90.0F);
                        return new floatHolder_6(il1ll111liili1ll11liil1.AutoBrewing(), f2);
                     } else {
                        return il1ll111liili1ll11liil;
                     }
                  }
               }
            } else {
               this.ll111Il11IIIIl = null;
               this.IIIIll1l1l1l = null;
               return il1ll111liili1ll11liil;
            }
         }
      } else {
         this.Illll1Il11Illl1Il1Ill1IlIIII = Integer.MIN_VALUE;
         this.lIIlII1IlII1IIl();
         return il1ll111liili1ll11liil;
      }
   }

   public floatHolder$Helper_4 IllI1I1IIIllllI() {
      return this.IIIIll1l1l1l;
   }

   public float[] IIll111I1I1I() {
      return this.ll111Il11IIIIl == null ? null : (float[])this.ll111Il11IIIIl.clone();
   }

   public void llIlI1I1Il1I() {
      this.lIIlII1IlII1IIl();
   }

   private float[] EventImpl_13(float[] afloat) {
      int i = I1llIIIII11llIIl.IIl1Ill1lIII1I11lIl1l1IIIl();
      if (i <= 0) {
         return afloat;
      } else if (i == afloat.length) {
         return afloat;
      } else if (i < afloat.length) {
         float[] afloat1 = new float[i];
         System.arraycopy(afloat, 0, afloat1, 0, i);
         return afloat1;
      } else {
         return null;
      }
   }

   private LivingEntity Ill1IIlll1IIl1III1l1I11I1() {
      LivingEntity LivingEntity = Aura.ll1II1l1lII11IlII1.lI1IIllII11I();
      return LivingEntity != null && LivingEntity.isAlive() ? LivingEntity : null;
   }

   private void lI11llll1I11II1() {
      if (!I1llIIIII11llIIl.llI11lIll1I11ll1lII() && !this.II1llIl1I1Il1lII1I11) {
         this.II1llIl1I1Il1lII1I11 = true;
         I1llIIIII11llIIl.l1I11III1lllIII1l();
      }
   }

   private float[] StringHolder_8(floatHolder_6 il1ll111liili1ll11liil, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box) {
      if (Box != null && l11I1I1ll1Illll1I1l1111l1II.player != null) {
         float f = il1ll111liili1ll11liil.AutoBrewing();
         float f1 = il1ll111liili1ll11liil.Basefinder();
         if (!this.lIlll111lIlll1l1l111lI1lI1) {
            this.IIIlllllI1II1IIIll11I1 = II1ll1II1l11lI.l1lII1IllIII().AutoBrewing();
            this.IIl11Il1II = II1ll1II1l11lI.l1lII1IllIII().Basefinder();
            this.lIlll111lIlll1l1l111lI1lI1 = true;
            this.llIIlI111lII = null;
            return null;
         } else {
            float f2 = MathHelper.wrapDegrees(f - II1ll1II1l11lI.l1lII1IllIII().AutoBrewing());
            float f3 = f1 - II1ll1II1l11lI.l1lII1IllIII().Basefinder();
            float f4 = f2 - this.I1IIlI1l11IllIl;
            float f5 = f3 - this.IIIIIlllIIlI1llIIIl11;
            float[] afloat = this.EventBus(il1ll111liili1ll11liil, Vec3d, Box);
            if (afloat == null) {
               this.llIIlI111lII = null;
               return null;
            } else {
               float[] afloat1 = this.llIIlI111lII != null && this.llIIlI111lII.length == 37 && this.byteHolder_2(this.llIIlI111lII) ? this.llIIlI111lII : null;
               float f6 = this.StringHolder_8(afloat1, 0, afloat[0]);
               float f7 = this.StringHolder_8(afloat1, 1, afloat[1]);
               float f8 = this.StringHolder_8(afloat1, 10, afloat[10]);
               float f9 = MathHelper.wrapDegrees(afloat[0] - f6);
               float f10 = afloat[1] - f7;
               float f11 = afloat[10] - f8;
               float f12 = afloat[0] / Math.max(Math.abs(afloat[6]), 0.1F);
               float f13 = afloat[1] / Math.max(Math.abs(afloat[7]), 0.1F);
               boolean flag = afloat[11] > 0.5F;
               if (flag) {
                  this.III11I1lI1I = 0.0F;
               } else {
                  this.III11I1lI1I = Math.min(this.III11I1lI1I + 1.0F, 8.0F);
               }

               float f14 = f4 - this.llI11lIl1lIII11;
               float f15 = f5 - this.l1I1ll1llIIIIllIIllIl1I;
               float f16 = (float)Math.sqrt((double)(afloat[0] * afloat[0] + afloat[1] * afloat[1]));
               float f17 = (float)Math.atan2((double)afloat[1], (double)afloat[0]);
               float f18 = (float)Math.sin((double)f17);
               float f19 = (float)Math.cos((double)f17);
               if (flag) {
                  this.IIll1I111 = MathHelper.clamp(this.l111l1lI1ll ? this.IIll1I111 + 1.0F : 1.0F, 0.0F, 176.0F);
                  this.llI11I1IlIl1I1l1l1ll1lIlI = 0.0F;
               } else {
                  this.IIll1I111 = 0.0F;
                  this.llI11I1IlIl1I1l1l1ll1lIlI = MathHelper.clamp(this.l111l1lI1ll ? 1.0F : this.llI11I1IlIl1I1l1l1ll1lIlI + 1.0F, 0.0F, 8.0F);
               }

               this.StringHolder_8(afloat[6], afloat[7], f2, f3, flag);
               float f20 = l11I1I1ll1Illll1I1l1111l1II.player.input.playerInput.forward() ? 1.0F : 0.0F;
               float f21 = l11I1I1ll1Illll1I1l1111l1II.player.input.playerInput.backward() ? 1.0F : 0.0F;
               float f22 = l11I1I1ll1Illll1I1l1111l1II.player.input.playerInput.left() ? 1.0F : 0.0F;
               float f23 = l11I1I1ll1Illll1I1l1111l1II.player.input.playerInput.right() ? 1.0F : 0.0F;
               float f24 = l11I1I1ll1Illll1I1l1111l1II.player.input.playerInput.jump() ? 1.0F : 0.0F;
               float[] afloat2 = new float[]{
                  afloat[0],
                  afloat[1],
                  afloat[2],
                  afloat[3],
                  afloat[4],
                  afloat[5],
                  afloat[6],
                  afloat[7],
                  afloat[8],
                  afloat[9],
                  afloat[10],
                  f9,
                  f10,
                  f11,
                  afloat[11],
                  afloat[12],
                  this.III11I1lI1I,
                  f2,
                  f3,
                  f4,
                  f5,
                  f12,
                  f13,
                  f14,
                  f15,
                  f16,
                  f18,
                  f19,
                  this.IIll1I111,
                  this.llI11I1IlIl1I1l1l1ll1lIlI,
                  this.ll1lIIIIIl1,
                  this.I1II1III1lII11lII,
                  f20,
                  f21,
                  f22,
                  f23,
                  f24
               };
               if (!this.byteHolder_2(afloat2)) {
                  return null;
               } else {
                  this.llIIlI111lII = (float[])afloat2.clone();
                  this.I1IIlI1l11IllIl = f2;
                  this.IIIIIlllIIlI1llIIIl11 = f3;
                  this.llI11lIl1lIII11 = f4;
                  this.l1I1ll1llIIIIllIIllIl1I = f5;
                  this.l111l1lI1ll = flag;
                  return afloat2;
               }
            }
         }
      } else {
         return null;
      }
   }

   private float[] EventBus(floatHolder_6 il1ll111liili1ll11liil, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box) {
      if (Box == null) {
         return null;
      } else {
         net.minecraft.util.math.Vec3d[] aVec3d = new net.minecraft.util.math.Vec3d[]{
            new net.minecraft.util.math.Vec3d(Box.minX, Box.minY, Box.minZ),
            new net.minecraft.util.math.Vec3d(Box.minX, Box.minY, Box.maxZ),
            new net.minecraft.util.math.Vec3d(Box.minX, Box.maxY, Box.minZ),
            new net.minecraft.util.math.Vec3d(Box.minX, Box.maxY, Box.maxZ),
            new net.minecraft.util.math.Vec3d(Box.maxX, Box.minY, Box.minZ),
            new net.minecraft.util.math.Vec3d(Box.maxX, Box.minY, Box.maxZ),
            new net.minecraft.util.math.Vec3d(Box.maxX, Box.maxY, Box.minZ),
            new net.minecraft.util.math.Vec3d(Box.maxX, Box.maxY, Box.maxZ)
         };
         net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(
            (Box.minX + Box.maxX) * 0.5,
            (Box.minY + Box.maxY) * 0.5,
            (Box.minZ + Box.maxZ) * 0.5
         );
         floatHolder_6 il1ll111liili1ll11liil1 = this.StringHolder_8(Vec3dxx, Vec3dx);
         floatHolder_9 li11l1lilili1lx = il1ll111liili1ll11liil.longHolder_6(il1ll111liili1ll11liil1);
         float f = li11l1lilili1lx.IlI1ll1l11IlllI111lIlIll111llI();
         float f1 = li11l1lilili1lx.I1II1IlI1I1ll1l1I11I1ll1();
         if (this.isFinite(f) && this.isFinite(f1)) {
            float f2 = Float.MAX_VALUE;
            float f3 = -Float.MAX_VALUE;
            float f4 = Float.MAX_VALUE;
            float f5 = -Float.MAX_VALUE;

            for (net.minecraft.util.math.Vec3d Vec3dxx : aVec3d) {
               floatHolder_6 il1ll111liili1ll11liil2 = this.StringHolder_8(Vec3dxx, Vec3dxx);
               floatHolder_9 li11l1lilili1lx = il1ll111liili1ll11liil.longHolder_6(il1ll111liili1ll11liil2);
               float f6 = li11l1lilili1lx.IlI1ll1l11IlllI111lIlIll111llI();
               float f7 = li11l1lilili1lx.I1II1IlI1I1ll1l1I11I1ll1();
               if (this.isFinite(f6) && this.isFinite(f7)) {
                  f6 = EventBus(f6, f);
                  f2 = Math.min(f2, f6);
                  f3 = Math.max(f3, f6);
                  f4 = Math.min(f4, f7);
                  f5 = Math.max(f5, f7);
               }
            }

            if (f2 == Float.MAX_VALUE || f3 == -Float.MAX_VALUE || f4 == Float.MAX_VALUE || f5 == -Float.MAX_VALUE) {
               f2 = f;
               f3 = f;
               f4 = f1;
               f5 = f1;
            }

            f = EventBus(f, f);
            float f8 = f3 - f2;
            float f9 = f5 - f4;
            float f10 = (float)l11I1I1ll1Illll1I1l1111l1II.player.getEyePos().distanceTo(Vec3dx);
            boolean flag = f2 <= 0.0F && f3 >= 0.0F;
            boolean flag1 = f4 <= 0.0F && f5 >= 0.0F;
            float f11 = 0.0F;
            float f12 = 0.0F;
            if (flag) {
               f11 = MathHelper.clamp(Math.abs(f8) > 1.0E-6F ? (0.0F - f2) / f8 : 0.0F, 0.0F, 1.0F);
            }

            if (flag1) {
               f12 = MathHelper.clamp(Math.abs(f9) > 1.0E-6F ? (0.0F - f4) / f9 : 0.0F, 0.0F, 1.0F);
            }

            boolean flag2 = flag && flag1;
            this.l1Il1lIl1Il1IlI1l1IIIIl1l1 = flag2;
            this.lI11IIIl111lI1IIII1lIIII = flag2 ? MathHelper.clamp(this.lI11IIIl111lI1IIII1lIIII + 1.0F, 0.0F, 50.0F) : 0.0F;
            float[] afloat = new float[]{
               f, f1, f2, f3, f4, f5, f8, f9, f11, f12, f10, this.l1Il1lIl1Il1IlI1l1IIIIl1l1 ? 1.0F : 0.0F, this.lI11IIIl111lI1IIII1lIIII
            };
            return this.byteHolder_2(afloat) && afloat.length == 13 ? afloat : null;
         } else {
            return null;
         }
      }
   }

   private void StringHolder_8(float f, float f1, float f2, float f3, boolean flag) {
      float f4 = Math.max(Math.abs(f) * 0.4F, 0.25F);
      float f5 = Math.max(Math.abs(f1) * 0.4F, 0.18F);
      float f6 = (float)Math.sqrt((double)(this.ZenithInternal101(f2 / f4) + this.ZenithInternal101(f3 / f5)));
      f6 = Math.min(f6, 1.5F);
      if (f6 > 0.18F) {
         this.I1II1III1lII11lII = Math.min(this.I1II1III1lII11lII + 1.0F, 20.0F);
         this.ll1lIIIIIl1 = Math.min(this.ll1lIIIIIl1 + f6 * 0.055F, 1.0F);
      } else {
         this.I1II1III1lII11lII = Math.max(this.I1II1III1lII11lII - 2.0F, 0.0F);
         float f7 = flag ? 0.14F : 0.08F;
         this.ll1lIIIIIl1 = Math.max(this.ll1lIIIIIl1 - f7, 0.0F);
      }
   }

   private float ZenithInternal101(float f) {
      return f * f;
   }

   private float StringHolder_8(float[] afloat, int i, float f) {
      if (afloat != null && i >= 0 && i < afloat.length) {
         float f1 = afloat[i];
         return this.isFinite(f1) ? f1 : f;
      } else {
         return f;
      }
   }

   private floatHolder_6 StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d) {
      return ZenithInternal131.ZenithInternal070(Vec3d.subtract(Vec3dx));
   }

   private static float EventBus(float f, float f1) {
      while (f - f1 > 180.0F) {
         f -= 360.0F;
      }

      while (f - f1 < -180.0F) {
         f += 360.0F;
      }

      return f;
   }

   private void lIIlII1IlII1IIl() {
      I1llIIIII11llIIl.IIlIIllIIlIIlIIIl();
      this.I1III1llIIlII11();
   }

   private void I1III1llIIlII11() {
      this.lIlll111lIlll1l1l111lI1lI1 = false;
      this.IIIlllllI1II1IIIll11I1 = 0.0F;
      this.IIl11Il1II = 0.0F;
      this.I1IIlI1l11IllIl = 0.0F;
      this.IIIIIlllIIlI1llIIIl11 = 0.0F;
      this.llI11lIl1lIII11 = 0.0F;
      this.l1I1ll1llIIIIllIIllIl1I = 0.0F;
      this.l1Il1lIl1Il1IlI1l1IIIIl1l1 = false;
      this.l111l1lI1ll = false;
      this.lI11IIIl111lI1IIII1lIIII = 0.0F;
      this.III11I1lI1I = 0.0F;
      this.IIll1I111 = 0.0F;
      this.llI11I1IlIl1I1l1l1ll1lIlI = 0.0F;
      this.ll1lIIIIIl1 = 0.0F;
      this.I1II1III1lII11lII = 0.0F;
      this.llIIlI111lII = null;
      this.ll111Il11IIIIl = null;
      this.IIIIll1l1l1l = null;
   }

   private boolean isFinite(float f) {
      return !Float.isNaN(f) && !Float.isInfinite(f);
   }

   private boolean byteHolder_2(float[] afloat) {
      for (float f : afloat) {
         if (!this.isFinite(f)) {
            return false;
         }
      }

      return true;
   }
}
