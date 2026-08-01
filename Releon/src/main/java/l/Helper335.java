package l;

import net.minecraft.util.math.Vec3d;

public class Helper335 {
   private final Helper336 angle;
   private final Vec3d vec;

   @Override
   public String toString() {
      return "Turns.VecRotation(angle=" + this.method3323() + ", vec=" + this.method3324() + ")";
   }

   public Helper336 method3323() {
      return this.angle;
   }

   public Vec3d method3324() {
      return this.vec;
   }

   public Helper335(Helper336 var1, Vec3d var2) {
      this.angle = var1;
      this.vec = var2;
   }
}
