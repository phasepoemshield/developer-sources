package zenith;

import java.util.ArrayList;
import java.util.List;

public class ListHolder_9 {
   public List<booleanHolder$Helper_3> Illll1Illl1lll111II1lIIl = new ArrayList<>();
   public List<floatHolder$EventBus_2> II11IIlI1lIIl = new ArrayList<>();
   public floatHolder$EventTarget I11I111ll = new floatHolder$EventTarget(0.0F, -1.0F, 0.0F);
   public float I1IllI1l111I1l1lI11l = 25.0F;
   public int IIl11IlIlI1IIlIlIllI1 = 30;
   private final float l11lllI1l1lllI1 = 20.0F;
   public boolean II1lll1l1l1lII1l111 = false;

   public boolean ZenithInternal039(int i) {
      if (this.Illll1Illl1lll111II1lIIl.size() != i) {
         this.Illll1Illl1lll111II1lIIl.clear();
         this.II11IIlI1lIIl.clear();

         for (int j = 0; j < i; j++) {
            booleanHolder$Helper_3 lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iil = new booleanHolder$Helper_3();
            lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iil.I111I1Il1I11.field_172 = (float)(-j);
            lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iil.I111I1Il1I11.field_171 = (float)(-j);
            lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iil.llI111IIII111lIIIll1lI1l = j == 0;
            this.Illll1Illl1lll111II1lIIl.add(lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iil);
            if (j > 0) {
               this.II11IIlI1lIIl
                  .add(
                     new floatHolder$EventBus_2(
                        this.Illll1Illl1lll111II1lIIl.get(j - 1), lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iil, 1.0F
                     )
                  );
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void I1llI1II1II1Il1lIIl11IIlll111() {
      this.l1lIIIIIIl1II11I1l11Il();
      this.l1IIlI1ll1I1l1l1111l1();
      this.III11Ill11IlI11IlIllll11I();
      this.IIl1lIl11Il1l1IIII1l1l1I11I();
      this.III11Ill11IlI11IlIllll11I();
      this.lI1lI11l11llIll1lI1l();
      this.lllIIIIl1lI1l11llll1l1Il1I11();
   }

   private void l1lIIIIIIl1II11I1l11Il() {
      float f = 0.05F;
      floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1x = this.I11I111ll
         .l11Illl1III11()
         .StringHolder_13(this.I1IllI1l111I1l1lI11l * f);
      floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1x = new floatHolder$EventTarget(0.0F, 0.0F, 0.0F);

      for (booleanHolder$Helper_3 lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iil : this.Illll1Illl1lll111II1lIIl) {
         if (!lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iil.llI111IIII111lIIIll1lI1l) {
            lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.Event(lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iil.I111I1Il1I11);
            lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iil.I111I1Il1I11.EventTarget(lii1ii1lll1i1lll1llill11i11l$illi1l1l1x);
            lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iil.Il1llI11II1l.Event(lii1ii1lll1i1lll1llill11i11l$illi1l1l1x);
         }
      }
   }

   private void IIl1lIl11Il1l1IIII1l1l1I11I() {
      for (int i = 0; i < this.IIl11IlIlI1IIlIlIllI1; i++) {
         for (int j = this.II11IIlI1lIIl.size() - 1; j >= 0; j--) {
            floatHolder$EventBus_2 lii1ii1lll1i1lll1llill11i11l$l1i1illlili = this.II11IIlI1lIIl.get(j);
            floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1x = lii1ii1lll1i1lll1llill11i11l$l1i1illlili.Ill1llII11111
               .I111I1Il1I11
               .l11Illl1III11()
               .EventTarget(lii1ii1lll1i1lll1llill11i11l$l1i1illlili.IIllI11llIl1l1l1l1Il1lIlll1lI.I111I1Il1I11)
               .ZenithInternal072(2.0F);
            floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1x = lii1ii1lll1i1lll1llill11i11l$l1i1illlili.Ill1llII11111
               .I111I1Il1I11
               .l11Illl1III11()
               .ZenithInternal095(lii1ii1lll1i1lll1llill11i11l$l1i1illlili.IIllI11llIl1l1l1l1Il1lIlll1lI.I111I1Il1I11)
               .l1IlIllI11l();
            if (!lii1ii1lll1i1lll1llill11i11l$l1i1illlili.Ill1llII11111.llI111IIII111lIIIll1lI1l) {
               lii1ii1lll1i1lll1llill11i11l$l1i1illlili.Ill1llII11111.I111I1Il1I11 = lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.l11Illl1III11()
                  .EventTarget(
                     lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.l11Illl1III11()
                        .StringHolder_13(lii1ii1lll1i1lll1llill11i11l$l1i1illlili.ll11III11I11l1Il1l1IIllI / 2.0F)
                  );
            }

            if (!lii1ii1lll1i1lll1llill11i11l$l1i1illlili.IIllI11llIl1l1l1l1Il1lIlll1lI.llI111IIII111lIIIll1lI1l) {
               lii1ii1lll1i1lll1llill11i11l$l1i1illlili.IIllI11llIl1l1l1l1Il1lIlll1lI.I111I1Il1I11 = lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.l11Illl1III11()
                  .ZenithInternal095(
                     lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.l11Illl1III11()
                        .StringHolder_13(lii1ii1lll1i1lll1llill11i11l$l1i1illlili.ll11III11I11l1Il1l1IIllI / 2.0F)
                  );
            }
         }
      }
   }

   private void lllIIIIl1lI1l11llll1l1Il1I11() {
      for (int i = 0; i < this.II11IIlI1lIIl.size(); i++) {
         floatHolder$EventBus_2 lii1ii1lll1i1lll1llill11i11l$l1i1illlili = this.II11IIlI1lIIl.get(i);
         floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1 = lii1ii1lll1i1lll1llill11i11l$l1i1illlili.Ill1llII11111
            .I111I1Il1I11
            .l11Illl1III11()
            .ZenithInternal095(lii1ii1lll1i1lll1llill11i11l$l1i1illlili.IIllI11llIl1l1l1l1Il1lIlll1lI.I111I1Il1I11)
            .l1IlIllI11l();
         if (!lii1ii1lll1i1lll1llill11i11l$l1i1illlili.IIllI11llIl1l1l1l1Il1lIlll1lI.llI111IIII111lIIIll1lI1l) {
            lii1ii1lll1i1lll1llill11i11l$l1i1illlili.IIllI11llIl1l1l1l1Il1lIlll1lI.I111I1Il1I11 = lii1ii1lll1i1lll1llill11i11l$l1i1illlili.Ill1llII11111
               .I111I1Il1I11
               .l11Illl1III11()
               .ZenithInternal095(lii1ii1lll1i1lll1llill11i11l$illi1l1l1.StringHolder_13(lii1ii1lll1i1lll1llill11i11l$l1i1illlili.ll11III11I11l1Il1l1IIllI));
         }
      }
   }

   private void III11Ill11IlI11IlIllll11I() {
      int i = 0;

      boolean flag;
      do {
         flag = false;

         for (int j = 0; j < this.Illll1Illl1lll111II1lIIl.size(); j++) {
            for (int k = j + 1; k < this.Illll1Illl1lll111II1lIIl.size(); k++) {
               booleanHolder$Helper_3 lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx = this.Illll1Illl1lll111II1lIIl.get(j);
               booleanHolder$Helper_3 lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx = this.Illll1Illl1lll111II1lIIl.get(k);
               floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1x = lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11
                  .l11Illl1III11()
                  .ZenithInternal095(lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11);
               if ((double)lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.lll11lIlI111111Ill1lll1Il() < 0.99) {
                  flag = true;
                  i++;
                  lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.l1IlIllI11l();
                  floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1x = lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11
                     .l11Illl1III11()
                     .EventTarget(lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11)
                     .ZenithInternal072(2.0F);
                  if (!lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.llI111IIII111lIIIll1lI1l) {
                     lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11 = lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.l11Illl1III11()
                        .EventTarget(lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.l11Illl1III11().StringHolder_13(0.5F));
                  }

                  if (!lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.llI111IIII111lIIIll1lI1l) {
                     lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11 = lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.l11Illl1III11()
                        .ZenithInternal095(lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.l11Illl1III11().StringHolder_13(0.5F));
                  }
               }
            }
         }
      } while (flag && i < 32);
   }

   private void lI1lI11l11llIll1lI1l() {
      for (int i = 1; i < this.Illll1Illl1lll111II1lIIl.size() - 2; i++) {
         double d0 = this.StringHolder_8(
            this.Illll1Illl1lll111II1lIIl.get(i).I111I1Il1I11,
            this.Illll1Illl1lll111II1lIIl.get(i - 1).I111I1Il1I11,
            this.Illll1Illl1lll111II1lIIl.get(i + 1).I111I1Il1I11
         );
         if (d0 < (double)(-this.l11lllI1l1lllI1)) {
            float f = -this.l11lllI1l1lllI1;
            floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1x = this.StringHolder_8(
               this.Illll1Illl1lll111II1lIIl.get(i).I111I1Il1I11, this.Illll1Illl1lll111II1lIIl.get(i - 1).I111I1Il1I11, (double)(f * 2.0F)
            );
            this.Illll1Illl1lll111II1lIIl.get(i + 1).I111I1Il1I11 = lii1ii1lll1i1lll1llill11i11l$illi1l1l1x;
         }

         if (d0 > (double)this.l11lllI1l1lllI1) {
            floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1 = this.StringHolder_8(
               this.Illll1Illl1lll111II1lIIl.get(i).I111I1Il1I11, this.Illll1Illl1lll111II1lIIl.get(i - 1).I111I1Il1I11, (double)(this.l11lllI1l1lllI1 * 2.0F)
            );
            this.Illll1Illl1lll111II1lIIl.get(i + 1).I111I1Il1I11 = lii1ii1lll1i1lll1llill11i11l$illi1l1l1;
         }
      }
   }

   private void l1IIlI1ll1I1l1l1111l1() {
      booleanHolder$Helper_3 lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx = this.Illll1Illl1lll111II1lIIl.get(0);

      for (int i = 1; i < this.Illll1Illl1lll111II1lIIl.size(); i++) {
         booleanHolder$Helper_3 lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx = this.Illll1Illl1lll111II1lIIl.get(i);
         if (lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11.field_171 - lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11.field_171
            > 0.0F) {
            lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11.field_171 = lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11.field_171;
         }

         float f = (float)i / (float)this.Illll1Illl1lll111II1lIIl.size() * ((float)i / (float)this.Illll1Illl1lll111II1lIIl.size()) * 5.0F;
         float f1 = lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11.Ill1l1I1llllII11ll11III
            - lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11.Ill1l1I1llllII11ll11III;
         if (f1 > f) {
            lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11.Ill1l1I1llllII11ll11III = lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11
                  .Ill1l1I1llllII11ll11III
               - f;
         }

         if (f1 < -f) {
            lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11.Ill1l1I1llllII11ll11III = lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.I111I1Il1I11
                  .Ill1l1I1llllII11ll11III
               + f;
         }
      }
   }

   private floatHolder$EventTarget StringHolder_8(
      floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1,
      floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1,
      double d0
   ) {
      floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1x = lii1ii1lll1i1lll1llill11i11l$illi1l1l1xx.l11Illl1III11()
         .ZenithInternal095(lii1ii1lll1i1lll1llill11i11l$illi1l1l1x);
      lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.ZenithInternal056((float)d0).EventTarget(lii1ii1lll1i1lll1llill11i11l$illi1l1l1xx);
      return lii1ii1lll1i1lll1llill11i11l$illi1l1l1x;
   }

   private double StringHolder_8(
      floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1,
      floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1,
      floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1
   ) {
      float f = lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.field_171 - lii1ii1lll1i1lll1llill11i11l$illi1l1l1xx.field_171;
      float f1 = lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.field_172 - lii1ii1lll1i1lll1llill11i11l$illi1l1l1xx.field_172;
      float f2 = lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.field_171 - lii1ii1lll1i1lll1llill11i11l$illi1l1l1.field_171;
      float f3 = lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.field_172 - lii1ii1lll1i1lll1llill11i11l$illi1l1l1.field_172;
      float f4 = f * f2 + f1 * f3;
      float f5 = f * f3 - f1 * f2;
      double d0 = Math.atan2((double)f5, (double)f4);
      return d0 * 180.0 / Math.PI;
   }

   public void StringHolder_8(floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1) {
      this.I11I111ll = lii1ii1lll1i1lll1llill11i11l$illi1l1l1;
   }

   public float Ill1IIlI1lIlIIIl111l() {
      return this.I1IllI1l111I1l1lI11l;
   }

   public void ConstructorHolder(float f) {
      this.I1IllI1l111I1l1lI11l = f;
   }

   public boolean llI1Illl111I1II11II11I() {
      return this.II1lll1l1l1lII1l111;
   }

   public void GetSocketHandler(boolean flag) {
      this.II1lll1l1l1lII1l111 = flag;
   }

   public boolean lIlIIllI1I() {
      return this.II11IIlI1lIIl.isEmpty();
   }

   public void EventBus(floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1) {
      this.Illll1Illl1lll111II1lIIl.get(0).Il1llI11II1l.Event(this.Illll1Illl1lll111II1lIIl.get(0).I111I1Il1I11);
      this.Illll1Illl1lll111II1lIIl.get(0).I111I1Il1I11.EventTarget(lii1ii1lll1i1lll1llill11i11l$illi1l1l1);
   }

   public List<booleanHolder$Helper_3> IIII1II1IIll1I1l1l1111lII() {
      return this.Illll1Illl1lll111II1lIIl;
   }

   public static int IlIIl1lll1ll() {
      return 16;
   }
}
