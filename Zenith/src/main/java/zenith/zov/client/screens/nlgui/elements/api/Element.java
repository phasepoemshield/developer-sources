package zenith.zov.client.screens.nlgui.elements.api;

import zenith.ZenithInternal068;
import zenith.ZenithInternal076;

public abstract class Element implements ZenithInternal076 {
   public abstract boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l);

   public boolean keyPressed(int i, int j, int k) {
      return false;
   }

   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
   }

   public boolean charTyped(char c0, int i) {
      return false;
   }

   public abstract String getName();

   public boolean isVisible() {
      return true;
   }

   public abstract float getHeight();

   public abstract float getWidth();
}
