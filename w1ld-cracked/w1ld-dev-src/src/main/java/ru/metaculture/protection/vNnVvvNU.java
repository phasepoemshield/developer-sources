package ru.metaculture.protection;

import java.util.function.Supplier;

public class vNnVvvNU extends nvUuvVvuuN {
   public int vVvUvVVuuNvV;
   public String uNNnnnuuuN;
   private String nuUnNvnuUu = "Run";
   private Runnable VVuuUN;
   private final int vNUvnnVnUvu;

   public vNnVvvNU(String var1, int var2) {
      this.UuUVuuUu = var1;
      this.vVvUvVVuuNvV = var2;
      this.vNUvnnVnUvu = var2;
   }

   public int uUnuvNvvNU() {
      return this.vVvUvVVuuNvV;
   }

   public void UuUVuuUu(int var1) {
      this.vVvUvVVuuNvV = var1;
   }

   public void vVvUvVVuuNvV() {
      this.vVvUvVVuuNvV++;
      if (this.VVuuUN != null) {
         this.VVuuUN.run();
      }
   }

   public String uNNnnnuuuN() {
      return this.nuUnNvnuUu;
   }

   public vNnVvvNU C00OOC00oO(String var1) {
      this.nuUnNvnuUu = var1;
      return this;
   }

   public vNnVvvNU UuUVuuUu(Runnable var1) {
      this.VVuuUN = var1;
      return this;
   }

   public vNnVvvNU UuUVuuUu(Supplier<Boolean> var1) {
      this.C00OOC00oO = var1;
      return this;
   }

   @Override
   public void C00OOC00oO() {
      this.vVvUvVVuuNvV = this.vNUvnnVnUvu;
   }
}
