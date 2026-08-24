package org.zenith.module;

import org.zenith.core.ItemRegistry;
import org.zenith.core.NbtItemSpec;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventRenderScreenHook;
import org.zenith.event.EventTriggerKeyEvent;

import org.zenith.setting.StringSetting2;

import org.zenith.client.screens.bot.BotScreen;















import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;

@ModuleInfo(
   name = "Bot",
   category = Category.PLAYER,
   description = "",
   long120 = true
)
public final class Bot extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final Bot bot = new Bot();
   public final StringSetting2 openGui = new StringSetting2("module.bot.openGui", 345);

   public Bot() {
   }

   public void float366() {
      if (!(minecraftClient3.currentScreen instanceof BotScreen)) {
         minecraftClient3.setScreen(new BotScreen());
         ZenithClient.on23()
            .NbtItemSpec()
            .on23(ZenithClient.on23().NbtItemSpec().soundEvent);
      }
   }

   @EventTarget
   public void on23(EventTriggerKeyEvent var1) {
      if (var1.ItemRegistry(this.openGui.getKeyCode())) {
         this.float366();
      }
   }

   @EventTarget(3)
   public void on23(EventRenderScreenHook var1) {
      if (minecraftClient3.currentScreen instanceof BotScreen botscreen) {
         botscreen.renderTop(var1.WarpFarm(), (float)var1.WarpFarm().getMouseX(), (float)var1.WarpFarm().getMouseY());
      }
   }
}
