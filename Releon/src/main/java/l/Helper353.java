package l;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public abstract class Helper353 implements Helper160 {
   protected static final float MIN_ROTATION_DIFFERENCE = 1.0E-4F;
   private final String name;

   public Helper336 method3552(Helper336 var1, Helper336 var2) {
      return this.method3146(var1, var2, null, null);
   }

   public Helper336 method3553(Helper336 var1, Helper336 var2, Vec3d var3) {
      return this.method3146(var1, var2, var3, null);
   }

   public abstract Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4);

   public abstract Vec3d method3149();

   protected float method3554(float var1, float var2) {
      return Math.max((float)Math.hypot(Math.abs(var1), Math.abs(var2)), 1.0E-4F);
   }

   public String getName() {
      return this.name;
   }

   public Helper353(String var1) {
      this.name = var1;
   }
}
