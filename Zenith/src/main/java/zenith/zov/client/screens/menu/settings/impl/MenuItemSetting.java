package zenith.zov.client.screens.menu.settings.impl;

import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.GetHeightHandler;
import zenith.HeightHandler;
import zenith.ListSetting;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;
import zenith.zov.client.screens.menu.settings.impl.popup.MenuItemPopupSetting;

public class MenuItemSetting extends MenuSetting {
   private final ListSetting setting;
   private HeightHandler bounds;
   private GetHeightHandler boundsColor;

   public MenuItemSetting(ListSetting lilliii1illl) {
      this.setting = lilliii1illl;
      this.boundsColor = new GetHeightHandler(0.0F, 0.0F, 78.0F, 96.0F);
   }

   @Override
   public void render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f10,
      float f11,
      float f,
      float f1,
      float f2,
      float f12,
      float f13,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill2,
      SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      float f3 = 24.0F;
      float f4 = f + 8.0F;
      Font font = Fonts.MEDIUM.getFont(7.0F);
      Font font1 = Fonts.MEDIUM.getFont(6.0F);
      float f5 = f1 + (8.0F - font.height()) / 2.0F - 0.5F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, this.setting.getName(), f + 8.0F + 10.0F, f5, il1iliilli1l1iill1);
      float f6 = 6.0F;
      float f7 = f5 - 1.0F;
      Font font2 = Fonts.ICONS.getFont(6.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(Fonts.ICONS.getFont(6.0F), "V", f4 + 1.5F, f7 + 1.0F, il1iliilli1l1iill);
      float f8 = 8.0F;
      float f9 = f + f2 - f8 - 8.0F;
      iiii1ilili1l1l1lilli1liliii.EventBus(f9, f1, f8, f8, 0.2F, floatHolder_5.StringHolder_30(2.0F), il1iliilli1l1iill);
      this.bounds = new HeightHandler(f9, f1, f8, f8);
      this.boundsColor.setX(f9 + 20.0F);
      this.boundsColor.setY(f1 + f8 - this.boundsColor.getHeight() / 2.0F);
      this.boundsColor.setHeight(224.0F);
      this.boundsColor.setWidth(150.0F);
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.byteHolder(d0, d1)) {
         ZenithClient.getInstance()
            .TimerUtilHolder_2()
            .addPopupMenuSetting(new MenuItemPopupSetting(this.setting, this.boundsColor));
      }
   }

   @Override
   public float getWidth() {
      return 0.0F;
   }

   @Override
   public float getHeight() {
      return 8.0F;
   }

   @Override
   public boolean isVisible() {
      return true;
   }

   public ListSetting getSetting() {
      return this.setting;
   }
}
