package ru.metaculture.protection;

public final class O0000O00OO0O {
   private static final O0000O00OO0O O00000000 = new O0000O00OO0O();
   private final Object O000000000 = new Object();
   private long O0000000000 = 0L;
   private long O00000000000 = 0L;
   private int O000000000000 = 0;
   private int O0000000000000 = 0;
   private int O000000000000O = 0;
   private int O00000000000O = 0;

   private O0000O00OO0O() {
   }

   public static O0000O00OO0O O00000000() {
      return O00000000;
   }

   public void O00000000(int i, int j) {
      if (i > 0 && j > 0) {
         long var3 = System.nanoTime();
         synchronized (this.O000000000) {
            this.O0000000000 = var3;
            this.O000000000000 = 0;
            this.O0000000000000 = 0;
         }
      }
   }

   public void O00000000(int i) {
      if (i < 0) {
         i = 0;
      }

      synchronized (this.O000000000) {
         this.O000000000000++;
         this.O0000000000000 += i;
      }
   }

   public void O000000000() {
      long var1 = System.nanoTime();
      synchronized (this.O000000000) {
         if (this.O0000000000 <= 0L) {
            this.O0000000000 = var1;
            this.O00000000000 = 0L;
            this.O000000000000O = this.O000000000000;
            this.O00000000000O = this.O0000000000000;
            this.O000000000000 = 0;
            this.O0000000000000 = 0;
         } else {
            this.O00000000000 = Math.max(0L, var1 - this.O0000000000);
            this.O000000000000O = this.O000000000000;
            this.O00000000000O = this.O0000000000000;
            this.O0000000000 = var1;
            this.O000000000000 = 0;
            this.O0000000000000 = 0;
         }
      }
   }

   public O0000O00OO0O.W379 O0000000000() {
      synchronized (this.O000000000) {
         return new O0000O00OO0O.W379(this.O00000000000, this.O000000000000O, this.O00000000000O);
      }
   }

   public record W379(long frameDurationNanos, int drawCalls, int triangles) {
      public W379(long frameDurationNanos, int drawCalls, int triangles) {
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
