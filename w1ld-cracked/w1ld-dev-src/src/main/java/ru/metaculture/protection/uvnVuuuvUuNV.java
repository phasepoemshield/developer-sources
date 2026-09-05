package ru.metaculture.protection;

import com.sun.jna.Library;
import com.sun.jna.Native;
import org.wild.rpc.DiscordEventHandlers;
import org.wild.rpc.DiscordRichPresence;

public interface uvnVuuuvUuNV extends Library {
   void Discord_UpdateHandlers(DiscordEventHandlers var1);

   void Discord_UpdatePresence(DiscordRichPresence var1);

   void Discord_Respond(String var1, int var2);

   void Discord_Register(String var1, String var2);

   void Discord_Shutdown();

   void Discord_UpdateConnection();

   void Discord_RegisterSteamGame(String var1, String var2);

   void Discord_RunCallbacks();

   void Discord_Initialize(String var1, DiscordEventHandlers var2, boolean var3, String var4);

   void Discord_ClearPresence();

   public static class NVnVnNnN {
      private static uvnVuuuvUuNV UuUVuuUu;
      private static boolean C00OOC00oO = false;

      public static uvnVuuuvUuNV UuUVuuUu() {
         if (!C00OOC00oO) {
            C00OOC00oO = true;

            try {
               UuUVuuUu = (uvnVuuuvUuNV)Native.loadLibrary("discord-rpc", uvnVuuuvUuNV.class);
            } catch (UnsatisfiedLinkError var1) {
               UuUVuuUu = null;
            }
         }

         return UuUVuuUu;
      }

      public static boolean C00OOC00oO() {
         return UuUVuuUu() != null;
      }
   }
}
