package ru.metaculture.protection;

import java.util.Locale;
import net.minecraft.class_634;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public final class nVuVnuNVNv extends UNUuvUN {
   public nVuVnuNVNv() {
      super("ah", "Открыть общую страницу аукциона с фильтром цены", ".ah [максимальная цена]");
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (a_.field_1724 == null || a_.field_1724.field_3944 == null) {
         vVnvuVVUunuv.UuUVuuUu("§c[AhHelper] Игрок не подключен к серверу.");
      } else if (var1.length == 0) {
         AhHelper.UuuNnUvUuv();
         class_634 var6 = a_.field_1724.field_3944;
         if (var6 != null) {
            var6.method_45730("ah");
         }
      } else {
         Long var2 = this.uUnuvNvvNU(var1);
         if (var2 != null && var2 > 0L) {
            if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
               uVvnVvvUVUv var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO;
               if (var3 != null) {
                  AhHelper var4 = var3.UuUVuuUu(AhHelper.class);
                  if (var4 != null && !var4.nuUnNvnuUu) {
                     var4.UuUVuuUu(true);
                  }
               }
            }

            AhHelper.UuUVuuUu(var2);
            class_634 var7 = a_.field_1724.field_3944;
            if (var7 != null) {
               var7.method_45730("ah");
            }

            vvNnnUNnVvn var8 = AhHelper.UNnVVNvvnVvU;
            String var5 = var8 != null && var8.uUnuvNvvNU() ? "§aвключен" : "§eзадан, чекбокс выключен";
            vVnvuVVUunuv.UuUVuuUu("§7[AhHelper] Общий фильтр " + var5 + "§7: до §f" + this.UuUVuuUu(var2) + "$");
         } else {
            vVnvuVVUunuv.UuUVuuUu("§cИспользование: " + this.UuUVuuUu());
            vVnvuVVUunuv.UuUVuuUu("§7Пример: §f.ah 100 000");
         }
      }
   }

   private Long uUnuvNvvNU(String[] var1) {
      StringBuilder var2 = new StringBuilder();

      for (String var6 : var1) {
         if (var6 == null || !var6.matches("[0-9][0-9_.,]*")) {
            return null;
         }

         var2.append(var6.replaceAll("[^0-9]", ""));
      }

      if (var2.isEmpty()) {
         return null;
      } else {
         try {
            return Long.parseLong(var2.toString());
         } catch (NumberFormatException var7) {
            return null;
         }
      }
   }

   private String UuUVuuUu(long var1) {
      return String.format(Locale.ROOT, "%,d", var1).replace(',', ' ');
   }

   static {
      Loader.initialize();
   }
}
