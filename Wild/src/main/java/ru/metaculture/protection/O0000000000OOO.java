package ru.metaculture.protection;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.AudioFormat.Encoding;

public final class O0000000000OOO {
   private static final int O00000000 = 44100;
   private static final float O000000000 = 0.42F;
   private static final float O0000000000 = 0.62F;
   private static final AtomicBoolean O00000000000 = new AtomicBoolean(false);
   private static volatile Thread O000000000000;
   private static volatile boolean O0000000000000;
   private static volatile long O000000000000O;

   private O0000000000OOO() {
   }

   public static void O00000000() {
      if (!O0000000000OO0.O000000000000()) {
         O0000000000();
      } else {
         long var0 = O0000000000OO0.O00000000000OO();
         if (var0 != 0L && var0 != O000000000000O && O00000000000.compareAndSet(false, true)) {
            O000000000000O = var0;
            O0000000000000 = false;
            Thread var2 = new Thread(O0000000000OOO::O00000000000, "Wild-AudioDeviceReset");
            var2.setDaemon(true);
            var2.setPriority(10);
            O000000000000 = var2;
            var2.start();
         }
      }
   }

   public static void O000000000() {
      O00000000();
   }

   public static void O0000000000() {
      O0000000000000 = true;
   }

   private static void O00000000000() {
      SourceDataLine var0 = null;

      try {
         O0000000000OO0.W6 var1 = O0000000000OO0.O0000000000000();
         long var2 = O0000000000OO0.O00000000000OO();
         float var4 = O00000000(var1, var2);
         byte[] var5 = O00000000(var1, var2, var4);
         AudioFormat var6 = new AudioFormat(Encoding.PCM_SIGNED, 44100.0F, 16, 1, 2, 44100.0F, false);
         var0 = AudioSystem.getSourceDataLine(var6);
         var0.open(var6, Math.min(var5.length, 44100));
         var0.start();
         int var7 = 0;
         short var8 = 1024;

         while (var7 < var5.length && !O0000000000000) {
            int var9 = Math.min(var8, var5.length - var7);
            var0.write(var5, var7, var9);
            var7 += var9;
         }

         var0.drain();
      } catch (Throwable var18) {
      } finally {
         try {
            if (var0 != null) {
               var0.stop();
               var0.flush();
               var0.close();
            }
         } catch (Throwable var17) {
         }

         O00000000000.set(false);
         O000000000000 = null;
      }
   }

   private static byte[] O00000000(O0000000000OO0.W6 o00000000, long l, float f) {
      int var4 = Math.max(1, (int)(44100.0F * f));
      ByteBuffer var5 = ByteBuffer.allocate(var4 * 2).order(ByteOrder.LITTLE_ENDIAN);
      O0000000000OOO.W8 var6 = new O0000000000OOO.W8(l ^ -7935046062780286179L);
      float var7 = 0.0F;
      int var8 = 0;
      float var9 = 0.0F;
      float var10 = 0.0F;

      for (int var11 = 0; var11 < var4; var11++) {
         float var12 = var11 / 44100.0F;
         float var13 = (float)var11 / Math.max(1, var4 - 1);
         float var14 = O00000000(var13, o00000000);
         if (var8 <= 0) {
            var7 = O00000000(o00000000, var6, var12, var13);
            var8 = O000000000(o00000000, var6, var13);
         } else {
            var8--;
         }

         float var15 = O00000000(o00000000, var6, var12, var13);
         float var16 = var15 * 0.36F + var7 * 0.64F;
         var16 += O00000000(o00000000, var12, var13);
         var16 += O00000000(o00000000, var6, var13);
         if (o00000000 == O0000000000OO0.W6.VRAM_GARBAGE || o00000000 == O0000000000OO0.W6.BROKEN_PIPELINE) {
            var16 = O00000000000(var16, 7.0F + var6.O00000000() * 11.0F);
         }

         if (O0000000000(o00000000, var6, var13)) {
            var16 *= o00000000 == O0000000000OO0.W6.BLACK_PANEL ? 0.015F : 0.1F;
         }

         if (var6.O00000000() < O00000000(o00000000, var13)) {
            var16 += (var6.O00000000() * 2.0F - 1.0F) * O000000000(o00000000);
         }

         var9 = var9 * 0.995F + var16 * 0.005F;
         var16 -= var9;
         var16 = var10 * 0.18F + var16 * 0.82F;
         var10 = var16;
         var16 *= var14;
         var16 *= O00000000(o00000000);
         var16 = O00000000(var16);
         var16 = O00000000(var16, -0.62F, 0.62F);
         short var17 = (short)(var16 * 32767.0F);
         var5.putShort(var17);
      }

      return var5.array();
   }

