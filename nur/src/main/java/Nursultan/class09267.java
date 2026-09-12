package Nursultan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public record class09267(List<class10732> entries) implements class09260 {

   public static class09267 y(class11940 var0) {
      int var1 = var0.R();
      ArrayList var2 = new ArrayList(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         var2.add(class10732.y(var0));
      }

      return new class09267(var2);
   }

   public List<class10732> N() {
      return this.entries;
   }

   @Override
   public void N(class11940 var1) {
      var1.y(this.entries.size());
      Iterator<class10732> var2 = this.entries.iterator();

      while (var2.hasNext()) {
         var2.next().N(var1);
      }
   }
}
