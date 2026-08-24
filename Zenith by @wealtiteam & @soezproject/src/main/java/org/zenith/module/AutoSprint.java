package org.zenith.module;

import org.zenith.ZenithClient;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.core.Easing;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.AttackEntityEvent;
import org.zenith.event.EventTick;

import org.zenith.setting.BooleanSetting;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;

@ModuleInfo(
   name = "AutoSprint",
   category = Category.MOVEMENT,
   description = "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0432\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0441\u043f\u0440\u0438\u043d\u0442"
)
public final class AutoSprint extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final AutoSprint autoSprint = new AutoSprint();
   public final BooleanSetting keepSwing = new BooleanSetting("module.autoSprint.keepSwing", "module.autoSprint.keepSwing.desc", false);
   public boolean sprint = false;

   public boolean call070() {
      return this.keepSwing.isEnabled();
   }

   public AutoSprint() {
   }

   @Override
   public void onEnable() {
      super.onEnable();
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      minecraftClient3.options.sprintKey.setPressed(true);
      if (this.keepSwing.isEnabled() && minecraftClient3.player != null && minecraftClient3.player.isSubmergedInWater()) {
         minecraftClient3.player.setSwimming(true);
      }
   }

   @EventTarget
   public void Easing(AttackEntityEvent var1) {
      if (this.keepSwing.isEnabled()) {
         if (var1.ElytraTarget() == AttackEntityEvent.on23.call185) {
            this.sprint = minecraftClient3.player.isSprinting();
         } else if (this.sprint) {
            minecraftClient3.player.setSprinting(true);
         }
      }
   }

   public double call157() {
      return 1.0;
   }
}
