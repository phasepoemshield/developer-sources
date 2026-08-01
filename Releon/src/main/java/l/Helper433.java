package l;

public class Helper433 extends Event3 {
   double x;
   double y;
   double z;
   float yaw;
   float pitch;
   boolean onGround;

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Helper433 var2)) {
         return false;
      } else if (!var2.method4508(this)) {
         return false;
      } else if (!super.equals(var1)) {
         return false;
      } else if (Double.compare(this.method4509(), var2.method4509()) != 0) {
         return false;
      } else if (Double.compare(this.method4510(), var2.method4510()) != 0) {
         return false;
      } else if (Double.compare(this.method4511(), var2.method4511()) != 0) {
         return false;
      } else if (Float.compare(this.method4512(), var2.method4512()) != 0) {
         return false;
      } else {
         return Float.compare(this.method4513(), var2.method4513()) != 0 ? false : this.method4514() == var2.method4514();
      }
   }

   protected boolean method4508(Object var1) {
      return var1 instanceof Helper433;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = super.hashCode();
      long var3 = Double.doubleToLongBits(this.method4509());
      var2 = var2 * 59 + (int)(var3 >>> 32 ^ var3);
      long var5 = Double.doubleToLongBits(this.method4510());
      var2 = var2 * 59 + (int)(var5 >>> 32 ^ var5);
      long var7 = Double.doubleToLongBits(this.method4511());
      var2 = var2 * 59 + (int)(var7 >>> 32 ^ var7);
      var2 = var2 * 59 + Float.floatToIntBits(this.method4512());
      var2 = var2 * 59 + Float.floatToIntBits(this.method4513());
      return var2 * 59 + (this.method4514() ? 79 : 97);
   }

   public double method4509() {
      return this.x;
   }

   public double method4510() {
      return this.y;
   }

   public double method4511() {
      return this.z;
   }

   public float method4512() {
      return this.yaw;
   }

   public float method4513() {
      return this.pitch;
   }

   public boolean method4514() {
      return this.onGround;
   }

   public void method4515(double var1) {
      this.x = var1;
   }

   public void method4516(double var1) {
      this.y = var1;
   }

   public void method4517(double var1) {
      this.z = var1;
   }

   public void method4518(float var1) {
      this.yaw = var1;
   }

   public void method4519(float var1) {
      this.pitch = var1;
   }

   public void method4520(boolean var1) {
      this.onGround = var1;
   }

   @Override
   public String toString() {
      return "MotionEvent(x="
         + this.method4509()
         + ", y="
         + this.method4510()
         + ", z="
         + this.method4511()
         + ", yaw="
         + this.method4512()
         + ", pitch="
         + this.method4513()
         + ", onGround="
         + this.method4514()
         + ")";
   }

   public Helper433(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      this.x = var1;
      this.y = var3;
      this.z = var5;
      this.yaw = var7;
      this.pitch = var8;
      this.onGround = var9;
   }
}
