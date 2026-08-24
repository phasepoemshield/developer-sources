package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.ItemUseController;

import org.zenith.event.Event18;
import org.zenith.module.ItemUseController;
import org.zenith.core.BotFeatureRegistry;



public class VelocityChangeEvent extends Event18 {
   public int int92;

   public int ItemUseController() {
      return this.int92;
   }

   public void setColor(int var1) {
      this.int92 = var1;
   }

   public VelocityChangeEvent(int var1) {
      this.int92 = var1;
   }
}
