package Nursultan;

public class class11602 {
   private static String[] N;

   private class11602() {
   }

   static {
      y();
   }

   private static void y() {
      N = new String[3];
      N[0] = "-";
      N[1] = ".";
      N[2] = "-.";
   }

   public static String N(float var0) {
      return Math.floor((double)var0) == (double)var0 ? String.valueOf((int)var0) : String.valueOf(var0);
   }

   public static String N(float var0, String var1) {
      return N(var0) + var1;
   }

   public static boolean N(String var0) {
      return var0.isEmpty() || var0.equals(N[0]) || var0.equals(N[1]) || var0.equals(N[2]);
   }

   public static String N(String var0, String var1) {
      String var2 = var0.trim();
      return !var1.isBlank() && var2.endsWith(var1) ? var2.substring(0, var2.length() - var1.length()).trim() : var2;
   }
}
