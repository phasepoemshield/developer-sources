package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;

public final class nVNvNVnvnVvn {
   private static final String[] UuUVuuUu = new String[]{
      "Velvet",
      "Aurora",
      "Magnetic",
      "Prismatic",
      "Silent",
      "Crystal",
      "Solar",
      "Lunar",
      "Holographic",
      "Obsidian",
      "Radiant",
      "Neon",
      "Frosted",
      "Kinetic",
      "Vivid",
      "Phantom"
   };
   private static final String[] C00OOC00oO = new String[]{
      "Glass", "Halo", "Mica", "Pulse", "Mist", "Bloom", "Signal", "Ribbon", "Veil", "Plate", "Glow", "Drift", "Shell", "Field", "Aura", "Prism"
   };

   private nVNvNVnvnVvn() {
   }

   public static String UuUVuuUu() {
      ThreadLocalRandom var0 = ThreadLocalRandom.current();
      return UuUVuuUu[var0.nextInt(UuUVuuUu.length)] + " " + C00OOC00oO[var0.nextInt(C00OOC00oO.length)];
   }
}
