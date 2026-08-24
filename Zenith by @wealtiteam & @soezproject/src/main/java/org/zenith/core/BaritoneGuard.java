package org.zenith.core;

import org.zenith.event.EventTick;

import com.darkmagician6.eventapi.EventTarget;

class BaritoneGuard {
   BaritoneGuard() {
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      BaritoneBridge.float138();
   }
}
