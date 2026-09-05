package ru.metaculture.protection;

import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoDrop",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Автоматически выбрасывает мусор"
)
public class AutoDrop extends Module {
   public static boolean NVNnnvnuunNv = false;
   private final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Камень", false);
   private final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Булыжник", false);
   private final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Гранит", false);
   private final vvNnnUNnVvn NnUuNNU = new vvNnnUNnVvn("Палки", false);
   private final vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Сланец", false);
   private final vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Андезит", false);
   private final vvNnnUNnVvn uUVuVvuNUvnu = new vvNnnUNnVvn("Незерак", false);
   private final vvNnnUNnVvn UvUvUNuvNU = new vvNnnUNnVvn("Базальт", false);
   private final vvNnnUNnVvn c0oOOCcCoC0 = new vvNnnUNnVvn("Чернит", false);
   private final vvNnnUNnVvn VVnVNnunVvu = new vvNnnUNnVvn("Блоки душ", false);
   private final vvNnnUNnVvn unNNVVNnvvV = new vvNnnUNnVvn("Руды ада", false);
   private final vvNnnUNnVvn NuunnvnN = new vvNnnUNnVvn("Гравий", false);
   private int NVUunUNUN = 9;
   private final VuNvNNvVV UUVNuUNUvUnV = new VuNvNNvVV();

   public AutoDrop() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.uVunuUNVVUUV,
            this.UNnVVNvvnVvU,
            this.uNnUnnuNUnNu,
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            this.c0oOOCcCoC0,
            this.VVnVNnunVvu,
            this.unNNVVNnvvV,
            this.NuunnvnN
         }
      );
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      NVNnnvnuunNv = false;
      this.UuuNnUvUuv();
   }

   private void UuuNnUvUuv() {
      if (this.NVUunUNUN > 44) {
         this.NVUunUNUN = 9;
      } else {
         class_1735 var1 = uUnuvNvvNU.field_1724.field_7498.method_7611(this.NVUunUNUN);
         if (!var1.method_7681()) {
            this.NVUunUNUN++;
         } else {
            class_1792 var2 = var1.method_7677().method_7909();
            if (this.UuUVuuUu(var2)) {
               NVNnnvnuunNv = true;
               int var3 = uUnuvNvvNU.field_1724.field_7498.field_7763;
               uUnuvNvvNU.field_1761.method_2906(var3, this.NVUunUNUN, 1, class_1713.field_7795, uUnuvNvvNU.field_1724);
               this.NVUunUNUN++;
            } else {
               this.NVUunUNUN++;
            }
         }
      }
   }

   private boolean UuUVuuUu(class_1792 var1) {
      if (var1 == class_1802.field_20391 && this.uVunuUNVVUUV.uUnuvNvvNU()) {
         return true;
      } else if (var1 == class_1802.field_20412 && this.UNnVVNvvnVvU.uUnuvNvvNU()) {
         return true;
      } else if (var1 == class_1802.field_20394 && this.uNnUnnuNUnNu.uUnuvNvvNU()) {
         return true;
      } else if (var1 == class_1802.field_8600 && this.NnUuNNU.uUnuvNvvNU()) {
         return true;
      } else if (var1 == class_1802.field_20407 && this.UnUNuUU.uUnuvNvvNU()) {
         return true;
      } else if ((var1 == class_1802.field_28866 || var1 == class_1802.field_29025) && this.nNvNUVU.uUnuvNvvNU()) {
         return true;
      } else if (var1 == class_1802.field_8328 && this.uUVuVvuNUvnu.uUnuvNvvNU()) {
         return true;
      } else if ((var1 == class_1802.field_22000 || var1 == class_1802.field_29024 || var1 == class_1802.field_23069) && this.UvUvUNuvNU.uUnuvNvvNU()) {
         return true;
      } else if ((var1 == class_1802.field_23843 || var1 == class_1802.field_23847) && this.c0oOOCcCoC0.uUnuvNvvNU()) {
         return true;
      } else if ((var1 == class_1802.field_8067 || var1 == class_1802.field_21999) && this.VVnVNnunVvu.uUnuvNvvNU()) {
         return true;
      } else {
         return (var1 == class_1802.field_8702 || var1 == class_1802.field_23140 || var1 == class_1802.field_8155 || var1 == class_1802.field_8397)
               && this.unNNVVNnvvV.uUnuvNvvNU()
            ? true
            : var1 == class_1802.field_8110 && this.NuunnvnN.uUnuvNvvNU();
      }
   }
}
