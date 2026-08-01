package zenith.zov.client.screens.nlgui.elements.api;

import zenith.floatHolder_4;
import zenith.ZenithInternal068;

public abstract class InterfaceElement extends Element {
   @Override
   public abstract float getWidth();

   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
   }

   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, int i) {
   }

   public boolean onMousePriorityClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      return true;
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      return false;
   }

   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      return false;
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      super.onMouseReleased(d0, d1, ill1iili11ii1l);
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      return super.keyPressed(i, j, k);
   }

   @Override
   public boolean charTyped(char c0, int i) {
      return super.charTyped(c0, i);
   }
}
