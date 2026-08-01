package zenith;

import net.minecraft.text.Text;
import net.minecraft.client.gui.screen.Screen;

public abstract class ScreenImpl extends Screen implements ZenithInternal076 {
   protected ScreenImpl() {
      super(Text.empty());
   }

   public abstract void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1);

   public final void render(net.minecraft.client.gui.DrawContext DrawContext, int i, int j, float f) {
      floatHolder_4 iiii1ilili1l1l1lilli1liliii = floatHolder_4.StringHolder_8(DrawContext, i, j, f);
      this.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j);
      super.render(DrawContext, i, j, f);
   }

   public final boolean mouseClicked(double d0, double d1, int i) {
      ZenithInternal068 ill1iili11ii1l = ZenithInternal068.StringHolder_24(i);
      this.onMouseClicked(d0, d1, ill1iili11ii1l);
      return super.mouseClicked(d0, d1, i);
   }

   public void tick() {
   }

   public final boolean mouseReleased(double d0, double d1, int i) {
      ZenithInternal068 ill1iili11ii1l = ZenithInternal068.StringHolder_24(i);
      this.onMouseReleased(d0, d1, ill1iili11ii1l);
      return super.mouseReleased(d0, d1, i);
   }

   public final boolean mouseDragged(double d0, double d1, int i, double d2, double d3) {
      ZenithInternal068 ill1iili11ii1l = ZenithInternal068.StringHolder_24(i);
      this.onMouseDragged(d0, d1, ill1iili11ii1l, d2, d3);
      return super.mouseDragged(d0, d1, i, d2, d3);
   }

   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
   }

   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
   }

   public void onMouseDragged(double d0, double d1, ZenithInternal068 ill1iili11ii1l, double d2, double d3) {
   }
}
