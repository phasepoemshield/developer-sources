package zenith.zov.client.screens.override.button;

import zenith.floatHolder_4;
import zenith.ZenithInternal068;
import zenith.GetHeightHandler;

public abstract class ButtonScreen {
   protected GetHeightHandler bounds;

   protected ButtonScreen(float f, float f1) {
      this.bounds = new GetHeightHandler(0.0F, 0.0F, f, f1);
   }

   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f2, float f3, float f, float f1) {
      this.bounds.setX(f);
      this.bounds.setY(f1);
   }

   public float getWidth() {
      return this.bounds.getWidth();
   }

   public float getHeight() {
      return this.bounds.getHeight();
   }

   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds.byteHolder(d0, d1)) {
         this.onClick(d0, d1, ill1iili11ii1l);
      }
   }

   public abstract void onClick(double d0, double d1, ZenithInternal068 ill1iili11ii1l);

   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
   }

   public void onMouseDragged(double d0, double d1, ZenithInternal068 ill1iili11ii1l, double d2, double d3) {
   }

   public boolean keyPressed(int i, int j, int k) {
      return false;
   }

   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      return false;
   }
}
