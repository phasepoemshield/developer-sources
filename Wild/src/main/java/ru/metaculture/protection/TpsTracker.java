package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket;
import net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;

public class TpsTracker {
   private static final double O0000000000 = 50.0;
   private static final double O00000000000 = 1.0E-6;
   private static final double O000000000000 = 1000000.0;
   private static final long O0000000000000 = 5000000000L;
   private static final double O000000000000O = 0.15;
   private static final double O00000000000O = 0.125;
   public static long O00000000 = System.currentTimeMillis() - 588L;
   public static double O000000000 = 20.0;
   private static volatile long O00000000000O0 = System.nanoTime();
   private static volatile long O00000000000OO;
   private static volatile double O0000000000O;
   private static volatile double O0000000000O0;
   private static volatile boolean O0000000000O00;

   public static boolean O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO != null && o0000000O000OO.O000000000000() == O0000000O000OO.W24.RECEIVE) {
         Packet var1 = o0000000O000OO.O00000000000();
         long var2 = System.nanoTime();
         if (var1 instanceof WorldTimeUpdateS2CPacket) {
            O00000000(var2, System.currentTimeMillis());
            return true;
         } else {
            if (var1 instanceof KeepAliveS2CPacket) {
               O00000000(var2);
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public static void O00000000(long l, long m) {
      long var4 = O00000000;
      float var6 = (float)(m - var4);
      float var7 = var6 / 1000.0F;
      float var8 = var7 > 0.0F ? 20.0F / var7 : 20.0F;
      O000000000 = Math.min(var8, 20.0F);
      O00000000 = m;
      O00000000(l, true);
   }

   public static void O00000000(long l) {
      O00000000(l, false);
   }

   private static void O00000000(long l, boolean bl) {
      long var3 = O00000000000OO;
      if (var3 > 0L) {
         O000000000000(l - var3);
      }

      O00000000000OO = l;
      if (bl || O00000000000O0 == 0L) {
         O00000000000O0 = l;
         O0000000000O00 = true;
      }

      O000000000000O();
   }

   private static void O000000000000(long l) {
      if (l > 0L) {
         double var2 = l * 1.0E-6;
         double var4 = Math.max(1.0, Math.rint(var2 / 50.0));
         double var6 = Math.abs(var2 - var4 * 50.0);
         double var8 = O0000000000O0;
         O0000000000O0 = var8 <= 0.0 ? var6 : var8 + (var6 - var8) * 0.125;
      }
   }

   private static void O000000000000O() {
      MinecraftClient var0 = MinecraftClient.getInstance();
      if (var0 != null && var0.player != null && var0.getNetworkHandler() != null) {
         PlayerListEntry var1 = var0.getNetworkHandler().getPlayerListEntry(var0.player.getUuid());
         if (var1 != null) {
            int var2 = var1.getLatency();
            if (var2 > 0 && var2 <= 2000) {
               double var3 = O0000000000O;
               O0000000000O = var3 <= 0.0 ? var2 : var3 + (var2 - var3) * 0.15;
            }
         }
      }
   }

   public static double O00000000() {
      return O000000000;
   }

   public static double O000000000() {
      return 20.0 - O000000000;
   }

   public static boolean O0000000000() {
      return O000000000(System.nanoTime());
   }

   public static boolean O000000000(long l) {
      long var2 = O00000000000O0;
      long var4 = l - var2;
      return O0000000000O00 && var2 > 0L && var4 >= 0L && var4 <= 5000000000L;
   }

   public static double O0000000000(long l) {
      if (!O000000000(l)) {
         return 50.0;
      } else {
         double var2 = O00000000000(l);
         double var4 = 50.0 - var2;
         return var4 <= 0.0 ? 50.0 : var4;
      }
   }

   public static double O00000000000(long l) {
      long var2 = O00000000000O0;
      if (var2 <= 0L) {
         return 0.0;
      } else {
         double var4 = (l - var2) * 1.0E-6 + O0000000000O * 0.5;
         var4 %= 50.0;
         if (var4 < 0.0) {
            var4 += 50.0;
         }

         return var4;
      }
   }

   public static long O00000000(long l, double d) {
      if (!O000000000(l)) {
         return 0L;
      } else {
         double var4 = O00000000000(l);
         double var6 = d - var4;
         if (var6 < 0.0) {
            var6 += 50.0;
         }

         return (long)(var6 * 1000000.0);
      }
   }

   public static double O00000000000() {
      return O0000000000O;
   }

   public static double O000000000000() {
      return O0000000000O0;
   }

   public static void O0000000000000() {
      O00000000 = System.currentTimeMillis() - 588L;
      O000000000 = 20.0;
      O00000000000O0 = System.nanoTime();
      O00000000000OO = 0L;
      O0000000000O = 0.0;
      O0000000000O0 = 0.0;
      O0000000000O00 = false;
   }
}
