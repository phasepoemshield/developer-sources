package ru.metaculture.protection;

import net.minecraft.class_7472;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ChatHelper",
   C00OOC00oO = "Обновляет параметры чата",
   uUnuvNvvNU = oOOOo0.Misc
)
public class ChatHelper extends Module {
   public static final vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Антиспам чат", true);
   public static final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Сохранять чат", true);
   public static final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Улучшенные команды", true);
   public static final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Расширенный просмотр чата ", true);

   public ChatHelper() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, UNnVVNvvnVvU, uNnUnnuNUnNu});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         if (var1.vVvUvVVuuNvV() instanceof class_7472 var2) {
            String var10 = null;
            String var4 = var2.comp_808();
            String var5 = var4.toLowerCase();
            int var6 = var5.indexOf("ah");
            int var7 = var5.indexOf(" me", var6);
            if (var7 != -1 && var6 != -1) {
               String var8 = uUnuvNvvNU.field_1724.method_5477().getString();
               var10 = var4.substring(0, var7) + " " + var8 + var4.substring(var7 + 3);
            }

            if (var5.startsWith("clan")) {
               vnvuUUVun var11 = new vnvuUUVun();
               var11.UuUVuuUu();
               String var9 = var11.nuUnNvnuUu();
               if (var5.endsWith(" all") || var5.contains(" all")) {
                  var10 = var4.replaceAll("(?i)\\ball\\b", var9);
               }
            }

            if (var10 != null) {
               var1.C00OOC00oO();
               uUnuvNvvNU.field_1724.field_3944.method_52787(new class_7472(var10));
            }
         }
      }
   }
}
