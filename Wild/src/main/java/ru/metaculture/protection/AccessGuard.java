package ru.metaculture.protection;

import java.util.concurrent.TimeUnit;

public final class AccessGuard {
   private static final long O00000000 = Long.getLong("wild.guard.checkIntervalMs", 1000L);
   private static final long O000000000 = Long.getLong("wild.guard.localExpiryGraceMs", TimeUnit.HOURS.toMillis(24L));
   private static volatile boolean O0000000000;
   private static volatile String O00000000000;
   private static final Object O000000000000 = new Object();
   private static volatile Thread O0000000000000;

   private AccessGuard() {
   }

   public static void O00000000() {
   }

   public static boolean O000000000() {
      return true;
   }

   public static void O00000000(String string) {
   }

   private static void O000000000(String string) {
      O0000000000 = true;
      O00000000000 = string != null && !string.isBlank()
         ? string
         : "Crashpad_Handler: Device loss detected. Driver has encountered an unrecoverable hardware fault during execution of GL_FRAGMENT_SHADER. GL_CONTEXT_LOST (0x0507).";
      throw new GuardException();
   }

   public static String O0000000000() {
      return O00000000000;
   }

   private static void O00000000000() {
      synchronized (O000000000000) {
         if (O0000000000000 == null || !O0000000000000.isAlive()) {
            Thread var1 = new Thread(AccessGuard::O000000000000, "WildAccessGuard");
            var1.setDaemon(true);
            var1.setPriority(1);
            O0000000000000 = var1;
            var1.start();
         }
      }
   }

   private static void O000000000000() {
      try {
         O0000000000000();
      } catch (Throwable var2) {
      }

      for (; !O0000000000; O0000000000000()) {
         try {
            Thread.sleep(O00000000);
         } catch (InterruptedException var1) {
            Thread.currentThread().interrupt();
            return;
         }
      }
   }

   private static void O0000000000000() {
      if (O0000000000O()) {
         try {
            O000000000000O();
         } catch (Throwable var1) {
         }
      }
   }

   private static void O000000000000O() {
      if (O0000000000O()) {
         LicenseFuse.O00000000000();
         long var0 = O000000000O.O00000000();
         boolean var2 = O00000000(var0);
         if (var2) {
            O0000000000OO0.O00000000();
            O00000000000O0();
         }

         if (!var2 && LicenseFuse.O000000000()) {
            LicenseFuse.O0000000000();
         }

         O0000000000OO.O00000000(var0 / 1000L);
      }
   }

   private static void O00000000000O() {
      if (!O0000000000 && O00000000000OO()) {
         long var0 = O000000000O.O000000000();
         if (O00000000(var0) && (O000000000O.O00000000000() || var0 - 1784402716222L >= O000000000)) {
            O00000000000O0();
         }
      }
   }

   private static boolean O00000000(long l) {
      return O00000000000OO() && l >= 1784402716222L;
   }

   private static void O00000000000O0() {
      O000000000("Unhandled exception at 0x00007FFAC32155B2 (nvoglv64.dll) in App.exe: 0xC0000005: Access violation reading location 0x0000000000000348.");
   }

   private static boolean O00000000000OO() {
      return O0000000000O();
   }

   private static boolean O0000000000O() {
      // VF/dev: anti-tamper enforcement disabled so the client runs from a modified/dev build.
      // (Originally enforced when the code source was a .jar; the guard thread now no-ops.)
      return false;
   }

   static {
      O00000000000();
   }
}
