package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.Crosshair;
import org.zenith.module.EntityESP;

import org.zenith.event.EventHookPacketProcess2;
import org.zenith.event.EventReplaceMovePacketPitche3;


import java.util.UUID;

public record CloudViewDto(long Crosshair, UUID EntityESP) {

   public long EventHookPacketProcess2() {
      return this.Crosshair;
   }

   public UUID EventReplaceMovePacketPitche3() {
      return this.EntityESP;
   }
}
