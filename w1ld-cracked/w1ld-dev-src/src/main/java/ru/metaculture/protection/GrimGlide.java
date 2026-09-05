package ru.metaculture.protection;

import net.minecraft.class_1294;
import net.minecraft.class_243;
import net.minecraft.class_2708;
import net.minecraft.class_2828;
import net.minecraft.class_3532;
import net.minecraft.class_2828.class_5911;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "GrimGlide",
   uUnuvNvvNU = oOOOo0.Movement,
   C00OOC00oO = "Обход Grim при полёте на элитрах",
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY, uVUNNUnNvU.GRIM}
)
public class GrimGlide extends Module {
   public final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Скорость", 1.0F, 1.0F, 2.0F, 0.05F, false);
   private int uVunuUNVVUUV;
   private boolean UNnVVNvvnVvU;
   private boolean uNnUnnuNUnNu;

   public GrimGlide() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (uUnuvNvvNU.field_1724 != null && !this.uNnUnnuNUnNu) {
         if (!var1.uUnuvNvvNU() && var1.vVvUvVVuuNvV() instanceof class_2708) {
            this.uVunuUNVVUUV = 2;
            this.UNnVVNvvnVvU = true;
         }

         if (var1.uUnuvNvvNU() && var1.vVvUvVVuuNvV() instanceof class_2828) {
            if (uUnuvNvvNU.field_1724.method_6128() && this.uVunuUNVVUUV == 0 && !this.UNnVVNvvnVvU) {
               this.uNnUnnuNUnNu = true;
               uUnuvNvvNU.method_1562().method_52787(new class_5911(true, true));
               this.uNnUnnuNUnNu = false;
               var1.C00OOC00oO();
            }

            this.UNnVVNvvnVvU = false;
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         if (this.uVunuUNVVUUV > 0) {
            this.uVunuUNVVUUV--;
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(oc0OoOOCo0oO var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         class_243 var2 = uUnuvNvvNU.field_1724.method_18798();
         class_243 var3 = uUnuvNvvNU.field_1724.method_5720();
         float var4 = uUnuvNvvNU.field_1724.method_36455() * (float) (Math.PI / 180.0);
         double var5 = Math.sqrt(var3.field_1352 * var3.field_1352 + var3.field_1350 * var3.field_1350);
         double var7 = var2.method_37267();
         boolean var9 = uUnuvNvvNU.field_1724.method_18798().field_1351 <= 0.0;
         double var10 = var9 && uUnuvNvvNU.field_1724.method_6059(class_1294.field_5906)
            ? Math.min(uUnuvNvvNU.field_1724.method_56989(), 0.01)
            : uUnuvNvvNU.field_1724.method_56989();
         double var12 = class_3532.method_33723(Math.cos(var4));
         var2 = var2.method_1031(0.0, var10 * (-1.0 + var12 * 0.75), 0.0);
         if (var2.field_1351 < 0.0 && var5 > 0.0) {
            double var14 = var2.field_1351 * -0.1 * var12;
            var2 = var2.method_1031(var3.field_1352 * var14 / var5, var14, var3.field_1350 * var14 / var5);
         }

         if (var4 < 0.0F && var5 > 0.0) {
            double var26 = var7 * -class_3532.method_15374(var4) * 0.04F;
            var2 = var2.method_1031(-var3.field_1352 * var26 / var5, var26 * 3.2, -var3.field_1350 * var26 / var5);
         }

         if (var5 > 0.0) {
            var2 = var2.method_1031((var3.field_1352 / var5 * var7 - var2.field_1352) * 0.1, 0.0, (var3.field_1350 / var5 * var7 - var2.field_1350) * 0.1);
         }

         double var16 = Math.toRadians(uUnuvNvvNU.field_1724.method_36454());
         double var18 = -Math.sin(var16);
         double var20 = Math.cos(var16);
         float var22 = this.NVNnnvnuunNv.uUnuvNvvNU();
         if (this.uVunuUNVVUUV >= 1) {
            double var23 = 0.09F * var22;
            var1.UuUVuuUu(var2.method_18805(0.99F, 0.98F, 0.99F).method_1031(var18 * var23, 0.03F * var22, var20 * var23));
         } else {
            float var27 = class_3532.method_15363(0.3F * var22, 0.3F, 0.85F);
            var1.UuUVuuUu(var2.method_18805(var27, var27, var27));
         }
      }
   }
}
