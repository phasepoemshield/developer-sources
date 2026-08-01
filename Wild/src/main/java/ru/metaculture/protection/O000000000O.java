package ru.metaculture.protection;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public final class O000000000O {
   private static final String O00000000 = System.getProperty("wild.ntp.host", "time.windows.com");
   private static final int O000000000 = Integer.getInteger("wild.ntp.port", 123);
   private static final int O0000000000 = Integer.getInteger("wild.ntp.timeoutMs", 1200);
   private static final long O00000000000 = Long.getLong("wild.ntp.cacheTtlMs", 300000L);
   private static final long O000000000000 = Long.getLong("wild.ntp.failCooldownMs", 60000L);
   private static final long O0000000000000 = 2208988800L;
   private static volatile O000000000O.W9 O000000000000O;
   private static volatile long O00000000000O;

   private O000000000O() {
   }

   public static long O00000000() {
      O000000000O.W9 var0 = O000000000000O;
      long var1 = System.nanoTime();
      if (var0 != null && var1 - var0.nanoTime <= O00000000000 * 1000000L) {
         return var0.epochMillis + (var1 - var0.nanoTime) / 1000000L;
      } else {
         if (var1 >= O00000000000O) {
            O000000000O.W9 var3 = O00000000(var1);
            if (var3 != null) {
               O000000000000O = var3;
               return var3.epochMillis;
            }

            O00000000000O = var1 + O000000000000 * 1000000L;
         }

         return var0 != null ? var0.epochMillis + (var1 - var0.nanoTime) / 1000000L : System.currentTimeMillis();
      }
   }

   public static long O000000000() {
      O000000000O.W9 var0 = O000000000000O;
      long var1 = System.nanoTime();
      return var0 != null ? var0.epochMillis + (var1 - var0.nanoTime) / 1000000L : System.currentTimeMillis();
   }

   public static long O0000000000() {
      return O00000000() / 1000L;
   }

   public static boolean O00000000000() {
      O000000000O.W9 var0 = O000000000000O;
      return var0 == null ? false : System.nanoTime() - var0.nanoTime <= O00000000000 * 1000000L;
   }

   public static String O000000000000() {
      return O00000000000() ? "NTP:" + O00000000 : "LOCAL";
   }

   public static void O0000000000000() {
      long var0 = System.nanoTime();
      O000000000O.W9 var2 = O00000000(var0);
      if (var2 != null) {
         O000000000000O = var2;
      } else {
         O00000000000O = var0 + O000000000000 * 1000000L;
      }
   }

   private static O000000000O.W9 O00000000(long l) {
      try {
         byte[] var2 = new byte[48];
         var2[0] = 35;
         InetAddress var3 = InetAddress.getByName(O00000000);
         DatagramPacket var4 = new DatagramPacket(var2, var2.length, var3, O000000000);

         O000000000O.W9 var11;
         try (DatagramSocket var5 = new DatagramSocket()) {
            var5.setSoTimeout(O0000000000);
            var5.send(var4);
            DatagramPacket var6 = new DatagramPacket(var2, var2.length);
            var5.receive(var6);
            long var7 = System.nanoTime();
            long var9 = O00000000(var2);
            if (var9 <= 0L) {
               return null;
            }

            var11 = new O000000000O.W9(var9, var7);
         }

         return var11;
      } catch (Throwable var14) {
         return null;
      }
   }

   private static long O00000000(byte[] bs) {
      long var1 = (bs[40] & 255L) << 24 | (bs[41] & 255L) << 16 | (bs[42] & 255L) << 8 | bs[43] & 255L;
      long var3 = (bs[44] & 255L) << 24 | (bs[45] & 255L) << 16 | (bs[46] & 255L) << 8 | bs[47] & 255L;
      long var5 = var1 - 2208988800L;
      long var7 = var5 * 1000L + var3 * 1000L / 4294967296L;
      return var7 > 0L ? var7 : 0L;
   }

   record W9(long epochMillis, long nanoTime) {
   }
}
