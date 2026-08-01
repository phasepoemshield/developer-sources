package ru.metaculture.protection;

import java.util.Locale;

public enum O0000000OO0OOO {
   NEW("New", -14494738, "E", 10),
   RISKY("Risky", -50340, "I", 20),
   PATCHED("Patched", -20448, "O", 30),
   GRIM("Grim", -15681151, "Q", 40),
   MATRIX("Matrix", -5083905, "W", 50),
   VIP("VIP", -6511697, "T", 60),
   COMBAT("Combat", -45709, "f", 200),
   MOVEMENT("Movement", -10034009, "b", 210),
   VISUALS("Visuals", -8861697, "n", 220),
   PLAYER("Player", -11930, "m", 230),
   MISC("Misc", -3889153, "v", 240);

   private final String O00000000;
   private final int O000000000;
   private final String O0000000000;
   private final int O00000000000;

   private O0000000OO0OOO(String string2, int j, String string3, int k) {
      this.O00000000 = string2;
      this.O000000000 = j;
      this.O0000000000 = string3;
      this.O00000000000 = k;
   }

   public String O00000000() {
      return this.O00000000;
   }

   public int O000000000() {
      return this.O000000000;
   }

   public String O0000000000() {
      return this.O0000000000;
   }

   public int O00000000000() {
      return this.O00000000000;
   }

   public static O0000000OO0OOO O00000000(String string) {
      if (string == null) {
         return null;
      } else {
         String var1 = O000000000(string);
         if (var1.isEmpty()) {
            return null;
         } else {
            for (O0000000OO0OOO var5 : values()) {
               if (O000000000(var5.name()).equals(var1) || O000000000(var5.O00000000).equals(var1)) {
                  return var5;
               }
            }

            return null;
         }
      }
   }

   public static O0000000OO0OOO O00000000(Category o0000000OO0O0O) {
      if (o0000000OO0O0O == null) {
         return null;
      } else {
         return switch (o0000000OO0O0O) {
            case Combat -> COMBAT;
            case Movement -> MOVEMENT;
            case Visuals -> VISUALS;
            case Player -> PLAYER;
            case Misc -> MISC;
         };
      }
   }

   private static String O000000000(String string) {
      String var1 = string == null ? "" : string.trim().toLowerCase(Locale.ROOT);
      if (var1.startsWith("#")) {
         var1 = var1.substring(1);
      }

      return var1.replace("-", "").replace("_", "").replace(" ", "");
   }
}
