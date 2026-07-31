package l;

import net.minecraft.util.math.Vec3d;

public class Event12 implements Helper41 {
   private final float speed;
   private final Vec3d movementInput;

   public float method3723() {
      return this.speed;
   }

   public Vec3d method3724() {
      return this.movementInput;
   }

   public Event12(float var1, Vec3d var2) {
      this.speed = var1;
      this.movementInput = var2;
   }
}
