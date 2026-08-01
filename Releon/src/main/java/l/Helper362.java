package l;

import net.minecraft.client.util.math.MatrixStack;

public final class Helper362 implements Helper160 {
   private Helper362() {
   }

   public static boolean method3600() {
      return Hud.method1824().method1839();
   }

   public static int method3601(int var0) {
      return Helper133.method1139(0, 0, 0, var0);
   }

   public static int method3602(int var0) {
      return Helper133.method1139(0, 0, 0, Math.min(255, var0 + 25));
   }

   public static void method3603(MatrixStack var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      method3604(var0, var1, var2, var3, var4, var5, var6, method3601(var6), method3602(var6));
   }

   public static void method3604(MatrixStack var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8) {
      int var9 = Math.max(28, var6 - 30);
      Helper12.method361(var0, var1, var2, var3, var4, var5, var9, var7, var8);
      if (!Hud.method1824().method1838()) {
         rectangle.method677(
            Helper80.method841(var0, var1, var2, var3, var4)
               .method826(var5)
               .method835(1.0F)
               .method839(Helper133.method1106(var8, Math.min(255, var6 + 10)))
               .method823(Helper133.method1106(var7, Math.max(28, var6 / 2)))
               .method840()
         );
      }
   }
}
