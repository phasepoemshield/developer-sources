package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.Strafe;
import org.zenith.module.Timer;
import org.zenith.module.Velocity;

import org.zenith.event.Event18;
import org.zenith.core.ProfileItemBuilder;
import org.zenith.ZenithClient;
import org.zenith.rotation.Rotation;
import org.zenith.module.Strafe;
import org.zenith.module.Timer;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.module.Velocity;



public class SprintEvent extends Event18 {
   public boolean boolean163;
   public float float21;
   public Rotation var1184;

   public boolean Strafe() {
      return this.boolean163;
   }

   public float Timer() {
      return this.float21;
   }

   public Rotation Velocity() {
      return this.var1184;
   }

   public void ProfileItemBuilder(boolean var1) {
      this.boolean163 = var1;
   }

   public void ProfileItemBuilder(float var1) {
      this.float21 = var1;
   }

   public void on23(Rotation var1) {
      this.var1184 = var1;
   }

   public SprintEvent(boolean var1, float var2, Rotation var3) {
      this.boolean163 = var1;
      this.float21 = var2;
      this.var1184 = var3;
   }
}
