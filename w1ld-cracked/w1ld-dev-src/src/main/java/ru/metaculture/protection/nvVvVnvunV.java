package ru.metaculture.protection;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.LineEvent.Type;

public final class nvVvVnvunV {
   private static final ExecutorService UuUVuuUu = Executors.newCachedThreadPool(var0 -> {
      Thread var1 = new Thread(var0, "Wild-UserSound");
      var1.setDaemon(true);
      return var1;
   });

   private nvVvVnvunV() {
   }

   public static void UuUVuuUu(File var0, float var1) {
      if (var0 != null && var0.isFile() && var0.canRead()) {
         UuUVuuUu.execute(
            () -> {
               try (AudioInputStream var2 = AudioSystem.getAudioInputStream(var0)) {
                  AudioFormat var3 = var2.getFormat();
                  AudioFormat var4 = new AudioFormat(
                     Encoding.PCM_SIGNED, var3.getSampleRate(), 16, var3.getChannels(), var3.getChannels() * 2, var3.getSampleRate(), false
                  );

                  try (AudioInputStream var5 = AudioSystem.getAudioInputStream(var4, var2)) {
                     Clip var6 = AudioSystem.getClip();
                     var6.open(var5);
                     UuUVuuUu(var6, var1);
                     var6.addLineListener(var1xx -> {
                        if (var1xx.getType() == Type.STOP && var6.isOpen()) {
                           var6.close();
                        }
                     });
                     var6.start();
                  }
               } catch (Throwable var12) {
                  System.err
                     .println(
                        "[Wild] User sound playback failed: "
                           + var0.getAbsolutePath()
                           + " ("
                           + var12.getClass().getSimpleName()
                           + ": "
                           + var12.getMessage()
                           + ")"
                     );
                  var12.printStackTrace();
               }
            }
         );
      }
   }

   private static void UuUVuuUu(Clip var0, float var1) {
      try {
         FloatControl var2 = (FloatControl)var0.getControl(javax.sound.sampled.FloatControl.Type.MASTER_GAIN);
         float var3 = Math.max(0.0F, Math.min(1.0F, var1));
         float var4 = var3 <= 0.0F ? var2.getMinimum() : (float)(20.0 * Math.log10(var3));
         var2.setValue(Math.max(var2.getMinimum(), Math.min(var2.getMaximum(), var4)));
      } catch (Throwable var5) {
      }
   }
}
