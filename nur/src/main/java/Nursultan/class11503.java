package Nursultan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class class11503 {
   private static String[] u;
   public static Object N_0;

   private class11503() {
      throw new UnsupportedOperationException(u[0]);
   }

   static {
      N();
      u();
      class11539 var64 = new class11539();
      class11508 var65 = new class11508();
      class11513 var66 = new class11513();
      N_0 = List.of(var64, var65, var66, new class11489());
   }

   private static void u() {
   }

   public static List<class11510> N(String var0, int var1) {
      if (var1 != 0 && var0 != null && !var0.isBlank()) {
         String var2 = var0.trim().toLowerCase();
         ArrayList var3 = new ArrayList();
         Iterator var4 = ((List)N_0).iterator();

         while (var4.hasNext()) {
            ((class11526)var4.next()).N(var2, var1, var3);
         }

         var3.sort(Comparator.comparingInt(class11510::L).reversed());
         return var3;
      } else {
         return List.of();
      }
   }

   private static void N() {
      u = new String[1];
      u[0] = "This is a utility class and cannot be instantiated";
   }
}
