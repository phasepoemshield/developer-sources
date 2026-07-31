package l;

import java.util.List;
import java.util.Locale;

class Helper251 {
   private final int color;
   private final List<String> requiredLines;

   Helper251(int var1, String... var2) {
      this(var1, List.of(var2));
   }

   private Helper251(int var1, List<String> var2) {
      this.color = var1;
      this.requiredLines = var2;
   }

   boolean method2424(List<String> var1) {
      for (String var3 : this.requiredLines) {
         String var4 = var3.toLowerCase(Locale.ROOT).trim().replace('ё', 'е');
         boolean var5 = false;

         for (String var7 : var1) {
            if (var7.contains(var4)) {
               var5 = true;
               break;
            }
         }

         if (!var5) {
            return false;
         }
      }

      return true;
   }

   public int method2425() {
      return this.color;
   }

   public List<String> method2426() {
      return this.requiredLines;
   }
}
