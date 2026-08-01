package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicBoolean;

public final class O0000000000OO0 {
   public static final long O00000000 = 80000000L;
   public static final long O000000000 = 180000000L;
   public static final long O0000000000 = 650000000L;
   public static final long O00000000000 = 1250000000L;
   public static final long O000000000000 = 2250000000L;
   private static final AtomicBoolean O0000000000000 = new AtomicBoolean(false);
   private static final AtomicBoolean O000000000000O = new AtomicBoolean(false);
   private static volatile long O00000000000O;
   private static volatile long O00000000000O0;
   private static volatile ru.metaculture.protection.O0000000000OO0.W6 O00000000000OO = ru.metaculture.protection.O0000000000OO0.W6.FRAMEBUFFER_COLLAPSE;
   private static volatile long O0000000000O = 80000000L;
   private static volatile long O0000000000O0 = 650000000L;
   private static volatile long O0000000000O00 = 1250000000L;
   private static volatile long O0000000000O0O = 2250000000L;
   private static volatile float O0000000000OO;
   private static volatile float O0000000000OO0;
   private static volatile float O0000000000OOO;
   private static volatile float O000000000O;
   private static volatile float O000000000O0;
   private static volatile float O000000000O00;

   private O0000000000OO0() {
   }

   public static void O00000000() {
      O0000000000000.set(true);
   }

   public static boolean O000000000() {
      return O0000000000000.get();
   }

   public static void O0000000000() {
      if (O0000000000000.get()) {
         if (!O000000000000O.get()) {
            if (ThreadLocalRandom.current().nextInt(100) < 70) {
               O00000000000();
            }
         }
      }
   }

   public static void O00000000000() {
      if (O000000000000O.compareAndSet(false, true)) {
         ThreadLocalRandom var0 = ThreadLocalRandom.current();
         O00000000000O = System.nanoTime();
         O00000000000O0 = var0.nextLong();
         ru.metaculture.protection.O0000000000OO0.W6[] var1 = ru.metaculture.protection.O0000000000OO0.W6.values();
         O00000000000OO = var1[var0.nextInt(var1.length)];
         long var2 = var0.nextLong(35L, 125L);
         long var4 = var2 + var0.nextLong(220L, 760L);
         long var6 = var4 + var0.nextLong(260L, 980L);
         long var8 = var6 + var0.nextLong(220L, 920L);
         O0000000000O = var2 * 1000000L;
         O0000000000O0 = var4 * 1000000L;
         O0000000000O00 = var6 * 1000000L;
         O0000000000O0O = var8 * 1000000L;
         O0000000000OO = var0.nextFloat(0.1F, 0.88F);
         O0000000000OO0 = var0.nextFloat(0.04F, 0.62F);
         O0000000000OOO = var0.nextFloat(0.28F, 1.0F);
         O000000000O = var0.nextFloat(0.1F, 0.68F);
         O000000000O0 = var0.nextFloat(0.28F, 1.0F);
         O000000000O00 = var0.nextFloat(0.2F, 1.0F);
         switch (O00000000000OO) {
            case FRAMEBUFFER_COLLAPSE:
               O0000000000OO = Math.max(O0000000000OO, 0.6F);
               O000000000O = Math.max(O000000000O, 0.46F);
               O000000000O0 = Math.max(O000000000O0, 0.66F);
               break;
            case VRAM_GARBAGE:
               O000000000O00 = Math.max(O000000000O00, 0.88F);
               O0000000000OOO = Math.max(O0000000000OOO, 0.74F);
               O0000000000OO0 = Math.max(O0000000000OO0, 0.18F);
               break;
            case DESYNC_FAILURE:
               O000000000O0 = Math.max(O000000000O0, 0.88F);
               O000000000O = Math.max(O000000000O, 0.42F);
               O0000000000OOO = Math.max(O0000000000OOO, 0.6F);
               break;
            case TERMINAL_DEATH:
               O0000000000OO = Math.max(O0000000000OO, 0.76F);
               O0000000000OO0 = Math.max(O0000000000OO0, 0.44F);
               O000000000O = Math.max(O000000000O, 0.54F);
               O0000000000O0O = Math.min(O0000000000O0O, 1420000000L + var0.nextLong(0L, 580000000L));
               break;
            case BLACK_PANEL:
               O0000000000OO = Math.max(O0000000000OO, 0.92F);
               O0000000000OO0 = Math.min(O0000000000OO0, 0.16F);
               O000000000O00 = Math.min(O000000000O00, 0.34F);
               O0000000000OOO = Math.min(O0000000000OOO, 0.48F);
               break;
            case BROKEN_PIPELINE:
               O000000000O0 = Math.max(O000000000O0, 0.96F);
               O0000000000OOO = Math.max(O0000000000OOO, 0.86F);
               O000000000O00 = Math.max(O000000000O00, 0.72F);
               O000000000O = Math.max(O000000000O, 0.52F);
         }

         try {
            ru.metaculture.protection.O0000000000OOO.O000000000();
         } catch (Throwable var11) {
         }
      }
   }

