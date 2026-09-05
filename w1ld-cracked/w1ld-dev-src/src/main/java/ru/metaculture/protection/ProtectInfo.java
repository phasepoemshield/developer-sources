package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_1044;
import net.minecraft.class_1060;
import net.minecraft.class_10868;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_2960;
import net.minecraft.class_5250;
import net.minecraft.class_5481;
import net.minecraft.class_640;
import net.minecraft.class_8685;
import net.minecraft.class_8685.class_7920;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ProtectInfo",
   C00OOC00oO = "Скрывает ники, домены, бренды и заменяет скорборд",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class ProtectInfo extends Module {
   private static final String VVnVNnunVvu = "Текст";
   private static final String unNNVVNnvvV = "Исходящий чат";
   private static final String NuunnvnN = "Домены/IP";
   private static final String NVUunUNUN = "Скины";
   private static final String UUVNuUNUvUnV = "Рамки";
   private static final String vuvnUnVnUNnV = "Картины";
   private static final String[] nnuUVNUuvvVU = new String[]{
      "Funtime",
      "Spookytime",
      "HolyWorld",
      "LonyGrief",
      "Wellmine",
      "ArtyGrief",
      "Aresmine",
      "Triada",
      "SlimeWorld",
      "VimeMC",
      "ReallyWorld",
      "MineBlaze",
      "DexLand",
      "TeslaCraft",
      "MusteryWorld",
      "Gamely",
      "SunRise",
      "MSTNetwork",
      "ReallyGrief",
      "MineLand",
      "LastCraft",
      "McSkill",
      "Hypixel",
      "Фантайм",
      "Фан тайм",
      "фантайм",
      "Фунтиме",
      "Fun time",
      "Fun-Time",
      "Fun_time",
      "FT",
      "spacetimes",
      "spookytime",
      "GuvsHvh"
   };
   private static final String nVVUuvuNnUN = "t.me/soezproject";
   private static final Pattern nNnVnUNVV = Pattern.compile("(?iu)\\b(" + String.join("|", nnuUVNUuvvVU) + ")\\s*\\.\\s*([a-zа-я]{2,12})\\b");
   private static final Pattern nuunNvv = Pattern.compile(
      "(?iu)(?<![\\w.@-])(?!wildclient\\.org\\b)(?:https?://)?(?:[a-z0-9-]+\\.)+(?:ru|su|fun|net|org|com|me|pw|xyz|pro|gg|top|site|online)\\b(?:/[\\w\\-./?=&%#+~@:]*)?"
   );
   private static final Pattern uUVVvVVNvvn = Pattern.compile("\\b(?:\\d{1,3}\\.){3}\\d{1,3}(?::\\d{2,5})?\\b");
   private static final Pattern[] vvUVNVvvNUv = uNnUnnuNUnNu();
   private static final class_2960 UuNnnVnuNNV = class_2960.method_60655("wild", "textures/png/zov.png");
   private static final class_2960 uUVvnUuNvvN = class_2960.method_60655("wild", "textures/png/obla.png");
   private static final class_2960 UUuUnNVNuuv = class_2960.method_60655("wild", "textures/protect/streamer_skin.png");
   private static class_8685 NVuNUuVnVUN;
   private static final Pattern NVuunNnvvvVu = Pattern.compile("(?i)(?:\\u00A7|\\u0412\\u00A7)[0-9a-fk-or]");
   private static final Pattern vNnNuuvVn = Pattern.compile("(?iu)(?:анарх(?:ия|ии)?|anarchy|an)\\s*(?:[-:#№]|\\s)*\\d{1,5}");
   public final vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Друзья", false);
   public final VUVnvvnNN uVunuUNVVUUV = new VUVnvvnNN(
      "Что скрывать", new vvNnnUNnVvn("Свой ник", true), new vvNnnUNnVvn("Все ники", false), new vvNnnUNnVvn("Анархию", false)
   );
   public final VUVnvvnNN UNnVVNvvnVvU = new VUVnvvnNN(
      "Защита",
      new vvNnnUNnVvn("Текст", true),
      new vvNnnUNnVvn("Исходящий чат", true),
      new vvNnnUNnVvn("Домены/IP", true),
      new vvNnnUNnVvn("Скины", true),
      new vvNnnUNnVvn("Рамки", true),
      new vvNnnUNnVvn("Картины", true)
   );
   public final NVuVVUNUvV uNnUnnuNUnNu = new NVuVVUNUvV("Замена", "Wild");
   public final NVuVVUNUvV NnUuNNU = new NVuVVUNUvV("Кастом ник", "Protect");
   public final NVuVVUNUvV nNvNUVU = new NVuVVUNUvV("Кастом анархия", "Скрыто");
   public final vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Цвет скорборда", true);
   public final UvNnUnuNUUU uUVuVvuNUvnu = new UvNnUnuNUUU("Оттенок", "Голубой", "Голубой", "Тёмно-синий");
   public final vvNnnUNnVvn UvUvUNuvNU = new vvNnnUNnVvn("Рендерить пнг", false);
   public final UvNnUnuNUUU c0oOOCcCoC0 = new UvNnUnuNUUU("Вариация ПНГ ", "Чоткая", "Хмырь", "Чоткая");

   public ProtectInfo() {
      this.NnUuNNU.UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("Свой ник"));
      this.nNvNUVU.UuUVuuUu(() -> !this.uVunuUNVVUUV.C00OOC00oO("Анархию"));
      this.uUVuVvuNUvnu.UuUVuuUu(() -> !this.UnUNuUU.uUnuvNvvNU());
      this.c0oOOCcCoC0.UuUVuuUu(() -> !this.UvUvUNuvNU.uUnuvNvvNU());
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.NVNnnvnuunNv,
            this.uVunuUNVVUUV,
            this.UNnVVNvvnVvU,
            this.uNnUnnuNUnNu,
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            this.c0oOOCcCoC0
         }
      );
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      if (this.UvUvUNuvNU.uUnuvNvvNU() && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         UnVNvNnU var2 = var1.vVvUvVVuuNvV();
         float var3 = 220.0F;
         float var4 = 250.0F;
         float var5 = var1.nuUnNvnuUu();
         float var6 = var1.VVuuUN();
         float var7 = var5 - var3 - 2.0F - 5.0F;
         float var8 = var6 / 2.0F - var4 / 2.0F - 60.0F;
         class_2960 var9 = this.c0oOOCcCoC0.uUnuvNvvNU().equals("Чоткая") ? UuNnnVnuNNV : uUVvnUuNvvN;
         int var10 = UuUVuuUu(var9);
         if (var10 > 0) {
            GlStateManager._bindTexture(var10);
            GlStateManager._texParameter(3553, 10240, 9728);
            GlStateManager._texParameter(3553, 10241, 9728);
            var2.uNNnnnuuuN(1.0F);
            float var11 = var7 + var3 / 2.0F;
            float var12 = var8 + var4 / 2.0F;
            var2.UuUVuuUu(var11, var12);
            var2.C00OOC00oO(1.0F, -1.0F);
            var2.UuUVuuUu(-var11, -var12);
            var2.UuUVuuUu(var10, var7, var8, var3, var4);
            var2.vNUvnnVnUvu();
            var2.uVUuuVnNVU();
            var2.vNUvnnVnUvu();
            var2.vuuuNvNuv();
         }
      }
   }

   public static boolean UuuNnUvUuv() {
      ProtectInfo var0 = NVNnnvnuunNv();
      return var0 != null && var0.nuUnNvnuUu;
   }

   public static String UuUVuuUu(String var0) {
      ProtectInfo var1 = NVNnnvnuunNv();
      if (var1 != null && var1.nuUnNvnuUu) {
         String var2 = C00OOC00oO(var0, var1);
         return !var1.UNnVVNvvnVvU.C00OOC00oO("Текст") ? var2 : UuUVuuUu(var2, var1.UNnVVNvvnVvU.C00OOC00oO("Домены/IP"), uVunuUNVVUUV());
      } else {
         return var0;
      }
   }

   public static String C00OOC00oO(String var0) {
      ProtectInfo var1 = NVNnnvnuunNv();
      if (var1 != null && var1.nuUnNvnuUu && var1.UNnVVNvvnVvU.C00OOC00oO("Исходящий чат")) {
         String var2 = C00OOC00oO(var0, var1);
         return UuUVuuUu(var2, var1.UNnVVNvvnVvU.C00OOC00oO("Домены/IP"), uVunuUNVVUUV());
      } else {
         return var0;
      }
   }

   public static class_5481 UuUVuuUu(class_5481 var0) {
      ProtectInfo var1 = NVNnnvnuunNv();
      if (var0 != null && var1 != null && var1.nuUnNvnuUu && var1.UNnVVNvvnVvU.C00OOC00oO("Текст")) {
         ArrayList var2 = new ArrayList();
         StringBuilder var3 = new StringBuilder();
         var0.accept((var2x, var3x, var4x) -> {
            String var5x = new String(Character.toChars(var4x));
            var2.add(new ProtectInfo.nvnNNunvv(var5x, var3x));
            var3.append(var5x);
            return true;
         });
         String var4 = var3.toString();
         ProtectInfo.NVnVnNnN var5 = UuUVuuUu(var2, var4, var1.UNnVVNvvnVvU.C00OOC00oO("Домены/IP"), uVunuUNVVUUV());
         return !var5.changed ? var0 : var1x -> {
            int var2x = 0;

            for (ProtectInfo.nvnNNunvv var4x : var5.tokens) {
               for (int var5x = 0; var5x < var4x.text.length(); var2x++) {
                  int var6 = var4x.text.codePointAt(var5x);
                  if (!var1x.accept(var2x, var4x.style, var6)) {
                     return false;
                  }

                  var5x += Character.charCount(var6);
               }
            }

            return true;
         };
      } else {
         return var0;
      }
   }

   public static boolean nUUVuvU() {
      ProtectInfo var0 = NVNnnvnuunNv();
      return var0 != null && var0.nuUnNvnuUu && var0.UNnVVNvvnVvU.C00OOC00oO("Скины");
   }

   public static boolean UnUNVVVNuv() {
      ProtectInfo var0 = NVNnnvnuunNv();
      return var0 != null && var0.nuUnNvnuUu && var0.UNnVVNvvnVvU.C00OOC00oO("Рамки");
   }

   public static boolean vNVuvnUUnuUn() {
      ProtectInfo var0 = NVNnnvnuunNv();
      return var0 != null && var0.nuUnNvnuUu && var0.UNnVVNvvnVvU.C00OOC00oO("Картины");
   }

   public static boolean UvnvNVnnnnNU() {
      ProtectInfo var0 = NVNnnvnuunNv();
      return var0 != null && var0.nuUnNvnuUu && var0.UnUNuUU.uUnuvNvvNU();
   }

   public static class_8685 uVUVnuvnuVuv() {
      if (NVuNUuVnVUN == null) {
         NVuNUuVnVUN = new class_8685(UUuUnNVNuuv, null, null, null, class_7920.field_41122, true);
      }

      return NVuNUuVnVUN;
   }

   public static class_2561 UuUVuuUu(class_2561 var0) {
      if (var0 != null && uUnuvNvvNU.field_1724 != null) {
         ProtectInfo var1 = NVNnnvnuunNv();
         if (var1 != null && var1.nuUnNvnuUu) {
            class_5250 var2 = class_2561.method_43473();
            var0.method_27658((var1x, var2x) -> {
               String var3 = UuUVuuUu(var2x);
               var2.method_10852(class_2561.method_43470(var3).method_10862(var1x));
               return Optional.empty();
            }, class_2583.field_24360);
            return var2;
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   public static class_2561 C00OOC00oO(class_2561 var0) {
      class_2561 var1 = UuUVuuUu(var0);
      return !UvnvNVnnnnNU() ? var1 : UuUVuuUu(var1, UNnVVNvvnVvU());
   }

   public static String uUnuvNvvNU(String var0) {
      return UuUVuuUu(var0);
   }

   public static String UuUVuuUu(String var0, ProtectInfo var1) {
      if (var0 != null && !var0.isEmpty()) {
         String var2 = C00OOC00oO(var0, var1);
         if (var1.UNnVVNvvnVvU.C00OOC00oO("Текст")) {
            var2 = UuUVuuUu(var2, var1.UNnVVNvvnVvU.C00OOC00oO("Домены/IP"), UuUVuuUu(var1));
         }

         return var2;
      } else {
         return var0;
      }
   }

   private static ProtectInfo NVNnnvnuunNv() {
      return ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(ProtectInfo.class)
         : null;
   }

   private static String uVunuUNVVUUV() {
      ProtectInfo var0 = NVNnnvnuunNv();
      return UuUVuuUu(var0);
   }

   private static String UuUVuuUu(ProtectInfo var0) {
      if (var0 == null) {
         return "Wild";
      } else {
         String var1 = var0.uNnUnnuNUnNu.uUnuvNvvNU().trim();
         return var1.isEmpty() ? "Wild" : var1;
      }
   }

   private static class_124 UNnVVNvvnVvU() {
      ProtectInfo var0 = NVNnnvnuunNv();
      return var0 != null && "Тёмно-синий".equals(var0.uUVuVvuNUvnu.uUnuvNvvNU()) ? class_124.field_1058 : class_124.field_1075;
   }

   private static String C00OOC00oO(String var0, ProtectInfo var1) {
      if (var0 != null && !var0.isEmpty()) {
         String var2 = var0;
         if (var1.uVunuUNVVUUV.C00OOC00oO("Свой ник")) {
            var2 = uUnuvNvvNU(var0, var1);
         }

         if (var1.uVunuUNVVUUV.C00OOC00oO("Все ники")) {
            var2 = uNNnnnuuuN(var2, var1);
         }

         if (var1.NVNnnvnuunNv.uUnuvNvvNU()) {
            var2 = vVvUvVVuuNvV(var2, var1);
         }

         if (var1.uVunuUNVVUUV.C00OOC00oO("Анархию")) {
            vnvuUUVun.UuUVuuUu.UuUVuuUu(500L);
            var2 = C00OOC00oO(var2, var1.nNvNUVU.uUnuvNvvNU(), vnvuUUVun.UuUVuuUu.uUnuvNvvNU());
         }

         return var2;
      } else {
         return var0;
      }
   }

   private static String uUnuvNvvNU(String var0, ProtectInfo var1) {
      String var2 = C00OOC00oO(var1);
      String var3 = var0;
      if (uUnuvNvvNU != null) {
         if (uUnuvNvvNU.method_1548() != null) {
            var3 = UuUVuuUu(var0, uUnuvNvvNU.method_1548().method_1676(), var2);
         }

         if (uUnuvNvvNU.field_1724 != null) {
            var3 = UuUVuuUu(var3, uUnuvNvvNU.field_1724.method_7334() == null ? null : uUnuvNvvNU.field_1724.method_7334().getName(), var2);
            var3 = UuUVuuUu(var3, uUnuvNvvNU.field_1724.method_5477() == null ? null : uUnuvNvvNU.field_1724.method_5477().getString(), var2);
         }
      }

      return UuUVuuUu(var3, vnvuUUVun.C00OOC00oO, var2);
   }

   private static String vVvUvVVuuNvV(String var0, ProtectInfo var1) {
      String var2 = C00OOC00oO(var1);
      String var3 = var0;
      List var4 = uNvUVUNvuUVV.vVvUvVVuuNvV();
      if (var4 != null && !var4.isEmpty()) {
         for (String var6 : var4) {
            var3 = UuUVuuUu(var3, var6, var2);
         }

         return var3;
      } else {
         return var0;
      }
   }

   private static String uNNnnnuuuN(String var0, ProtectInfo var1) {
      if (uUnuvNvvNU != null && uUnuvNvvNU.method_1562() != null) {
         String var2 = C00OOC00oO(var1);
         String var3 = var0;

         for (class_640 var5 : uUnuvNvvNU.method_1562().method_2880()) {
            if (var5 != null && var5.method_2966() != null) {
               var3 = UuUVuuUu(var3, var5.method_2966().getName(), var2);
            }
         }

         return var3;
      } else {
         return var0;
      }
   }

   private static String C00OOC00oO(ProtectInfo var0) {
      String var1 = var0.NnUuNNU.uUnuvNvvNU();
      return var1 != null && !var1.isBlank() ? var1 : "Protect";
   }

   private static String UuUVuuUu(String var0, String var1, String var2) {
      if (var0 != null && !var0.isEmpty() && var1 != null) {
         String var3 = var2 != null && !var2.isBlank() ? var2 : "Protect";
         String var4 = NVuunNnvvvVu.matcher(var1).replaceAll("").trim();
         if (!var4.isEmpty() && !var4.equalsIgnoreCase("N/A") && !var4.equalsIgnoreCase(var3)) {
            Pattern var5 = Pattern.compile(Pattern.quote(var4), 66);
            Matcher var6 = var5.matcher(var0);
            StringBuilder var7 = new StringBuilder(var0.length());

            while (var6.find()) {
               String var8 = var6.group();
               if (UuUVuuUu(var0, var6.start(), var6.end()) && !UuUVuuUu(var0, var6.start(), var6.end(), var4, var3)) {
                  var6.appendReplacement(var7, Matcher.quoteReplacement(var3));
               } else {
                  var6.appendReplacement(var7, Matcher.quoteReplacement(var8));
               }
            }

            var6.appendTail(var7);
            return var7.toString();
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   private static boolean UuUVuuUu(String var0, int var1, int var2) {
      return (var1 <= 0 || !UuUVuuUu(var0.charAt(var1 - 1))) && (var2 >= var0.length() || !UuUVuuUu(var0.charAt(var2)));
   }

   private static boolean UuUVuuUu(char var0) {
      return Character.isLetterOrDigit(var0) || var0 == '_';
   }

   private static boolean UuUVuuUu(String var0, int var1, int var2, String var3, String var4) {
      if (var4 != null && !var4.isEmpty()) {
         Matcher var5 = Pattern.compile(Pattern.quote(var3), 66).matcher(var4);

         while (var5.find()) {
            String var6 = var4.substring(0, var5.start());
            String var7 = var4.substring(var5.end());
            int var8 = var1 - var6.length();
            int var9 = var2 + var7.length();
            if (var8 >= 0
               && var9 <= var0.length()
               && var0.regionMatches(true, var8, var6, 0, var6.length())
               && var0.regionMatches(true, var2, var7, 0, var7.length())) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static String C00OOC00oO(String var0, String var1, String var2) {
      if (var0 != null && !var0.isEmpty()) {
         String var3 = var1 != null && !var1.isBlank() ? var1 : "Hidden";
         String var4 = vNnNuuvVn.matcher(var0).replaceAll(Matcher.quoteReplacement(var3));
         if (var2 != null && !var2.equals("N/A") && !var2.isBlank()) {
            String var5 = NVuunNnvvvVu.matcher(var4).replaceAll("").trim();
            if (var5.equals(var2) || var5.equals("-" + var2) || var5.equals("#" + var2) || var5.equals("№" + var2)) {
               return var3;
            }

            Pattern var6 = Pattern.compile("(?iu)(?:анарх(?:ия|ии)?|anarchy|an)\\s*(?:[-:#№]|\\s)*" + Pattern.quote(var2));
            var4 = var6.matcher(var4).replaceAll(Matcher.quoteReplacement(var3));
         }

         return var4;
      } else {
         return var0;
      }
   }

   private static class_2561 UuUVuuUu(class_2561 var0, class_124 var1) {
      class_5250 var2 = class_2561.method_43473();
      var0.method_27658((var2x, var3) -> {
         class_2583 var4 = var2x.method_10977(var1);
         var2.method_10852(class_2561.method_43470(var3).method_10862(var4));
         return Optional.empty();
      }, class_2583.field_24360);
      return var2;
   }

   private static String UuUVuuUu(String var0, boolean var1, String var2) {
      if (var0 != null && !var0.isEmpty()) {
         String var3 = var0;
         if (var1) {
            var3 = uNNnnnuuuN(var0);
            var3 = vVvUvVVuuNvV(var3);
            var3 = uUVVvVVNvvn.matcher(var3).replaceAll(Matcher.quoteReplacement("wildclient.org"));
         }

         for (Pattern var7 : vvUVNVvvNUv) {
            var3 = var7.matcher(var3).replaceAll(Matcher.quoteReplacement(var2));
         }

         return var3;
      } else {
         return var0;
      }
   }

   private static ProtectInfo.NVnVnNnN UuUVuuUu(List<ProtectInfo.nvnNNunvv> var0, String var1, boolean var2, String var3) {
      ProtectInfo.NVnVnNnN var4 = new ProtectInfo.NVnVnNnN(var0, var1, false);
      if (var2) {
         var4 = UuUVuuUu(var4, nuunNvv, var0x -> "wildclient.org");
         var4 = UuUVuuUu(var4, nNnVnUNVV, var0x -> "wildclient.org");
         var4 = UuUVuuUu(var4, uUVVvVVNvvn, var0x -> "wildclient.org");
      }

      for (Pattern var8 : vvUVNVvvNUv) {
         var4 = UuUVuuUu(var4, var8, var1x -> var3);
      }

      return var4;
   }

   private static ProtectInfo.NVnVnNnN UuUVuuUu(ProtectInfo.NVnVnNnN var0, Pattern var1, Function<Matcher, String> var2) {
      Matcher var3 = var1.matcher(var0.text);
      if (!var3.find()) {
         return var0;
      } else {
         ArrayList var4 = new ArrayList();
         int var5 = 0;

         do {
            UuUVuuUu(var0.tokens, var4, var5, var3.start());
            var4.add(new ProtectInfo.nvnNNunvv((String)var2.apply(var3), UuUVuuUu(var0.tokens, var3.start())));
            var5 = var3.end();
         } while (var3.find());

         UuUVuuUu(var0.tokens, var4, var5, var0.text.length());
         return new ProtectInfo.NVnVnNnN(var4, UuUVuuUu(var4), true);
      }
   }

   private static void UuUVuuUu(List<ProtectInfo.nvnNNunvv> var0, List<ProtectInfo.nvnNNunvv> var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = 0;

         for (ProtectInfo.nvnNNunvv var6 : var0) {
            int var7 = var4;
            int var8 = var4 + var6.text.length();
            var4 = var8;
            int var9 = Math.max(var2, var7);
            int var10 = Math.min(var3, var8);
            if (var9 < var10) {
               var1.add(new ProtectInfo.nvnNNunvv(var6.text.substring(var9 - var7, var10 - var7), var6.style));
            }
         }
      }
   }

   private static class_2583 UuUVuuUu(List<ProtectInfo.nvnNNunvv> var0, int var1) {
      int var2 = 0;
      class_2583 var3 = class_2583.field_24360;

      for (ProtectInfo.nvnNNunvv var5 : var0) {
         int var6 = var2 + var5.text.length();
         if (var1 < var6) {
            return var5.style;
         }

         var2 = var6;
         var3 = var5.style;
      }

      return var3;
   }

   private static String UuUVuuUu(List<ProtectInfo.nvnNNunvv> var0) {
      StringBuilder var1 = new StringBuilder();

      for (ProtectInfo.nvnNNunvv var3 : var0) {
         var1.append(var3.text);
      }

      return var1.toString();
   }

   private static String vVvUvVVuuNvV(String var0) {
      return nNnVnUNVV.matcher(var0).replaceAll(Matcher.quoteReplacement("wildclient.org"));
   }

   private static String uNNnnnuuuN(String var0) {
      return nuunNvv.matcher(var0).replaceAll(Matcher.quoteReplacement("wildclient.org"));
   }

   private static Pattern[] uNnUnnuNUnNu() {
      Pattern[] var0 = new Pattern[nnuUVNUuvvVU.length];

      for (int var1 = 0; var1 < nnuUVNUuvvVU.length; var1++) {
         var0[var1] = Pattern.compile("(?iu)(?<![\\p{L}\\p{N}])" + nuUnNvnuUu(nnuUVNUuvvVU[var1]) + "(?![\\p{L}\\p{N}])");
      }

      return var0;
   }

   private static String nuUnNvnuUu(String var0) {
      StringBuilder var1 = new StringBuilder();

      for (int var2 = 0; var2 < var0.length(); var2++) {
         if (var2 > 0) {
            var1.append("[\\s._-]*");
         }

         var1.append(Pattern.quote(String.valueOf(var0.charAt(var2))));
      }

      return var1.toString();
   }

   private static int UuUVuuUu(class_2960 var0) {
      if (uUnuvNvvNU == null) {
         return -1;
      } else {
         class_1060 var1 = uUnuvNvvNU.method_1531();
         if (var1 == null) {
            return -1;
         } else {
            class_1044 var2 = var1.method_4619(var0);
            if (var2 == null) {
               return -1;
            } else {
               return var2.method_68004() instanceof class_10868 var4 ? var4.method_68427() : -1;
            }
         }
      }
   }

   record NVnVnNnN(List<ProtectInfo.nvnNNunvv> tokens, String text, boolean changed) {
   }

   record nvnNNunvv(String text, class_2583 style) {
   }
}
