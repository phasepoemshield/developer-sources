package Nursultan;

final class class10027 {
   private class10027() {
   }

   static String N(String var0) {
      return var0 != null && !var0.isEmpty() ? var0.replace("\r\n", " ").replace('\r', ' ').replace('\n', ' ') : "";
   }

   static String N(String var0, int var1, int var2, String var3) {
      String var4 = var0 == null ? "" : var0;
      int var5 = class10067.N(var4, var1, var2);
      int var6 = class10067.y(var4, var1, var2);
      String var7 = var3 == null ? "" : var3;
      return var4.substring(0, var5) + var7 + var4.substring(var6);
   }
}
