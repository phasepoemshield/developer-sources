package zenith.zov.client.screens.menu.elements.impl;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.Category;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ButtonSetting;
import zenith.ZenithInternal068;
import zenith.floatHolder_8;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.ColorSetting;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.elements.api.AbstractMenuElement;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuButtonSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuColorSetting;

public class MenuCustomThemeElement extends AbstractMenuElement {
   private final ColorSetting color;
   private final ColorSetting secondColor;
   private final ColorSetting glowColor1;
   private final ColorSetting glowColor2;
   private final ColorSetting friendColor;
   private final ColorSetting gray;
   private final ColorSetting grayLight;
   private final ColorSetting foregroundLight;
   private final ColorSetting whiteGray;
   private final ColorSetting foregroundGray;
   private final ColorSetting foregroundLightStroke;
   private final ColorSetting foregroundColor;
   private final ColorSetting foregroundStroke;
   private final ColorSetting foregroundDark;
   private final ColorSetting white;
   private final ColorSetting backgroundColor;
   private final MenuButtonSetting button;
   private final List<MenuSetting> settings = new ArrayList<>();
   private final SetColorHandler_3 theme;
   private final GetStartTimeHandler animation;
   private final GetStartTimeHandler animationPosition;
   private final GetStartTimeHandler animationY;
   private HeightHandler bounds;
   private int lastColum = -1;
   boolean animated = false;

