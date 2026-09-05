package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class UvNnUnuNUUU extends nvUuvVvuuN {
   public final List<String> vVvUvVVuuNvV;
   public String uNNnnnuuuN;
   public String nuUnNvnuUu;
   public UUVVvUvuNNn VVuuUN = new VUnvnVNv(300, 1.0);
   public int vNUvnnVnUvu;
   public boolean uVUuuVnNVU;
   private final String vuuuNvNuv;

   public UvNnUnuNUUU(String var1, String var2, String... var3) {
      this.UuUVuuUu = var1;
      this.vVvUvVVuuNvV = new ArrayList<>(Arrays.asList(var3));
      this.vNUvnnVnUvu = this.vVvUvVVuuNvV.indexOf(var2);
      if (this.vNUvnnVnUvu < 0) {
         this.vNUvnnVnUvu = 0;
      }

      this.uNNnnnuuuN = this.vVvUvVVuuNvV.get(this.vNUvnnVnUvu);
      this.vuuuNvNuv = this.uNNnnnuuuN;
   }

   public String uUnuvNvvNU() {
      return this.uNNnnnuuuN;
   }

   public boolean C00OOC00oO(String var1) {
      return this.uNNnnnuuuN.equalsIgnoreCase(var1);
   }

   public UvNnUnuNUUU UuUVuuUu(Supplier<Boolean> var1) {
      this.C00OOC00oO = var1;
      return this;
   }

   public void UuUVuuUu(List<String> var1) {
      String var2 = this.uNNnnnuuuN;
      this.vVvUvVVuuNvV.clear();
      this.vVvUvVVuuNvV.addAll(var1);
      this.vNUvnnVnUvu = this.vVvUvVVuuNvV.indexOf(var2);
      if (this.vNUvnnVnUvu < 0) {
         this.vNUvnnVnUvu = this.vVvUvVVuuNvV.indexOf(this.vuuuNvNuv);
      }

      if (this.vNUvnnVnUvu < 0) {
         this.vNUvnnVnUvu = 0;
      }

      this.uNNnnnuuuN = this.vVvUvVVuuNvV.get(this.vNUvnnVnUvu);
   }

   @Override
   public void C00OOC00oO() {
      int var1 = this.vVvUvVVuuNvV.indexOf(this.vuuuNvNuv);
      if (var1 < 0) {
         var1 = 0;
      }

      this.vNUvnnVnUvu = var1;
      this.uNNnnnuuuN = this.vVvUvVVuuNvV.get(var1);
      this.uVUuuVnNVU = false;
   }
}
