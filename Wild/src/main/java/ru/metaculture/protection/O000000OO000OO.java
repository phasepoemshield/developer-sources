package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;

final class O000000OO000OO {
   private static final int O00000000 = 5;
   private static final long O000000000 = 900L;
   private static final O0000O00O0000 O0000000000 = new O0000O00O0000();
   private static O000000OO000OO.W51 O00000000000 = O000000OO000OO.W51.NONE;
   private static boolean O000000000000 = false;
   private static boolean O0000000000000 = false;
   private static boolean O000000000000O = false;
   private static int O00000000000O = 0;

   private O000000OO000OO() {
   }

   static void O00000000() {
      O00000000000 = O000000OO000OO.W51.NONE;
      O000000000000 = false;
      O0000000000000 = false;
      O000000000000O = false;
      O00000000000O = 0;
      O0000000000OO0();
   }

   static void O000000000() {
      if (O000000000000O) {
         MinecraftClient var0 = MinecraftClient.getInstance();
         if (var0.player != null) {
            if (O0000000000(var0)) {
               O000000000000O = false;
               O00000000000O = 0;
            } else if (!O0000000000OO()) {
               O000000000000O = false;
               O00000000000O = 0;
            } else if (O00000000000O >= 5) {
               if (O0000000000.O000000000000(900L)) {
                  O000000000000O = false;
               }
            } else {
               if (O0000000000.O000000000000(900L)) {
                  O000000000(var0);
               }
            }
         }
      }
   }

   static boolean O0000000000() {
      return O000000000000;
   }

   static boolean O00000000000() {
      return O0000000000000;
   }

   static boolean O000000000000() {
      return O00000000000 == O000000OO000OO.W51.SELL || AutoBuy.O000000000O0;
   }

   static boolean O0000000000000() {
      return O00000000000 == O000000OO000OO.W51.RESELL || AutoBuy.O000000000O00;
   }

   static boolean O000000000000O() {
      return !O000000000000 && !O0000000000000();
   }

   static boolean O00000000000O() {
      if (!O000000000000O()) {
         return false;
      } else {
         O00000000000 = O000000OO000OO.W51.SELL;
         O0000000000OO0();
         return true;
      }
   }

   static void O00000000(boolean bl) {
      if (O00000000000 == O000000OO000OO.W51.SELL) {
         O00000000000 = O000000OO000OO.W51.NONE;
      }

      AutoBuy.O000000000O0 = false;
      O0000000000OO0();
      O00000000000(bl);
   }

   static boolean O00000000000O0() {
      if (O0000000000000 && !O000000000000()) {
         O00000000000 = O000000OO000OO.W51.RESELL;
         O0000000000OO0();
         return true;
      } else {
         return false;
      }
   }

   static void O000000000(boolean bl) {
      if (O00000000000 == O000000OO000OO.W51.RESELL) {
         O00000000000 = O000000OO000OO.W51.NONE;
      }

      AutoBuy.O000000000O00 = false;
      O0000000000OO0();
      O00000000000(bl);
   }

   static void O0000000000(boolean bl) {
      if (bl && !O000000000000) {
         O00000000000O();
      } else {
         O0000000000OO0();
         O00000000000(true);
      }
   }

   static void O00000000000OO() {
      O000000000000 = false;
      O0000000000000 = true;
      O0000000000OO0();
   }

   static void O0000000000O() {
      O000000000000 = true;
      O0000000000000 = true;
      if (O00000000000 == O000000OO000OO.W51.SELL) {
         O00000000000 = O000000OO000OO.W51.NONE;
      }

      O0000000000OO0();
   }

   static void O0000000000O0() {
      O000000000000 = false;
      O0000000000000 = true;
      O0000000000OO0();
   }

   static void O0000000000O00() {
      O0000000000000 = true;
      O0000000000OO0();
   }

   static void O0000000000O0O() {
      O000000000000 = false;
      O0000000000000 = false;
      if (O00000000000 == O000000OO000OO.W51.RESELL) {
         O00000000000 = O000000OO000OO.W51.NONE;
      }

      O0000000000OO0();
   }

   static void O00000000000(boolean bl) {
      if (bl) {
         MinecraftClient var1 = MinecraftClient.getInstance();
         if (var1.player != null) {
            if (AutoBuy.O000000000O != null && AutoBuy.O000000000O.O0000000000000) {
               O00000000(var1);
            }
         }
      }
   }

   private static void O00000000(MinecraftClient minecraftClient) {
      if (O0000000000(minecraftClient)) {
         O000000000000O = false;
         O00000000000O = 0;
      } else if (O0000000000OO()) {
         O000000000000O = false;
         O00000000000O = 0;
         AutoBuy.O000000000O.O000000000O0O0();
      } else {
         minecraftClient.player.networkHandler.sendChatCommand("ah");
      }
   }

   private static void O000000000(MinecraftClient minecraftClient) {
      minecraftClient.player.networkHandler.sendChatCommand("ah");
      O00000000000O++;
      O0000000000.O00000000();
   }

   private static boolean O0000000000(MinecraftClient minecraftClient) {
      return minecraftClient.currentScreen instanceof GenericContainerScreen var1 && AhHelper.O00000000(var1);
   }

   private static boolean O0000000000OO() {
      return AutoBuy.O000000000O != null && AutoBuy.O000000000O.O000000000O00O.O000000000("FunTime");
   }

   private static void O0000000000OO0() {
      AutoBuy.O000000000O0 = O00000000000 == O000000OO000OO.W51.SELL;
      AutoBuy.O000000000O00 = O00000000000 == O000000OO000OO.W51.RESELL;
      AutoBuy.O000000000O000 = O000000000000;
   }

   static enum W51 {
      NONE,
      SELL,
      RESELL;
   }
}
