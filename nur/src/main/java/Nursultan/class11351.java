package Nursultan;

import java.util.Locale;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;

public class class11351 {
   private static String[] L;
   public static Object N_0 = LogManager.getLogger(String.class);

   private class11351() {
      throw new UnsupportedOperationException(L[0]);
   }

   static {
      i();
      u();
   }

   private static void i() {
      L = new String[1];
      L[0] = "This is a utility class and cannot be instantiated";
   }

   private static void u() {
   }

   public static String N() {
      String var0 = RandomStringUtils.insecure().nextAlphabetic(10, 15).toLowerCase(Locale.ENGLISH);
      StringBuilder var1 = new StringBuilder();
      char[] var2 = var0.toCharArray();

      for (int var3 = 0; var3 < var2.length; var3++) {
         char var4 = var2[var3];
         if (var3 == 0) {
            var1.append(Character.toUpperCase(var4));
         } else {
            var1.append(var4);
         }
      }

      return var1.toString();
   }

   public static void N(String var0) {
      class11938.s().L(new class09250(class11991.N(var0), false, System.currentTimeMillis()));
   }
}
