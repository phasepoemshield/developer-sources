package org.zenith.module;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.core.UiAnimation;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventTick;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.screen.ShulkerBoxScreenHandler;

@ModuleInfo(
   name = "ShulkerJump",
   category = Category.MOVEMENT,
   description = "\u041f\u043e\u0434\u043b\u0435\u0442\u0430\u0435\u0448\u044c \u0432\u0432\u0435\u0440\u0445 \u043f\u0440\u0438 \u0432\u0437\u0430\u0438\u043c\u043e\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0438 \u0441 \u0448\u0430\u043b\u043a\u0435\u0440\u043e\u043c"
)
public final class ShulkerJump extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final ShulkerJump shulkerJump = new ShulkerJump();
   int int338 = 0;
   boolean val206 = false;

   public ShulkerJump() {
   }

   @EventTarget
   public void UiAnimation(EventTick var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null) {
         if (minecraftClient3.player.currentScreenHandler instanceof ShulkerBoxScreenHandler && !this.val206) {
            minecraftClient3.options.jumpKey.setPressed(true);
            minecraftClient3.player.closeHandledScreen();
            minecraftClient3.player.addVelocity(0.0, 2.4, 0.0);
            this.val206 = true;
            this.int338 = 0;
         }

         if (this.val206) {
            if (this.int338 >= 5) {
               minecraftClient3.player.closeHandledScreen();
               minecraftClient3.options.jumpKey.setPressed(false);
               this.val206 = false;
               this.int338 = 0;
            } else {
               this.int338++;
            }
         }
      }
   }
}
