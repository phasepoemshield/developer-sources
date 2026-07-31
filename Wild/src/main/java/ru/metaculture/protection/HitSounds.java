package ru.metaculture.protection;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import net.minecraft.entity.LivingEntity;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "HitSounds",
   O0000000000 = Category.Combat,
   O000000000 = "Звуки при попадании и критическом ударе"
)
public class HitSounds extends Module {
   private static final int O000000000O = 48000;
   private static final ExecutorService O000000000O0 = Executors.newFixedThreadPool(1, runnable -> {
      Thread var1 = new Thread(runnable, "Wild-HitSounds");
      var1.setDaemon(true);
      return var1;
   });
   private final ModeSetting O000000000O00 = new ModeSetting("Тембр", "Органик", "Органик", "Стекло", "Глубокий", "Резкий");
   private final NumberSetting O000000000O000 = new NumberSetting("Громкость", 0.62F, 0.0F, 1.0F, 0.01F, true);
   private final NumberSetting O000000000O00O = new NumberSetting("Высота тона", 1.0F, 0.72F, 1.34F, 0.01F, false);
   private final NumberSetting O000000000O0O = new NumberSetting("Яркость", 0.58F, 0.0F, 1.0F, 0.01F, true);
   private final NumberSetting O000000000O0O0 = new NumberSetting("Низкие частоты", 0.62F, 0.0F, 1.0F, 0.01F, true);
   private final NumberSetting O000000000O0OO = new NumberSetting("Задержка", 35.0F, 0.0F, 180.0F, 1.0F, false);
   private final BooleanSetting O000000000OO = new BooleanSetting("Слой крита", true);
   private long O000000000OO0;

   public HitSounds() {
      this.O00000000(
         new Setting[]{
            this.O000000000O00, this.O000000000O000, this.O000000000O00O, this.O000000000O0O, this.O000000000O0O0, this.O000000000O0OO, this.O000000000OO
         }
      );
   }

   @EventHandler
   public void O00000000(O0000000O0O0OO o0000000O0O0OO) {
      if (!O0000O00O0000O.O00000000() && o0000000O0O0OO != null && o0000000O0O0OO.O0000000000() instanceof LivingEntity var2) {
         long var15 = System.currentTimeMillis();
         if (!((float)(var15 - this.O000000000OO0) < this.O000000000O0OO.O0000000000())) {
            this.O000000000OO0 = var15;
            boolean var5 = this.O000000000OO.O0000000000()
               && O0000000000.player.fallDistance > 0.0
               && !O0000000000.player.isOnGround()
               && !O0000000000.player.isTouchingWater()
               && !O0000000000.player.isClimbing();
            float var6 = O0000000000.player.getAttackCooldownProgress(0.5F);
            float var7 = (float)Math.min(1.0, (double)(O0000000000.player.distanceTo(var2) / 4.5F));
            float var8 = O00000000(0.42F + var6 * 0.48F + (var5 ? 0.26F : 0.0F) - var7 * 0.1F, 0.18F, 1.18F);
            float var9 = O00000000(this.O000000000O000.O0000000000() * var8, 0.0F, 1.0F);
            float var10 = 0.965F + ThreadLocalRandom.current().nextFloat() * 0.071F;
            float var11 = this.O000000000O00O.O0000000000() * (var5 ? 1.075F : 1.0F) * var10;
            String var12 = this.O000000000O00.O000000000000;
            float var13 = this.O000000000O0O.O0000000000();
            float var14 = this.O000000000O0O0.O0000000000();
            O000000000O0.execute(() -> O00000000(O00000000(var12, var9, var11, var13, var14, var5)));
         }
      }
   }

   public static void O0000000000O0() {
      try {
         O000000000O0.shutdownNow();
         O000000000O0.awaitTermination(250L, TimeUnit.MILLISECONDS);
      } catch (Throwable var1) {
      }
   }

   private static byte[] O00000000(String string, float f, float g, float h, float i, boolean bl) {
      int var6 = Math.round(48000.0F * (bl ? 0.145F : 0.112F));
      byte[] var7 = new byte[var6 * 2];
      long var8 = System.nanoTime();

      float var10 = switch (string) {
         case "Стекло" -> 238.0F;
         case "Глубокий" -> 96.0F;
         case "Резкий" -> 184.0F;
         default -> 132.0F;
      } * g;

      float var11 = switch (string) {
         case "Стекло" -> 1920.0F;
         case "Глубокий" -> 720.0F;
         case "Резкий" -> 2640.0F;
         default -> 1280.0F;
      } * g;

      for (int var26 = 0; var26 < var6; var26++) {
         float var27 = var26 / 48000.0F;
         float var14 = O00000000(var8 + var26 * -7046029254386353131L);
         float var15 = 1.0F - (float)Math.exp(-var27 * 920.0F);
         float var16 = (float)Math.exp(-var27 * (bl ? 22.0F : 29.0F));
         float var17 = (float)Math.exp(-var27 * 220.0F);
         float var18 = (float)Math.exp(-var27 * (bl ? 36.0F : 52.0F));
         float var19 = (float)Math.sin((Math.PI * 2) * (var10 * var27 - var27 * var27 * var10 * 2.3F));
         float var20 = (float)Math.sin((Math.PI * 2) * (var10 * 0.47F * var27));
         float var21 = (float)Math.sin((Math.PI * 2) * (var11 * var27 + var27 * var27 * 1080.0F * g));
         float var22 = (float)Math.sin((Math.PI * 2) * (var11 * 1.74F * var27 + Math.sin(var27 * 44.0F) * 0.018F));
         float var23 = bl ? (float)Math.sin((Math.PI * 2) * (var11 * 2.1F * var27 + var27 * var27 * 1600.0F)) * (float)Math.exp(-var27 * 31.0F) : 0.0F;
         float var24 = var19 * var16 * (0.22F + i * 0.38F);
         var24 += var20 * var16 * i * 0.16F;
         var24 += var14 * var17 * (0.3F + h * 0.34F);
         var24 += var21 * var18 * h * 0.18F;
         var24 += var22 * var18 * h * ("Стекло".equals(string) ? 0.22F : 0.07F);
         var24 += var23 * h * 0.22F;
         var24 *= var15 * f;
         var24 = O00000000(var24);
         short var25 = (short)Math.round(O00000000(var24, -1.0F, 1.0F) * 32767.0F);
         var7[var26 * 2] = (byte)(var25 & 255);
         var7[var26 * 2 + 1] = (byte)(var25 >> 8 & 0xFF);
      }

      return var7;
   }

   private static void O00000000(byte[] bs) {
      if (bs != null && bs.length != 0) {
         AudioFormat var1 = new AudioFormat(48000.0F, 16, 1, true, false);

         try (SourceDataLine var2 = AudioSystem.getSourceDataLine(var1)) {
            var2.open(var1, Math.min(bs.length, 6000));
            var2.start();
            var2.write(bs, 0, bs.length);
            var2.drain();
         } catch (Throwable var7) {
         }
      }
   }

   private static float O00000000(long l) {
      l ^= l >>> 33;
      l *= -49064778989728563L;
      l ^= l >>> 33;
      l *= -4265267296055464877L;
      l ^= l >>> 33;
      return (float)(l & 65535L) / 32767.5F - 1.0F;
   }

   private static float O00000000(float f) {
      return (float)Math.tanh(f * 1.42F);
   }

   private static float O00000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }
}