   public static boolean O000000000000() {
      return O000000000000O.get();
   }

   public static ru.metaculture.protection.O0000000000OO0.W6 O0000000000000() {
      return O00000000000OO;
   }

   public static long O000000000000O() {
      return O000000000000O.get() ? Math.max(0L, System.nanoTime() - O00000000000O) : 0L;
   }

   public static long O00000000000O() {
      return O000000000000O() / 1000000L;
   }

   public static long O00000000000O0() {
      return O00000000000O();
   }

   public static long O00000000000OO() {
      return O00000000000O0;
   }

   public static ru.metaculture.protection.O0000000000OO0.W7 O0000000000O() {
      if (!O000000000000O.get()) {
         return ru.metaculture.protection.O0000000000OO0.W7.IDLE;
      } else {
         long var0 = O000000000000O();
         if (var0 < O0000000000O) {
            return ru.metaculture.protection.O0000000000OO0.W7.STRIKE;
         } else {
            return var0 < O0000000000O00 ? ru.metaculture.protection.O0000000000OO0.W7.COLLAPSE : ru.metaculture.protection.O0000000000OO0.W7.DEATH;
         }
      }
   }

   public static int O0000000000O0() {
      if (!O000000000000O.get()) {
         return 0;
      } else {
         long var0 = O000000000000O();
         if (var0 >= O0000000000O0O) {
            return 5;
         } else if (var0 >= O0000000000O00) {
            return 4;
         } else if (var0 >= O0000000000O0) {
            return 3;
         } else {
            return var0 >= O0000000000O ? 2 : 1;
         }
      }
   }

   public static float O0000000000O00() {
      if (!O000000000000O.get()) {
         return 0.0F;
      } else {
         long var0 = O000000000000O();
         if (var0 < O0000000000O) {
            return 0.72F + 0.28F * O00000000((float)var0 / (float)Math.max(1L, O0000000000O));
         } else if (var0 < O0000000000O0) {
            return 0.82F + 0.18F * O00000000((float)(var0 - O0000000000O) / (float)Math.max(1L, O0000000000O0 - O0000000000O));
         } else {
            return var0 < O0000000000O00
               ? 0.92F + 0.08F * O00000000((float)(var0 - O0000000000O0) / (float)Math.max(1L, O0000000000O00 - O0000000000O0))
               : 1.0F;
         }
      }
   }

   public static float O0000000000O0O() {
      return !O000000000000O.get() ? 0.0F : O000000000((float)O000000000000O() / (float)Math.max(1L, O0000000000O0O));
   }

   public static float O00000000(long l, long m) {
      if (!O000000000000O.get()) {
         return 0.0F;
      } else {
         return m <= l ? 1.0F : O000000000((float)(O000000000000O() - l) / (float)(m - l));
      }
   }

   public static boolean O0000000000OO() {
      return O000000000000O.get() && O000000000000O() >= O0000000000O0O;
   }

