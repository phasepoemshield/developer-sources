package zenith.zov.client.screens.nlgui.elements.setting;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.List;
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
import zenith.floatHolder_8;
import zenith.HeightHandler;
import zenith.StringSetting;
import zenith.GetStartTimeHandler;
import zenith.ModeSetting;
import zenith.ListSetting;
import zenith.ContainerSetting;
import zenith.ColorSetting;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.GuiSetting;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiWindowSetting extends GuiSetting<ContainerSetting> {
   private final GetStartTimeHandler animationExpanded = new GetStartTimeHandler(200L, IReturn.ListHolder_8);
   private final List<GuiSetting<?>> renderableSettings = new ArrayList<>();
   private HeightHandler bounds;
   private HeightHandler rectBounds;
   private HeightHandler exitBounds;
   private boolean expanded;

   public GuiWindowSetting(ContainerSetting lliiii1iil1li) {
      this(lliiii1iil1li, 166.0F);
   }

   public GuiWindowSetting(ContainerSetting lliiii1iil1li, float f) {
      super(f, lliiii1iil1lix);
      f = 182.0F - (float)(GuiStyle.PADDING * 4);

      for (Setting l1i111illi1i1 : lliiii1iil1lix.getSettings()) {
         if (l1i111illi1i1 instanceof NumberSetting illil1lill1llll11) {
            this.renderableSettings.add(new GuiNumberSetting(illil1lill1llll11, f));
         } else if (l1i111illi1i1 instanceof ModeSetting liii11li1iliiiii1l1li) {
            this.renderableSettings.add(new GuiModeSetting(liii11li1iliiiii1l1li, f));
         } else if (l1i111illi1i1 instanceof MultiBooleanSetting l11i1111l1i) {
            this.renderableSettings.add(new GuiMultiBooleanSetting(l11i1111l1i, f));
         } else if (l1i111illi1i1 instanceof BooleanSetting ii1iiil1ll111iii11ii1illlii1) {
            this.renderableSettings.add(new GuiBooleanSetting(ii1iiil1ll111iii11ii1illlii1, f));
         } else if (l1i111illi1i1 instanceof ColorSetting llil11111111l1il1ii) {
            this.renderableSettings.add(new GuiColorSetting(llil11111111l1il1ii, f));
         } else if (l1i111illi1i1 instanceof ButtonSetting ililii11ll111ii1ll1iil1li11iil) {
            this.renderableSettings.add(new GuiButtonSetting(ililii11ll111ii1ll1iil1li11iil, f));
         } else if (l1i111illi1i1 instanceof ListSetting lilliii1illl) {
            this.renderableSettings.add(new GuiItemSelectSetting(lilliii1illl, f));
         } else if (l1i111illi1i1 instanceof BindSetting iii11ll1iiiiiill1lil) {
            this.renderableSettings.add(new GuiKeySetting(iii11ll1iiiiiill1lil, f));
         } else if (l1i111illi1i1 instanceof StringSetting li1il1ll1l1l11iii) {
            this.renderableSettings.add(new GuiStringSetting(li1il1ll1l1l11iii, f));
         } else if (l1i111illi1i1 instanceof ContainerSetting lliiii1iil1lix) {
            this.renderableSettings.add(new GuiWindowSetting(lliiii1iil1lix, f));
         }
      }
   }

   @Override
   public String getName() {
      return this.setting.getName();
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.byteHolder(d0, d1)) {
         if (this.animationExpanded.HootBar() == 0.0F) {
            this.expanded = true;
         } else {
            this.expanded = false;
         }

         return true;
      } else {
         return this.expanded;
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         this.animationVisible.ZenithInternal101(this.setting.isVisible());
         f4 *= this.animationVisible.CloudFriendInfo();
         Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
         Font font1 = Fonts.NEW_REGULAR.getFont(5.4F);
         float f5 = this.width / 1.4F - (float)GuiStyle.PADDING.intValue();
         ByteBufferHolder il1iliilli1l1iill = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         ByteBufferHolder il1iliilli1l1iill2 = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         this.drawDefault(
            iiii1ilili1l1l1lilli1liliii,
            f,
            f1,
            "t",
            this.setting.getName(),
            this.setting.llllIII11IIl1ll1llI1lII1I(),
            font,
            font1,
            f2,
            f3,
            f5,
            il1iliilli1l1iill,
            il1iliilli1l1iill1,
            il1iliilli1l1iill2
         );
         float f6 = 6.0F;
         float f7 = 6.0F;
         this.bounds = new HeightHandler(f2 + this.width - f6, f3 + (this.getHeight() - f7) / 2.0F, f6, f7);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            this.bounds.Il11lIlllI111I1l1111(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            f6,
            f7,
            floatHolder_5.StringHolder_30(1.0F),
            zenithstyle.getFieldSurfaceBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            this.bounds.Il11lIlllI111I1l1111(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            f6,
            f7,
            -0.5F,
            floatHolder_5.StringHolder_30(1.0F),
            zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         Font font2 = Fonts.NEW_ICONS.getFont(5.5F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2,
            "w",
            this.bounds.Il11lIlllI111I1l1111() + (f6 - font2.width("w")) / 2.0F,
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II() + (f7 - font2.height()) / 2.0F,
            zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
      }
   }

   @Override
   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f14, float f15, float f2, float f16) {
      this.animationExpanded.ZenithInternal101(this.expanded);
      if (!(this.animationExpanded.CloudFriendInfo() <= 0.0F)) {
         float f3 = (float)(GuiStyle.PADDING * 4) + this.getHeight();
         float f4 = (float)GuiStyle.PADDING.intValue();
         float f5 = 182.0F;
         float f6 = 0.0F;

         for (GuiSetting guisetting : this.renderableSettings) {
            if (guisetting.isVisible()) {
               f6 += guisetting.getAnimHeight() + 6.0F;
            }
         }

         if (f6 > 0.0F) {
            f6 -= 6.0F;
         }

         float f12 = f3 + f4 * 2.0F + f6;
         float f13 = this.bounds.Il11lIlllI111I1l1111() + (float)(GuiStyle.PADDING * 2);
         float f7 = this.bounds.I1II11l1I11Illl11IIl1l1lIl1II() - f12 / 2.0F;
         this.rectBounds = new HeightHandler(f13, f7, f5, f12);
         f2 *= this.animationExpanded.CloudFriendInfo();
         iiii1ilili1l1l1lilli1liliii.getMatrices().push();
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(this.bounds.Il11lIlllI111I1l1111(), this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(), 0.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices()
            .scale(this.animationExpanded.CloudFriendInfo(), this.animationExpanded.CloudFriendInfo(), 1.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-this.bounds.Il11lIlllI111I1l1111(), -this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(), 0.0F);
         ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
         if (zenithstyle != null) {
            floatHolder_8.EventImpl_24(
               iiii1ilili1l1l1lilli1liliii.getMatrices(),
               f13,
               f7,
               f5,
               f12,
               12.0F,
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f13,
               f7 + f3,
               f5,
               f12 - f3,
               floatHolder_5.ZenithInternal061((float)GuiStyle.ROUND.intValue() / 2.0F, (float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getPanelLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f13,
               f7,
               f5,
               f3,
               floatHolder_5.StringHolder_19((float)GuiStyle.ROUND.intValue() / 2.0F, (float)GuiStyle.ROUND.intValue() / 2.0F),
               zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            Font font = Fonts.NEW_ICONS.getFont(4.0F);
            float f8 = f13 + f5 - font.width("2") - f4 * 2.0F;
            float f9 = f7 + f4 + font.height();
            this.exitBounds = new HeightHandler(f8, f9, 5.0F, 5.0F);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font, "2", f8, f9, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
            );
            Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
            Font font2 = Fonts.NEW_MEDIUM.getFont(5.4F);
            Font font3 = Fonts.NEW_REGULAR.getFont(5.3F);
            ByteBufferHolder il1iliilli1l1iill = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2);
            ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2);
            ByteBufferHolder il1iliilli1l1iill2 = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2);
            this.drawDefault(
               iiii1ilili1l1l1lilli1liliii,
               f,
               f1,
               "w",
               this.setting.getName(),
               this.setting.llllIII11IIl1ll1llI1lII1I(),
               font2,
               font3,
               f13 + f4 * 2.0F,
               f7 + f4 * 2.0F,
               f5 / 2.0F,
               il1iliilli1l1iill,
               il1iliilli1l1iill1,
               il1iliilli1l1iill2
            );
            float f10 = f13 + f4 * 2.0F;
            float f11 = f7 + f3 + f4;

            for (GuiSetting guisetting1 : this.renderableSettings) {
               if (guisetting1.isVisible()) {
                  guisetting1.render(iiii1ilili1l1l1lilli1liliii, f, f1, f10, f11, f2);
                  f11 += guisetting1.getAnimHeight() + 6.0F;
               }
            }

            f11 = f7 + f3 + f4;

            for (GuiSetting guisetting2 : this.renderableSettings) {
               if (guisetting2.isVisible()) {
                  guisetting2.renderPriority(iiii1ilili1l1l1lilli1liliii, f, f1, f10, f11, f2, 1.0F);
                  f11 += guisetting2.getAnimHeight() + 6.0F;
               }
            }

            iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
         }
      }
   }

   @Override
   public boolean onMousePriorityClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.expanded && this.rectBounds != null) {
         boolean flag = false;

         for (GuiSetting guisetting : this.renderableSettings) {
            if (guisetting.isVisible() && guisetting.onMousePriorityClicked(d0, d1, ill1iili11ii1l)) {
               flag = true;
            }
         }

         if (flag) {
            return true;
         } else if (!this.rectBounds.byteHolder(d0, d1)) {
            this.expanded = false;
            return false;
         } else if (this.exitBounds != null && this.exitBounds.StringHolder_8(d0, d1, 2.0F)) {
            this.expanded = false;
            return true;
         } else {
            for (GuiSetting guisetting1 : this.renderableSettings) {
               if (guisetting1.isVisible() && guisetting1.onMouseClicked(d0, d1, ill1iili11ii1l)) {
                  System.out.println(guisetting1);
                  return true;
               }
            }

            return true;
         }
      } else if (this.expanded) {
         this.expanded = false;
         return false;
      } else {
         return false;
      }
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      for (GuiSetting guisetting : this.renderableSettings) {
         if (guisetting.isVisible() && guisetting.keyPressed(i, j, k)) {
            return true;
         }
      }

      return super.keyPressed(i, j, k);
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (GuiSetting guisetting : this.renderableSettings) {
         if (guisetting.isVisible()) {
            guisetting.onMouseReleased(d0, d1, ill1iili11ii1l);
         }
      }

      super.onMouseReleased(d0, d1, ill1iili11ii1l);
   }

   @Override
   public boolean onMousePriorityScroll(double d0, double d1, double d2, double d3) {
      if (!this.expanded) {
         return false;
      } else {
         this.expanded = false;

         for (GuiSetting guisetting : this.renderableSettings) {
            if (guisetting.isVisible() && guisetting.onMousePriorityScroll(d0, d1, d2, d3)) {
               return true;
            }
         }

         return false;
      }
   }

   public void setExpanded(boolean flag) {
      this.expanded = flag;
   }
}
