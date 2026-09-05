package ru.metaculture.protection;

public class nNUuNuVuuv {
   public static <T extends Number> T UuUVuuUu(T var0, T var1, double var2) {
      double var4 = var0.doubleValue();
      double var6 = var1.doubleValue();
      double var8 = var4 + var2 * (var6 - var4);
      if (var0 instanceof Integer) {
         return (T)(int)Math.round(var8);
      } else if (var0 instanceof Double) {
         return (T)var8;
      } else if (var0 instanceof Float) {
         return (T)(float)var8;
      } else if (var0 instanceof Long) {
         return (T)Math.round(var8);
      } else if (var0 instanceof Short) {
         return (T)(short)Math.round(var8);
      } else if (var0 instanceof Byte) {
         return (T)(byte)Math.round(var8);
      } else {
         throw new IllegalArgumentException("Unsupported type: " + var0.getClass().getSimpleName());
      }
   }
}
