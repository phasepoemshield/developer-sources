package zenith.zov.client.screens.nlgui.elements;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.math.MathHelper;
import zenith.StringHolder_3;
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
import zenith.Module;
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

public class GuiModuleElement extends Element {
   private final Module module;
   private final GetStartTimeHandler animationEnable = new GetStartTimeHandler(200L, IReturn.ScreenImpl);
   private final GetStartTimeHandler heartAnimation = new GetStartTimeHandler(300L, IReturn.ScreenImpl);
   private final GetStartTimeHandler bindAnimation = new GetStartTimeHandler(300L, IReturn.ScreenImpl);
   private float animationPosX = 0.0F;
   private float animationPosY = 0.0F;
   private HeightHandler bounds;
   private HeightHandler heartBounds;
   private HeightHandler bindBounds;
   private boolean binding;
   private boolean animated = false;
   private boolean positionInitialized = false;
   private float lastX;
   private float lastY;
   private int lastIndex;
   private final List<GuiSetting<?>> settings = new ArrayList<>();

   public Module getModule() {
      return this.module;
   }

   public void setPositionInitialized(boolean flag) {
      this.positionInitialized = flag;
   }

   @Override
   public String getName() {
      return this.module.getName();
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
      return 182.0F;
   }

   public boolean isPriority() {
      return this.module.isPriority();
   }

