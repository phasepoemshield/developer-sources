package ru.metaculture.protection;

import java.util.List;
import java.util.Locale;
import net.minecraft.class_310;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public final class VVUuNVVnNVUV extends UNUuvUN {
   public VVUuNVVnNVUV() {
      super("ai", "Запись, обучение и воспроизведение AI-ротации", ".ai <train|learn|run|stop|log|lab|profile|list>");
      this.UuUVuuUu("train", List::of);
      this.UuUVuuUu("learn", List::of);
      this.UuUVuuUu("stop", List::of);
      this.UuUVuuUu("run", List::of);
      this.UuUVuuUu("log", List::of);
      this.UuUVuuUu("lab", List::of);
      this.UuUVuuUu("profile", List::of);
      this.UuUVuuUu("list", List::of);
   }

   public static void vVvUvVVuuNvV() {
   }

   @Override
   public List<String> UuUVuuUu(String[] var1) {
      if (var1.length == 2) {
         String var4 = var1[1].toLowerCase(Locale.ROOT);
         return List.of("train", "learn", "run", "stop", "log", "lab", "profile", "list").stream().filter(var1x -> var1x.startsWith(var4)).toList();
      } else {
         if (var1.length == 3) {
            String var2 = var1[1].toLowerCase(Locale.ROOT);
            if (var2.equals("profile") || var2.equals("run") || var2.equals("train") || var2.equals("learn")) {
               String var3 = var1[2].toLowerCase(Locale.ROOT);
               return VuUvvnuUu.vuvnUnVnUNnV().stream().filter(var1x -> var1x.toLowerCase(Locale.ROOT).startsWith(var3)).toList();
            }
         }

         return List.of();
      }
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (var1.length == 0) {
         vVnvuVVUunuv.UuUVuuUu("Использование: " + this.uUnuvNvvNU());
      } else {
         String var3 = var1[0].toLowerCase(Locale.ROOT);
         String var2;
         switch (var3) {
            case "train":
               if (var1.length >= 2) {
                  VuUvvnuUu.C00OOC00oO(var1[1]);
               }

               var2 = VuUvvnuUu.UuUVuuUu();
               break;
            case "learn":
               if (var1.length >= 2) {
                  VuUvvnuUu.C00OOC00oO(var1[1]);
               }

               var2 = VuUvvnuUu.vVvUvVVuuNvV();
               break;
            case "log":
               boolean var5 = !AttackAura.nNvNUVU.uUnuvNvvNU();
               AttackAura.nNvNUVU.C00OOC00oO(var5);
               var2 = "AI логи " + (var5 ? "ВКЛ" : "ВЫКЛ") + ". Файл: " + VuUvvnuUu.uNnUnnuNUnNu();
               break;
            case "lab":
               class_310.method_1551().execute(() -> class_310.method_1551().method_1507(new UNVnvUUUVv()));
               var2 = "AI Lab открыт.";
               break;
            case "stop":
               var2 = VuUvvnuUu.C00OOC00oO();
               break;
            case "run":
               if (var1.length >= 2) {
                  VuUvvnuUu.C00OOC00oO(var1[1]);
               }

               var2 = VuUvvnuUu.uUnuvNvvNU();
               if (VuUvvnuUu.UvUvUNuvNU()) {
                  this.uNNnnnuuuN();
               }
               break;
            case "profile":
               var2 = var1.length >= 2 ? VuUvvnuUu.C00OOC00oO(var1[1]) : "Текущий профиль: " + VuUvvnuUu.UUVNuUNUvUnV() + ". Использование: .ai profile <имя>";
               break;
            case "list":
               var2 = VuUvvnuUu.nnuUVNUuvvVU();
               break;
            default:
               var2 = "Использование: " + this.uUnuvNvvNU();
         }

         vVnvuVVUunuv.UuUVuuUu(var2);
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uNvNuNnVNUvv var1) {
      VuUvvnuUu.UuUVuuUu(var1);
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      VuUvvnuUu.uNNnnnuuuN();
   }

   private void uNNnnnuuuN() {
      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null && AttackAura.UNnVVNvvnVvU.vVvUvVVuuNvV.contains("AI")) {
         AttackAura.UNnVVNvvnVvU.uNNnnnuuuN = "AI";
         AttackAura.UNnVVNvvnVvU.vNUvnnVnUvu = AttackAura.UNnVVNvvnVvU.vVvUvVVuuNvV.indexOf("AI");
         AttackAura var1 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(AttackAura.class);
         if (var1 != null && !var1.nuUnNvnuUu) {
            var1.UuUVuuUu(true);
         }
      } else {
         vVnvuVVUunuv.UuUVuuUu("Режим AI недоступен для текущего профиля.");
         VuUvvnuUu.C00OOC00oO();
      }
   }

   static {
      Loader.initialize();
   }
}
