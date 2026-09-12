package Nursultan;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class class11539 extends class11526 {
   private void N(class11067 var1, String var2, List<String> var3, List<class11510> var4) {
      int var5 = this.N(var1.L(), var2);
      if (var5 != 0) {
         var4.add(new class11510(var3, var1, var5));
      } else {
         var5 = this.N(var1.N(), var2);
         if (var5 != 0) {
            var4.add(new class11510(var3, var1, var5));
         }
      }
   }

   @Override
   public void N(String var1, int var2, List<class11510> var3) {
      boolean var4 = (var2 & 1) != 0;
      boolean var5 = (var2 & 2) != 0;
      if (var4 || var5) {
         for (class11067 var7 : class11938.u().NN()) {
            String var8 = class12020.N(var7.M().N());
            String var9 = var7.L();
            if (var4) {
               this.N(var7, var1, List.of(var8), var3);
            }

            if (var5) {
               this.N((class11512)var7, var1, List.of(var8, var9), var3);
            }
         }
      }
   }

   private void N(class11512 var1, String var2, List<String> var3, List<class11510> var4) {
      Iterator<Entry<String, class11536<?>>> var5 = var1.w().entrySet().iterator();

      while (var5.hasNext()) {
         class11536<?> var7 = var5.next().getValue();
         var7.m();
         if (!var7.E()) {
            return;
         }

         String var8 = class12020.N(var7.P());
         int var9 = this.N(var8, var2);
         if (var9 != 0) {
            var4.add(new class11510(var3, var7, var9));
         }

         this.N(var7, var2, this.N(var3, var8), var4);
      }
   }
}
