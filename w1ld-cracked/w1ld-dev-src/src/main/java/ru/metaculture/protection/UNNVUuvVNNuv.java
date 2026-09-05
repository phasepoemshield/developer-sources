package ru.metaculture.protection;

import java.util.function.Supplier;

public class UNNVUuvVNNuv extends vNnVvvNU {
   private final Supplier<String> nuUnNvnuUu;
   private Runnable VVuuUN;

   public UNNVUuvVNNuv(String var1, int var2, Supplier<String> var3) {
      super(var1, var2);
      this.nuUnNvnuUu = var3;
   }

   @Override
   public String uNNnnnuuuN() {
      String var1 = this.nuUnNvnuUu == null ? null : this.nuUnNvnuUu.get();
      return var1 != null && !var1.isBlank() ? var1 : super.uNNnnnuuuN();
   }

   @Override
   public void vVvUvVVuuNvV() {
      if (this.VVuuUN != null) {
         this.VVuuUN.run();
      }
   }

   public UNNVUuvVNNuv C00OOC00oO(Runnable var1) {
      this.VVuuUN = var1;
      return this;
   }

   public UNNVUuvVNNuv C00OOC00oO(Supplier<Boolean> var1) {
      this.C00OOC00oO = var1;
      return this;
   }
}
