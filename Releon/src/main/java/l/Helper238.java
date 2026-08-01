package l;

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Helper238 {
   public Helper238() {
   }

   public static MutableText method2182() {
      return (MutableText)Helper37.method513("Releon Client", "black_light_purple", true);
   }

   public static MutableText method2183() {
      return (MutableText)Helper37.method513("Block Esp", "black_light_purple", true);
   }

   public static MutableText method2184() {
      return (MutableText)Helper37.method513("Auto Buy", "black_light_purple", true);
   }

   public static MutableText method2185() {
      return (MutableText)Helper37.method513("Parce price", "black_light_purple", true);
   }

   public static void method2186(String var0) {
      if (MinecraftClient.getInstance().player != null) {
         Text var1 = Helper37.method513("Releon Client -> ", "black_light_purple", true);
         MutableText var2 = var1.copy().append(Text.literal(var0));
         MinecraftClient.getInstance().player.sendMessage(var2, false);
      }
   }

   public static void method2187(String var0) {
      if (MinecraftClient.getInstance().player != null) {
         Text var1 = Helper37.method513("Ancient Xray -> ", "black_light_purple", true);
         MutableText var2 = var1.copy().append(Text.literal(var0));
         MinecraftClient.getInstance().player.sendMessage(var2, false);
      }
   }

   public static void method2188(String var0) {
      if (MinecraftClient.getInstance().player != null) {
         Text var1 = Helper37.method513("Help -> ", "black_light_purple", true);
         MutableText var2 = var1.copy().append(Text.literal(var0));
         MinecraftClient.getInstance().player.sendMessage(var2, false);
      }
   }

   public static void method2189(String var0) {
      if (MinecraftClient.getInstance().player != null) {
         Text var1 = Helper37.method513("AutoSwap -> ", "black_light_purple", true);
         MutableText var2 = var1.copy().append(Text.literal(var0));
         MinecraftClient.getInstance().player.sendMessage(var2, false);
      }
   }

   public static void method2190(String var0) {
      if (MinecraftClient.getInstance().player != null) {
         Text var1 = Helper37.method513("[IrcClient] ", "black_light_purple", true);
         MutableText var2 = var1.copy().append(Text.literal(var0));
         MinecraftClient.getInstance().player.sendMessage(var2, false);
      }
   }

   public static void method2191(String var0) {
      if (MinecraftClient.getInstance().player != null) {
         Text var1 = Helper37.method513("[IrcClient] ", "black_light_purple", true);
         MutableText var2 = var1.copy().append(Text.literal(var0).setStyle(Style.EMPTY.withColor(Formatting.GREEN)));
         MinecraftClient.getInstance().player.sendMessage(var2, false);
      }
   }

   public static void method2192(String var0) {
      if (MinecraftClient.getInstance().player != null) {
         Text var1 = Helper37.method513("[IrcClient] ", "black_light_purple", true);
         MutableText var2 = var1.copy().append(Text.literal(var0).setStyle(Style.EMPTY.withColor(Formatting.RED)));
         MinecraftClient.getInstance().player.sendMessage(var2, false);
      }
   }

   public static Text method2193(String var0) {
      Text var1 = Helper37.method513("Админ ", "dark_red", false);
      return var1.copy().append(Text.literal(var0));
   }

   public static Text method2194(String var0) {
      Text var1 = Helper37.method513("YouTube ", "red_white", false);
      return var1.copy().append(Text.literal(var0));
   }

   public static Text method2195(String var0) {
      Text var1 = Helper37.method513("Пропен ", "bright_red", false);
      return var1.copy().append(Text.literal(var0));
   }

   public static Text method2196(String var0) {
      Text var1 = Helper37.method513("Буст ", "dark_green_bright_green", false);
      return var1.copy().append(Text.literal(var0));
   }

   public static Text method2197(String var0) {
      Text var1 = Helper37.method513("TikTok ", "blue", false);
      return var1.copy().append(Text.literal(var0));
   }

   public static Text method2198(String var0) {
      Text var1 = Helper37.method513("Панда ", "white_black", false);
      return var1.copy().append(Text.literal(var0));
   }
}
