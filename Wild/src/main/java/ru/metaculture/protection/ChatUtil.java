package ru.metaculture.protection;

import java.awt.Color;
import lombok.Generated;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Formatting;

public final class ChatUtil implements MinecraftAccessor {
   public static void O00000000(String string) {
      MinecraftClient var1 = MinecraftClient.getInstance();
      if (var1.inGameHud != null && var1.inGameHud.getChatHud() != null) {
         Theme var2 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.WILD;
         MutableText var3 = Text.literal("")
            .append(O00000000("Wild", var2))
            .append(Text.literal(" » ").formatted(Formatting.WHITE))
            .append(Text.literal(string).formatted(Formatting.GRAY));
         var1.inGameHud.getChatHud().addMessage(var3);
      } else {
         System.out.println("[WILD Log] " + string);
      }
   }

   public static void O000000000(String string) {
      MinecraftClient var1 = MinecraftClient.getInstance();
      if (var1.inGameHud != null && var1.inGameHud.getChatHud() != null) {
         Theme var2 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.WILD;
         MutableText var3 = Text.literal("")
            .append(O00000000("AI", var2))
            .append(Text.literal(" » ").formatted(Formatting.DARK_GRAY))
            .append(Text.literal(string).formatted(Formatting.WHITE));
         var1.inGameHud.getChatHud().addMessage(var3);
      }
   }

   public static Text O00000000(String string, Theme o0000000OOO) {
      MutableText var2 = Text.empty();
      int var3 = string.length();
      Color var4 = o0000000OOO.O00000000();
      Color var5 = o0000000OOO.O0000000000000();
      long var6 = System.currentTimeMillis();

      for (int var8 = 0; var8 < var3; var8++) {
         float var9 = var8 * 0.15F + (float)var6 / 1500.0F;
         float var10 = (float)(Math.sin(var9) + 1.0) / 2.0F;
         int var11 = (int)(var4.getRed() * (1.0F - var10) + var5.getRed() * var10);
         int var12 = (int)(var4.getGreen() * (1.0F - var10) + var5.getGreen() * var10);
         int var13 = (int)(var4.getBlue() * (1.0F - var10) + var5.getBlue() * var10);
         TextColor var14 = TextColor.fromRgb(var11 << 16 | var12 << 8 | var13);
         MutableText var15 = Text.literal(String.valueOf(string.charAt(var8))).setStyle(Style.EMPTY.withColor(var14));
         var2.append(var15);
      }

      return var2;
   }

   @Generated
   private ChatUtil() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
