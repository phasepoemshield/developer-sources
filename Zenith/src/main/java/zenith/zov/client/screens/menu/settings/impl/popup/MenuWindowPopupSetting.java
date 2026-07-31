package zenith.zov.client.screens.menu.settings.impl.popup;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.joml.Vector2f;
import zenith.BooleanSetting;
import zenith.BindSetting;
import zenith.floatHolder_4;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ButtonSetting;
import zenith.ZenithInternal068;
import zenith.doubleHolder;
import zenith.NumberSetting;
import zenith.MultiBooleanSetting;
import zenith.doubleHolder_3;
import zenith.Setting;
import zenith.GetHeightHandler;
import zenith.floatHolder_8;
import zenith.GetStartTimeHandler;
import zenith.ModeSetting;
import zenith.Interface;
import zenith.ListSetting;
import zenith.Module;
import zenith.ContainerSetting;
import zenith.ColorSetting;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.settings.api.MenuPopupSetting;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuBooleanSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuButtonSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuColorSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuItemSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuKeySetting;
import zenith.zov.client.screens.menu.settings.impl.MenuModeSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuSelectSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuSliderSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuWindowSetting;

public class MenuWindowPopupSetting extends MenuPopupSetting {
   private final Vector2f defaultPosition;
   private final ContainerSetting setting;
   private final doubleHolder scrollHandler;
   private final List<MenuSetting> renderableSettings;
   private final GetStartTimeHandler animation;
   private boolean dragging;
   private float dragOffsetX;
   private float dragOffsetY;

   public MenuWindowPopupSetting(Module ll111il1lliill11, Vector2f vector2f, ContainerSetting lliiii1iil1li, GetHeightHandler l1l1ii11lllll) {
      super(l1l1ii11lllll);
      this.defaultPosition = vector2f;
      this.setting = lliiii1iil1li;
      this.scrollHandler = new doubleHolder();
      this.renderableSettings = new ArrayList<>();
      this.animation = new GetStartTimeHandler(200L, ll111il1lliill11.Spider() ? 1.0F : 0.0F, IReturn.doubleHolder_4);
      this.animationScale.StringHolder_8(1.0F);
      lliiii1iil1li.getSettings().forEach(object -> {
         Objects.requireNonNull(object);
         switch (object) {
            case MultiBooleanSetting l11i1111l1i:
               this.renderableSettings.add(new MenuSelectSetting(l11i1111l1i));
               break;
            case BooleanSetting ii1iiil1ll111iii11ii1illlii1:
               this.renderableSettings.add(new MenuBooleanSetting(ii1iiil1ll111iii11ii1illlii1));
               break;
            case NumberSetting illil1lill1llll11:
               this.renderableSettings.add(new MenuSliderSetting(illil1lill1llll11));
               break;
            case ButtonSetting ililii11ll111ii1ll1iil1li11iil:
               this.renderableSettings.add(new MenuButtonSetting(ililii11ll111ii1ll1iil1li11iil));
               break;
            case ModeSetting liii11li1iliiiii1l1li:
               this.renderableSettings.add(new MenuModeSetting(liii11li1iliiiii1l1li));
               break;
            case ListSetting lilliii1illl:
               this.renderableSettings.add(new MenuItemSetting(lilliii1illl));
               break;
            case ColorSetting llil11111111l1il1ii:
               this.renderableSettings.add(new MenuColorSetting(llil11111111l1il1ii));
               break;
            case ContainerSetting lliiii1iil1lix:
               this.renderableSettings.add(new MenuWindowSetting(ll111il1lliill11, lliiii1iil1lix));
               break;
            case BindSetting iii11ll1iiiiiill1lil:
               this.renderableSettings.add(new MenuKeySetting(iii11ll1iiiiiill1lil));
               break;
            default:
               throw new RuntimeException("Unknown setting");
         }
      });
      float f = 25.0F;

      for (MenuSetting menusetting : this.renderableSettings) {
         if (menusetting.isVisible()) {
            f += menusetting.getHeight() + 8.0F;
         }
      }

      this.bounds.setX(vector2f.x);
      this.bounds.setY(vector2f.y);
      this.bounds.setHeight(Math.min(f, 170.0F));
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, SetColorHandler_3 llliili1l1ii11i1lii1) {
      this.animationScale.ArmorHud();
      if (this.animationScale.CloudFriendInfo() == 0.0F) {
         this.bounds.setX(this.defaultPosition.x);
         this.bounds.setY(this.defaultPosition.y);
      }

      iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
      float f3 = this.bounds.getX();
      float f4 = this.bounds.getY();
      float f5 = this.bounds.getWidth();
      float f6 = this.bounds.getHeight();
      float f7 = 4.0F;
      iiii1ilili1l1l1lilli1liliii.getMatrices()
         .translate(this.bounds.getX() + this.bounds.getWidth() / 2.0F, this.bounds.getY() + this.bounds.getHeight() / 2.0F, 0.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().scale(this.animationScale.CloudFriendInfo(), this.animationScale.CloudFriendInfo(), 1.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices()
         .translate(-(this.bounds.getX() + this.bounds.getWidth() / 2.0F), -(this.bounds.getY() + this.bounds.getHeight() / 2.0F), 0.0F);
      float f8 = doubleHolder_3.byteHolder_2(Interface.lIl111ll1l111lIIlIlI1I1(), f6, f6);
      floatHolder_8.Event(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f3,
         f4,
         f5,
         f6,
         21.0F,
         floatHolder_5.StringHolder_30(f8),
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      floatHolder_8.EventTarget(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f3 - 0.5F,
         f4 - 0.5F,
         f5 + 1.0F,
         f6 + 1.0F,
         0.5F,
         floatHolder_5.StringHolder_30(f8),
         llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il().ZenithInternal039(f2)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         this.bounds.getX(),
         this.bounds.getY(),
         this.bounds.getWidth(),
         f6,
         floatHolder_5.StringHolder_30(f8),
         llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f2)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         this.bounds.getX(),
         this.bounds.getY(),
         this.bounds.getWidth(),
         18.0F,
         floatHolder_5.StringHolder_19(f8, f8),
         llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1().ZenithInternal039(f2)
      );
      Font font = Fonts.MEDIUM.getFont(7.0F);
      Font font1 = Fonts.ICONS.getFont(7.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font, this.setting.getName(), f3 + 8.0F + 11.2F, f4 + 6.5F, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl()
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, "E", f3 + 8.0F, f4 + 6.5F, llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1());
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, "M", f3 + f5 - 19.0F + font1.width("M") / 2.0F + 1.0F, f4 + 6.6F, llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
      );
      float f9 = (float)this.renderableSettings.stream().mapToDouble(menusetting1 -> (double)(menusetting1.getHeight() + 8.0F)).sum();
      this.scrollHandler.ZenithInternal084((double)Math.max(0.0F, f9));
      this.scrollHandler.Coordinates();
      float f10 = (float)((double)(f4 + 22.0F) - this.scrollHandler.IIIlII1Il1l111lI1() + (double)f7);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)f3, (int)f4 + 18, (int)(f3 + f5), (int)(f4 + f6));
      ByteBufferHolder il1iliilli1l1iill = llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
         .StringHolder_8(llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animation.CloudFriendInfo())
         .ZenithInternal039(f2);
      ByteBufferHolder il1iliilli1l1iill1 = llliili1l1ii11i1lii1.I111llllll1ll1l1Il()
         .StringHolder_8(llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl(), this.animation.CloudFriendInfo())
         .ZenithInternal039(f2);
      ByteBufferHolder il1iliilli1l1iill2 = llliili1l1ii11i1lii1.l1l1lIIlI1l11()
         .StringHolder_8(llliili1l1ii11i1lii1.I111llllll1ll1l1Il(), this.animation.CloudFriendInfo())
         .ZenithInternal039(f2);

