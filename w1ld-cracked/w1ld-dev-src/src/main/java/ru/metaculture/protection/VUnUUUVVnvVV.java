package ru.metaculture.protection;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.AudioFormat.Encoding;

public final class VUnUUUVVnvVV {
   private static final int UuUVuuUu = 44100;
   private static final float C00OOC00oO = 0.42F;
   private static final float uUnuvNvvNU = 0.62F;
   private static final AtomicBoolean vVvUvVVuuNvV = new AtomicBoolean(false);
   private static volatile Thread uNNnnnuuuN;
   private static volatile boolean nuUnNvnuUu;
   private static volatile long VVuuUN;

   private VUnUUUVVnvVV() {
   }

   public static void UuUVuuUu() {
      if (!VvNUnuUUuN.uNNnnnuuuN()) {
         uUnuvNvvNU();
      } else {
         long var0 = VvNUnuUUuN.vuuuNvNuv();
         if (var0 != 0L && var0 != VVuuUN && vVvUvVVuuNvV.compareAndSet(false, true)) {
            VVuuUN = var0;
            nuUnNvnuUu = false;
            Thread var2 = new Thread(VUnUUUVVnvVV::vVvUvVVuuNvV, "Wild-AudioDeviceReset");
            var2.setDaemon(true);
            var2.setPriority(10);
            uNNnnnuuuN = var2;
            var2.start();
         }
      }
   }

   public static void C00OOC00oO() {
      UuUVuuUu();
   }

