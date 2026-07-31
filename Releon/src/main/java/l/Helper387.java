package l;

import net.minecraft.util.math.Vec3d;

public class Helper387 extends Event3 {
   private Vec3d motion;
   private final boolean pre;

   public Helper387(Vec3d var1, boolean var2) {
      this.motion = var1;
      this.pre = var2;
   }

   public Vec3d method3899() {
      return this.motion;
   }

   public void method3900(Vec3d var1) {
      this.motion = var1;
   }

   public boolean method3901() {
      return this.pre;
   }
}
