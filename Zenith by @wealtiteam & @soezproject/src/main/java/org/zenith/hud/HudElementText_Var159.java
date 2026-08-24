package org.zenith.hud;

import org.zenith.core.TextScanner;
import org.zenith.event.MovementInputEvent;
import org.zenith.module.Module;
import org.zenith.util.Item;
import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.util.ArgbColor;
import org.zenith.ZenithClient;
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

class HudElementText_Var159 {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public final int int125;

   public HudElementText_Var159(HudElementText var1, int var2) {
      this.int125 = var2;
   }

   public void on23(CustomDrawContext var1, float var2, float var3, ZenithStyle var4) {
      float f = Interface.float212();
      org.zenith.utility.render.display.base.CornerRadius ii1il11l111ii11iil = org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(
         f
      );
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      ArgbColor i11ii1llliilllii1i1 = var4.getTextEnable().getColor();
      ItemStack itemstack = ClientProvider.minecraftClient3.player.getInventory().armor.get(3 - this.int125);
      if (!itemstack.isEmpty()) {
         var1.pushMatrix();
         var1.getMatrices().translate((double)var2 + 4.6, (double)var3 + 4.6, 1.0);
         var1.getMatrices().scale(0.8F, 0.8F, 0.8F);
         var1.drawItem(itemstack, 0, 0);
         var1.drawItemBar(itemstack, 0, 0);
         var1.drawCooldownProgress(itemstack, 0, 0);
         var1.popMatrix();
         if (itemstack.getCount() > 1) {
            String s = "x" + itemstack.getCount();
            float f1 = font.width(s);
            float f2 = var2 + 22.0F - f1 - 3.0F;
            float f3 = var3 + 22.0F - font.height() - 3.0F;
            var1.drawText(font, s, f2, f3, i11ii1llliilllii1i1);
         }
      } else {
         Font font1 = Fonts.ICONS.getFont(4.5F);
         var1.drawText(
            font1,
            "M",
            var2 + (22.0F - font1.width("M")) / 2.0F,
            var3 + (22.0F - font1.height()) / 2.0F,
            ZenithClient.on23().TextScanner().getCurrentStyle().getTextTertiary().getColor()
         );
      }
   }
}
