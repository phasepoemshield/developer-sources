package ru.metaculture.protection;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.MinecraftClient;

public final class AutoLoginManager {
   private static volatile String O00000000 = "";
   private static volatile String O000000000 = "";
   private static volatile String O0000000000 = "";
   private static volatile long O00000000000;

   private AutoLoginManager() {
   }

   public static void O00000000(String string, String string2) {
      O00000000 = O000000000(string);
      O000000000 = string2 == null ? "" : string2.trim();
   }

   public static void O00000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.getSession() != null) {
         List var1 = O00000OO0OOO.O00000000(O00000000());
         if (!var1.isEmpty()) {
            String var2 = O00000OO0OOO.O000000000(O00000000());
            O00000OO0OOO.W246 var3 = (O00000OO0OOO.W246)var1.stream()
               .filter(o00000000 -> ((O00000OO0OOO.W246)o00000000).id().equals(var2))
               .findFirst()
               .orElseGet(
                  () -> var1.stream()
                     .filter(o00000000 -> ((O00000OO0OOO.W246)o00000000).lastUsedAt() > 0L)
                     .max(Comparator.comparingLong(O00000OO0OOO.W246::lastUsedAt))
                     .orElse(null)
               );
            if (var3 != null && !var3.name().isBlank()) {
               O00000000(var3.name(), var3.password());
               if (!var3.name().equalsIgnoreCase(minecraftClient.getSession().getUsername())) {
                  O0000O00O00OO0.O00000000(minecraftClient);
                  if (!O0000O00O00OO0.O00000000(minecraftClient, var3.name())) {
                     O0000O00O00OO0.O000000000(minecraftClient, var3.name());
                  }
               }
            }
         }
      }
   }

   public static void O000000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.getSession() != null) {
         String var1 = O000000000(minecraftClient.getSession().getUsername());
         if (!var1.isEmpty()) {
            Thread var2 = new Thread(() -> {
               String var1x;
               try {
                  var1x = O00000000(var1);
               } catch (Throwable var8) {
                  return;
               }

               if (!var1x.isEmpty()) {
                  String var2x = var1.toLowerCase(Locale.ROOT) + ":" + Integer.toHexString(var1x.hashCode());
                  long var3 = System.currentTimeMillis();
                  synchronized (AutoLoginManager.class) {
                     if (var2x.equals(O0000000000) && var3 - O00000000000 < 4500L) {
                        return;
                     }

                     O0000000000 = var2x;
                     O00000000000 = var3;
                  }

                  try {
                     Thread.sleep(1600L);
                  } catch (InterruptedException var7) {
                     Thread.currentThread().interrupt();
                     return;
                  }

                  MinecraftClient var10 = MinecraftClient.getInstance();
                  if (var10 != null) {
                     var10.execute(() -> {
                        if (var10.player != null && var10.player.networkHandler != null && var10.getSession() != null) {
                           if (var1.equalsIgnoreCase(O000000000(var10.getSession().getUsername()))) {
                              var10.player.networkHandler.sendChatCommand("login " + var1x);
                           }
                        }
                     });
                  }
               }
            }, "Wild Alt AutoLogin");
            var2.setDaemon(true);
            var2.start();
         }
      }
   }

   private static String O00000000(String string) {
      if (string.isEmpty()) {
         return "";
      } else if (string.equalsIgnoreCase(O00000000) && !O000000000.isEmpty()) {
         return O000000000;
      } else {
         for (O00000OO0OOO.W246 var3 : O00000OO0OOO.O00000000(O00000000())) {
            if ("CRACKED".equalsIgnoreCase(var3.type()) && string.equalsIgnoreCase(var3.name())) {
               return var3.password() == null ? "" : var3.password().trim();
            }
         }

         return "";
      }
   }

   private static File O00000000() {
      return WildClient.O00000000 != null && WildClient.O00000000.O0000000000000 != null
         ? new File(WildClient.O00000000.O0000000000000, "accounts.json")
         : new File(WildClient.O000000000(), "accounts.json");
   }

   private static String O000000000(String string) {
      return string == null ? "" : string.trim();
   }
}
