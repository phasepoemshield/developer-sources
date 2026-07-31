package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;

public final class O00000OOOOO0 {
   private static final String[] O00000000 = new String[]{
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
   private static final String[] O000000000 = new String[]{
      "Glass", "Halo", "Mica", "Pulse", "Mist", "Bloom", "Signal", "Ribbon", "Veil", "Plate", "Glow", "Drift", "Shell", "Field", "Aura", "Prism"
   };

   private O00000OOOOO0() {
   }

   public static String O00000000() {
      ThreadLocalRandom var0 = ThreadLocalRandom.current();
      return O00000000[var0.nextInt(O00000000.length)] + " " + O000000000[var0.nextInt(O000000000.length)];
   }
}
