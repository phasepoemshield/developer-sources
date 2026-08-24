package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.SlimeFlight;

import org.zenith.event.Event18;
import org.zenith.core.SimpleItemBuilder;
import org.zenith.module.SlimeFlight;
import org.zenith.core.BotFeatureRegistry;



public class Event18Ext extends Event18 {
   public int int93;

   public Event18Ext() {
   }

   public int SlimeFlight() {
      return this.int93;
   }

   public void SimpleItemBuilder(int var1) {
      this.int93 = Math.max(0, var1);
   }
}
