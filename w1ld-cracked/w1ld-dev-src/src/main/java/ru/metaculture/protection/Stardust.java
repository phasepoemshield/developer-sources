package ru.metaculture.protection;

import com.google.gson.JsonObject;
import java.awt.Color;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Stardust",
   C00OOC00oO = "Цветное звездное небо и локальные светящиеся звезды",
   uUnuvNvvNU = oOOOo0.Visuals,
   vVvUvVVuuNvV = {uVUNNUnNvU.NEW}
)
public final class Stardust extends Module {
   private static final String c0oOOCcCoC0 = "Кастомные облака";
   private static final String VVnVNnunVvu = "Цвет облаков";
   public static final VnnUvVNuNuVv NVNnnvnuunNv = new VnnUvVNuNuVv("Цвет неба", 72.0F, 0.72F, 1.0F);
   public static final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Шейдер неба", oO00oO0O0oC.AURORA.UuUVuuUu(), oO00oO0O0oC.uUnuvNvvNU());
   public static final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Плотность звёзд", 1880.0F, 220.0F, 3600.0F, 20.0F, false);
   public static final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Яркость", 1.55F, 0.2F, 2.75F, 0.05F, false);
   public static final UvNnUnuNUUU NnUuNNU = new UvNnUnuNUUU("Время суток", "Ночь", "День", "Закат", "Рассвет", "Ночь", "Полночь", "Полдень");
   public static final VUVnvvnNN nNvNUVU = new VUVnvvnNN(
      "Настройки облаков", new vvNnnUNnVvn("Кастомные облака", false), new vvNnnUNnVvn("Цвет облаков", false)
   );
   public static final VnnUvVNuNuVv UnUNuUU = new VnnUvVNuNuVv("Цвет облаков", 0.0F, 0.0F, 1.0F, 1.0F).C00OOC00oO(() -> !nNvNUVU());
   public static final nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Сила цвета облаков", 1.0F, 0.0F, 1.0F, 0.05F, true).UuUVuuUu(() -> !nNvNUVU());
   public static long UvUvUNuvNU = -1L;
   private static volatile boolean unNNVVNnvvV;
   private static final float NuunnvnN = (float) (Math.PI * 2);
   private static final float NVUunUNUN = 16.0F;
   private static final float UUVNuUNUvUnV = 22.0F;
   private static final float vuvnUnVnUNnV = 0.74F;
   private int nnuUVNUuvvVU;
   private int nVVUuvuNnUN;
   private int nNnVnUNVV;
   private int nuunNvv = Integer.MIN_VALUE;
   private int uUVVvVVNvvn = Integer.MIN_VALUE;
   private int vvUVNVvvNUv = Integer.MIN_VALUE;
   private static volatile int UuNnnVnuNNV = 7175679;
   private static volatile int uUVvnUuNvvN = 5435580;

