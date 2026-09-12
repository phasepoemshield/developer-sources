package Nursultan;

import java.util.List;

public class class11508 extends class11526 {
   private static String[] L;
   public static Object N_0 = new class12018(L[0]);

   private static void L() {
   }

   static {
      i();
      L();
   }

   private static void i() {
      L = new String[1];
      L[0] = "category.configs";
   }

   @Override
   public void N(String var1, int var2, List<class11510> var3) {
      if ((var2 & 4) != 0) {
         List var4 = List.of(class12020.N((class12018)N_0));

         for (class11290 var6 : class11938.G().L()) {
            if (var6.M() != class11296.DELETING) {
               int var7 = this.N(var6.i(), var1);
               int var8 = this.N(var6.z(), var1);
               int var9 = Math.max(var7, var8);
               if (var9 != 0) {
                  var3.add(new class11510(var4, var6, var9));
               }
            }
         }
      }
   }
}
