package Nursultan;

final class class09839 {
   private class09839() {
   }

   private static boolean N(class10021 var0, float var1, float var2, float var3) {
      float var4 = class10019.N(var0) ? 0.0F : var1;
      float var5 = class10019.N(var0) ? 0.0F : var2;
      class09980 var6 = var0.o();
      class09937 var7 = var0.c();
      float var8 = var4 + var6.n().L(var7.u());
      float var9 = var5 + var6.t().L(var7.i());
      boolean var10 = false;
      if (var8 != 0.0F || var9 != 0.0F) {
         float var11 = class09693.N(var7.y() + var8, var3) - var7.y();
         float var12 = class09693.N(var7.L() + var9, var3) - var7.L();
         if (var11 != 0.0F || var12 != 0.0F) {
            var7.L(var7.y() + var11, var7.L() + var12);
            var7.N(var7.R() + var11, var7.M() + var12, var7.B(), var7.Z());
            var0.i(1);
            var10 = true;
         }
      }

      for (int var13 = 0; var13 < var0.u(); var13++) {
         var10 |= N(var0.N(var13), var8, var9, var3);
      }

      return var10;
   }

   static boolean N(class10021 var0, float var1) {
      return N(var0, 0.0F, 0.0F, var1);
   }

   static void N(class10021 var0) {
      class09937 var1 = var0.c();
      if (var1.y() != var1.l() || var1.L() != var1.d()) {
         float var2 = var1.R() - var1.y();
         float var3 = var1.M() - var1.L();
         var1.L(var1.l(), var1.d());
         var1.N(var1.l() + var2, var1.d() + var3, var1.B(), var1.Z());
         var0.i(1);
      }

      for (int var4 = 0; var4 < var0.u(); var4++) {
         N(var0.N(var4));
      }
   }
}
