package org.zenith.core;

import org.zenith.module.AutoRespawn;
import org.zenith.module.Module;

import org.zenith.managers.EmoteMetadata;

import org.zenith.module.EventTracker;


import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;

public final class EmotePlayback extends KeyframeAnimationPlayer {
   public final EmoteMetadata var1532;

   public EmotePlayback(EmoteMetadata var1, int var2) {
      super(var1.AutoRespawn(), Math.max(0, var2));
      this.var1532 = var1;
   }

   public EmoteMetadata EventTracker() {
      return this.var1532;
   }
}