   public static boolean O0000000000OO0() {
      if (!O000000000000O.get()) {
         return false;
      } else {
         ru.metaculture.protection.O0000000000OO0.W7 var0 = O0000000000O();
         if (var0 == ru.metaculture.protection.O0000000000OO0.W7.IDLE) {
            return false;
         } else {
            float var1 = switch (O00000000000OO) {
               case FRAMEBUFFER_COLLAPSE -> 0.18F;
               case VRAM_GARBAGE -> 0.08F;
               case DESYNC_FAILURE -> 0.24F;
               case TERMINAL_DEATH -> 0.36F;
               case BLACK_PANEL -> 0.14F;
               case BROKEN_PIPELINE -> 0.3F;
            };
            if (var0 == ru.metaculture.protection.O0000000000OO0.W7.STRIKE) {
               return O00000000(7001, 88L, 0.46F + O000000000O * 0.32F, 26L);
            } else {
               return var0 == ru.metaculture.protection.O0000000000OO0.W7.DEATH
                  ? O00000000(var1 + 0.4F + O000000000O * 0.34F, O000000000(7002, 24L))
                  : O00000000(var1 + O000000000O * 0.34F * O0000000000O00(), O000000000(7003, 30L));
            }
         }
      }
   }

   public static boolean O0000000000OOO() {
      if (!O000000000000O.get()) {
         return false;
      } else {
         ru.metaculture.protection.O0000000000OO0.W7 var0 = O0000000000O();
         if (var0 == ru.metaculture.protection.O0000000000OO0.W7.IDLE) {
            return false;
         } else if (O00000000000OO == ru.metaculture.protection.O0000000000OO0.W6.BLACK_PANEL && var0 == ru.metaculture.protection.O0000000000OO0.W7.DEATH) {
            return true;
         } else if (O00000000000OO == ru.metaculture.protection.O0000000000OO0.W6.TERMINAL_DEATH && O000000000000O() > O0000000000O00 + 120000000L) {
            return true;
         } else if (var0 == ru.metaculture.protection.O0000000000OO0.W7.STRIKE) {
            return O00000000(7101, 140L, O0000000000OO * 0.48F, 42L);
         } else {
            return var0 == ru.metaculture.protection.O0000000000OO0.W7.DEATH
               ? O00000000(0.36F + O0000000000OO * 0.58F, O000000000(7102, 38L))
               : O00000000(0.08F + O0000000000OO * 0.42F * O0000000000O00(), O000000000(7103, 48L));
         }
      }
   }

   public static boolean O000000000O() {
      if (!O000000000000O.get()) {
         return false;
      } else {
         ru.metaculture.protection.O0000000000OO0.W7 var0 = O0000000000O();
         if (var0 == ru.metaculture.protection.O0000000000OO0.W7.DEATH && O00000000000OO == ru.metaculture.protection.O0000000000OO0.W6.BLACK_PANEL) {
            return true;
         } else {
            return var0 == ru.metaculture.protection.O0000000000OO0.W7.DEATH && O00000000000OO == ru.metaculture.protection.O0000000000OO0.W6.TERMINAL_DEATH
               ? O000000000000O() > O0000000000O00 + 90000000L
               : O0000000000OOO() && O00000000(0.24F + O0000000000OO * 0.48F, O000000000(7201, 62L));
         }
      }
   }

   public static boolean O000000000O0() {
      if (!O000000000000O.get()) {
         return false;
      } else {
         ru.metaculture.protection.O0000000000OO0.W7 var0 = O0000000000O();
         if (O00000000000OO == ru.metaculture.protection.O0000000000OO0.W6.BLACK_PANEL) {
            return O00000000(7301, 820L, 0.1F, 24L);
         } else if (var0 == ru.metaculture.protection.O0000000000OO0.W7.STRIKE) {
            return O00000000(7302, 105L, 0.78F + O0000000000OO0 * 0.18F, 20L);
         } else {
            return var0 == ru.metaculture.protection.O0000000000OO0.W7.DEATH
               ? O00000000(7303, 240L, 0.24F + O0000000000OO0 * 0.44F, 36L)
               : O00000000(7304, 300L, 0.1F + O0000000000OO0 * 0.36F, 28L);
         }
      }
   }

