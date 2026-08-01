package zenith.zov.client.screens.menu.elements.impl;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.List;
import zenith.StringHolder_3;
import zenith.BooleanSetting;
import zenith.BindSetting;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.Category;
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
import zenith.Module;
import zenith.ContainerSetting;
import zenith.ColorSetting;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.elements.api.AbstractMenuElement;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuBooleanSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuButtonSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuColorSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuItemSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuKeySetting;
import zenith.zov.client.screens.menu.settings.impl.MenuModeSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuSelectSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuSliderSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuStringSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuWindowSetting;

public class MenuModuleElement extends AbstractMenuElement {
   private final Module module;
   private final List<MenuSetting> settings = new ArrayList<>();
   private final GetStartTimeHandler animation;
   private final GetStartTimeHandler animationPosition;
   private final GetStartTimeHandler animationY;
   private HeightHandler bounds;
   private HeightHandler boundsBind;
   private boolean binding = false;
   private int lastColum = -1;
   boolean animated = false;

   public MenuModuleElement(Module ll111il1lliill11) {
      this.module = ll111il1lliill11;
      this.animation = new GetStartTimeHandler(200L, ll111il1lliill11.Spider() ? 1.0F : 0.0F, IReturn.ScreenImpl);
      this.animationPosition = new GetStartTimeHandler(150L, 1.0F, IReturn.ListHolder_8);
      this.animationY = new GetStartTimeHandler(150L, 1.0F, IReturn.ListHolder_8);

      for (Setting l1i111illi1i1 : ll111il1lliill11.getSettings()) {
         if (l1i111illi1i1 instanceof NumberSetting illil1lill1llll11) {
            this.settings.add(new MenuSliderSetting(illil1lill1llll11));
         } else if (l1i111illi1i1 instanceof ModeSetting liii11li1iliiiii1l1li) {
            this.settings.add(new MenuModeSetting(liii11li1iliiiii1l1li));
         } else if (l1i111illi1i1 instanceof MultiBooleanSetting l11i1111l1i) {
            this.settings.add(new MenuSelectSetting(l11i1111l1i));
         } else if (l1i111illi1i1 instanceof BooleanSetting ii1iiil1ll111iii11ii1illlii1) {
            this.settings.add(new MenuBooleanSetting(ii1iiil1ll111iii11ii1illlii1));
         } else if (l1i111illi1i1 instanceof ColorSetting llil11111111l1il1ii) {
            this.settings.add(new MenuColorSetting(llil11111111l1il1ii));
         } else if (l1i111illi1i1 instanceof ButtonSetting ililii11ll111ii1ll1iil1li11iil) {
            this.settings.add(new MenuButtonSetting(ililii11ll111ii1ll1iil1li11iil));
         } else if (l1i111illi1i1 instanceof ListSetting lilliii1illl) {
            this.settings.add(new MenuItemSetting(lilliii1illl));
         } else if (l1i111illi1i1 instanceof BindSetting iii11ll1iiiiiill1lil) {
            this.settings.add(new MenuKeySetting(iii11ll1iiiiiill1lil));
         } else if (l1i111illi1i1 instanceof StringSetting li1il1ll1l1l11iii) {
            this.settings.add(new MenuStringSetting(li1il1ll1l1l11iii));
         } else if (l1i111illi1i1 instanceof ContainerSetting lliiii1iil1li) {
            this.settings.add(new MenuWindowSetting(ll111il1lliill11, lliiii1iil1li));
         }
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, Font font, float f2, float f3, float f4, float f5, int i) {
      if (this.lastColum == -1) {
         this.lastColum = i;
      }

      if (this.lastColum != i) {
         this.animated = true;
         this.animationPosition.ZenithInternal095(f2);
         this.animationY.ZenithInternal095(f3);
         this.lastColum = i;
      }

      if (this.animated) {
         f2 = this.animationPosition.StringHolder_8(f2);
         f3 = this.animationY.StringHolder_8(f3);
         if (this.animationPosition.ArrayListHolder() && this.animationY.ArrayListHolder()) {
            this.animated = false;
         }
      } else {
         this.animationPosition.EventTarget(f2);
         this.animationY.EventTarget(f3);
      }

      this.animation.ZenithInternal095(this.module.Spider() ? 1.0F : 0.0F);
      this.animation.ArmorHud();
      float f6 = 22.0F;
      SetColorHandler_3 llliili1l1ii11i1lii1 = ZenithClient.getInstance().NotificationsHolder().IllIlIll11lIlI1();
      ByteBufferHolder il1iliilli1l1iill = llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f5);
      boolean flag = this.hasSettings();
      float f7 = this.getHeight();
      ByteBufferHolder il1iliilli1l1iill1 = llliili1l1ii11i1lii1.IIlIlIIIIlIII11lllI1IllIll1lII().ZenithInternal039(f5);
      this.bounds = new HeightHandler(f2, f3, f4, f6);
      if (flag) {
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f2, f3, f4, f7, floatHolder_5.StringHolder_30(8.0F), il1iliilli1l1iill1);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f2, f3, f4, f6, floatHolder_5.StringHolder_19(8.0F, 8.0F), il1iliilli1l1iill);
      } else {
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f2, f3, f4, f6, floatHolder_5.StringHolder_30(8.0F), il1iliilli1l1iill);
      }

      ByteBufferHolder il1iliilli1l1iill2 = llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
         .StringHolder_8(llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animation.CloudFriendInfo())
         .ZenithInternal039(f5);
      ByteBufferHolder il1iliilli1l1iill3 = llliili1l1ii11i1lii1.I111llllll1ll1l1Il()
         .StringHolder_8(llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl(), this.animation.CloudFriendInfo())
         .ZenithInternal039(f5);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(Fonts.ICONS.getFont(5.5F), "B", f2 + 8.0F, f3 + 9.0F, il1iliilli1l1iill2);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, this.module.getName(), f2 + 18.0F, f3 + 9.0F, il1iliilli1l1iill3);
      float f8 = 22.5F;
      float f9 = f2 + f4 - f8;
      ByteBufferHolder il1iliilli1l1iill4;
      if (this.isBinding()) {
         il1iliilli1l1iill4 = llliili1l1ii11i1lii1.l11II1lIlIIIlll11lIII();
      } else if (this.module.Elytramotion() != -1) {
         il1iliilli1l1iill4 = llliili1l1ii11i1lii1.l1l1lIIlI1l11()
            .StringHolder_8(llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animation.CloudFriendInfo())
            .ZenithInternal039(f5);
      } else {
         il1iliilli1l1iill4 = llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1().ZenithInternal039(f5);
      }

      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f9,
         f3,
         f8,
         f6,
         flag ? floatHolder_5.ZenithInternal149(8.0F) : new floatHolder_5(0.0F, 8.0F, 8.0F, 0.0F),
         il1iliilli1l1iill4
      );
      String s = "n/a";
      int j = this.module.Elytramotion();
      if (j != -1 && j != 0) {
         try {
            String s1 = StringHolder_3.doubleHolder_2(j);
            if (s1 != null && !s1.isBlank()) {
               s = s1.toUpperCase();
            }
         } catch (Exception exception) {
         }
      }

      Font font1 = Fonts.MEDIUM.getFont(7.0F);
      float f10 = f3 + (f6 - font1.height()) / 2.0F;
      float f11 = 2.0F;
      float f12 = f8 - f11 * 2.0F;
      float f13 = f9 + f11;
      ByteBufferHolder il1iliilli1l1iill5 = (j != -1
            ? llliili1l1ii11i1lii1.I111llllll1ll1l1Il()
               .StringHolder_8(llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl(), this.animation.CloudFriendInfo())
            : llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III())
         .ZenithInternal039(f5);
      this.boundsBind = new HeightHandler(f9, f3, f8, f6);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)f9 + 1, (int)f3, (int)(f9 + f8 - 2.0F), (int)(f3 + f6));
      this.drawScrollingText(iiii1ilili1l1l1lilli1liliii, font1, s, f13, f10, f12, il1iliilli1l1iill5);
      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      float f14 = 8.0F;
      float f15 = f3 + f6 + f14;
      ByteBufferHolder il1iliilli1l1iill6 = llliili1l1ii11i1lii1.l1l1lIIlI1l11()
         .StringHolder_8(llliili1l1ii11i1lii1.I111llllll1ll1l1Il(), this.animation.CloudFriendInfo())
         .ZenithInternal039(f5);

      for (MenuSetting menusetting : this.settings) {
         if (menusetting.isVisible()) {
            menusetting.render(
               iiii1ilili1l1l1lilli1liliii,
               f,
               f1,
               f2,
               f15,
               f4,
               f5,
               this.animation.CloudFriendInfo(),
               il1iliilli1l1iill2,
               il1iliilli1l1iill3,
               il1iliilli1l1iill6,
               llliili1l1ii11i1lii1
            );
            f15 += menusetting.getHeight() + 8.0F;
         }
      }

      if (flag) {
         floatHolder_8.EventTarget(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            f2,
            f3,
            f4,
            f7,
            -0.1F,
            floatHolder_5.StringHolder_30(8.0F),
            llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il().ZenithInternal039(f5)
         );
      } else {
         floatHolder_8.EventTarget(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            f2,
            f3,
            f4,
            f6,
            -0.1F,
            floatHolder_5.StringHolder_30(8.0F),
            llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il().ZenithInternal039(f5)
         );
      }
   }

   private void drawScrollingText(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, Font font, String s, float f, float f1, float f2, ByteBufferHolder il1iliilli1l1iill
   ) {
      float f3 = font.width(s);
      if (f3 <= f2) {
         float f11 = f + (f2 - f3) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s, f11, f1, il1iliilli1l1iill);
      } else {
         float f4 = f3 - f2;
         float f5 = 700.0F;
         float f6 = 1400.0F;
         float f7 = f5 + f6 + f5 + f6;
         long i = System.currentTimeMillis();
         float f8 = (float)(i % (long)f7);
         float f9;
         if (f8 < f5) {
            f9 = 0.0F;
         } else if (f8 < f5 + f6) {
            float f10 = (f8 - f5) / f6;
            f10 = f10 * f10 * (3.0F - 2.0F * f10);
            f9 = f10 * f4;
         } else if (f8 < f5 + f6 + f5) {
            f9 = f4;
         } else {
            float f12 = (f8 - f5 - f6 - f5) / f6;
            f12 = f12 * f12 * (3.0F - 2.0F * f12);
            f9 = f4 * (1.0F - f12);
         }

         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s, f - f9, f1, il1iliilli1l1iill);
      }
   }

   @Override
   public float getHeight() {
      return (float)(
         22.0
            + (
               this.hasSettings()
                  ? this.settings.stream().filter(MenuSetting::isVisible).mapToDouble(menusetting -> (double)(menusetting.getHeight() + 8.0F)).sum() + 8.0
                  : 0.0
            )
      );
   }

   public boolean hasSettings() {
      return !this.settings.isEmpty() && this.settings.stream().anyMatch(MenuSetting::isVisible);
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.byteHolder(d0, d1)) {
         if (ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() > 2 && this.binding) {
            this.binding = false;
            this.module.setKeyCode(ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll());
         }

         if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
            if (this.boundsBind != null && this.boundsBind.byteHolder(d0, d1)) {
               this.binding = !this.binding;
            } else {
               this.module.lI1Il11I1l1III11IIlI1lI1II11I();
            }
         } else if (ill1iili11ii1l == ZenithInternal068.l1lll1lIII1l11) {
            this.binding = !this.binding;
         }
      }

      for (MenuSetting menusetting : this.settings) {
         menusetting.onMouseClicked(d0, d1, ill1iili11ii1l);
      }
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      if (!this.binding) {
         boolean flag = false;

         for (MenuSetting menusetting : this.settings) {
            if (menusetting.keyPressed(i, j, k)) {
               flag = true;
            }
         }

         return flag;
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
   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      return true;
   }

   @Override
   public Category getCategory() {
      return this.module.getCategory();
   }

   @Override
   public String getName() {
      return this.module.getName();
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (MenuSetting menusetting : this.settings) {
         menusetting.onMouseReleased(d0, d1, ill1iili11ii1l);
      }
   }

   @Override
   public void onMouseDragged(double d0, double d1, ZenithInternal068 ill1iili11ii1l, double d2, double d3) {
   }

   @Override
   public boolean charTyped(char c0, int i) {
      for (MenuSetting menusetting : this.settings) {
         if (menusetting.charTyped(c0, i)) {
            return true;
         }
      }

      return super.charTyped(c0, i);
   }

   public Module getModule() {
      return this.module;
   }

   public boolean isBinding() {
      return this.binding;
   }
}
