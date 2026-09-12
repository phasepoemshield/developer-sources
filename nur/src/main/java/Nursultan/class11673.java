package Nursultan;

import java.util.ArrayList;
import java.util.Collections;

public class class11673 extends class11676 {
   public class11673(String var1) {
      super(var1);
   }

   static {
      N();
   }

   @Override
   public int[] N(int var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < var1; var3++) {
         var2.add(var3);
      }

      Collections.shuffle(var2);
      return var2.stream().mapToInt(var0 -> var0).toArray();
   }

   private static void N() {
   }
}
