package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.client.util.SkinTextures.Model;
import net.minecraft.text.MutableText;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ProtectInfo",
   O000000000 = "Скрывает ники, домены, бренды и заменяет скорборд",
   O0000000000 = Category.Visuals
)
public class ProtectInfo extends Module {
   private static final String O000000000OO00 = "Текст";
   private static final String O000000000OO0O = "Исходящий чат";
   private static final String O000000000OOO = "Домены/IP";
   private static final String O000000000OOO0 = "Скины";
   private static final String O000000000OOOO = "Рамки";
   private static final String O00000000O = "Картины";
   private static final String[] O00000000O0 = new String[]{
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
   private static final Pattern O00000000O00 = Pattern.compile("(?iu)\\b(" + String.join("|", O00000000O0) + ")\\s*\\.\\s*([a-zа-я]{2,12})\\b");
   private static final Pattern O00000000O000 = Pattern.compile(
      "(?iu)\\b(?!wild\\.)[a-z0-9-]{2,}(?:\\.[a-z0-9-]{2,})*\\.(ru|su|fun|net|org|com|me|pw|xyz|pro|gg|top|site|online)\\b"
   );
   private static final Pattern O00000000O0000 = Pattern.compile("\\b(?:\\d{1,3}\\.){3}\\d{1,3}(?::\\d{2,5})?\\b");
   private static final Pattern[] O00000000O000O = O000000000O000();
   private static final Identifier O00000000O00O = Identifier.of("wild", "textures/png/zov.png");
   private static final Identifier O00000000O00O0 = Identifier.of("wild", "textures/png/obla.png");
   private static final Identifier O00000000O00OO = Identifier.of("wild", "textures/protect/streamer_skin.png");
   private static SkinTextures O00000000O0O;
   private static final Pattern O00000000O0O0 = Pattern.compile("(?i)(?:\\u00A7|\\u0412\\u00A7)[0-9a-fk-or]");
   private static final Pattern O00000000O0O00 = Pattern.compile("(?iu)(?:анарх(?:ия|ии)?|anarchy|an)\\s*(?:[-:#№]|\\s)*\\d{1,5}");
   public final BooleanSetting O000000000O = new BooleanSetting("Друзья", false);
   public final GroupSetting O000000000O0 = new GroupSetting("Что скрывать", new BooleanSetting("Свой ник", true), new BooleanSetting("Анархию", false));
   public final GroupSetting O000000000O00 = new GroupSetting(
      "Защита",
      new BooleanSetting("Текст", true),
      new BooleanSetting("Исходящий чат", true),
      new BooleanSetting("Домены/IP", true),
      new BooleanSetting("Скины", true),
      new BooleanSetting("Рамки", true),
      new BooleanSetting("Картины", true)
   );
   public final TextSetting O000000000O000 = new TextSetting("Замена", "Wild");
   public final TextSetting O000000000O00O = new TextSetting("Кастом ник", "Protect");
   public final TextSetting O000000000O0O = new TextSetting("Кастом анархия", "Скрыто");
   public final BooleanSetting O000000000O0O0 = new BooleanSetting("Цвет скорборда", true);
   public final ModeSetting O000000000O0OO = new ModeSetting("Оттенок", "Голубой", "Голубой", "Тёмно-синий");
   public final BooleanSetting O000000000OO = new BooleanSetting("Рендерить пнг", false);
   public final ModeSetting O000000000OO0 = new ModeSetting("Вариация ПНГ ", "Чоткая", "Хмырь", "Чоткая");

   public ProtectInfo() {
      this.O000000000O00O.O00000000(() -> !this.O000000000O0.O000000000("Свой ник"));
      this.O000000000O0O.O00000000(() -> !this.O000000000O0.O000000000("Анархию"));
      this.O000000000O0OO.O00000000(() -> !this.O000000000O0O0.O0000000000());
      this.O000000000OO0.O00000000(() -> !this.O000000000OO.O0000000000());
      this.O00000000(
         new Setting[]{
            this.O000000000O,
            this.O000000000O0,
            this.O000000000O00,
            this.O000000000O000,
            this.O000000000O00O,
            this.O000000000O0O,
            this.O000000000O0O0,
            this.O000000000O0OO,
            this.O000000000OO,
            this.O000000000OO0
         }
      );
   }

   @EventHandler
   public void O00000000(O0000000O00O o0000000O00O) {
      if (this.O000000000OO.O0000000000() && O0000000000.world != null && O0000000000.player != null) {
         RenderManager var2 = o0000000O00O.O00000000000();
         float var3 = 220.0F;
         float var4 = 250.0F;
         float var5 = o0000000O00O.O0000000000000();
         float var6 = o0000000O00O.O000000000000O();
         float var7 = var5 - var3 - 2.0F - 5.0F;
         float var8 = var6 / 2.0F - var4 / 2.0F - 60.0F;
         Identifier var9 = this.O000000000OO0.O0000000000().equals("Чоткая") ? O00000000O00O : O00000000O00O0;
         int var10 = O00000000(var9);
         if (var10 > 0) {
            GlStateManager._bindTexture(var10);
            GlStateManager._texParameter(3553, 10240, 9728);
            GlStateManager._texParameter(3553, 10241, 9728);
            var2.O000000000000(1.0F);
            float var11 = var7 + var3 / 2.0F;
            float var12 = var8 + var4 / 2.0F;
            var2.O00000000(var11, var12);
            var2.O000000000(1.0F, -1.0F);
            var2.O00000000(-var11, -var12);
            var2.O00000000(var10, var7, var8, var3, var4);
            var2.O00000000000O();
            var2.O00000000000O0();
            var2.O00000000000O();
            var2.O00000000000OO();
         }
      }
   }

   public static boolean O0000000000O0() {
      ProtectInfo var0 = O000000000O();
      return var0 != null && var0.O0000000000000;
   }

   public static String O00000000(String string) {
      ProtectInfo var1 = O000000000O();
      if (var1 != null && var1.O0000000000000) {
         String var2 = O000000000(string, var1);
         return !var1.O000000000O00.O000000000("Текст") ? var2 : O00000000(var2, var1.O000000000O00.O000000000("Домены/IP"), O000000000O0());
      } else {
         return string;
      }
   }

   public static String O000000000(String string) {
      ProtectInfo var1 = O000000000O();
      if (var1 != null && var1.O0000000000000 && var1.O000000000O00.O000000000("Исходящий чат")) {
         String var2 = O000000000(string, var1);
         return O00000000(var2, var1.O000000000O00.O000000000("Домены/IP"), O000000000O0());
      } else {
         return string;
      }
   }

   public static OrderedText O00000000(OrderedText orderedText) {
      ProtectInfo var1 = O000000000O();
      if (orderedText != null && var1 != null && var1.O0000000000000 && var1.O000000000O00.O000000000("Текст")) {
         ArrayList var2 = new ArrayList();
         StringBuilder var3 = new StringBuilder();
         orderedText.accept((i, style, j) -> {
            String var5x = new String(Character.toChars(j));
            var2.add(new ProtectInfo.W187(var5x, style));
            var3.append(var5x);
            return true;
         });
         String var4 = var3.toString();
         ProtectInfo.W186 var5 = O00000000(var2, var4, var1.O000000000O00.O000000000("Домены/IP"), O000000000O0());
         return !var5.changed ? orderedText : characterVisitor -> {
            int var2x = 0;

            for (ProtectInfo.W187 var4x : var5.tokens) {
               for (int var5x = 0; var5x < var4x.text.length(); var2x++) {
                  int var6 = var4x.text.codePointAt(var5x);
                  if (!characterVisitor.accept(var2x, var4x.style, var6)) {
                     return false;
                  }

                  var5x += Character.charCount(var6);
               }
            }

            return true;
         };
      } else {
         return orderedText;
      }
   }

   public static boolean O0000000000O00() {
      ProtectInfo var0 = O000000000O();
      return var0 != null && var0.O0000000000000 && var0.O000000000O00.O000000000("Скины");
   }

   public static boolean O0000000000O0O() {
      ProtectInfo var0 = O000000000O();
      return var0 != null && var0.O0000000000000 && var0.O000000000O00.O000000000("Рамки");
   }

   public static boolean O0000000000OO() {
      ProtectInfo var0 = O000000000O();
      return var0 != null && var0.O0000000000000 && var0.O000000000O00.O000000000("Картины");
   }

   public static boolean O0000000000OO0() {
      ProtectInfo var0 = O000000000O();
      return var0 != null && var0.O0000000000000 && var0.O000000000O0O0.O0000000000();
   }

   public static SkinTextures O0000000000OOO() {
      if (O00000000O0O == null) {
         O00000000O0O = new SkinTextures(O00000000O00OO, null, null, null, Model.SLIM, true);
      }

      return O00000000O0O;
   }

   public static Text O00000000(Text text) {
      if (text != null && O0000000000.player != null) {
         ProtectInfo var1 = O000000000O();
         if (var1 != null && var1.O0000000000000) {
            MutableText var2 = Text.empty();
            text.visit((style, string) -> {
               String var3 = O00000000(string);
               var2.append(Text.literal(var3).setStyle(style));
               return Optional.empty();
            }, Style.EMPTY);
            return var2;
         } else {
            return text;
         }
      } else {
         return text;
      }
   }

   public static Text O000000000(Text text) {
      Text var1 = O00000000(text);
      return !O0000000000OO0() ? var1 : O00000000(var1, O000000000O00());
   }

   public static String O0000000000(String string) {
      return O00000000(string);
   }

   public static String O00000000(String string, ProtectInfo o00000O0O0O00O) {
      if (string != null && !string.isEmpty()) {
         String var2 = O000000000(string, o00000O0O0O00O);
         if (o00000O0O0O00O.O000000000O00.O000000000("Текст")) {
            var2 = O00000000(var2, o00000O0O0O00O.O000000000O00.O000000000("Домены/IP"), O00000000(o00000O0O0O00O));
         }

         return var2;
      } else {
         return string;
      }
   }

   private static ProtectInfo O000000000O() {
      return WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null ? WildClient.O00000000.O000000000.O00000000(ProtectInfo.class) : null;
   }

   private static String O000000000O0() {
      ProtectInfo var0 = O000000000O();
      return O00000000(var0);
   }

   private static String O00000000(ProtectInfo o00000O0O0O00O) {
      if (o00000O0O0O00O == null) {
         return "Wild";
      } else {
         String var1 = o00000O0O0O00O.O000000000O000.O0000000000().trim();
         return var1.isEmpty() ? "Wild" : var1;
      }
   }

   private static Formatting O000000000O00() {
      ProtectInfo var0 = O000000000O();
      return var0 != null && "Тёмно-синий".equals(var0.O000000000O0OO.O0000000000()) ? Formatting.DARK_BLUE : Formatting.AQUA;
   }

   private static String O000000000(String string, ProtectInfo o00000O0O0O00O) {
      if (string != null && !string.isEmpty()) {
         String var2 = string;
         if (o00000O0O0O00O.O000000000O0.O000000000("Свой ник")) {
            var2 = O0000000000(string, o00000O0O0O00O);
         }

         if (o00000O0O0O00O.O000000000O.O0000000000()) {
            var2 = O00000000000(var2, o00000O0O0O00O);
         }

         if (o00000O0O0O00O.O000000000O0.O000000000("Анархию")) {
            O0000O000OOOO.O00000000.O00000000(500L);
            var2 = O000000000(var2, o00000O0O0O00O.O000000000O0O.O0000000000(), O0000O000OOOO.O00000000.O0000000000());
         }

         return var2;
      } else {
         return string;
      }
   }

   private static String O0000000000(String string, ProtectInfo o00000O0O0O00O) {
      String var2 = O000000000(o00000O0O0O00O);
      String var3 = string;
      if (O0000000000 != null) {
         if (O0000000000.getSession() != null) {
            var3 = O00000000(string, O0000000000.getSession().getUsername(), var2);
         }

         if (O0000000000.player != null) {
            var3 = O00000000(var3, O0000000000.player.getGameProfile() == null ? null : O0000000000.player.getGameProfile().getName(), var2);
            var3 = O00000000(var3, O0000000000.player.getName() == null ? null : O0000000000.player.getName().getString(), var2);
         }
      }

      return O00000000(var3, O0000O000OOOO.O000000000, var2);
   }

   private static String O00000000000(String string, ProtectInfo o00000O0O0O00O) {
      String var2 = O000000000(o00000O0O0O00O);
      String var3 = string;
      List var4 = FriendCommand.O00000000000();
      if (var4 != null && !var4.isEmpty()) {
         for (String var6 : (List<String>)var4) {
            var3 = O00000000(var3, var6, var2);
         }

         return var3;
      } else {
         return string;
      }
   }

   private static String O000000000(ProtectInfo o00000O0O0O00O) {
      String var1 = o00000O0O0O00O.O000000000O00O.O0000000000();
      return var1 != null && !var1.isBlank() ? var1 : "Protect";
   }

   private static String O00000000(String string, String string2, String string3) {
      if (string != null && !string.isEmpty() && string2 != null) {
         String var3 = string3 != null && !string3.isBlank() ? string3 : "Protect";
         String var4 = O00000000O0O0.matcher(string2).replaceAll("").trim();
         if (!var4.isEmpty() && !var4.equalsIgnoreCase("N/A") && !var4.equalsIgnoreCase(var3)) {
            Pattern var5 = Pattern.compile(Pattern.quote(var4), 66);
            Matcher var6 = var5.matcher(string);
            StringBuilder var7 = new StringBuilder(string.length());

            while (var6.find()) {
               String var8 = var6.group();
               if (O00000000(string, var6.start(), var6.end()) && !O00000000(string, var6.start(), var6.end(), var4, var3)) {
                  var6.appendReplacement(var7, Matcher.quoteReplacement(var3));
               } else {
                  var6.appendReplacement(var7, Matcher.quoteReplacement(var8));
               }
            }

            var6.appendTail(var7);
            return var7.toString();
         } else {
            return string;
         }
      } else {
         return string;
      }
   }

   private static boolean O00000000(String string, int i, int j) {
      return (i <= 0 || !O00000000(string.charAt(i - 1))) && (j >= string.length() || !O00000000(string.charAt(j)));
   }

   private static boolean O00000000(char c) {
      return Character.isLetterOrDigit(c) || c == '_';
   }

   private static boolean O00000000(String string, int i, int j, String string2, String string3) {
      if (string3 != null && !string3.isEmpty()) {
         Matcher var5 = Pattern.compile(Pattern.quote(string2), 66).matcher(string3);

         while (var5.find()) {
            String var6 = string3.substring(0, var5.start());
            String var7 = string3.substring(var5.end());
            int var8 = i - var6.length();
            int var9 = j + var7.length();
            if (var8 >= 0
               && var9 <= string.length()
               && string.regionMatches(true, var8, var6, 0, var6.length())
               && string.regionMatches(true, j, var7, 0, var7.length())) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static String O000000000(String string, String string2, String string3) {
      if (string != null && !string.isEmpty()) {
         String var3 = string2 != null && !string2.isBlank() ? string2 : "Hidden";
         String var4 = O00000000O0O00.matcher(string).replaceAll(Matcher.quoteReplacement(var3));
         if (string3 != null && !string3.equals("N/A") && !string3.isBlank()) {
            String var5 = O00000000O0O0.matcher(var4).replaceAll("").trim();
            if (var5.equals(string3) || var5.equals("-" + string3) || var5.equals("#" + string3) || var5.equals("№" + string3)) {
               return var3;
            }

            Pattern var6 = Pattern.compile("(?iu)(?:анарх(?:ия|ии)?|anarchy|an)\\s*(?:[-:#№]|\\s)*" + Pattern.quote(string3));
            var4 = var6.matcher(var4).replaceAll(Matcher.quoteReplacement(var3));
         }

         return var4;
      } else {
         return string;
      }
   }

   private static Text O00000000(Text text, Formatting formatting) {
      MutableText var2 = Text.empty();
      text.visit((style, string) -> {
         Style var4 = style.withColor(formatting);
         var2.append(Text.literal(string).setStyle(var4));
         return Optional.empty();
      }, Style.EMPTY);
      return var2;
   }

   private static String O00000000(String string, boolean bl, String string2) {
      if (string != null && !string.isEmpty()) {
         String var3 = string;
         if (bl) {
            var3 = O00000000(string, string2);
            var3 = O000000000(var3, string2);
            var3 = O00000000O0000.matcher(var3).replaceAll(string2 + ".net");
         }

         for (Pattern var7 : O00000000O000O) {
            var3 = var7.matcher(var3).replaceAll(Matcher.quoteReplacement(string2));
         }

         return var3;
      } else {
         return string;
      }
   }

   private static ProtectInfo.W186 O00000000(List<ProtectInfo.W187> list, String string, boolean bl, String string2) {
      ProtectInfo.W186 var4 = new ProtectInfo.W186(list, string, false);
      if (bl) {
         var4 = O00000000(var4, O00000000O00, matcher -> string2 + "." + matcher.group(2).toLowerCase(Locale.ROOT));
         var4 = O00000000(var4, O00000000O000, matcher -> string2 + "." + matcher.group(1).toLowerCase(Locale.ROOT));
         var4 = O00000000(var4, O00000000O0000, matcher -> string2 + ".net");
      }

      for (Pattern var8 : O00000000O000O) {
         var4 = O00000000(var4, var8, matcher -> string2);
      }

      return var4;
   }

   private static ProtectInfo.W186 O00000000(ProtectInfo.W186 o00000000, Pattern pattern, Function<Matcher, String> function) {
      Matcher var3 = pattern.matcher(o00000000.text);
      if (!var3.find()) {
         return o00000000;
      } else {
         ArrayList var4 = new ArrayList();
         int var5 = 0;

         do {
            O00000000(o00000000.tokens, var4, var5, var3.start());
            var4.add(new ProtectInfo.W187((String)function.apply(var3), O00000000(o00000000.tokens, var3.start())));
            var5 = var3.end();
         } while (var3.find());

         O00000000(o00000000.tokens, var4, var5, o00000000.text.length());
         return new ProtectInfo.W186(var4, O00000000((List<ProtectInfo.W187>)var4), true);
      }
   }

   private static void O00000000(List<ProtectInfo.W187> list, List<ProtectInfo.W187> list2, int i, int j) {
      if (i < j) {
         int var4 = 0;

         for (ProtectInfo.W187 var6 : list) {
            int var7 = var4;
            int var8 = var4 + var6.text.length();
            var4 = var8;
            int var9 = Math.max(i, var7);
            int var10 = Math.min(j, var8);
            if (var9 < var10) {
               list2.add(new ProtectInfo.W187(var6.text.substring(var9 - var7, var10 - var7), var6.style));
            }
         }
      }
   }

   private static Style O00000000(List<ProtectInfo.W187> list, int i) {
      int var2 = 0;
      Style var3 = Style.EMPTY;

      for (ProtectInfo.W187 var5 : list) {
         int var6 = var2 + var5.text.length();
         if (i < var6) {
            return var5.style;
         }

         var2 = var6;
         var3 = var5.style;
      }

      return var3;
   }

   private static String O00000000(List<ProtectInfo.W187> list) {
      StringBuilder var1 = new StringBuilder();

      for (ProtectInfo.W187 var3 : list) {
         var1.append(var3.text);
      }

      return var1.toString();
   }

   private static String O00000000(String string, String string2) {
      Matcher var2 = O00000000O00.matcher(string);
      StringBuffer var3 = new StringBuffer();

      while (var2.find()) {
         var2.appendReplacement(var3, Matcher.quoteReplacement(string2 + "." + var2.group(2).toLowerCase(Locale.ROOT)));
      }

      var2.appendTail(var3);
      return var3.toString();
   }

   private static String O000000000(String string, String string2) {
      Matcher var2 = O00000000O000.matcher(string);
      StringBuffer var3 = new StringBuffer();

      while (var2.find()) {
         var2.appendReplacement(var3, Matcher.quoteReplacement(string2 + "." + var2.group(1).toLowerCase(Locale.ROOT)));
      }

      var2.appendTail(var3);
      return var3.toString();
   }

   private static Pattern[] O000000000O000() {
      Pattern[] var0 = new Pattern[O00000000O0.length];

      for (int var1 = 0; var1 < O00000000O0.length; var1++) {
         var0[var1] = Pattern.compile("(?iu)(?<![\\p{L}\\p{N}])" + O00000000000(O00000000O0[var1]) + "(?![\\p{L}\\p{N}])");
      }

      return var0;
   }

   private static String O00000000000(String string) {
      StringBuilder var1 = new StringBuilder();

      for (int var2 = 0; var2 < string.length(); var2++) {
         if (var2 > 0) {
            var1.append("[\\s._-]*");
         }

         var1.append(Pattern.quote(String.valueOf(string.charAt(var2))));
      }

      return var1.toString();
   }

   private static int O00000000(Identifier identifier) {
      if (O0000000000 == null) {
         return -1;
      } else {
         TextureManager var1 = O0000000000.getTextureManager();
         if (var1 == null) {
            return -1;
         } else {
            AbstractTexture var2 = var1.getTexture(identifier);
            if (var2 == null) {
               return -1;
            } else {
               return var2.getGlTexture() instanceof GlTexture var4 ? var4.getGlId() : -1;
            }
         }
      }
   }

   record W186(List<ProtectInfo.W187> tokens, String text, boolean changed) {
   }

   record W187(String text, Style style) {
   }
}
