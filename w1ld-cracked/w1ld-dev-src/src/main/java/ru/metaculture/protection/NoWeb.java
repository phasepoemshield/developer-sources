package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "NoWeb",
   C00OOC00oO = "Убирает замедление в паутине",
   uUnuvNvvNU = oOOOo0.Movement
)
public class NoWeb extends Module {
   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (!VUUuVvvnNVUu.UuUVuuUu() && VUUuVvvnNVUu.C00OOC00oO()) {
         double[] var2 = UNnnNuVnu.UuUVuuUu((double)VnNnNnvuvn.uUnuvNvvNU(0.62F, 0.64F));
         uUnuvNvvNU.field_1724
            .method_18800(
               var2[0], uUnuvNvvNU.field_1690.field_1903.method_1434() ? 1.2 : (uUnuvNvvNU.field_1690.field_1832.method_1434() ? -2.0 : 0.0), var2[1]
            );
      }
   }
}