   public static boolean O000000000O00() {
      if (!O000000000000O.get()) {
         return false;
      } else {
         ru.metaculture.protection.O0000000000OO0.W7 var0 = O0000000000O();
         if (var0 == ru.metaculture.protection.O0000000000OO0.W7.IDLE) {
            return false;
         } else if (var0 == ru.metaculture.protection.O0000000000OO0.W7.STRIKE) {
            return O00000000(7401, 140L, 0.32F, 42L);
         } else {
            float var1 = switch (O00000000000OO) {
               case FRAMEBUFFER_COLLAPSE -> 0.44F;
               case VRAM_GARBAGE -> 0.16F;
               case DESYNC_FAILURE -> 0.28F;
               case TERMINAL_DEATH -> 0.5F;
               case BLACK_PANEL -> 0.38F;
               case BROKEN_PIPELINE -> 0.36F;
            };
            return O00000000(7402, 460L, var1, 86L + (long)(130.0F * O0000000000O00()));
         }
      }
   }

   public static boolean O000000000O000() {
      if (!O000000000000O.get()) {
         return false;
      } else {
         ru.metaculture.protection.O0000000000OO0.W7 var0 = O0000000000O();
         if (var0 == ru.metaculture.protection.O0000000000OO0.W7.DEATH) {
            return true;
         } else {
            float var1 = switch (O00000000000OO) {
               case FRAMEBUFFER_COLLAPSE -> 0.5F;
               case VRAM_GARBAGE -> 0.12F;
               case DESYNC_FAILURE -> 0.58F;
               case TERMINAL_DEATH -> 0.4F;
               case BLACK_PANEL -> 0.2F;
               case BROKEN_PIPELINE -> 0.72F;
            };
            return O00000000(var1 * O000000000O0 * O0000000000O00(), O000000000(7501, 34L));
         }
      }
   }

   public static float O000000000O00O() {
      if (!O000000000000O.get()) {
         return 0.0F;
      } else {
         float var0 = switch (O00000000000OO) {
            case FRAMEBUFFER_COLLAPSE -> 0.12F;
            case VRAM_GARBAGE -> 0.05F;
            case DESYNC_FAILURE -> 0.24F;
            case TERMINAL_DEATH -> 0.18F;
            case BLACK_PANEL -> 0.04F;
            case BROKEN_PIPELINE -> 0.3F;
         };
         return O00000000(7601, 20L) * var0 * O000000000O0 * O0000000000O00();
      }
   }

   public static float O000000000O0O() {
      if (!O000000000000O.get()) {
         return 0.0F;
      } else {
         float var0 = switch (O00000000000OO) {
            case FRAMEBUFFER_COLLAPSE -> 0.16F;
            case VRAM_GARBAGE -> 0.07F;
            case DESYNC_FAILURE -> 0.3F;
            case TERMINAL_DEATH -> 0.2F;
            case BLACK_PANEL -> 0.06F;
            case BROKEN_PIPELINE -> 0.34F;
         };
         return O00000000(7602, 24L) * var0 * O000000000O0 * O0000000000O00();
      }
   }

   public static float O000000000O0O0() {
      if (!O000000000000O.get()) {
         return 1.0F;
      } else {
         return O000000000O000()
            ? Math.max(0.018F, 1.0F - Math.abs(O00000000(7603, 32L)) * 0.95F * O000000000O0)
            : 1.0F + O00000000(7604, 28L) * 0.26F * O000000000O0 * O0000000000O00();
      }
   }

   public static float O000000000O0OO() {
      if (!O000000000000O.get()) {
         return 1.0F;
      } else {
         return O000000000O000()
            ? Math.max(0.012F, 1.0F - Math.abs(O00000000(7605, 30L)) * 0.98F * O000000000O0)
            : 1.0F + O00000000(7606, 26L) * 0.34F * O000000000O0 * O0000000000O00();
      }
   }

