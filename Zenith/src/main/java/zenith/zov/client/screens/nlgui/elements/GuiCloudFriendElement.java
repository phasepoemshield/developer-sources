package zenith.zov.client.screens.nlgui.elements;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.math.MathHelper;
import zenith.GetSettingsHandler;
import zenith.BooleanSetting;
import zenith.BindSetting;
import zenith.floatHolder_4;
import zenith.floatHolder_5;
import zenith.ByteBufferHolder;
import zenith.ButtonSetting;
import zenith.ZenithInternal068;
import zenith.NumberSetting;
import zenith.MultiBooleanSetting;
import zenith.Setting;
import zenith.StringHolder_22;
import zenith.floatHolder_8;
import zenith.HeightHandler;
import zenith.StringSetting;
import zenith.ModeSetting;
import zenith.ListSetting;
import zenith.ContainerSetting;
import zenith.ColorSetting;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
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

public class GuiCloudFriendElement extends GuiFriendRowElement {
   private static final float ROW_STEP = 6.0F;
   private final GetSettingsHandler friend;
   private final List<GuiSetting<?>> settings = new ArrayList<>();

   public GuiCloudFriendElement(GetSettingsHandler i11ll1111lil11i) {
      this.friend = i11ll1111lil11i;
      float f = (float)(368 - GuiStyle.PADDING * 4);

      for (Setting l1i111illi1i1 : i11ll1111lil11i.getSettings()) {
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

   public boolean hasSettings() {
      return !this.settings.isEmpty() && this.settings.stream().anyMatch(GuiSetting::isVisible);
   }

   // $VF: renamed from: key () java.lang.String
   @Override
   public String getEnd() {
      return "cloud:" + this.friend.Autoexplosion();
   }

   @Override
   public boolean isCloud() {
      return true;
   }

   @Override
   public String getCloudUid() {
      return this.friend.Autoexplosion();
   }

   @Override
   public String getLocalName() {
      return null;
   }

   @Override
   public String getName() {
      StringHolder_22 l1liil1ili1iiii1lliii1l1li = this.friend.Reachv3();
      if (l1liil1ili1iiii1lliii1l1li != null) {
         String s = l1liil1ili1iiii1lliii1l1li.Containerhelper();
         if (s != null && !s.isBlank()) {
            return s;
         }
      }

      String s1 = this.friend.Autoswap();
      return s1 != null && !s1.isBlank() ? s1 : this.friend.Autoexplosion();
   }

   @Override
   public float getHeight() {
      if (!this.hasSettings()) {
         return 28.0F;
      } else {
         float f = (float)this.settings
            .stream()
            .filter(GuiSetting::isVisible)
            .mapToDouble(guisetting -> (double)(guisetting.getAnimHeight() + 6.0F * guisetting.getVisibleProgress()))
            .sum();
         return 28.0F + (float)GuiStyle.PADDING.intValue() * 2.0F + f - 6.0F + (float)GuiStyle.PADDING.intValue() * 2.0F;
      }
   }

   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      if (this.hasSettings()) {
         float f5 = this.updateVisible();
         float f6 = MathHelper.lerp(f5, 0.5F, 1.0F) * f4;
         float f7 = f2 + (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f8 = f3 + 28.0F + (float)GuiStyle.PADDING.intValue() * 2.0F;

         for (GuiSetting guisetting : this.settings) {
            if (guisetting.isVisible()) {
               guisetting.renderPriority(iiii1ilili1l1l1lilli1liliii, f, f1, f7, f8, f4, f6);
               f8 += guisetting.getAnimHeight() + 6.0F * guisetting.getVisibleProgress();
            }
         }
      }
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.byteHolder(d0, d1)) {
         for (GuiSetting guisetting : this.settings) {
            if (guisetting.isVisible() && guisetting.onMouseClicked(d0, d1, ill1iili11ii1l)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public boolean onMousePriorityClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible() && guisetting.onMousePriorityClicked(d0, d1, ill1iili11ii1l)) {
            return true;
         }
      }

      return false;
   }

   public boolean onMousePriorityScroll(double d0, double d1, double d2, double d3) {
      for (GuiSetting guisetting : this.settings) {
         if (guisetting.isVisible() && guisetting.onMousePriorityScroll(d0, d1, d2, d3)) {
            return true;
         }
      }

      return false;
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

   @Override
   public float render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, float f5, ZenithStyle zenithstyle
   ) {
      float f6 = this.updateVisible();
      if (f6 <= 0.02F) {
         this.setRemoveBounds(null);
         this.bounds = null;
         return 0.0F;
      } else {
         float f7 = f5 * f6;
         float f8 = this.getHeight();
         this.bounds = new HeightHandler(f2, f3, f4, f8);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f2,
            f3,
            f4,
            f8,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getSurfaceDisableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f5)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f2,
            f3,
            f4,
            28.0F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getSurfaceEnableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f5)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         String s = this.getName();
         float f9 = 13.0F;
         float f10 = f2 + (float)(GuiStyle.PADDING * 2);
         float f11 = f3 + (28.0F - f9) / 2.0F;
         floatHolder_8.EventBus(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            FriendSkinResolver.resolveSkin(s),
            f10,
            f11,
            f9,
            floatHolder_5.StringHolder_30(2.0F),
            ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f7)
         );
         Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
         Font font1 = Fonts.NEW_REGULAR.getFont(4.8F);
         Font font2 = Fonts.NEW_MEDIUM.getFont(5.0F);
         Font font3 = Fonts.NEW_ICONS.getFont(4.2F);
         float f12 = f10 + f9 + 4.0F;
         String s1 = "UID " + this.friend.Autoexplosion() + (this.friend.Reach() ? " | online" : " | offline");
         float f13 = font.height() + (float)GuiStyle.PADDING.intValue() / 2.0F + font1.height();
         float f14 = f11 + (f9 - f13) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font, s, f12, f14 - 0.5F, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f7)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            s1,
            f12,
            f14 + font.height() + (float)GuiStyle.PADDING.intValue() / 2.0F,
            zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f7)
         );
         String s2 = this.friend.Autototem();
         if (s2 != null && !s2.isEmpty() && s2.equals("ALPHA")) {
            float f15 = f12 + font.width(s) + (float)GuiStyle.PADDING.intValue() / 2.0F;
            float f17 = font3.width("X");
            float f18 = f17 + (float)GuiStyle.PADDING.intValue() / 2.0F + font.width("Alpha");
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f15,
               f11,
               f18 + (float)GuiStyle.PADDING.intValue(),
               6.5F,
               floatHolder_5.StringHolder_30(1.0F),
               zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f7 * 0.16F)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font3,
               "X",
               f15 + (float)GuiStyle.PADDING.intValue() / 2.0F,
               f11 + (6.5F - font3.height()) / 2.0F,
               zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f7)
            );
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font,
               "Alpha",
               f15 + f17 + (float)GuiStyle.PADDING.intValue() / 2.0F,
               f11 + (6.5F - font.height()) / 2.0F - 0.15F,
               zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f7)
            );
         }

         float f24 = font3.width("[") + (float)GuiStyle.PADDING.intValue() / 2.0F + font2.width("Remove");
         float f16 = f2 + f4 - f24 - (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f25 = f3 + (28.0F - font2.height()) / 2.0F;
         HeightHandler li1il11i1iilii1iiili111li11 = new HeightHandler(f16, f25, f24, 13.0F);
         this.setRemoveBounds(li1il11i1iilii1iiili111li11);
         float f19 = this.getRemoveHoverAnimation().StringHolder_8(li1il11i1iilii1iiili111li11.byteHolder((double)f, (double)f1) ? 1.0F : 0.0F);
         float f20 = f16 + font3.width("[") + (float)GuiStyle.PADDING.intValue() / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font3,
            "[",
            f16,
            f3 + (28.0F - font3.height()) / 2.0F,
            zenithstyle.getTextTertiary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f19)
               .ZenithInternal039(f7)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2, "Remove", f20, f25, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f7)
         );
         if (this.hasSettings()) {
            float f21 = f2 + (float)GuiStyle.PADDING.intValue() * 2.0F;
            float f22 = f3 + 28.0F + (float)GuiStyle.PADDING.intValue() * 2.0F;
            float f23 = f7;

            try {
               for (GuiSetting guisetting : this.settings) {
                  if (guisetting.isVisible()) {
                     guisetting.render(iiii1ilili1l1l1lilli1liliii, f, f1, f21, f22, f23);
                     f22 += guisetting.getAnimHeight() + 6.0F * guisetting.getVisibleProgress();
                  }
               }
            } catch (Exception exception) {
               exception.printStackTrace();
            }
         }

         return f6;
      }
   }
}