   private static float O00000000(O0000000000OO0.W6 o00000000, O0000000000OOO.W8 o000000002, float f, float g) {
      return switch (o00000000) {
         case FRAMEBUFFER_COLLAPSE -> {
            float var12 = O00000000(52.0F, f) * 0.36F;
            float var17 = O000000000(67.0F + 9.0F * O00000000(2.2F, f), f) * 0.31F;
            float var22 = O0000000000(320.0F + 180.0F * O00000000(4.4F, f), f) * 0.16F;
            yield var12 + var17 + var22 + O00000000(o000000002) * 0.045F;
         }
         case VRAM_GARBAGE -> {
            float var11 = O00000000(71.0F, f) * 0.22F;
            float var16 = O000000000(86.0F + 46.0F * o000000002.O00000000(), f) * 0.34F;
            float var21 = O0000000000(520.0F + 960.0F * o000000002.O00000000(), f) * 0.28F;
            yield var11 + var16 + var21 + O00000000(o000000002) * 0.24F;
         }
         case DESYNC_FAILURE -> {
            float var10 = O00000000(44.0F + 18.0F * O00000000(3.1F, f), f) * 0.3F;
            float var15 = O000000000(79.0F + 58.0F * O00000000(7.0F, f), f) * 0.38F;
            float var20 = O00000000(760.0F + 330.0F * O00000000(11.0F, f), f) * 0.12F;
            yield var10 + var15 + var20 + O00000000(o000000002) * 0.055F;
         }
         case TERMINAL_DEATH -> {
            float var9 = O00000000(39.0F, f) * 0.34F;
            float var14 = O00000000(78.0F, f) * 0.22F;
            float var19 = O000000000(58.0F + 5.0F * O00000000(1.4F, f), f) * 0.5F;
            float var7 = O0000000000(180.0F + 70.0F * O00000000(3.2F, f), f) * 0.14F;
            yield var9 + var14 + var19 + var7;
         }
         case BLACK_PANEL -> {
            float var8 = O00000000(37.0F, f) * 0.46F;
            float var13 = O00000000(74.0F, f) * 0.22F;
            float var18 = O000000000(49.0F, f) * 0.17F;
            yield var8 + var13 + var18 + O00000000(o000000002) * 0.035F;
         }
         case BROKEN_PIPELINE -> {
            float var4 = O00000000(61.0F + 24.0F * O00000000(2.6F, f), f) * 0.28F;
            float var5 = O000000000(76.0F + 72.0F * O00000000(8.4F, f), f) * 0.42F;
            float var6 = O0000000000(630.0F + 1220.0F * o000000002.O00000000(), f) * 0.31F;
            yield var4 + var5 + var6 + O00000000(o000000002) * 0.2F;
         }
      };
   }

   private static float O00000000(O0000000000OO0.W6 o00000000, float f, float g) {
      float var3 = O000000000((g - 0.52F) / 0.34F);

      return switch (o00000000) {
         case VRAM_GARBAGE -> O000000000(69.0F + 12.0F * O00000000(5.0F, f), f) * 0.28F * var3;
         default -> O000000000(56.0F, f) * 0.26F * var3;
         case TERMINAL_DEATH -> O000000000(54.0F + 4.0F * O00000000(2.0F, f), f) * 0.42F * var3;
         case BLACK_PANEL -> O00000000(31.0F, f) * 0.34F * var3;
         case BROKEN_PIPELINE -> O000000000(57.0F + 18.0F * O00000000(6.0F, f), f) * 0.36F * var3;
      };
   }

   private static float O00000000(O0000000000OO0.W6 o00000000, O0000000000OOO.W8 o000000002, float f) {
      float var3 = switch (o00000000) {
         case VRAM_GARBAGE -> 0.055F + f * 0.035F;
         default -> 0.026F + f * 0.02F;
         case TERMINAL_DEATH -> 0.032F + f * 0.02F;
         case BLACK_PANEL -> 0.012F + f * 0.01F;
         case BROKEN_PIPELINE -> 0.06F + f * 0.04F;
      };
      if (o000000002.O00000000() > var3) {
         return 0.0F;
      } else {
         return (o000000002.O00000000() * 2.0F - 1.0F) * switch (o00000000) {
            case VRAM_GARBAGE, BROKEN_PIPELINE -> 0.36F;
            default -> 0.2F;
            case TERMINAL_DEATH -> 0.25F;
            case BLACK_PANEL -> 0.12F;
         };
      }
   }

   private static int O000000000(O0000000000OO0.W6 o00000000, O0000000000OOO.W8 o000000002, float f) {
      byte var3 = switch (o00000000) {
         case FRAMEBUFFER_COLLAPSE -> 44;
         case VRAM_GARBAGE -> 22;
         case DESYNC_FAILURE -> 36;
         case TERMINAL_DEATH -> 80;
         case BLACK_PANEL -> 64;
         case BROKEN_PIPELINE -> 28;
      };
      int var4 = (int)(var3 * f * 0.75F);
      return 4 + o000000002.O00000000(Math.max(5, var3 + var4));
   }

   private static float O00000000(O0000000000OO0.W6 o00000000, long l) {
      float var3 = O000000000(O00000000(l ^ 828927517355L));

      return switch (o00000000) {
         case FRAMEBUFFER_COLLAPSE -> 1.55F + var3 * 0.55F;
         case VRAM_GARBAGE -> 1.8F + var3 * 0.7F;
         case DESYNC_FAILURE -> 1.45F + var3 * 0.65F;
         case TERMINAL_DEATH -> 2.0F + var3 * 0.8F;
         case BLACK_PANEL -> 1.25F + var3 * 0.5F;
         case BROKEN_PIPELINE -> 1.85F + var3 * 0.75F;
      };
   }

