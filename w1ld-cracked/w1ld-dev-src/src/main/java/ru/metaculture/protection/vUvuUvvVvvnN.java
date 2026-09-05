package ru.metaculture.protection;

import java.util.concurrent.TimeUnit;

public final class vUvuUvvVvvnN {
   private static final long UuUVuuUu = Long.getLong("wild.guard.checkIntervalMs", 1000L);
   private static final long C00OOC00oO = Long.getLong("wild.guard.localExpiryGraceMs", TimeUnit.HOURS.toMillis(24L));
   private static volatile boolean uUnuvNvvNU;
   private static volatile String vVvUvVVuuNvV;
   private static final Object uNNnnnuuuN = new Object();
   private static volatile Thread nuUnNvnuUu;

   private vUvuUvvVvvnN() {
   }

   public static void UuUVuuUu() {
      if (nvUVNnuu()) {
         vNUvnnVnUvu();
         if (uUnuvNvvNU) {
            throw new nvUnvV();
         }
      }
   }

   public static boolean C00OOC00oO() {
      try {
         UuUVuuUu();
         return true;
      } catch (nvUnvV var1) {
         throw VUUnVnVNNU.UuUVuuUu(var1);
      }
   }

   public static void UuUVuuUu(String var0) {
      if (UuUVuuUu(NuvUnNnV.C00OOC00oO())) {
         C00OOC00oO(var0);
      }
   }

   private static void C00OOC00oO(String var0) {
      uUnuvNvvNU = true;
      vVvUvVVuuNvV = var0 != null && !var0.isBlank()
         ? var0
         : "Crashpad_Handler: Device loss detected. Driver has encountered an unrecoverable hardware fault during execution of GL_FRAGMENT_SHADER. GL_CONTEXT_LOST (0x0507).";
      throw new nvUnvV();
   }

   public static String uUnuvNvvNU() {
      return vVvUvVVuuNvV;
   }

   private static void vVvUvVVuuNvV() {
      synchronized (uNNnnnuuuN) {
         if (nuUnNvnuUu == null || !nuUnNvnuUu.isAlive()) {
            Thread var1 = new Thread(vUvuUvvVvvnN::uNNnnnuuuN, "WildAccessGuard");
            var1.setDaemon(true);
            var1.setPriority(1);
            nuUnNvnuUu = var1;
            var1.start();
         }
      }
   }

   private static void uNNnnnuuuN() {
      try {
         nuUnNvnuUu();
      } catch (Throwable var2) {
      }

      for (; !uUnuvNvvNU; nuUnNvnuUu()) {
         try {
            Thread.sleep(UuUVuuUu);
         } catch (InterruptedException var1) {
            Thread.currentThread().interrupt();
            return;
         }
      }
   }

   private static void nuUnNvnuUu() {
      if (nvUVNnuu()) {
         try {
            VVuuUN();
         } catch (Throwable var1) {
         }
      }
   }

   private static void VVuuUN() {
      if (nvUVNnuu()) {
         uunvUUVnuNn.vVvUvVVuuNvV();
         long var0 = NuvUnNnV.UuUVuuUu();
         boolean var2 = UuUVuuUu(var0);
         if (var2) {
            VvNUnuUUuN.UuUVuuUu();
            uVUuuVnNVU();
         }

         if (!var2 && uunvUUVnuNn.C00OOC00oO()) {
            uunvUUVnuNn.uUnuvNvvNU();
         }

         nNVUVnuUnU.UuUVuuUu(var0 / 1000L);
      }
   }

   private static void vNUvnnVnUvu() {
      if (!uUnuvNvvNU && vuuuNvNuv()) {
         long var0 = NuvUnNnV.C00OOC00oO();
         if (UuUVuuUu(var0) && (NuvUnNnV.vVvUvVVuuNvV() || var0 - 1788525348375L >= C00OOC00oO)) {
            uVUuuVnNVU();
         }
      }
   }

   private static boolean UuUVuuUu(long var0) {
      return vuuuNvNuv() && var0 >= 1788525348375L;
   }

   private static void uVUuuVnNVU() {
      C00OOC00oO("Unhandled exception at 0x00007FFAC32155B2 (nvoglv64.dll) in App.exe: 0xC0000005: Access violation reading location 0x0000000000000348.");
   }

   private static boolean vuuuNvNuv() {
      return nvUVNnuu();
   }

   private static boolean nvUVNnuu() {
      if (Boolean.getBoolean("wild.guard.enforce")) {
         return true;
      } else {
         try {
            String var0 = String.valueOf(vUvuUvvVvvnN.class.getProtectionDomain().getCodeSource().getLocation());
            return var0.toLowerCase().endsWith(".jar");
         } catch (Throwable var1) {
            return true;
         }
      }
   }

   static {
      vVvUvVVuuNvV();
   }
}
