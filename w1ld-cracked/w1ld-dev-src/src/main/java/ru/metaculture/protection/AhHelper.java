package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_465;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AhHelper",
   C00OOC00oO = "Помощник на аукционе",
   uUnuvNvvNU = oOOOo0.Misc
)
public class AhHelper extends Module {
   public static uVNuNUVvn NVNnnvnuunNv = new uVNuNUVvn("Поиск предмета в руке", -1);
   public static vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Показ самых дешевых предметов", true);
   public static vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Показывать по ценам", true);
   public static final List<Integer> uNnUnnuNUnNu = new ArrayList<>();
   private static AhHelper NnUuNNU;
   private static String nNvNUVU = "";
   private static long UnUNuUU;
   private static boolean uUVuVvuNUvnu;
   private static boolean UvUvUNuvNU;
   private static boolean c0oOOCcCoC0;
   private static long VVnVNnunVvu;
   private final unnunUVvU unNNVVNnvvV = new unnunUVvU();

   public AhHelper() {
      NnUuNNU = this;
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, UNnVVNvvnVvU});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      uVUVnuvnuVuv();
      if (uUnuvNvvNU.field_1724 != null && uVunuUNVVUUV.uUnuvNvvNU()) {
         if (uUnuvNvvNU.field_1755 instanceof class_465 var2) {
            if (UuUVuuUu(var2)) {
               this.uUnuvNvvNU(var2);
            } else {
               uNnUnnuNUnNu.clear();
            }
         } else {
            uNnUnnuNUnNu.clear();
         }
      } else {
         uNnUnnuNUnNu.clear();
      }
   }

   public static boolean UuUVuuUu(class_465<?> var0) {
      if (var0 == null) {
         return false;
      } else {
         String var1 = uUnuvNvvNU(var0.method_25440().getString());
         return C00OOC00oO(var1);
      }
   }

   public static boolean C00OOC00oO(class_465<?> var0) {
      if (var0 == null) {
         return false;
      } else {
         String var1 = uUnuvNvvNU(var0.method_25440().getString());
         return var1.contains("поиск:")
            || var1.contains("search:")
            || var1.contains("п:")
            || var1.contains("漢:")
            || var1.contains("\ud83d\udd0e")
            || var1.contains("\ud83d\udd0d");
      }
   }

   private static boolean C00OOC00oO(String var0) {
      return var0.contains("аукцион")
         || var0.contains("auction")
         || var0.contains("поиск:")
         || var0.contains("search:")
         || var0.contains("п:")
         || var0.contains("漢:")
         || var0.contains("\ud83d\udd0e:")
         || var0.contains("\ud83d\udd0d:");
   }

   private static String uUnuvNvvNU(String var0) {
      return var0 == null ? "" : var0.replaceAll("(?i)§.", "").replace(' ', ' ').replace('：', ':').replaceAll("\\s*:\\s*", ":").trim().toLowerCase(Locale.ROOT);
   }

   private void uUnuvNvvNU(class_465<?> var1) {
      uNnUnnuNUnNu.clear();
      int[] var2 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
      int[] var3 = new int[]{-1, -1, -1, -1};

      for (class_1735 var5 : var1.method_17577().field_7761) {
         if (!UuUVuuUu(var1, var5)) {
            int var6 = UNuvuNVuUnVu.C00OOC00oO(var5);
            if (var6 > 0) {
               for (int var7 = 0; var7 < 4; var7++) {
                  if (var6 < var2[var7]) {
                     for (int var8 = 3; var8 > var7; var8--) {
                        var2[var8] = var2[var8 - 1];
                        var3[var8] = var3[var8 - 1];
                     }

                     var2[var7] = var6;
                     var3[var7] = var5.field_7874;
                     break;
                  }
               }
            }
         }
      }

      for (int var9 = 0; var9 < 4; var9++) {
         if (var3[var9] != -1) {
            uNnUnnuNUnNu.add(var3[var9]);
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (this.unNNVVNnvvV.vVvUvVVuuNvV(300L) && var1.vVvUvVVuuNvV() == NVNnnvnuunNv.uUnuvNvvNU()) {
         this.UvnvNVnnnnNU();
         this.unNNVVNnvvV.UuUVuuUu();
      }
   }

   private void UvnvNVnnnnNU() {
      if (uUnuvNvvNU.field_1724 != null) {
         class_1799 var1 = uUnuvNvvNU.field_1724.method_6047();
         if (!var1.method_7960()) {
            String var2 = this.vVvUvVVuuNvV(var1.method_7964().getString());
            String var3 = this.UuUVuuUu(var2);
            if (!var3.equals(var2)) {
               uUnuvNvvNU.field_1724.field_3944.method_45730("ah search " + var3);
            } else {
               if (var2.isEmpty()) {
                  var2 = var1.method_7909().method_63680().getString();
               }

               if (!var2.isEmpty()) {
                  uUnuvNvvNU.field_1724.field_3944.method_45730("ah search " + var2);
               }
            }
         }
      }
   }

   private String vVvUvVVuuNvV(String var1) {
      return var1 == null
         ? ""
         : var1.replaceAll("(?i)§.", "")
            .replaceAll("123", "")
            .replaceAll("(?i)&.", "")
            .replaceAll("\\[[^\\]]*]", " ")
            .replaceAll("[★✦✧✪✫✬✭✮✯✰❄☃⚒☠❤❣♕♛♜♞♟]", " ")
            .replace("xxx", " ")
            .replaceAll("\\s+", " ")
            .trim();
   }

   public String UuUVuuUu(String var1) {
      if (var1 == null) {
         return "";
      } else if (var1.contains("Рассадник монстров")) {
         return "Спавнер";
      } else if (var1.contains("TIER WHITE")) {
         return "вайт";
      } else if (var1.contains("TIER BLACK")) {
         return "блэк";
      } else {
         return var1.contains("Прогрузчик чанков [1x1]") ? "Прогрузчик чанков" : var1;
      }
   }

   public static void UuUVuuUu(String var0, long var1) {
      nNvNUVU = uNNnnnuuuN(var0);
      UnUNuUU = var1;
      uUVuVvuNUvnu = !nNvNUVU.isEmpty() && var1 > 0L;
      UvUvUNuvNU = true;
      c0oOOCcCoC0 = false;
      VVnVNnunVvu = System.currentTimeMillis();
   }

   public static void UuUVuuUu(long var0) {
      nNvNUVU = "";
      UnUNuUU = var0;
      uUVuVvuNUvnu = var0 > 0L;
      UvUvUNuvNU = false;
      c0oOOCcCoC0 = false;
      VVnVNnunVvu = System.currentTimeMillis();
   }

   public static void UuuNnUvUuv() {
      nNvNUVU = "";
      UnUNuUU = 0L;
      uUVuVvuNUvnu = false;
      UvUvUNuvNU = false;
      c0oOOCcCoC0 = false;
      VVnVNnunVvu = 0L;
      uNnUnnuNUnNu.clear();
   }

   public static boolean nUUVuvU() {
      return uUVuVvuNUvnu;
   }

   public static String UnUNVVVNuv() {
      return nNvNUVU;
   }

   public static long vNVuvnUUnuUn() {
      return UnUNuUU;
   }

   public static boolean UuUVuuUu(class_465<?> var0, class_1735 var1) {
      if (NnUuNNU == null || !NnUuNNU.nuUnNvnuUu || !UNnVVNvvnVvU.uUnuvNvvNU() || !uUVuVvuNUvnu) {
         return false;
      } else if (var0 != null && var1 != null && var1.method_7681() && vVvUvVVuuNvV(var0)) {
         if (uUnuvNvvNU.field_1724 != null && var1.field_7871 == uUnuvNvvNU.field_1724.method_31548()) {
            return false;
         } else {
            int var2 = UNuvuNVuUnVu.C00OOC00oO(var1);
            return var2 <= 0 ? false : var2 > UnUNuUU;
         }
      } else {
         return false;
      }
   }

   private static void uVUVnuvnuVuv() {
      if (uUVuVvuNUvnu) {
         if (uUnuvNvvNU.field_1755 instanceof class_465 var0) {
            if (vVvUvVVuuNvV(var0)) {
               c0oOOCcCoC0 = true;
            } else {
               if (c0oOOCcCoC0 || System.currentTimeMillis() - VVnVNnunVvu > 5000L) {
                  UuuNnUvUuv();
               }
            }
         } else {
            if (c0oOOCcCoC0 || System.currentTimeMillis() - VVnVNnunVvu > 5000L) {
               UuuNnUvUuv();
            }
         }
      }
   }

   private static boolean vVvUvVVuuNvV(class_465<?> var0) {
      return UvUvUNuvNU ? C00OOC00oO(var0) : UuUVuuUu(var0);
   }

   private static String uNNnnnuuuN(String var0) {
      return var0 == null
         ? ""
         : var0.replaceAll("(?i)§.", "")
            .replaceAll("(?i)&.", "")
            .replace(' ', ' ')
            .replace('_', ' ')
            .replace('-', ' ')
            .replaceAll("(?i)\\bminecraft:", "")
            .replaceAll("[^\\p{L}\\p{N}: ]", " ")
            .replaceAll("\\s+", " ")
            .trim()
            .toLowerCase(Locale.ROOT);
   }
}
