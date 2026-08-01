package zenith.hud;

import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class Watermark extends HudElement {
   public Watermark(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      Font font = Fonts.NEW_ICONS.getFont(6.6F);
      Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
      Font font2 = Fonts.NEW_REGULAR.getFont(5.4F);
      float f = 7.0F;
      float f1 = 24.0F;
      float f2 = font1.width(ZenithClient.getInstance().ListHolder_7().getUsername());
      this.width = Math.max(
         65.0F, f1 + (float)GuiStyle.PADDING.intValue() + f + (float)GuiStyle.PADDING.intValue() / 2.0F + f2 + (float)GuiStyle.PADDING.intValue()
      );
      this.height = f1;
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      floatHolder_8.Event(
         lliii11l1lllil.getMatrices(),
         this.x,
         this.y,
         this.width,
         f1,
         12.0F,
         floatHolder_5.StringHolder_30(Interface.lIl111ll1l111lIIlIlI1I1()),
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      lliii11l1lllil.StringHolder_8(
         this.x,
         this.y,
         this.width,
         f1,
         floatHolder_5.StringHolder_30(Interface.lIl111ll1l111lIIlIlI1I1()),
         zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         this.x,
         this.y,
         f1,
         f1,
         floatHolder_5.StringHolder_30(Interface.lIl111ll1l111lIIlIlI1I1()),
         zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         font,
         "1",
         this.x + (f1 - font.width("1")) / 2.0F,
         this.y + (f1 - font.height()) / 2.0F,
         zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      float f3 = this.x + f1 + (float)GuiStyle.PADDING.intValue();
      float f4 = this.y + (f1 - (font2.height() + 1.0F + f)) / 2.0F;
      lliii11l1lllil.StringHolder_8(font2, "Zenith Client", f3, f4, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1());
      floatHolder_8.StringHolder_8(
         lliii11l1lllil.getMatrices(),
         ZenithClient.StringHolder_10("icons/avatar.png"),
         f3,
         f4 + font2.height() + 2.0F,
         f,
         f,
         floatHolder_5.StringHolder_30(2.0F),
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      lliii11l1lllil.StringHolder_8(
         font1,
         ZenithClient.getInstance().ListHolder_7().getUsername(),
         f3 + f + (float)GuiStyle.PADDING.intValue() / 2.0F,
         f4 + font2.height() + 2.0F,
         zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
   }
}
