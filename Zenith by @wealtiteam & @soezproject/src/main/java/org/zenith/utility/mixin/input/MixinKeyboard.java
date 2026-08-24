package org.zenith.utility.mixin.input;

import org.zenith.event.EventTriggerKeyEvent;

import org.zenith.event.EventTriggerKeyEvent;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;













import com.darkmagician6.eventapi.EventManager;
import net.minecraft.client.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Keyboard.class})
public class MixinKeyboard {
   public MixinKeyboard() {
   }

   @Inject(
      method = {"onKey"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void triggerKeyEvent(long var1, int var3, int var4, int var5, int var6, CallbackInfo var7) {
      if (var3 != -1) {
         EventManager.call(new EventTriggerKeyEvent(var5, var3));
      }
   }
}
