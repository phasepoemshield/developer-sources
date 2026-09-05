package ru.metaculture.protection;

import net.minecraft.class_4587;

public class uNVUVvuU implements O000c0oocoo {
   public static float UuUVuuUu = 2.0F;

   public static void UuUVuuUu(class_4587 var0) {
      var0.method_22903();
      double var1 = a_.method_22683().method_4495();
      double var3 = var1 / (var1 * var1);
      var0.method_22905((float)(var3 * UuUVuuUu), (float)(var3 * UuUVuuUu), 1.0F);
   }

   public static void C00OOC00oO(class_4587 var0) {
      var0.method_22909();
   }

   public static void UuUVuuUu(class_4587 var0, float var1, float var2, float var3) {
      var0.method_22903();
      var0.method_46416(var1, var2, 0.0F);
      var0.method_22905(var3, var3, 1.0F);
      var0.method_46416(-var1, -var2, 0.0F);
   }

   public static void uUnuvNvvNU(class_4587 var0) {
      var0.method_22909();
   }

   public static int UuUVuuUu(int var0) {
      return (int)(var0 * a_.method_22683().method_4495() / UuUVuuUu);
   }

   public static int UuUVuuUu(float var0) {
      return (int)(var0 * a_.method_22683().method_4495() / UuUVuuUu);
   }

   public static float C00OOC00oO(float var0) {
      return var0 * a_.method_22683().method_4495() / UuUVuuUu;
   }

   public static float[] UuUVuuUu(float var0, float var1) {
      double var2 = a_.method_22683().method_4495();
      var0 = (float)(var0 * var2 / UuUVuuUu);
      var1 = (float)(var1 * var2 / UuUVuuUu);
      return new float[]{var0, var1};
   }

   public static void C00OOC00oO(class_4587 var0, float var1, float var2, float var3) {
      var0.method_46416(var1, var2, 0.0F);
      var0.method_22905(var3, var3, 1.0F);
      var0.method_46416(-var1, -var2, 0.0F);
   }
}
