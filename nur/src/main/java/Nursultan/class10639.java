package Nursultan;

import java.net.SocketException;
import java.util.Locale;

public class class10639 {
   private static String[] y;

   private class10639() {
   }

   static {
      N();
   }

   private static void N() {
      y = new String[1];
      y[0] = "connection reset";
   }

   public static boolean N(Throwable var0) {
      if (!(var0 instanceof SocketException var1)) {
         return false;
      } else {
         String var2 = var1.getMessage();
         return var2 != null && var2.toLowerCase(Locale.ROOT).contains(y[0]);
      }
   }
}
