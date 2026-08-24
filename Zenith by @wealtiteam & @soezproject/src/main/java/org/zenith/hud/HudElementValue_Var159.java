package org.zenith.hud;

import org.zenith.event.Event18;
import org.zenith.event.MovementInputEvent;
import org.zenith.event.StopUsingItemEvent;
import org.zenith.module.Module;
import org.zenith.util.Item;
import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.util.ArgbColor;
import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClientProvider;

import org.zenith.module.Interface;

import org.zenith.base.font.Font;
import org.zenith.base.font.Fonts;
import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.utility.render.display.base.CustomDrawContext;














import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;

class HudElementValue_Var159 {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public final UiAnimation var1435 = new UiAnimation(150L, 0.0F, Easing.StopUsingItemEvent);
   public final UiAnimation var1436 = new UiAnimation(150L, 0.0F, Easing.StopUsingItemEvent);
   public final int int126;

   public HudElementValue_Var159(HudElementValue var1, int var2) {
      this.int126 = var2;
   }

   public void on23(CustomDrawContext var1, float var2, float var3, ZenithStyle var4) {
      float f = Interface.float212();
      org.zenith.utility.render.display.base.CornerRadius ii1il11l111ii11iil = org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(
         f
      );
      this.var1435.on23(80L);
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      this.var1435
         .on23(this.int126 == ClientProvider.minecraftClient3.player.getInventory().selectedSlot ? 1.0F : 0.0F);
      ArgbColor i11ii1llliilllii1i1 = var4.getHeaderHudBackground().getColor(this.var1435.Event18());
      ArgbColor i11ii1llliilllii1i11 = var4.getTextSecondary()
         .getColor()
         .Easing(var4.getTextEnable().getColor(), this.var1435.Event18());
      ItemStack itemstack = ClientProvider.minecraftClient3.player.getInventory().main.get(this.int126);
      this.var1436.on23(itemstack.isEmpty());
      var1.drawRoundedRect(var2, var3, 22.0F, 22.0F, ii1il11l111ii11iil, i11ii1llliilllii1i1);
      var1.pushMatrix();
      var1.getMatrices().translate((double)var2 + 4.6, (double)var3 + 4.6, 1.0);
      var1.getMatrices().scale(0.8F, 0.8F, 0.8F);
      var1.drawItem(itemstack, 0, 0);
      var1.drawItemBar(itemstack, 0, 0);
      var1.drawCooldownProgress(itemstack, 0, 0);
      var1.popMatrix();
      var1.drawText(
         font,
         String.valueOf(this.int126 + 1),
         var2 + (22.0F - font.width(String.valueOf(this.int126 + 1))) / 2.0F,
         var3 + (22.0F - font.height()) / 2.0F,
         var4.getTextTertiary().getColor(this.var1436.Event18())
      );
      if (itemstack.getCount() > 1) {
         String s = "x" + itemstack.getCount();
         float f1 = font.width(s);
         float f2 = var2 + 22.0F - f1 - 3.0F;
         float f3 = var3 + 22.0F - font.height() - 3.0F;
         var1.drawText(font, s, f2, f3, i11ii1llliilllii1i11);
      }
   }
}
