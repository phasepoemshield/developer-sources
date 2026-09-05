package ru.metaculture.protection;

import com.mojang.authlib.properties.Property;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_1320;
import net.minecraft.class_1322;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_465;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.minecraft.class_9285;
import net.minecraft.class_9290;
import net.minecraft.class_9296;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import net.minecraft.class_9285.class_9287;
import org.wild.mixin.acceser.HandledScreenAccessor;

public final class vUvVuNvvvuN {
   private vUvVuNvvvuN() {
   }

   public static String UuUVuuUu(class_1799 var0) {
      if (var0 != null && !var0.method_7960()) {
         List var1 = uUnuvNvvNU(var0);
         List var2 = vVvUvVVuuNvV(var0);
         List var3 = uNNnnnuuuN(var0);
         String var4 = nuUnNvnuUu(var0);
         StringBuilder var5 = new StringBuilder();
         var5.append("builder(\"")
            .append(uUnuvNvvNU(UuUVuuUu(var0.method_7964().getString(), C00OOC00oO(var0.method_7909()))))
            .append("\", ")
            .append(UuUVuuUu(var0.method_7909()))
            .append(")");
         if (!var2.isEmpty()) {
            var5.append("\n        .enchantments(").append(UuUVuuUu(var2)).append(")");
         }

         if (!var3.isEmpty()) {
            var5.append("\n        .attributes(").append(String.join(", ", var3)).append(")");
         }

         if (!var1.isEmpty()) {
            var5.append("\n        .lore(").append(UuUVuuUu(var1)).append(")");
         }

         if (!var4.isBlank()) {
            var5.append("\n        .texture(\"").append(uUnuvNvvNU(var4)).append("\")");
         }

         var5.append("\n        .build(),");
         return var5.toString();
      } else {
         return "";
      }
   }

   public static String C00OOC00oO(class_1799 var0) {
      String var1 = UuUVuuUu(var0);
      if (var1.isBlank()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(var1);
         var2.append("\n\ncomponents=").append(var0.method_57353());
         return var2.toString();
      }
   }

   public static boolean UuUVuuUu(class_310 var0) {
      if (var0 != null && var0.field_1755 instanceof class_465 var1) {
         class_1735 var5 = UuUVuuUu(var0, var1);
         if (var5 != null && var5.method_7681() && !var5.method_7677().method_7960()) {
            class_1799 var3 = var5.method_7677();
            String var4 = UuUVuuUu(var3);
            if (var4.isBlank()) {
               vVnvuVVUunuv.UuUVuuUu("§c[AutoBuy] §fНе удалось собрать код предмета.");
               return true;
            } else {
               var0.field_1774.method_1455(var4);
               UuUVuuUu(var3, var4);
               vVnvuVVUunuv.UuUVuuUu("§a[AutoBuy] §fКод предмета скопирован в буфер и записан в configs/autobuy/dumps.");
               return true;
            }
         } else {
            vVnvuVVUunuv.UuUVuuUu("§c[AutoBuy] §fПод курсором нет предмета.");
            return true;
         }
      } else {
         return false;
      }
   }

   private static class_1735 UuUVuuUu(class_310 var0, class_465<?> var1) {
      HandledScreenAccessor var2 = (HandledScreenAccessor)var1;
      class_1735 var3 = var2.litka$getFocusedSlot();
      if (var3 != null) {
         return var3;
      } else if (var0.method_22683() == null) {
         return null;
      } else {
         double var4 = var0.field_1729.method_68879(var0.method_22683());
         double var6 = var0.field_1729.method_68883(var0.method_22683());
         return var2.getSlotAtPosition(var4, var6);
      }
   }

   private static void UuUVuuUu(class_1799 var0, String var1) {
      try {
         File var2 = NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nuUnNvnuUu != null ? NVnVnNnN.UuUVuuUu.nuUnNvnuUu : new File(".");
         File var3 = new File(var2, "configs/autobuy/dumps");
         if (!var3.exists()) {
            var3.mkdirs();
         }

         File var4 = new File(var3, "DonatItemsHW-snippets.txt");

         try (FileWriter var5 = new FileWriter(var4, true)) {
            var5.write("\n\n");
            var5.write(var1);
            var5.write("\n");
         }
      } catch (Exception var10) {
         vVnvuVVUunuv.UuUVuuUu("§e[AutoBuy] §fКод скопирован, но файл дампа не записался: " + var10.getClass().getSimpleName());
      }
   }

