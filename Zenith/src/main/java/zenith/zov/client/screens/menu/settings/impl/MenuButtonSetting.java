package zenith.zov.client.screens.menu.settings.impl;

import zenith.floatHolder_4;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ButtonSetting;
import zenith.ZenithInternal068;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;

public class MenuButtonSetting extends MenuSetting {
   private final ButtonSetting button;
   private final GetStartTimeHandler animHovered = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   HeightHandler bounds;

   public MenuButtonSetting(ButtonSetting ililii11ll111ii1ll1iil1li11iil) {
      this.button = ililii11ll111ii1ll1iil1li11iil;
   }

   @Override
   public void render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f4,
      float f5,
      float f,
      float f1,
      float f2,
      float f3,
      float f6,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill2,
      SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      this.bounds = new HeightHandler(f + 8.0F, f1, f2 - 16.0F, 16.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f + 8.0F, f1, f2 - 16.0F, 16.0F, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f3)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f + 8.0F, f1, f2 - 16.0F, 16.0F, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il().ZenithInternal039(f3)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         Fonts.MEDIUM.getFont(7.0F), this.button.getName(), f + (f2 - Fonts.MEDIUM.getWidth(this.button.getName(), 7.0F)) / 2.0F, f1 + 5.0F, il1iliilli1l1iill
      );
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.byteHolder(d0, d1) && ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         this.button.lI1Il11I1l1III11IIlI1lI1II11I();
      }
   }

   @Override
   public float getWidth() {
      return 0.0F;
   }

   @Override
   public float getHeight() {
      return 16.0F;
   }

   @Override
   public boolean isVisible() {
      return true;
   }
}
