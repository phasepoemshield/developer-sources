package l;

import org.joml.Matrix4f;

public interface Helper171 {
   Matrix4f DEFAULT_MATRIX = new Matrix4f();

   default void method1447(double var1, double var3) {
      this.method1448((float)var1, (float)var3);
   }

   default void method1448(float var1, float var2) {
      this.method1450(DEFAULT_MATRIX, var1, var2);
   }

   default void method1449(Matrix4f var1, double var2, double var4) {
      this.method1450(var1, (float)var2, (float)var4);
   }

   default void method1450(Matrix4f var1, float var2, float var3) {
      this.method591(var1, var2, var3, 0.0F);
   }

   default void method1451(double var1, double var3, double var5) {
      this.method1452((float)var1, (float)var3, (float)var5);
   }

   default void method1452(float var1, float var2, float var3) {
      this.method591(DEFAULT_MATRIX, var1, var2, var3);
   }

   default void method1453(Matrix4f var1, double var2, double var4, double var6) {
      this.method591(var1, (float)var2, (float)var4, (float)var6);
   }

   void method591(Matrix4f var1, float var2, float var3, float var4);
}
