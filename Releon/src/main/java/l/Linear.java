package l;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class Linear extends Helper353 {
   public Linear() {
      super("Linear");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Helper336 var5 = Helper349.method3470(var1, var2);
      float var6 = var5.method3333();
      float var7 = var5.method3334();
      float var8 = (float)Math.hypot(var6, var7);
      float var9 = Math.abs(var6 / var8) * 360.0F;
      float var10 = Math.abs(var7 / var8) * 360.0F;
      float var11 = var1.method3333() + Math.min(Math.max(var6, -var9), var9);
      float var12 = var1.method3334() + Math.min(Math.max(var7, -var10), var10);
      return new Helper336(var11, var12);
   }

   @Override
   public Vec3d method3149() {
      return new Vec3d(0.0, 0.0, 0.0);
   }
}
