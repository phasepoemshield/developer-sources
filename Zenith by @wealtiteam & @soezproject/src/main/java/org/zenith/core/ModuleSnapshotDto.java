package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.AutoTotem;
import org.zenith.module.Blink;
import org.zenith.module.ReachV3;

import org.zenith.event.Event37;
import org.zenith.event.EventRender;
import org.zenith.event.EventUpdateHealth;


public record ModuleSnapshotDto(String AutoTotem, String ReachV3, long Blink) {

   public String Event37() {
      return this.AutoTotem;
   }

   public String EventUpdateHealth() {
      return this.ReachV3;
   }

   public long EventRender() {
      return this.Blink;
   }
}
