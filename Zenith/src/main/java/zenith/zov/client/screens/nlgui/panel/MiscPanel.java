package zenith.zov.client.screens.nlgui.panel;

import java.util.ArrayList;
import java.util.List;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.ZenithInternal068;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.NLMenuScreen$ElementsType;
import zenith.zov.client.screens.nlgui.panel.api.Panel;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class MiscPanel extends Panel {
   private final List<MiscPanel$RenderMisc> renderCategories = new ArrayList<>();

   public MiscPanel() {
      for (NLMenuScreen$ElementsType nlmenuscreen$elementstype : NLMenuScreen$ElementsType.values()) {
         if (nlmenuscreen$elementstype != NLMenuScreen$ElementsType.CATEGORY) {
            this.renderCategories.add(new MiscPanel$RenderMisc(this, nlmenuscreen$elementstype));
         }
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2) {
      float f3 = 96.0F;
      float f4 = 93.0F;
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      iiii1ilili1l1l1lilli1liliii.EventBus(
         f1,
         f2,
         f3,
         f4,
         floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
         zenithstyle.getPanelLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );
      iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
      float f5 = f1 + (float)(GuiStyle.PADDING * 2);
      float f6 = f2 + (float)(GuiStyle.PADDING * 2);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         Fonts.NEW_REGULAR.getFont(5.0F), "Misc", f5, f6, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
      );

      try {
         f6 += (float)(GuiStyle.PADDING * 2 + 5);

         for (MiscPanel$RenderMisc miscpanel$rendermisc : this.renderCategories) {
            miscpanel$rendermisc.render(
               iiii1ilili1l1l1lilli1liliii,
               (double)i,
               (double)j,
               f5,
               f6,
               f,
               miscpanel$rendermisc.type == ZenithClient.getInstance().ZenithInternal141().getType()
            );
            f6 += 7.0F;
            f6 += 12.0F;
         }
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (MiscPanel$RenderMisc miscpanel$rendermisc : this.renderCategories) {
         if (miscpanel$rendermisc.onMouseClicked(d0, d1, ill1iili11ii1l)) {
            return true;
         }
      }

      return false;
   }
}
