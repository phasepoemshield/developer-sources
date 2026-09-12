package Nursultan;

import java.util.List;

public class class11513 extends class11526 {
   @Override
   public void N(String var1, int var2, List<class11510> var3) {
      if ((var2 & 8) != 0) {
         for (class11882 var5 : class11938.n().y().values()) {
            int var6 = this.N(var5.y(), var1);
            if (var6 != 0) {
               var3.add(new class11510(List.of(class12020.N(var5.i().N())), var5, var6));
            }
         }
      }
   }
}
