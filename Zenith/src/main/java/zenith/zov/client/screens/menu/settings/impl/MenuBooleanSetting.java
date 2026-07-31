package zenith.zov.client.screens.menu.settings.impl;

import zenith.hud.*;

import zenith.BooleanSetting;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;

public class MenuBooleanSetting extends MenuSetting {
   private final BooleanSetting setting;
   private final GetStartTimeHandler animation = new GetStartTimeHandler(300L, IReturn.ZenithInternal022);
   private HeightHandler bounds;

   public MenuBooleanSetting(BooleanSetting ii1iiil1ll111iii11ii1illlii1) {
      this.setting = ii1iiil1ll111iii11ii1illlii1;
   }

   @Override
   public void render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f13,
      float f14,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill7,
      SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      float f5 = 24.0F;
      float f6 = f + 8.0F;
      Font font = Fonts.MEDIUM.getFont(7.0F);
      Font font1 = Fonts.MEDIUM.getFont(6.0F);
      float f7 = f1 + (8.0F - font.height()) / 2.0F - 0.5F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, this.setting.getName(), f + 8.0F + 10.0F, f7, il1iliilli1l1iill1);
      this.animation.ZenithInternal095(this.setting.Spider() ? 1.0F : 0.0F);
      float f8 = this.animation.ArmorHud();
      float f9 = 6.0F;
      float f10 = f7 - 1.0F;
      Font font2 = Fonts.ICONS.getFont(6.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f6, f10, f9, f9, floatHolder_5.StringHolder_30(1.0F), il1iliilli1l1iill);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         Fonts.ICONS.getFont(5.5F), "S", f6 + 1.2F, f10 + 0.5F, llliili1l1ii11i1lii1.IIlIlIIIIlIII11lllI1IllIll1lII().ZenithInternal039(f3)
      );
      float f11 = 8.0F;
      float f12 = f + f2 - f11 - 8.0F;
      ByteBufferHolder il1iliilli1l1iill2 = llliili1l1ii11i1lii1.l1l1lIIlI1l11().StringHolder_8(llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), f4);
      ByteBufferHolder il1iliilli1l1iill3 = llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1()
         .StringHolder_8(il1iliilli1l1iill2, this.animation.CloudFriendInfo())
         .ZenithInternal039(f3);
      ByteBufferHolder il1iliilli1l1iill4 = llliili1l1ii11i1lii1.Il11Il111I11lIl1I1I()
         .StringHolder_8(new ByteBufferHolder(0, 0, 0, 0), this.animation.CloudFriendInfo())
         .ZenithInternal039(f3);
      ByteBufferHolder il1iliilli1l1iill5 = llliili1l1ii11i1lii1.I111llllll1ll1l1Il()
         .StringHolder_8(llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl(), f4);
      ByteBufferHolder il1iliilli1l1iill6 = new ByteBufferHolder(0, 0, 0, 0)
         .StringHolder_8(il1iliilli1l1iill5, this.animation.CloudFriendInfo())
         .ZenithInternal039(f3);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f12, f1, f11, f11, floatHolder_5.StringHolder_30(2.0F), il1iliilli1l1iill3);
      iiii1ilili1l1l1lilli1liliii.EventBus(f12, f1, f11, f11, -0.1F, floatHolder_5.StringHolder_30(2.0F), il1iliilli1l1iill4);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font2, "S", f12 + 2.0F, f1 + 1.0F, il1iliilli1l1iill6);
      this.bounds = new HeightHandler(f12, f1, f11, f11);
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.byteHolder(d0, d1) && ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         this.setting.lI1Il11I1l1III11IIlI1lI1II11I();
         if (ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0 || ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 1) {
            ZenithClient.getInstance()
               .MinecraftClientHolder_5()
               .StringHolder_8(
                  ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0
                     ? ZenithClient.getInstance().MinecraftClientHolder_5().IIl1l1II1I11IllI1I111Ill1
                     : ZenithClient.getInstance().MinecraftClientHolder_5().l11l11lII11lIl1l
               );
         }
      }
   }

   @Override
   public float getWidth() {
      return 0.0F;
   }

   @Override
   public float getHeight() {
      return 8.0F;
   }

   @Override
   public boolean isVisible() {
      return this.setting.l1l1II1I1ll11l1IlI1lI11l1().get();
   }

   public BooleanSetting getSetting() {
      return this.setting;
   }
}
