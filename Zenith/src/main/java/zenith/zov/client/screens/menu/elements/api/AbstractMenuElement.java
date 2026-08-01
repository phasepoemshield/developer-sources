package zenith.zov.client.screens.menu.elements.api;

import zenith.floatHolder_4;
import zenith.Category;
import zenith.ZenithInternal068;
import zenith.zov.base.font.Font;

public abstract class AbstractMenuElement {
   public abstract void render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, Font font, float f2, float f3, float f4, float f5, int i
   );

   public abstract float getHeight();

   public abstract void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l);

   public abstract void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l);

   public abstract void onMouseDragged(double d0, double d1, ZenithInternal068 ill1iili11ii1l, double d2, double d3);

   public abstract boolean keyPressed(int i, int j, int k);

   public abstract boolean mouseScrolled(double d0, double d1, double d2, double d3);

   public abstract Category getCategory();

   public abstract String getName();

   public boolean charTyped(char c0, int i) {
      return false;
   }
}
