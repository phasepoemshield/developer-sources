package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.DisconnectedScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.network.DisconnectionInfo;
import ru.metaculture.sdk.Loader;

public final class O0000O00O00000 {
   private static final long O00000000 = 3500L;
   private static final Object O000000000 = new Object();
   private static volatile long O0000000000;
   private static volatile ServerInfo O00000000000;
   private static volatile boolean O000000000000;
   private static volatile ServerInfo O0000000000000;

   private O0000O00O00000() {
   }

   public static void O00000000(ServerInfo serverInfo, DisconnectionInfo disconnectionInfo) {
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void O00000000(MinecraftClient minecraftClient) {
      if (O000000000000 && minecraftClient != null) {
         try {
            O000000000(minecraftClient);
         } catch (Throwable var17) {
         }

         if (minecraftClient.currentScreen instanceof DisconnectedScreen) {
            Object var4 = O000000000;
            synchronized (O000000000){} // $VF: monitorenter 
            boolean var16 = false /* VF: Semaphore variable */;

            ServerInfo var1;
            long var2;
            try {
               var16 = true;
               if (!O000000000000) {
                  // $VF: monitorexit
                  return;
               }

               var2 = O0000000000;
               var1 = O00000000000;
               // $VF: monitorexit
               var16 = false;
            } finally {
               if (var16) {
                  // $VF: monitorexit
               }
            }

            if (System.currentTimeMillis() >= var2) {
               if (minecraftClient.getNetworkHandler() == null) {
                  if (var1 != null && var1.address != null && !var1.address.isBlank()) {
                     boolean var11 = false /* VF: Semaphore variable */;

                     label157: {
                        try {
                           var11 = true;
                           var4 = ServerAddress.parse(var1.address);
                           ConnectScreen.connect(O000000000(), minecraftClient, (ServerAddress)var4, var1, false, null);
                           var11 = false;
                           break label157;
                        } catch (Throwable var18) {
                           var11 = false;
                        } finally {
                           if (var11) {
                              O00000000();
                           }
                        }

                        O00000000();
                        return;
                     }

                     O00000000();
                  } else {
                     O00000000();
                  }
               }
            }
         }
      }
   }

   public static void O00000000() {
      synchronized (O000000000) {
         O000000000000 = false;
         O0000000000 = 0L;
         O00000000000 = null;
      }
   }

   public static void O000000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null) {
         try {
            if (minecraftClient.getNetworkHandler() == null) {
               return;
            }

            ServerInfo var1 = minecraftClient.getCurrentServerEntry();
            if (var1 == null || var1.address == null || var1.address.isBlank()) {
               return;
            }

            O0000000000000 = O00000000(var1);
         } catch (Throwable var2) {
         }
      }
   }

   private static ServerInfo O00000000(ServerInfo serverInfo) {
      ServerInfo var1 = new ServerInfo(serverInfo.name, serverInfo.address, serverInfo.getServerType());
      var1.copyWithSettingsFrom(serverInfo);
      return var1;
   }

   private static Screen O000000000() {
      return (Screen)(UnHook.O000000000O0 ? new MultiplayerScreen(new TitleScreen()) : new WildMultiplayerScreen(new MainMenuScreen()));
   }

   private static String O00000000(String string) {
      return null;
   }

   private static boolean O000000000(String string) {
      return false;
   }

   static {
      Loader.initialize();
   }
}
