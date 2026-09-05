package ru.metaculture.protection;

import net.minecraft.class_437;
import net.minecraft.class_5498;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "FreeLock",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Вид от третьего лица"
)
public class FreeLock extends Module {
   private final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "По удержанию", "По удержанию", "По бинду");
   private final uVNuNUVvn uVunuUNVVUUV = new uVNuNUVvn("Бинд", -1, true);
   private class_5498 UNnVVNvvnVvU;

   public FreeLock() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV});
   }

   public boolean UuuNnUvUuv() {
      return this.UNnVVNvvnVvU != null;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (!NUvunNNvN.UuUVuuUu()) {
         if (this.UuUVuuUu(uUnuvNvvNU.field_1755)) {
            this.UnUNVVVNuv();
         } else if (var1.vVvUvVVuuNvV() == this.uVunuUNVVUUV.uUnuvNvvNU()) {
            boolean var2 = uVNuNUVvn.C00OOC00oO(this.uVunuUNVVUUV.uUnuvNvvNU());
            if (this.NVNnnvnuunNv.C00OOC00oO("По удержанию")) {
               if (var2 && this.UNnVVNvvnVvU == null) {
                  this.nUUVuvU();
               } else if (!var2 && this.UNnVVNvvnVvU != null) {
                  this.UnUNVVVNuv();
               }
            } else if (this.NVNnnvnuunNv.C00OOC00oO("По бинду") && var2) {
               if (this.UNnVVNvvnVvU != null) {
                  this.UnUNVVVNuv();
               } else {
                  this.nUUVuvU();
               }
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (this.UuUVuuUu(uUnuvNvvNU.field_1755)) {
         this.UnUNVVVNuv();
      }
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      this.UnUNVVVNuv();
   }

   private void nUUVuvU() {
      if (!NUvunNNvN.UuUVuuUu() && !this.UuUVuuUu(uUnuvNvvNU.field_1755)) {
         AttackAura var1 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(AttackAura.class);
         if (var1 != null && var1.nuUnNvnuUu) {
            vVnvuVVUunuv.UuUVuuUu("Отключите ауру для использования фрилука");
         } else if (uUnuvNvvNU.field_1690 != null) {
            this.UNnVVNvvnVvU = uUnuvNvvNU.field_1690.method_31044();
            uUnuvNvvNU.field_1690.method_31043(class_5498.field_26665);
            NNvvnnunn.uUnuvNvvNU = uUnuvNvvNU.field_1773.method_19418().method_19330();
            NNvvnnunn.vVvUvVVuuNvV = uUnuvNvvNU.field_1773.method_19418().method_19329();
            NNvvnnunn.C00OOC00oO = true;
            NNvvnnunn.UuUVuuUu = true;
         }
      }
   }

   private void UnUNVVVNuv() {
      if (this.UNnVVNvvnVvU != null) {
         if (uUnuvNvvNU.field_1690 != null) {
            uUnuvNvvNU.field_1690.method_31043(this.UNnVVNvvnVvU);
         }

         this.UNnVVNvvnVvU = null;
         NNvvnnunn.C00OOC00oO = false;
         NNvvnnunn.UuUVuuUu = false;
      }
   }

   private boolean UuUVuuUu(class_437 var1) {
      return var1 != null;
   }
}
