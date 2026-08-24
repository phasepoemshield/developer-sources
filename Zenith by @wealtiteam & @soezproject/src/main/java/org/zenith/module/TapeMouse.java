package org.zenith.module;

import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.util.CooldownTimer;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventTick;

import org.zenith.setting.ModeSetting3;
import org.zenith.setting.NumberSetting;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;

@ModuleInfo(
   name = "TapeMouse",
   category = Category.MISC,
   description = "module.tapeMouse.desc"
)
public final class TapeMouse extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final TapeMouse tapeMouse = new TapeMouse();
   public final ModeSetting3 mouseButton = new ModeSetting3(
      "module.tapeMouse.mouseButton", "module.tapeMouse.mouseButton.desc", "module.tapeMouse.right", "module.tapeMouse.left"
   );
   public final NumberSetting delay4 = new NumberSetting(
      "module.tapeMouse.delay", 100.0F, 0.0F, 1000.0F, 10.0F, "module.tapeMouse.delay.desc", "ms"
   );
   public final CooldownTimer zClass06736 = new CooldownTimer();

   public TapeMouse() {
   }

   @Override
   public void onDisable() {
      this.call182();
      super.onDisable();
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null && minecraftClient3.currentScreen == null) {
         if (!this.zClass06736.EventModifyMouseRotationInput((long)this.delay4.getCurrent())) {
            this.call182();
         } else {
            this.call182();
            this.on23(this.path7());
            this.zClass06736.reset();
         }
      } else {
         this.call182();
      }
   }

   public KeyBinding path7() {
      return this.mouseButton.is(0) ? minecraftClient3.options.useKey : minecraftClient3.options.attackKey;
   }

   public void on23(KeyBinding var1) {
      var1.setPressed(true);
      KeyBinding.onKeyPressed(KeyBindingHelper.getBoundKeyOf(var1));
   }

   public void call182() {
      minecraftClient3.options.useKey.setPressed(false);
      minecraftClient3.options.attackKey.setPressed(false);
   }
}
