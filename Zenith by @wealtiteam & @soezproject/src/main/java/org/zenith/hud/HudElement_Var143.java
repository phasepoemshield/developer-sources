package org.zenith.hud;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;

import org.zenith.event.Event01;
import org.zenith.event.Event08;

public class HudElement_Var143 {
   public float float26;
   public float float27;

   public HudElement_Var143(HudElement var1, float var2, float var3) {
      this.float26 = var2;
      this.float27 = var3;
   }

   public float call263() {
      return this.float26;
   }

   public float logger() {
      return this.float27;
   }

   public void Event08(float var1) {
      this.float26 = var1;
   }

   public void Event01(float var1) {
      this.float27 = var1;
   }
}
