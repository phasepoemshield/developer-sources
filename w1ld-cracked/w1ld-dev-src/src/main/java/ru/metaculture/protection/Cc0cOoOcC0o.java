package ru.metaculture.protection;

import lombok.Generated;

public final class Cc0cOoOcC0o {
   private final float UuUVuuUu;
   private final float C00OOC00oO;
   private final float uUnuvNvvNU;
   private final float vVvUvVVuuNvV;

   private static Cc0cOoOcC0o UuUVuuUu(float var0, float var1, float var2, float var3) {
      VvUVVNnVVUNV var4 = VvUVVNnVVUNV.UuUVuuUu();
      return new Cc0cOoOcC0o(var4.UuUVuuUu(var0), var4.C00OOC00oO(var1), var4.uUnuvNvvNU(var2), var4.uUnuvNvvNU(var3));
   }

   public static Cc0cOoOcC0o UuUVuuUu() {
      return UuUVuuUu(0.045F, 0.85F, 0.001F, 0.001F);
   }

   public static Cc0cOoOcC0o C00OOC00oO() {
      return new Cc0cOoOcC0o(0.03F, 0.87F, 0.001F, 0.001F);
   }

   public static Cc0cOoOcC0o uUnuvNvvNU() {
      return new Cc0cOoOcC0o(0.075F, 0.86F, 0.002F, 0.002F);
   }

   public static Cc0cOoOcC0o vVvUvVVuuNvV() {
      return new Cc0cOoOcC0o(0.045F, 0.85F, 0.001F, 0.001F);
   }

   public static Cc0cOoOcC0o uNNnnnuuuN() {
      return UuUVuuUu(0.065F, 0.75F, 0.001F, 0.001F);
   }

   public static Cc0cOoOcC0o nuUnNvnuUu() {
      return UuUVuuUu(0.12F, 0.9F, 0.02F, 0.02F);
   }

   public static Cc0cOoOcC0o VVuuUN() {
      return UuUVuuUu(0.05F, 0.84F, 0.001F, 0.001F);
   }

   public static Cc0cOoOcC0o vNUvnnVnUvu() {
      return UuUVuuUu(0.062F, 0.86F, 0.001F, 0.001F);
   }

   public static Cc0cOoOcC0o uVUuuVnNVU() {
      return UuUVuuUu(0.08F, 0.55F, 0.001F, 0.001F);
   }

   public static Cc0cOoOcC0o vuuuNvNuv() {
      return UuUVuuUu(0.105F, 0.68F, 0.001F, 0.001F);
   }

   public static Cc0cOoOcC0o nvUVNnuu() {
      return UuUVuuUu(0.038F, 0.86F, 0.001F, 0.001F);
   }

   public static Cc0cOoOcC0o UuuNnUvUuv() {
      return UuUVuuUu(0.052F, 0.72F, 0.001F, 0.001F);
   }

   public static Cc0cOoOcC0o nUUVuvU() {
      return UuUVuuUu(0.018F, 0.88F, 0.001F, 0.001F);
   }

   public static Cc0cOoOcC0o UnUNVVVNuv() {
      return UuUVuuUu(0.012F, 0.92F, 0.001F, 0.001F);
   }

   public static Cc0cOoOcC0o vNVuvnUUnuUn() {
      return UuUVuuUu(0.1F, 0.88F, 0.002F, 0.002F);
   }

   public static Cc0cOoOcC0o UvnvNVnnnnNU() {
      return UuUVuuUu(0.035F, 0.88F, 0.001F, 0.001F);
   }

   public static Cc0cOoOcC0o uVUVnuvnuVuv() {
      return new Cc0cOoOcC0o(0.06111111F, (float)Math.exp(-0.4F), 0.001F, 0.001F);
   }

   @Generated
   public Cc0cOoOcC0o(float var1, float var2, float var3, float var4) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uUnuvNvvNU = var3;
      this.vVvUvVVuuNvV = var4;
   }

   @Generated
   public float NVNnnvnuunNv() {
      return this.UuUVuuUu;
   }

   @Generated
   public float uVunuUNVVUUV() {
      return this.C00OOC00oO;
   }

   @Generated
   public float UNnVVNvvnVvU() {
      return this.uUnuvNvvNU;
   }

   @Generated
   public float uNnUnnuNUnNu() {
      return this.vVvUvVVuuNvV;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Cc0cOoOcC0o var2)) {
         return false;
      } else if (Float.compare(this.NVNnnvnuunNv(), var2.NVNnnvnuunNv()) != 0) {
         return false;
      } else if (Float.compare(this.uVunuUNVVUUV(), var2.uVunuUNVVUUV()) != 0) {
         return false;
      } else {
         return Float.compare(this.UNnVVNvvnVvU(), var2.UNnVVNvvnVvU()) != 0 ? false : Float.compare(this.uNnUnnuNUnNu(), var2.uNnUnnuNUnNu()) == 0;
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + Float.floatToIntBits(this.NVNnnvnuunNv());
      var2 = var2 * 59 + Float.floatToIntBits(this.uVunuUNVVUUV());
      var2 = var2 * 59 + Float.floatToIntBits(this.UNnVVNvvnVvU());
      return var2 * 59 + Float.floatToIntBits(this.uNnUnnuNUnNu());
   }

   @Generated
   @Override
   public String toString() {
      return "SpringSpec(stiffness="
         + this.NVNnnvnuunNv()
         + ", damping="
         + this.uVunuUNVVUUV()
         + ", settleDistance="
         + this.UNnVVNvvnVvU()
         + ", settleVelocity="
         + this.uNnUnnuNUnNu()
         + ")";
   }
}
