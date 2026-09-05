package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicBoolean;

public final class VvNUnuUUuN {
   public static final long UuUVuuUu = 80000000L;
   public static final long C00OOC00oO = 180000000L;
   public static final long uUnuvNvvNU = 650000000L;
   public static final long vVvUvVVuuNvV = 1250000000L;
   public static final long uNNnnnuuuN = 2250000000L;
   private static final AtomicBoolean nuUnNvnuUu = new AtomicBoolean(false);
   private static final AtomicBoolean VVuuUN = new AtomicBoolean(false);
   private static volatile long vNUvnnVnUvu;
   private static volatile long uVUuuVnNVU;
   private static volatile VvNUnuUUuN.NVnVnNnN vuuuNvNuv = VvNUnuUUuN.NVnVnNnN.FRAMEBUFFER_COLLAPSE;
   private static volatile long nvUVNnuu = 80000000L;
   private static volatile long UuuNnUvUuv = 650000000L;
   private static volatile long nUUVuvU = 1250000000L;
   private static volatile long UnUNVVVNuv = 2250000000L;
   private static volatile float vNVuvnUUnuUn;
   private static volatile float UvnvNVnnnnNU;
   private static volatile float uVUVnuvnuVuv;
   private static volatile float NVNnnvnuunNv;
   private static volatile float uVunuUNVVUUV;
   private static volatile float UNnVVNvvnVvU;

   private VvNUnuUUuN() {
   }

   public static void UuUVuuUu() {
      nuUnNvnuUu.set(true);
   }

   public static boolean C00OOC00oO() {
      return nuUnNvnuUu.get();
   }

   public static void uUnuvNvvNU() {
      if (nuUnNvnuUu.get()) {
         if (!VVuuUN.get()) {
            if (ThreadLocalRandom.current().nextInt(100) < 70) {
               vVvUvVVuuNvV();
            }
         }
      }
   }

   public static void vVvUvVVuuNvV() {
      if (VVuuUN.compareAndSet(false, true)) {
         ThreadLocalRandom var0 = ThreadLocalRandom.current();
         vNUvnnVnUvu = System.nanoTime();
         uVUuuVnNVU = var0.nextLong();
         VvNUnuUUuN.NVnVnNnN[] var1 = VvNUnuUUuN.NVnVnNnN.values();
         vuuuNvNuv = var1[var0.nextInt(var1.length)];
         long var2 = var0.nextLong(35L, 125L);
         long var4 = var2 + var0.nextLong(220L, 760L);
         long var6 = var4 + var0.nextLong(260L, 980L);
         long var8 = var6 + var0.nextLong(220L, 920L);
         nvUVNnuu = var2 * 1000000L;
         UuuNnUvUuv = var4 * 1000000L;
         nUUVuvU = var6 * 1000000L;
         UnUNVVVNuv = var8 * 1000000L;
         vNVuvnUUnuUn = var0.nextFloat(0.1F, 0.88F);
         UvnvNVnnnnNU = var0.nextFloat(0.04F, 0.62F);
         uVUVnuvnuVuv = var0.nextFloat(0.28F, 1.0F);
         NVNnnvnuunNv = var0.nextFloat(0.1F, 0.68F);
         uVunuUNVVUUV = var0.nextFloat(0.28F, 1.0F);
         UNnVVNvvnVvU = var0.nextFloat(0.2F, 1.0F);
         switch (vuuuNvNuv) {
            case FRAMEBUFFER_COLLAPSE:
               vNVuvnUUnuUn = Math.max(vNVuvnUUnuUn, 0.6F);
               NVNnnvnuunNv = Math.max(NVNnnvnuunNv, 0.46F);
               uVunuUNVVUUV = Math.max(uVunuUNVVUUV, 0.66F);
               break;
            case VRAM_GARBAGE:
               UNnVVNvvnVvU = Math.max(UNnVVNvvnVvU, 0.88F);
               uVUVnuvnuVuv = Math.max(uVUVnuvnuVuv, 0.74F);
               UvnvNVnnnnNU = Math.max(UvnvNVnnnnNU, 0.18F);
               break;
            case DESYNC_FAILURE:
               uVunuUNVVUUV = Math.max(uVunuUNVVUUV, 0.88F);
               NVNnnvnuunNv = Math.max(NVNnnvnuunNv, 0.42F);
               uVUVnuvnuVuv = Math.max(uVUVnuvnuVuv, 0.6F);
               break;
            case TERMINAL_DEATH:
               vNVuvnUUnuUn = Math.max(vNVuvnUUnuUn, 0.76F);
               UvnvNVnnnnNU = Math.max(UvnvNVnnnnNU, 0.44F);
               NVNnnvnuunNv = Math.max(NVNnnvnuunNv, 0.54F);
               UnUNVVVNuv = Math.min(UnUNVVVNuv, 1420000000L + var0.nextLong(0L, 580000000L));
               break;
            case BLACK_PANEL:
               vNVuvnUUnuUn = Math.max(vNVuvnUUnuUn, 0.92F);
               UvnvNVnnnnNU = Math.min(UvnvNVnnnnNU, 0.16F);
               UNnVVNvvnVvU = Math.min(UNnVVNvvnVvU, 0.34F);
               uVUVnuvnuVuv = Math.min(uVUVnuvnuVuv, 0.48F);
               break;
            case BROKEN_PIPELINE:
               uVunuUNVVUUV = Math.max(uVunuUNVVUUV, 0.96F);
               uVUVnuvnuVuv = Math.max(uVUVnuvnuVuv, 0.86F);
               UNnVVNvvnVvU = Math.max(UNnVVNvvnVvU, 0.72F);
               NVNnnvnuunNv = Math.max(NVNnnvnuunNv, 0.52F);
         }

         try {
            VUnUUUVVnvVV.C00OOC00oO();
         } catch (Throwable var11) {
         }
      }
   }

