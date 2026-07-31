package zenith;

import zenith.hud.*;

class Predictions$EventBus {
   double l1I1l1lIlIl1l1IlI1l11l;
   double I1lllI11lI1I11Il1Il11I11;
   double III1ll11Il;
   double I1Il1I1lIl11;
   double lIlII1lIl1IIIl1l;
   double IlI1lII1I1Illl11llII1l1l111l;
   int lIIIlI1111lll11lI;
   long II1lI11IIllIIIlII11Il11;

   Predictions$EventBus(double d0, double d1, double d2, double d3, double d4, double d5, int i, long j) {
      this.l1I1l1lIlIl1l1IlI1l11l = d0;
      this.I1lllI11lI1I11Il1Il11I11 = d1;
      this.III1ll11Il = d2;
      this.I1Il1I1lIl11 = d3;
      this.lIlII1lIl1IIIl1l = d4;
      this.IlI1lII1I1Illl11llII1l1l111l = d5;
      this.lIIIlI1111lll11lI = i;
      this.II1lI11IIllIIIlII11Il11 = j;
   }

   void Coordinates() {
      this.l1I1l1lIlIl1l1IlI1l11l = this.l1I1l1lIlIl1l1IlI1l11l + this.I1Il1I1lIl11;
      this.I1lllI11lI1I11Il1Il11I11 = this.I1lllI11lI1I11Il1Il11I11 + this.lIlII1lIl1IIIl1l;
      this.III1ll11Il = this.III1ll11Il + this.IlI1lII1I1Illl11llII1l1l111l;
      this.lIlII1lIl1IIIl1l -= 0.002;
      this.I1Il1I1lIl11 *= 0.98;
      this.lIlII1lIl1IIIl1l *= 0.98;
      this.IlI1lII1I1Illl11llII1l1l111l *= 0.98;
   }
}
