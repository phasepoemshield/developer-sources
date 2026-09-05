package ru.metaculture.protection;

import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1944;
import net.minecraft.class_2338;
import net.minecraft.class_3532;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "FullBright",
   C00OOC00oO = "ПРОЗРЕВШИЙ",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class FullBright extends Module {
   private static final String c0oOOCcCoC0 = "Гамма";
   private static final String VVnVNnunVvu = "Эффект";
   private static final String unNNVVNnvvV = "Динамический";
   private static final String NuunnvnN = "Адаптивный";
   private static final String NVUunUNUN = "Факел";
   public UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Тип", "Гамма", "Гамма", "Эффект", "Динамический", "Адаптивный", "Факел");
   public nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Порог", 0.53F, 0.5F, 0.6F, 0.01F, true).UuUVuuUu(() -> !this.UnUNVVVNuv());
   public nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Кривая", 1.4F, 0.5F, 3.0F, 0.1F, false).UuUVuuUu(() -> !this.UnUNVVVNuv());
   public nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Радиус", 10.0F, 5.0F, 20.0F, 1.0F, false).UuUVuuUu(() -> !this.vNVuvnUUnuUn());
   public static volatile boolean NnUuNNU = false;
   public static volatile float nNvNUVU = 10.0F;
   public static volatile double UnUNuUU = 0.0;
   public static volatile double uUVuVvuNUvnu = 0.0;
   public static volatile double UvUvUNuvNU = 0.0;
   private int UUVNuUNUvUnV = Integer.MIN_VALUE;
   private int vuvnUnVnUNnV = Integer.MIN_VALUE;
   private int nnuUVNUuvvVU = Integer.MIN_VALUE;
   private boolean nVVUuvuNnUN = false;
   private int nNnVnUNVV;
   private int nuunNvv;
   private int uUVVvVVNvvn;
   private int vvUVNVvvNUv;
   private int UuNnnVnuNNV;
   private int uUVvnUuNvvN;

   public FullBright() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.UUVNuUNUvUnV = Integer.MIN_VALUE;
      this.vuvnUnVnUNnV = Integer.MIN_VALUE;
      this.nnuUVNUuvvVU = Integer.MIN_VALUE;
      if (uUnuvNvvNU.field_1769 != null && this.NnUuNNU()) {
         uUnuvNvvNU.field_1769.method_3279();
      }
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      this.UNnVVNvvnVvU();
      if (uUnuvNvvNU.field_1769 != null && this.NnUuNNU()) {
         uUnuvNvvNU.field_1769.method_3279();
      }

      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_6016(class_1294.field_5925);
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         if (this.uNnUnnuNUnNu()) {
            uUnuvNvvNU.field_1724.method_6016(class_1294.field_5925);
         }

         if (this.NVNnnvnuunNv.C00OOC00oO("Эффект")) {
            uUnuvNvvNU.field_1724.method_6092(new class_1293(class_1294.field_5925, 300, 0, false, false));
         }

         this.uVunuUNVVUUV();
      }
   }

   private void uVunuUNVVUUV() {
      if (this.vNVuvnUUnuUn() && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1769 != null) {
         nNvNUVU = this.uNnUnnuNUnNu.uUnuvNvvNU();
         UnUNuUU = uUnuvNvvNU.field_1724.method_23317();
         uUVuVvuNUvnu = uUnuvNvvNU.field_1724.method_23320();
         UvUvUNuvNU = uUnuvNvvNU.field_1724.method_23321();
         NnUuNNU = true;
         int var1 = class_3532.method_15357(UnUNuUU);
         int var2 = class_3532.method_15357(uUnuvNvvNU.field_1724.method_23318());
         int var3 = class_3532.method_15357(UvUvUNuvNU);
         if (var1 != this.UUVNuUNUvUnV || var2 != this.vuvnUnVnUNnV || var3 != this.nnuUVNUuvvVU) {
            if (this.nVVUuvuNnUN) {
               uUnuvNvvNU.field_1769.method_18146(this.nNnVnUNVV, this.nuunNvv, this.uUVVvVVNvvn, this.vvUVNVvvNUv, this.UuNnnVnuNNV, this.uUVvnUuNvvN);
            }

            int var4 = class_3532.method_15386(this.uNnUnnuNUnNu.uUnuvNvvNU()) + 1;
            this.nNnVnUNVV = var1 - var4;
            this.nuunNvv = var2 - var4;
            this.uUVVvVVNvvn = var3 - var4;
            this.vvUVNVvvNUv = var1 + var4;
            this.UuNnnVnuNNV = var2 + var4;
            this.uUVvnUuNvvN = var3 + var4;
            this.nVVUuvuNnUN = true;
            uUnuvNvvNU.field_1769.method_18146(this.nNnVnUNVV, this.nuunNvv, this.uUVVvVVNvvn, this.vvUVNVvvNUv, this.UuNnnVnuNNV, this.uUVvnUuNvvN);
            this.UUVNuUNUvUnV = var1;
            this.vuvnUnVnUNnV = var2;
            this.nnuUVNUuvvVU = var3;
         }
      } else {
         this.UNnVVNvvnVvU();
      }
   }

   private void UNnVVNvvnVvU() {
      if (NnUuNNU || this.nVVUuvuNnUN) {
         NnUuNNU = false;
         if (this.nVVUuvuNnUN && uUnuvNvvNU.field_1769 != null) {
            uUnuvNvvNU.field_1769.method_18146(this.nNnVnUNVV, this.nuunNvv, this.uUVVvVVNvvn, this.vvUVNVvvNUv, this.UuNnnVnuNNV, this.uUVvnUuNvvN);
         }

         this.nVVUuvuNnUN = false;
         this.UUVNuUNUvUnV = Integer.MIN_VALUE;
         this.vuvnUnVnUNnV = Integer.MIN_VALUE;
         this.nnuUVNUuvvVU = Integer.MIN_VALUE;
      }
   }

   public static int UuUVuuUu(int var0, int var1, int var2) {
      return UuUVuuUu(var0 + 0.5, var1 + 0.5, var2 + 0.5);
   }

   public static int UuUVuuUu(double var0, double var2, double var4) {
      if (!NnUuNNU) {
         return 0;
      } else {
         float var6 = nNvNUVU;
         if (var6 <= 0.0F) {
            return 0;
         } else {
            double var7 = var0 - UnUNuUU;
            double var9 = var2 - uUVuVvuNUvnu;
            double var11 = var4 - UvUvUNuvNU;
            double var13 = Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
            if (var13 >= var6) {
               return 0;
            } else {
               int var15 = Math.round(15.0F * (float)(1.0 - var13 / var6));
               return var15 < 1 ? 0 : Math.min(var15, 15);
            }
         }
      }
   }

   public boolean UuuNnUvUuv() {
      return this.NVNnnvnuunNv.C00OOC00oO("Гамма");
   }

   @Override
   public boolean nUUVuvU() {
      return this.NVNnnvnuunNv.C00OOC00oO("Динамический");
   }

   public boolean UnUNVVVNuv() {
      return this.NVNnnvnuunNv.C00OOC00oO("Адаптивный");
   }

   public boolean vNVuvnUUnuUn() {
      return this.NVNnnvnuunNv.C00OOC00oO("Факел");
   }

   public float UvnvNVnnnnNU() {
      return UuUVuuUu(this.uVunuUNVVUUV.uUnuvNvvNU(), 0.0F, 1.0F);
   }

   public float uVUVnuvnuVuv() {
      return UuUVuuUu(this.UNnVVNvvnVvU.uUnuvNvvNU(), 0.5F, 3.0F);
   }

   public float NVNnnvnuunNv() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         class_2338 var1 = uUnuvNvvNU.field_1724.method_24515();
         float var2 = uUnuvNvvNU.field_1687.method_8314(class_1944.field_9282, var1) / 15.0F;
         float var3 = uUnuvNvvNU.field_1687.method_8314(class_1944.field_9284, var1) / 15.0F;
         float var4 = UuUVuuUu(uUnuvNvvNU.field_1687.method_8532() % 24000L);
         float var5 = Math.max(var2, var3 * (1.0F - var4 * 0.7F));
         float var6 = UuUVuuUu(Math.max(1.0F - var5, var4 * 0.65F), 0.0F, 1.0F);
         float var7 = (float)Math.sin(System.currentTimeMillis() * 0.0018) * 0.035F;
         return 2.0F + UuUVuuUu(var6 + var7, 0.0F, 1.0F) * 198.0F;
      } else {
         return 80.0F;
      }
   }

   private boolean uNnUnnuNUnNu() {
      return this.NVNnnvnuunNv.C00OOC00oO("Гамма") || this.NVNnnvnuunNv.C00OOC00oO("Динамический") || this.NVNnnvnuunNv.C00OOC00oO("Адаптивный");
   }

   private boolean NnUuNNU() {
      return this.NVNnnvnuunNv.C00OOC00oO("Гамма") || this.NVNnnvnuunNv.C00OOC00oO("Динамический");
   }

   private static float UuUVuuUu(long var0) {
      if (var0 < 12000L) {
         return 0.0F;
      } else if (var0 < 14000L) {
         return (float)(var0 - 12000L) / 2000.0F;
      } else {
         return var0 < 22000L ? 1.0F : 1.0F - (float)(var0 - 22000L) / 2000.0F;
      }
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }
}