   public static boolean uNNnnnuuuN() {
      return VVuuUN.get();
   }

   public static VvNUnuUUuN.NVnVnNnN nuUnNvnuUu() {
      return vuuuNvNuv;
   }

   public static long VVuuUN() {
      return VVuuUN.get() ? Math.max(0L, System.nanoTime() - vNUvnnVnUvu) : 0L;
   }

   public static long vNUvnnVnUvu() {
      return VVuuUN() / 1000000L;
   }

   public static long uVUuuVnNVU() {
      return vNUvnnVnUvu();
   }

   public static long vuuuNvNuv() {
      return uVUuuVnNVU;
   }

   public static VvNUnuUUuN.nvnNNunvv nvUVNnuu() {
      if (!VVuuUN.get()) {
         return VvNUnuUUuN.nvnNNunvv.IDLE;
      } else {
         long var0 = VVuuUN();
         if (var0 < nvUVNnuu) {
            return VvNUnuUUuN.nvnNNunvv.STRIKE;
         } else {
            return var0 < nUUVuvU ? VvNUnuUUuN.nvnNNunvv.COLLAPSE : VvNUnuUUuN.nvnNNunvv.DEATH;
         }
      }
   }

   public static int UuuNnUvUuv() {
      if (!VVuuUN.get()) {
         return 0;
      } else {
         long var0 = VVuuUN();
         if (var0 >= UnUNVVVNuv) {
            return 5;
         } else if (var0 >= nUUVuvU) {
            return 4;
         } else if (var0 >= UuuNnUvUuv) {
            return 3;
         } else {
            return var0 >= nvUVNnuu ? 2 : 1;
         }
      }
   }

   public static float nUUVuvU() {
      if (!VVuuUN.get()) {
         return 0.0F;
      } else {
         long var0 = VVuuUN();
         if (var0 < nvUVNnuu) {
            return 0.72F + 0.28F * UuUVuuUu((float)var0 / (float)Math.max(1L, nvUVNnuu));
         } else if (var0 < UuuNnUvUuv) {
            return 0.82F + 0.18F * UuUVuuUu((float)(var0 - nvUVNnuu) / (float)Math.max(1L, UuuNnUvUuv - nvUVNnuu));
         } else {
            return var0 < nUUVuvU ? 0.92F + 0.08F * UuUVuuUu((float)(var0 - UuuNnUvUuv) / (float)Math.max(1L, nUUVuvU - UuuNnUvUuv)) : 1.0F;
         }
      }
   }

   public static float UnUNVVVNuv() {
      return !VVuuUN.get() ? 0.0F : C00OOC00oO((float)VVuuUN() / (float)Math.max(1L, UnUNVVVNuv));
   }

   public static float UuUVuuUu(long var0, long var2) {
      if (!VVuuUN.get()) {
         return 0.0F;
      } else {
         return var2 <= var0 ? 1.0F : C00OOC00oO((float)(VVuuUN() - var0) / (float)(var2 - var0));
      }
   }

