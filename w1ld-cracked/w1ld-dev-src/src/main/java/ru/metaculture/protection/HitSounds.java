package ru.metaculture.protection;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import net.minecraft.class_1309;
import net.minecraft.class_156;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "HitSounds",
   uUnuvNvvNU = oOOOo0.Combat,
   C00OOC00oO = "Звуки при попадании и критическом ударе"
)
public class HitSounds extends Module {
   private static final int NVNnnvnuunNv = 48000;
   private static final ExecutorService uVunuUNVVUUV = Executors.newFixedThreadPool(1, var0 -> {
      Thread var1 = new Thread(var0, "Wild-HitSounds");
      var1.setDaemon(true);
      return var1;
   });
   private final UvNnUnuNUUU UNnVVNvvnVvU = new UvNnUnuNUUU("Тембр", "Органик", "Органик", "Стекло", "Глубокий", "Резкий");
   private final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Кастомные звуки", false);
   private final vNnVvvNU NnUuNNU = new vNnVvvNU("Открыть папку", 0).UuUVuuUu(() -> uUnuvNvvNU("hitsounds"));
   private final nNUuNvVn nNvNUVU = new nNUuNvVn("Громкость", 0.62F, 0.0F, 1.0F, 0.01F, true);
   private final nNUuNvVn UnUNuUU = new nNUuNvVn("Высота тона", 1.0F, 0.72F, 1.34F, 0.01F, false);
   private final nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Яркость", 0.58F, 0.0F, 1.0F, 0.01F, true);
   private final nNUuNvVn UvUvUNuvNU = new nNUuNvVn("Низкие частоты", 0.62F, 0.0F, 1.0F, 0.01F, true);
   private final nNUuNvVn c0oOOCcCoC0 = new nNUuNvVn("Задержка", 35.0F, 0.0F, 180.0F, 1.0F, false);
   private final vvNnnUNnVvn VVnVNnunVvu = new vvNnnUNnVvn("Слой крита", true);
   private long unNNVVNnvvV;

