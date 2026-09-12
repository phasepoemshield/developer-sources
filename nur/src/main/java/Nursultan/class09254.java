package Nursultan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public record class09254(List<class11789> shares) implements class09282 {

   public static class09254 y(class11940 var0) {
      int var1 = var0.R();
      ArrayList var2 = new ArrayList(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         var2.add(class11789.N(var0));
      }

      return new class09254(var2);
   }

   @Override
   public void N(class11940 var1) {
      var1.y(this.shares.size());
      Iterator<class11789> var2 = this.shares.iterator();

      while (var2.hasNext()) {
         var2.next().y(var1);
      }
   }

   public List<class11789> N() {
      return this.shares;
   }
}
