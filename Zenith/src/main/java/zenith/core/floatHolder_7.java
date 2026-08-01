package zenith;

import java.io.BufferedWriter;
import java.io.IOException;
import net.minecraft.entity.LivingEntity;

public class floatHolder_7 extends ZenithInternal057 {
   private static final int Ill11I1l1II11ll1l1 = 37;
   private static final int II1III1I1llII1Ill1ll1l111II1 = 2;
   private static final int lII1Il1lI11l1 = 3;
   private static final int lIlI1IIl1lI1II = 4;
   private static final int I111I1111l1Il11l = 5;
   private static final int ll11lII1Il11ll1l = 6;
   private static final int llllI1l11IlI11II11l11lI1l = 7;
   private static final int I11lllll1 = 14;
   private static final int I111lIlI1llIlIIl1I1l1l11lI = 15;
   private static final int lIII1llIlIl1ll11lIl1I1Ill1 = 28;
   private static final float lll1l1II1Illl1lIII1ll = 0.18F;
   private static final float Il11I1IIIlI1111IIIIl = 0.19F;
   private static final float I11Il1I1IIl1IIll1l1I1 = 0.12F;
   private static final float llI11lllIII1llI1lI11IllllI1I = 0.03F;
   private static final float IlII111Il1Il = 2.0F;
   private static final long IlIIIII1lI1ll = 128L;
   private BufferedWriter I1llI111I1IlIIlIlIII1lI1;
   private boolean Ill1I1IIl1l1lIIIlll11I1I1lll1 = false;
   private boolean l1II1ll1II1 = false;
   private boolean lIlIlIlI111IlII1lI1I11 = false;
   private boolean IIIII1lIIII11llI = false;
   private int IlI1I11Ill1lI1Il11IllII1ll = Integer.MIN_VALUE;

