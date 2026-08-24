package org.zenith.module;

import org.zenith.core.ItemRegistry;

import org.zenith.core.ColorAnimator;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventRender2;


import com.darkmagician6.eventapi.EventTarget;

class AutoWarden_2 {
   public final AutoWarden val511;
   AutoWarden_2(AutoWarden var1) {
      this.val511 = var1;
   }

   @EventTarget
   public void ColorAnimator(EventRender2 var1) {
      this.val511.ItemRegistry(var1);
   }
}
