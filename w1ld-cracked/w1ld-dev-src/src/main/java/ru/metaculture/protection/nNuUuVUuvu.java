package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_634;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public final class nNuUuVUuvu extends UNUuvUN {
   public nNuUuVUuvu() {
      super("ahsearch", "Поиск лотов по названию и максимальной цене", ".ahsearch <название> <максимальная цена>");
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      ArrayList var2 = new ArrayList();

      for (String var6 : var1) {
         if (var6 != null && !var6.isBlank()) {
            var2.add(var6.trim());
         }
      }

      if (var2.size() == 1 && this.UuUVuuUu((String)var2.getFirst())) {
         AhHelper.UuuNnUvUuv();
         vVnvuVVUunuv.UuUVuuUu("§7[AhHelper] Фильтр поиска очищен.");
      } else {
         int var8 = this.UuUVuuUu(var2);
         if (var8 <= 0) {
            this.vVvUvVVuuNvV();
         } else {
            Long var9 = this.C00OOC00oO(var2.subList(var8, var2.size()));
            if (var9 != null && var9 > 0L) {
               String var10 = String.join(" ", var2.subList(0, var8)).trim();
               if (var10.isEmpty()) {
                  this.vVvUvVVuuNvV();
               } else {
                  AhHelper var11 = null;
                  if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
                     uVvnVvvUVUv var7 = NVnVnNnN.UuUVuuUu.C00OOC00oO;
                     if (var7 != null) {
                        var11 = var7.UuUVuuUu(AhHelper.class);
                     }
                  }

                  if (var11 != null && !var11.nuUnNvnuUu) {
                     var11.UuUVuuUu(true);
                  }

                  AhHelper.UuUVuuUu(var10, var9);
                  if (a_.field_1724 != null && a_.field_1724.field_3944 != null) {
                     class_634 var12 = a_.field_1724.field_3944;
                     if (var12 != null) {
                        var12.method_45730("ah search " + var10);
                     }
                  }

                  vvNnnUNnVvn var13 = AhHelper.UNnVVNvvnVvU;
                  vVnvuVVUunuv.UuUVuuUu(
                     "§7[AhHelper] Фильтр "
                        + (var13 != null && var13.uUnuvNvvNU() ? "§aвключен" : "§eзадан, чекбокс выключен")
                        + "§7: §f"
                        + var10
                        + " §7до §f"
                        + this.UuUVuuUu(var9)
                        + "$"
                  );
               }
            } else {
               vVnvuVVUunuv.UuUVuuUu("§c[AhHelper] Максимальная цена должна быть положительным числом.");
            }
         }
      }
   }

   @Override
   public List<String> UuUVuuUu(String[] var1) {
      String var2 = var1.length == 0 ? "" : var1[var1.length - 1].toLowerCase(Locale.ROOT);
      return List.of("clear").stream().filter(var1x -> var1x.startsWith(var2)).toList();
   }

   private int UuUVuuUu(List<String> var1) {
      if (var1.size() >= 2 && this.UuUVuuUu((String)var1.getLast())) {
         int var2 = var1.size() - 1;

         while (var2 > 1 && this.C00OOC00oO((String)var1.get(var2)) == 3 && this.UuUVuuUu((String)var1.get(var2 - 1))) {
            var2--;
         }

         return var2;
      } else {
         return -1;
      }
   }

   private Long C00OOC00oO(List<String> var1) {
      StringBuilder var2 = new StringBuilder();

      for (String var4 : var1) {
         var2.append(var4.replaceAll("[^0-9]", ""));
      }

      if (var2.isEmpty()) {
         return null;
      } else {
         try {
            return Long.parseLong(var2.toString());
         } catch (NumberFormatException var5) {
            return null;
         }
      }
   }

   private boolean UuUVuuUu(String var1) {
      return var1 != null && var1.matches("[0-9][0-9_.,]*");
   }

   private int C00OOC00oO(String var1) {
      return var1.replaceAll("[^0-9]", "").length();
   }

   private boolean uUnuvNvvNU(String var1) {
      return var1.equalsIgnoreCase("clear") || var1.equalsIgnoreCase("off") || var1.equalsIgnoreCase("reset");
   }

   private String UuUVuuUu(long var1) {
      return String.format(Locale.ROOT, "%,d", var1).replace(',', ' ');
   }

   private void vVvUvVVuuNvV() {
      vVnvuVVUunuv.UuUVuuUu("§cИспользование: " + this.uUnuvNvvNU());
      vVnvuVVUunuv.UuUVuuUu("§7Пример: §f.ahsearch зачарованное золотое яблоко 100 000");
      vVnvuVVUunuv.UuUVuuUu("§7Сброс: §f.ahsearch clear");
   }

   static {
      Loader.initialize();
   }
}
