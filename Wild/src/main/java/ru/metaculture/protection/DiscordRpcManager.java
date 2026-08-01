package ru.metaculture.protection;

import org.wild.rpc.DiscordEventHandlers;
import org.wild.rpc.DiscordRichPresence;
import ru.metaculture.profile.Profile;

public class DiscordRpcManager implements MinecraftAccessor {
   public static DiscordRichPresence O00000000 = new DiscordRichPresence();
   public static boolean O000000000;
   private static Thread O00000000000;
   private static O00000O0OO0O00 O000000000000;
   public static String O0000000000 = "";

   public void O00000000() {
      if (O00000O0OO0O00.W195.O000000000()) {
         O00000O0OO0O00 var1 = O00000O0OO0O00.W195.O00000000();
         if (!O000000000) {
            O000000000 = true;
            O000000000000 = var1;
            DiscordEventHandlers var2 = new DiscordEventHandlers();
            var2.ready = discordUser -> O0000000000 = discordUser.userId;
            var1.Discord_Initialize("1494051037655339148", var2, true, "");
            O00000000.startTimestamp = System.currentTimeMillis() / 1000L;
            O00000000.largeImageText = String.valueOf(Profile.getUid());
            var1.Discord_UpdatePresence(O00000000);
            O00000000000 = new Thread(() -> {
               while (!Thread.currentThread().isInterrupted()) {
                  var1.Discord_RunCallbacks();
                  O00000000.details = "Version: " + "1.21.8";
                  O00000000.state = "User: " + Profile.getUsername();
                  O00000000.button_label_1 = "Telegram";
                  O00000000.button_url_1 = "https://t.me/wildclient";
                  O00000000.button_label_2 = "VK";
                  O00000000.button_url_2 = "https://vk.com/wildclient";
                  O00000000.largeImageKey = "https://i.ibb.co/20hRBGzL/gif-gif.gif";
                  var1.Discord_UpdatePresence(O00000000);

                  try {
                     Thread.sleep(2000L);
                  } catch (InterruptedException var2x) {
                     Thread.currentThread().interrupt();
                     break;
                  }
               }
            }, "TH-RPC-Handler");
            O00000000000.setDaemon(true);
            O00000000000.start();
         }
      }
   }

   public static synchronized void O000000000() {
      if (O000000000 || O00000000000 != null || O000000000000 != null) {
         O000000000 = false;
         Thread var0 = O00000000000;
         O00000000000 = null;
         O00000O0OO0O00 var1 = O000000000000;
         O000000000000 = null;
         if (var0 != null) {
            var0.interrupt();
         }

         if (var1 != null) {
            try {
               var1.Discord_ClearPresence();
            } catch (Throwable var4) {
            }

            try {
               var1.Discord_Shutdown();
            } catch (Throwable var3) {
            }
         }
      }
   }
}
