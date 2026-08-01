package ru.metaculture.protection;

public final class O0000000000OO {
   private static final long O00000000 = 300L;
   private static final long O000000000 = Long.getLong("wild.guard.stateSaveIntervalSeconds", 60L);
   private static volatile long O0000000000;

   private O0000000000OO() {
   }

   public static void O00000000(long l) {
      O0000000000O00 var2 = O0000000000O0O.O00000000();
      if (var2.O0000000000 <= 0L || l + 300L >= var2.O0000000000) {
         if (l > var2.O0000000000 && l - Math.max(var2.O0000000000, O0000000000) >= O000000000) {
            var2.O0000000000 = l;
            var2.O000000000 = "wild-1.21.8-1783538716222";
            O0000000000O0O.O00000000(var2);
            O0000000000 = l;
         }
      }
   }
}
