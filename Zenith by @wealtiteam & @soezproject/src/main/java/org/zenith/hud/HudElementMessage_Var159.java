package org.zenith.hud;

import org.zenith.core.TextScanner;
import org.zenith.event.Event18;
import org.zenith.event.MovementInputEvent;
import org.zenith.event.StopUsingItemEvent;
import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.ChatTagParser;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;

import org.zenith.base.font.Font;
import org.zenith.base.font.Fonts;
import org.zenith.client.screens.nlgui.style.GuiStyle;
import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.utility.render.display.base.CustomDrawContext;















class HudElementMessage_Var159 {
   public final UiAnimation var1439 = new UiAnimation(150L, 0.01F, Easing.StopUsingItemEvent);
   public ChatTagParser var110;

   HudElementMessage_Var159(HudElementMessage var1, ChatTagParser var2) {
      this.var110 = var2;
   }

   void UiAnimation(ChatTagParser var1) {
      this.var110 = var1;
   }

   float float205() {
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font1 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      Font font2 = Fonts.NEW_ICONS.getFont(5.5F);
      String s = this.var110.getDisplayName();
      String s1 = this.var110.call440();
      if (s1 == null || s1.isEmpty()) {
         s1 = "-";
      }

      float f = 100.0F;
      float f1 = 8.0F + font2.width(this.var110.getIcon()) + (float)GuiStyle.PADDING.intValue() + font.width(s);
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

   void on23(CustomDrawContext var1, float var2, float var3, float var4, boolean var5) {
      this.var1439.on23(var5 ? 1.0F : 0.0F);
      ZenithStyle zenithstyle = ZenithClient.on23().TextScanner().getCurrentStyle();
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font1 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      Font font2 = Fonts.NEW_ICONS.getFont(5.5F);
      String s = this.var110.getIcon();
      String s1 = this.var110.getDisplayName();
      String s2 = this.var110.call440();
      if (s2 == null || s2.isEmpty()) {
         s2 = "-";
      }

      float f = font1.width(s2);
      float f1 = Math.max(this.getHeight(), (float)GuiStyle.PADDING.intValue() + f);
      var1.pushMatrix();
      var1.getMatrices().translate(var2 + var4 / 2.0F, var3 + this.getHeight() / 2.0F, 0.0F);
      var1.getMatrices()
         .scale(this.var1439.Event18(), this.var1439.Event18(), 1.0F);
      var1.getMatrices().translate(-(var2 + var4 / 2.0F), -(var3 + this.getHeight() / 2.0F), 0.0F);
      var1.drawText(font2, s, var2 + 8.0F, var3 + (this.getHeight() - font2.height()) / 2.0F, zenithstyle.getPrimaryColor().getColor());
      var1.drawText(
         font,
         s1,
         var2 + 8.0F + font2.width(s) + (float)GuiStyle.PADDING.intValue(),
         var3 + (this.getHeight() - font.height()) / 2.0F,
         zenithstyle.getTextEnable().getColor()
      );
      float f2 = var2 + var4 - f1 - (float)(GuiStyle.PADDING * 2);
      var1.drawRoundedRect(
         f2,
         var3,
         f1,
         this.getHeight(),
         org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(1.0F),
         zenithstyle.getHeaderHudBackground().getColor()
      );
      var1.drawText(font1, s2, f2 + (f1 - f) / 2.0F, var3 + (this.getHeight() - font1.height()) / 2.0F, zenithstyle.getTextEnable().getColor());
      var1.popMatrix();
   }

   boolean float206() {
      return this.var1439.Event18() == 0.0F;
   }
}
