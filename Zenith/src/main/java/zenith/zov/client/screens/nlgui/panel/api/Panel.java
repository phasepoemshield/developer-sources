package zenith.zov.client.screens.nlgui.panel.api;

import zenith.floatHolder_4;
import zenith.ZenithInternal068;
import zenith.ZenithInternal076;

public abstract class Panel implements ZenithInternal076 {
   public abstract void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2);

   public abstract boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l);

   public boolean keyPressed(int i, int j, int k) {
      return false;
   }

   public boolean onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      return false;
   }

   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      return false;
   }

   public boolean charTyped(char c0, int i) {
      return false;
   }
}
