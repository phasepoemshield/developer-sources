package l;

import net.minecraft.text.MutableText;
import net.minecraft.text.Text;

public class Helper37 {
   public Helper37() {
   }

   public static Text method508(String var0, Helper36 var1, int var2, int var3, boolean var4) {
      switch (var1) {
         case HALF_SPLIT:
            return method509(var0, var2, var3, var4);
         case FULL_GRADIENT:
            return method510(var0, var2, var3, var4);
         case ASTOLFO:
            return method511(var0, var4);
         case TWO_COLOR_FADE:
            return method512(var0, var2, var3, var4);
         default:
            return Text.literal(var0).styled(var2x -> var2x.withColor(var2).withBold(var4));
      }
   }

   private static Text method509(String var0, int var1, int var2, boolean var3) {
      MutableText var4 = Text.literal("");
      int var5 = var0.length() / 2;

      for (int var6 = 0; var6 < var0.length(); var6++) {
         int var7 = var6 < var5 ? var1 : var2;
         var4.append(Text.literal(String.valueOf(var0.charAt(var6))).styled(var2x -> var2x.withColor(var7).withBold(var3)));
      }

      return var4;
   }

   private static Text method510(String var0, int var1, int var2, boolean var3) {
      MutableText var4 = Text.literal("");

      for (int var5 = 0; var5 < var0.length(); var5++) {
         float var6 = (float)var5 / (var0.length() - 1);
         int var7 = Helper133.method1142(var1, var2, var6);
         var4.append(Text.literal(String.valueOf(var0.charAt(var5))).styled(var2x -> var2x.withColor(var7).withBold(var3)));
      }

      return var4;
   }

   private static Text method511(String var0, boolean var1) {
      MutableText var2 = Text.literal("");

      for (int var3 = 0; var3 < var0.length(); var3++) {
         int var4 = Helper133.method1115(10, var3, 0.7F, 0.7F, 1.0F);
         var2.append(Text.literal(String.valueOf(var0.charAt(var3))).styled(var2x -> var2x.withColor(var4).withBold(var1)));
      }

      return var2;
   }

   private static Text method512(String var0, int var1, int var2, boolean var3) {
      MutableText var4 = Text.literal("");

      for (int var5 = 0; var5 < var0.length(); var5++) {
         float var6 = (float)var5 / (var0.length() - 1);
         int var7 = Helper133.method1123(var1, var2, var6);
         var4.append(Text.literal(String.valueOf(var0.charAt(var5))).styled(var2x -> var2x.withColor(var7).withBold(var3)));
      }

      return var4;
   }

   public static Text method513(String var0, String var1, boolean var2) {
      String var3 = var1.toLowerCase();
      switch (var3) {
         case "red_blue":
            return method508(var0, Helper36.HALF_SPLIT, Helper133.red, Helper133.method1119("#0000FF"), var2);
         case "green_purple":
            return method508(var0, Helper36.HALF_SPLIT, Helper133.green, Helper133.method1119("#800080"), var2);
         case "yellow_cyan":
            return method508(var0, Helper36.FULL_GRADIENT, Helper133.yellow, Helper133.method1119("#00FFFF"), var2);
         case "orange_magenta":
            return method508(var0, Helper36.FULL_GRADIENT, Helper133.orange, Helper133.method1119("#FF00FF"), var2);
         case "astolfo":
            return method508(var0, Helper36.ASTOLFO, 0, 0, var2);
         case "blue_green_fade":
            return method508(var0, Helper36.TWO_COLOR_FADE, Helper133.method1119("#0000FF"), Helper133.green, var2);
         case "purple_red_fade":
            return method508(var0, Helper36.TWO_COLOR_FADE, Helper133.method1119("#800080"), Helper133.red, var2);
         case "cyan_orange_fade":
            return method508(var0, Helper36.TWO_COLOR_FADE, Helper133.method1119("#00FFFF"), Helper133.orange, var2);
         case "white_black":
            return method508(var0, Helper36.FULL_GRADIENT, Helper133.method1086(), Helper133.method1085(), var2);
         case "custom_purple":
            return method508(var0, Helper36.FULL_GRADIENT, Helper133.method1087(), Helper133.method1084(), var2);
         case "black_light_purple":
            return method508(var0, Helper36.FULL_GRADIENT, Helper133.method1085(), Helper133.method1119("#DA70D6"), var2);
         case "dark_red_bright_red":
            return method508(var0, Helper36.FULL_GRADIENT, Helper133.method1119("#8B0000"), Helper133.red, var2);
         case "dark_red":
            return method508(var0, Helper36.HALF_SPLIT, Helper133.method1119("#8B0000"), Helper133.method1119("#8B0000"), var2);
         case "red_white":
            return method508(var0, Helper36.HALF_SPLIT, Helper133.red, Helper133.method1086(), var2);
         case "purple_bright_pink":
            return method508(var0, Helper36.FULL_GRADIENT, Helper133.method1119("#800080"), Helper133.method1119("#FF69B4"), var2);
         case "pink_dark_pink":
            return method508(var0, Helper36.FULL_GRADIENT, Helper133.method1119("#FFC1CC"), Helper133.method1119("#C71585"), var2);
         case "bright_red":
            return method508(var0, Helper36.HALF_SPLIT, Helper133.red, Helper133.red, var2);
         case "dark_green_bright_green":
            return method508(var0, Helper36.FULL_GRADIENT, Helper133.method1119("#006400"), Helper133.green, var2);
         case "red_orange":
            return method508(var0, Helper36.FULL_GRADIENT, Helper133.red, Helper133.orange, var2);
         case "turquoise_blue":
            return method508(var0, Helper36.FULL_GRADIENT, Helper133.method1119("#40E0D0"), Helper133.method1119("#0000FF"), var2);
         default:
            return Text.literal(var0).styled(var1x -> var1x.withColor(Helper133.method1086()).withBold(var2));
      }
   }
}
