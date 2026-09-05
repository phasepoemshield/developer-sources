package ru.metaculture.protection;

public final class nNVUVnuUnU {
   private static final long UuUVuuUu = 300L;
   private static final long C00OOC00oO = Long.getLong("wild.guard.stateSaveIntervalSeconds", 60L);
   private static volatile long uUnuvNvvNU;

   private nNVUVnuUnU() {
   }

   public static void UuUVuuUu(long var0) {
      uuVnUuun var2 = vvnuuvnUNvN.UuUVuuUu();
      if (var2.uUnuvNvvNU <= 0L || var0 + 300L >= var2.uUnuvNvvNU) {
         if (var0 > var2.uUnuvNvvNU && var0 - Math.max(var2.uUnuvNvvNU, uUnuvNvvNU) >= C00OOC00oO) {
            var2.uUnuvNvvNU = var0;
            var2.C00OOC00oO = "wild-1.21.8-1787661348375";
            vvnuuvnUNvN.UuUVuuUu(var2);
            uUnuvNvvNU = var0;
         }
      }
   }
}