   public Stardust() {
      vNvVVuUVVuuN.UuUVuuUu();
      vVUuUUNUVUN.UuUVuuUu();
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, UNnVVNvvnVvU, uNnUnnuNUnNu, NnUuNNU, nNvNUVU, UnUNuUU, uUVuVvuNUvnu});
   }

   @Override
   public void UuUVuuUu() {
      this.nnuUVNUuvvVU = 0;
      this.nVVUuvuNnUN = 0;
      this.nNnVnUNVV = 8;
      this.nuunNvv = Integer.MIN_VALUE;
      this.uUVVvVVNvvn = Integer.MIN_VALUE;
      this.vvUVNVvvNUv = Integer.MIN_VALUE;
      unNNVVNnvvV = true;
      NnUuNNU();
      nvUnNvnvuN.C00OOC00oO();
      vvvnuUuUUvN.C00OOC00oO();
      super.UuUVuuUu();
   }

   @Override
   public void C00OOC00oO() {
      unNNVVNnvvV = false;
      UvUvUNuvNU = -1L;
      nvUnNvnvuN.C00OOC00oO();
      vvvnuUuUUvN.C00OOC00oO();
      super.C00OOC00oO();
   }

   @Override
   public void UuUVuuUu(JsonObject var1) {
      C00OOC00oO(var1);
      super.UuUVuuUu(var1);
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      class_310 var2 = var1.uUnuvNvvNU();
      if (var2 != null && var2.field_1687 != null && var2.field_1724 != null && var2.field_1773 != null) {
         NnUuNNU();
         UnUNuUU();
         int var3 = Math.max(0, Math.round(UNnVVNvvnVvU.uUnuvNvvNU()));
         int var4 = UuNnnVnuNNV;
         int var5 = uVunuUNVVUUV().C00OOC00oO();
         if (var3 != this.nuunNvv || var4 != this.uUVVvVVNvvn || var5 != this.vvUVNVvvNUv) {
            this.nnuUVNUuvvVU = 0;
            this.nuunNvv = var3;
            this.uUVVvVVNvvn = var4;
            this.vvUVNVvvNUv = var5;
            nvUnNvnvuN.C00OOC00oO();
            vvvnuUuUUvN.C00OOC00oO();
         }

         class_4184 var6 = var2.field_1773.method_19418();
         if (var6 != null) {
            class_243 var7 = var6.method_19326();
            class_638 var8 = var2.field_1687;
            int var9 = nvUnNvnvuN.UuUVuuUu();
            int var10 = var3 - var9;
            if (var10 > 0) {
               int var11 = Math.min(var10, var9 == 0 ? Math.min(var3, 760) : 188);

               for (int var12 = 0; var12 < var11; var12++) {
                  this.UuUVuuUu(var8, var7, 16.0F, 22.0F);
               }
            }

            int var13 = vvvnuUuUUvN.UuUVuuUu();
            if (var13 < Math.max(2, Math.round(uNnUnnuNUnNu.uUnuvNvvNU() * 2.6F))) {
               this.nNnVnUNVV--;
               if (this.nNnVnUNVV <= 0) {
                  this.UuUVuuUu(var8, var7);
                  float var14 = C00OOC00oO((this.nVVUuvuNnUN + 1) * 0.618034F + 0.491F);
                  this.nNnVnUNVV = Math.max(14, 64 - Math.round(uNnUnnuNUnNu.uUnuvNvvNU() * 14.0F) + (int)(var14 * 46.0F));
               }
            }
         }
      }
   }

   private void UuUVuuUu(class_638 var1, class_243 var2, float var3, float var4) {
      float var5 = C00OOC00oO((this.nnuUVNUuvvVU + 1) * 0.618034F + 0.173F);
      float var6 = C00OOC00oO((this.nnuUVNUuvvVU + 1) * 0.7548777F + 0.419F);
      float var7 = C00OOC00oO((this.nnuUVNUuvvVU + 1) * 0.5698403F + 0.271F);
      float var8 = C00OOC00oO((this.nnuUVNUuvvVU + 1) * 0.4386875F + 0.617F);
      float var9 = C00OOC00oO((this.nnuUVNUuvvVU + 1) * 0.3271949F + 0.383F);
      float var10 = C00OOC00oO((this.nnuUVNUuvvVU + 1) * 0.27917233F + 0.719F);
      float var11 = C00OOC00oO((this.nnuUVNUuvvVU + 1) * 0.21132487F + 0.127F);
      float var12 = var5 * (float) (Math.PI * 2) + (var9 - 0.5F) * 0.42F;
      float var13 = (float)Math.sqrt(var8);
      float var14 = 1.4F + var13 * Math.max(1.0F, var4 - 1.4F);
      float var16;
      if (var10 < 0.12F) {
         var16 = 0.55F + var6 * 3.15F;
         var14 = 2.2F + var13 * Math.max(1.0F, var4 - 2.2F);
      } else if (var10 < 0.42F) {
         var16 = 2.2F + (float)Math.pow(var6, 0.76F) * (var3 * 0.58F);
      } else if (var10 < 0.84F) {
         var16 = 4.2F + (float)Math.pow(var6, 0.48F) * var3;
      } else {
         var16 = var3 * (0.7F + var6 * 0.44F) + var11 * 4.5F;
         var14 = 1.8F + (float)Math.sqrt(var9) * Math.max(1.0F, var4 * 0.82F - 1.8F);
      }

      float var17 = UuUVuuUu(0.58F, 1.0F, var11);
      var14 *= 1.0F - var17 * 0.16F;
      var16 += (var9 - 0.44F) * var17 * 2.8F;
      double var18 = Math.cos(var12);
      double var20 = Math.sin(var12);
      double var22 = (var7 - 0.5F) * 0.0013;
      double var24 = (var5 - 0.5F) * 0.001;
      double var26 = (var6 - 0.5F) * 0.0013;
      var1.method_17452(
         nvUnNvnvuN.UuUVuuUu, true, var2.field_1352 + var18 * var14, var2.field_1351 + var16, var2.field_1350 + var20 * var14, var22, var24, var26
      );
      this.nnuUVNUuvvVU++;
   }

   private void UuUVuuUu(class_638 var1, class_243 var2) {
      float var3 = C00OOC00oO((this.nVVUuvuNnUN + 1) * 0.7548777F + 0.137F);
      float var4 = C00OOC00oO((this.nVVUuvuNnUN + 1) * 0.5698403F + 0.671F);
      float var5 = C00OOC00oO((this.nVVUuvuNnUN + 1) * 0.4386875F + 0.293F);
      float var6 = C00OOC00oO((this.nVVUuvuNnUN + 1) * 0.3271949F + 0.811F);
      float var7 = C00OOC00oO((this.nVVUuvuNnUN + 1) * 0.27917233F + 0.357F);
      float var8 = var3 * (float) (Math.PI * 2);
      float var9 = var8 + 2.1F + (var4 - 0.5F) * 0.86F;
      float var10 = 12.0F + var5 * 18.92F;
      float var11 = 16.0F * (0.64F + var6 * 0.78F) + 2.0F;
      double var12 = Math.cos(var8) * var10;
      double var14 = Math.sin(var8) * var10;
      double var16 = 0.118 + var7 * 0.092 + Math.min(0.08F, uNnUnnuNUnNu.uUnuvNvvNU() * 0.018F);
      double var18 = Math.cos(var9) * var16;
      double var20 = Math.sin(var9) * var16;
      double var22 = -0.03 - var4 * 0.052;
      var1.method_17452(vvvnuUuUUvN.UuUVuuUu, true, var2.field_1352 + var12, var2.field_1351 + var11, var2.field_1350 + var14, var18, var22, var20);
      this.nVVUuvuNnUN++;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(coOCCcooOcOO var1) {
      this.nnuUVNUuvvVU = 0;
      this.nVVUuvuNnUN = 0;
      this.nNnVnUNVV = 8;
      nvUnNvnvuN.C00OOC00oO();
      vvvnuUuUUvN.C00OOC00oO();
   }

   public static boolean UuuNnUvUuv() {
      return unNNVVNnvvV;
   }

   public static float nUUVuvU() {
      return uNnUnnuNUnNu.uUnuvNvvNU();
   }

   public static float UnUNVVVNuv() {
      return Math.min(uNnUnnuNUnNu.uUnuvNvvNU() * 0.74F, 1.65F);
   }

   public static float vNVuvnUUnuUn() {
      return 22.0F;
   }

   public static float UvnvNVnnnnNU() {
      return 23.0F;
   }

   public static int uVUVnuvnuVuv() {
      return UuNnnVnuNNV;
   }

   public static int NVNnnvnuunNv() {
      return uUVvnUuNvvN;
   }

   public static oO00oO0O0oC uVunuUNVVUUV() {
      return oO00oO0O0oC.UuUVuuUu(uVunuUNVVUUV.uUnuvNvvNU());
   }

   public static int UNnVVNvvnVvU() {
      return uVunuUNVVUUV().C00OOC00oO();
   }

   public static boolean uNnUnnuNUnNu() {
      return unNNVVNnvvV && UvUvUNuvNU >= 0L;
   }

   public static int UuUVuuUu(int var0) {
      return !nNvNUVU() ? var0 : UuUVuuUu(var0, UnUNuUU.uUnuvNvvNU(), uUVuVvuNUvnu.uUnuvNvvNU());
   }

   private static void NnUuNNU() {
      String var0 = NnUuNNU.uUnuvNvvNU();
      switch (var0) {
         case "День":
            UvUvUNuvNU = 1000L;
            break;
         case "Закат":
            UvUvUNuvNU = 12000L;
            break;
         case "Рассвет":
            UvUvUNuvNU = 23000L;
            break;
         case "Полночь":
            UvUvUNuvNU = 13000L;
            break;
         case "Ночь":
            UvUvUNuvNU = 18000L;
            break;
         case "Полдень":
            UvUvUNuvNU = 6000L;
            break;
         default:
            UvUvUNuvNU = 0L;
      }
   }

   private static boolean nNvNUVU() {
      return unNNVVNnvvV && nNvNUVU.C00OOC00oO("Кастомные облака") && nNvNUVU.C00OOC00oO("Цвет облаков");
   }

   private static void UnUNuUU() {
      int var0 = NVNnnvnuunNv.vNUvnnVnUvu() & 16777215;
      int var1 = UuUVuuUu(var0, uVunuUNVVUUV());
      if (var0 != UuNnnVnuNNV || var1 != uUVvnUuNvvN) {
         UuNnnVnuNNV = var0;
         uUVvnUuNvvN = var1;
      }
   }

   private static int UuUVuuUu(int var0, oO00oO0O0oC var1) {
      return switch (var1) {
         case STARDUST -> UuUVuuUu(var0, 0.34F, 0.68F, 1.08F);
         case TWILIGHT_RAYLEIGH -> UuUVuuUu(var0, 0.08F, 0.72F, 1.14F);
         case QUANTUM_NEBULA -> UuUVuuUu(var0, 0.5F, 0.86F, 1.2F);
         case CHRONOS_SINGULARITY -> UuUVuuUu(var0, 0.7F, 0.92F, 1.08F);
         default -> C00OOC00oO(var0);
      };
   }

   private static void C00OOC00oO(JsonObject var0) {
      if (var0 != null && var0.has("Settings")) {
         try {
            JsonObject var1 = var0.getAsJsonObject("Settings");
            if (var1 == null || !var1.has(uVunuUNVVUUV.UuUVuuUu)) {
               return;
            }

            String var2 = var1.get(uVunuUNVVUUV.UuUVuuUu).getAsString();
            oO00oO0O0oC var3 = oO00oO0O0oC.UuUVuuUu(var2);
            if (!var3.UuUVuuUu().equals(var2)) {
               var1.addProperty(uVunuUNVVUUV.UuUVuuUu, var3.UuUVuuUu());
            }
         } catch (Throwable var4) {
         }
      }
   }

   private static int C00OOC00oO(int var0) {
      return UuUVuuUu(var0, 0.32F, 0.74F, 0.92F);
   }

   private static int UuUVuuUu(int var0, float var1, float var2, float var3) {
      int var4 = var0 >>> 16 & 0xFF;
      int var5 = var0 >>> 8 & 0xFF;
      int var6 = var0 & 0xFF;
      float[] var7 = Color.RGBtoHSB(var4, var5, var6, null);
      float var8 = C00OOC00oO(var7[0] + var1);
      float var9 = C00OOC00oO(var2 + var7[1] * 0.2F, 0.0F, 1.0F);
      float var10 = C00OOC00oO(var3 + var7[2] * 0.1F, 0.0F, 1.0F);
      return Color.HSBtoRGB(var8, var9, var10) & 16777215;
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      float var3 = (var2 - var0) / (var1 - var0);
      if (var3 <= 0.0F) {
         return 0.0F;
      } else {
         return var3 >= 1.0F ? 1.0F : var3 * var3 * (3.0F - 2.0F * var3);
      }
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   private static float UuUVuuUu(float var0) {
      return !Float.isFinite(var0) ? 0.0F : Math.max(0.0F, Math.min(1.0F, var0));
   }

   private static float uUnuvNvvNU(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   private static int UuUVuuUu(int var0, Color var1, float var2) {
      float var3 = UuUVuuUu(var2 * (var1.getAlpha() / 255.0F));
      if (var3 <= 0.0F) {
         return var0;
      } else {
         int var4 = var0 >>> 24 & 0xFF;
         int var5 = var0 >>> 16 & 0xFF;
         int var6 = var0 >>> 8 & 0xFF;
         int var7 = var0 & 0xFF;
         int var8 = Math.round(uUnuvNvvNU(var5, var1.getRed(), var3));
         int var9 = Math.round(uUnuvNvvNU(var6, var1.getGreen(), var3));
         int var10 = Math.round(uUnuvNvvNU(var7, var1.getBlue(), var3));
         return var4 << 24 | var8 << 16 | var9 << 8 | var10;
      }
   }

   private static float C00OOC00oO(float var0) {
      return var0 - (float)Math.floor(var0);
   }
}
