package ru.metaculture.protection;

import net.minecraft.class_7439;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoAuth",
   C00OOC00oO = "Авто регистр/логин на серверах",
   uUnuvNvvNU = oOOOo0.Misc
)
public class AutoAuth extends Module {
   public final NVuVVUNUvV NVNnnvnuunNv = new NVuVVUNUvV("Пишите сюда ваш пороль", "");

   public AutoAuth() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (!NUvunNNvN.UuUVuuUu() && uUnuvNvvNU.field_1687 != null) {
         if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
            String var5 = var2.comp_763().getString();
            String var4 = this.NVNnnvnuunNv.uUnuvNvvNU();
            if ((var5.contains("Войдите") || var5.contains("/login")) && uUnuvNvvNU.field_1724.field_3944 != null) {
               uUnuvNvvNU.field_1724.field_3944.method_45730("login " + var4);
            }

            if ((var5.contains("Зарегистрируйтесь") || var5.contains("/reg")) && var4 != null && var4.length() >= 4 && uUnuvNvvNU.field_1724.field_3944 != null
               )
             {
               uUnuvNvvNU.field_1724.field_3944.method_45730("reg " + var4 + " " + var4);
            }
         }
      }
   }
}
