package l;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Helper336 {
   public static Helper336 DEFAULT = new Helper336(0.0F, 0.0F);
   float yaw;
   float pitch;

   public static Helper336 method3325(Vec3d var0, Vec3d var1, double var2) {
      double var4 = var1.y + var2 * 0.9;
      double var6 = var1.x - var0.x;
      double var8 = var4 - (var0.y + 1.5);
      double var10 = var1.z - var0.z;
      float var12 = (float)Math.toDegrees(Math.atan2(var10, var6)) - 90.0F;
      var12 = MathHelper.wrapDegrees(var12);
      double var13 = Math.sqrt(var6 * var6 + var10 * var10);
      float var15 = (float)Math.toDegrees(-Math.atan2(var8, var13));
      var15 = MathHelper.clamp(var15, -90.0F, 90.0F);
      return new Helper336(var12, var15);
   }

   public Helper336 method3326() {
      double var1 = Helper147.method1226();
      Helper336 var3 = Helper351.INSTANCE.method3527();
      float var4 = this.method3328(this.yaw, var3.yaw, var1, true);
      float var5 = this.method3328(this.pitch, var3.pitch, var1, false);
      return new Helper336(var4, MathHelper.clamp(var5, -90.0F, 90.0F));
   }

   public Helper336 method3327(float var1) {
      return new Helper336(this.yaw + Helper147.method1228(-var1, var1), this.pitch + Helper147.method1228(-var1, var1));
   }

   private float method3328(float var1, float var2, double var3, boolean var5) {
      if (var3 <= 0.0) {
         return var5 ? MathHelper.wrapDegrees(var1) : var1;
      } else {
         float var6 = var5 ? MathHelper.wrapDegrees(var1 - var2) : var1 - var2;
         return var2 + (float)Math.round(var6 / var3) * (float)var3;
      }
   }

   public final Vec3d method3329() {
      float var1 = this.pitch * (float) (Math.PI / 180.0);
      float var2 = -this.yaw * (float) (Math.PI / 180.0);
      float var3 = MathHelper.cos(var2);
      float var4 = MathHelper.sin(var2);
      float var5 = MathHelper.cos(var1);
      float var6 = MathHelper.sin(var1);
      return new Vec3d(var4 * var5, -var6, var3 * var5);
   }

   public Helper336 method3330(float var1) {
      return new Helper336(this.yaw + var1, this.pitch);
   }

   public Helper336 method3331(float var1) {
      this.pitch = MathHelper.clamp(this.pitch + var1, -90.0F, 90.0F);
      return this;
   }

   public Helper336 method3332(Helper336 var1) {
      return new Helper336(var1.method3333(), var1.method3334());
   }

   public float method3333() {
      return this.yaw;
   }

   public float method3334() {
      return this.pitch;
   }

   public void method3335(float var1) {
      this.yaw = var1;
   }

   public void method3336(float var1) {
      this.pitch = var1;
   }

   @Override
   public String toString() {
      return "Turns(yaw=" + this.method3333() + ", pitch=" + this.method3334() + ")";
   }

   public Helper336(float var1, float var2) {
      this.yaw = var1;
      this.pitch = var2;
   }
}
