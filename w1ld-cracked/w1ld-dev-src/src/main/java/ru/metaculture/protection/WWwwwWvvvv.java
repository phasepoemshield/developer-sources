package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import net.minecraft.class_2338;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class WWwwwWvvvv extends UNUuvUN {
   private final Gson UuUVuuUu = new GsonBuilder().setPrettyPrinting().create();
   private final File C00OOC00oO = new File(ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu, "creeperfarm.cfg");

   public WWwwwWvvvv() {
      super("cf", "Управление границами фермы криперов", ".cf <pos1/pos2/clear/info>");
      this.UuUVuuUu("pos1", List::of);
      this.UuUVuuUu("pos2", List::of);
      this.UuUVuuUu("clear", List::of);
      this.UuUVuuUu("info", List::of);
      this.vNUvnnVnUvu();
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (var1.length == 0) {
         vVnvuVVUunuv.UuUVuuUu("§cИспользование: " + this.uUnuvNvvNU());
      } else {
         String var2 = var1[0].toLowerCase();
         switch (var2) {
            case "info":
               this.VVuuUN();
               break;
            case "pos1":
               this.vVvUvVVuuNvV();
               break;
            case "pos2":
               this.uNNnnnuuuN();
               break;
            case "clear":
               this.nuUnNvnuUu();
               break;
            default:
               vVnvuVVUunuv.UuUVuuUu("§cНеизвестная подкоманда.");
         }
      }
   }

   @Compile
   private void vVvUvVVuuNvV() {
      if (a_.field_1724 == null) {
         vVnvuVVUunuv.UuUVuuUu("§cВы должны быть в игре!");
      } else {
         class_2338 var1 = a_.field_1724.method_24515();
         CreeperFarm.UuUVuuUu(var1);
         this.uVUuuVnNVU();
         vVnvuVVUunuv.UuUVuuUu("§aПозиция 1 установлена: §f" + this.UuUVuuUu(var1));
      }
   }

   @Compile
   private void uNNnnnuuuN() {
      if (a_.field_1724 == null) {
         vVnvuVVUunuv.UuUVuuUu("§cВы должны быть в игре!");
      } else {
         class_2338 var1 = a_.field_1724.method_24515();
         CreeperFarm.C00OOC00oO(var1);
         this.uVUuuVnNVU();
         vVnvuVVUunuv.UuUVuuUu("§aПозиция 2 установлена: §f" + this.UuUVuuUu(var1));
      }
   }

   @Compile
   private void nuUnNvnuUu() {
      CreeperFarm.UuuNnUvUuv();
      this.uVUuuVnNVU();
      vVnvuVVUunuv.UuUVuuUu("§cКоординаты фермы криперов очищены.");
   }

   @Compile
   private void VVuuUN() {
      class_2338 var1 = CreeperFarm.nUUVuvU();
      class_2338 var2 = CreeperFarm.UnUNVVVNuv();
      if (var1 == null) {
         if (var2 == null) {
            vVnvuVVUunuv.UuUVuuUu("§7Координаты фермы не установлены.");
         } else {
            vVnvuVVUunuv.UuUVuuUu("§fИнформация о ферме криперов:");
            vVnvuVVUunuv.UuUVuuUu(" §7Позиция 1: §cне установлена");
            vVnvuVVUunuv.UuUVuuUu(" §7Позиция 2: §f" + this.UuUVuuUu(var2));
         }
      } else {
         vVnvuVVUunuv.UuUVuuUu("§fИнформация о ферме криперов:");
         vVnvuVVUunuv.UuUVuuUu(" §7Позиция 1: §f" + this.UuUVuuUu(var1));
         if (var2 == null) {
            vVnvuVVUunuv.UuUVuuUu(" §7Позиция 2: §cне установлена");
         } else {
            vVnvuVVUunuv.UuUVuuUu(" §7Позиция 2: §f" + this.UuUVuuUu(var2));
            int var3 = Math.abs(var2.method_10263() - var1.method_10263()) + 1;
            int var4 = Math.abs(var2.method_10264() - var1.method_10264()) + 1;
            int var5 = Math.abs(var2.method_10260() - var1.method_10260()) + 1;
            vVnvuVVUunuv.UuUVuuUu(" §7Размер области: §f" + var3 + "x" + var4 + "x" + var5);
         }
      }
   }

   @Compile
   private String UuUVuuUu(class_2338 var1) {
      return var1.method_10263() + ", " + var1.method_10264() + ", " + var1.method_10260();
   }

   @Compile
   private void vNUvnnVnUvu() {
      if (this.C00OOC00oO.exists()) {
         try (FileReader var1 = new FileReader(this.C00OOC00oO)) {
            WWwwwWvvvv.NVnVnNnN var2 = (WWwwwWvvvv.NVnVnNnN)this.UuUVuuUu.fromJson(var1, WWwwwWvvvv.NVnVnNnN.class);
            if (var2 != null) {
               if (var2.UuUVuuUu != null) {
                  CreeperFarm.UuUVuuUu(new class_2338(var2.UuUVuuUu.UuUVuuUu, var2.UuUVuuUu.C00OOC00oO, var2.UuUVuuUu.uUnuvNvvNU));
               }

               if (var2.C00OOC00oO != null) {
                  CreeperFarm.C00OOC00oO(new class_2338(var2.C00OOC00oO.UuUVuuUu, var2.C00OOC00oO.C00OOC00oO, var2.C00OOC00oO.uUnuvNvvNU));
               }
            }
         } catch (Exception var6) {
         }
      }
   }

   @Compile
   private void uVUuuVnNVU() {
      try {
         if (!this.C00OOC00oO.getParentFile().exists()) {
            this.C00OOC00oO.getParentFile().mkdirs();
         }

         WWwwwWvvvv.NVnVnNnN var1 = new WWwwwWvvvv.NVnVnNnN();
         class_2338 var2 = CreeperFarm.nUUVuvU();
         class_2338 var3 = CreeperFarm.UnUNVVVNuv();
         if (var2 != null) {
            var1.UuUVuuUu = new WWwwwWvvvv.nvnNNunvv(var2.method_10263(), var2.method_10264(), var2.method_10260());
         }

         if (var3 != null) {
            var1.C00OOC00oO = new WWwwwWvvvv.nvnNNunvv(var3.method_10263(), var3.method_10264(), var3.method_10260());
         }

         try (FileWriter var4 = new FileWriter(this.C00OOC00oO)) {
            this.UuUVuuUu.toJson(var1, var4);
         }
      } catch (Exception var9) {
      }
   }

   static {
      Loader.initialize();
   }

   static class NVnVnNnN {
      WWwwwWvvvv.nvnNNunvv UuUVuuUu;
      WWwwwWvvvv.nvnNNunvv C00OOC00oO;
   }

   static class nvnNNunvv {
      int UuUVuuUu;
      int C00OOC00oO;
      int uUnuvNvvNU;

      nvnNNunvv(int var1, int var2, int var3) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
      }
   }
}