   private static float O00000000(O0000000000OO0.W6 o00000000) {
      float var1 = switch (o00000000) {
         case FRAMEBUFFER_COLLAPSE -> 0.37F;
         case VRAM_GARBAGE -> 0.39F;
         case DESYNC_FAILURE -> 0.38F;
         case TERMINAL_DEATH -> 0.42F;
         case BLACK_PANEL -> 0.32F;
         case BROKEN_PIPELINE -> 0.41F;
      };
      return Math.min(var1, 0.42F);
   }

   private static float O00000000(float f, O0000000000OO0.W6 o00000000) {
      float var2 = O000000000(f / 0.006F);
      float var3 = 1.0F - O000000000((f - 0.86F) / 0.14F);
      float var4 = var2 * var3;
      if (o00000000 == O0000000000OO0.W6.TERMINAL_DEATH) {
         var4 *= 0.88F + 0.12F * O000000000(6.0F, f);
      }

      if (o00000000 == O0000000000OO0.W6.BLACK_PANEL) {
         var4 *= 0.82F + 0.18F * (1.0F - O000000000((f - 0.36F) / 0.48F));
      }

      return O00000000(var4, 0.0F, 1.0F);
   }

   private static boolean O0000000000(O0000000000OO0.W6 o00000000, O0000000000OOO.W8 o000000002, float f) {
      float var3 = switch (o00000000) {
         case FRAMEBUFFER_COLLAPSE -> 0.014F + f * 0.024F;
         case VRAM_GARBAGE -> 0.014F + f * 0.026F;
         case DESYNC_FAILURE -> 0.016F + f * 0.026F;
         case TERMINAL_DEATH -> 0.02F + f * 0.04F;
         case BLACK_PANEL -> 0.045F + f * 0.07F;
         case BROKEN_PIPELINE -> 0.018F + f * 0.03F;
      };
      return o000000002.O00000000() < var3;
   }

   private static float O00000000(O0000000000OO0.W6 o00000000, float f) {
      return switch (o00000000) {
         case FRAMEBUFFER_COLLAPSE -> 0.008F + f * 0.014F;
         case VRAM_GARBAGE -> 0.015F + f * 0.03F;
         case DESYNC_FAILURE -> 0.01F + f * 0.018F;
         case TERMINAL_DEATH -> 0.008F + f * 0.016F;
         case BLACK_PANEL -> 0.004F + f * 0.006F;
         case BROKEN_PIPELINE -> 0.018F + f * 0.032F;
      };
   }

   private static float O000000000(O0000000000OO0.W6 o00000000) {
      return switch (o00000000) {
         case FRAMEBUFFER_COLLAPSE -> 0.32F;
         case VRAM_GARBAGE -> 0.5F;
         case DESYNC_FAILURE -> 0.34F;
         case TERMINAL_DEATH -> 0.4F;
         case BLACK_PANEL -> 0.2F;
         case BROKEN_PIPELINE -> 0.54F;
      };
   }

   private static float O00000000(float f, float g) {
      return (float)Math.sin((Math.PI * 2) * f * g);
   }

   private static float O000000000(float f, float g) {
      return O00000000(f, g) >= 0.0F ? 1.0F : -1.0F;
   }

   private static float O0000000000(float f, float g) {
      float var2 = g * f;
      return 2.0F * (var2 - (float)Math.floor(var2 + 0.5F));
   }

   private static float O00000000(O0000000000OOO.W8 o00000000) {
      return o00000000.O00000000() * 2.0F - 1.0F;
   }

   private static float O00000000000(float f, float g) {
      float var2 = Math.max(2.0F, g);
      return Math.round(f * var2) / var2;
   }

   private static float O00000000(float f) {
      return (float)Math.tanh(f * 1.45F);
   }

   private static float O000000000(float f) {
      float var1 = O00000000(f, 0.0F, 1.0F);
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   private static float O00000000(float f, float g, float h) {
      if (f < g) {
         return g;
      } else {
         return f > h ? h : f;
      }
   }

   private static long O00000000(long l) {
      l ^= l >>> 33;
      l *= -49064778989728563L;
      l ^= l >>> 33;
      l *= -4265267296055464877L;
      return l ^ l >>> 33;
   }

   private static float O000000000(long l) {
      return (float)(l >>> 40 & 16777215L) / 1.6777215E7F;
   }

   static final class W8 {
      private long O00000000;

      W8(long l) {
         this.O00000000 = l == 0L ? -7046029254386353131L : l;
      }

      float O00000000() {
         this.O00000000 = this.O00000000 ^ this.O00000000 << 13;
         this.O00000000 = this.O00000000 ^ this.O00000000 >>> 7;
         this.O00000000 = this.O00000000 ^ this.O00000000 << 17;
         return (float)(this.O00000000 >>> 40 & 16777215L) / 1.6777215E7F;
      }

      int O00000000(int i) {
         return i <= 1 ? 0 : (int)(this.O00000000() * i);
      }
   }
}
