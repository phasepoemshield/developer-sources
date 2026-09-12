package Nursultan;

public record class11625(float minX, float minY, float maxX, float maxY) {

   public float L() {
      return this.minX;
   }

   public float i() {
      return this.maxX - this.minX;
   }

   public float u() {
      return this.minY;
   }

   public float y() {
      return this.maxX;
   }

   public float N() {
      return this.maxY;
   }

   public class11625 N(class11625 var1) {
      float var2 = Math.max(this.minX, var1.minX);
      float var3 = Math.max(this.minY, var1.minY);
      float var4 = Math.min(this.maxX, var1.maxX);
      float var5 = Math.min(this.maxY, var1.maxY);
      return !(var4 - var2 <= 0.0F) && !(var5 - var3 <= 0.0F) ? new class11625(var2, var3, var4, var5) : null;
   }

   public float R() {
      return this.maxY - this.minY;
   }
}
