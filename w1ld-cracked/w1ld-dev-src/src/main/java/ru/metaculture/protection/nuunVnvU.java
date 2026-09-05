package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class nuunVnvU extends nvUuvVvuuN {
   public List<String> vVvUvVVuuNvV;
   public boolean uNNnnnuuuN;
   public String nuUnNvnuUu;
   public List<String> VVuuUN = new ArrayList<>();
   private Supplier<List<String>> uVUuuVnNVU;
   protected List<String> vNUvnnVnUvu = new ArrayList<>();

   public nuunVnvU(String var1, String... var2) {
      this.UuUVuuUu = var1;
      this.vVvUvVVuuNvV = Arrays.asList(var2);
      this.nuUnNvnuUu = this.nuUnNvnuUu;
      this.vVvUvVVuuNvV();
   }

   public nuunVnvU(String var1, Supplier<List<String>> var2) {
      this.UuUVuuUu = var1;
      this.uVUuuVnNVU = var2;
      this.vVvUvVVuuNvV = new ArrayList<>();
      this.uUnuvNvvNU();
      this.vVvUvVVuuNvV();
   }

   public nuunVnvU UuUVuuUu(Supplier<Boolean> var1) {
      this.C00OOC00oO = var1;
      return this;
   }

   public nuunVnvU C00OOC00oO(Supplier<List<String>> var1) {
      this.uVUuuVnNVU = var1;
      this.uUnuvNvvNU();
      return this;
   }

   public List<String> uUnuvNvvNU() {
      if (this.uVUuuVnNVU == null) {
         return this.vVvUvVVuuNvV == null ? Collections.emptyList() : this.vVvUvVVuuNvV;
      } else {
         List var1;
         try {
            var1 = this.uVUuuVnNVU.get();
         } catch (Throwable var5) {
            var1 = Collections.emptyList();
         }

         ArrayList var2 = new ArrayList();
         if (var1 != null) {
            for (String var4 : var1) {
               if (var4 != null && !var4.isBlank() && !var2.contains(var4)) {
                  var2.add(var4);
               }
            }
         }

         this.vVvUvVVuuNvV = var2;
         if (this.VVuuUN != null) {
            this.VVuuUN.removeIf(var1x -> var1x == null || !var2.contains(var1x));
         } else {
            this.VVuuUN = new ArrayList<>();
         }

         return this.vVvUvVVuuNvV;
      }
   }

   protected void vVvUvVVuuNvV() {
      this.vNUvnnVnUvu = this.VVuuUN == null ? new ArrayList<>() : new ArrayList<>(this.VVuuUN);
   }

   @Override
   public void C00OOC00oO() {
      this.uUnuvNvvNU();
      this.uNNnnnuuuN = false;
      this.VVuuUN = new ArrayList<>();
      if (this.vNUvnnVnUvu != null) {
         for (String var2 : this.vNUvnnVnUvu) {
            if (var2 != null && this.vVvUvVVuuNvV != null && this.vVvUvVVuuNvV.contains(var2)) {
               this.VVuuUN.add(var2);
            }
         }
      }
   }

   public String uNNnnnuuuN() {
      this.uUnuvNvvNU();
      StringBuilder var1 = new StringBuilder();

      for (int var2 = 0; var2 < this.vVvUvVVuuNvV.size(); var2++) {
         var1.append(this.vVvUvVVuuNvV.get(var2));
         if (var2 == 2 && this.vVvUvVVuuNvV.size() > 3) {
            var1.append("...");
            break;
         }

         if (var2 < this.vVvUvVVuuNvV.size() - 1) {
            var1.append(", ");
         }
      }

      return var1.toString();
   }

   public boolean C00OOC00oO(String var1) {
      this.uUnuvNvvNU();
      return this.VVuuUN.contains(var1);
   }
}