   public floatHolder_6 StringHolder_8(ZenithInternal124 lil1lill1illillllil, floatHolder_6 il1ll111liili1ll11liil) {
      floatHolder_6 il1ll111liili1ll11liil1 = II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1();
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         this.ll1I1l1ll111111lllI1lI();
         this.lIlIlI1l11lI1ll1lIll1I();
         return il1ll111liili1ll11liil1;
      } else {
         LivingEntity LivingEntity = Aura.ll1II1l1lII11IlII1.lI1IIllII11I();
         if (LivingEntity == null) {
            this.ll1I1l1ll111111lllI1lI();
            this.lIlIlI1l11lI1ll1lIll1I();
            l11I1I1ll1Illll1I1l1111l1II.player.setYaw(il1ll111liili1ll11liil1.AutoBrewing());
            l11I1I1ll1Illll1I1l1111l1II.player.setPitch(il1ll111liili1ll11liil1.Basefinder());
            return il1ll111liili1ll11liil1;
         } else {
            int i = LivingEntity.getId();
            if (i != this.IlI1I11Ill1lI1Il11IllII1ll) {
               this.ll1I1l1ll111111lllI1lI();
               this.IlI1I11Ill1lI1Il11IllII1ll = i;
            }

            floatHolder_6 il1ll111liili1ll11liil2 = llI1lIIIlII111I11l1lIIl11.I1lllI1I1IIl1l1()
               .StringHolder_8(lil1lill1illillllil, il1ll111liili1ll11liil, LivingEntity);
            if (il1ll111liili1ll11liil2 != null && !il1ll111liili1ll11liil2.lI1lI1II1l()) {
               floatHolder_9 li11l1lilili1l = il1ll111liili1ll11liil1.longHolder_6(il1ll111liili1ll11liil2);
               floatHolder_6 il1ll111liili1ll11liil3 = il1ll111liili1ll11liil1.StringHolder_8(li11l1lilili1l);
               return this.StringHolder_8(il1ll111liili1ll11liil1, il1ll111liili1ll11liil3);
            } else {
               this.ll1I1l1ll111111lllI1lI();
               return il1ll111liili1ll11liil1;
            }
         }
      }
   }

   private floatHolder_6 StringHolder_8(floatHolder_6 il1ll111liili1ll11liil, floatHolder_6 il1ll111liili1ll11liil1) {
      float[] afloat = llI1lIIIlII111I11l1lIIl11.I1lllI1I1IIl1l1().IIll111I1I1I();
      if (afloat != null && afloat.length >= 37 && this.byteHolder_2(afloat)) {
         float f = this.ZenithInternal084(il1ll111liili1ll11liil1.AutoBrewing() - il1ll111liili1ll11liil.AutoBrewing());
         float f1 = il1ll111liili1ll11liil1.Basefinder() - il1ll111liili1ll11liil.Basefinder();
         boolean flag = this.StringHolder_8(afloat, f, true, this.lIlIlIlI111IlII1lI1I11);
         boolean flag1 = this.StringHolder_8(afloat, f1, false, this.IIIII1lIIII11llI);
         this.lIlIlIlI111IlII1lI1I11 = flag;
         this.IIIII1lIIII11llI = flag1;
         if (!flag && !flag1) {
            return il1ll111liili1ll11liil1;
         } else {
            if (flag) {
               f = 0.0F;
            }

            if (flag1) {
               f1 = 0.0F;
            }

            return f == 0.0F && f1 == 0.0F
               ? il1ll111liili1ll11liil
               : new floatHolder_6(
                  il1ll111liili1ll11liil.AutoBrewing() + f, this.StringHolder_19(il1ll111liili1ll11liil.Basefinder() + f1)
               );
         }
      } else {
         this.ll1I1l1ll111111lllI1lI();
         return il1ll111liili1ll11liil1;
      }
   }

   private boolean StringHolder_8(float[] afloat, float f, boolean flag, boolean flag1) {
      if (!this.StringHolder_8(afloat, flag)) {
         return false;
      } else {
         float f1 = Math.abs(f);
         float f2 = flag1 ? 0.19F : 0.18F;
         return f1 < f2;
      }
   }

   private boolean StringHolder_8(float[] afloat, boolean flag) {
      if (afloat[14] < 0.5F) {
         return false;
      } else {
         float f = afloat[28];
         if (f <= 0.0F) {
            f = afloat[15];
         }

         if (f < 2.0F) {
            return false;
         } else {
            return flag ? this.EventImpl_24(afloat[2], afloat[3], afloat[6]) : this.EventImpl_24(afloat[4], afloat[5], afloat[7]);
         }
      }
   }

   private boolean EventImpl_24(float f, float f1, float f2) {
      if (this.isFinite(f) && this.isFinite(f1) && !(f > 0.0F) && !(f1 < 0.0F)) {
         float f3 = Math.abs(f2);
         if (!this.isFinite(f3) || f3 < 1.0E-4F) {
            f3 = Math.abs(f1 - f);
         }

         if (this.isFinite(f3) && !(f3 < 1.0E-4F)) {
            float f4 = Math.min(-f, f1);
            float f5 = Math.max(f3 * 0.12F, 0.03F);
            return f4 > f5;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void ll1I1l1ll111111lllI1lI() {
      this.lIlIlIlI111IlII1lI1I11 = false;
      this.IIIII1lIIII11llI = false;
      this.IlI1I11Ill1lI1Il11IllII1ll = Integer.MIN_VALUE;
   }

   private float ZenithInternal084(float f) {
      f %= 360.0F;
      if (f >= 180.0F) {
         f -= 360.0F;
      }

      if (f < -180.0F) {
         f += 360.0F;
      }

      return f;
   }

   private float StringHolder_19(float f) {
      return Math.max(-90.0F, Math.min(90.0F, f));
   }

   private void I1IIl1l1I() {
      if (!this.l1II1ll1II1) {
         Runtime.getRuntime().addShutdownHook(new Thread(this::I11IlIIlI11l111lIIlIl1lIl));
         this.l1II1ll1II1 = true;
      }
   }

   private void I11IlIIlI11l111lIIlIl1lIl() {
      if (this.I1llI111I1IlIIlIlIII1lI1 != null) {
         try {
            this.I1llI111I1IlIIlIlIII1lI1.flush();
            this.I1llI111I1IlIIlIlIII1lI1.close();
         } catch (IOException ioexception) {
         } finally {
            this.I1llI111I1IlIIlIlIII1lI1 = null;
         }
      }
   }

   private void lIlIlI1l11lI1ll1lIll1I() {
      if (this.I1llI111I1IlIIlIlIII1lI1 != null && !this.Ill1I1IIl1l1lIIIlll11I1I1lll1) {
         try {
            this.I1llI111I1IlIIlIlIII1lI1.flush();
         } catch (IOException ioexception) {
            this.Ill1I1IIl1l1lIIIlll11I1I1lll1 = true;
         }
      }
   }

   private void StringHolder_8(StringBuilder stringbuilder, String s) {
      stringbuilder.append(",\"");

      for (int i = 0; i < s.length(); i++) {
         char c0 = s.charAt(i);
         if (c0 == '"') {
            stringbuilder.append("\"\"");
         } else {
            stringbuilder.append(c0);
         }
      }

      stringbuilder.append('"');
   }

   private boolean StringHolder_8(floatHolder$Helper_4 li1llil1lllil111il11l$i1liiii1iii1lilil1l) {
      return !this.ZenithInternal061(li1llil1lllil111il11l$i1liiii1iii1lilil1l.l11I11IIIlIlIlIlll1I1II1I11())
         && !this.ZenithInternal061(li1llil1lllil111il11l$i1liiii1iii1lilil1l.lIlIIlI1IlllI11())
         && !this.ZenithInternal061(li1llil1lllil111il11l$i1liiii1iii1lilil1l.ll1IIIII1I11l11())
         && !this.ZenithInternal061(li1llil1lllil111il11l$i1liiii1iii1lilil1l.II1lI1l1llIl1II11())
         && !this.ZenithInternal061(li1llil1lllil111il11l$i1liiii1iii1lilil1l.I111llllI1I1lllI())
         && !this.ZenithInternal061(li1llil1lllil111il11l$i1liiii1iii1lilil1l.IlI11lIIlIl1Il1I1lI())
         && this.byteHolder(li1llil1lllil111il11l$i1liiii1iii1lilil1l.llIIII1Il1IIIIlI111ll1lIIlll())
         && this.byteHolder(li1llil1lllil111il11l$i1liiii1iii1lilil1l.IIIll1lIIllllIl11I1lllI1I1l());
   }

   private boolean byteHolder_2(float[] afloat) {
      for (float f : afloat) {
         if (this.ZenithInternal061(f)) {
            return false;
         }
      }

      return true;
   }

   private boolean byteHolder(float[] afloat) {
      return afloat == null || this.byteHolder_2(afloat);
   }

   private boolean ZenithInternal061(float f) {
      return !this.isFinite(f);
   }

   private boolean isFinite(float f) {
      return !Float.isNaN(f) && !Float.isInfinite(f);
   }
}
