package org.zenith.event;

import org.zenith.module.Module;
import org.zenith.utility.render.display.base.HudDrawContext;

import org.zenith.module.WarpFarm;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.module.WarpFarm;


import com.darkmagician6.eventapi.events.Event;

public class EventRenderScreenHook implements Event {
   public final org.zenith.utility.render.display.base.HudDrawContext val377;

   public org.zenith.utility.render.display.base.HudDrawContext WarpFarm() {
      return this.val377;
   }

   public EventRenderScreenHook(org.zenith.utility.render.display.base.HudDrawContext var1) {
      this.val377 = var1;
   }
}
