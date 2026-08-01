package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;

public final class ScreenUtil {
   private ScreenUtil() {
   }

   public static <T extends Screen> T O00000000(MinecraftClient minecraftClient, Screen screen, Class<T> class_) {
      if (minecraftClient != null && class_.isInstance(minecraftClient.currentScreen)) {
         return (T)class_.cast(minecraftClient.currentScreen);
      } else {
         return (T)(class_.isInstance(screen) && O00000000(minecraftClient, screen) ? class_.cast(screen) : null);
      }
   }

   public static boolean O00000000(MinecraftClient minecraftClient, Screen screen) {
      return minecraftClient != null && minecraftClient.player != null && screen instanceof HandledScreen var2
         ? minecraftClient.player.currentScreenHandler == var2.getScreenHandler()
         : false;
   }

   public static boolean O00000000(MinecraftClient minecraftClient) {
      return minecraftClient != null
         && minecraftClient.player != null
         && minecraftClient.player.currentScreenHandler != minecraftClient.player.playerScreenHandler;
   }

   public static boolean O000000000(MinecraftClient minecraftClient, Screen screen) {
      return minecraftClient != null && (minecraftClient.currentScreen != null || O00000000(minecraftClient, screen));
   }
}