   private static List<String> uUnuvNvvNU(class_1799 var0) {
      ArrayList var1 = new ArrayList();
      class_9290 var2 = (class_9290)var0.method_58694(class_9334.field_49632);
      if (var2 == null) {
         return var1;
      } else {
         for (class_2561 var4 : var2.comp_2400()) {
            String var5 = C00OOC00oO(var4.getString()).trim();
            if (!var5.isBlank() && !UuUVuuUu(var5)) {
               var1.add(var5);
            }
         }

         return var1;
      }
   }

   private static List<String> vVvUvVVuuNvV(class_1799 var0) {
      ArrayList var1 = new ArrayList();
      class_9304 var2 = (class_9304)var0.method_58694(class_9334.field_49633);
      if (var2 != null && !var2.method_57543()) {
         for (Entry var4 : var2.method_57539()) {
            String var5 = ((class_6880)var4.getKey()).method_40230().map(var0x -> var0x.method_29177().toString()).orElse("");
            if (!var5.isBlank()) {
               var1.add(var5 + ":" + var4.getIntValue());
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   private static List<String> uNNnnnuuuN(class_1799 var0) {
      ArrayList var1 = new ArrayList();
      class_9285 var2 = (class_9285)var0.method_58694(class_9334.field_49636);
      if (var2 == null) {
         return var1;
      } else {
         for (class_9287 var4 : var2.comp_2393()) {
            class_1322 var5 = var4.comp_2396();
            String var6 = UuUVuuUu(var4.comp_2395());
            if (!var6.isBlank()) {
               var1.add("attr(\"" + uUnuvNvvNU(var6) + "\", " + UuUVuuUu(var5.comp_2449()) + ")");
            }
         }

         return var1;
      }
   }

   private static String nuUnNvnuUu(class_1799 var0) {
      class_9296 var1 = (class_9296)var0.method_58694(class_9334.field_49617);
      if (var1 != null && var1.comp_2413() != null) {
         Collection var2 = var1.comp_2413().getProperties().get("textures");
         if (var2 != null && !var2.isEmpty()) {
            Property var3 = (Property)var2.iterator().next();
            return var3 != null && var3.value() != null ? var3.value() : "";
         } else {
            return "";
         }
      } else {
         return "";
      }
   }

   private static String UuUVuuUu(class_6880<class_1320> var0) {
      return var0.method_40230().map(var0x -> var0x.method_29177().toString()).orElse("");
   }

   private static String UuUVuuUu(class_1792 var0) {
      class_2960 var1 = class_7923.field_41178.method_10221(var0);
      return !"minecraft".equals(var1.method_12836())
         ? "Registries.ITEM.get(Identifier.of(\"" + uUnuvNvvNU(var1.toString()) + "\"))"
         : "Items." + var1.method_12832().toUpperCase(Locale.ROOT);
   }

   private static String C00OOC00oO(class_1792 var0) {
      class_2960 var1 = class_7923.field_41178.method_10221(var0);
      return var1.method_12832().replace('_', ' ');
   }

   private static String UuUVuuUu(String var0, String var1) {
      String var2 = C00OOC00oO(var0).trim();
      return var2.isBlank() ? var1 : var2;
   }

   private static boolean UuUVuuUu(String var0) {
      String var1 = C00OOC00oO(var0).toLowerCase(Locale.ROOT);
      return var1.contains("цена")
         || var1.contains("продавец")
         || var1.contains("купить")
         || var1.contains("нажмите")
         || var1.contains("лкм")
         || var1.contains("пкм")
         || var1.contains("shift")
         || var1.contains("страница")
         || var1.contains("истекает")
         || var1.contains("доступно")
         || var1.contains("аукцион");
   }

   private static String C00OOC00oO(String var0) {
      return var0 == null ? "" : var0.replaceAll("(?i)§[0-9A-FK-OR]", "");
   }

   private static String UuUVuuUu(List<String> var0) {
      ArrayList var1 = new ArrayList();

      for (String var3 : var0) {
         var1.add("\"" + uUnuvNvvNU(var3) + "\"");
      }

      return String.join(", ", var1);
   }

   private static String UuUVuuUu(double var0) {
      BigDecimal var2 = BigDecimal.valueOf(var0).stripTrailingZeros();
      String var3 = var2.toPlainString();
      return var3.contains(".") ? var3 : var3 + ".0";
   }

   private static String uUnuvNvvNU(String var0) {
      return var0.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r");
   }
}