   public MenuCustomThemeElement(SetColorHandler_3 llliili1l1ii11i1lii1) {
      this.theme = llliili1l1ii11i1lii1;
      this.animation = new GetStartTimeHandler(
         200L,
         ZenithClient.getInstance().NotificationsHolder().EventBus(llliili1l1ii11i1lii1) ? 1.0F : 0.0F,
         IReturn.ScreenImpl
      );
      this.animationPosition = new GetStartTimeHandler(150L, 1.0F, IReturn.ListHolder_8);
      this.animationY = new GetStartTimeHandler(150L, 1.0F, IReturn.ListHolder_8);
      this.color = new ColorSetting(
         "theme.color",
         llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(),
         SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::l1IllIl1l1llIlI11I11Il1l1l1lI1
      );
      this.secondColor = new ColorSetting(
         "theme.secondColor", llliili1l1ii11i1lii1.l11II1lIlIIIlll11lIII(), SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::l11II1lIlIIIlll11lIII
      );
      this.glowColor1 = new ColorSetting(
         "theme.glowColor1", llliili1l1ii11i1lii1.IlI1I11lIlll1111Il(), SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::l1IllIl1l1llIlI11I11Il1l1l1lI1
      );
      this.glowColor2 = new ColorSetting(
         "theme.glowColor2", llliili1l1ii11i1lii1.l1IllI1lII1111II1III1lllII(), SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::l11II1lIlIIIlll11lIII
      );
      this.friendColor = new ColorSetting(
         "theme.friendColor", llliili1l1ii11i1lii1.lIl1llIlIlllIl111(), SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::l1IllIl1l1llIlI11I11Il1l1l1lI1
      );
      this.backgroundColor = new ColorSetting(
         "theme.backgroundColor",
         llliili1l1ii11i1lii1.l1lII1IIl1lllll1II11l11IIl(),
         SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::l1lII1IIl1lllll1II11l11IIl
      );
      this.foregroundColor = new ColorSetting(
         "theme.foregroundColor", llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l(), SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::IIlI1l1IllIIII1I1ll1l1l
      );
      this.foregroundLight = new ColorSetting(
         "theme.foregroundLight", llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1(), SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::lI1IlI1I1I11I11ll1II1
      );
      this.foregroundDark = new ColorSetting(
         "theme.foregroundDark",
         llliili1l1ii11i1lii1.IIlIlIIIIlIII11lllI1IllIll1lII(),
         SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::IIlIlIIIIlIII11lllI1IllIll1lII
      );
      this.foregroundGray = new ColorSetting(
         "theme.foregroundGray", llliili1l1ii11i1lii1.I1llIl11Il(), SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::I1llIl11Il
      );
      this.white = new ColorSetting(
         "theme.white", llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl(), SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::I1111IIl1ll1l111lIIl111lIl
      );
      this.whiteGray = new ColorSetting(
         "theme.whiteGray", llliili1l1ii11i1lii1.l1l1lIIlI1l11(), SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::l1l1lIIlI1l11
      );
      this.gray = new ColorSetting(
         "theme.gray", llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III(), SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::III1Illl11III1II11IlIll1III
      );
      this.grayLight = new ColorSetting(
         "theme.grayLight", llliili1l1ii11i1lii1.I111llllll1ll1l1Il(), SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::I111llllll1ll1l1Il
      );
      this.foregroundLightStroke = new ColorSetting(
         "theme.foregroundLightStroke", llliili1l1ii11i1lii1.Il11Il111I11lIl1I1I(), SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::Il11Il111I11lIl1I1I
      );
      this.foregroundStroke = new ColorSetting(
         "theme.foregroundStroke", llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il(), SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I::Ill11II1Il1IIlI1Il
      );
      Collections.addAll(
         this.settings,
         new MenuColorSetting(this.color),
         new MenuColorSetting(this.secondColor),
         new MenuColorSetting(this.glowColor1),
         new MenuColorSetting(this.glowColor2),
         new MenuColorSetting(this.friendColor),
         new MenuColorSetting(this.backgroundColor),
         new MenuColorSetting(this.foregroundColor),
         new MenuColorSetting(this.foregroundLight),
         new MenuColorSetting(this.foregroundDark),
         new MenuColorSetting(this.foregroundGray),
         new MenuColorSetting(this.white),
         new MenuColorSetting(this.whiteGray),
         new MenuColorSetting(this.gray),
         new MenuColorSetting(this.grayLight),
         new MenuColorSetting(this.foregroundLightStroke),
         new MenuColorSetting(this.foregroundStroke)
      );
      this.button = new MenuButtonSetting(new ButtonSetting("theme.reset", () -> {
         for (MenuSetting menusetting : this.settings) {
            if (menusetting instanceof MenuColorSetting menucolorsetting) {
               menucolorsetting.getSetting().reset();
            }
         }
      }));
      this.settings.add(this.button);
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

      this.animation
         .StringHolder_8(ZenithClient.getInstance().NotificationsHolder().EventBus(this.theme) ? 1.0F : 0.0F);
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
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f2, f3, f4, f6, floatHolder_5.StringHolder_30(8.0F), il1iliilli1l1iill);
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

