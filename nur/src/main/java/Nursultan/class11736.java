package Nursultan;

public class class11736 implements class09667 {
   public static Object N_0;
   public Object y_0;

   private static void L() {
      N_0 = 1.0E-4F;
   }

   public class11736(class09868 var1) {
      this.i();
      this.y_0 = var1;
   }

   static {
      L();
   }

   private void i() {
   }

   @Override
   public class09672 N(String var1, float var2, float var3, class09838 var4) {
      if (var1.isEmpty()) {
         float var14 = ((class09868)this.y_0).N(var3, var4);
         return new class09672(0.0F, var14);
      } else if (Float.isInfinite(var2)) {
         return this.N(var1, var3, var4);
      } else {
         float var5 = ((class09868)this.y_0).N(var3, var4);
         if (var2 <= 1.0E-4F) {
            return new class09672(0.0F, var5 * (float)var1.length());
         } else {
            int var6 = 1;
            float var7 = 0.0F;
            float var8 = 0.0F;
            int var9 = -1;

            for (int var16 = 0; var16 < var1.length(); var16++) {
               int var11 = var1.codePointAt(var16);
               var16 += Character.charCount(var11);
               if (var11 == 10) {
                  var8 = Math.max(var8, var7);
                  var7 = 0.0F;
                  var6++;
                  var9 = -1;
               } else {
                  float var12 = var9 == -1 ? 0.0F : ((class09868)this.y_0).N(var9, var11, var3, var4);
                  float var13 = ((class09868)this.y_0).N(var11, var3, var4) + var12;
                  if (var7 > 0.0F && var7 + var13 > var2) {
                     var8 = Math.max(var8, var7);
                     var7 = var13;
                     var6++;
                     var9 = -1;
                  } else {
                     var7 += var13;
                     var9 = var11;
                  }
               }
            }

            var8 = Math.max(var8, var7);
            return new class09672((float)Math.round(Math.min(var8, var2)), (float)var6 * var5);
         }
      }
   }

   @Override
   public class09672 N(String var1, float var2, class09838 var3) {
      float var4 = ((class09868)this.y_0).N(var1, var2, var3);
      float var5 = ((class09868)this.y_0).N(var2, var3);
      return new class09672(var4, var5);
   }
}
