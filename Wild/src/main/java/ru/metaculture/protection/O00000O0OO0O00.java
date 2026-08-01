package ru.metaculture.protection;

import com.sun.jna.Library;
import com.sun.jna.Native;
import org.wild.rpc.DiscordEventHandlers;
import org.wild.rpc.DiscordRichPresence;

public interface O00000O0OO0O00 extends Library {
   void Discord_UpdateHandlers(DiscordEventHandlers discordEventHandlers);

   void Discord_UpdatePresence(DiscordRichPresence discordRichPresence);

   void Discord_Respond(String string, int i);

   void Discord_Register(String string, String string2);

   void Discord_Shutdown();

   void Discord_UpdateConnection();

   void Discord_RegisterSteamGame(String string, String string2);

   void Discord_RunCallbacks();

   void Discord_Initialize(String string, DiscordEventHandlers discordEventHandlers, boolean bl, String string2);

   void Discord_ClearPresence();

   public static class W195 {
      private static O00000O0OO0O00 O00000000;
      private static boolean O000000000 = false;

      public static O00000O0OO0O00 O00000000() {
         if (!O000000000) {
            O000000000 = true;

            try {
               O00000000 = (O00000O0OO0O00)Native.loadLibrary("discord-rpc", O00000O0OO0O00.class);
            } catch (UnsatisfiedLinkError var1) {
               O00000000 = null;
            }
         }

         return O00000000;
      }

      public static boolean O000000000() {
         return O00000000() != null;
      }
   }
}
