package ru.metaculture.protection;

import java.util.Objects;

public final class NvvUnVuUvU extends nNUVNNNvN<String> {
   public NvvUnVuUvU(unNVnvNVNvVV var1, UvNnUnuNUUU var2) {
      super(Objects.requireNonNull(var1, "model"), UuUVuuUu(var1, Objects.requireNonNull(var2, "setting")));
   }

   private static nnvvuVUVNuvN UuUVuuUu(unNVnvNVNvVV var0, UvNnUnuNUUU var1) {
      final String var2 = var1.uNNnnnuuuN != null ? var1.uNNnnnuuuN : "";
      nNVnuNVvvv var3 = UuUVuuUu(var0, var2, new nNUVNNNvN.NVnVnNnN<String>() {
         public String C00OOC00oO(unNVnvNVNvVV var1) {
            Object var2x = var1.nNvNUVU();
            return var2x != null ? var2x.toString() : var2;
         }

         public void UuUVuuUu(unNVnvNVNvVV var1, String var2x) {
            String var3x = var2x != null ? var2x : var2;
            var1.C00OOC00oO(var3x);
         }
      });
      return new nnvvuVUVNuvN(UuUVuuUu(var0), vVvUvVVuuNvV(), var1, var3, "New Value");
   }
}
