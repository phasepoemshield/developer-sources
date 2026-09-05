package ru.metaculture.protection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_5611;
import net.minecraft.class_7439;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class oO0OcCC0OCO extends UNUuvUN {
   private static final String vVvUvVVuuNvV = "Метка";
   private static final double uNNnnnuuuN = 3.75;
   public static class_5611 UuUVuuUu = new class_5611(Float.MAX_VALUE, Float.MAX_VALUE);
   public static float C00OOC00oO = Float.MAX_VALUE;
   public static String uUnuvNvvNU = "Метка";
   private static volatile boolean nuUnNvnuUu;
   private static String VVuuUN = "Метка";
   private final UvVNVuNUVvuv vNUvnnVnUvu = new UvVNVuNUVvuv();
   private final VNVNvuUn uVUuuVnNVU = new VNVNvuUn();
   private final Map<String, oO0OcCC0OCO.NVnVnNnN> vuuuNvNuv = new HashMap<>();
   private final oO0OcCC0OCO.NVnVnNnN nUUVuvU = new oO0OcCC0OCO.NVnVnNnN();
   private final StringBuilder UnUNVVVNuv = new StringBuilder(32);

   public oO0OcCC0OCO() {
      super("gps", "Добавление меток, для ивентов и тд", ".gps off [название] | .gps <x> <z> [название] | .gps <x> <y> <z> [название]");
      this.UuUVuuUu("off", NuuvVnVNN::nuUnNvnuUu);
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (var1.length == 0) {
         if (a_.field_1724 != null) {
            UuUVuuUu((float)a_.field_1724.method_23317(), (float)a_.field_1724.method_23318(), (float)a_.field_1724.method_23321(), "Моя позиция");
         }
      } else {
         if ("off".equalsIgnoreCase(var1[0])) {
            this.vVvUvVVuuNvV(var1);
         } else if ("add".equalsIgnoreCase(var1[0])) {
            this.uUnuvNvvNU(Arrays.copyOfRange(var1, 1, var1.length));
         } else {
            this.uUnuvNvvNU(var1);
         }
      }
   }

   @Compile
   private void uUnuvNvvNU(String[] var1) {
      int var2 = uNNnnnuuuN(var1);
      if (var2 < 2) {
         if (a_.field_1724 != null) {
            UuUVuuUu((float)a_.field_1724.method_23317(), (float)a_.field_1724.method_23318(), (float)a_.field_1724.method_23321(), "Моя позиция");
         } else {
            vVnvuVVUunuv.UuUVuuUu("§cНужны хотя бы две координаты: §f.gps 100 -200");
         }
      } else if (a_.field_1724 != null && a_.field_1687 != null) {
         boolean var3 = var2 >= 3;
         float var4 = Float.parseFloat(var1[0]);
         float var5 = var3 ? Float.parseFloat(var1[1]) : (float)(a_.field_1724.method_23318() + 5.0);
         float var6 = Float.parseFloat(var1[var3 ? 2 : 1]);
         String var7 = UuUVuuUu(var1, var3 ? 3 : 2);
         UuUVuuUu(var4, var5, var6, var7);
         if (!var3) {
            vVnvuVVUunuv.UuUVuuUu("§7Высота взята на 5 блоков выше игрока");
         }
      }
   }

   @Compile
   private void vVvUvVVuuNvV(String[] var1) {
      if (var1.length == 0) {
         int var3 = NuuvVnVNN.UuUVuuUu();
         uNNnnnuuuN();
         if (var3 > 0) {
            vVnvuVVUunuv.UuUVuuUu("§eGps метки были выключены");
         } else {
            vVnvuVVUunuv.UuUVuuUu("§7Активных меток нет");
         }
      } else {
         String var2 = UuUVuuUu(var1, 1);
         if (!NuuvVnVNN.UuUVuuUu(var2)) {
            vVnvuVVUunuv.UuUVuuUu("§cМетки с таким названием нет: §f" + var2);
         } else {
            if (var2.equalsIgnoreCase(VVuuUN)) {
               uNNnnnuuuN();
            }

            vVnvuVVUunuv.UuUVuuUu("§eМетка убрана: §f" + var2);
         }
      }
   }

   private static int uNNnnnuuuN(String[] var0) {
      int var1 = 0;

      for (String var5 : var0) {
         try {
            Float.parseFloat(var5);
            var1++;
         } catch (NumberFormatException var7) {
            break;
         }
      }

      return var1;
   }

   private static String UuUVuuUu(String[] var0, int var1) {
      if (var0.length <= var1) {
         return "Метка";
      } else {
         String var2 = String.join(" ", Arrays.copyOfRange(var0, var1, var0.length)).trim();
         return var2.isEmpty() ? "Метка" : var2;
      }
   }

   public static void UuUVuuUu(float var0, float var1) {
      class_310 var2 = class_310.method_1551();
      float var3 = var2.field_1724 == null ? 64.0F : (float)(var2.field_1724.method_23318() + 5.0);
      UuUVuuUu(var0, var3, var1, "Метка");
   }

   public static void UuUVuuUu(float var0, float var1, float var2, String var3) {
      class_310 var4 = class_310.method_1551();
      if (var4.field_1687 != null) {
         String var5 = var3 != null && !var3.isBlank() ? var3 : "Метка";
         NuuvVnVNN.UuUVuuUu(new uvNvNVNVnUu(var5, var0, var1, var2, var4.field_1687.method_27983(), var4.field_1687.method_8597().comp_646()));
         VVuuUN = var5;
         uUnuvNvvNU = var5;
         UuUVuuUu = new class_5611(var0, var2);
         C00OOC00oO = var1;
         nuUnNvnuUu = false;
         vVnvuVVUunuv.UuUVuuUu(
            "§a[GPS] Метка '"
               + var5
               + "' установлена на X: "
               + class_3532.method_15375(var0)
               + " Y: "
               + class_3532.method_15375(var1)
               + " Z: "
               + class_3532.method_15375(var2)
         );
      }
   }

   private static void uNNnnnuuuN() {
      UuUVuuUu = new class_5611(Float.MAX_VALUE, Float.MAX_VALUE);
      C00OOC00oO = Float.MAX_VALUE;
      uUnuvNvvNU = "Метка";
      VVuuUN = "Метка";
      nuUnNvnuUu = false;
   }

   public static void vVvUvVVuuNvV() {
      nuUnNvnuUu = true;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
         String var4 = var2.comp_763().getString().toLowerCase();
         if (var4.contains("заверш") || var4.contains("окончен") || var4.contains("время вышло") || var4.contains("вы у цели")) {
            vVvUvVVuuNvV();
         }
      }
   }

   @vuVvUNNvVNV(
      UuUVuuUu = 3
   )
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      this.nuUnNvnuUu();
      if (!NuuvVnVNN.uUnuvNvvNU() && a_.field_1724 != null && a_.field_1687 != null) {
         if (!a_.field_1690.field_1842) {
            NuuvVnVNN.C00OOC00oO();
            if (nuUnNvnuUu) {
               nuUnNvnuUu = false;
               NuuvVnVNN.UuUVuuUu(VVuuUN);
               uNNnnnuuuN();
            }

            UnVNvNnU var2 = var1.vVvUvVVuuNvV();
            double var3 = a_.field_1687.method_8597().comp_646();
            boolean var5 = false;

            for (int var6 = 0; var6 < NuuvVnVNN.vVvUvVVuuNvV(); var6++) {
               uvNvNVNVnUu var7 = NuuvVnVNN.UuUVuuUu(var6);
               float var8 = var7.vNUvnnVnUvu();
               if (!(var8 <= 0.01F)) {
                  double var9 = var7.UuUVuuUu(var3);
                  class_243 var11 = new class_243(var7.C00OOC00oO() * var9, var7.uUnuvNvvNU(), var7.vVvUvVVuuNvV() * var9);
                  boolean var12 = this.uVUuuVnNVU.UuUVuuUu(var11);
                  double var13 = this.uVUuuVnNVU.uUnuvNvvNU;
                  if (var7.uNNnnnuuuN() && var13 <= 3.75) {
                     var7.nuUnNvnuUu();
                     if (var7.UuUVuuUu().equalsIgnoreCase(VVuuUN)) {
                        uNNnnnuuuN();
                     }
                  }

                  String var15 = this.UuUVuuUu(var7);
                  String var16 = this.UuUVuuUu(var13);
                  if (!var12) {
                     VNVNvuUn.UuUVuuUu(var2, var11, var7.UuUVuuUu(), var16, var8, var1.nuUnNvnuUu(), var1.VVuuUN());
                  } else {
                     if (!var5) {
                        UvVNVuNUVvuv.UuUVuuUu(var2);
                        var5 = true;
                     }

                     this.vNUvnnVnUvu
                        .UuUVuuUu(var2, this.uVUuuVnNVU.UuUVuuUu, this.uVUuuVnNVU.C00OOC00oO, var7.UuUVuuUu(), var15, var16, null, var8, var7.uVUuuVnNVU());
                  }
               }
            }
         }
      }
   }

   private void nuUnNvnuUu() {
      if (UuUVuuUu.method_32118() == Float.MAX_VALUE && UuUVuuUu.method_32119() == Float.MAX_VALUE) {
         if (NuuvVnVNN.C00OOC00oO(VVuuUN) != null) {
            NuuvVnVNN.UuUVuuUu(VVuuUN);
            uNNnnnuuuN();
         }
      }
   }

   private String UuUVuuUu(uvNvNVNVnUu var1) {
      int var2 = class_3532.method_15357(var1.C00OOC00oO());
      int var3 = class_3532.method_15357(var1.uUnuvNvvNU());
      int var4 = class_3532.method_15357(var1.vVvUvVVuuNvV());
      oO0OcCC0OCO.NVnVnNnN var5 = this.vuuuNvNuv.computeIfAbsent(var1.UuUVuuUu(), var0 -> new oO0OcCC0OCO.NVnVnNnN());
      if (var5.UuUVuuUu == null || var5.C00OOC00oO != var2 || var5.uUnuvNvvNU != var3 || var5.vVvUvVVuuNvV != var4) {
         var5.C00OOC00oO = var2;
         var5.uUnuvNvvNU = var3;
         var5.vVvUvVVuuNvV = var4;
         this.UnUNVVVNuv.setLength(0);
         this.UnUNVVVNuv.append(var2).append(", ").append(var3).append(", ").append(var4);
         var5.UuUVuuUu = this.UnUNVVVNuv.toString();
      }

      return var5.UuUVuuUu;
   }

   private String UuUVuuUu(double var1) {
      int var3 = (int)Math.round(var1);
      if (this.nUUVuvU.UuUVuuUu == null || this.nUUVuvU.C00OOC00oO != var3) {
         this.nUUVuvU.C00OOC00oO = var3;
         this.UnUNVVVNuv.setLength(0);
         this.UnUNVVVNuv.append(var3).append(" м");
         this.nUUVuvU.UuUVuuUu = this.UnUNVVVNuv.toString();
      }

      return this.nUUVuvU.UuUVuuUu;
   }

   static {
      Loader.initialize();
   }

   static final class NVnVnNnN {
      String UuUVuuUu;
      int C00OOC00oO = Integer.MIN_VALUE;
      int uUnuvNvvNU = Integer.MIN_VALUE;
      int vVvUvVVuuNvV = Integer.MIN_VALUE;
   }
}
