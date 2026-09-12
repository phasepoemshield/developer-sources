package Nursultan;

import java.util.ArrayList;
import java.util.List;

public final class class09863 {
   private class09863() {
   }

   public static void N(class09860 var0) {
      if (var0 != null && var0.R() != null && var0.i() != null) {
         List<class10021> var1 = N(var0.R());
         if (!var1.isEmpty()) {
            for (int var2 = 0; var2 < var1.size() - 1; var2++) {
               class10021 var3 = var1.get(var2);
               var0.N(var3);
               var0.N(class09875.CAPTURE);
               var3.N(var0, true);
               if (var0.E()) {
                  return;
               }
            }

            class10021 var5 = var1.getLast();
            var0.N(var5);
            var0.N(class09875.AT_TARGET);
            var5.N(var0, true);
            if (!var0.W()) {
               var5.N(var0, false);
            }

            if (!var0.E() && var0.B()) {
               for (int var6 = var1.size() - 2; var6 >= 0; var6--) {
                  class10021 var4 = var1.get(var6);
                  var0.N(var4);
                  var0.N(class09875.BUBBLE);
                  var4.N(var0, false);
                  if (var0.E()) {
                     return;
                  }
               }
            }
         }
      }
   }

   private static List<class10021> N(class09904 var0) {
      ArrayList var1 = new ArrayList();

      for (class10021 var2 = (class10021)var0; var2 != null; var2 = var2.X()) {
         var1.add(var2);
      }

      ArrayList var3 = new ArrayList(var1.size());

      for (int var4 = var1.size() - 1; var4 >= 0; var4--) {
         var3.add((class10021)var1.get(var4));
      }

      return var3;
   }
}
