package ru.metaculture.protection;

public enum O0000O000O0O {
   SMOOTH("Smooth", 1.0F, 1.0F, 1.0F),
   SNAPPY("Snappy", 1.55F, 1.06F, 1.1F),
   BOUNCY("Bouncy", 0.82F, 0.62F, 0.85F),
   CINEMATIC("Cinematic", 0.55F, 1.0F, 0.92F),
   LINEAR("Linear", 2.1F, 1.16F, 1.5F);

   public static final O0000O000O0O DEFAULT = SMOOTH;
   private static final float O000000000000 = 0.001F;
   private static final float O0000000000000 = 0.05F;
   private static final float O000000000000O = 0.985F;
   public final String O00000000;
   public final float O000000000;
   public final float O0000000000;
   public final float O00000000000;

   private O0000O000O0O(String string2, float f, float g, float h) {
      this.O00000000 = string2;
      this.O000000000 = f;
      this.O0000000000 = g;
      this.O00000000000 = h;
   }

   public float O00000000(float f) {
      return Math.max(0.001F, f * this.O000000000);
   }

   public float O000000000(float f) {
      float var2 = f * this.O0000000000;
      if (var2 < 0.05F) {
         return 0.05F;
      } else {
         return var2 > 0.985F ? 0.985F : var2;
      }
   }

   public float O0000000000(float f) {
      return f * this.O00000000000;
   }

   public static O0000O000O0O O00000000() {
      try {
         return MenuModule.O000000000OO == null ? DEFAULT : O00000000(MenuModule.O000000000OO.O0000000000());
      } catch (Throwable var1) {
         return DEFAULT;
      }
   }

   public static O0000O000O0O O00000000(String string) {
      if (string == null) {
         return DEFAULT;
      } else {
         for (O0000O000O0O var4 : values()) {
            if (var4.O00000000.equalsIgnoreCase(string)) {
               return var4;
            }
         }

         return DEFAULT;
      }
   }

   public static String[] O000000000() {
      O0000O000O0O[] var0 = values();
      String[] var1 = new String[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = var0[var2].O00000000;
      }

      return var1;
   }
}
