package ru.metaculture.protection;

import net.minecraft.class_310;
import net.minecraft.class_3532;

public class VuVNuVvVn {
   private final double UuUVuuUu;
   private final double C00OOC00oO;
   private int uUnuvNvvNU;
   private int vVvUvVVuuNvV;
   private static int uNNnnnuuuN;

   public VuVNuVvVn(class_310 var1) {
      this.uUnuvNvvNU = var1.method_22683().method_4480();
      this.vVvUvVVuuNvV = var1.method_22683().method_4507();
      uNNnnnuuuN = 1;
      short var2 = 2;
      if (var2 == 0) {
         var2 = 1000;
      }

      while (uNNnnnuuuN < var2 && this.uUnuvNvvNU / (uNNnnnuuuN + 1) >= 320 && this.vVvUvVVuuNvV / (uNNnnnuuuN + 1) >= 240) {
         uNNnnnuuuN++;
      }

      this.UuUVuuUu = (double)this.uUnuvNvvNU / uNNnnnuuuN;
      this.C00OOC00oO = (double)this.vVvUvVVuuNvV / uNNnnnuuuN;
      this.uUnuvNvvNU = class_3532.method_15384(this.UuUVuuUu);
      this.vVvUvVVuuNvV = class_3532.method_15384(this.C00OOC00oO);
   }

   public int UuUVuuUu() {
      return this.uUnuvNvvNU;
   }

   public int C00OOC00oO() {
      return this.vVvUvVVuuNvV;
   }

   public int uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public int vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   public double uNNnnnuuuN() {
      return this.UuUVuuUu;
   }

   public double nuUnNvnuUu() {
      return this.C00OOC00oO;
   }

   public static int VVuuUN() {
      return uNNnnnuuuN;
   }
}