   public HitSounds() {
      this.nUUVuvU();
      Thread var1 = new Thread(() -> {
         while (!Thread.currentThread().isInterrupted()) {
            try {
               Thread.sleep(1000L);
               this.nUUVuvU();
            } catch (InterruptedException var2) {
               Thread.currentThread().interrupt();
            } catch (Throwable var3) {
            }
         }
      }, "Wild-HitSounds-FolderWatcher");
      var1.setDaemon(true);
      var1.start();
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.uNnUnnuNUnNu,
            this.UNnVVNvvnVvU,
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            this.c0oOOCcCoC0,
            this.VVnVNnunVvu
         }
      );
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uNvNuNnVNUvv var1) {
      this.nUUVuvU();
      if (!NUvunNNvN.UuUVuuUu() && var1 != null && var1.uUnuvNvvNU() instanceof class_1309 var2) {
         long var15 = System.currentTimeMillis();
         if (!((float)(var15 - this.unNNVVNnvvV) < this.c0oOOCcCoC0.uUnuvNvvNU())) {
            this.unNNVVNnvvV = var15;
            boolean var5 = this.VVnVNnunVvu.uUnuvNvvNU()
               && uUnuvNvvNU.field_1724.field_6017 > 0.0
               && !uUnuvNvvNU.field_1724.method_24828()
               && !uUnuvNvvNU.field_1724.method_5799()
               && !uUnuvNvvNU.field_1724.method_6101();
            float var6 = uUnuvNvvNU.field_1724.method_7261(0.5F);
            float var7 = (float)Math.min(1.0, (double)(uUnuvNvvNU.field_1724.method_5739(var2) / 4.5F));
            float var8 = UuUVuuUu(0.42F + var6 * 0.48F + (var5 ? 0.26F : 0.0F) - var7 * 0.1F, 0.18F, 1.18F);
            float var9 = UuUVuuUu(this.nNvNUVU.uUnuvNvvNU() * var8, 0.0F, 1.0F);
            float var10 = 0.965F + ThreadLocalRandom.current().nextFloat() * 0.071F;
            float var11 = this.UnUNuUU.uUnuvNvvNU() * (var5 ? 1.075F : 1.0F) * var10;
            String var12 = this.UNnVVNvvnVvU.uNNnnnuuuN;
            float var13 = this.uUVuVvuNUvnu.uUnuvNvvNU();
            float var14 = this.UvUvUNuvNU.uUnuvNvvNU();
            if (this.uNnUnnuNUnNu.uUnuvNvvNU() && C00OOC00oO(var12)) {
               nvVvVnvunV.UuUVuuUu(UuUVuuUu(var12), var9);
            } else {
               uVunuUNVVUUV.execute(() -> UuUVuuUu(UuUVuuUu(var12, var9, var11, var13, var14, var5)));
            }
         }
      }
   }

   private static File UuUVuuUu(String var0) {
      return var0 != null && !var0.isBlank() && NVnVnNnN.C00OOC00oO() != null
         ? new File(new File(NVnVnNnN.C00OOC00oO(), "sounds/hitsounds"), new File(var0).getName())
         : null;
   }

   private void nUUVuvU() {
      File var1 = new File(NVnVnNnN.C00OOC00oO(), "sounds/hitsounds");
      var1.mkdirs();
      ArrayList var2 = new ArrayList<>(Arrays.asList("Органик", "Стекло", "Глубокий", "Резкий"));
      File[] var3 = var1.listFiles(var0 -> var0.isFile() && UuUVuuUu(var0));
      if (var3 != null) {
         Arrays.sort(var3, Comparator.comparing(File::getName, String.CASE_INSENSITIVE_ORDER));

         for (File var7 : var3) {
            var2.add(var7.getName());
         }
      }

      this.UNnVVNvvnVvU.UuUVuuUu(var2);
   }

   private static boolean C00OOC00oO(String var0) {
      return var0 != null && !Arrays.asList("Органик", "Стекло", "Глубокий", "Резкий").contains(var0);
   }

   private static boolean UuUVuuUu(File var0) {
      String var1 = var0.getName().toLowerCase(Locale.ROOT);
      return var1.endsWith(".mp3") || var1.endsWith(".wav") || var1.endsWith(".aiff") || var1.endsWith(".au");
   }

   private static void uUnuvNvvNU(String var0) {
      File var1 = new File(NVnVnNnN.C00OOC00oO(), "sounds/" + var0);
      var1.mkdirs();

      try {
         class_156.method_668().method_672(var1);
      } catch (Throwable var3) {
         System.err.println("[Wild] Cannot open sound folder: " + var3.getMessage());
      }
   }

   public static void UuuNnUvUuv() {
      try {
         uVunuUNVVUUV.shutdownNow();
         uVunuUNVVUUV.awaitTermination(250L, TimeUnit.MILLISECONDS);
      } catch (Throwable var1) {
      }
   }

   private static byte[] UuUVuuUu(String var0, float var1, float var2, float var3, float var4, boolean var5) {
      int var6 = Math.round(48000.0F * (var5 ? 0.145F : 0.112F));
      byte[] var7 = new byte[var6 * 2];
      long var8 = System.nanoTime();

      float var10 = switch (var0) {
         case "Стекло" -> 238.0F;
         case "Глубокий" -> 96.0F;
         case "Резкий" -> 184.0F;
         default -> 132.0F;
      } * var2;

      float var11 = switch (var0) {
         case "Стекло" -> 1920.0F;
         case "Глубокий" -> 720.0F;
         case "Резкий" -> 2640.0F;
         default -> 1280.0F;
      } * var2;

      for (int var26 = 0; var26 < var6; var26++) {
         float var27 = var26 / 48000.0F;
         float var14 = UuUVuuUu(var8 + var26 * -7046029254386353131L);
         float var15 = 1.0F - (float)Math.exp(-var27 * 920.0F);
         float var16 = (float)Math.exp(-var27 * (var5 ? 22.0F : 29.0F));
         float var17 = (float)Math.exp(-var27 * 220.0F);
         float var18 = (float)Math.exp(-var27 * (var5 ? 36.0F : 52.0F));
         float var19 = (float)Math.sin((Math.PI * 2) * (var10 * var27 - var27 * var27 * var10 * 2.3F));
         float var20 = (float)Math.sin((Math.PI * 2) * (var10 * 0.47F * var27));
         float var21 = (float)Math.sin((Math.PI * 2) * (var11 * var27 + var27 * var27 * 1080.0F * var2));
         float var22 = (float)Math.sin((Math.PI * 2) * (var11 * 1.74F * var27 + Math.sin(var27 * 44.0F) * 0.018F));
         float var23 = var5 ? (float)Math.sin((Math.PI * 2) * (var11 * 2.1F * var27 + var27 * var27 * 1600.0F)) * (float)Math.exp(-var27 * 31.0F) : 0.0F;
         float var24 = var19 * var16 * (0.22F + var4 * 0.38F);
         var24 += var20 * var16 * var4 * 0.16F;
         var24 += var14 * var17 * (0.3F + var3 * 0.34F);
         var24 += var21 * var18 * var3 * 0.18F;
         var24 += var22 * var18 * var3 * ("Стекло".equals(var0) ? 0.22F : 0.07F);
         var24 += var23 * var3 * 0.22F;
         var24 *= var15 * var1;
         var24 = UuUVuuUu(var24);
         short var25 = (short)Math.round(UuUVuuUu(var24, -1.0F, 1.0F) * 32767.0F);
         var7[var26 * 2] = (byte)(var25 & 255);
         var7[var26 * 2 + 1] = (byte)(var25 >> 8 & 0xFF);
      }

      return var7;
   }

   private static void UuUVuuUu(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         AudioFormat var1 = new AudioFormat(48000.0F, 16, 1, true, false);

         try (SourceDataLine var2 = AudioSystem.getSourceDataLine(var1)) {
            var2.open(var1, Math.min(var0.length, 6000));
            var2.start();
            var2.write(var0, 0, var0.length);
            var2.drain();
         } catch (Throwable var7) {
         }
      }
   }

   private static float UuUVuuUu(long var0) {
      var0 ^= var0 >>> 33;
      var0 *= -49064778989728563L;
      var0 ^= var0 >>> 33;
      var0 *= -4265267296055464877L;
      var0 ^= var0 >>> 33;
      return (float)(var0 & 65535L) / 32767.5F - 1.0F;
   }

   private static float UuUVuuUu(float var0) {
      return (float)Math.tanh(var0 * 1.42F);
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }
}
