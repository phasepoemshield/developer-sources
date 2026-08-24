package org.zenith.client.screens.nlgui.panel;

import org.zenith.base.font.Font;
import org.zenith.core.NbtEditor;
import org.zenith.core.TextScanner;
import org.zenith.event.MovementInputEvent;
import org.zenith.event.SprintStateEvent;
import org.zenith.module.Category;
import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.base.font.Fonts;
import org.zenith.client.screens.nlgui.NLMenuScreen_ElementsType;
import org.zenith.client.screens.nlgui.panel.api.Panel;
import org.zenith.client.screens.nlgui.style.GuiStyle;
import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.utility.render.display.base.HudDrawContext;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.MenuScreenId;
import org.zenith.core.CloudResponse;















import java.util.ArrayList;
import java.util.List;

public class MiscPanel extends Panel {
   public final List<MiscPanel_RenderMisc> renderCategories = new ArrayList<>();

   @Override
   public void render(HudDrawContext var1, int var2, int var3, float var4, float var5, float var6) {
      float f = 96.0F;
      float f1 = 112.0F;
      ZenithStyle zenithstyle = ZenithClient.on23().TextScanner().getCurrentStyle();
      var1.drawRoundedRectBatched(
         var5,
         var6,
         f,
         f1,
         org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent((float)GuiStyle.ROUND.intValue()),
         zenithstyle.getPanelLeftBackground().getColor().SprintStateEvent(var4)
      );
      var1.flushRoundedRects();
      float f2 = var5 + (float)(GuiStyle.PADDING * 2);
      float f3 = var6 + (float)(GuiStyle.PADDING * 2);
      var1.drawText(Fonts.NEW_REGULAR.getFont(5.0F), "Misc", f2, f3, zenithstyle.getTextTertiary().getColor().SprintStateEvent(var4));

      try {
         f3 += (float)(GuiStyle.PADDING * 2 + 5);

         for (MiscPanel_RenderMisc miscpanel_rendermisc : this.renderCategories) {
            miscpanel_rendermisc.render(
               var1, (double)var2, (double)var3, f2, f3, var4, miscpanel_rendermisc.type == ZenithClient.on23().NbtEditor().getType()
            );
            f3 += 7.0F;
            f3 += 12.0F;
         }
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   public MiscPanel() {
      for (NLMenuScreen_ElementsType nlmenuscreen_elementstype : NLMenuScreen_ElementsType.values()) {
         if (nlmenuscreen_elementstype != NLMenuScreen_ElementsType.CATEGORY) {
            this.renderCategories.add(new MiscPanel_RenderMisc(this, nlmenuscreen_elementstype));
         }
      }
   }

   @Override
   public boolean onMouseClicked(double var1, double var3, MenuScreenId var5) {
      for (MiscPanel_RenderMisc miscpanel_rendermisc : this.renderCategories) {
         if (miscpanel_rendermisc.onMouseClicked(var1, var3, var5)) {
            return true;
         }
      }

      return false;
   }
}