   public boolean isEnable() {
      return this.module.Spider();
   }

   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      float f5 = f2 + (float)(GuiStyle.PADDING * 2);
      float f6 = f3 + 23.0F + (float)(GuiStyle.PADDING * 2);
      float f7 = (float)(MathHelper.lerp((double)this.animationEnable.CloudFriendInfo(), 0.5, 1.0) * (double)f4);
      float f8 = 6.0F;

      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible()) {
            guisetting.renderPriority(iiii1ilili1l1l1lilli1liliii, f, f1, f5, f6, f4, f7);
            f6 += guisetting.getAnimHeight() + f8 * guisetting.getVisibleProgress();
         }
      }
   }

   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, int i) {
      if (!this.positionInitialized) {
         this.animationPosX = f2;
         this.animationPosY = f3;
         this.lastX = f2;
         this.lastY = f3;
         this.positionInitialized = true;
         this.lastIndex = i;
      } else if ((f2 != this.lastX || f3 != this.lastY) && i != this.lastIndex) {
         this.animated = true;
         this.lastX = f2;
         this.lastY = f3;
      }

      if (this.animated) {
         this.animationPosX = (float)Math.round(MathHelper.lerp(0.4F, this.animationPosX, f2));
         this.animationPosY = (float)Math.round(MathHelper.lerp(0.4F, this.animationPosY, f3));
         if (Math.abs(this.animationPosX - f2) < 2.0F && Math.abs(this.animationPosY - f3) < 2.0F) {
            this.animated = false;
         } else {
            f2 = this.animationPosX;
            f3 = this.animationPosY;
         }
      } else {
         this.animationPosX = f2;
         this.animationPosY = f3;
      }

      this.lastIndex = i;
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         this.bounds = new HeightHandler(f2, f3, this.getWidth(), 23.0F);
         this.animationEnable.ZenithInternal101(this.module.Spider());
         float f5 = this.bounds.width();
         float f6 = this.getHeight();
         float f7 = this.animationEnable.CloudFriendInfo();
         float f8 = f3 + (float)(GuiStyle.PADDING * 2);
         float f9 = (float)MathHelper.lerp(f7, 0, 5 + GuiStyle.PADDING);
         ByteBufferHolder il1iliilli1l1iill = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1();
         ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1();
         ByteBufferHolder il1iliilli1l1iill2 = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1();
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
               .StringHolder_8(zenithstyle.getSurfaceEnableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f7)
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         float f10 = f2 + (float)(GuiStyle.PADDING * 2) + f9;
         Font font = Fonts.NEW_MEDIUM.getFont(6.0F);
         Font font1 = Fonts.NEW_ICONS.getFont(6.0F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            this.module.getName(),
            f10,
            f3 + (23.0F - font.height()) / 2.0F,
            il1iliilli1l1iill1.StringHolder_8(il1iliilli1l1iill2, f7).ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            "O",
            f2 + (float)(GuiStyle.PADDING * 2),
            f3 + (23.0F - font1.height()) / 2.0F,
            ByteBufferHolder.lllIll11l1I11Il1II11II1I11.StringHolder_8(il1iliilli1l1iill, f7).ZenithInternal039(f4)
         );
         float f11 = 12.0F;
         float f12 = 7.0F;
         float f13 = f2 + f5 - (float)(GuiStyle.PADDING * 2) - f11;
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f13,
            f8,
            f11,
            f12,
            floatHolder_5.StringHolder_30(2.5F),
            zenithstyle.getDisableActiveBg().l1IllIl1l1llIlI11I11Il1l1l1lI1().StringHolder_8(il1iliilli1l1iill, f7).ZenithInternal039(f4)
         );
         float f14 = MathHelper.lerp(this.animationEnable.CloudFriendInfo(), 1.0F, f11 - 1.0F - 5.0F);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f13 + f14,
            f8 + 1.0F,
            5.0F,
            5.0F,
            floatHolder_5.StringHolder_30(1.5F),
            zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().StringHolder_8(il1iliilli1l1iill2, f7).ZenithInternal039(f4)
         );
         this.heartAnimation.ZenithInternal101(this.module.isPriority());
         f14 = f13 - (float)GuiStyle.PADDING.intValue() - 7.0F;
         this.heartBounds = new HeightHandler(f14, f8, 7.0F, f12);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f14,
            f8,
            7.0F,
            f12,
            floatHolder_5.StringHolder_30(1.5F),
            zenithstyle.getDisableActiveBg()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getHeartActiveBg().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.heartAnimation.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         Font font3 = Fonts.NEW_ICONS.getFont(4.5F);
         Font font4 = Fonts.NEW_ICONS.getFont(5.2F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font4,
            "U",
            f14 + 1.6F - 0.8F,
            f8 + 1.7F - 0.8F,
            ByteBufferHolder.lllIll11l1I11Il1II11II1I11
               .StringHolder_8(zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1(), 1.0F - this.heartAnimation.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font3,
            "V",
            f14 + 1.7F - 0.8F,
            f8 + 1.9F - 0.8F,
            ByteBufferHolder.lllIll11l1I11Il1II11II1I11
               .StringHolder_8(zenithstyle.getHeartIcon().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.heartAnimation.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
         String s = this.getBindText();
         this.bindAnimation.ZenithInternal101(this.binding || this.module.Elytramotion() != -1);
         Font font2 = Fonts.NEW_MEDIUM.getFont(4.5F);
         font3 = Fonts.NEW_ICONS.getFont(4.2F);
         float f19 = font2.width(s);
         float f15 = (float)GuiStyle.PADDING.intValue() / 2.0F
            + f19
            + (float)GuiStyle.PADDING.intValue() / 3.0F
            + 3.75F
            + (float)GuiStyle.PADDING.intValue() / 2.0F;
         float f16 = f13 - (float)GuiStyle.PADDING.intValue() - 7.0F - (float)GuiStyle.PADDING.intValue() / 2.0F - f15;
         this.bindBounds = new HeightHandler(f16, f8, f15, f12);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f16,
            f8,
            f15,
            f12,
            floatHolder_5.StringHolder_30(1.5F),
            zenithstyle.getDisableActiveBg()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(il1iliilli1l1iill.ZenithInternal039(0.15F), this.bindAnimation.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2,
            s,
            f16 + (float)GuiStyle.PADDING.intValue() / 2.0F,
            f8 + (f12 - font2.height()) / 2.0F,
            zenithstyle.getTextTertiary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(il1iliilli1l1iill, this.bindAnimation.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font3,
            "N",
            f16 + (float)GuiStyle.PADDING.intValue() / 2.0F + f19 + (float)GuiStyle.PADDING.intValue() / 3.0F,
            f8 + (float)GuiStyle.PADDING.intValue() / 2.0F,
            zenithstyle.getTextTertiary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(il1iliilli1l1iill, this.bindAnimation.CloudFriendInfo())
               .ZenithInternal039(f4)
         );

         try {
            f14 = f2 + (float)(GuiStyle.PADDING * 2);
            float f17 = f3 + 23.0F + (float)(GuiStyle.PADDING * 2);
            float f18 = (float)(MathHelper.lerp((double)this.animationEnable.CloudFriendInfo(), 0.5, 1.0) * (double)f4);
            float f20 = 6.0F;

            for (GuiSetting guisetting : this.settings) {
               if (guisetting.isVisible()) {
                  guisetting.render(iiii1ilili1l1l1lilli1liliii, f, f1, f14, f17, f18);
                  f17 += guisetting.getAnimHeight() + f20 * guisetting.getVisibleProgress();
               }
            }
         } catch (Exception exception) {
            exception.printStackTrace();
         }
      }
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

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.heartBounds != null && this.heartBounds.byteHolder(d0, d1)) {
         this.module.StringHolder_12(!this.module.isPriority());
         return true;
      } else if (this.bindBounds != null && this.bindBounds.byteHolder(d0, d1)) {
         this.binding = true;
         return true;
      } else if (this.binding && ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() > 2) {
         this.module.setKeyCode(ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll());
         this.binding = false;
         return true;
      } else if (this.bounds != null && this.bounds.byteHolder(d0, d1)) {
         if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl || ill1iili11ii1l == ZenithInternal068.lII1lI1lII1l) {
            this.module.lI1Il11I1l1III11IIlI1lI1II11I();
         } else if (ill1iili11ii1l == ZenithInternal068.l1lll1lIII1l11) {
            this.binding = true;
         }

         return true;
      } else {
         for (GuiSetting guisetting : this.settings) {
            if (guisetting.isVisible() && guisetting.onMouseClicked(d0, d1, ill1iili11ii1l)) {
               return true;
            }
         }

         return false;
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

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (GuiSetting guisetting : this.settings) {
         guisetting.onMouseReleased(d0, d1, ill1iili11ii1l);
      }

      super.onMouseReleased(d0, d1, ill1iili11ii1l);
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      if (!this.binding) {
         for (GuiSetting guisetting : this.settings) {
            if (guisetting.isVisible() && guisetting.keyPressed(i, j, k)) {
               return true;
            }
         }

         return super.keyPressed(i, j, k);
      } else {
         if (i != 256 && i != 261 && i != 259) {
            this.module.setKeyCode(i);
         } else {
            this.module.setKeyCode(-1);
         }

         this.binding = false;
         return true;
      }
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

   private String getBindText() {
      if (this.binding) {
         return this.getBindingDots();
      } else {
         String s = "n/a";
         int i = this.module.Elytramotion();
         if (i != -1 && i != 0) {
            try {
               String s1 = StringHolder_3.doubleHolder_2(i);
               if (s1 != null && !s1.isBlank()) {
                  s = s1.toUpperCase();
               }
            } catch (Exception exception) {
            }
         }

         return s;
      }
   }

   private String getBindingDots() {
      int i = (int)(System.currentTimeMillis() / 500L % 3L);
      if (i == 0) {
         return ".";
      } else {
         return i == 1 ? ".." : "...";
      }
   }

   public GuiModuleElement(Module ll111il1lliill11) {
      this.module = ll111il1lliill11;
      if (ll111il1lliill11.Spider()) {
         this.animationEnable.EventBus(1.0F);
      }

      if (ll111il1lliill11.isPriority()) {
         this.heartAnimation.EventBus(1.0F);
      }

      if (ll111il1lliill11.l1ll1I1lll11l1llIlIlIIIlI11I()) {
         for (Setting l1i111illi1i1 : ll111il1lliill11.getSettings()) {
            if (l1i111illi1i1 instanceof NumberSetting illil1lill1llll11) {
               this.settings.add(new GuiNumberSetting(illil1lill1llll11));
            } else if (l1i111illi1i1 instanceof ModeSetting liii11li1iliiiii1l1li) {
               this.settings.add(new GuiModeSetting(liii11li1iliiiii1l1li));
            } else if (l1i111illi1i1 instanceof MultiBooleanSetting l11i1111l1i) {
               this.settings.add(new GuiMultiBooleanSetting(l11i1111l1i));
            } else if (l1i111illi1i1 instanceof BooleanSetting ii1iiil1ll111iii11ii1illlii1) {
               this.settings.add(new GuiBooleanSetting(ii1iiil1ll111iii11ii1illlii1));
            } else if (l1i111illi1i1 instanceof ColorSetting llil11111111l1il1ii) {
               this.settings.add(new GuiColorSetting(llil11111111l1il1ii));
            } else if (l1i111illi1i1 instanceof ButtonSetting ililii11ll111ii1ll1iil1li11iil) {
               this.settings.add(new GuiButtonSetting(ililii11ll111ii1ll1iil1li11iil));
            } else if (l1i111illi1i1 instanceof ListSetting lilliii1illl) {
               this.settings.add(new GuiItemSelectSetting(lilliii1illl));
            } else if (l1i111illi1i1 instanceof BindSetting iii11ll1iiiiiill1lil) {
               this.settings.add(new GuiKeySetting(iii11ll1iiiiiill1lil));
            } else if (l1i111illi1i1 instanceof StringSetting li1il1ll1l1l11iii) {
               this.settings.add(new GuiStringSetting(li1il1ll1l1l11iii));
            } else if (l1i111illi1i1 instanceof ContainerSetting lliiii1iil1li) {
               this.settings.add(new GuiWindowSetting(lliiii1iil1li));
            }
         }
      }
   }
}
