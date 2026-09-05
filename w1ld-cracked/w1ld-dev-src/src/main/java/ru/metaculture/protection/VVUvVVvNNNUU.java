package ru.metaculture.protection;

public class VVUvVVvNNNUU extends nvvvUNUnuVv {
   @Override
   public double UuUVuuUu(double var1) {
      double var3 = 1.0 - var1;
      double var5 = var3 * var3;
      double var7 = var1 * var1;
      NVNuuvUNNuVN var9 = this.uUnuvNvvNU().UuUVuuUu();
      return this.UuUVuuUu()
         .UuUVuuUu()
         .C00OOC00oO(var5, var3)
         .C00OOC00oO(var9.UuUVuuUu(3.0 * var5 * var1))
         .C00OOC00oO(var9.UuUVuuUu(this.vVvUvVVuuNvV()).UuUVuuUu(3.0 * var3 * var7))
         .C00OOC00oO(var9.UuUVuuUu(this.C00OOC00oO()).UuUVuuUu(var7 * var1))
         .uUnuvNvvNU();
   }

   public static class NVnVnNnN {
      private VVUvVVvNNNUU UuUVuuUu = new VVUvVVvNNNUU();

      public NVnVnNnN(VVUvVVvNNNUU var1) {
         this.UuUVuuUu = var1;
      }

      public NVnVnNnN() {
      }

      public VVUvVVvNNNUU.NVnVnNnN UuUVuuUu(NVNuuvUNNuVN var1) {
         this.UuUVuuUu.UuUVuuUu(var1);
         return this;
      }

      public VVUvVVvNNNUU.NVnVnNnN C00OOC00oO(NVNuuvUNNuVN var1) {
         this.UuUVuuUu.C00OOC00oO(var1);
         return this;
      }

      public VVUvVVvNNNUU UuUVuuUu() {
         return this.UuUVuuUu;
      }
   }
}
