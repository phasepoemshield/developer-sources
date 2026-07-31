package ru.metaculture.protection;

public final class ProtectionHandler {
   private ProtectionHandler() {
   }

   public static void O00000000() {
      try {
         AccessGuard.O00000000();
      } catch (GuardException var1) {
         throw O00000000(var1);
      }
   }

   public static void O00000000(Runnable runnable) {
      try {
         runnable.run();
      } catch (GuardException var2) {
         throw O00000000(var2);
      }
   }

   public static RuntimeException O00000000(GuardException o000000000000) {
      Runtime.getRuntime();
      boolean var10001 = false;
      return o000000000000;
   }
}
