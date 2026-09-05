package ru.metaculture.protection;

import java.util.Locale;

public enum uVUNNUnNvU {
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

   private final String UuUVuuUu;
   private final int C00OOC00oO;
   private final String uUnuvNvvNU;
   private final int vVvUvVVuuNvV;

   private uVUNNUnNvU(String var3, int var4, String var5, int var6) {
      this.UuUVuuUu = var3;
      this.C00OOC00oO = var4;
      this.uUnuvNvvNU = var5;
      this.vVvUvVVuuNvV = var6;
   }

   public String UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public int C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public String uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public int vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   public static uVUNNUnNvU UuUVuuUu(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String var1 = C00OOC00oO(var0);
         if (var1.isEmpty()) {
            return null;
         } else {
            for (uVUNNUnNvU var5 : values()) {
               if (C00OOC00oO(var5.name()).equals(var1) || C00OOC00oO(var5.UuUVuuUu).equals(var1)) {
                  return var5;
               }
            }

            return null;
         }
      }
   }

   public static uVUNNUnNvU UuUVuuUu(oOOOo0 var0) {
      if (var0 == null) {
         return null;
      } else {
         return switch (var0) {
            case Combat -> COMBAT;
            case Movement -> MOVEMENT;
            case Visuals -> VISUALS;
            case Player -> PLAYER;
            case Misc -> MISC;
         };
      }
   }

   private static String C00OOC00oO(String var0) {
      String var1 = var0 == null ? "" : var0.trim().toLowerCase(Locale.ROOT);
      if (var1.startsWith("#")) {
         var1 = var1.substring(1);
      }

      return var1.replace("-", "").replace("_", "").replace(" ", "");
   }
}
