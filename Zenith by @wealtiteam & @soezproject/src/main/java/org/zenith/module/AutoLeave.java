package org.zenith.module;

import org.zenith.config.ConfigJsonUtil;
import org.zenith.core.UiAnimation;
import org.zenith.core.MediaTrackInfo;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventTick;

import org.zenith.setting.BooleanSetting2;
import org.zenith.setting.ModeSetting;
import org.zenith.setting.ModeSetting2;
import org.zenith.setting.NumberSetting;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.List;
import net.minecraft.entity.player.PlayerEntity;

@ModuleInfo(
   name = "AutoLeave",
   category = Category.MISC,
   description = ""
)
public final class AutoLeave extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final AutoLeave autoLeave = new AutoLeave();
   public final ModeSetting modeSetting2 = ModeSetting.on23(
      "leave.factor", "module.autoLeave.leaveFactor.desc", List.of("leave.health", "leave.players", "Distance")
   );
   public final NumberSetting health = new NumberSetting(
      "leave.health", 15.0F, 1.0F, 20.0F, 1.0F, "module.autoLeave.minHealth.desc", "hp", () -> this.modeSetting2.ConfigJsonUtil(0), null
   );
   public final NumberSetting radius = new NumberSetting(
      "Radius", 300.0F, 3.0F, 300.0F, 10.0F, "module.autoLeave.leaveRadius.desc", "b", () -> this.modeSetting2.ConfigJsonUtil(2), null
   );
   public final NumberSetting time = new NumberSetting(
      "leave.time", 0.0F, 0.0F, 200.0F, 10.0F, "module.autoLeave.leaveTime.desc", "s"
   );
   public final BooleanSetting2 command = new BooleanSetting2("leave.command", "module.autoLeave.command.desc", "/hub", "leave.command.description");
   public int int45 = 0;

   public AutoLeave() {
   }

   @Override
   public void onEnable() {
      this.int45 = -1;
      super.onEnable();
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      if (this.call118()) {
         this.int45++;
      }

      if ((float)this.int45 >= this.time.getCurrent()) {
         if (this.command.getValue().startsWith("/")) {
            minecraftClient3.player.networkHandler.sendChatCommand(this.command.getValue().substring(1));
         } else {
            minecraftClient3.player.networkHandler.sendChatMessage(this.command.getValue());
         }

         this.toggle();
      }
   }

   public boolean call118() {
      if (minecraftClient3.player.getHealth() < this.health.getCurrent() && this.modeSetting2.ConfigJsonUtil(0)) {
         return true;
      } else {
         for (PlayerEntity playerentity : minecraftClient3.world.getPlayers()) {
            if (!ZenithClient.on23().MediaTrackInfo().UiAnimation(playerentity)
               && playerentity != minecraftClient3.player
               && (
                  !this.modeSetting2.ConfigJsonUtil(2)
                     || !(
                        playerentity.squaredDistanceTo(minecraftClient3.player)
                           > (double)(this.radius.getCurrent() * this.radius.getCurrent())
                     )
               )) {
               return true;
            }
         }

         return false;
      }
   }
}
