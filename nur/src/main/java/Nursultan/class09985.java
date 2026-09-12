package Nursultan;

public record class09985(float left, float right, float top, float bottom) {
   public static final class09985 N = N(0.0F);

   public float L() {
      return this.left;
   }

   public float i() {
      return this.top;
   }

   public float u() {
      return this.right;
   }

   public float y() {
      return Math.max(0.0F, this.top) + Math.max(0.0F, this.bottom);
   }

   public static class09985 N(float var0, float var1, float var2, float var3) {
      return new class09985(Math.max(0.0F, var0), Math.max(0.0F, var1), Math.max(0.0F, var2), Math.max(0.0F, var3));
   }

   public static class09985 N(float var0, float var1) {
      float var2 = Math.max(0.0F, var0);
      float var3 = Math.max(0.0F, var1);
      return new class09985(var2, var2, var3, var3);
   }

   public float N() {
      return Math.max(0.0F, this.left) + Math.max(0.0F, this.right);
   }

   public static class09985 N(float var0) {
      float var1 = Math.max(0.0F, var0);
      return new class09985(var1, var1, var1, var1);
   }

   public float R() {
      return this.bottom;
   }
}
