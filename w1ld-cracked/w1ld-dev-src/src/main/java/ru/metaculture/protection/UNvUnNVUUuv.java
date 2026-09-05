package ru.metaculture.protection;

public final class UNvUnNVUUuv {
   private final String UuUVuuUu;
   private final int C00OOC00oO;

   private UNvUnNVUUuv(String var1, int var2) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
   }

   public static UNvUnNVUUuv UuUVuuUu() {
      return new UNvUnNVUUuv(UuUVuuUu("wild.party.host", "127.0.0.1"), vVvUvVVuuNvV());
   }

   public static UNvUnNVUUuv UuUVuuUu(String var0, int var1) {
      return var0 != null && !var0.isBlank() && var1 >= 1 && var1 <= 65535 ? new UNvUnNVUUuv(var0.trim(), var1) : UuUVuuUu();
   }

   public String C00OOC00oO() {
      return this.UuUVuuUu;
   }

   public int uUnuvNvvNU() {
      return this.C00OOC00oO;
   }

   @Override
   public String toString() {
      return this.UuUVuuUu + ":" + this.C00OOC00oO;
   }

   private static String UuUVuuUu(String var0, String var1) {
      String var2 = System.getProperty(var0);
      return var2 != null && !var2.isBlank() ? var2.trim() : var1;
   }

   private static int vVvUvVVuuNvV() {
      String var0 = System.getProperty("wild.party.port");
      if (var0 != null && !var0.isBlank()) {
         try {
            int var1 = Integer.parseInt(var0.trim());
            return var1 >= 1 && var1 <= 65535 ? var1 : 7331;
         } catch (NumberFormatException var2) {
            return 7331;
         }
      } else {
         return 7331;
      }
   }
}
