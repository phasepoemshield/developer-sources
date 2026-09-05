package ru.metaculture.protection;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.FloatControl.Type;
import net.minecraft.class_1297;
import net.minecraft.class_156;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2398;
import net.minecraft.class_2663;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Totem Voices",
   C00OOC00oO = "Заменяет звук тотема на кастомный",
   uUnuvNvvNU = oOOOo0.Misc
)
public class Totem_Voices extends Module {
   private final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Громкость", 50.0F, 0.0F, 100.0F, 1.0F, false);
   private final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Звук", "Хмм", "Хмм", "Это печально(", "Ебать это чё", "67!");
   private final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Кастомные звуки", false);
   private final vNnVvvNU uNnUnnuNUnNu = new vNnVvvNU("Открыть папку", 0).UuUVuuUu(() -> C00OOC00oO("totem"));

   public Totem_Voices() {
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
      }, "Wild-TotemVoices-FolderWatcher");
      var1.setDaemon(true);
      var1.start();
      this.UuUVuuUu(new nvUuvVvuuN[]{this.UNnVVNvvnVvU, this.uVunuUNVVUUV, this.uNnUnnuNUnNu, this.NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      this.nUUVuvU();
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (var1.vVvUvVVuuNvV() instanceof class_2663 var2 && var2.method_11470() == 35) {
            class_1297 var4 = var2.method_11469(uUnuvNvvNU.field_1687);
            if (var4 != null && var4.method_5628() == uUnuvNvvNU.field_1724.method_5628()) {
               var1.C00OOC00oO();
               this.UuuNnUvUuv();
               uUnuvNvvNU.execute(() -> {
                  uUnuvNvvNU.field_1713.method_3051(var4, class_2398.field_11220, 30);
                  uUnuvNvvNU.field_1773.method_3189(new class_1799(class_1802.field_8288));
               });
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      if (this.UNnVVNvvnVvU.uUnuvNvvNU() && !UuUVuuUu(this.uVunuUNVVUUV.uUnuvNvvNU())) {
         File var4 = new File(new File(NVnVnNnN.C00OOC00oO(), "sounds/totem"), new File(this.uVunuUNVVUUV.uUnuvNvvNU()).getName());
         nvVvVnvunV.UuUVuuUu(var4, this.NVNnnvnuunNv.uUnuvNvvNU() / 100.0F);
      } else {
         String var1;
         if (this.uVunuUNVVUUV.C00OOC00oO("Хмм")) {
            var1 = "hm_pon.wav";
         } else if (this.uVunuUNVVUUV.C00OOC00oO("Это печально(")) {
            var1 = "tusky_etopechalno.wav";
         } else if (this.uVunuUNVVUUV.C00OOC00oO("67!")) {
            var1 = "pampimpoms.wav";
         } else {
            var1 = "ebat_eto_cho.wav";
         }

         String var2 = "/assets/" + "wild" + "/tusky/" + var1;
         Thread var3 = new Thread(() -> {
            try {
               InputStream var2x = Totem_Voices.class.getResourceAsStream(var2);
               if (var2x == null) {
                  vVnvuVVUunuv.UuUVuuUu("Не найден звук по пути: " + var2);
                  return;
               }

               AudioInputStream var3x = AudioSystem.getAudioInputStream(new BufferedInputStream(var2x));
               Clip var4x = AudioSystem.getClip();
               var4x.open(var3x);
               FloatControl var5 = (FloatControl)var4x.getControl(Type.MASTER_GAIN);
               float var6 = this.NVNnnvnuunNv.uUnuvNvvNU();
               if (var6 <= 0.0F) {
                  var5.setValue(var5.getMinimum());
               } else {
                  float var7 = (float)(Math.log10(var6 / 100.0) * 20.0);
                  var5.setValue(Math.max(var5.getMinimum(), Math.min(var5.getMaximum(), var7)));
               }

               var4x.start();
            } catch (Exception var8) {
               var8.printStackTrace();
               vVnvuVVUunuv.UuUVuuUu("Ошибка воспроизведения: " + var8.getMessage());
            }
         }, "Wild-TotemVoice");
         var3.setDaemon(true);
         var3.start();
      }
   }

   private void nUUVuvU() {
      File var1 = new File(NVnVnNnN.C00OOC00oO(), "sounds/totem");
      var1.mkdirs();
      ArrayList var2 = new ArrayList<>(Arrays.asList("Хмм", "Это печально(", "Ебать это чё", "67!"));
      File[] var3 = var1.listFiles(var0 -> var0.isFile() && UuUVuuUu(var0));
      if (var3 != null) {
         Arrays.sort(var3, Comparator.comparing(File::getName, String.CASE_INSENSITIVE_ORDER));

         for (File var7 : var3) {
            var2.add(var7.getName());
         }
      }

      this.uVunuUNVVUUV.UuUVuuUu(var2);
   }

   private static boolean UuUVuuUu(String var0) {
      return "Хмм".equals(var0) || "Это печально(".equals(var0) || "Ебать это чё".equals(var0) || "67!".equals(var0);
   }

   private static boolean UuUVuuUu(File var0) {
      String var1 = var0.getName().toLowerCase(Locale.ROOT);
      return var1.endsWith(".mp3") || var1.endsWith(".wav") || var1.endsWith(".aiff") || var1.endsWith(".au");
   }

   private static void C00OOC00oO(String var0) {
      File var1 = new File(NVnVnNnN.C00OOC00oO(), "sounds/" + var0);
      var1.mkdirs();

      try {
         class_156.method_668().method_672(var1);
      } catch (Throwable var3) {
         System.err.println("[Wild] Cannot open sound folder: " + var3.getMessage());
      }
   }
}