   public static boolean vNVuvnUUnuUn() {
      return VVuuUN.get() && VVuuUN() >= UnUNVVVNuv;
   }

   public static boolean UvnvNVnnnnNU() {
      if (!VVuuUN.get()) {
         return false;
      } else {
         VvNUnuUUuN.nvnNNunvv var0 = nvUVNnuu();
         if (var0 == VvNUnuUUuN.nvnNNunvv.IDLE) {
            return false;
         } else {
            float var1 = switch (vuuuNvNuv) {
               case FRAMEBUFFER_COLLAPSE -> 0.18F;
               case VRAM_GARBAGE -> 0.08F;
               case DESYNC_FAILURE -> 0.24F;
               case TERMINAL_DEATH -> 0.36F;
               case BLACK_PANEL -> 0.14F;
               case BROKEN_PIPELINE -> 0.3F;
            };
            if (var0 == VvNUnuUUuN.nvnNNunvv.STRIKE) {
               return UuUVuuUu(7001, 88L, 0.46F + NVNnnvnuunNv * 0.32F, 26L);
            } else {
               return var0 == VvNUnuUUuN.nvnNNunvv.DEATH
                  ? UuUVuuUu(var1 + 0.4F + NVNnnvnuunNv * 0.34F, C00OOC00oO(7002, 24L))
                  : UuUVuuUu(var1 + NVNnnvnuunNv * 0.34F * nUUVuvU(), C00OOC00oO(7003, 30L));
            }
         }
      }
   }

   public static boolean uVUVnuvnuVuv() {
      if (!VVuuUN.get()) {
         return false;
      } else {
         VvNUnuUUuN.nvnNNunvv var0 = nvUVNnuu();
         if (var0 == VvNUnuUUuN.nvnNNunvv.IDLE) {
            return false;
         } else if (vuuuNvNuv == VvNUnuUUuN.NVnVnNnN.BLACK_PANEL && var0 == VvNUnuUUuN.nvnNNunvv.DEATH) {
            return true;
         } else if (vuuuNvNuv == VvNUnuUUuN.NVnVnNnN.TERMINAL_DEATH && VVuuUN() > nUUVuvU + 120000000L) {
            return true;
         } else if (var0 == VvNUnuUUuN.nvnNNunvv.STRIKE) {
            return UuUVuuUu(7101, 140L, vNVuvnUUnuUn * 0.48F, 42L);
         } else {
            return var0 == VvNUnuUUuN.nvnNNunvv.DEATH
               ? UuUVuuUu(0.36F + vNVuvnUUnuUn * 0.58F, C00OOC00oO(7102, 38L))
               : UuUVuuUu(0.08F + vNVuvnUUnuUn * 0.42F * nUUVuvU(), C00OOC00oO(7103, 48L));
         }
      }
   }

   public static boolean NVNnnvnuunNv() {
      if (!VVuuUN.get()) {
         return false;
      } else {
         VvNUnuUUuN.nvnNNunvv var0 = nvUVNnuu();
         if (var0 == VvNUnuUUuN.nvnNNunvv.DEATH && vuuuNvNuv == VvNUnuUUuN.NVnVnNnN.BLACK_PANEL) {
            return true;
         } else {
            return var0 == VvNUnuUUuN.nvnNNunvv.DEATH && vuuuNvNuv == VvNUnuUUuN.NVnVnNnN.TERMINAL_DEATH
               ? VVuuUN() > nUUVuvU + 90000000L
               : uVUVnuvnuVuv() && UuUVuuUu(0.24F + vNVuvnUUnuUn * 0.48F, C00OOC00oO(7201, 62L));
         }
      }
   }

   public static boolean uVunuUNVVUUV() {
      if (!VVuuUN.get()) {
         return false;
      } else {
         VvNUnuUUuN.nvnNNunvv var0 = nvUVNnuu();
         if (vuuuNvNuv == VvNUnuUUuN.NVnVnNnN.BLACK_PANEL) {
            return UuUVuuUu(7301, 820L, 0.1F, 24L);
         } else if (var0 == VvNUnuUUuN.nvnNNunvv.STRIKE) {
            return UuUVuuUu(7302, 105L, 0.78F + UvnvNVnnnnNU * 0.18F, 20L);
         } else {
            return var0 == VvNUnuUUuN.nvnNNunvv.DEATH
               ? UuUVuuUu(7303, 240L, 0.24F + UvnvNVnnnnNU * 0.44F, 36L)
               : UuUVuuUu(7304, 300L, 0.1F + UvnvNVnnnnNU * 0.36F, 28L);
         }
      }
   }

