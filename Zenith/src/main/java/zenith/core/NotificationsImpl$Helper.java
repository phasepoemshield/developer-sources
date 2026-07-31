package zenith;

import zenith.hud.*;

import net.minecraft.text.Text;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

class Notifications$EventTarget extends Notifications$II1Il11l111II11IIl {
   final String IlII11lllIl1I1l1Il1l11llI;
   final Text lII1lIIIII11lII11IIll1IllI;

   Notifications$EventTarget(String s, Text Text, long i) {
      super(i);
      this.IlII11lllIl1I1l1Il1l11llI = s;
      this.lII1lIIIII11lII11IIll1IllI = Text;
   }

   @Override
   void StringHolder_8(DrawContextImpl lliii11l1lllil, float f, float f1, Font font, ZenithStyle zenithstyle, float f2, Notifications ili1111ii1l1li) {
      float f3 = Interface.lIl111ll1l111lIIlIlI1I1();
      float f4 = 16.0F;
      ByteBufferHolder il1iliilli1l1iill = zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
      ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
      ByteBufferHolder il1iliilli1l1iill2 = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1();
      float f5 = font.width(this.lII1lIIIII11lII11IIll1IllI);
      float f6 = f4 + 4.0F + f5 + 8.0F;
      Notifications.EventTarget(ili1111ii1l1li, f2);
      Notifications.ZenithInternal095(ili1111ii1l1li, Math.max(Notifications.EventTarget(ili1111ii1l1li), f6));
      f += (100.0F - f6) / 2.0F;
      float f7 = this.I1ll1lIIIlllI11l.CloudFriendInfo();
      Font font1 = Fonts.ICONS.getFont(this.IlII11lllIl1I1l1Il1l11llI.equals("Y") ? 8.0F : 6.0F);
      lliii11l1lllil.getMatrices().push();
      lliii11l1lllil.getMatrices().translate(f + f6 / 2.0F, f1 + f2 / 2.0F, 0.0F);
      lliii11l1lllil.getMatrices().scale(f7, f7, 1.0F);
      lliii11l1lllil.getMatrices().translate(-(f + f6 / 2.0F), -(f1 + f2 / 2.0F), 0.0F);
      floatHolder_8.Event(
         lliii11l1lllil.getMatrices(), f, f1, f6, f2, 21.0F, floatHolder_5.StringHolder_30(f3), ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      lliii11l1lllil.StringHolder_8(f, f1, f6, f2, floatHolder_5.StringHolder_30(f3), il1iliilli1l1iill);
      lliii11l1lllil.StringHolder_8(f, f1, f4, f2, floatHolder_5.StringHolder_30(f3), il1iliilli1l1iill1);
      float f8 = f + (f4 - font1.width(this.IlII11lllIl1I1l1Il1l11llI)) / 2.0F;
      float f9 = f1 + (f2 - font1.height()) / 2.0F;
      lliii11l1lllil.StringHolder_8(font1, this.IlII11lllIl1I1l1Il1l11llI, f8, f9, il1iliilli1l1iill2);
      float f10 = f + f4 + 4.0F;
      float f11 = f1 + (f2 - font.height()) / 2.0F;
      lliii11l1lllil.StringHolder_8(font, this.lII1lIIIII11lII11IIll1IllI, f10, f11);
      lliii11l1lllil.getMatrices().pop();
   }
}
