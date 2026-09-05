package ru.metaculture.protection;

import net.minecraft.class_1268;
import net.minecraft.class_1536;
import net.minecraft.class_2767;
import net.minecraft.class_3417;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoFish",
   C00OOC00oO = "Ловит за вас карасей",
   uUnuvNvvNU = oOOOo0.Player
)
public class AutoFish extends Module {
   public static VuNvNNvVV NVNnnvnuunNv = new VuNvNNvVV();
   public static boolean uVunuUNVVUUV = false;
   public static boolean UNnVVNvvnVvU = false;

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         if (NVNnnvnuunNv.uUnuvNvvNU(600.0) && uVunuUNVVUUV) {
            uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            uVunuUNVVUUV = false;
            UNnVVNvvnVvU = true;
            NVNnnvnuunNv.UuUVuuUu();
         }

         if (NVNnnvnuunNv.uUnuvNvvNU(300.0) && UNnVVNvvnVvU) {
            uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            UNnVVNvvnVvU = false;
            NVNnnvnuunNv.UuUVuuUu();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (var1.vVvUvVVuuNvV() instanceof class_2767 var2) {
         if (var2.method_11894().comp_349() == class_3417.field_14660) {
            class_1536 var12 = uUnuvNvvNU.field_1724.field_7513;
            if (var12 != null) {
               double var4 = var2.method_11890() - var12.method_23317();
               double var6 = var2.method_11889() - var12.method_23318();
               double var8 = var2.method_11893() - var12.method_23321();
               double var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
               if (var10 <= 0.5) {
                  uVunuUNVVUUV = true;
                  NVNnnvnuunNv.UuUVuuUu();
               }
            }
         }
      }
   }
}
