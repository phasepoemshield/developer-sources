package Nursultan;

final class class09771 {
   private class09771() {
   }

   static boolean N(class10021 var0, class09715 var1) {
      if (var0 == null) {
         return false;
      } else {
         class09991 var2 = var0.i();
         class10002 var3 = var2 == null ? class10002.N : var2.E();
         if (var3.N()) {
            return false;
         } else if (var1.y(var0)) {
            return true;
         } else {
            class09980 var4 = var0.o();
            class09980 var5 = var3.N(var4);
            class09713 var6 = var5.A();

            for (class09736 var10 : class09736.values()) {
               if (var10.N(var4, var5)) {
                  class09743 var11 = var6.N(var10);
                  if (var11.u() && var10.y(var4, var5, var11)) {
                     return true;
                  }
               }
            }

            return false;
         }
      }
   }
}
