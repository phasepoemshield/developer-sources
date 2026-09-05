package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "DragonFly",
   uUnuvNvvNU = oOOOo0.Movement,
   C00OOC00oO = "Ускоряет вас в воздухе"
)
public class DragonFly extends Module {
   public final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Скорость по X", 1.0F, 1.0F, 100.0F, 1.0F, false);
   public final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Скорость по Y", 1.0F, 1.0F, 100.0F, 1.0F, false);

   public DragonFly() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (!NUvunNNvN.UuUVuuUu()) {
         if (uUnuvNvvNU.field_1724.method_31549().field_7479) {
            double var2 = this.NVNnnvnuunNv.uUnuvNvvNU() / 10.0;
            double var4 = this.uVunuUNVVUUV.uUnuvNvvNU() / 10.0;
            double var6;
            if (uUnuvNvvNU.field_1690.field_1903.method_1434()) {
               var6 = var4;
            } else if (uUnuvNvvNU.field_1690.field_1832.method_1434()) {
               var6 = -var4;
            } else {
               var6 = 0.0;
            }

            if (UNnnNuVnu.UuUVuuUu()) {
               double[] var8 = UNnnNuVnu.UuUVuuUu(var2);
               uUnuvNvvNU.field_1724.method_18800(var8[0], var6, var8[1]);
            } else {
               uUnuvNvvNU.field_1724.method_18800(0.0, var6, 0.0);
            }
         }
      }
   }
}
