package zenith.zov.client.screens.menu.settings.api;

import zenith.floatHolder_4;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.GetHeightHandler;
import zenith.GetStartTimeHandler;
import zenith.SetColorHandler_3;

public abstract class MenuPopupSetting extends MenuSetting {
   protected final GetHeightHandler bounds;
   protected GetStartTimeHandler animationScale = new GetStartTimeHandler(200L, 0.01F, IReturn.ListHolder_8);

   protected MenuPopupSetting(GetHeightHandler l1l1ii11lllll) {
      this.bounds = l1l1ii11lllll;
   }

   public abstract void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, SetColorHandler_3 llliili1l1ii11i1lii1);

   @Override
   public final void render(
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
   ) {
   }

   public abstract void onMouseDragged(double d0, double d1, ZenithInternal068 ill1iili11ii1l, double d2, double d3);

   @Override
   public abstract boolean charTyped(char c0, int i);

   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      return false;
   }

   public GetHeightHandler getBounds() {
      return this.bounds;
   }

   public GetStartTimeHandler getAnimationScale() {
      return this.animationScale;
   }
}
