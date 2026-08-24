package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.ItemUseController;
import org.zenith.module.Timer;

import org.zenith.module.ItemUseController;
import org.zenith.core.ProfileItemBuilder;
import org.zenith.module.Timer;
import org.zenith.core.BotFeatureRegistry;


import com.darkmagician6.eventapi.events.callables.EventCancellable;

public class EventGetFogColorHook extends EventCancellable {
   public float float21;
   public int int92;

   public EventGetFogColorHook() {
   }

   public float Timer() {
      return this.float21;
   }

   public int ItemUseController() {
      return this.int92;
   }

   public void ProfileItemBuilder(float var1) {
      this.float21 = var1;
   }

   public void setColor(int var1) {
      this.int92 = var1;
   }
}
