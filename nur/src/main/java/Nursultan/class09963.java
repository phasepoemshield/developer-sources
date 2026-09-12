package Nursultan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class class09963 {
   private class09963() {
   }

   public static List<class09992> N(List<class09992> var0) {
      if (var0 != null && !var0.isEmpty()) {
         ArrayList var1 = new ArrayList(var0.size());

         for (class09992 var3 : var0) {
            if (var3 != null && !N(var1, var3)) {
               var1.add(var3);
            }
         }

         return var1.isEmpty() ? List.of() : List.copyOf(var1);
      } else {
         return List.of();
      }
   }

   public static boolean N(List<class09992> var0, class09992 var1) {
      Iterator var2 = var0.iterator();

      while (var2.hasNext()) {
         if ((class09992)var2.next() == var1) {
            return true;
         }
      }

      return false;
   }
}
