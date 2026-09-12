package Nursultan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class class10047 {
   private class10047() {
   }

   private static boolean y(class10021 var0) {
      return class10019.L(var0) || !var0.o().T();
   }

   public static List<class10021> N(class10021 var0) {
      if (var0 != null && var0.u() != 0) {
         int var1 = var0.u();
         class09908 var2 = var0.q();
         int var3 = var0.Y();
         int var4 = var0.Q();
         if (var2.N(var3, var4, var1)) {
            return var2.N();
         } else {
            ArrayList var5 = new ArrayList(var1);
            ArrayList var6 = new ArrayList();

            for (int var7 = 0; var7 < var1; var7++) {
               class10021 var8 = var0.N(var7);
               if (y(var8)) {
                  var6.add(var8);
               } else {
                  var5.add(var8);
               }
            }

            var6.sort(Comparator.comparingInt(var0x -> var0x.c().z()));
            ArrayList var9 = new ArrayList(var1);
            var9.addAll(var5);
            var9.addAll(var6);
            var2.N(var9, var3, var4, var1);
            return var2.N();
         }
      } else {
         return List.of();
      }
   }
}
