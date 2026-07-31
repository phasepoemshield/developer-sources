package l;

import net.minecraft.util.math.Vec3d;

public class Event13 implements Helper41 {
   private Vec3d movement;

   public Vec3d method3725() {
      return this.movement;
   }

   public void method3726(Vec3d var1) {
      this.movement = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Event13 var2)) {
         return false;
      } else if (!var2.method3727(this)) {
         return false;
      } else {
         Vec3d var3 = this.method3725();
         Vec3d var4 = var2.method3725();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   protected boolean method3727(Object var1) {
      return var1 instanceof Event13;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      Vec3d var3 = this.method3725();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Override
   public String toString() {
      return "MoveEvent(movement=" + this.method3725() + ")";
   }

   public Event13(Vec3d var1) {
      this.movement = var1;
   }
}
