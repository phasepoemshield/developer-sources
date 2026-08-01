package ru.metaculture.protection;

public class O0000O0O00000 {
   public static <T extends Number> T O00000000(T number, T number2, double d) {
      double var4 = number.doubleValue();
      double var6 = number2.doubleValue();
      double var8 = var4 + d * (var6 - var4);
      if (number instanceof Integer) {
         return (T)(Object)(int)Math.round(var8);
      } else if (number instanceof Double) {
         return (T)(Object)var8;
      } else if (number instanceof Float) {
         return (T)(Object)(float)var8;
      } else if (number instanceof Long) {
         return (T)(Object)Math.round(var8);
      } else if (number instanceof Short) {
         return (T)(Object)(short)Math.round(var8);
      } else if (number instanceof Byte) {
         return (T)(Object)(byte)Math.round(var8);
      } else {
         throw new IllegalArgumentException("Unsupported type: " + number.getClass().getSimpleName());
      }
   }
}
