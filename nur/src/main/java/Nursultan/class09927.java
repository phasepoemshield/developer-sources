package Nursultan;

import java.util.ArrayList;
import java.util.List;

final class class09927 {
   private static void y(class10021 var0, List<class09935> var1, float var2, float var3) {
      float var4 = var0.c().y() + var2;
      float var5 = var0.c().L() + var3;
      float var6 = var0.c().u();
      float var7 = var0.c().i();
      if (!(var6 <= 1.0F) && !(var7 <= 1.0F)) {
         int var8 = N(var0.N());
         N(var1, var4, var5, var6, var7, var8);
      }
   }

   private static int N(String var0) {
      int var1 = var0 == null ? 0 : var0.hashCode();
      int var2 = 64 + (var1 >>> 16 & 127);
      int var3 = 64 + (var1 >>> 8 & 127);
      int var4 = 64 + (var1 & 127);
      return 0xFF000000 | var2 << 16 | var3 << 8 | var4;
   }

   private static void N(List<class09935> var0, float var1, float var2, float var3, float var4, int var5) {
      if (!(var3 <= 0.0F) && !(var4 <= 0.0F)) {
         float var6 = Math.min(2.0F, Math.min(var3, var4));
         var0.add(new class09909(new class09925(var1, var2, var3, var4, class09889.N, class09662.N(var5, class09677.ALPHA, 34), var5, var6, 0, 0.0F)));
      }
   }

   List<class09935> N(class10021 var1) {
      ArrayList var2 = new ArrayList();
      if (var1 != null) {
         N(var1, var2, 0.0F, 0.0F);
      }

      return var2;
   }

   private static void N(class10021 var0, List<class09935> var1, float var2, float var3) {
      float var4 = var2;
      float var5 = var3;
      y(var0, var1, var2, var3);
      float var6 = class09918.N(var0);

      for (class10021 var8 : class10047.N(var0)) {
         if (class10019.N(var8)) {
            N(var8, var1, 0.0F, 0.0F);
         } else {
            float var9 = var5;
            if (var6 > 0.0F && class10019.y(var8)) {
               var9 = var5 - var6;
            }

            N(var8, var1, var4, var9);
         }
      }
   }
}
