package ru.metaculture.protection;

import java.util.function.Supplier;

public class vvNnnUNnVvn extends nvUuvVvuuN {
   private boolean uVUuuVnNVU;
   private final boolean vuuuNvNuv;
   public String vVvUvVVuuNvV;
   public VVnnnnN uNNnnnuuuN = new VVnnnnN();
   public int nuUnNvnuUu = -1;
   public boolean VVuuUN = false;
   public boolean vNUvnnVnUvu = false;

   public vvNnnUNnVvn(String var1, boolean var2) {
      this.UuUVuuUu = var1;
      this.uVUuuVnNVU = var2;
      this.vuuuNvNuv = var2;
      this.vVvUvVVuuNvV = this.vVvUvVVuuNvV;
   }

   public boolean uUnuvNvvNU() {
      return this.nuUnNvnuUu != -1 && this.VVuuUN ? this.uVUuuVnNVU || uVNuNUVvn.C00OOC00oO(this.nuUnNvnuUu) : this.uVUuuVnNVU;
   }

   public boolean vVvUvVVuuNvV() {
      return this.uVUuuVnNVU;
   }

   public void C00OOC00oO(boolean var1) {
      this.uVUuuVnNVU = var1;
   }

   public vvNnnUNnVvn UuUVuuUu(Supplier<Boolean> var1) {
      this.C00OOC00oO = var1;
      return this;
   }

   @Override
   public void C00OOC00oO() {
      this.C00OOC00oO(this.vuuuNvNuv);
      this.nuUnNvnuUu = -1;
      this.VVuuUN = false;
      this.vNUvnnVnUvu = false;
   }
}
