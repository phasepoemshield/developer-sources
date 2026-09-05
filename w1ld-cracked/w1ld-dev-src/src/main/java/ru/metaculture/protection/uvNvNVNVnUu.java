package ru.metaculture.protection;

import net.minecraft.class_1937;
import net.minecraft.class_5321;

public final class uvNvNVNVnUu {
   private final String UuUVuuUu;
   private final double C00OOC00oO;
   private final double uUnuvNvvNU;
   private final double vVvUvVVuuNvV;
   private final class_5321<class_1937> uNNnnnuuuN;
   private final double nuUnNvnuUu;
   private final uVVuNvUUV VVuuUN = new uVVuNvUUV();
   private final uVVuNvUUV vNUvnnVnUvu = new uVVuNvUUV();
   private boolean uVUuuVnNVU = true;

   public uvNvNVNVnUu(String var1, double var2, double var4, double var6, class_5321<class_1937> var8, double var9) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uUnuvNvvNU = var4;
      this.vVvUvVVuuNvV = var6;
      this.uNNnnnuuuN = var8;
      this.nuUnNvnuUu = var9;
      this.VVuuUN.UuUVuuUu(1.0, 0.42, VnuVvnV.UUVNuUNUvUnV);
      this.vNUvnnVnUvu.UuUVuuUu(1.0, 0.7, VnuVvnV.nvUVNnuu);
   }

   public String UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public double C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public double uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public double vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   public boolean uNNnnnuuuN() {
      return this.uVUuuVnNVU;
   }

   public void nuUnNvnuUu() {
      if (this.uVUuuVnNVU) {
         this.uVUuuVnNVU = false;
         this.VVuuUN.UuUVuuUu(0.0, 0.22, VnuVvnV.vNUvnnVnUvu);
         this.vNUvnnVnUvu.UuUVuuUu(0.0, 0.16, VnuVvnV.vNUvnnVnUvu);
      }
   }

   public boolean VVuuUN() {
      return !this.uVUuuVnNVU && this.VVuuUN.uNNnnnuuuN() <= 0.01F;
   }

   public float vNUvnnVnUvu() {
      this.vNUvnnVnUvu.UuUVuuUu();
      this.VVuuUN.UuUVuuUu();
      return this.VVuuUN.uNNnnnuuuN();
   }

   public float uVUuuVnNVU() {
      return this.vNUvnnVnUvu.uNNnnnuuuN();
   }

   public boolean UuUVuuUu(class_5321<class_1937> var1) {
      return this.uNNnnnuuuN == null || this.uNNnnnuuuN.equals(var1);
   }

   public double UuUVuuUu(double var1) {
      return var1 <= 0.0 ? 1.0 : this.nuUnNvnuUu / var1;
   }

   public String vuuuNvNuv() {
      if (this.uNNnnnuuuN == null) {
         return "";
      } else if (class_1937.field_25180.equals(this.uNNnnnuuuN)) {
         return "Ад";
      } else if (class_1937.field_25181.equals(this.uNNnnnuuuN)) {
         return "Край";
      } else {
         return class_1937.field_25179.equals(this.uNNnnnuuuN) ? "Обычный мир" : this.uNNnnnuuuN.method_29177().method_12832();
      }
   }
}
