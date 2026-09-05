package ru.metaculture.protection;

import java.util.function.Supplier;

public class NVuVVUNUvV extends nvUuvVvuuN {
   public static final int vVvUvVVuuNvV = 256;
   public String uNNnnnuuuN;
   public String nuUnNvnuUu;
   public int VVuuUN = 256;
   private final String uVUuuVnNVU;
   public boolean vNUvnnVnUvu;

   public NVuVVUNUvV(String var1, String var2) {
      this.UuUVuuUu = var1;
      this.uNNnnnuuuN = UuUVuuUu(var2, 256);
      this.uVUuuVnNVU = this.uNNnnnuuuN;
   }

   public String uUnuvNvvNU() {
      return this.uNNnnnuuuN;
   }

   public void C00OOC00oO(String var1) {
      this.uNNnnnuuuN = UuUVuuUu(var1, this.VVuuUN);
   }

   public NVuVVUNUvV UuUVuuUu(Supplier<Boolean> var1) {
      this.C00OOC00oO = var1;
      return this;
   }

   @Override
   public void C00OOC00oO() {
      this.uNNnnnuuuN = UuUVuuUu(this.uVUuuVnNVU, this.VVuuUN);
      this.vNUvnnVnUvu = false;
   }

   public NVuVVUNUvV UuUVuuUu(int var1) {
      this.VVuuUN = Math.max(1, var1);
      if (this.uNNnnnuuuN != null && this.uNNnnnuuuN.length() > this.VVuuUN) {
         this.uNNnnnuuuN = this.uNNnnnuuuN.substring(0, this.VVuuUN);
      }

      return this;
   }

   private static String UuUVuuUu(String var0, int var1) {
      if (var0 == null) {
         return "";
      } else {
         return var0.length() > var1 ? var0.substring(0, var1) : var0;
      }
   }
}
