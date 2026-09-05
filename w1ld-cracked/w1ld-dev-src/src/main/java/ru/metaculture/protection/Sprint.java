package ru.metaculture.protection;

import net.minecraft.class_1294;
import net.minecraft.class_2561;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Sprint",
   C00OOC00oO = "Сложна понять че за модуль",
   uUnuvNvvNU = oOOOo0.Movement
)
public class Sprint extends Module {
   public static UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "Обычный", "Обычный", "Постоянный");
   public static vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Сохранять спринт", false);
   public static nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Сила сохранения", 0.6F, 0.2F, 1.0F, 0.1F, false).UuUVuuUu(() -> !uVunuUNVVUUV.uUnuvNvvNU());
   public final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Игнорировать голод", false);
   public static int NnUuNNU = 0;

   public Sprint() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, UNnVVNvvnVvU, this.uNnUnnuNUnNu});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(NnVUvuvVUnv var1) {
      if (uUnuvNvvNU.field_1724 != null && !uUnuvNvvNU.field_1724.method_6059(class_1294.field_5919)) {
         if (uVunuUNVVUUV.uUnuvNvvNU()) {
            uUnuvNvvNU.field_1724
               .method_18800(
                  uUnuvNvvNU.field_1724.method_18798().field_1352 / UNnVVNvvnVvU.uUnuvNvvNU(),
                  uUnuvNvvNU.field_1724.method_18798().field_1351,
                  uUnuvNvvNU.field_1724.method_18798().field_1350 / UNnVVNvvnVvU.uUnuvNvvNU()
               );
            uUnuvNvvNU.field_1724.method_5728(true);
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(NnVNuVNVuU var1) {
      if (NVNnnvnuunNv.C00OOC00oO("Постоянный")) {
         NnUuNNU += 4;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (uUnuvNvvNU.field_1724.method_6059(class_1294.field_5919)) {
            uUnuvNvvNU.field_1724.method_5728(false);
            uUnuvNvvNU.field_1690.field_1867.method_23481(false);
         } else if (NVNnnvnuunNv.C00OOC00oO("Постоянный")) {
            this.UuuNnUvUuv();
         } else {
            boolean var2 = uUnuvNvvNU.field_1724.field_5976 && !uUnuvNvvNU.field_1724.field_34927;
            if (NnUuNNU != 0) {
               uUnuvNvvNU.field_1724.method_5728(false);
               uUnuvNvvNU.field_1690.field_1867.method_23481(false);
               NnUuNNU--;
            } else {
               if (oCCO0cc0C0Oc.C00OOC00oO(AttackAura.ccOO0COcoco0, AttackAura.C00OOC00oO(AttackAura.ccOO0COcoco0))) {
                  uUnuvNvvNU.field_1724.method_5728(false);
                  uUnuvNvvNU.field_1690.field_1867.method_23481(false);
               }

               if (!uUnuvNvvNU.field_1724.method_5715() && !var2 && uUnuvNvvNU.field_1690.field_1894.method_1434()) {
                  uUnuvNvvNU.field_1724.method_5728(true);
                  uUnuvNvvNU.field_1690.field_1867.method_23481(true);
               }
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      if (!uUnuvNvvNU.field_1724.method_5805()) {
         NnUuNNU += 2;
      }

      if (NnUuNNU != 0) {
         uUnuvNvvNU.field_1724.method_5728(false);
         uUnuvNvvNU.field_1690.field_1867.method_23481(false);
         NnUuNNU--;
      } else {
         boolean var1 = oCCO0cc0C0Oc.C00OOC00oO(AttackAura.ccOO0COcoco0, AttackAura.C00OOC00oO(AttackAura.ccOO0COcoco0));
         if (var1 && AttackAura.vvUVNVvvNUv.C00OOC00oO("Тестовый")) {
            uUnuvNvvNU.field_1690.field_1867.method_23481(false);
         } else if (var1 && AttackAura.vvUVNVvvNUv.C00OOC00oO("Обновленный")) {
            uUnuvNvvNU.field_1724.method_5728(false);
            uUnuvNvvNU.field_1690.field_1867.method_23481(false);
         } else {
            boolean var2 = uUnuvNvvNU.field_1724.method_5715() && !uUnuvNvvNU.field_1724.method_5681();
            if (!var2) {
               uUnuvNvvNU.field_1690.field_1867.method_23481(true);
            }
         }
      }
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_5728(false);
      }
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      if (this.uNnUnnuNUnNu.uUnuvNvvNU() && !NUvunNNvN.uUnuvNvvNU() && uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_7353(class_2561.method_30163("§cДанная настройка работает только на FunTime!"), true);
      }
   }
}