      ByteBufferHolder il1iliilli1l1iill2 = llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
         .StringHolder_8(llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animation.CloudFriendInfo())
         .ZenithInternal039(f5);
      ByteBufferHolder il1iliilli1l1iill3 = llliili1l1ii11i1lii1.I111llllll1ll1l1Il()
         .StringHolder_8(llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl(), this.animation.CloudFriendInfo())
         .ZenithInternal039(f5);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(Fonts.ICONS.getFont(5.5F), "B", f2 + 8.0F, f3 + 9.0F, il1iliilli1l1iill2);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, this.theme.getName(), f2 + 18.0F, f3 + 9.0F, il1iliilli1l1iill3);
      float f8 = 22.5F;
      float f9 = f2 + f4 - f8;
      ByteBufferHolder il1iliilli1l1iill4 = this.theme.l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f5);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f9,
         f3,
         f8,
         f6,
         flag ? floatHolder_5.ZenithInternal149(8.0F) : new floatHolder_5(0.0F, 6.0F, 6.0F, 0.0F),
         il1iliilli1l1iill4
      );
      float f10 = 8.0F;
      float f11 = f3 + f6 + f10;
      ByteBufferHolder il1iliilli1l1iill5 = llliili1l1ii11i1lii1.l1l1lIIlI1l11()
         .StringHolder_8(llliili1l1ii11i1lii1.I111llllll1ll1l1Il(), this.animation.CloudFriendInfo())
         .ZenithInternal039(f5);

      for (MenuSetting menusetting : this.settings) {
         menusetting.render(
            iiii1ilili1l1l1lilli1liliii,
            f,
            f1,
            f2,
            f11,
            f4,
            f5,
            this.animation.CloudFriendInfo(),
            il1iliilli1l1iill2,
            il1iliilli1l1iill3,
            il1iliilli1l1iill5,
            llliili1l1ii11i1lii1
         );
         f11 += menusetting.getHeight() + 8.0F;
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

      if (!this.theme.IIll1ll1I111lI()) {
         this.theme.setColor(this.color.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.StringHolder_8(this.secondColor.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.EventTarget(this.glowColor1.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.ZenithInternal095(this.glowColor2.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.EventBus(this.friendColor.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.Event(this.gray.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.EventImpl_24(this.grayLight.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.ZenithInternal028(this.foregroundLight.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.EventImpl_21(this.whiteGray.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.EventImpl_13(this.foregroundGray.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.byteHolder_2(this.foregroundLightStroke.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.byteHolder(this.foregroundColor.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.StringHolder_4(this.foregroundStroke.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.ZenithInternal128(this.foregroundDark.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.ByteBufferHolder_2(this.white.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.theme.ConnectThread(this.backgroundColor.l1IllIl1l1llIlI11I11Il1l1l1lI1());
      } else {
         this.color.setColor(this.theme.l1IllIl1l1llIlI11I11Il1l1l1lI1());
         this.secondColor.setColor(this.theme.l11II1lIlIIIlll11lIII());
         this.glowColor1.setColor(this.theme.IlI1I11lIlll1111Il());
         this.glowColor2.setColor(this.theme.l1IllI1lII1111II1III1lllII());
         this.friendColor.setColor(this.theme.lIl1llIlIlllIl111());
         this.gray.setColor(this.theme.III1Illl11III1II11IlIll1III());
         this.grayLight.setColor(this.theme.I111llllll1ll1l1Il());
         this.foregroundLight.setColor(this.theme.lI1IlI1I1I11I11ll1II1());
         this.whiteGray.setColor(this.theme.l1l1lIIlI1l11());
         this.foregroundGray.setColor(this.theme.I1llIl11Il());
         this.foregroundLightStroke.setColor(this.theme.Il11Il111I11lIl1I1I());
         this.foregroundColor.setColor(this.theme.IIlI1l1IllIIII1I1ll1l1l());
         this.foregroundStroke.setColor(this.theme.Ill11II1Il1IIlI1Il());
         this.foregroundDark.setColor(this.theme.IIlIlIIIIlIII11lllI1IllIll1lII());
         this.white.setColor(this.theme.I1111IIl1ll1l111lIIl111lIl());
         this.backgroundColor.setColor(this.theme.l1lII1IIl1lllll1II11l11IIl());
         this.theme.longHolder_4(false);
      }
   }

   @Override
   public float getHeight() {
      return (float)(
         22.0 + (this.hasSettings() ? this.settings.stream().mapToDouble(MenuSetting::getHeight).sum() + 8.0 + (double)(8 * this.settings.size()) : 0.0)
      );
   }

   private boolean hasSettings() {
      return !this.settings.isEmpty();
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.byteHolder(d0, d1)) {
         ZenithClient.getInstance().NotificationsHolder().StringHolder_8(this.theme);
      }

      for (MenuSetting menusetting : this.settings) {
         menusetting.onMouseClicked(d0, d1, ill1iili11ii1l);
      }
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
   }

   @Override
   public void onMouseDragged(double d0, double d1, ZenithInternal068 ill1iili11ii1l, double d2, double d3) {
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      return false;
   }

   @Override
   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      return false;
   }

   @Override
   public Category getCategory() {
      return Category.IllllII1ll1111IlIIII;
   }

   @Override
   public String getName() {
      return this.theme.getName();
   }
}
