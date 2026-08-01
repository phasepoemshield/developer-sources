package zenith.zov.client.screens.nlgui.elements.setting;

import zenith.hud.*;

import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ButtonSetting;
import zenith.ZenithInternal068;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.GuiSetting;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiButtonSetting extends GuiSetting<ButtonSetting> {
   private final GetStartTimeHandler animationEnable = new GetStartTimeHandler(200L, IReturn.ScreenImpl);
   private final GetStartTimeHandler animationClick = new GetStartTimeHandler(350L, IReturn.doubleHolder_4);
   private boolean clickActive;
   private HeightHandler bounds;

   public GuiButtonSetting(ButtonSetting ililii11ll111ii1ll1iil1li11iil) {
      super(166.0F, ililii11ll111ii1ll1iil1li11iil);
   }

   public GuiButtonSetting(ButtonSetting ililii11ll111ii1ll1iil1li11iil, float f) {
      super(f, ililii11ll111ii1ll1iil1li11iil);
   }

   @Override
   public String getName() {
      return this.setting.getName();
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.byteHolder(d0, d1)) {
         this.setting.lI1Il11I1l1III11IIlI1lI1II11I();
         this.clickActive = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         this.animationVisible.ZenithInternal101(this.setting.isVisible());
         f4 *= this.animationVisible.CloudFriendInfo();
         this.animationClick.ZenithInternal101(this.clickActive);
         if (this.clickActive && this.animationClick.CloudFriendInfo() > 0.9F) {
            this.clickActive = false;
         }

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
            this.setting.getIcon(),
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
         if (!this.isShort()) {
            float f6 = 6.0F;
            float f7 = 6.0F;
            this.bounds = new HeightHandler(f2 + this.width - f6, f3 + (this.getHeight() - f7) / 2.0F, f6, f7);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               this.bounds.Il11lIlllI111I1l1111(),
               this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
               f6,
               f7,
               floatHolder_5.StringHolder_30(1.0F),
               zenithstyle.getFieldSurfaceBackground()
                  .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  .ZenithInternal039(2.0F)
                  .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animationEnable.CloudFriendInfo())
                  .ZenithInternal039(f4)
            );
            iiii1ilili1l1l1lilli1liliii.EventBus(
               this.bounds.Il11lIlllI111I1l1111(),
               this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
               f6,
               f7,
               -0.5F,
               floatHolder_5.StringHolder_30(1.0F),
               zenithstyle.getFieldBorder()
                  .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  .StringHolder_8(ByteBufferHolder.lllIll11l1I11Il1II11II1I11, this.animationEnable.CloudFriendInfo())
                  .ZenithInternal039(f4)
            );
            Font font2 = Fonts.NEW_ICONS.getFont(4.0F);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font2,
               "<",
               this.bounds.Il11lIlllI111I1l1111() + 1.5F - 0.8F,
               this.bounds.I1II11l1I11Illl11IIl1l1lIl1II() + (f7 - font2.height()) / 2.0F,
               ByteBufferHolder.lllIll11l1I11Il1II11II1I11
                  .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animationClick.CloudFriendInfo())
                  .ZenithInternal039(f4)
            );
         } else {
            Font font3 = Fonts.NEW_ICONS.getFont(5.5F);
            float f9 = font3.width("H");
            float f10 = font3.height();
            float f8 = f2 + this.width - f9;
            this.bounds = new HeightHandler(f8, f3 + (this.getHeight() - f10) / 2.0F, f9, f10);
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font3,
               "H",
               this.bounds.Il11lIlllI111I1l1111(),
               this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
               zenithstyle.getTextSecondary()
                  .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animationClick.CloudFriendInfo())
                  .ZenithInternal039(f4)
            );
         }
      }
   }
}
