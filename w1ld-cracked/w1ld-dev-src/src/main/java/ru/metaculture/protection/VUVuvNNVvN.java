package ru.metaculture.protection;

public final class VUVuvNNVvN {
   private static final VUVuvNNVvN UuUVuuUu = new VUVuvNNVvN();
   private final Object C00OOC00oO = new Object();
   private long uUnuvNvvNU = 0L;
   private long vVvUvVVuuNvV = 0L;
   private int uNNnnnuuuN = 0;
   private int nuUnNvnuUu = 0;
   private int VVuuUN = 0;
   private int vNUvnnVnUvu = 0;

   private VUVuvNNVvN() {
   }

   public static VUVuvNNVvN UuUVuuUu() {
      return UuUVuuUu;
   }

   public void UuUVuuUu(int var1, int var2) {
      if (var1 > 0 && var2 > 0) {
         long var3 = System.nanoTime();
         synchronized (this.C00OOC00oO) {
            this.uUnuvNvvNU = var3;
            this.uNNnnnuuuN = 0;
            this.nuUnNvnuUu = 0;
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(int var1) {
      if (var1 < 0) {
         var1 = 0;
      }

      Object var2 = this.C00OOC00oO;
      synchronized (this.C00OOC00oO){} // $VF: monitorenter 

      try {
         this.uNNnnnuuuN++;
         this.nuUnNvnuUu += var1;
         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public void C00OOC00oO() {
      long var1 = System.nanoTime();
      synchronized (this.C00OOC00oO) {
         if (this.uUnuvNvvNU <= 0L) {
            this.uUnuvNvvNU = var1;
            this.vVvUvVVuuNvV = 0L;
            this.VVuuUN = this.uNNnnnuuuN;
            this.vNUvnnVnUvu = this.nuUnNvnuUu;
            this.uNNnnnuuuN = 0;
            this.nuUnNvnuUu = 0;
         } else {
            this.vVvUvVVuuNvV = Math.max(0L, var1 - this.uUnuvNvvNU);
            this.VVuuUN = this.uNNnnnuuuN;
            this.vNUvnnVnUvu = this.nuUnNvnuUu;
            this.uUnuvNvvNU = var1;
            this.uNNnnnuuuN = 0;
            this.nuUnNvnuUu = 0;
         }
      }
   }

   public VUVuvNNVvN.NVnVnNnN uUnuvNvvNU() {
      synchronized (this.C00OOC00oO) {
         return new VUVuvNNVvN.NVnVnNnN(this.vVvUvVVuuNvV, this.VVuuUN, this.vNUvnnVnUvu);
      }
   }

   public record NVnVnNnN(long frameDurationNanos, int drawCalls, int triangles) {
      public NVnVnNnN(long frameDurationNanos, int drawCalls, int triangles) {
         frameDurationNanos = Math.max(0L, frameDurationNanos);
         drawCalls = Math.max(0, drawCalls);
         triangles = Math.max(0, triangles);
         this.frameDurationNanos = frameDurationNanos;
         this.drawCalls = drawCalls;
         this.triangles = triangles;
      }

      public double frameTimeMillis() {
         return this.frameDurationNanos / 1000000.0;
      }

      public double framesPerSecond() {
         return this.frameDurationNanos > 0L ? 1.0E9 / this.frameDurationNanos : 0.0;
      }
   }
}
