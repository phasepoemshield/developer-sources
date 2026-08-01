package zenith.zov.client.screens.nlgui.elements;

import java.util.ArrayList;
import java.util.List;
import zenith.BooleanSetting;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.ZenithInternal068;
import zenith.NumberSetting;
import zenith.MultiBooleanSetting;
import zenith.Setting;
import zenith.ModeSetting;
import zenith.ColorSetting;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.GuiSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiBooleanSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiColorSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiModeSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiMultiBooleanSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiNumberSetting;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class CosmeticSettingsElement {
   private final List<GuiSetting<?>> settings = new ArrayList<>();

   public CosmeticSettingsElement() {
      this.rebuild();
   }

   public void rebuild() {
      this.settings.clear();
      float f = 352.0F;
      ArrayList arraylist = new ArrayList();
      arraylist.addAll(ZenithClient.getInstance().ZenithInternal071().getSettings());
      arraylist.addAll(ZenithClient.getInstance().BlockPosHolder().getSettings());

      for (Setting l1i111illi1i1 : arraylist) {
         if (l1i111illi1i1 instanceof NumberSetting illil1lill1llll11) {
            this.settings.add(new GuiNumberSetting(illil1lill1llll11, f));
         } else if (l1i111illi1i1 instanceof ModeSetting liii11li1iliiiii1l1li) {
            this.settings.add(new GuiModeSetting(liii11li1iliiiii1l1li, f));
         } else if (l1i111illi1i1 instanceof MultiBooleanSetting l11i1111l1i) {
            this.settings.add(new GuiMultiBooleanSetting(l11i1111l1i, f));
         } else if (l1i111illi1i1 instanceof BooleanSetting ii1iiil1ll111iii11ii1illlii1) {
            this.settings.add(new GuiBooleanSetting(ii1iiil1ll111iii11ii1illlii1, f));
         } else if (l1i111illi1i1 instanceof ColorSetting llil11111111l1il1ii) {
            this.settings.add(new GuiColorSetting(llil11111111l1il1ii, f));
         }
      }
   }

   public float getHeight() {
      return (float)(
         23.0
            + (
               this.hasSettings()
                  ? (double)(GuiStyle.PADDING * 2)
                     + this.settings
                        .stream()
                        .filter(GuiSetting::isVisible)
                        .mapToDouble(guisetting -> (double)(guisetting.getAnimHeight() + 6.0F * guisetting.getVisibleProgress()))
                        .sum()
                     - 6.0
                     + (double)(GuiStyle.PADDING * 2)
                  : 0.0
            )
      );
   }

   public boolean hasSettings() {
      return !this.settings.isEmpty() && this.settings.stream().anyMatch(GuiSetting::isVisible);
   }

   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f5 = 368.0F;
         float f6 = this.getHeight();
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f2,
            f3,
            f5,
            f6,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getSurfaceDisableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f2,
            f3,
            f5,
            23.0F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getHeaderDisableBackground()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getSurfaceEnableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1(), 1.0F)
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         Font font = Fonts.NEW_MEDIUM.getFont(6.0F);
         Font font1 = Fonts.NEW_ICONS.getFont(6.0F);
         float f7 = f2 + (float)(GuiStyle.PADDING * 2) + font1.width("O") + (float)GuiStyle.PADDING.intValue();
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            "O",
            f2 + (float)(GuiStyle.PADDING * 2),
            f3 + (23.0F - font1.height()) / 2.0F,
            zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            "Global Settings",
            f7,
            f3 + (23.0F - font.height()) / 2.0F,
            zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         float f8 = f2 + (float)(GuiStyle.PADDING * 2);
         float f9 = f3 + 23.0F + (float)(GuiStyle.PADDING * 2);

         for (GuiSetting guisetting : this.settings) {
            if (guisetting.isVisible()) {
               guisetting.render(iiii1ilili1l1l1lilli1liliii, f, f1, f8, f9, f4);
               f9 += guisetting.getAnimHeight() + 6.0F * guisetting.getVisibleProgress();
            }
         }
      }
   }

   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      float f5 = f2 + (float)(GuiStyle.PADDING * 2);
      float f6 = f3 + 23.0F + (float)(GuiStyle.PADDING * 2);

      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible()) {
            guisetting.renderPriority(iiii1ilili1l1l1lilli1liliii, f, f1, f5, f6, f4, f4);
            f6 += guisetting.getAnimHeight() + 6.0F * guisetting.getVisibleProgress();
         }
      }
   }

   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible() && guisetting.onMouseClicked(d0, d1, ill1iili11ii1l)) {
            return true;
         }
      }

      return false;
   }

   public boolean onMousePriorityClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      boolean flag = false;

      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible() && guisetting.onMousePriorityClicked(d0, d1, ill1iili11ii1l)) {
            flag = true;
         }
      }

      return flag;
   }

   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (GuiSetting guisetting : this.settings) {
         guisetting.onMouseReleased(d0, d1, ill1iili11ii1l);
      }
   }

   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      boolean flag = false;

      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible() && guisetting.onMousePriorityScroll(d0, d1, d2, d3)) {
            flag = true;
         }
      }

      return flag;
   }

   public boolean keyPressed(int i, int j, int k) {
      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible() && guisetting.keyPressed(i, j, k)) {
            return true;
         }
      }

      return false;
   }

   public boolean charTyped(char c0, int i) {
      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible() && guisetting.charTyped(c0, i)) {
            return true;
         }
      }

      return false;
   }
}
