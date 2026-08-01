package ru.metaculture.protection;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public final class O000000OOO0OOO {
   public static final long O00000000 = 4000L;
   private static final int O000000000 = 32;
   private static final int O0000000000 = 10;
   private static final int O00000000000 = 6;
   private static final int O000000000000 = 3;
   private static final int O0000000000000 = 10;
   private static final long O000000000000O = 140L;
   private static final long O00000000000O = 90L;
   private static final double O00000000000O0 = 3.0;
   private static final double O00000000000OO = 1.8;
   private static final double O0000000000O = 0.15;
   private static final long O0000000000O0 = 150L;
   private static final double O0000000000O00 = 2.5;
   private final AtomicLong O0000000000O0O = new AtomicLong();
   private volatile int O0000000000OO = -1;
   private final long[] O0000000000OO0 = new long[32];
   private final long[] O0000000000OOO = new long[10];
   private int O000000000O;
   private int O000000000O0;
   private double O000000000O00 = -1.0;
   private long O000000000O000;
   private long O000000000O00O;
   private int O000000000O0O;
   private int O000000000O0O0;
   private boolean O000000000O0OO;
   private long O000000000OO;

   public synchronized void O00000000() {
      this.O0000000000O0O.set(0L);
      this.O0000000000OO = -1;
      this.O000000000O = 0;
      this.O000000000O0 = 0;
      this.O000000000O00 = -1.0;
      this.O000000000O000 = 0L;
      this.O000000000O00O = 0L;
      this.O000000000O0O = 0;
      this.O000000000O0O0 = 0;
      this.O000000000O0OO = false;
      this.O000000000OO = 0L;
   }

   public synchronized void O000000000() {
      this.O0000000000O0O.set(0L);
      this.O0000000000OO = -1;
      this.O000000000O = 0;
      this.O000000000O0 = 0;
      this.O000000000O000 = 0L;
      this.O000000000O00O = 0L;
      this.O000000000O0O = 0;
      this.O000000000O0O0 = 0;
      this.O000000000O0OO = false;
      this.O000000000OO = 0L;
   }

   public void O0000000000() {
      this.O0000000000O0O.set(0L);
      this.O0000000000OO = -1;
   }

   public void O00000000(int i) {
      if (this.O0000000000O0O.get() == 0L) {
         this.O0000000000OO = i;
         this.O0000000000O0O.compareAndSet(0L, System.currentTimeMillis());
      }
   }

   public void O000000000(int i) {
      if (i > 0) {
         this.O0000000000O0();
      }
   }

   public void O0000000000(int i) {
      if (i > 0 && i == this.O0000000000OO) {
         this.O0000000000O0();
      }
   }

   public void O00000000000(int i) {
      if (i > 0) {
         this.O0000000000O0();
      }
   }

   public void O00000000000() {
      long var1 = this.O0000000000O0O.get();
      if (var1 != 0L) {
         if (System.currentTimeMillis() - var1 >= 4000L) {
            if (this.O0000000000O0O.compareAndSet(var1, 0L)) {
               this.O0000000000OO = -1;
               this.O00000000(4000L, true);
            }
         }
      }
   }

   private void O0000000000O0() {
      long var1 = this.O0000000000O0O.get();
      if (var1 != 0L) {
         if (this.O0000000000O0O.compareAndSet(var1, 0L)) {
            this.O0000000000OO = -1;
            this.O00000000(Math.max(1L, System.currentTimeMillis() - var1), false);
         }
      }
   }

   private synchronized void O00000000(long l, boolean bl) {
      this.O0000000000OO0[this.O000000000O0] = l;
      this.O000000000O0 = (this.O000000000O0 + 1) % 32;
      if (this.O000000000O < 32) {
         this.O000000000O++;
      }

      this.O000000000O000 = l;
      this.O000000000O0O = bl ? this.O000000000O0O + 1 : 0;
      if (!bl && !this.O000000000O0OO && this.O000000000O0O0 == 0) {
         if (this.O000000000O00 < 0.0) {
            this.O000000000O00 = l;
         } else if (l <= Math.max(150.0, this.O000000000O00 * 2.5)) {
            this.O000000000O00 = this.O000000000O00 * 0.85 + l * 0.15;
         }
      }

      this.O000000000O00O = this.O0000000000O00();
      this.O0000000000O0O();
   }

   private long O0000000000O00() {
      int var1 = Math.min(10, this.O000000000O);

      for (int var2 = 0; var2 < var1; var2++) {
         this.O0000000000OOO[var2] = this.O0000000000OO0[(this.O000000000O0 - 1 - var2 + 64) % 32];
      }

      Arrays.sort(this.O0000000000OOO, 0, var1);
      return this.O0000000000OOO[var1 / 2];
   }

   private void O0000000000O0O() {
      if (!(this.O000000000O00 < 0.0) && this.O000000000O >= 6) {
         long var1 = Math.max(140L, (long)(this.O000000000O00 * 3.0));
         long var3 = Math.max(90L, (long)(this.O000000000O00 * 1.8));
         if (this.O000000000O00O >= var1) {
            this.O000000000O0O0++;
         } else if (this.O000000000O00O <= var3) {
            this.O000000000O0O0 = 0;
         }

         if (!this.O000000000O0OO) {
            if (this.O000000000O0O0 >= 10 || this.O000000000O0O >= 3) {
               this.O000000000O0OO = true;
               this.O000000000OO = System.currentTimeMillis();
            }
         } else if (this.O000000000O00O <= var3 && this.O000000000O0O == 0) {
            this.O000000000O0OO = false;
            this.O000000000O0O0 = 0;
            this.O000000000OO = 0L;
         }
      }
   }

   public synchronized boolean O000000000000() {
      return this.O000000000O0OO;
   }

   public synchronized long O0000000000000() {
      return this.O000000000O0OO ? System.currentTimeMillis() - this.O000000000OO : 0L;
   }

   public synchronized long O000000000000O() {
      return this.O000000000O00O;
   }

   public synchronized long O00000000000O() {
      return this.O000000000O00 < 0.0 ? 0L : Math.round(this.O000000000O00);
   }

   public synchronized long O00000000000O0() {
      return this.O000000000O000;
   }

   public synchronized int O00000000000OO() {
      return this.O000000000O0O;
   }

   public synchronized int O0000000000O() {
      return this.O000000000O;
   }
}
