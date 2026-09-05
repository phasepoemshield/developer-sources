package ru.metaculture.protection;

import lombok.Generated;

public enum NuvNUuNN {
   LINEAR(VvVUUNUu.nuUnNvnuUu),
   QUAD_OUT(VvVUUNUu.vNUvnnVnUvu),
   CUBIC_OUT(VvVUUNUu.nvUVNnuu),
   QUART_OUT(VvVUUNUu.UnUNVVVNuv),
   QUINT_OUT(VvVUUNUu.uVUVnuvnuVuv),
   SINE_OUT(VvVUUNUu.UNnVVNvvnVvU),
   CIRC_OUT(VvVUUNUu.nNvNUVU),
   ELASTIC_OUT(VvVUUNUu.UvUvUNuvNU),
   EXPO_OUT(VvVUUNUu.unNNVVNnvvV),
   BACK_OUT(VvVUUNUu.UUVNuUNUvUnV),
   BOUNCE_OUT(VvVUUNUu.nnuUVNUuvvVU);

   private final nVunNUvNVN UuUVuuUu;

   @Override
   public String toString() {
      String var1 = this.name().toLowerCase();
      String[] var2 = var1.split("_");
      StringBuilder var3 = new StringBuilder();

      for (String var7 : var2) {
         var3.append(Character.toUpperCase(var7.charAt(0))).append(var7.substring(1)).append(" ");
      }

      return var3.toString().trim();
   }

   @Generated
   public nVunNUvNVN UuUVuuUu() {
      return this.UuUVuuUu;
   }

   @Generated
   private NuvNUuNN(nVunNUvNVN var3) {
      this.UuUVuuUu = var3;
   }
}
