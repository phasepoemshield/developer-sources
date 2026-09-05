package ru.metaculture.protection;

import java.util.Objects;

public final class nvUUnNNnn extends nNUVNNNvN<Boolean> {
   public nvUUnNNnn(unNVnvNVNvVV var1, vvNnnUNnVvn var2) {
      super(Objects.requireNonNull(var1, "model"), UuUVuuUu(var1, Objects.requireNonNull(var2, "setting")));
   }

   private static nNVvUVunnVNV UuUVuuUu(unNVnvNVNvVV var0, vvNnnUNnVvn var1) {
      Boolean var2 = Boolean.FALSE;
      nNVnuNVvvv var3 = UuUVuuUu(var0, var2, new nNUVNNNvN.NVnVnNnN<Boolean>() {
         public Boolean C00OOC00oO(unNVnvNVNvVV var1) {
            Object var2x = var1.nNvNUVU();
            return Boolean.TRUE.equals(var2x);
         }

         public void UuUVuuUu(unNVnvNVNvVV var1, Boolean var2x) {
            var1.C00OOC00oO(Boolean.TRUE.equals(var2x));
         }
      });
      return new nNVvUVunnVNV(UuUVuuUu(var0), vVvUvVVuuNvV(), var1, var3, "New Value");
   }
}
