package ru.metaculture.protection;

import net.minecraft.class_2561;
import net.minecraft.class_357;

public final class nuVVnuUuuNnu extends class_357 {
   private final AutoBuy UuUVuuUu;

   public nuVVnuUuuNnu(AutoBuy var1, int var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5, UuUVuuUu(var1), C00OOC00oO(var1));
      this.UuUVuuUu = var1;
   }

   protected void method_25346() {
      this.method_25355(UuUVuuUu(this.UuUVuuUu));
   }

   protected void method_25344() {
      this.UuUVuuUu.UnUNuUU.UuUVuuUu(UuUVuuUu(this.UuUVuuUu, this.field_22753));
      this.method_25346();
   }

   public void UuUVuuUu() {
      this.field_22753 = C00OOC00oO(this.UuUVuuUu);
      this.method_25346();
   }

   private static class_2561 UuUVuuUu(AutoBuy var0) {
      return class_2561.method_43470("Discount: " + Math.round(var0.UnUNuUU.uUnuvNvvNU()) + "%");
   }

   private static double C00OOC00oO(AutoBuy var0) {
      float var1 = var0.UnUNuUU.uNNnnnuuuN;
      float var2 = var0.UnUNuUU.nuUnNvnuUu;
      return var2 <= var1 ? 0.0 : Math.max(0.0, Math.min(1.0, (double)((var0.UnUNuUU.uUnuvNvvNU() - var1) / (var2 - var1))));
   }

   private static float UuUVuuUu(AutoBuy var0, double var1) {
      double var3 = Math.max(0.0, Math.min(1.0, var1));
      float var5 = var0.UnUNuUU.uNNnnnuuuN;
      float var6 = var0.UnUNuUU.nuUnNvnuUu;
      float var7 = (float)(var5 + var3 * (var6 - var5));
      float var8 = var0.UnUNuUU.VVuuUN;
      if (var8 > 0.0F) {
         var7 = Math.round(var7 / var8) * var8;
      }

      return Math.max(var5, Math.min(var6, var7));
   }
}
