package zenith;

import zenith.hud.*;

import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

class Events$II1Il11l111II11IIl {
   private final GetStartTimeHandler I1IIIII1IIlIIllIlI1I1l1l1lIII = new GetStartTimeHandler(150L, 0.01F, IReturn.ListHolder_8);
   private GetDisplayNameHandler lIIIlI11IIll1I1l;

   Events$II1Il11l111II11IIl(Events i1ll1llliii11l1, GetDisplayNameHandler iili1iilllliiil) {
      this.lIIIlI11IIll1I1l = iili1iilllliiil;
   }

   void EventBus(GetDisplayNameHandler iili1iilllliiil) {
      this.lIIIlI11IIll1I1l = iili1iilllliiil;
   }

   float IIIlI1lI11l1111IlIl11() {
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font1 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      Font font2 = Fonts.NEW_ICONS.getFont(5.5F);
      String s = this.lIIIlI11IIll1I1l.getDisplayName();
      String s1 = this.lIIIlI11IIll1I1l.Il11I1IIII1l1lIlI1();
      if (s1 == null || s1.isEmpty()) {
         s1 = "-";
      }

      float f = 100.0F;
      float f1 = 8.0F + font2.width(this.lIIIlI11IIll1I1l.getIcon()) + (float)GuiStyle.PADDING.intValue() + font.width(s);
      float f2 = font1.width(s1);
      float f3 = Math.max(this.getHeight(), (float)GuiStyle.PADDING.intValue() + f2);
      float f4 = (float)(GuiStyle.PADDING * 2) + f3 + 8.0F;
      float f5 = f - (f4 + 8.0F);
      if (f5 < f1 + 8.0F) {
         f += f1 + 8.0F - f5;
      }

      return f;
   }

   float getHeight() {
      return 7.0F;
   }

   void StringHolder_8(DrawContextImpl lliii11l1lllil, float f, float f1, float f2, boolean flag) {
      this.I1IIIII1IIlIIllIlI1I1l1l1lIII.StringHolder_8(flag ? 1.0F : 0.0F);
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font1 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      Font font2 = Fonts.NEW_ICONS.getFont(5.5F);
      String s = this.lIIIlI11IIll1I1l.getIcon();
      String s1 = this.lIIIlI11IIll1I1l.getDisplayName();
      String s2 = this.lIIIlI11IIll1I1l.Il11I1IIII1l1lIlI1();
      if (s2 == null || s2.isEmpty()) {
         s2 = "-";
      }

      float f3 = font1.width(s2);
      float f4 = Math.max(this.getHeight(), (float)GuiStyle.PADDING.intValue() + f3);
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      lliii11l1lllil.getMatrices().translate(f + f2 / 2.0F, f1 + this.getHeight() / 2.0F, 0.0F);
      lliii11l1lllil.getMatrices()
         .scale(this.I1IIIII1IIlIIllIlI1I1l1l1lIII.CloudFriendInfo(), this.I1IIIII1IIlIIllIlI1I1l1l1lIII.CloudFriendInfo(), 1.0F);
      lliii11l1lllil.getMatrices().translate(-(f + f2 / 2.0F), -(f1 + this.getHeight() / 2.0F), 0.0F);
      lliii11l1lllil.StringHolder_8(
         font2, s, f + 8.0F, f1 + (this.getHeight() - font2.height()) / 2.0F, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         font,
         s1,
         f + 8.0F + font2.width(s) + (float)GuiStyle.PADDING.intValue(),
         f1 + (this.getHeight() - font.height()) / 2.0F,
         zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      float f5 = f + f2 - f4 - (float)(GuiStyle.PADDING * 2);
      lliii11l1lllil.StringHolder_8(
         f5, f1, f4, this.getHeight(), floatHolder_5.StringHolder_30(1.0F), zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         font1, s2, f5 + (f4 - f3) / 2.0F, f1 + (this.getHeight() - font1.height()) / 2.0F, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.IIlII1lII1();
   }

   boolean IlIl11l11ll() {
      return this.I1IIIII1IIlIIllIlI1I1l1l1lIII.CloudFriendInfo() == 0.0F;
   }
}
