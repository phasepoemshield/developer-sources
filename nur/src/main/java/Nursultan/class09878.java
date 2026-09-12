package Nursultan;

final class class09878 {
   private class09878() {
   }

   private static boolean y(class10021 var0) {
      return var0.c().m() <= 0.0F ? false : var0.o().y();
   }

   static class09849 N(class10021 var0) {
      float var1 = 0.0F;
      class10021 var2 = var0;

      for (class10021 var3 = var0.X(); var3 != null && !class10019.N(var2); var3 = var3.X()) {
         if (y(var3) && class10019.y(var2)) {
            var1 -= Math.max(0.0F, var3.c().m());
         }

         var2 = var3;
      }

      return new class09849(var0.c().y(), var0.c().L() + var1, var0.c().u(), var0.c().i());
   }
}
