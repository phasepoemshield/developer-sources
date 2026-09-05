package ru.metaculture.protection;

import net.minecraft.class_310;
import net.minecraft.class_4587;
import org.lwjgl.opengl.GL11;

public class CoCO0oOCO0c {
   private class_310 C00OOC00oO = class_310.method_1551();
   public static float UuUVuuUu = 2.0F;

   public static void UuUVuuUu() {
      UnVnUVUUUVvn var0 = new UnVnUVUUUVvn(class_310.method_1551());
      double var1 = UnVnUVUUUVvn.uNNnnnuuuN() / Math.pow(UnVnUVUUUVvn.uNNnnnuuuN(), 2.0);
      GL11.glPushMatrix();
      GL11.glScaled(var1 * UuUVuuUu, var1 * UuUVuuUu, var1 * UuUVuuUu);
   }

   public static void C00OOC00oO() {
      GL11.glScaled(UuUVuuUu, UuUVuuUu, UuUVuuUu);
      GL11.glPopMatrix();
   }

   public static void UuUVuuUu(float var0, float var1, float var2) {
      class_4587 var3 = new class_4587();
      var3.method_22903();
      var3.method_46416(var0, var1, 0.0F);
      var3.method_22905(var2, var2, 1.0F);
      var3.method_46416(-var0, -var1, 0.0F);
   }

   public static void uUnuvNvvNU() {
      class_4587 var0 = new class_4587();
      var0.method_22909();
   }

   public static int UuUVuuUu(int var0) {
      UnVnUVUUUVvn var1 = new UnVnUVUUUVvn(class_310.method_1551());
      return (int)(var0 * UnVnUVUUUVvn.uNNnnnuuuN() / UuUVuuUu);
   }

   public static int UuUVuuUu(float var0) {
      UnVnUVUUUVvn var1 = new UnVnUVUUUVvn(class_310.method_1551());
      return (int)(var0 * UnVnUVUUUVvn.uNNnnnuuuN() / UuUVuuUu);
   }

   public static float[] UuUVuuUu(float var0, float var1) {
      UnVnUVUUUVvn var2 = new UnVnUVUUUVvn(class_310.method_1551());
      var0 = var0 * UnVnUVUUUVvn.uNNnnnuuuN() / UuUVuuUu;
      var1 = var1 * UnVnUVUUUVvn.uNNnnnuuuN() / UuUVuuUu;
      return new float[]{var0, var1};
   }

   public static void C00OOC00oO(float var0, float var1, float var2) {
      class_4587 var3 = new class_4587();
      var3.method_46416(var0, var1, 0.0F);
      var3.method_22905(var2, var2, 1.0F);
      var3.method_46416(-var0, -var1, 0.0F);
   }
}
