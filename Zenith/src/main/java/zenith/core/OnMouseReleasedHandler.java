package zenith;

public abstract class OnMouseReleasedHandler implements ZenithInternal076 {
   // $VF: renamed from: x float
   protected float field_271;
   // $VF: renamed from: y float
   protected float field_272;
   protected float width;
   protected float height;

   protected OnMouseReleasedHandler(float f, float f1, float f2, float f3) {
      this.field_271 = f;
      this.field_272 = f1;
      this.width = f2;
      this.height = f3;
   }

   protected OnMouseReleasedHandler() {
      this(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public void EventBus(floatHolder_4 iiii1ilili1l1l1lilli1liliii) {
      this.ZenithInternal095(iiii1ilili1l1l1lilli1liliii);
      this.EventTarget(iiii1ilili1l1l1lilli1liliii);
   }

   protected abstract void EventTarget(floatHolder_4 iiii1ilili1l1l1lilli1liliii);

   public void I1l1lII1l111() {
   }

   public void ZenithInternal095(floatHolder_4 iiii1ilili1l1l1lilli1liliii) {
   }

   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
   }

   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
   }

   public void EventBus(int i, int j, int k) {
   }

   public boolean charTyped(char c0, int i) {
      return false;
   }

   public void EventBus(double d0, double d1, double d2, double d3) {
   }

   public void ZenithInternal021(float f, float f1) {
      this.field_271 = f;
      this.field_272 = f1;
   }

   public void longHolder_6(float f, float f1, float f2, float f3) {
      this.field_271 = f;
      this.field_272 = f1;
      this.width = f2;
      this.height = f3;
   }

   public boolean ZenithException_2(float f, float f1) {
      return ZenithInternal143.StringHolder_8(
         (double)this.field_271, (double)this.field_272, (double)this.width, (double)this.height, (double)f, (double)f1
      );
   }

   public boolean isHovered(double d0, double d1) {
      return ZenithInternal143.StringHolder_8((double)this.field_271, (double)this.field_272, (double)this.width, (double)this.height, d0, d1);
   }

   public boolean Event(floatHolder_4 iiii1ilili1l1l1lilli1liliii) {
      return this.ZenithException_2((float)iiii1ilili1l1l1lilli1liliii.l111IIlIl1l1(), (float)iiii1ilili1l1l1lilli1liliii.Ill1lI1III1());
   }

   public float getX() {
      return this.field_271;
   }

   public float getY() {
      return this.field_272;
   }

   public float getWidth() {
      return this.width;
   }

   public float getHeight() {
      return this.height;
   }

   public void setX(float f) {
      this.field_271 = f;
   }

   public void setY(float f) {
      this.field_272 = f;
   }

   public void setWidth(float f) {
      this.width = f;
   }

   public void setHeight(float f) {
      this.height = f;
   }
}