   public static float O000000000OO() {
      if (!O000000000000O.get()) {
         return 1.0F;
      } else if (O00000000000OO == ru.metaculture.protection.O0000000000OO0.W6.BLACK_PANEL) {
         return 1.0F;
      } else {
         ru.metaculture.protection.O0000000000OO0.W7 var0 = O0000000000O();

         float var1 = switch (O00000000000OO) {
            case FRAMEBUFFER_COLLAPSE -> 0.16F;
            case VRAM_GARBAGE -> 0.08F;
            case DESYNC_FAILURE -> 0.3F;
            case TERMINAL_DEATH -> 0.18F;
            case BLACK_PANEL -> 0.0F;
            case BROKEN_PIPELINE -> 0.26F;
         };
         return var0 == ru.metaculture.protection.O0000000000OO0.W7.STRIKE ? 1.0F + O00000000(7701, 16L) * var1 * 1.45F : 1.0F + O00000000(7702, 32L) * var1 * O0000000000O00();
      }
   }

   public static int O000000000OO0() {
      if (!O000000000000O.get()) {
         return 0;
      } else {
         byte var0 = switch (O00000000000OO) {
            case FRAMEBUFFER_COLLAPSE -> 24;
            case VRAM_GARBAGE -> 36;
            case DESYNC_FAILURE -> 20;
            case TERMINAL_DEATH -> 14;
            case BLACK_PANEL -> 8;
            case BROKEN_PIPELINE -> 46;
         };
         return Math.max(1, (int)(var0 * (0.55F + O0000000000OOO * 0.78F) * O0000000000O00()));
      }
   }

   public static int O000000000OO00() {
      if (!O000000000000O.get()) {
         return 0;
      } else {
         byte var0 = switch (O00000000000OO) {
            case FRAMEBUFFER_COLLAPSE -> 18;
            case VRAM_GARBAGE -> 82;
            case DESYNC_FAILURE -> 24;
            case TERMINAL_DEATH -> 16;
            case BLACK_PANEL -> 6;
            case BROKEN_PIPELINE -> 60;
         };
         return Math.max(1, (int)(var0 * (0.36F + O000000000O00) * O0000000000O00()));
      }
   }

   public static int O000000000OO0O() {
      if (!O000000000000O.get()) {
         return 0;
      } else {
         short var0 = switch (O00000000000OO) {
            case FRAMEBUFFER_COLLAPSE -> 100;
            case VRAM_GARBAGE -> 290;
            case DESYNC_FAILURE -> 130;
            case TERMINAL_DEATH -> 86;
            case BLACK_PANEL -> 38;
            case BROKEN_PIPELINE -> 210;
         };
         return Math.max(1, (int)(var0 * (0.26F + O000000000O00) * O0000000000O00()));
      }
   }

   public static float O000000000OOO() {
      if (!O000000000000O.get()) {
         return 0.0F;
      } else {
         ru.metaculture.protection.O0000000000OO0.W7 var0 = O0000000000O();

         float var1 = switch (var0) {
            case IDLE -> 0.0F;
            case STRIKE -> 0.18F;
            case COLLAPSE -> 0.36F;
            case DEATH -> 0.8F;
         };
         if (O00000000000OO == ru.metaculture.protection.O0000000000OO0.W6.BLACK_PANEL) {
            var1 += 0.22F;
         }

         if (O00000000000OO == ru.metaculture.protection.O0000000000OO0.W6.TERMINAL_DEATH && var0 == ru.metaculture.protection.O0000000000OO0.W7.DEATH) {
            var1 += 0.18F;
         }

         return O000000000(var1 + O0000000000OO * 0.3F * O0000000000O00());
      }
   }

   public static float O000000000OOO0() {
      if (!O000000000000O.get()) {
         return 0.0F;
      } else if (!O000000000O0()) {
         return 0.0F;
      } else {
         float var0 = switch (O0000000000O()) {
            case IDLE -> 0.0F;
            case STRIKE -> 0.84F;
            case COLLAPSE -> 0.56F;
            case DEATH -> 0.7F;
         };
         return O000000000(var0 + O0000000000OO0 * 0.2F);
      }
   }

