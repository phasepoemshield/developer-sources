package l;

import java.util.List;

public class Helper262 {
   public Helper262() {
   }

   public void method2699(List<Helper264> var1, List<Widget8> var2) {
      var1.forEach(var1x -> {
         if (var1x instanceof Setting3 var2x) {
            var2.add(new Helper1(var2x));
         }

         if (var1x instanceof Setting9 var3) {
            var2.add(new Helper10(var3));
         }

         if (var1x instanceof Setting7 var4) {
            var2.add(new Helper17(var4));
         }

         if (var1x instanceof Setting6 var5) {
            var2.add(new Helper470(var5));
         }

         if (var1x instanceof Setting2 var6) {
            var2.add(new Helper468(var6));
         }

         if (var1x instanceof Setting1 var7) {
            var2.add(new Helper21(var7));
         }

         if (var1x instanceof Setting4 var8) {
            var2.add(new Helper469(var8));
         }

         if (var1x instanceof Setting5 var9) {
            var2.add(new Helper458(var9));
         }

         if (var1x instanceof Setting8 var10) {
            var2.add(new Helper459(var10));
         }
      });
   }
}
