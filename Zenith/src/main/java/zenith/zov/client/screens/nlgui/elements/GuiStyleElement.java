package zenith.zov.client.screens.nlgui.elements;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import zenith.ZenithInternal027;
import zenith.BooleanSetting;
import zenith.BindSetting;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ButtonSetting;
import zenith.ZenithInternal068;
import zenith.NumberSetting;
import zenith.MultiBooleanSetting;
import zenith.Setting;
import zenith.HeightHandler;
import zenith.StringSetting;
import zenith.GetStartTimeHandler;
import zenith.ModeSetting;
import zenith.ListSetting;
import zenith.ContainerSetting;
import zenith.ColorSetting;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.Element;
import zenith.zov.client.screens.nlgui.elements.api.GuiSetting;
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

public class GuiStyleElement extends Element {
   private static final float HEADER_HEIGHT = 23.0F;
   private static final int HEADER_SETTINGS_COUNT = 2;
   private final ZenithStyle style;
   private final GetStartTimeHandler animationEnable = new GetStartTimeHandler(200L, IReturn.ScreenImpl);
   private final GetStartTimeHandler expandedAnimation = new GetStartTimeHandler(200L, IReturn.ScreenImpl);
   private final GetStartTimeHandler animationPosX = new GetStartTimeHandler(150L, IReturn.ListHolder_8);
   private final GetStartTimeHandler animationPosY = new GetStartTimeHandler(150L, IReturn.ListHolder_8);
   private HeightHandler bounds;
   private boolean expanded;
   private boolean animated = false;
   private boolean positionInitialized = false;
   private float lastX;
   private float lastY;
   private int lastIndex;
   private final List<GuiSetting<?>> settings = new ArrayList<>();