      for (MenuSetting menusetting : this.renderableSettings) {
         if (menusetting.isVisible()) {
            menusetting.render(
               iiii1ilili1l1l1lilli1liliii,
               f,
               f1,
               f3,
               f10,
               f5,
               f2,
               this.animation.CloudFriendInfo(),
               il1iliilli1l1iill,
               il1iliilli1l1iill1,
               il1iliilli1l1iill2,
               llliili1l1ii11i1lii1
            );
            f10 += menusetting.getHeight() + 8.0F;
         }
      }

      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f3 + this.getWidth() - 4.0F,
         f4 + 18.0F + 4.0F,
         2.0F,
         f6 - 18.0F - 4.0F,
         floatHolder_5.StringHolder_30(f8),
         llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III().ZenithInternal039(f2)
      );
      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
   }

   @Override
   public void onMouseDragged(double d0, double d1, ZenithInternal068 ill1iili11ii1l, double d2, double d3) {
      if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl && this.dragging) {
         this.bounds.setX((float)(d0 - (double)this.dragOffsetX));
         this.bounds.setY((float)(d1 - (double)this.dragOffsetY));
      }
   }

   @Override
   public boolean charTyped(char c0, int i) {
      return false;
   }

   @Override
   public boolean mouseScrolled(double d1, double d2, double d3, double d0) {
      this.scrollHandler.ZenithInternal101(d0);
      return true;
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      boolean flag = false;

      for (MenuSetting menusetting : this.renderableSettings) {
         if (menusetting.keyPressed(i, j, k)) {
            flag = true;
         }
      }

      return flag;
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (d0 >= (double)(this.bounds.getX() + this.bounds.getWidth() - 16.0F)
         && d0 <= (double)(this.bounds.getX() + this.bounds.getWidth() - 16.0F + this.bounds.getWidth())
         && d1 >= (double)this.bounds.getY()
         && d1 <= (double)(this.bounds.getY() + 18.0F)) {
         this.animationScale.StringHolder_8(0.0F);
      }

      if (doubleHolder_3.StringHolder_8(d0, d1, (double)this.bounds.getX(), (double)this.bounds.getY(), (double)this.bounds.getWidth(), 18.0)
         && ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         this.dragOffsetX = (float)(d0 - (double)this.bounds.getX());
         this.dragOffsetY = (float)(d1 - (double)this.bounds.getY());
         this.dragging = true;
      }

      this.renderableSettings.forEach(menusetting -> menusetting.onMouseClicked(d0, d1, ill1iili11ii1l));
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.dragging && ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         this.dragging = false;
      }

      this.renderableSettings.forEach(menusetting -> menusetting.onMouseReleased(d0, d1, ill1iili11ii1l));
   }

   @Override
   public boolean equals(Object object) {
      if (this == object) {
         return true;
      } else {
         return object instanceof MenuWindowPopupSetting menuwindowpopupsetting1 ? this.setting == menuwindowpopupsetting1.setting : false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.setting);
   }

   @Override
   public float getWidth() {
      return 0.0F;
   }

   @Override
   public float getHeight() {
      return 0.0F;
   }

   @Override
   public boolean isVisible() {
      return true;
   }
}
