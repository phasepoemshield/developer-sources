package zenith.zov.client.screens.nlgui.panel;

import zenith.hud.*;

import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.IReturn;
import zenith.ZenithInternal068;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.NLMenuScreen$ElementsType;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

class MiscPanel$RenderMisc {
   private final GetStartTimeHandler animation;
   private HeightHandler bounds;
   private final NLMenuScreen$ElementsType type;

   MiscPanel$RenderMisc(MiscPanel miscpanel, NLMenuScreen$ElementsType nlmenuscreen$elementstype) {
      this.type = nlmenuscreen$elementstype;
      this.animation = new GetStartTimeHandler(200L, 0.0F, IReturn.ScreenImpl);
   }

   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, double d0, double d1, float f, float f1, float f2, boolean flag) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f3 = (float)(GuiStyle.PADDING * 2);
         this.bounds = new HeightHandler(f, f1 - f3, 80.0F, 7.0F + f3 * 2.0F);
         this.animation.StringHolder_8(flag ? 1.0F : (this.bounds.byteHolder(d0, d1) ? 0.7F : 0.0F));
         float f4 = 7.0F;
         Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
         float f5 = f + 5.5F + (float)GuiStyle.PADDING.intValue();
         float f6 = f1 + (f4 - font.height()) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            this.type.getName(),
            f5,
            f6,
            zenithstyle.getTextSecondary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animation.CloudFriendInfo())
               .ZenithInternal039(f2)
         );
         Font font1 = Fonts.NEW_ICONS.getFont(5.5F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            this.type.getIcon(),
            f,
            f1 + (f4 - font1.height()) / 2.0F - 0.15F,
            zenithstyle.getTextTertiary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(
                  zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(),
                  this.animation.CloudFriendInfo() * this.animation.CloudFriendInfo()
               )
               .ZenithInternal039(f2)
         );
      }
   }

   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds == null) {
         return false;
      } else if (this.bounds.byteHolder(d0, d1)) {
         ZenithClient.getInstance().ZenithInternal141().setType(this.type);
         return true;
      } else {
         return false;
      }
   }
}
