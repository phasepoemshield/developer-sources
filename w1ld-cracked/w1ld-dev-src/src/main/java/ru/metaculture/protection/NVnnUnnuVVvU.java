package ru.metaculture.protection;

import net.minecraft.class_310;
import net.minecraft.class_746;

public final class NVnnUnnuVVvU {
   private NVnnUnnuVVvU() {
   }

   public static void UuUVuuUu(class_746 var0) {
      UuUVuuUu(var0, new nVunNNvuv());
   }

   public static void UuUVuuUu(vUNVNUnuv var0, VunUNUNVUnv var1) {
      if (var0 != null) {
         VVUvVnVVV.UuUVuuUu(var0, () -> var0.UuuNnUvUuv().UuUVuuUu(var1));
      }
   }

   public static void UuUVuuUu(class_746 var0, VunUNUNVUnv var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null) {
         if (var2.field_1724 == null) {
            NUvnVVNvvu.UuUVuuUu(var1);
         } else if (var0 == var2.field_1724) {
            vUNVNUnuv var4 = nnVNNuuVUVn.UuUVuuUu(var0);
            if (var4 != null) {
               var4.UuuNnUvUuv().UuUVuuUu(var1);
            } else {
               NUvnVVNvvu.UuUVuuUu(var1);
            }
         } else {
            vUNVNUnuv var3 = nnVNNuuVUVn.UuUVuuUu(var0);
            if (var3 != null) {
               VVUvVnVVV.UuUVuuUu(var3, () -> var3.UuuNnUvUuv().UuUVuuUu(var1));
            }
         }
      }
   }
}
