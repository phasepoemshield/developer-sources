package ru.metaculture.protection;

import java.util.Objects;

public final class UUuuVUuvuV extends nNUVNNNvN<Double> {
   public UUuuVUuvuV(unNVnvNVNvVV var1, nNUuNvVn var2) {
      super(Objects.requireNonNull(var1, "model"), UuUVuuUu(var1, Objects.requireNonNull(var2, "setting")));
   }

   private static vnuuuVVuNvvv UuUVuuUu(unNVnvNVNvVV var0, nNUuNvVn var1) {
      final double var2 = var1.vVvUvVVuuNvV;
      nNVnuNVvvv var4 = UuUVuuUu(var0, var2, new nNUVNNNvN.NVnVnNnN<Double>() {
         public Double C00OOC00oO(unNVnvNVNvVV var1) {
            return var1.nNvNUVU() instanceof Number var3 ? var3.doubleValue() : var2;
         }

         public void UuUVuuUu(unNVnvNVNvVV var1, Double var2x) {
            double var3 = var2x != null ? var2x : var2;
            var1.C00OOC00oO(var3);
         }
      });
      return new vnuuuVVuNvvv(UuUVuuUu(var0), vVvUvVVuuNvV(), var1, var4, "New Value");
   }
}
