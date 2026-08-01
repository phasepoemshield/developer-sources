package zenith.zov.client.screens.menu.settings.impl;

import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.GetHeightHandler;
import zenith.HeightHandler;
import zenith.ColorSetting;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;
import zenith.zov.client.screens.menu.settings.impl.popup.MenuColorPopupSetting;

public class MenuColorSetting extends MenuSetting {
   private final ColorSetting setting;
   private HeightHandler bounds;
   private GetHeightHandler boundsColor;

   public MenuColorSetting(ColorSetting llil11111111l1il1ii) {
      this.setting = llil11111111l1il1ii;
      this.boundsColor = new GetHeightHandler(0.0F, 0.0F, 78.0F, 48.0F);
   }

   @Override
   public void render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f12,
      float f13,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill3,
      SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      float f5 = 24.0F;
      float f6 = f + 8.0F;
      Font font = Fonts.MEDIUM.getFont(7.0F);
      Font font1 = Fonts.MEDIUM.getFont(6.0F);
      float f7 = f1 + (8.0F - font.height()) / 2.0F - 0.5F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, this.setting.getName(), f + 8.0F + 10.0F, f7, il1iliilli1l1iill1);
      float f8 = 6.0F;
      float f9 = f7 - 1.0F;
      Font font2 = Fonts.ICONS.getFont(6.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(Fonts.ICONS.getFont(6.0F), "V", f6 + 1.5F, f9 + 1.0F, il1iliilli1l1iill);
      float f10 = 8.0F;
      float f11 = f + f2 - f10 - 8.0F;
      ByteBufferHolder il1iliilli1l1iill2 = llliili1l1ii11i1lii1.l1l1lIIlI1l11()
         .StringHolder_8(this.setting.l1IllIl1l1llIlI11I11Il1l1l1lI1(), f4)
         .ZenithInternal039(f3);
      iiii1ilili1l1l1lilli1liliii.EventBus(
         f11 - 0.8F, f1 - 0.8F, f10 + 1.6F, f10 + 1.6F, 0.1F, floatHolder_5.StringHolder_30(3.0F), il1iliilli1l1iill
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f11, f1, f10, f10, floatHolder_5.StringHolder_30(3.0F), il1iliilli1l1iill2);
      this.bounds = new HeightHandler(f11, f1, f10, f10);
      this.boundsColor.setX(f11 + 20.0F);
      this.boundsColor.setY(f1 + f10 - this.boundsColor.getHeight() / 2.0F);
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.byteHolder(d0, d1)) {
         ZenithClient.getInstance()
            .TimerUtilHolder_2()
            .addPopupMenuSetting(new MenuColorPopupSetting(this.boundsColor, this.setting));
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
      return this.setting.isVisible();
   }

   public ColorSetting getSetting() {
      return this.setting;
   }
}
