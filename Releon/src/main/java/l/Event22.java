package l;

import net.minecraft.util.math.Vec3d;

public class Event22 implements Helper41 {
   private final Vec3d movementInput;
   private final float speed;
   private final float yaw;
   private Vec3d velocity;

   public Vec3d method4077() {
      return this.movementInput;
   }

   public float method4078() {
      return this.speed;
   }

   public float method4079() {
      return this.yaw;
   }

   public Vec3d method4080() {
      return this.velocity;
   }

   public void method4081(Vec3d var1) {
      this.velocity = var1;
   }

   public Event22(Vec3d var1, float var2, float var3, Vec3d var4) {
      this.movementInput = var1;
      this.speed = var2;
      this.yaw = var3;
      this.velocity = var4;
   }
}
