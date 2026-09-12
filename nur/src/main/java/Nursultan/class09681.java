package Nursultan;

public final class class09681 implements class09667 {
   private static final float N = 1.0E-4F;
   private static final float y = 16.0F;
   private final class09868 L;
   private final float u;
   private final class09838 i;

   public class09681(class09868 var1) {
      this(var1, 16.0F, class09838.N);
   }

   public class09681(class09868 var1, float var2, class09838 var3) {
      this.L = var1;
      this.u = N(var2);
      this.i = var3 == null ? class09838.N : var3;
   }

   private float y(float var1) {
      return Float.isFinite(var1) && !(var1 <= 0.0F) ? var1 : this.u;
   }

   private class09838 N(class09838 var1) {
      return var1 == null ? this.i : var1;
   }

   private static float N(float var0) {
      return Float.isFinite(var0) && !(var0 <= 0.0F) ? var0 : 16.0F;
   }

   @Override
   public class09672 N(String var1, float var2, float var3, class09838 var4) {
      String var5 = var1 == null ? "" : var1;
      float var6 = this.y(var3);
      class09838 var7 = this.N(var4);
      if (var5.isEmpty()) {
         float var15 = this.L.N(var6, var7);
         return new class09672(0.0F, var15);
      } else if (Float.isInfinite(var2)) {
         return this.N(var5, var6, var7);
      } else {
         float var8 = this.L.N(var6, var7);
         if (var2 <= 1.0E-4F) {
            return new class09672(0.0F, var8 * (float)var5.length());
         } else {
            int var9 = 1;
            float var10 = 0.0F;
            float var11 = 0.0F;

            for (int var12 = 0; var12 < var5.length(); var12++) {
               char var13 = var5.charAt(var12);
               if (var13 == '\n') {
                  var11 = Math.max(var11, var10);
                  var10 = 0.0F;
                  var9++;
               } else {
                  float var14 = this.L.N(var13, var6, var7);
                  if (var10 > 0.0F && var10 + var14 > var2) {
                     var11 = Math.max(var11, var10);
                     var10 = var14;
                     var9++;
                  } else {
                     var10 += var14;
                  }
               }
            }

            var11 = Math.max(var11, var10);
            return new class09672(Math.min(var11, var2), (float)var9 * var8);
         }
      }
   }

   @Override
   public class09672 N(String var1, float var2) {
      return this.N(var1, var2, this.u, this.i);
   }

   @Override
   public class09672 N(String var1, float var2, class09838 var3) {
      String var4 = var1 == null ? "" : var1;
      float var5 = this.y(var2);
      class09838 var6 = this.N(var3);
      float var7 = this.L.N(var4, var5, var6);
      float var8 = this.L.N(var5, var6);
      return new class09672(var7, var8);
   }

   @Override
   public class09672 N(String var1) {
      return this.N(var1, this.u, this.i);
   }
}
