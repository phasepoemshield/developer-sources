package org.zenith.module;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventTick;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.client.gui.screen.DeathScreen;

@ModuleInfo(
   name = "AutoRespawn",
   category = Category.MISC,
   description = "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0432\u043e\u0437\u0440\u043e\u0436\u0434\u0430\u0435\u0442\u0441\u044f \u043f\u043e\u0441\u043b\u0435 \u0441\u043c\u0435\u0440\u0442\u0438"
)
public final class AutoRespawn extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final AutoRespawn autoRespawn = new AutoRespawn();

   public AutoRespawn() {
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null) {
         if (minecraftClient3.currentScreen instanceof DeathScreen && minecraftClient3.player.deathTime > 5) {
            minecraftClient3.player.requestRespawn();
            minecraftClient3.setScreen(null);
         }
      }
   }
}
