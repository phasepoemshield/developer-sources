package org.zenith.util;

import org.zenith.core.NpcCloneManager;

import org.zenith.event.Event49;

public final class TimerSpeed {
   private static volatile float val481 = 1.0F;

   public TimerSpeed() {
   }

   public static float float136() {
      return val481;
   }

   public static void Event49(float var0) {
      if (Float.isFinite(var0) && var0 > 0.0F) {
         val481 = var0;
      }
   }
}
