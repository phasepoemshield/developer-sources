package zenith.zov.client.screens.override.button;

import zenith.hud.*;

import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.floatHolder_8;
import zenith.GetStartTimeHandler;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;

public class DefaultButton extends ButtonScreen {
   private final GetStartTimeHandler hoverAnimation = new GetStartTimeHandler(300L, IReturn.ScreenImpl);
   private final String name;
   private final String icon;
   private final Runnable onClick;

   public DefaultButton(String s, String s1, float f, float f1, Runnable runnable) {
      super(f, f1);
      this.name = s;
      this.icon = s1;
      this.onClick = runnable;
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3) {
      super.render(iiii1ilili1l1l1lilli1liliii, f, f1, f2, f3);
      SetColorHandler_3 llliili1l1ii11i1lii1 = SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I;
      this.hoverAnimation.ZenithInternal101(this.bounds.byteHolder((double)f, (double)f1));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f2,
         f3,
         this.getWidth(),
         this.getHeight(),
         floatHolder_5.StringHolder_30(4.0F),
         llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l()
            .StringHolder_8(llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1(), this.hoverAnimation.CloudFriendInfo())
      );
      iiii1ilili1l1l1lilli1liliii.EventBus(
         f2, f3, this.getWidth(), this.getHeight(), -0.1F, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
      );
      floatHolder_8.StringHolder_8(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f2,
         f3,
         this.getWidth(),
         this.getHeight(),
         0.1F,
         15.0F,
         ByteBufferHolder.lllIll11l1I11Il1II11II1I11
            .StringHolder_8(
               ZenithClient.getInstance().NotificationsHolder().IllIlIll11lIlI1().l1IllIl1l1llIlI11I11Il1l1l1lI1(),
               this.hoverAnimation.CloudFriendInfo()
            ),
         floatHolder_5.StringHolder_30(4.0F)
      );
      Font font = Fonts.MEDIUM.getFont(7.0F);
      Font font1 = Fonts.ICONS.getFont(6.0F);
      float f4 = 4.0F;
      float f5 = font1.width(this.icon);
      float f6 = font.width(this.name);
      float f7 = f5 + f4 + f6;
      float f8 = f2 + (this.getWidth() - f7) / 2.0F;
      float f9 = f3 + (this.getHeight() - font.height()) / 2.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1,
         this.icon,
         f8,
         f9,
         llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
            .StringHolder_8(
               ZenithClient.getInstance().NotificationsHolder().IllIlIll11lIlI1().l1IllIl1l1llIlI11I11Il1l1l1lI1(),
               this.hoverAnimation.CloudFriendInfo()
            )
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font,
         this.name,
         f8 + f5 + f4,
         f9,
         llliili1l1ii11i1lii1.I111llllll1ll1l1Il()
            .StringHolder_8(llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl(), this.hoverAnimation.CloudFriendInfo())
      );
   }

   @Override
   public void onClick(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      this.onClick.run();
   }
}
