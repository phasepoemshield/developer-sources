package ru.metaculture.protection;

import java.util.Locale;

public enum O00000O0OO00OO {
   AURORA("Aurora", "Полярное сияние"),
   STARDUST("Stardust", "Звездная пыль", "Stardust Field"),
   TWILIGHT_RAYLEIGH("Twilight Rayleigh", "Солнечная буря", "Зодиакальный рассвет", "Серебристые мезосферные облака"),
   QUANTUM_NEBULA("Quantum Nebula", "Туманность"),
   CHRONOS_SINGULARITY("Chronos Singularity", "Галактическая вуаль", "Сверхячейка на горизонте");

   private final String O00000000;
   private final String[] O000000000;

   private O00000O0OO00OO(String string2, String... strings) {
      this.O00000000 = string2;
      this.O000000000 = strings;
   }

   public String O00000000() {
      return this.O00000000;
   }

   public int O000000000() {
      return this.ordinal();
   }

   public static String[] O0000000000() {
      O00000O0OO00OO[] var0 = values();
      String[] var1 = new String[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = var0[var2].O00000000;
      }

      return var1;
   }

   public static O00000O0OO00OO O00000000(String string) {
      if (string != null && !string.isBlank()) {
         String var1 = O000000000(string);

         for (O00000O0OO00OO var5 : values()) {
            if (O000000000(var5.O00000000).equals(var1) || O000000000(var5.name()).equals(var1)) {
               return var5;
            }

            for (String var9 : var5.O000000000) {
               if (O000000000(var9).equals(var1)) {
                  return var5;
               }
            }
         }

         return AURORA;
      } else {
         return AURORA;
      }
   }

   private static String O000000000(String string) {
      return string.trim().replace('_', ' ').toLowerCase(Locale.ROOT);
   }
}
