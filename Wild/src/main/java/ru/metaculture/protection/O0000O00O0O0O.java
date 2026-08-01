package ru.metaculture.protection;

public final class O0000O00O0O0O {
   public static final O0000O00O0O00O O00000000 = f -> {
      float var1 = O00000000(f);
      float var2 = 1.0F - var1;
      return 1.0F - var2 * var2 * var2;
   };
   public static final O0000O00O0O00O O000000000 = f -> {
      float var1 = O00000000(f);
      if (var1 < 0.5F) {
         float var4 = var1 * 2.0F;
         return 0.5F * var4 * var4 * var4 * var4 * var4;
      } else {
         float var2 = (var1 - 0.5F) * 2.0F;
         float var3 = 1.0F - var2;
         return 1.0F - 0.5F * var3 * var3 * var3 * var3 * var3;
      }
   };
   public static final O0000O00O0O00O O0000000000 = f -> {
      float var1 = O00000000(f);
      return var1 * var1 * (3.0F - 2.0F * var1);
   };

   private O0000O00O0O0O() {
   }

   private static float O00000000(float f) {
      if (f <= 0.0F) {
         return 0.0F;
      } else {
         return f >= 1.0F ? 1.0F : f;
      }
   }
}
