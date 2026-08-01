package zenith.zov.client.screens.nlgui.panel.api;

import java.util.List;
import zenith.floatHolder_4;
import zenith.ZenithInternal068;
import zenith.zov.client.screens.nlgui.elements.api.Element;

public abstract class ElementPanel extends Panel {
   public abstract void renderHeader(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, float f3);

   public abstract void close();

   public abstract List<? extends Element> getElements();

   public float getButtonWidth() {
      return 0.0F;
   }

   public void renderHeaderButtons(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, float f3, float f4) {
   }

   public boolean onHeaderButtonsClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      return false;
   }

   public boolean onMouseDragged(double d0, double d1, int i, double d2, double d3) {
      return false;
   }

   public boolean isRightDrawerOpen() {
      return false;
   }

   public void closeRightDrawer() {
   }

   public boolean isRender() {
      return false;
   }

   public void tick() {
   }

   public void renderRightPanel(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, float f3) {
   }
}
