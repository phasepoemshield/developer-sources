package l;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class UseBack extends Helper353 {
   private final float speed;

   public UseBack(float var1) {
      super("UseBack");
      this.speed = MathHelper.clamp(var1, 0.05F, 1.0F);
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Helper336 var5 = Helper349.method3470(var1, var2);
      float var6 = var5.method3333() * this.speed;
      float var7 = var5.method3334() * this.speed;
      if (Math.abs(var6) < 0.01F) {
         var6 = var5.method3333();
      }

      if (Math.abs(var7) < 0.01F) {
         var7 = var5.method3334();
      }

      return new Helper336(var1.method3333() + var6, MathHelper.clamp(var1.method3334() + var7, -90.0F, 90.0F));
   }

   @Override
   public Vec3d method3149() {
      return Vec3d.ZERO;
   }
}
