package org.zenith.module;

import org.zenith.ZenithClient;

import org.zenith.core.UiAnimation;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.ChatMessageEvent;
import org.zenith.event.DataChangedEvent;


import com.darkmagician6.eventapi.EventTarget;

class AutoWarden_1 {
   public final AutoWarden val437;
   AutoWarden_1(AutoWarden var1) {
      this.val437 = var1;
   }

   @EventTarget
   public void UiAnimation(ChatMessageEvent var1) {
      this.val437.on23(var1);
   }

   @EventTarget
   public void UiAnimation(DataChangedEvent var1) {
      this.val437.on23(var1);
   }
}
