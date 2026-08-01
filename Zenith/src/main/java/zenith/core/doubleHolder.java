package zenith;

import zenith.hud.*;

public class doubleHolder implements ZenithInternal076 {
   private double I1111ll1Illll1llI1;
   private double I11I11IlIl1 = 0.0;
   private double lIlIIIIlI1I1II11lIlI1I = 0.0;
   private double IIIlIllIlll1llll1III = 8.0;
   private static final double lIIlIIII11l1II1I11Il1llIIII1 = 0.4;
   public static final double l1l1l1l1l11IIll1I1l1IllIl = 1.0;

   public void Coordinates() {
      this.lIlIIIIlI1I1II11lIlI1I = Math.max(Math.min(this.lIlIIIIlI1I1II11lIlI1I, 0.0), -this.I1111ll1Illll1llI1);
      double d0 = this.lIlIIIIlI1I1II11lIlI1I - this.I11I11IlIl1;
      this.I11I11IlIl1 += d0 * 0.4;
      if (Math.abs(d0) < 0.1) {
         this.I11I11IlIl1 = this.lIlIIIIlI1I1II11lIlI1I;
      }
   }

   public double IIIlII1Il1l111lI1() {
      return -this.I11I11IlIl1;
   }

   public void ZenithInternal101(double d0) {
      this.lIlIIIIlI1I1II11lIlI1I = this.lIlIIIIlI1I1II11lIlI1I + d0 * this.IIIlIllIlll1llll1III;
   }

   public double l1IIlIIlI11lII1() {
      return this.I1111ll1Illll1llI1;
   }

   public double lIlIlIII1I11l11II11ll1() {
      return this.lIlIIIIlI1I1II11lIlI1I;
   }

   public double Il11I1Il1lI11lllll1I1I1l() {
      return this.IIIlIllIlll1llll1III;
   }

   public void ZenithInternal084(double d0) {
      this.I1111ll1Illll1llI1 = d0;
   }

   public void StringHolder_19(double d0) {
      this.I11I11IlIl1 = d0;
   }

   public void ZenithInternal061(double d0) {
      this.lIlIIIIlI1I1II11lIlI1I = d0;
   }

   public void FinishThread(double d0) {
      this.IIIlIllIlll1llll1III = d0;
   }
}
