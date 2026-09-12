package Nursultan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public record class09272(List<class11827> presets) implements class09279 {

   @Override
   public void y(class11940 var1) {
      var1.y(this.presets.size());
      Iterator<class11827> var2 = this.presets.iterator();

      while (var2.hasNext()) {
         var2.next().N(var1);
      }
   }

   public static class09272 N(class11940 var0) {
      int var1 = var0.R();
      ArrayList var2 = new ArrayList(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         var2.add(class11827.y(var0));
      }

      return new class09272(var2);
   }

   public List<class11827> N() {
      return this.presets;
   }
}
