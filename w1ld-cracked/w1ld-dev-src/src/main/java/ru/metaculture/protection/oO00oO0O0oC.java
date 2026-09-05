package ru.metaculture.protection;

import java.util.Locale;

public enum oO00oO0O0oC {
   AURORA("Aurora", "Полярное сияние"),
   STARDUST("Stardust", "Звездная пыль", "Stardust Field"),
   TWILIGHT_RAYLEIGH("Twilight Rayleigh", "Солнечная буря", "Зодиакальный рассвет", "Серебристые мезосферные облака"),
   QUANTUM_NEBULA("Quantum Nebula", "Туманность"),
   CHRONOS_SINGULARITY("Chronos Singularity", "Галактическая вуаль", "Сверхячейка на горизонте");

   private final String UuUVuuUu;
   private final String[] C00OOC00oO;

   private oO00oO0O0oC(String var3, String... var4) {
      this.UuUVuuUu = var3;
      this.C00OOC00oO = var4;
   }

   public String UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public int C00OOC00oO() {
      return this.ordinal();
   }

   public static String[] uUnuvNvvNU() {
      oO00oO0O0oC[] var0 = values();
      String[] var1 = new String[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = var0[var2].UuUVuuUu;
      }

      return var1;
   }

   public static oO00oO0O0oC UuUVuuUu(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String var1 = C00OOC00oO(var0);

         for (oO00oO0O0oC var5 : values()) {
            if (C00OOC00oO(var5.UuUVuuUu).equals(var1) || C00OOC00oO(var5.name()).equals(var1)) {
               return var5;
            }

            for (String var9 : var5.C00OOC00oO) {
               if (C00OOC00oO(var9).equals(var1)) {
                  return var5;
               }
            }
         }

         return AURORA;
      } else {
         return AURORA;
      }
   }

   private static String C00OOC00oO(String var0) {
      return var0.trim().replace('_', ' ').toLowerCase(Locale.ROOT);
   }
}
