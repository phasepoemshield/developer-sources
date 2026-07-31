package zenith;

public class floatHolder$EventTarget {
   // $VF: renamed from: x float
   public float field_171;
   // $VF: renamed from: y float
   public float field_172;
   public float Ill1l1I1llllII11ll11III;

   public floatHolder$EventTarget(float f, float f1, float f2) {
      this.field_171 = f;
      this.field_172 = f1;
      this.Ill1l1I1llllII11ll11III = f2;
   }

   public floatHolder$EventTarget EventTarget(floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1) {
      this.field_171 = this.field_171 + lii1ii1lll1i1lll1llill11i11l$illi1l1l1.field_171;
      this.field_172 = this.field_172 + lii1ii1lll1i1lll1llill11i11l$illi1l1l1.field_172;
      this.Ill1l1I1llllII11ll11III = this.Ill1l1I1llllII11ll11III + lii1ii1lll1i1lll1llill11i11l$illi1l1l1.Ill1l1I1llllII11ll11III;
      return this;
   }

   public floatHolder$EventTarget ZenithInternal095(floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1) {
      this.field_171 = this.field_171 - lii1ii1lll1i1lll1llill11i11l$illi1l1l1.field_171;
      this.field_172 = this.field_172 - lii1ii1lll1i1lll1llill11i11l$illi1l1l1.field_172;
      this.Ill1l1I1llllII11ll11III = this.Ill1l1I1llllII11ll11III - lii1ii1lll1i1lll1llill11i11l$illi1l1l1.Ill1l1I1llllII11ll11III;
      return this;
   }

   public floatHolder$EventTarget StringHolder_13(float f) {
      this.field_171 *= f;
      this.field_172 *= f;
      this.Ill1l1I1llllII11ll11III *= f;
      return this;
   }

   public floatHolder$EventTarget ZenithInternal072(float f) {
      this.field_171 /= f;
      this.field_172 /= f;
      this.Ill1l1I1llllII11ll11III /= f;
      return this;
   }

   public floatHolder$EventTarget l11Illl1III11() {
      return new floatHolder$EventTarget(this.field_171, this.field_172, this.Ill1l1I1llllII11ll11III);
   }

   public void Event(floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1) {
      this.field_171 = lii1ii1lll1i1lll1llill11i11l$illi1l1l1.field_171;
      this.field_172 = lii1ii1lll1i1lll1llill11i11l$illi1l1l1.field_172;
      this.Ill1l1I1llllII11ll11III = lii1ii1lll1i1lll1llill11i11l$illi1l1l1.Ill1l1I1llllII11ll11III;
   }

   public float lll11lIlI111111Ill1lll1Il() {
      return this.field_171 * this.field_171 + this.field_172 * this.field_172 + this.Ill1l1I1llllII11ll11III * this.Ill1l1I1llllII11ll11III;
   }

   public float I1l1l1lll1lI1lII() {
      return (float)Math.sqrt((double)this.lll11lIlI111111Ill1lll1Il());
   }

   public floatHolder$EventTarget l1IlIllI11l() {
      float f = this.I1l1l1lll1lI1lII();
      if (f > 1.0E-4F) {
         this.field_171 /= f;
         this.field_172 /= f;
         this.Ill1l1I1llllII11ll11III /= f;
      }

      return this;
   }

   public floatHolder$EventTarget ZenithInternal056(float f) {
      float f1 = (float)Math.toRadians((double)f);
      float f2 = (float)Math.cos((double)f1);
      float f3 = (float)Math.sin((double)f1);
      float f4 = this.field_171 * f2 - this.field_172 * f3;
      float f5 = this.field_171 * f3 + this.field_172 * f2;
      this.field_171 = f4;
      this.field_172 = f5;
      return this;
   }
}
