package ru.metaculture.protection;

import net.minecraft.class_243;
import net.minecraft.class_2828;
import net.minecraft.class_4184;
import net.minecraft.class_2828.class_2830;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AirStuck",
   uUnuvNvvNU = oOOOo0.Movement,
   C00OOC00oO = "Позволяет застывать в воздухе",
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY, uVUNNUnNvU.PATCHED, uVUNNUnNvU.GRIM}
)
public class AirStuck extends Module {
   public final vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Обход Grim", true);
   private class_243 uVunuUNVVUUV = null;
   private boolean UNnVVNvvnVvU = false;

   public AirStuck() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      if (uUnuvNvvNU.field_1724 != null) {
         this.uVunuUNVVUUV = uUnuvNvvNU.field_1724.method_19538();
      }

      this.UNnVVNvvnVvU = false;
   }

   @Override
   public void C00OOC00oO() {
      this.uVunuUNVVUUV = null;
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && this.uVunuUNVVUUV != null) {
         uUnuvNvvNU.field_1724.method_18800(0.0, 0.0, 0.0);
         uUnuvNvvNU.field_1724.method_33574(this.uVunuUNVVUUV);
         uUnuvNvvNU.field_1724.field_6014 = this.uVunuUNVVUUV.field_1352;
         uUnuvNvvNU.field_1724.field_6036 = this.uVunuUNVVUUV.field_1351;
         uUnuvNvvNU.field_1724.field_5969 = this.uVunuUNVVUUV.field_1350;
         uUnuvNvvNU.field_1724.field_6017 = 0.0;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1773 != null && !this.UNnVVNvvnVvU) {
         if (var1.vVvUvVVuuNvV() instanceof class_2828 && this.uVunuUNVVUUV != null) {
            if (this.NVNnnvnuunNv.uUnuvNvvNU()) {
               var1.C00OOC00oO();
            } else {
               var1.C00OOC00oO();
               class_4184 var2 = uUnuvNvvNU.field_1773.method_19418();
               this.UNnVVNvvnVvU = true;
               uUnuvNvvNU.method_1562()
                  .method_52787(
                     new class_2830(
                        this.uVunuUNVVUUV.field_1352,
                        this.uVunuUNVVUUV.field_1351,
                        this.uVunuUNVVUUV.field_1350,
                        var2.method_19330(),
                        var2.method_19329(),
                        false,
                        false
                     )
                  );
               this.UNnVVNvvnVvU = false;
            }
         }
      }
   }
}
