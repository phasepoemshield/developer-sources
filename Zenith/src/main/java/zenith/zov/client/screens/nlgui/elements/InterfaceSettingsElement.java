package zenith.zov.client.screens.nlgui.elements;

import java.util.ArrayList;
import java.util.List;
import zenith.BooleanSetting;
import zenith.BindSetting;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.ByteBufferHolder;
import zenith.ButtonSetting;
import zenith.ZenithInternal068;
import zenith.NumberSetting;
import zenith.MultiBooleanSetting;
import zenith.Setting;
import zenith.HeightHandler;
import zenith.StringSetting;
import zenith.ModeSetting;
import zenith.Interface;
import zenith.ListSetting;
import zenith.ContainerSetting;
import zenith.ColorSetting;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.GuiSetting;
import zenith.zov.client.screens.nlgui.elements.api.InterfaceElement;
import zenith.zov.client.screens.nlgui.elements.setting.GuiBooleanSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiButtonSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiColorSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiItemSelectSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiKeySetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiModeSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiMultiBooleanSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiNumberSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiStringSetting;
import zenith.zov.client.screens.nlgui.elements.setting.GuiWindowSetting;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class InterfaceSettingsElement extends InterfaceElement {
   private final List<GuiSetting<?>> settings = new ArrayList<>();
   private HeightHandler bounds;

   public InterfaceSettingsElement() {
      float f = 352.0F;

      for (Setting l1i111illi1i1 : Interface.ll11lIl1IlIl1lI1.getSettings()) {
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
         } else if (l1i111illi1i1 instanceof ButtonSetting ililii11ll111ii1ll1iil1li11iil) {
            this.settings.add(new GuiButtonSetting(ililii11ll111ii1ll1iil1li11iil, f));
         } else if (l1i111illi1i1 instanceof ListSetting lilliii1illl) {
            this.settings.add(new GuiItemSelectSetting(lilliii1illl, f));
         } else if (l1i111illi1i1 instanceof BindSetting iii11ll1iiiiiill1lil) {
            this.settings.add(new GuiKeySetting(iii11ll1iiiiiill1lil, f));
         } else if (l1i111illi1i1 instanceof StringSetting li1il1ll1l1l11iii) {
            this.settings.add(new GuiStringSetting(li1il1ll1l1l11iii, f));
         } else if (l1i111illi1i1 instanceof ContainerSetting lliiii1iil1li) {
            this.settings.add(new GuiWindowSetting(lliiii1iil1li, f));
         }
      }
   }

   @Override
   public String getName() {
      return "";
   }

   @Override
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
                     + -6.0
                     + (double)(GuiStyle.PADDING * 2)
                  : 0.0
            )
      );
   }

   public boolean hasSettings() {
      return !this.settings.isEmpty() && this.settings.stream().anyMatch(GuiSetting::isVisible);
   }

   @Override
   public float getWidth() {
      return 368.0F;
   }

   @Override
   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      float f5 = f2 + (float)(GuiStyle.PADDING * 2);
      float f6 = f3 + 23.0F + (float)(GuiStyle.PADDING * 2);
      float f7 = f4;

      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible()) {
            guisetting.renderPriority(iiii1ilili1l1l1lilli1liliii, f, f1, f5, f6, f4, f7);
            f6 += guisetting.getAnimHeight() + 6.0F * guisetting.getVisibleProgress();
         }
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, int i) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         this.bounds = new HeightHandler(f2, f3, this.getWidth(), 23.0F);
         float f5 = this.bounds.width();
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
         float f7 = f2 + (float)(GuiStyle.PADDING * 2) + 5.0F + (float)GuiStyle.PADDING.intValue();
         Font font = Fonts.NEW_MEDIUM.getFont(6.0F);
         Font font1 = Fonts.NEW_ICONS.getFont(6.0F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            "Settings",
            f7,
            f3 + (23.0F - font.height()) / 2.0F,
            zenithstyle.getTextSecondary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), 1.0F)
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            "O",
            f2 + (float)(GuiStyle.PADDING * 2),
            f3 + (23.0F - font1.height()) / 2.0F,
            ByteBufferHolder.lllIll11l1I11Il1II11II1I11
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), 1.0F)
               .ZenithInternal039(f4)
         );

         try {
            float f8 = f2 + (float)(GuiStyle.PADDING * 2);
            float f9 = f3 + 23.0F + (float)(GuiStyle.PADDING * 2);

            for (GuiSetting guisetting : this.settings) {
               if (guisetting.isVisible()) {
                  guisetting.render(iiii1ilili1l1l1lilli1liliii, f, f1, f8, f9, f4);
                  f9 += guisetting.getAnimHeight() + 6.0F * guisetting.getVisibleProgress();
               }
            }
         } catch (Exception exception) {
            exception.printStackTrace();
         }
      }
   }

   @Override
   public boolean onMousePriorityClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      boolean flag = false;

      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible() && guisetting.onMousePriorityClicked(d0, d1, ill1iili11ii1l)) {
            flag = true;
         }
      }

      return flag;
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible() && guisetting.onMouseClicked(d0, d1, ill1iili11ii1l)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      boolean flag = false;

      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible() && guisetting.onMousePriorityScroll(d0, d1, d2, d3)) {
            flag = true;
         }
      }

      return flag;
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (GuiSetting guisetting : this.settings) {
         guisetting.onMouseReleased(d0, d1, ill1iili11ii1l);
      }

      super.onMouseReleased(d0, d1, ill1iili11ii1l);
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible() && guisetting.keyPressed(i, j, k)) {
            return true;
         }
      }

      return super.keyPressed(i, j, k);
   }

   @Override
   public boolean charTyped(char c0, int i) {
      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible() && guisetting.charTyped(c0, i)) {
            return true;
         }
      }

      return super.charTyped(c0, i);
   }
}
