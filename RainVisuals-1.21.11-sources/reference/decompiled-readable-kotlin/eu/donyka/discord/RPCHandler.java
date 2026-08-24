package eu.donyka.discord;

import eu.donyka.discord.discord.RichPresence;
import eu.donyka.discord.discord.RichPresenceBuilder;
import eu.donyka.discord.models.User;
import java.util.function.Consumer;
import lombok.Generated;

// $VF: Compiled from RPCHandler.java
public class RPCHandler {
   private static Consumer<DiscordRPC.ErrorInfo> onErrored;
   private static boolean running = false;
   private static Consumer<DiscordRPC.ErrorInfo> onDisconnected;
   private static Consumer<User> onReady;
   private static DiscordRPC rpc;

   public static void startup(String applicationId, boolean autoRegister) {
      startup(applicationId, autoRegister, null);
   }

   public static void updatePresence(RichPresence presence) {
      if (rpc != null && running) {
         rpc.updatePresence(presence);
      }
   }

   public static void setOnDisconnected(Consumer<DiscordRPC.ErrorInfo> onDisconnected) {
      RPCHandler.onDisconnected = onDisconnected;
   }

   public static void setOnErrored(Consumer<DiscordRPC.ErrorInfo> onErrored) {
      RPCHandler.onErrored = onErrored;
   }

   public static void updatePresence(Consumer<RichPresenceBuilder> builder) {
      RichPresenceBuilder presenceBuilder = RichPresenceBuilder.builder();
      builder.accept(presenceBuilder);
      updatePresence(presenceBuilder.build());
   }

   public static void setOnReady(Consumer<User> onReady) {
      RPCHandler.onReady = onReady;
   }

   @Generated
   public static boolean isRunning() {
      return running;
   }

   public static void startup(String optionalSteamId, boolean autoRegister, String applicationId) {
      if (running) {
         shutdown();
      }

      rpc = new DiscordRPC();
      rpc.setOnReady(user -> {
         if (onReady != null) {
            onReady.accept(user);
         }
      });
      rpc.setOnDisconnected(error -> {
         if (onDisconnected != null) {
            onDisconnected.accept(error);
         }
      });
      rpc.setOnErrored(error -> {
         if (onErrored != null) {
            onErrored.accept(error);
         }
      });

      try {
         rpc.init(applicationId, autoRegister, optionalSteamId);
         running = true;
      } catch (Exception var4) {
         throw new RuntimeException("Failed to initialize Discord RPC", var4);
      }
   }

   public static void shutdown() {
      if (running) {
         running = false;
         if (rpc != null) {
            rpc.shutdown();
            rpc = null;
         }

         onReady = null;
         onDisconnected = null;
         onErrored = null;
      }
   }
}
