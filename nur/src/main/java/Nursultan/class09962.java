package Nursultan;

public record class09962(class09982 mode, float min, float max, float value) {
   private static final float i = Float.POSITIVE_INFINITY;

   public float L(float var1) {
      float var2 = Math.max(0.0F, this.min);
      float var3 = Math.max(this.max, var2);
      return class09693.N(var1, var2, var3);
   }

   public boolean L() {
      return this.mode == class09982.PERCENT;
   }

   private static float M(float var0) {
      return Float.isInfinite(var0) ? Float.POSITIVE_INFINITY : Math.max(0.0F, var0);
   }

   public float M() {
      return this.value;
   }

   private static float B(float var0) {
      return Float.isInfinite(var0) ? Float.POSITIVE_INFINITY : Math.max(0.0F, var0);
   }

   public float i() {
      return this.min;
   }

   public float i(float var1) {
      return Math.max(0.0F, var1) * this.value / 100.0F;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float u(float var1) {
      float var2 = Math.max(0.0F, var1);

      return switch (this.mode) {
         case FIT -> this.L(var2);
         case GROW -> this.L(var2);
         case PERCENT -> this.i(var2);
         case FIXED -> this.value;
      };
   }

   public class09982 u() {
      return this.mode;
   }

   public boolean y() {
      return this.mode == class09982.GROW;
   }

   public static class09962 y(float var0) {
      float var1 = M(var0);
      return new class09962(class09982.FIXED, var1, var1, var1);
   }

   public static class09962 y(float var0, float var1) {
      return new class09962(class09982.GROW, M(var0), B(var1), 0.0F);
   }

   public static class09962 N(float var0) {
      float var1 = class09693.N(var0, 0.0F, 100.0F);
      return new class09962(class09982.PERCENT, 0.0F, Float.POSITIVE_INFINITY, var1);
   }

   public static class09962 N() {
      return new class09962(class09982.FIT, 0.0F, Float.POSITIVE_INFINITY, 0.0F);
   }

   public static class09962 N(float var0, float var1) {
      return new class09962(class09982.FIT, M(var0), B(var1), 0.0F);
   }

   public static class09962 R(float var0) {
      float var1 = M(var0);
      return N(var1, var1);
   }

   public float R() {
      return this.max;
   }
}
