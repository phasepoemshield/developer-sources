package zenith;

import zenith.hud.*;

import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

class Notifications$EventBus extends Notifications$II1Il11l111II11IIl {
   final Module lI1II1llI1II1l11IIl;
   final boolean lII1l1lIl1111l11;

   Notifications$EventBus(Module ll111il1lliill11, boolean flag, long i) {
      super(i);
      this.lI1II1llI1II1l11IIl = ll111il1lliill11;
      this.lII1l1lIl1111l11 = flag;
   }

   @Override
   void StringHolder_8(DrawContextImpl lliii11l1lllil, float f, float f1, Font font, ZenithStyle zenithstyle, float f2, Notifications ili1111ii1l1li) {
      float f3 = Interface.lIl111ll1l111lIIlIlI1I1();
      float f4 = 16.0F;
      ByteBufferHolder il1iliilli1l1iill = zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
      ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
      ByteBufferHolder il1iliilli1l1iill2 = this.lII1l1lIl1111l11
         ? zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         : zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1();
      ByteBufferHolder il1iliilli1l1iill3 = this.lII1l1lIl1111l11
         ? zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         : zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1();
      String s = this.lI1II1llI1II1l11IIl.getName();
      String s1 = "  "
         + ZenithClient.getInstance()
            .StringHolder_31()
            .translate(this.lII1l1lIl1111l11 ? "module.interface.notifications.state.enabled" : "module.interface.notifications.state.disabled");
      float f5 = font.width(s);
      float f6 = font.width(s1);
      float f7 = f4 + 4.0F + f5 + f6 + 8.0F;
      Notifications.StringHolder_8(ili1111ii1l1li, f2);
      Notifications.EventBus(ili1111ii1l1li, Math.max(Notifications.EventBus(ili1111ii1l1li), f7));
      f += (100.0F - f7) / 2.0F;
      float f8 = this.I1ll1lIIIlllI11l.CloudFriendInfo();
      Font font1 = Fonts.NEW_ICONS.getFont(6.0F);
      lliii11l1lllil.getMatrices().push();
      lliii11l1lllil.getMatrices().translate(f + f7 / 2.0F, f1 + f2 / 2.0F, 0.0F);
      lliii11l1lllil.getMatrices().scale(f8, f8, 1.0F);
      lliii11l1lllil.getMatrices().translate(-(f + f7 / 2.0F), -(f1 + f2 / 2.0F), 0.0F);
      floatHolder_8.Event(
         lliii11l1lllil.getMatrices(), f, f1, f7, f2, 21.0F, floatHolder_5.StringHolder_30(f3), ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      lliii11l1lllil.StringHolder_8(f, f1, f7, f2, floatHolder_5.StringHolder_30(f3), il1iliilli1l1iill);
      lliii11l1lllil.StringHolder_8(f, f1, f4, f2, floatHolder_5.StringHolder_30(f3), il1iliilli1l1iill1);
      String s2 = this.lI1II1llI1II1l11IIl.getCategory().getIcon();
      float f9 = f + (f4 - font1.width(s2)) / 2.0F;
      float f10 = f1 + (f2 - font1.height()) / 2.0F;
      lliii11l1lllil.StringHolder_8(font1, s2, f9, f10, il1iliilli1l1iill2);
      float f11 = f + f4 + 4.0F;
      float f12 = f1 + (f2 - font.height()) / 2.0F;
      lliii11l1lllil.StringHolder_8(font, s, f11, f12, il1iliilli1l1iill2);
      lliii11l1lllil.StringHolder_8(font, s1, f11 + f5, f12, il1iliilli1l1iill3);
      lliii11l1lllil.getMatrices().pop();
   }
}
