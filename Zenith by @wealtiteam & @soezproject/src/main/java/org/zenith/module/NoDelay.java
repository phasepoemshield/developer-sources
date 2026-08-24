package org.zenith.module;

import org.zenith.config.ConfigJsonUtil;
import org.zenith.ZenithClient;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.core.UiAnimation;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventTick;

import org.zenith.setting.ModeSetting;



import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.List;
import java.util.Objects;

@ModuleInfo(
   name = "NoDelay",
   description = "",
   category = Category.MOVEMENT
)
public final class NoDelay extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public final ModeSetting modeSetting11 = ModeSetting.on23(
      "module.noDelay.ignoreSetting",
      "module.noDelay.ignoreSetting.desc",
      List.of("module.noDelay.ignoreSetting.jump", "module.noDelay.ignoreSetting.use", "module.noDelay.ignoreSetting.break")
   );
   public static final NoDelay noDelay = new NoDelay();

   public NoDelay() {
   }

   @EventTarget
   public void UiAnimation(EventTick var1) {
      if (this.modeSetting11.ConfigJsonUtil(2)) {
         minecraftClient3.interactionManager.blockBreakingCooldown = 0;
      }

      if (this.modeSetting11.ConfigJsonUtil(0)) {
         Objects.requireNonNull(minecraftClient3.player).jumpingCooldown = 0;
      }

      if (this.modeSetting11.ConfigJsonUtil(1)) {
         minecraftClient3.itemUseCooldown = 0;
      }
   }
}
