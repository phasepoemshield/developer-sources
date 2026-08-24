package org.zenith.base.bot;

import org.zenith.module.Bot;

import org.zenith.core.NpcCloneManager;














import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.world.WorldIcon;
import net.minecraft.client.network.MultiplayerServerListPinger;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.network.ServerInfo.ServerType;
import net.minecraft.client.network.ServerInfo.Status;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.util.Identifier;

public final class ServerIconCache {
   public static final MultiplayerServerListPinger pinger = new MultiplayerServerListPinger();
   public static final Map<String, ServerIconCache_Entry> entries = new ConcurrentHashMap<>();
   public static final ExecutorService pingExecutor = Executors.newFixedThreadPool(2, var0 -> {
      Thread thread = new Thread(var0, "zenith-bot-server-pinger");
      thread.setDaemon(true);
      return thread;
   });

   public ServerIconCache() {
   }

   public static Identifier get(String var0) {
      if (var0 != null && !var0.isEmpty() && !"No Server".equalsIgnoreCase(var0)) {
         ServerIconCache_Entry servericoncache_entry = entries.get(var0);
         if (servericoncache_entry == null) {
            MinecraftClient minecraftclient = MinecraftClient.getInstance();
            ServerInfo serverinfo = new ServerInfo(var0, var0, ServerType.OTHER);
            WorldIcon worldicon = WorldIcon.forServer(minecraftclient.getTextureManager(), var0);
            servericoncache_entry = new ServerIconCache_Entry(serverinfo, worldicon);
            ServerIconCache_Entry servericoncache_entry1 = entries.putIfAbsent(var0, servericoncache_entry);
            if (servericoncache_entry1 != null) {
               worldicon.close();
               servericoncache_entry = servericoncache_entry1;
            } else {
               startPing(servericoncache_entry);
            }
         }

         return servericoncache_entry.icon.getTextureId();
      } else {
         return null;
      }
   }

   public static void startPing(ServerIconCache_Entry var0) {
      var0.info.setStatus(Status.PINGING);
      pingExecutor.execute(() -> {
         try {
            pinger.add(var0.info, () -> {
            }, () -> {
            });
         } catch (Exception exception) {
            var0.info.setStatus(Status.UNREACHABLE);
         }
      });
   }

   public static void tick() {
      try {
         pinger.tick();
      } catch (Throwable throwable1) {
      }

      for (ServerIconCache_Entry servericoncache_entry : entries.values()) {
         byte[] abyte = servericoncache_entry.info.getFavicon();
         if (abyte != null && abyte != servericoncache_entry.lastFavicon) {
            try {
               servericoncache_entry.icon.load(NativeImage.read(abyte));
               servericoncache_entry.lastFavicon = abyte;
            } catch (Throwable throwable) {
            }
         }
      }
   }

   public static void clear() {
      try {
         pinger.cancel();
      } catch (Throwable throwable1) {
      }

      for (ServerIconCache_Entry servericoncache_entry : entries.values()) {
         try {
            servericoncache_entry.icon.close();
         } catch (Throwable throwable) {
         }
      }

      entries.clear();
   }
}
