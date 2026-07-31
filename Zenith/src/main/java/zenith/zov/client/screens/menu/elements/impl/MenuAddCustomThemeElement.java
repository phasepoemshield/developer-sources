package zenith.zov.client.screens.menu.elements.impl;

import java.util.ArrayList;
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
import zenith.SetColorHandler_3;
import zenith.booleanHolder$EventBus;
import zenith.zov.base.font.Font;
import zenith.zov.client.screens.menu.elements.api.AbstractMenuElement;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuButtonSetting;

public class MenuAddCustomThemeElement extends AbstractMenuElement {
   private final List<MenuSetting> settings = new ArrayList<>();
   private final GetStartTimeHandler animationPosition;
   private final GetStartTimeHandler animationY;
   private HeightHandler bounds;
   private int lastColum = -1;
   boolean animated = false;

   public MenuAddCustomThemeElement() {
      this.animationPosition = new GetStartTimeHandler(150L, 1.0F, IReturn.ListHolder_8);
      this.animationY = new GetStartTimeHandler(150L, 1.0F, IReturn.ListHolder_8);
      this.settings
         .add(
            new MenuButtonSetting(
               new ButtonSetting(
                  "theme.add",
                  () -> {
                     SetColorHandler_3 llliili1l1ii11i1lii1 = booleanHolder$EventBus.l11llIIll11l11I1IIllIll1()
                        .CallableImpl(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.l1IllIl1l1llIlI11I11Il1l1l1lI1())
                        .hasTimeElapsed(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.l11II1lIlIIIlll11lIII())
                        .ZenithInternal042(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.lIl1llIlIlllIl111())
                        .ZenithInternal101(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.IlI1I11lIlll1111Il())
                        .ZenithInternal084(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.l1IllI1lII1111II1III1lllII())
                        .StringHolder_19(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.III1Illl11III1II11IlIll1III())
                        .ZenithInternal061(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.I111llllll1ll1l1Il())
                        .FinishThread(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.lI1IlI1I1I11I11ll1II1())
                        .ZenithInternal064(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.l1l1lIIlI1l11())
                        .ZenithInternal021(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.I1llIl11Il())
                        .ZenithException_2(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.Il11Il111I11lIl1I1I())
                        .ClearHeadersHandler(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.IIlI1l1IllIIII1I1ll1l1l())
                        .StringHolder_5(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.Ill11II1Il1IIlI1Il())
                        .longHolder_3(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.IIlIlIIIIlIII11lllI1IllIll1lII())
                        .ZenithInternal070(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.I1111IIl1ll1l111lIIl111lIl())
                        .longHolder_6(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.l1lII1IIl1lllll1II11l11IIl())
                        .ZenithInternal045(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.Il11II1l1111lIIlllI1I1llII())
                        .ZenithInternal044(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.lI11l1I1l11())
                        .permessagedeflate(SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I.I1Il1lIIlIll1I111IlII())
                        .hasTimeElapsed(
                           "Custom theme"
                              + ZenithClient.getInstance()
                                 .NotificationsHolder()
                                 .llII1lIlI1l11lIIlI11IllIlIII()
                                 .stream()
                                 .filter(llliili1l1ii11i1lii1 -> llliili1l1ii11i1lii1x.getName().contains("Custom"))
                                 .count(),
                           "F"
                        );
                     ZenithClient.getInstance().NotificationsHolder().llII1lIlI1l11lIIlI11IllIlIII().add(llliili1l1ii11i1lii1);
                     ZenithClient.getInstance()
                        .TimerUtilHolder_2()
                        .getModules()
                        .add(new MenuCustomThemeElement(llliili1l1ii11i1lii1));
                  }
               )
            )
         );
      this.settings
         .add(
            new MenuButtonSetting(
               new ButtonSetting(
                  "theme.deleteAll",
                  () -> {
                     ZenithClient.getInstance()
                        .TimerUtilHolder_2()
                        .getModules()
                        .removeIf(
                           abstractmenuelement -> !(abstractmenuelement instanceof MenuAddCustomThemeElement)
                                 && abstractmenuelement.getName().contains("Custom")
                                 && !abstractmenuelement.getName().equals(SetColorHandler_3.l1l11l1111l1ll1lIllll1.getName())
                        );
                     ZenithClient.getInstance()
                        .NotificationsHolder()
                        .llII1lIlI1l11lIIlI11IllIlIII()
                        .removeIf(
                           llliili1l1ii11i1lii1 -> llliili1l1ii11i1lii1.getName().contains("Custom")
                                 && llliili1l1ii11i1lii1 != SetColorHandler_3.l1l11l1111l1ll1lIllll1
                        );
                  }
               )
            )
         );
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
         .StringHolder_8(llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), 0.0F)
         .ZenithInternal039(f5);
      ByteBufferHolder il1iliilli1l1iill3 = llliili1l1ii11i1lii1.I111llllll1ll1l1Il()
         .StringHolder_8(llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl(), 0.0F)
         .ZenithInternal039(f5);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, "-------------", f2 + (f4 - font.width("-------------")) / 2.0F, f3 + 9.0F, il1iliilli1l1iill3);
      float f8 = 22.5F;
      float f9 = f2 + f4 - f8;
      float f10 = 8.0F;
      float f11 = f3 + f6 + f10;
      ByteBufferHolder il1iliilli1l1iill4 = llliili1l1ii11i1lii1.l1l1lIIlI1l11()
         .StringHolder_8(llliili1l1ii11i1lii1.I111llllll1ll1l1Il(), 1.0F)
         .ZenithInternal039(f5);

      for (MenuSetting menusetting : this.settings) {
         menusetting.render(
            iiii1ilili1l1l1lilli1liliii, f, f1, f2, f11, f4, f5, 1.0F, il1iliilli1l1iill2, il1iliilli1l1iill3, il1iliilli1l1iill4, llliili1l1ii11i1lii1
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
      return "MenuAddCustomThemeElement";
   }
}
