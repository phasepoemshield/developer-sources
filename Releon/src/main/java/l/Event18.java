package l;

public class Event18 implements Helper41 {
   private float forward;
   private float sideways;

   public Event18(float var1, float var2) {
      this.forward = var1;
      this.sideways = var2;
   }

   public float method3913() {
      return this.forward;
   }

   public float method3914() {
      return this.sideways;
   }

   public void method3915(float var1) {
      this.forward = var1;
   }

   public void method3916(float var1) {
      this.sideways = var1;
   }

   @Override
   public String toString() {
      return "RotatedMovementInputEvent(forward=" + this.method3913() + ", sideways=" + this.method3914() + ")";
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Event18 var2)) {
         return false;
      } else if (!var2.method3917(this)) {
         return false;
      } else {
         return Float.compare(this.method3913(), var2.method3913()) != 0 ? false : Float.compare(this.method3914(), var2.method3914()) == 0;
      }
   }

   protected boolean method3917(Object var1) {
      return var1 instanceof Event18;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + Float.floatToIntBits(this.method3913());
      return var2 * 59 + Float.floatToIntBits(this.method3914());
   }
}
