package ru.metaculture.protection;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public final class nUNuNuUUuUVU {
   public static final long UuUVuuUu = 4000L;
   private static final int C00OOC00oO = 32;
   private static final int uUnuvNvvNU = 10;
   private static final int vVvUvVVuuNvV = 6;
   private static final int uNNnnnuuuN = 3;
   private static final int nuUnNvnuUu = 10;
   private static final long VVuuUN = 140L;
   private static final long vNUvnnVnUvu = 90L;
   private static final double uVUuuVnNVU = 3.0;
   private static final double vuuuNvNuv = 1.8;
   private static final double nvUVNnuu = 0.15;
   private static final long UuuNnUvUuv = 150L;
   private static final double nUUVuvU = 2.5;
   private final AtomicLong UnUNVVVNuv = new AtomicLong();
   private volatile int vNVuvnUUnuUn = -1;
   private final long[] UvnvNVnnnnNU = new long[32];
   private final long[] uVUVnuvnuVuv = new long[10];
   private int NVNnnvnuunNv;
   private int uVunuUNVVUUV;
   private double UNnVVNvvnVvU = -1.0;
   private long uNnUnnuNUnNu;
   private long NnUuNNU;
   private int nNvNUVU;
   private int UnUNuUU;
   private boolean uUVuVvuNUvnu;
   private long UvUvUNuvNU;

   public synchronized void UuUVuuUu() {
      this.UnUNVVVNuv.set(0L);
      this.vNVuvnUUnuUn = -1;
      this.NVNnnvnuunNv = 0;
      this.uVunuUNVVUUV = 0;
      this.UNnVVNvvnVvU = -1.0;
      this.uNnUnnuNUnNu = 0L;
      this.NnUuNNU = 0L;
      this.nNvNUVU = 0;
      this.UnUNuUU = 0;
      this.uUVuVvuNUvnu = false;
      this.UvUvUNuvNU = 0L;
   }

   public synchronized void C00OOC00oO() {
      this.UnUNVVVNuv.set(0L);
      this.vNVuvnUUnuUn = -1;
      this.NVNnnvnuunNv = 0;
      this.uVunuUNVVUUV = 0;
      this.uNnUnnuNUnNu = 0L;
      this.NnUuNNU = 0L;
      this.nNvNUVU = 0;
      this.UnUNuUU = 0;
      this.uUVuVvuNUvnu = false;
      this.UvUvUNuvNU = 0L;
   }

   public void uUnuvNvvNU() {
      this.UnUNVVVNuv.set(0L);
      this.vNVuvnUUnuUn = -1;
   }

   public void UuUVuuUu(int var1) {
      if (this.UnUNVVVNuv.get() == 0L) {
         this.vNVuvnUUnuUn = var1;
         this.UnUNVVVNuv.compareAndSet(0L, System.currentTimeMillis());
      }
   }

   public void C00OOC00oO(int var1) {
      if (var1 > 0) {
         this.UuuNnUvUuv();
      }
   }

   public void uUnuvNvvNU(int var1) {
      if (var1 > 0 && var1 == this.vNVuvnUUnuUn) {
         this.UuuNnUvUuv();
      }
   }

   public void vVvUvVVuuNvV(int var1) {
      if (var1 > 0) {
         this.UuuNnUvUuv();
      }
   }

   public void vVvUvVVuuNvV() {
      long var1 = this.UnUNVVVNuv.get();
      if (var1 != 0L) {
         if (System.currentTimeMillis() - var1 >= 4000L) {
            if (this.UnUNVVVNuv.compareAndSet(var1, 0L)) {
               this.vNVuvnUUnuUn = -1;
               this.UuUVuuUu(4000L, true);
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      long var1 = this.UnUNVVVNuv.get();
      if (var1 != 0L) {
         if (this.UnUNVVVNuv.compareAndSet(var1, 0L)) {
            this.vNVuvnUUnuUn = -1;
            this.UuUVuuUu(Math.max(1L, System.currentTimeMillis() - var1), false);
         }
      }
   }

   private synchronized void UuUVuuUu(long var1, boolean var3) {
      this.UvnvNVnnnnNU[this.uVunuUNVVUUV] = var1;
      this.uVunuUNVVUUV = (this.uVunuUNVVUUV + 1) % 32;
      if (this.NVNnnvnuunNv < 32) {
         this.NVNnnvnuunNv++;
      }

      this.uNnUnnuNUnNu = var1;
      this.nNvNUVU = var3 ? this.nNvNUVU + 1 : 0;
      if (!var3 && !this.uUVuVvuNUvnu && this.UnUNuUU == 0) {
         if (this.UNnVVNvvnVvU < 0.0) {
            this.UNnVVNvvnVvU = var1;
         } else if (var1 <= Math.max(150.0, this.UNnVVNvvnVvU * 2.5)) {
            this.UNnVVNvvnVvU = this.UNnVVNvvnVvU * 0.85 + var1 * 0.15;
         }
      }

      this.NnUuNNU = this.nUUVuvU();
      this.UnUNVVVNuv();
   }

   private long nUUVuvU() {
      int var1 = Math.min(10, this.NVNnnvnuunNv);

      for (int var2 = 0; var2 < var1; var2++) {
         this.uVUVnuvnuVuv[var2] = this.UvnvNVnnnnNU[(this.uVunuUNVVUUV - 1 - var2 + 64) % 32];
      }

      Arrays.sort(this.uVUVnuvnuVuv, 0, var1);
      return this.uVUVnuvnuVuv[var1 / 2];
   }

   private void UnUNVVVNuv() {
      if (!(this.UNnVVNvvnVvU < 0.0) && this.NVNnnvnuunNv >= 6) {
         long var1 = Math.max(140L, (long)(this.UNnVVNvvnVvU * 3.0));
         long var3 = Math.max(90L, (long)(this.UNnVVNvvnVvU * 1.8));
         if (this.NnUuNNU >= var1) {
            this.UnUNuUU++;
         } else if (this.NnUuNNU <= var3) {
            this.UnUNuUU = 0;
         }

         if (!this.uUVuVvuNUvnu) {
            if (this.UnUNuUU >= 10 || this.nNvNUVU >= 3) {
               this.uUVuVvuNUvnu = true;
               this.UvUvUNuvNU = System.currentTimeMillis();
            }
         } else if (this.NnUuNNU <= var3 && this.nNvNUVU == 0) {
            this.uUVuVvuNUvnu = false;
            this.UnUNuUU = 0;
            this.UvUvUNuvNU = 0L;
         }
      }
   }

   public synchronized boolean uNNnnnuuuN() {
      return this.uUVuVvuNUvnu;
   }

   public synchronized long nuUnNvnuUu() {
      return this.uUVuVvuNUvnu ? System.currentTimeMillis() - this.UvUvUNuvNU : 0L;
   }

   public synchronized long VVuuUN() {
      return this.NnUuNNU;
   }

   public synchronized long vNUvnnVnUvu() {
      return this.UNnVVNvvnVvU < 0.0 ? 0L : Math.round(this.UNnVVNvvnVvU);
   }

   public synchronized long uVUuuVnNVU() {
      return this.uNnUnnuNUnNu;
   }

   public synchronized int vuuuNvNuv() {
      return this.nNvNUVU;
   }

   public synchronized int nvUVNnuu() {
      return this.NVNnnvnuunNv;
   }
}
