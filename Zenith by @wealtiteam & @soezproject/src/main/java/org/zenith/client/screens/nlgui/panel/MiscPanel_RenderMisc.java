package org.zenith.client.screens.nlgui.panel;

import org.zenith.client.screens.nlgui.panel.api.Panel;
import org.zenith.core.PotionItemBuilder;
import org.zenith.core.NbtEditor;
import org.zenith.core.TextScanner;
import org.zenith.event.CloseScreenEvent;
import org.zenith.event.Event18;
import org.zenith.event.SprintStateEvent;


import org.zenith.base.font.Font;
import org.zenith.base.font.Fonts;
import org.zenith.client.screens.nlgui.NLMenuScreen_ElementsType;
import org.zenith.client.screens.nlgui.style.GuiStyle;
import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.utility.render.display.base.HudDrawContext;
import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.utility.render.display.base.CornerRadiusF;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.MenuScreenId;
import org.zenith.core.CloudResponse;
















class MiscPanel_RenderMisc {
   public final UiAnimation animation;
   public CornerRadiusF bounds;
   public final NLMenuScreen_ElementsType type;

   MiscPanel_RenderMisc(MiscPanel var1, NLMenuScreen_ElementsType var2) {
      this.type = var2;
      this.animation = new UiAnimation(200L, 0.0F, Easing.CloseScreenEvent);
   }

   public void render(HudDrawContext var1, double var2, double var4, float var6, float var7, float var8, boolean var9) {
      ZenithStyle zenithstyle = ZenithClient.on23().TextScanner().getCurrentStyle();
      if (zenithstyle != null) {
         float f = (float)(GuiStyle.PADDING * 2);
         this.bounds = new CornerRadiusF(var6, var7 - f, 80.0F, 7.0F + f * 2.0F);
         this.animation.on23(var9 ? 1.0F : (this.bounds.PotionItemBuilder(var2, var4) ? 0.7F : 0.0F));
         float f1 = 7.0F;
         Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
         float f2 = var6 + 5.5F + (float)GuiStyle.PADDING.intValue();
         float f3 = var7 + (f1 - font.height()) / 2.0F;
         var1.drawText(
            font,
            this.type.getName(),
            f2,
            f3,
            zenithstyle.getTextSecondary()
               .getColor()
               .Easing(zenithstyle.getTextEnable().getColor(), this.animation.Event18())
               .SprintStateEvent(var8)
         );
         Font font1 = Fonts.NEW_ICONS.getFont(5.5F);
         var1.drawText(
            font1,
            this.type.getIcon(),
            var6,
            var7 + (f1 - font1.height()) / 2.0F - 0.15F,
            zenithstyle.getTextTertiary()
               .getColor()
               .Easing(
                  zenithstyle.getPrimaryColor().getColor(), this.animation.Event18() * this.animation.Event18()
               )
               .SprintStateEvent(var8)
         );
      }
   }

   public boolean onMouseClicked(double var1, double var3, MenuScreenId var5) {
      if (this.bounds == null) {
         return false;
      } else if (this.bounds.PotionItemBuilder(var1, var3)) {
         ZenithClient.on23().NbtEditor().setType(this.type);
         return true;
      } else {
         return false;
      }
   }
}
