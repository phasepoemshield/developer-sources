package org.zenith.rotation;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;

import org.zenith.event.Event01;
import org.zenith.event.EventMotion;

import net.minecraft.util.math.Vec2f;

public class RotationDelta {
   public final float float213;
   public final float float214;

   public float path15() {
      return this.float214;
   }

   public Vec2f list114() {
      return new Vec2f(this.float213, this.float214);
   }

   public boolean EventMotion(float var1) {
      return this.Event01(var1, var1);
   }

   public boolean Event01(float var1, float var2) {
      return Math.abs(this.float213) <= var1 && Math.abs(this.float214) <= var2;
   }

   public RotationDelta(float var1, float var2) {
      this.float213 = var1;
      this.float214 = var2;
   }

   public float gson2() {
      return (float)Math.sqrt((double)(this.float213 * this.float213 + this.float214 * this.float214));
   }

   public float type2() {
      return this.float213;
   }
}
