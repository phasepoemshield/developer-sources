package ru.metaculture.protection;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public final class NuvUnNnV {
   private static final String UuUVuuUu = System.getProperty("wild.ntp.host", "time.windows.com");
   private static final int C00OOC00oO = Integer.getInteger("wild.ntp.port", 123);
   private static final int uUnuvNvvNU = Integer.getInteger("wild.ntp.timeoutMs", 1200);
   private static final long vVvUvVVuuNvV = Long.getLong("wild.ntp.cacheTtlMs", 300000L);
   private static final long uNNnnnuuuN = Long.getLong("wild.ntp.failCooldownMs", 60000L);
   private static final long nuUnNvnuUu = 2208988800L;
   private static volatile NuvUnNnV.NVnVnNnN VVuuUN;
   private static volatile long vNUvnnVnUvu;

   private NuvUnNnV() {
   }

   public static long UuUVuuUu() {
      NuvUnNnV.NVnVnNnN var0 = VVuuUN;
      long var1 = System.nanoTime();
      if (var0 != null && var1 - var0.nanoTime <= vVvUvVVuuNvV * 1000000L) {
         return var0.epochMillis + (var1 - var0.nanoTime) / 1000000L;
      } else {
         if (var1 >= vNUvnnVnUvu) {
            NuvUnNnV.NVnVnNnN var3 = UuUVuuUu(var1);
            if (var3 != null) {
               VVuuUN = var3;
               return var3.epochMillis;
            }

            vNUvnnVnUvu = var1 + uNNnnnuuuN * 1000000L;
         }

         return var0 != null ? var0.epochMillis + (var1 - var0.nanoTime) / 1000000L : System.currentTimeMillis();
      }
   }

   public static long C00OOC00oO() {
      NuvUnNnV.NVnVnNnN var0 = VVuuUN;
      long var1 = System.nanoTime();
      return var0 != null ? var0.epochMillis + (var1 - var0.nanoTime) / 1000000L : System.currentTimeMillis();
   }

   public static long uUnuvNvvNU() {
      return UuUVuuUu() / 1000L;
   }

   public static boolean vVvUvVVuuNvV() {
      NuvUnNnV.NVnVnNnN var0 = VVuuUN;
      return var0 == null ? false : System.nanoTime() - var0.nanoTime <= vVvUvVVuuNvV * 1000000L;
   }

   public static String uNNnnnuuuN() {
      return vVvUvVVuuNvV() ? "NTP:" + UuUVuuUu : "LOCAL";
   }

   public static void nuUnNvnuUu() {
      long var0 = System.nanoTime();
      NuvUnNnV.NVnVnNnN var2 = UuUVuuUu(var0);
      if (var2 != null) {
         VVuuUN = var2;
      } else {
         vNUvnnVnUvu = var0 + uNNnnnuuuN * 1000000L;
      }
   }

   private static NuvUnNnV.NVnVnNnN UuUVuuUu(long var0) {
      try {
         byte[] var2 = new byte[48];
         var2[0] = 35;
         InetAddress var3 = InetAddress.getByName(UuUVuuUu);
         DatagramPacket var4 = new DatagramPacket(var2, var2.length, var3, C00OOC00oO);

         NuvUnNnV.NVnVnNnN var11;
         try (DatagramSocket var5 = new DatagramSocket()) {
            var5.setSoTimeout(uUnuvNvvNU);
            var5.send(var4);
            DatagramPacket var6 = new DatagramPacket(var2, var2.length);
            var5.receive(var6);
            long var7 = System.nanoTime();
            long var9 = UuUVuuUu(var2);
            if (var9 <= 0L) {
               return null;
            }

            var11 = new NuvUnNnV.NVnVnNnN(var9, var7);
         }

         return var11;
      } catch (Throwable var14) {
         return null;
      }
   }

   private static long UuUVuuUu(byte[] var0) {
      long var1 = (var0[40] & 255L) << 24 | (var0[41] & 255L) << 16 | (var0[42] & 255L) << 8 | var0[43] & 255L;
      long var3 = (var0[44] & 255L) << 24 | (var0[45] & 255L) << 16 | (var0[46] & 255L) << 8 | var0[47] & 255L;
      long var5 = var1 - 2208988800L;
      long var7 = var5 * 1000L + var3 * 1000L / 4294967296L;
      return var7 > 0L ? var7 : 0L;
   }

   record NVnVnNnN(long epochMillis, long nanoTime) {
   }
}
