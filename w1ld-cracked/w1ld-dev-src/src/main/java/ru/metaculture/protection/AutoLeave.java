package ru.metaculture.protection;

import net.minecraft.class_2561;
import net.minecraft.class_742;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoLeave",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Автоматический выход"
)
public class AutoLeave extends Module {
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим работы", "Хаб", "Хаб", "Меню");
   public final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Триггеры", "Игрок рядом", "Игрок рядом", "ХП");
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Радиус игрока", 30.0F, 10.0F, 100.0F, 1.0F, false)
      .UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("Игрок рядом"));
   public final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Порог здоровья", 10.0F, 1.0F, 20.0F, 1.0F, false).UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("ХП"));
   private final UUVuuNuvVuVv NnUuNNU = new UUVuuNuvVuVv();

   public AutoLeave() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (this.NnUuNNU.C00OOC00oO(100.0)) {
            boolean var2 = false;
            String var3 = "";
            if (this.uVunuUNVVUUV.C00OOC00oO("ХП")) {
               float var4 = uUnuvNvvNU.field_1724.method_6032() + uUnuvNvvNU.field_1724.method_6067();
               if (var4 <= this.uNnUnnuNUnNu.uUnuvNvvNU()) {
                  var2 = true;
                  var3 = "Мало здоровья (" + (int)var4 + " HP)";
               }
            } else if (this.uVunuUNVVUUV.C00OOC00oO("Игрок рядом")) {
               for (class_742 var5 : uUnuvNvvNU.field_1687.method_18456()) {
                  if (var5 != uUnuvNvvNU.field_1724 && !uNvUVUNvuUVV.UuUVuuUu(var5.method_5477().getString())) {
                     double var6 = uUnuvNvvNU.field_1724.method_5739(var5);
                     if (var6 <= this.UNnVVNvvnVvU.uUnuvNvvNU()) {
                        var2 = true;
                        var3 = var5.method_5477().getString();
                        break;
                     }
                  }
               }
            }

            if (var2) {
               this.UuUVuuUu(var3);
               this.NnUuNNU.UuUVuuUu();
               this.a_();
            }
         }
      }
   }

   private void UuUVuuUu(String var1) {
      if (this.NVNnnvnuunNv.C00OOC00oO("Хаб")) {
         if (uUnuvNvvNU.field_1724.field_3944 != null) {
            uUnuvNvvNU.field_1724.field_3944.method_45729("/hub");
            if (ClientUtil.NVNnnvnuunNv.uUnuvNvvNU()) {
               uvNnnnUuVu.UuUVuuUu("[AutoLeave] Был замечен игрок, его ник - " + var1);
            }
         }
      } else if (this.NVNnnvnuunNv.C00OOC00oO("Меню") && uUnuvNvvNU.method_1562() != null && uUnuvNvvNU.method_1562().method_48296() != null) {
         String var2 = var1;
         if (this.uVunuUNVVUUV.C00OOC00oO("Игрок рядом")) {
            var2 = "Был замечен игрок, его ник - " + var1;
         }

         uUnuvNvvNU.method_1562().method_48296().method_10747(class_2561.method_30163(var2));
      }
   }
}