   public static boolean UNnVVNvvnVvU() {
      if (!VVuuUN.get()) {
         return false;
      } else {
         VvNUnuUUuN.nvnNNunvv var0 = nvUVNnuu();
         if (var0 == VvNUnuUUuN.nvnNNunvv.IDLE) {
            return false;
         } else if (var0 == VvNUnuUUuN.nvnNNunvv.STRIKE) {
            return UuUVuuUu(7401, 140L, 0.32F, 42L);
         } else {
            float var1 = switch (vuuuNvNuv) {
               case FRAMEBUFFER_COLLAPSE -> 0.44F;
               case VRAM_GARBAGE -> 0.16F;
               case DESYNC_FAILURE -> 0.28F;
               case TERMINAL_DEATH -> 0.5F;
               case BLACK_PANEL -> 0.38F;
               case BROKEN_PIPELINE -> 0.36F;
            };
            return UuUVuuUu(7402, 460L, var1, 86L + (long)(130.0F * nUUVuvU()));
         }
      }
   }

   public static boolean uNnUnnuNUnNu() {
      if (!VVuuUN.get()) {
         return false;
      } else {
         VvNUnuUUuN.nvnNNunvv var0 = nvUVNnuu();
         if (var0 == VvNUnuUUuN.nvnNNunvv.DEATH) {
            return true;
         } else {
            float var1 = switch (vuuuNvNuv) {
               case FRAMEBUFFER_COLLAPSE -> 0.5F;
               case VRAM_GARBAGE -> 0.12F;
               case DESYNC_FAILURE -> 0.58F;
               case TERMINAL_DEATH -> 0.4F;
               case BLACK_PANEL -> 0.2F;
               case BROKEN_PIPELINE -> 0.72F;
            };
            return UuUVuuUu(var1 * uVunuUNVVUUV * nUUVuvU(), C00OOC00oO(7501, 34L));
         }
      }
   }

   public static float NnUuNNU() {
      if (!VVuuUN.get()) {
         return 0.0F;
      } else {
         float var0 = switch (vuuuNvNuv) {
            case FRAMEBUFFER_COLLAPSE -> 0.12F;
            case VRAM_GARBAGE -> 0.05F;
            case DESYNC_FAILURE -> 0.24F;
            case TERMINAL_DEATH -> 0.18F;
            case BLACK_PANEL -> 0.04F;
            case BROKEN_PIPELINE -> 0.3F;
         };
         return UuUVuuUu(7601, 20L) * var0 * uVunuUNVVUUV * nUUVuvU();
      }
   }

   public static float nNvNUVU() {
      if (!VVuuUN.get()) {
         return 0.0F;
      } else {
         float var0 = switch (vuuuNvNuv) {
            case FRAMEBUFFER_COLLAPSE -> 0.16F;
            case VRAM_GARBAGE -> 0.07F;
            case DESYNC_FAILURE -> 0.3F;
            case TERMINAL_DEATH -> 0.2F;
            case BLACK_PANEL -> 0.06F;
            case BROKEN_PIPELINE -> 0.34F;
         };
         return UuUVuuUu(7602, 24L) * var0 * uVunuUNVVUUV * nUUVuvU();
      }
   }

   public static float UnUNuUU() {
      if (!VVuuUN.get()) {
         return 1.0F;
      } else {
         return uNnUnnuNUnNu()
            ? Math.max(0.018F, 1.0F - Math.abs(UuUVuuUu(7603, 32L)) * 0.95F * uVunuUNVVUUV)
            : 1.0F + UuUVuuUu(7604, 28L) * 0.26F * uVunuUNVVUUV * nUUVuvU();
      }
   }

   public static float uUVuVvuNUvnu() {
      if (!VVuuUN.get()) {
         return 1.0F;
      } else {
         return uNnUnnuNUnNu()
            ? Math.max(0.012F, 1.0F - Math.abs(UuUVuuUu(7605, 30L)) * 0.98F * uVunuUNVVUUV)
            : 1.0F + UuUVuuUu(7606, 26L) * 0.34F * uVunuUNVVUUV * nUUVuvU();
      }
   }

