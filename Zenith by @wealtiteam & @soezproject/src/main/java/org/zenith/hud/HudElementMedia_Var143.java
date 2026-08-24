package org.zenith.hud;

import org.zenith.core.ItemRegistry;
import org.zenith.core.TextScanner;
import org.zenith.event.Event18;
import org.zenith.event.MovementInputEvent;
import org.zenith.event.StopUsingItemEvent;
import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.util.ArgbColor;
import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.ClientProvider;

import org.zenith.base.font.Font;
import org.zenith.base.font.Fonts;
import org.zenith.client.screens.nlgui.style.GuiStyle;
import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.utility.render.display.base.CustomDrawContext;














import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.util.DefaultSkinHelper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

class HudElementMedia_Var143 {
   public final HudElementMedia val196;
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public final UiAnimation var14310;
   public final Text text5;
   public final String string40;
   public final String string41;
   public final HudElementMedia_Var165 var140Var1652;
   public final long long102;

   public HudElementMedia_Var143(HudElementMedia var1, Text var2, String var3, String var4, HudElementMedia_Var165 var5) {
      this.val196 = var1;
      this.var14310 = new UiAnimation(150L, 0.01F, Easing.StopUsingItemEvent);
      this.text5 = var2;
      this.string40 = var3;
      this.string41 = var4;
      this.var140Var1652 = var5;
      this.long102 = System.currentTimeMillis();
   }

   public float float205() {
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font1 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      float f = 100.0F;
      String s = this.val196.ItemRegistry(System.currentTimeMillis() - this.long102);
      float f1 = (float)(14 + GuiStyle.PADDING) + font.width(this.text5);
      float f2 = font1.width(s);
      float f3 = Math.max(this.getHeight(), (float)GuiStyle.PADDING.intValue() + f2);
      float f4 = (float)(GuiStyle.PADDING * 2) + f3 + 8.0F;
      float f5 = f - (f4 + 8.0F);
      if (f5 < f1 + 8.0F) {
         f += f1 + 8.0F - f5;
      }

      return f;
   }

   public float getHeight() {
      return 7.0F;
   }

   public void on23(CustomDrawContext var1, float var2, float var3, float var4, boolean var5) {
      ZenithStyle zenithstyle = ZenithClient.on23().TextScanner().getCurrentStyle();
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font1 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      this.var14310.on23(var5 ? 1.0F : 0.0F);
      var1.pushMatrix();
      var1.getMatrices().translate(var2 + var4 / 2.0F, var3 + this.getHeight() / 2.0F, 0.0F);
      var1.getMatrices().scale(this.var14310.Event18(), this.var14310.Event18(), 1.0F);
      var1.getMatrices().translate(-(var2 + var4 / 2.0F), -(var3 + this.getHeight() / 2.0F), 0.0F);
      Identifier identifier = this.val196.map38.get(this.string41);
      if (identifier == null && ClientProvider.minecraftClient3.getNetworkHandler() != null) {
         PlayerListEntry playerlistentry = ClientProvider.minecraftClient3
            .getNetworkHandler()
            .getPlayerList()
            .stream()
            .filter(var1x -> var1x.getProfile() != null && this.string41.equals(var1x.getProfile().getName()))
            .findFirst()
            .orElse(null);
         if (playerlistentry != null && playerlistentry.getSkinTextures() != null) {
            identifier = playerlistentry.getSkinTextures().texture();
            this.val196.map38.put(this.string41, identifier);
         }
      }

      if (identifier == null) {
         identifier = DefaultSkinHelper.getSteve().texture();
      }

      float f5 = 6.0F;
      float f = var2 + 8.0F;
      float f1 = var3 + (this.getHeight() - f5) / 2.0F;
      var1.drawPlayerHeadWithRoundedShader(
         identifier,
         f,
         f1,
         f5,
         org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(1.6F),
         ArgbColor.var11934
      );
      var1.drawText(
         font,
         this.text5,
         var2 + 8.0F + f5 + (float)GuiStyle.PADDING.intValue(),
         var3 + (this.getHeight() - font.height()) / 2.0F,
         zenithstyle.getTextEnable().getColor().call001()
      );
      String s = this.val196.ItemRegistry(System.currentTimeMillis() - this.long102);
      float f2 = font1.width(s);
      float f3 = Math.max(this.getHeight(), (float)GuiStyle.PADDING.intValue() + f2);
      float f4 = var2 + var4 - f3 - (float)(GuiStyle.PADDING * 2);
      var1.drawRoundedRect(
         f4,
         var3,
         f3,
         this.getHeight(),
         org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(1.0F),
         zenithstyle.getHeaderHudBackground().getColor()
      );
      var1.drawText(font1, s, f4 + (f3 - f2) / 2.0F, var3 + (this.getHeight() - font1.height()) / 2.0F, zenithstyle.getTextEnable().getColor());
      var1.popMatrix();
   }

   public boolean float206() {
      return this.var14310.Event18() == 0.0F;
   }
}
