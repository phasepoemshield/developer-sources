package ru.metaculture.protection;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.network.ServerInfo.ServerType;
import net.minecraft.client.option.ServerList;

public final class O0000O00O00O00 {
   private static final String O00000000 = "BravoHvH";
   private static final String O000000000 = "wi.bravohvh.su";
   private static final AtomicBoolean O0000000000 = new AtomicBoolean(false);

   private O0000O00O00O00() {
   }

   public static void O00000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && O0000000000.compareAndSet(false, true)) {
         try {
            ServerList var1 = new ServerList(minecraftClient);
            var1.loadFile();
            if (O00000000(var1, "wi.bravohvh.su")) {
               return;
            }

            ServerInfo var2 = new ServerInfo("BravoHvH", "wi.bravohvh.su", ServerType.OTHER);
            var1.add(var2, false);
            var1.saveFile();
         } catch (Throwable var3) {
         }
      }
   }

   private static boolean O00000000(ServerList serverList, String string) {
      String var2 = O00000000(string);
      if (var2.isEmpty()) {
         return true;
      } else {
         int var3 = serverList.size();

         for (int var4 = 0; var4 < var3; var4++) {
            ServerInfo var5 = serverList.get(var4);
            if (var5 != null && O00000000(var5.address).equals(var2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static String O00000000(String string) {
      if (string == null) {
         return "";
      } else {
         String var1 = string.trim().toLowerCase(Locale.ROOT);
         if (var1.endsWith(":25565")) {
            var1 = var1.substring(0, var1.length() - ":25565".length());
         }

         return var1;
      }
   }
}
