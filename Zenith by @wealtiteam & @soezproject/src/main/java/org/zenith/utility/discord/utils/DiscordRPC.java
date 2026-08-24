package org.zenith.utility.discord.utils;

import org.zenith.module.Module;

import org.zenith.module.Interface;

import org.zenith.module.Interface;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;














import com.sun.jna.Library;

public interface DiscordRPC extends Library {
   DiscordRPC INSTANCE = DiscordRPC_Loader.load();
   /** false when the native library is missing and INSTANCE is a no-op stub. */
   boolean AVAILABLE = DiscordRPC_Loader.available;

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
}
