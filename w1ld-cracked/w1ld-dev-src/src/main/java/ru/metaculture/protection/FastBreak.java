package ru.metaculture.protection;

import net.minecraft.class_1268;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2846;
import net.minecraft.class_3965;
import net.minecraft.class_2846.class_2847;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "FastBreak",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "Быстрая поломка блоков"
)
public class FastBreak extends Module {
   public final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Скорость", 0.5F, 0.1F, 1.0F, 0.1F, false);

   public FastBreak() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         if (uUnuvNvvNU.field_1690.field_1886.method_1434()) {
            if (uUnuvNvvNU.field_1765 instanceof class_3965 var2) {
               class_2338 var9 = var2.method_17777();
               class_2680 var4 = uUnuvNvvNU.field_1687.method_8320(var9);
               if (var4 != null && !var4.method_26215()) {
                  class_2350 var5 = var2.method_17780();
                  float var6 = this.NVNnnvnuunNv.uUnuvNvvNU();
                  if (var6 > 4.0F) {
                     uUnuvNvvNU.method_1562().method_52787(new class_2846(class_2847.field_12968, var9, var5));
                     uUnuvNvvNU.method_1562().method_52787(new class_2846(class_2847.field_12973, var9, var5));
                     uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                     uUnuvNvvNU.field_1761.method_2925();
                  } else {
                     int var7 = (int)(var6 * 50.85F);

                     for (int var8 = 0; var8 < var7; var8++) {
                        uUnuvNvvNU.field_1761.method_2902(var9, var5);
                     }

                     uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                  }
               }
            }
         }
      }
   }
}
