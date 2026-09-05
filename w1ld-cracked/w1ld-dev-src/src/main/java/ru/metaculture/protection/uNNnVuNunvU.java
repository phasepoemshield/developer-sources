package ru.metaculture.protection;

public final class uNNnVuNunvU {
   private final float UuUVuuUu;
   private final float C00OOC00oO;

   private uNNnVuNunvU(float var1, float var2) {
      if (var1 <= 0.0F) {
         throw new IllegalArgumentException("frequencyHz must be > 0");
      } else if (var2 <= 0.0F) {
         throw new IllegalArgumentException("dampingRatio must be > 0");
      } else {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
      }
   }

   public static uNNnVuNunvU UuUVuuUu(float var0, float var1) {
      return new uNNnVuNunvU(var0, var1);
   }

   public float UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public float C00OOC00oO() {
      return this.C00OOC00oO;
   }
}