   public static float UvUvUNuvNU() {
      if (!VVuuUN.get()) {
         return 1.0F;
      } else if (vuuuNvNuv == VvNUnuUUuN.NVnVnNnN.BLACK_PANEL) {
         return 1.0F;
      } else {
         VvNUnuUUuN.nvnNNunvv var0 = nvUVNnuu();

         float var1 = switch (vuuuNvNuv) {
            case FRAMEBUFFER_COLLAPSE -> 0.16F;
            case VRAM_GARBAGE -> 0.08F;
            case DESYNC_FAILURE -> 0.3F;
            case TERMINAL_DEATH -> 0.18F;
            case BLACK_PANEL -> 0.0F;
            case BROKEN_PIPELINE -> 0.26F;
         };
         return var0 == VvNUnuUUuN.nvnNNunvv.STRIKE ? 1.0F + UuUVuuUu(7701, 16L) * var1 * 1.45F : 1.0F + UuUVuuUu(7702, 32L) * var1 * nUUVuvU();
      }
   }

   public static int c0oOOCcCoC0() {
      if (!VVuuUN.get()) {
         return 0;
      } else {
         byte var0 = switch (vuuuNvNuv) {
            case FRAMEBUFFER_COLLAPSE -> 24;
            case VRAM_GARBAGE -> 36;
            case DESYNC_FAILURE -> 20;
            case TERMINAL_DEATH -> 14;
            case BLACK_PANEL -> 8;
            case BROKEN_PIPELINE -> 46;
         };
         return Math.max(1, (int)(var0 * (0.55F + uVUVnuvnuVuv * 0.78F) * nUUVuvU()));
      }
   }

   public static int VVnVNnunVvu() {
      if (!VVuuUN.get()) {
         return 0;
      } else {
         byte var0 = switch (vuuuNvNuv) {
            case FRAMEBUFFER_COLLAPSE -> 18;
            case VRAM_GARBAGE -> 82;
            case DESYNC_FAILURE -> 24;
            case TERMINAL_DEATH -> 16;
            case BLACK_PANEL -> 6;
            case BROKEN_PIPELINE -> 60;
         };
         return Math.max(1, (int)(var0 * (0.36F + UNnVVNvvnVvU) * nUUVuvU()));
      }
   }

   public static int unNNVVNnvvV() {
      if (!VVuuUN.get()) {
         return 0;
      } else {
         short var0 = switch (vuuuNvNuv) {
            case FRAMEBUFFER_COLLAPSE -> 100;
            case VRAM_GARBAGE -> 290;
            case DESYNC_FAILURE -> 130;
            case TERMINAL_DEATH -> 86;
            case BLACK_PANEL -> 38;
            case BROKEN_PIPELINE -> 210;
         };
         return Math.max(1, (int)(var0 * (0.26F + UNnVVNvvnVvU) * nUUVuvU()));
      }
   }

   public static float NuunnvnN() {
      if (!VVuuUN.get()) {
         return 0.0F;
      } else {
         VvNUnuUUuN.nvnNNunvv var0 = nvUVNnuu();

         float var1 = switch (var0) {
            case IDLE -> 0.0F;
            case STRIKE -> 0.18F;
            case COLLAPSE -> 0.36F;
            case DEATH -> 0.8F;
         };
         if (vuuuNvNuv == VvNUnuUUuN.NVnVnNnN.BLACK_PANEL) {
            var1 += 0.22F;
         }

         if (vuuuNvNuv == VvNUnuUUuN.NVnVnNnN.TERMINAL_DEATH && var0 == VvNUnuUUuN.nvnNNunvv.DEATH) {
            var1 += 0.18F;
         }

         return C00OOC00oO(var1 + vNVuvnUUnuUn * 0.3F * nUUVuvU());
      }
   }

   public static float NVUunUNUN() {
      if (!VVuuUN.get()) {
         return 0.0F;
      } else if (!uVunuUNVVUUV()) {
         return 0.0F;
      } else {
         float var0 = switch (nvUVNnuu()) {
            case IDLE -> 0.0F;
            case STRIKE -> 0.84F;
            case COLLAPSE -> 0.56F;
            case DEATH -> 0.7F;
         };
         return C00OOC00oO(var0 + UvnvNVnnnnNU * 0.2F);
      }
   }

   public static float UUVNuUNUvUnV() {
      return uVUVnuvnuVuv;
   }

   public static float vuvnUnVnUNnV() {
      return UNnVVNvvnVvU;
   }

