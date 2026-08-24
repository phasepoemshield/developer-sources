package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.Speed;

import org.zenith.event.Event18;
import org.zenith.core.PotionItemBuilder;
import org.zenith.module.Speed;
import org.zenith.core.BotFeatureRegistry;



public class SprintStateEvent extends Event18 {
   public boolean state;

   public SprintStateEvent(boolean var1) {
      this.state = var1;
   }

   public boolean Speed() {
      return this.state;
   }

   public void PotionItemBuilder(boolean var1) {
      this.state = var1;
   }
}