   public static float O000000000OOOO() {
      return O0000000000OOO;
   }

   public static float O00000000O() {
      return O000000000O00;
   }

   public static float O00000000O0() {
      return O0000000000OO;
   }

   public static float O00000000O00() {
      return O0000000000OO0;
   }

   public static float O00000000O000() {
      return O000000000O0;
   }

   public static float O00000000O0000() {
      return O000000000O;
   }

   public static float O00000000(int i) {
      long var1 = System.nanoTime() / 16000000L;
      return O00000000000(O00000000(O00000000000O0 ^ var1 ^ i * -7046029254386353131L));
   }

   public static float O000000000(int i) {
      long var1 = System.nanoTime() / 7000000L;
      return O00000000000(O00000000(O00000000000O0 ^ var1 ^ i * -4417276706812531889L));
   }

   public static float O00000000(int i, long l) {
      long var3 = Math.max(1L, l);
      long var5 = O00000000000O() / var3;
      return O00000000000(O00000000(O00000000000O0 ^ var5 * -3335678366873096957L ^ i * -7046029254386353131L));
   }

   public static float O0000000000(int i) {
      return O00000000000(O00000000(O00000000000O0 ^ i * -4417276706812531889L));
   }

   public static boolean O00000000(int i, long l, float f) {
      if (!O000000000000O.get()) {
         return false;
      } else {
         long var4 = Math.max(1L, l);
         float var6 = O000000000(f);
         long var7 = O000000000(O00000000(O00000000000O0 ^ i * -7723592293110705685L)) % var4;
         long var9 = Math.floorMod(O00000000000O() + var7, var4);
         return var9 < (long)((float)var4 * var6);
      }
   }

   public static boolean O00000000(int i, long l, float f, long m) {
      if (!O000000000000O.get()) {
         return false;
      } else {
         long var6 = Math.max(1L, l);
         long var8 = Math.max(1L, Math.min(m, var6));
         long var10 = O00000000000O();
         long var12 = var10 / var6;
         long var14 = var10 % var6;
         float var16 = O0000000000(O00000000(O00000000000O0 ^ var12 * -4658895280553007687L ^ i * -7046029254386353131L));
         return var16 < O000000000(f) && var14 < var8;
      }
   }

   public static boolean O00000000(float f, long l) {
      if (!O000000000000O.get()) {
         return false;
      } else {
         long var3 = O00000000000O0 ^ l * -2960836687051489901L;
         return O0000000000(O00000000(var3)) < O000000000(f);
      }
   }

   public static long O000000000(int i, long l) {
      long var3 = Math.max(1L, l);
      return O00000000000O() / var3 * -7046029254386353131L ^ i;
   }

   public static float O00000000(float f) {
      float var1 = O000000000(f);
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   public static float O000000000(float f) {
      if (f <= 0.0F) {
         return 0.0F;
      } else {
         return f >= 1.0F ? 1.0F : f;
      }
   }

   private static long O00000000(long l) {
      l ^= l >>> 33;
      l *= -49064778989728563L;
      l ^= l >>> 33;
      l *= -4265267296055464877L;
      return l ^ l >>> 33;
   }

   private static long O000000000(long l) {
      return l & Long.MAX_VALUE;
   }

   private static float O0000000000(long l) {
      return (float)(l >>> 40 & 16777215L) / 1.6777215E7F;
   }

   private static float O00000000000(long l) {
      return O0000000000(l) * 2.0F - 1.0F;
   }

   public static enum W6 {
      FRAMEBUFFER_COLLAPSE,
      VRAM_GARBAGE,
      DESYNC_FAILURE,
      TERMINAL_DEATH,
      BLACK_PANEL,
      BROKEN_PIPELINE;
   }

   public static enum W7 {
      IDLE,
      STRIKE,
      COLLAPSE,
      DEATH;
   }
}