   public static float nnuUVNUuvvVU() {
      return vNVuvnUUnuUn;
   }

   public static float nVVUuvuNnUN() {
      return UvnvNVnnnnNU;
   }

   public static float nNnVnUNVV() {
      return uVunuUNVVUUV;
   }

   public static float nuunNvv() {
      return NVNnnvnuunNv;
   }

   public static float UuUVuuUu(int var0) {
      long var1 = System.nanoTime() / 16000000L;
      return vVvUvVVuuNvV(UuUVuuUu(uVUuuVnNVU ^ var1 ^ var0 * -7046029254386353131L));
   }

   public static float C00OOC00oO(int var0) {
      long var1 = System.nanoTime() / 7000000L;
      return vVvUvVVuuNvV(UuUVuuUu(uVUuuVnNVU ^ var1 ^ var0 * -4417276706812531889L));
   }

   public static float UuUVuuUu(int var0, long var1) {
      long var3 = Math.max(1L, var1);
      long var5 = vNUvnnVnUvu() / var3;
      return vVvUvVVuuNvV(UuUVuuUu(uVUuuVnNVU ^ var5 * -3335678366873096957L ^ var0 * -7046029254386353131L));
   }

   public static float uUnuvNvvNU(int var0) {
      return vVvUvVVuuNvV(UuUVuuUu(uVUuuVnNVU ^ var0 * -4417276706812531889L));
   }

   public static boolean UuUVuuUu(int var0, long var1, float var3) {
      if (!VVuuUN.get()) {
         return false;
      } else {
         long var4 = Math.max(1L, var1);
         float var6 = C00OOC00oO(var3);
         long var7 = C00OOC00oO(UuUVuuUu(uVUuuVnNVU ^ var0 * -7723592293110705685L)) % var4;
         long var9 = Math.floorMod(vNUvnnVnUvu() + var7, var4);
         return var9 < (long)((float)var4 * var6);
      }
   }

   public static boolean UuUVuuUu(int var0, long var1, float var3, long var4) {
      if (!VVuuUN.get()) {
         return false;
      } else {
         long var6 = Math.max(1L, var1);
         long var8 = Math.max(1L, Math.min(var4, var6));
         long var10 = vNUvnnVnUvu();
         long var12 = var10 / var6;
         long var14 = var10 % var6;
         float var16 = uUnuvNvvNU(UuUVuuUu(uVUuuVnNVU ^ var12 * -4658895280553007687L ^ var0 * -7046029254386353131L));
         return var16 < C00OOC00oO(var3) && var14 < var8;
      }
   }

   public static boolean UuUVuuUu(float var0, long var1) {
      if (!VVuuUN.get()) {
         return false;
      } else {
         long var3 = uVUuuVnNVU ^ var1 * -2960836687051489901L;
         return uUnuvNvvNU(UuUVuuUu(var3)) < C00OOC00oO(var0);
      }
   }

   public static long C00OOC00oO(int var0, long var1) {
      long var3 = Math.max(1L, var1);
      return vNUvnnVnUvu() / var3 * -7046029254386353131L ^ var0;
   }

   public static float UuUVuuUu(float var0) {
      float var1 = C00OOC00oO(var0);
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   public static float C00OOC00oO(float var0) {
      if (var0 <= 0.0F) {
         return 0.0F;
      } else {
         return var0 >= 1.0F ? 1.0F : var0;
      }
   }

   private static long UuUVuuUu(long var0) {
      var0 ^= var0 >>> 33;
      var0 *= -49064778989728563L;
      var0 ^= var0 >>> 33;
      var0 *= -4265267296055464877L;
      return var0 ^ var0 >>> 33;
   }

   private static long C00OOC00oO(long var0) {
      return var0 & Long.MAX_VALUE;
   }

   private static float uUnuvNvvNU(long var0) {
      return (float)(var0 >>> 40 & 16777215L) / 1.6777215E7F;
   }

   private static float vVvUvVVuuNvV(long var0) {
      return uUnuvNvvNU(var0) * 2.0F - 1.0F;
   }

   public static enum NVnVnNnN {
      FRAMEBUFFER_COLLAPSE,
      VRAM_GARBAGE,
      DESYNC_FAILURE,
      TERMINAL_DEATH,
      BLACK_PANEL,
      BROKEN_PIPELINE;
   }

   public static enum nvnNNunvv {
      IDLE,
      STRIKE,
      COLLAPSE,
      DEATH;
   }
}
