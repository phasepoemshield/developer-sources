package Nursultan;

import java.util.List;

public class class11489 extends class11526 {
   private static String[] L;
   public static Object N_0 = new class12018(L[0]);

   static {
      i();
      N();
   }

   private static void i() {
      L = new String[1];
      L[0] = "category.accounts";
   }

   @Override
   public void N(String var1, int var2, List<class11510> var3) {
      if ((var2 & 16) != 0) {
         List var4 = List.of(class12020.N((class12018)N_0));

         for (class09250 var6 : class11938.s().u()) {
            int var7 = this.N(var6.u(), var1);
            if (var7 != 0) {
               var3.add(new class11510(var4, var6, var7));
            }
         }
      }
   }

   private static void N() {
   }
}