   public GuiStyleElement(ZenithStyle zenithstyle) {
      this.style = zenithstyle;
      float f = this.getWidth() - (float)(GuiStyle.PADDING * 4);

      for (Setting l1i111illi1i1 : zenithstyle.getSettings()) {
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
      return this.style.getName();
   }

   @Override
   public float getHeight() {
      this.expandedAnimation.ZenithInternal101(this.expanded);
      float f = this.expandedAnimation.CloudFriendInfo();
      return 23.0F + this.getExpandedSettingsHeight() * f;
   }

   public boolean hasSettings() {
      return !this.settings.isEmpty() && this.settings.stream().anyMatch(GuiSetting::isVisible);
   }

   @Override
   public float getWidth() {
      return 178.0F;
   }

   public boolean isPriority() {
      return this.expandedAnimation.CloudFriendInfo() > 0.01F;
   }

   public boolean isEnable() {
      return ZenithClient.getInstance().floatHolder_3().getCurrentStyle() == this.style;
   }

   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      this.expandedAnimation.ZenithInternal101(this.expanded);
      float f5 = this.expandedAnimation.CloudFriendInfo();
      this.renderHeaderSettingsPriority(iiii1ilili1l1l1lilli1liliii, f, f1, f2, f3, f4);
      if (!(f5 <= 0.01F)) {
         float f6 = f3 + 23.0F;
         float f7 = this.getExpandedSettingsHeight() * f5;
         float f8 = f2 + (float)(GuiStyle.PADDING * 2);
         float f9 = f3 + 23.0F + (float)(GuiStyle.PADDING * 2);
         float f10 = (float)(GuiStyle.PADDING * 2);
         float f11 = (float)(MathHelper.lerp((double)this.animationEnable.CloudFriendInfo(), 0.5, 1.0) * (double)f4);

         for (int i = 2; i < this.settings.size(); i++) {
            GuiSetting guisetting = this.settings.get(i);
            if (guisetting.isVisible()) {
               float f12 = guisetting.getAnimHeight() + 6.0F * guisetting.getVisibleProgress();
               float f13 = MathHelper.clamp((f7 - f10) / Math.max(f12, 1.0E-4F), 0.0F, 1.0F);
               guisetting.renderPriority(iiii1ilili1l1l1lilli1liliii, f, f1, f8, f9, f4, f11);
               f9 += f12;
               f10 += f12;
            }
         }
      }
   }

   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, int i) {
      if (!this.positionInitialized) {
         this.animationPosX.EventTarget(f2);
         this.animationPosY.EventTarget(f3);
         this.lastX = f2;
         this.lastY = f3;
         this.positionInitialized = true;
         this.lastIndex = i;
      } else if ((f2 != this.lastX || f3 != this.lastY) && i != this.lastIndex) {
         this.animated = true;
         this.animationPosX.ZenithInternal095(f2);
         this.animationPosY.ZenithInternal095(f3);
         this.lastX = f2;
         this.lastY = f3;
      }

      if (this.animated) {
         f2 = this.animationPosX.StringHolder_8(f2);
         f3 = this.animationPosY.StringHolder_8(f3);
         if (this.animationPosX.ArrayListHolder() && this.animationPosY.ArrayListHolder()) {
            this.animated = false;
         }
      } else {
         this.animationPosX.EventTarget(f2);
         this.animationPosY.EventTarget(f3);
      }

      this.lastIndex = i;
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         this.expandedAnimation.ZenithInternal101(this.expanded);
         float f5 = this.expandedAnimation.CloudFriendInfo();
         this.bounds = new HeightHandler(f2, f3, this.getWidth(), 23.0F);
         this.animationEnable.ZenithInternal101(this.style == zenithstyle);
         float f6 = this.bounds.width();
         float f7 = this.getHeight();
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f2,
            f3,
            f6,
            f7,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getSurfaceDisableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f2,
            f3,
            f6,
            23.0F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getHeaderDisableBackground()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getSurfaceEnableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animationEnable.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         float f8 = 0.5F;
         float f9 = 2.0F;
         float f10 = 4.0F;
         iiii1ilili1l1l1lilli1liliii.ListHolder_6(f2 + f10, f3 + 23.0F - 2.0F, f2 + f6 - f10, f3 + 23.0F + 10.0F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f2,
            f3,
            f6,
            23.0F,
            0.15F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            ZenithInternal027.StringHolder_8(
               this.style.getPrimaryColor().HostnameVerifierImpl(f4),
               this.style.getPrimaryColor().HostnameVerifierImpl(f4),
               this.style.getSecondaryPrimaryColor().HostnameVerifierImpl(f4),
               this.style.getSecondaryPrimaryColor().HostnameVerifierImpl(f4)
            )
         );
         iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
         f10 = f2 + (float)(GuiStyle.PADDING * 2) + (float)MathHelper.lerp(this.animationEnable.CloudFriendInfo(), 0, 5 + GuiStyle.PADDING);
         Font font = Fonts.NEW_MEDIUM.getFont(6.0F);
         Font font1 = Fonts.NEW_ICONS.getFont(6.0F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            this.style.getName(),
            f10,
            f3 + (23.0F - font.height()) / 2.0F,
            zenithstyle.getTextSecondary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animationEnable.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            "`",
            f2 + (float)(GuiStyle.PADDING * 2),
            f3 + (23.0F - font1.height()) / 2.0F,
            ByteBufferHolder.lllIll11l1I11Il1II11II1I11
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animationEnable.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
         this.renderHeaderSettings(iiii1ilili1l1l1lilli1liliii, f, f1, f2, f3, f4);

         try {
            if (f5 <= 0.01F) {
               return;
            }

            float f11 = f3 + 23.0F;
            float f12 = this.getExpandedSettingsHeight() * f5;
            float f13 = f2 + (float)(GuiStyle.PADDING * 2);
            float f14 = f3 + 23.0F + (float)(GuiStyle.PADDING * 2);
            float f15 = (float)(GuiStyle.PADDING * 2);
            float f16 = (float)(MathHelper.lerp((double)this.animationEnable.CloudFriendInfo(), 0.5, 1.0) * (double)f4);
            iiii1ilili1l1l1lilli1liliii.ListHolder_6(f2, f11, f2 + f6, f11 + f12);

            for (int j = 2; j < this.settings.size(); j++) {
               GuiSetting guisetting = this.settings.get(j);
               if (guisetting.isVisible()) {
                  float f17 = guisetting.getAnimHeight() + 6.0F * guisetting.getVisibleProgress();
                  float f18 = MathHelper.clamp((f12 - f15) / Math.max(f17, 1.0E-4F), 0.0F, 1.0F);
                  if (f18 > 0.0F) {
                     guisetting.render(iiii1ilili1l1l1lilli1liliii, f, f1, f13, f14, f16 * f18);
                  }

                  f14 += f17;
                  f15 += f17;
               }
            }

            iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
         } catch (Exception exception) {
            exception.printStackTrace();
         }
      }
   }

   public boolean onMousePriorityClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      boolean flag = false;

      for (int i = 0; i < this.settings.size(); i++) {
         GuiSetting guisetting = this.settings.get(i);
         if (guisetting.isVisible() && guisetting.onMousePriorityClicked(d0, d1, ill1iili11ii1l)) {
            flag = true;
         }
      }

      return flag;
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (int i = Math.min(2, this.settings.size()) - 1; i >= 0; i--) {
         GuiSetting guisetting = this.settings.get(i);
         if (guisetting.isVisible() && guisetting.onMouseClicked(d0, d1, ill1iili11ii1l)) {
            return true;
         }
      }

      if (this.bounds != null && this.bounds.byteHolder(d0, d1)) {
         if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
            ZenithClient.getInstance().floatHolder_3().setCurrentStyle(this.style);
         } else if (ill1iili11ii1l == ZenithInternal068.lII1lI1lII1l) {
            this.expanded = !this.expanded;
         }

         return true;
      } else if (this.expandedAnimation.CloudFriendInfo() <= 0.01F) {
         return false;
      } else {
         for (int j = 2; j < this.settings.size(); j++) {
            GuiSetting guisetting1 = this.settings.get(j);
            if (guisetting1.isVisible() && guisetting1.onMouseClicked(d0, d1, ill1iili11ii1l)) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      for (int i = 0; i < Math.min(2, this.settings.size()); i++) {
         GuiSetting guisetting = this.settings.get(i);
         if (guisetting.isVisible() && guisetting.onMousePriorityScroll(d0, d1, d2, d3)) {
            return true;
         }
      }

      if (this.expandedAnimation.CloudFriendInfo() <= 0.01F) {
         return false;
      } else {
         boolean flag = false;

         for (int j = 2; j < this.settings.size(); j++) {
            GuiSetting guisetting1 = this.settings.get(j);
            if (guisetting1.isVisible() && guisetting1.onMousePriorityScroll(d0, d1, d2, d3)) {
               flag = true;
            }
         }

         return flag;
      }
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (int i = 0; i < Math.min(2, this.settings.size()); i++) {
         this.settings.get(i).onMouseReleased(d0, d1, ill1iili11ii1l);
      }

      if (this.expandedAnimation.CloudFriendInfo() <= 0.01F) {
         super.onMouseReleased(d0, d1, ill1iili11ii1l);
      } else {
         for (int j = 2; j < this.settings.size(); j++) {
            GuiSetting guisetting = this.settings.get(j);
            guisetting.onMouseReleased(d0, d1, ill1iili11ii1l);
         }

         super.onMouseReleased(d0, d1, ill1iili11ii1l);
      }
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      for (int l = 0; l < Math.min(2, this.settings.size()); l++) {
         GuiSetting guisetting = this.settings.get(l);
         if (guisetting.isVisible() && guisetting.keyPressed(i, j, k)) {
            return true;
         }
      }

      if (this.expandedAnimation.CloudFriendInfo() <= 0.01F) {
         return super.keyPressed(i, j, k);
      } else {
         for (int i1 = 2; i1 < this.settings.size(); i1++) {
            GuiSetting guisetting1 = this.settings.get(i1);
            if (guisetting1.isVisible() && guisetting1.keyPressed(i, j, k)) {
               return true;
            }
         }

         return super.keyPressed(i, j, k);
      }
   }

   @Override
   public boolean charTyped(char c0, int i) {
      for (int j = 0; j < Math.min(2, this.settings.size()); j++) {
         GuiSetting guisetting = this.settings.get(j);
         if (guisetting.isVisible() && guisetting.charTyped(c0, i)) {
            return true;
         }
      }

      if (this.expandedAnimation.CloudFriendInfo() <= 0.01F) {
         return super.charTyped(c0, i);
      } else {
         for (int k = 2; k < this.settings.size(); k++) {
            GuiSetting guisetting1 = this.settings.get(k);
            if (guisetting1.isVisible() && guisetting1.charTyped(c0, i)) {
               return true;
            }
         }

         return super.charTyped(c0, i);
      }
   }

   private float getExpandedSettingsHeight() {
      if (!this.hasSettings()) {
         return 0.0F;
      } else {
         float f = 0.0F;
         int i = 0;

         for (int j = 2; j < this.settings.size(); j++) {
            GuiSetting guisetting = this.settings.get(j);
            if (guisetting.isVisible()) {
               f += guisetting.getAnimHeight() + 6.0F * guisetting.getVisibleProgress();
               i++;
            }
         }

         return i == 0 ? 0.0F : (float)(GuiStyle.PADDING * 2) + f - 6.0F + (float)(GuiStyle.PADDING * 2);
      }
   }

   private void renderHeaderSettings(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      float f5 = f2 + (float)(GuiStyle.PADDING * 2);
      float f6 = f3 + (23.0F - this.settings.getFirst().getHeight()) / 2.0F;
      iiii1ilili1l1l1lilli1liliii.ListHolder_6(
         f2 + 150.0F, 0.0F, (float)MinecraftClient.getInstance().getWindow().getScaledWidth(), (float)MinecraftClient.getInstance().getWindow().getScaledHeight()
      );
      GuiSetting guisetting = this.settings.get(0);
      guisetting.render(iiii1ilili1l1l1lilli1liliii, f, f1, f5 - 10.0F, f6, f4);
      guisetting = this.settings.get(1);
      guisetting.render(iiii1ilili1l1l1lilli1liliii, f, f1, f5, f6, f4);
      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
   }

   private void renderHeaderSettingsPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      float f5 = (float)(MathHelper.lerp((double)this.animationEnable.CloudFriendInfo(), 0.5, 1.0) * (double)f4);
      float f6 = f2 + (float)(GuiStyle.PADDING * 2);
      float f7 = f3 + 8.0F;

      for (int i = 0; i < Math.min(2, this.settings.size()); i++) {
         GuiSetting guisetting = this.settings.get(i);
         if (guisetting.isVisible()) {
            guisetting.renderPriority(iiii1ilili1l1l1lilli1liliii, f, f1, f6, f7, f4, f5);
         }
      }
   }

   public ZenithStyle getStyle() {
      return this.style;
   }

   public void setPositionInitialized(boolean flag) {
      this.positionInitialized = flag;
   }
}
