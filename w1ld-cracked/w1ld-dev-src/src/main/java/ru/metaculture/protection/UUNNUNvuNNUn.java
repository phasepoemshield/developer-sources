package ru.metaculture.protection;

public final class UUNNUNvuNNUn {
   public static final int UuUVuuUu = 512000;
   public static final int C00OOC00oO = 128;
   public static final int uUnuvNvvNU = 65535;
   private static final int vVvUvVVuuNvV = 3600000;
   private static final long uNNnnnuuuN = System.nanoTime();

   private UUNNUNvuNNUn() {
   }

   public static int UuUVuuUu() {
      return (int)((System.nanoTime() - uNNnnnuuuN) / 1000000L);
   }

   public static float C00OOC00oO() {
      return Math.floorMod(UuUVuuUu(), 3600000) * 0.001F;
   }

   public static float uUnuvNvvNU() {
      return Math.floorMod(UuUVuuUu(), 512000) * 0.001F;
   }

   public static int UuUVuuUu(int var0) {
      int var1 = Math.floorMod(var0, 512000);
      int var2 = (int)(var1 * 128L / 1000L);
      return var2 >= 65535 ? 65534 : var2;
   }
}