   public static void uUnuvNvvNU() {
      nuUnNvnuUu = true;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void vVvUvVVuuNvV() {
      SourceDataLine var0 = null;
      boolean var17 = false /* VF: Semaphore variable */;

      label106: {
         try {
            var17 = true;
            VvNUnuUUuN.NVnVnNnN var1 = VvNUnuUUuN.nuUnNvnuUu();
            long var2 = VvNUnuUUuN.vuuuNvNuv();
            float var4 = UuUVuuUu(var1, var2);
            byte[] var5 = UuUVuuUu(var1, var2, var4);
            AudioFormat var6 = new AudioFormat(Encoding.PCM_SIGNED, 44100.0F, 16, 1, 2, 44100.0F, false);
            var0 = AudioSystem.getSourceDataLine(var6);
            var0.open(var6, Math.min(var5.length, 44100));
            var0.start();
            int var7 = 0;
            short var8 = 1024;

            while (var7 < var5.length && !nuUnNvnuUu) {
               int var9 = Math.min(var8, var5.length - var7);
               var0.write(var5, var7, var9);
               var7 += var9;
            }

            var0.drain();
            var17 = false;
            break label106;
         } catch (Throwable var21) {
            var17 = false;
         } finally {
            if (var17) {
               try {
                  if (var0 != null) {
                     var0.stop();
                     var0.flush();
                     var0.close();
                  }
               } catch (Throwable var18) {
               }

               vVvUvVVuuNvV.set(false);
               uNNnnnuuuN = null;
            }
         }

         try {
            if (var0 != null) {
               var0.stop();
               var0.flush();
               var0.close();
            }
         } catch (Throwable var19) {
         }

         vVvUvVVuuNvV.set(false);
         uNNnnnuuuN = null;
         return;
      }

      try {
         if (var0 != null) {
            var0.stop();
            var0.flush();
            var0.close();
         }
      } catch (Throwable var20) {
      }

      vVvUvVVuuNvV.set(false);
      uNNnnnuuuN = null;
   }

   private static byte[] UuUVuuUu(VvNUnuUUuN.NVnVnNnN var0, long var1, float var3) {
      int var4 = Math.max(1, (int)(44100.0F * var3));
      ByteBuffer var5 = ByteBuffer.allocate(var4 * 2).order(ByteOrder.LITTLE_ENDIAN);
      VUnUUUVVnvVV.NVnVnNnN var6 = new VUnUUUVVnvVV.NVnVnNnN(var1 ^ -7935046062780286179L);
      float var7 = 0.0F;
      int var8 = 0;
      float var9 = 0.0F;
      float var10 = 0.0F;

      for (int var11 = 0; var11 < var4; var11++) {
         float var12 = var11 / 44100.0F;
         float var13 = (float)var11 / Math.max(1, var4 - 1);
         float var14 = UuUVuuUu(var13, var0);
         if (var8 <= 0) {
            var7 = UuUVuuUu(var0, var6, var12, var13);
            var8 = C00OOC00oO(var0, var6, var13);
         } else {
            var8--;
         }

         float var15 = UuUVuuUu(var0, var6, var12, var13);
         float var16 = var15 * 0.36F + var7 * 0.64F;
         var16 += UuUVuuUu(var0, var12, var13);
         var16 += UuUVuuUu(var0, var6, var13);
         if (var0 == VvNUnuUUuN.NVnVnNnN.VRAM_GARBAGE || var0 == VvNUnuUUuN.NVnVnNnN.BROKEN_PIPELINE) {
            var16 = vVvUvVVuuNvV(var16, 7.0F + var6.UuUVuuUu() * 11.0F);
         }

         if (uUnuvNvvNU(var0, var6, var13)) {
            var16 *= var0 == VvNUnuUUuN.NVnVnNnN.BLACK_PANEL ? 0.015F : 0.1F;
         }

         if (var6.UuUVuuUu() < UuUVuuUu(var0, var13)) {
            var16 += (var6.UuUVuuUu() * 2.0F - 1.0F) * C00OOC00oO(var0);
         }

         var9 = var9 * 0.995F + var16 * 0.005F;
         var16 -= var9;
         var16 = var10 * 0.18F + var16 * 0.82F;
         var10 = var16;
         var16 *= var14;
         var16 *= UuUVuuUu(var0);
         var16 = UuUVuuUu(var16);
         var16 = UuUVuuUu(var16, -0.62F, 0.62F);
         short var17 = (short)(var16 * 32767.0F);
         var5.putShort(var17);
      }

      return var5.array();
   }

   private static float UuUVuuUu(VvNUnuUUuN.NVnVnNnN var0, VUnUUUVVnvVV.NVnVnNnN var1, float var2, float var3) {
      return switch (var0) {
         case FRAMEBUFFER_COLLAPSE -> {
            float var12 = UuUVuuUu(52.0F, var2) * 0.36F;
            float var17 = C00OOC00oO(67.0F + 9.0F * UuUVuuUu(2.2F, var2), var2) * 0.31F;
            float var22 = uUnuvNvvNU(320.0F + 180.0F * UuUVuuUu(4.4F, var2), var2) * 0.16F;
            yield var12 + var17 + var22 + UuUVuuUu(var1) * 0.045F;
         }
         case VRAM_GARBAGE -> {
            float var11 = UuUVuuUu(71.0F, var2) * 0.22F;
            float var16 = C00OOC00oO(86.0F + 46.0F * var1.UuUVuuUu(), var2) * 0.34F;
            float var21 = uUnuvNvvNU(520.0F + 960.0F * var1.UuUVuuUu(), var2) * 0.28F;
            yield var11 + var16 + var21 + UuUVuuUu(var1) * 0.24F;
         }
         case DESYNC_FAILURE -> {
            float var10 = UuUVuuUu(44.0F + 18.0F * UuUVuuUu(3.1F, var2), var2) * 0.3F;
            float var15 = C00OOC00oO(79.0F + 58.0F * UuUVuuUu(7.0F, var2), var2) * 0.38F;
            float var20 = UuUVuuUu(760.0F + 330.0F * UuUVuuUu(11.0F, var2), var2) * 0.12F;
            yield var10 + var15 + var20 + UuUVuuUu(var1) * 0.055F;
         }
         case TERMINAL_DEATH -> {
            float var9 = UuUVuuUu(39.0F, var2) * 0.34F;
            float var14 = UuUVuuUu(78.0F, var2) * 0.22F;
            float var19 = C00OOC00oO(58.0F + 5.0F * UuUVuuUu(1.4F, var2), var2) * 0.5F;
            float var7 = uUnuvNvvNU(180.0F + 70.0F * UuUVuuUu(3.2F, var2), var2) * 0.14F;
            yield var9 + var14 + var19 + var7;
         }
         case BLACK_PANEL -> {
            float var8 = UuUVuuUu(37.0F, var2) * 0.46F;
            float var13 = UuUVuuUu(74.0F, var2) * 0.22F;
            float var18 = C00OOC00oO(49.0F, var2) * 0.17F;
            yield var8 + var13 + var18 + UuUVuuUu(var1) * 0.035F;
         }
         case BROKEN_PIPELINE -> {
            float var4 = UuUVuuUu(61.0F + 24.0F * UuUVuuUu(2.6F, var2), var2) * 0.28F;
            float var5 = C00OOC00oO(76.0F + 72.0F * UuUVuuUu(8.4F, var2), var2) * 0.42F;
            float var6 = uUnuvNvvNU(630.0F + 1220.0F * var1.UuUVuuUu(), var2) * 0.31F;
            yield var4 + var5 + var6 + UuUVuuUu(var1) * 0.2F;
         }
      };
   }

   private static float UuUVuuUu(VvNUnuUUuN.NVnVnNnN var0, float var1, float var2) {
      float var3 = C00OOC00oO((var2 - 0.52F) / 0.34F);

      return switch (var0) {
         case VRAM_GARBAGE -> C00OOC00oO(69.0F + 12.0F * UuUVuuUu(5.0F, var1), var1) * 0.28F * var3;
         default -> C00OOC00oO(56.0F, var1) * 0.26F * var3;
         case TERMINAL_DEATH -> C00OOC00oO(54.0F + 4.0F * UuUVuuUu(2.0F, var1), var1) * 0.42F * var3;
         case BLACK_PANEL -> UuUVuuUu(31.0F, var1) * 0.34F * var3;
         case BROKEN_PIPELINE -> C00OOC00oO(57.0F + 18.0F * UuUVuuUu(6.0F, var1), var1) * 0.36F * var3;
      };
   }

   private static float UuUVuuUu(VvNUnuUUuN.NVnVnNnN var0, VUnUUUVVnvVV.NVnVnNnN var1, float var2) {
      float var3 = switch (var0) {
         case VRAM_GARBAGE -> 0.055F + var2 * 0.035F;
         default -> 0.026F + var2 * 0.02F;
         case TERMINAL_DEATH -> 0.032F + var2 * 0.02F;
         case BLACK_PANEL -> 0.012F + var2 * 0.01F;
         case BROKEN_PIPELINE -> 0.06F + var2 * 0.04F;
      };
      if (var1.UuUVuuUu() > var3) {
         return 0.0F;
      } else {
         return (var1.UuUVuuUu() * 2.0F - 1.0F) * switch (var0) {
            case VRAM_GARBAGE, BROKEN_PIPELINE -> 0.36F;
            default -> 0.2F;
            case TERMINAL_DEATH -> 0.25F;
            case BLACK_PANEL -> 0.12F;
         };
      }
   }

   private static int C00OOC00oO(VvNUnuUUuN.NVnVnNnN var0, VUnUUUVVnvVV.NVnVnNnN var1, float var2) {
      byte var3 = switch (var0) {
         case FRAMEBUFFER_COLLAPSE -> 44;
         case VRAM_GARBAGE -> 22;
         case DESYNC_FAILURE -> 36;
         case TERMINAL_DEATH -> 80;
         case BLACK_PANEL -> 64;
         case BROKEN_PIPELINE -> 28;
      };
      int var4 = (int)(var3 * var2 * 0.75F);
      return 4 + var1.UuUVuuUu(Math.max(5, var3 + var4));
   }

   private static float UuUVuuUu(VvNUnuUUuN.NVnVnNnN var0, long var1) {
      float var3 = C00OOC00oO(UuUVuuUu(var1 ^ 828927517355L));

      return switch (var0) {
         case FRAMEBUFFER_COLLAPSE -> 1.55F + var3 * 0.55F;
         case VRAM_GARBAGE -> 1.8F + var3 * 0.7F;
         case DESYNC_FAILURE -> 1.45F + var3 * 0.65F;
         case TERMINAL_DEATH -> 2.0F + var3 * 0.8F;
         case BLACK_PANEL -> 1.25F + var3 * 0.5F;
         case BROKEN_PIPELINE -> 1.85F + var3 * 0.75F;
      };
   }

   private static float UuUVuuUu(VvNUnuUUuN.NVnVnNnN var0) {
      float var1 = switch (var0) {
         case FRAMEBUFFER_COLLAPSE -> 0.37F;
         case VRAM_GARBAGE -> 0.39F;
         case DESYNC_FAILURE -> 0.38F;
         case TERMINAL_DEATH -> 0.42F;
         case BLACK_PANEL -> 0.32F;
         case BROKEN_PIPELINE -> 0.41F;
      };
      return Math.min(var1, 0.42F);
   }

   private static float UuUVuuUu(float var0, VvNUnuUUuN.NVnVnNnN var1) {
      float var2 = C00OOC00oO(var0 / 0.006F);
      float var3 = 1.0F - C00OOC00oO((var0 - 0.86F) / 0.14F);
      float var4 = var2 * var3;
      if (var1 == VvNUnuUUuN.NVnVnNnN.TERMINAL_DEATH) {
         var4 *= 0.88F + 0.12F * C00OOC00oO(6.0F, var0);
      }

      if (var1 == VvNUnuUUuN.NVnVnNnN.BLACK_PANEL) {
         var4 *= 0.82F + 0.18F * (1.0F - C00OOC00oO((var0 - 0.36F) / 0.48F));
      }

      return UuUVuuUu(var4, 0.0F, 1.0F);
   }

   private static boolean uUnuvNvvNU(VvNUnuUUuN.NVnVnNnN var0, VUnUUUVVnvVV.NVnVnNnN var1, float var2) {
      float var3 = switch (var0) {
         case FRAMEBUFFER_COLLAPSE -> 0.014F + var2 * 0.024F;
         case VRAM_GARBAGE -> 0.014F + var2 * 0.026F;
         case DESYNC_FAILURE -> 0.016F + var2 * 0.026F;
         case TERMINAL_DEATH -> 0.02F + var2 * 0.04F;
         case BLACK_PANEL -> 0.045F + var2 * 0.07F;
         case BROKEN_PIPELINE -> 0.018F + var2 * 0.03F;
      };
      return var1.UuUVuuUu() < var3;
   }

   private static float UuUVuuUu(VvNUnuUUuN.NVnVnNnN var0, float var1) {
      return switch (var0) {
         case FRAMEBUFFER_COLLAPSE -> 0.008F + var1 * 0.014F;
         case VRAM_GARBAGE -> 0.015F + var1 * 0.03F;
         case DESYNC_FAILURE -> 0.01F + var1 * 0.018F;
         case TERMINAL_DEATH -> 0.008F + var1 * 0.016F;
         case BLACK_PANEL -> 0.004F + var1 * 0.006F;
         case BROKEN_PIPELINE -> 0.018F + var1 * 0.032F;
      };
   }

   private static float C00OOC00oO(VvNUnuUUuN.NVnVnNnN var0) {
      return switch (var0) {
         case FRAMEBUFFER_COLLAPSE -> 0.32F;
         case VRAM_GARBAGE -> 0.5F;
         case DESYNC_FAILURE -> 0.34F;
         case TERMINAL_DEATH -> 0.4F;
         case BLACK_PANEL -> 0.2F;
         case BROKEN_PIPELINE -> 0.54F;
      };
   }

   private static float UuUVuuUu(float var0, float var1) {
      return (float)Math.sin((Math.PI * 2) * var0 * var1);
   }

   private static float C00OOC00oO(float var0, float var1) {
      return UuUVuuUu(var0, var1) >= 0.0F ? 1.0F : -1.0F;
   }

   private static float uUnuvNvvNU(float var0, float var1) {
      float var2 = var1 * var0;
      return 2.0F * (var2 - (float)Math.floor(var2 + 0.5F));
   }

   private static float UuUVuuUu(VUnUUUVVnvVV.NVnVnNnN var0) {
      return var0.UuUVuuUu() * 2.0F - 1.0F;
   }

   private static float vVvUvVVuuNvV(float var0, float var1) {
      float var2 = Math.max(2.0F, var1);
      return Math.round(var0 * var2) / var2;
   }

   private static float UuUVuuUu(float var0) {
      return (float)Math.tanh(var0 * 1.45F);
   }

   private static float C00OOC00oO(float var0) {
      float var1 = UuUVuuUu(var0, 0.0F, 1.0F);
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   private static long UuUVuuUu(long var0) {
      var0 ^= var0 >>> 33;
      var0 *= -49064778989728563L;
      var0 ^= var0 >>> 33;
      var0 *= -4265267296055464877L;
      return var0 ^ var0 >>> 33;
   }

   private static float C00OOC00oO(long var0) {
      return (float)(var0 >>> 40 & 16777215L) / 1.6777215E7F;
   }

   static final class NVnVnNnN {
      private long UuUVuuUu;

      NVnVnNnN(long var1) {
         this.UuUVuuUu = var1 == 0L ? -7046029254386353131L : var1;
      }

      float UuUVuuUu() {
         this.UuUVuuUu = this.UuUVuuUu ^ this.UuUVuuUu << 13;
         this.UuUVuuUu = this.UuUVuuUu ^ this.UuUVuuUu >>> 7;
         this.UuUVuuUu = this.UuUVuuUu ^ this.UuUVuuUu << 17;
         return (float)(this.UuUVuuUu >>> 40 & 16777215L) / 1.6777215E7F;
      }

      int UuUVuuUu(int var1) {
         return var1 <= 1 ? 0 : (int)(this.UuUVuuUu() * var1);
      }
   }
}
