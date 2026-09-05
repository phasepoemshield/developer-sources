package ru.metaculture.protection;

public enum VvUVVNnVVUNV {
   SMOOTH("Smooth", 1.0F, 1.0F, 1.0F),
   SNAPPY("Snappy", 1.55F, 1.06F, 1.1F),
   BOUNCY("Bouncy", 0.82F, 0.62F, 0.85F),
   CINEMATIC("Cinematic", 0.55F, 1.0F, 0.92F),
   LINEAR("Linear", 2.1F, 1.16F, 1.5F);

   public static final VvUVVNnVVUNV DEFAULT = SMOOTH;
   private static final float uNNnnnuuuN = 0.001F;
   private static final float nuUnNvnuUu = 0.05F;
   private static final float VVuuUN = 0.985F;
   public final String UuUVuuUu;
   public final float C00OOC00oO;
   public final float uUnuvNvvNU;
   public final float vVvUvVVuuNvV;

   private VvUVVNnVVUNV(String var3, float var4, float var5, float var6) {
      this.UuUVuuUu = var3;
      this.C00OOC00oO = var4;
      this.uUnuvNvvNU = var5;
      this.vVvUvVVuuNvV = var6;
   }

   public float UuUVuuUu(float var1) {
      return Math.max(0.001F, var1 * this.C00OOC00oO);
   }

   public float C00OOC00oO(float var1) {
      float var2 = var1 * this.uUnuvNvvNU;
      if (var2 < 0.05F) {
         return 0.05F;
      } else {
         return var2 > 0.985F ? 0.985F : var2;
      }
   }

   public float uUnuvNvvNU(float var1) {
      return var1 * this.vVvUvVVuuNvV;
   }

   public static VvUVVNnVVUNV UuUVuuUu() {
      try {
         return Menu.UvUvUNuvNU == null ? DEFAULT : UuUVuuUu(Menu.UvUvUNuvNU.uUnuvNvvNU());
      } catch (Throwable var1) {
         return DEFAULT;
      }
   }

   public static VvUVVNnVVUNV UuUVuuUu(String var0) {
      if (var0 == null) {
         return DEFAULT;
      } else {
         for (VvUVVNnVVUNV var4 : values()) {
            if (var4.UuUVuuUu.equalsIgnoreCase(var0)) {
               return var4;
            }
         }

         return DEFAULT;
      }
   }

   public static String[] C00OOC00oO() {
      VvUVVNnVVUNV[] var0 = values();
      String[] var1 = new String[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = var0[var2].UuUVuuUu;
      }

      return var1;
   }
}
