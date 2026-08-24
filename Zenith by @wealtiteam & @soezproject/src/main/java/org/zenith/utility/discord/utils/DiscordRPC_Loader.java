package org.zenith.utility.discord.utils;

import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.FileLogger;













import com.sun.jna.Native;
import java.lang.reflect.Proxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Loads the native {@code discord-rpc} library.
 *
 * <p>The library ships with the official launcher only, so a source build has no
 * copy of it. Rather than letting {@link Native#load} kill the whole client from
 * a static initializer, we fall back to a no-op proxy and flip {@link #available}
 * off, which leaves Rich Presence disabled and everything else running.
 */
final class DiscordRPC_Loader {
   static final Logger LOGGER = LoggerFactory.getLogger("Zenith/DiscordRPC");
   static boolean available;

   private DiscordRPC_Loader() {
   }

   static DiscordRPC load() {
      try {
         DiscordRPC discordrpc = Native.load("discord-rpc", DiscordRPC.class);
         available = true;
         return discordrpc;
      } catch (Throwable throwable) {
         available = false;
         LOGGER.warn("Native library 'discord-rpc' is unavailable, Rich Presence disabled ({})", throwable.toString());
         return noop();
      }
   }

   private static DiscordRPC noop() {
      return (DiscordRPC)Proxy.newProxyInstance(
         DiscordRPC.class.getClassLoader(),
         new Class[]{DiscordRPC.class},
         (var0, var1, var2) -> {
            if (var1.getDeclaringClass() == Object.class) {
               return switch (var1.getName()) {
                  case "hashCode" -> System.identityHashCode(var0);
                  case "equals" -> var0 == var2[0];
                  case "toString" -> "DiscordRPC(unavailable)";
                  default -> null;
               };
            } else {
               return null;
            }
         }
      );
   }
}
