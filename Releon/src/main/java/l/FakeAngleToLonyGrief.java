package l;

import java.security.SecureRandom;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class FakeAngleToLonyGrief extends Helper353 {
   private int swingCount = 0;
   private boolean hasSwungTwice = false;
   private boolean hasSwung = false;
   private boolean disableRotation = false;
   Helper333 timer = new Helper333();

   public FakeAngleToLonyGrief() {
      super("FakeAngle to LonyGrief");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      if (var4 != null) {
         Vec3d var5 = Helper319.method3162(var4, 0.0F, 5.0F);
         var2 = Helper349.method3471(var5);
      }

      Helper336 var15 = Helper349.method3470(var1, var2);
      float var6 = var15.method3333();
      float var7 = var15.method3334();
      float var8 = (float)Math.hypot(var6, var7);
      float var9 = Math.abs(var6 / var8) * 360.0F;
      float var10 = Math.abs(var7 / var8) * 360.0F;
      float var11 = (float)(8.0 * Math.sin(System.currentTimeMillis() / 85.0));
      float var12 = (float)(8.0 * Math.sin(System.currentTimeMillis() / 95.0));
      float var13 = var1.method3333() + Math.min(Math.max(var6, -var9), var9);
      float var14 = var1.method3334() + Math.min(Math.max(var7, -var10), var10);
      return new Helper336(var13, var14);
   }

   @Override
   public Vec3d method3149() {
      return new Vec3d(0.05, 0.1, 0.02);
   }

   private float method3370(float var1, float var2) {
      return MathHelper.lerp(new SecureRandom().nextFloat(), var1, var2);
   }
}
