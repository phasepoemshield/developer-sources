package zenith.zov.client.screens.menu.settings.api;

import zenith.floatHolder_4;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.SetColorHandler_3;

public abstract class MenuSetting {
   protected float height;

   public abstract void render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      float f5,
      float f6,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill2,
      SetColorHandler_3 llliili1l1ii11i1lii1
   );

   public abstract void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l);

   public abstract float getWidth();

   public abstract float getHeight();

   public abstract boolean isVisible();

   public boolean keyPressed(int i, int j, int k) {
      return false;
   }

   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
   }

   public boolean charTyped(char c0, int i) {
      return false;
   }
}
