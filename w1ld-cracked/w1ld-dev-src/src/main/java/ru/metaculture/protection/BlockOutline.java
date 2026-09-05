package ru.metaculture.protection;

import net.minecraft.class_1921;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_4184;
import net.minecraft.class_4588;
import net.minecraft.class_239.class_240;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "BlockOutline",
   uUnuvNvvNU = oOOOo0.Visuals,
   C00OOC00oO = "Плавная светящаяся обводка блока под прицелом"
)
public final class BlockOutline extends Module implements uvVVuUNNunn {
   private static final double vuvnUnVnUNnV = 0.0022;
   private static final int[] nnuUVNUuvvVU = new int[]{0, 1, 1, 5, 5, 4, 4, 0, 2, 3, 3, 7, 7, 6, 6, 2, 0, 2, 1, 3, 5, 7, 4, 6};
   private static final int[] nVVUuvuNnUN = new int[]{0, 1, 5, 4, 2, 6, 7, 3, 0, 4, 6, 2, 1, 3, 7, 5, 0, 2, 3, 1, 4, 5, 7, 6};
   public final nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Плавность", 0.55F, 0.0F, 1.0F, 0.01F, true);
   public final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Прозрачность", 1.0F, 0.05F, 1.0F, 0.01F, true);
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Толщина", 2.0F, 0.5F, 6.0F, 0.1F, false);
   public final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Расширение", 0.0F, 0.0F, 0.2F, 0.005F, false);
   public final vvNnnUNnVvn NnUuNNU = new vvNnnUNnVvn("Свечение", true);
   public final nNUuNvVn nNvNUVU = new nNUuNvVn("Сила свечения", 1.2F, 0.2F, 3.0F, 0.05F, false).UuUVuuUu(() -> !this.NnUuNNU.uUnuvNvvNU());
   public final vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Заливка", false);
   public final nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Прозрачность заливки", 0.22F, 0.02F, 0.8F, 0.01F, true).UuUVuuUu(() -> !this.UnUNuUU.uUnuvNvvNU());
   public final vvNnnUNnVvn UvUvUNuvNU = new vvNnnUNnVvn("Пульсация", false);
   public final nNUuNvVn c0oOOCcCoC0 = new nNUuNvVn("Скорость пульсации", 2.0F, 0.2F, 6.0F, 0.1F, false).UuUVuuUu(() -> !this.UvUvUNuvNU.uUnuvNvvNU());
   public final vvNnnUNnVvn VVnVNnunVvu = new vvNnnUNnVvn("Сквозь стены", false);
   public final UvNnUnuNUUU unNNVVNnvvV = new UvNnUnuNUUU("Цвет", "Тема", "Тема", "Свой", "Радуга");
   public final VnnUvVNuNuVv NuunnvnN = new VnnUvVNuNuVv("Свой цвет", 50.0F, 0.82F, 1.0F).C00OOC00oO(() -> !this.unNNVVNnvvV.C00OOC00oO("Свой"));
   public final nNUuNvVn NVUunUNUN = new nNUuNvVn("Скорость радуги", 1.0F, 0.1F, 4.0F, 0.1F, false).UuUVuuUu(() -> !this.unNNVVNnvvV.C00OOC00oO("Радуга"));
   public final ili11Iii1Ii UUVNuUNUvUnV = new ili11Iii1Ii("Foundry Shader", VnuVUNUv.ESP);
   private final double[] nNnVnUNVV = new double[6];
   private final double[] nuunNvv = new double[6];
   private final double[] uUVVvVVNvvn = new double[24];
   private boolean vvUVNVvvNUv;
   private float UuNnnVnuNNV;
   private long uUVvnUuNvvN;

   public BlockOutline() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.NVNnnvnuunNv,
            this.uVunuUNVVUUV,
            this.UNnVVNvvnVvU,
            this.uNnUnnuNUnNu,
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            this.c0oOOCcCoC0,
            this.VVnVNnunVvu,
            this.unNNVVNnvvV,
            this.NuunnvnN,
            this.NVUunUNUN,
            this.UUVNuUNUvUnV
         }
      );
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      vUnVuNUUUVu.UuUVuuUu().UuUVuuUu(this, this);
   }

   @Override
   public void C00OOC00oO() {
      vUnVuNUUUVu.UuUVuuUu().UuUVuuUu(this);
      this.UvnvNVnnnnNU();
      super.C00OOC00oO();
   }

   @Override
   public VnuVUNUv uUnuvNvvNU() {
      return VnuVUNUv.ESP;
   }

   @Override
   public String vVvUvVVuuNvV() {
      String var1 = this.UUVNuUNUvUnV == null ? "" : this.UUVNuUNUvUnV.UuuNnUvUuv();
      return var1 != null && !var1.isBlank() ? var1 : null;
   }

   @Override
   public boolean uNNnnnuuuN() {
      return true;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      vUnVuNUUUVu.UuUVuuUu().C00OOC00oO(this, this);
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1773 != null) {
         boolean var2 = this.UuuNnUvUuv();
         float var3 = this.uUnuvNvvNU(var2);
         if (this.vvUVNVvvNUv && !(var3 <= 0.003F)) {
            class_4184 var4 = uUnuvNvvNU.field_1773.method_19418();
            if (var4 != null) {
               class_243 var5 = var4.method_19326();
               Matrix4f var6 = var1.uUnuvNvvNU().method_23760().method_23761();
               this.UuUVuuUu(var5);
               float var7 = this.UvUvUNuvNU.uUnuvNvvNU() ? 0.78F + 0.22F * (float)Math.sin(vNVuvnUUnuUn() * this.c0oOOCcCoC0.uUnuvNvvNU() * Math.PI) : 1.0F;
               float var8 = class_3532.method_15363(var3 * this.uVunuUNVVUUV.uUnuvNvvNU() * var7, 0.0F, 1.0F);
               if (!(var8 <= 0.003F)) {
                  int var9 = this.nUUVuvU();
                  int var10 = var9 >> 16 & 0xFF;
                  int var11 = var9 >> 8 & 0xFF;
                  int var12 = var9 & 0xFF;
                  boolean var13 = !this.VVnVNnunVvu.uUnuvNvvNU();
                  float var14 = this.UNnVVNvvnVvU.uUnuvNvvNU();
                  class_4598 var15 = nNNnNvVVv.UuUVuuUu();
                  boolean var20 = false /* VF: Semaphore variable */;

                  try {
                     var20 = true;
                     if (this.UnUNuUU.uUnuvNvvNU()) {
                        int var16 = UuUVuuUu(this.uUVuVvuNUvnu.uUnuvNvvNU() * var8 * 255.0F);
                        if (var16 > 0) {
                           class_1921 var17 = var13 ? OOcCooOcCcO.vVvUvVVuuNvV() : OOcCooOcCcO.uNNnnnuuuN();
                           this.C00OOC00oO(var15.getBuffer(var17), var6, var10, var11, var12, var16);
                        }
                     }

                     if (this.NnUuNNU.uUnuvNvvNU()) {
                        float var22 = var14 * (2.4F + this.nNvNUVU.uUnuvNvvNU());
                        int var24 = UuUVuuUu(0.16F * this.nNvNUVU.uUnuvNvvNU() * var8 * 255.0F);
                        if (var24 > 0) {
                           this.UuUVuuUu(var15.getBuffer(UuUVuuUu(var22, var13)), var6, var10, var11, var12, var24);
                        }
                     }

                     int var23 = UuUVuuUu(var8 * 255.0F);
                     this.UuUVuuUu(var15.getBuffer(UuUVuuUu(var14, var13)), var6, var10, var11, var12, var23);
                     var20 = false;
                  } finally {
                     if (var20) {
                        nNNnNvVVv.C00OOC00oO();
                     }
                  }

                  nNNnNvVVv.C00OOC00oO();
               }
            }
         }
      } else {
         this.UvnvNVnnnnNU();
      }
   }

   private boolean UuuNnUvUuv() {
      class_239 var1 = uUnuvNvvNU.field_1765;
      if (var1 instanceof class_3965 var2 && var1.method_17783() == class_240.field_1332) {
         class_2338 var3 = var2.method_17777();
         if (var3 == null) {
            return false;
         } else {
            class_2680 var4 = uUnuvNvvNU.field_1687.method_8320(var3);
            if (var4 != null && !var4.method_26215()) {
               class_265 var5 = var4.method_26218(uUnuvNvvNU.field_1687, var3);
               if (var5 != null && !var5.method_1110()) {
                  class_238 var6 = var5.method_1107();
                  double var7 = this.uNnUnnuNUnNu.uUnuvNvvNU() + 0.0022;
                  this.nuunNvv[0] = var3.method_10263() + var6.field_1323 - var7;
                  this.nuunNvv[1] = var3.method_10264() + var6.field_1322 - var7;
                  this.nuunNvv[2] = var3.method_10260() + var6.field_1321 - var7;
                  this.nuunNvv[3] = var3.method_10263() + var6.field_1320 + var7;
                  this.nuunNvv[4] = var3.method_10264() + var6.field_1325 + var7;
                  this.nuunNvv[5] = var3.method_10260() + var6.field_1324 + var7;
                  return true;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private float uUnuvNvvNU(boolean var1) {
      long var2 = System.nanoTime();
      float var4 = this.uUVvnUuNvvN == 0L ? 0.0F : Math.min((float)(var2 - this.uUVvnUuNvvN) / 1.0E9F, 0.1F);
      this.uUVvnUuNvvN = var2;
      this.UuNnnVnuNNV = this.UuNnnVnuNNV + ((var1 ? 1.0F : 0.0F) - this.UuNnnVnuNNV) * UuUVuuUu(16.0F, var4);
      if (!var1 && this.UuNnnVnuNNV < 0.01F) {
         this.UuNnnVnuNNV = 0.0F;
         this.vvUVNVvvNUv = false;
         return 0.0F;
      } else if (!var1) {
         return this.UuNnnVnuNNV;
      } else {
         if (!this.vvUVNVvvNUv) {
            System.arraycopy(this.nuunNvv, 0, this.nNnVnUNVV, 0, 6);
            this.vvUVNVvvNUv = true;
         } else {
            float var5 = class_3532.method_16439(class_3532.method_15363(this.NVNnnvnuunNv.uUnuvNvvNU(), 0.0F, 1.0F), 42.0F, 4.5F);
            float var6 = UuUVuuUu(var5, var4);

            for (int var7 = 0; var7 < 6; var7++) {
               this.nNnVnUNVV[var7] = this.nNnVnUNVV[var7] + (this.nuunNvv[var7] - this.nNnVnUNVV[var7]) * var6;
            }
         }

         return this.UuNnnVnuNNV;
      }
   }

   private void UuUVuuUu(class_243 var1) {
      double var2 = this.nNnVnUNVV[0] - var1.field_1352;
      double var4 = this.nNnVnUNVV[1] - var1.field_1351;
      double var6 = this.nNnVnUNVV[2] - var1.field_1350;
      double var8 = this.nNnVnUNVV[3] - var1.field_1352;
      double var10 = this.nNnVnUNVV[4] - var1.field_1351;
      double var12 = this.nNnVnUNVV[5] - var1.field_1350;

      for (int var14 = 0; var14 < 8; var14++) {
         int var15 = var14 * 3;
         this.uUVVvVVNvvn[var15] = (var14 & 1) == 0 ? var2 : var8;
         this.uUVVvVVNvvn[var15 + 1] = (var14 & 2) == 0 ? var4 : var10;
         this.uUVVvVVNvvn[var15 + 2] = (var14 & 4) == 0 ? var6 : var12;
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, int var3, int var4, int var5, int var6) {
      for (byte var7 = 0; var7 < nnuUVNUuvvVU.length; var7 += 2) {
         int var8 = nnuUVNUuvvVU[var7] * 3;
         int var9 = nnuUVNUuvvVU[var7 + 1] * 3;
         double var10 = this.uUVVvVVNvvn[var8];
         double var12 = this.uUVVvVVNvvn[var8 + 1];
         double var14 = this.uUVVvVVNvvn[var8 + 2];
         double var16 = this.uUVVvVVNvvn[var9];
         double var18 = this.uUVVvVVNvvn[var9 + 1];
         double var20 = this.uUVVvVVNvvn[var9 + 2];
         double var22 = var16 - var10;
         double var24 = var18 - var12;
         double var26 = var20 - var14;
         double var28 = Math.sqrt(var22 * var22 + var24 * var24 + var26 * var26);
         if (!(var28 < 1.0E-6)) {
            float var30 = (float)(var22 / var28);
            float var31 = (float)(var24 / var28);
            float var32 = (float)(var26 / var28);
            var1.method_22918(var2, (float)var10, (float)var12, (float)var14).method_1336(var3, var4, var5, var6).method_22914(var30, var31, var32);
            var1.method_22918(var2, (float)var16, (float)var18, (float)var20).method_1336(var3, var4, var5, var6).method_22914(var30, var31, var32);
         }
      }
   }

   private void C00OOC00oO(class_4588 var1, Matrix4f var2, int var3, int var4, int var5, int var6) {
      for (byte var7 = 0; var7 < nVVUuvuNnUN.length; var7 += 4) {
         for (int var8 = 0; var8 < 4; var8++) {
            int var9 = nVVUuvuNnUN[var7 + var8] * 3;
            var1.method_22918(var2, (float)this.uUVVvVVNvvn[var9], (float)this.uUVVvVVNvvn[var9 + 1], (float)this.uUVVvVVNvvn[var9 + 2])
               .method_1336(var3, var4, var5, var6);
         }
      }
   }

   private static class_1921 UuUVuuUu(double var0, boolean var2) {
      return var2 ? OOcCooOcCcO.UuUVuuUu(var0) : OOcCooOcCcO.C00OOC00oO(var0);
   }

   private int nUUVuvU() {
      if (this.unNNVVNnvvV.C00OOC00oO("Радуга")) {
         float var1 = vNVuvnUUnuUn() * this.NVUunUNUN.uUnuvNvvNU() * 0.12F % 1.0F;
         return UuUVuuUu(var1 < 0.0F ? var1 + 1.0F : var1, 0.85F, 1.0F);
      } else {
         return this.unNNVVNnvvV.C00OOC00oO("Свой") ? this.NuunnvnN.vNUvnnVnUvu() & 16777215 : UnUNVVVNuv();
      }
   }

   private static int UnUNVVVNuv() {
      try {
         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nvUVNnuu != null) {
            NvVNvUvunNNu var0 = NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO();
            if (var0 == NvVNvUvunNNu.CUSTOM && NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO != null) {
               return NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO.vNUvnnVnUvu() & 16777215;
            }

            if (var0 != null && var0.UuUVuuUu() != null) {
               return var0.UuUVuuUu().getRGB() & 16777215;
            }
         }
      } catch (Throwable var1) {
      }

      return 6061311;
   }

   private static int UuUVuuUu(float var0, float var1, float var2) {
      float var3 = (float)Math.floor(var0 * 6.0F);
      float var4 = var0 * 6.0F - var3;
      float var5 = var2 * (1.0F - var1);
      float var6 = var2 * (1.0F - var4 * var1);
      float var7 = var2 * (1.0F - (1.0F - var4) * var1);
      float var8;
      float var9;
      float var10;
      switch ((int)var3 % 6) {
         case 0:
            var8 = var2;
            var9 = var7;
            var10 = var5;
            break;
         case 1:
            var8 = var6;
            var9 = var2;
            var10 = var5;
            break;
         case 2:
            var8 = var5;
            var9 = var2;
            var10 = var7;
            break;
         case 3:
            var8 = var5;
            var9 = var6;
            var10 = var2;
            break;
         case 4:
            var8 = var7;
            var9 = var5;
            var10 = var2;
            break;
         default:
            var8 = var2;
            var9 = var5;
            var10 = var6;
      }

      return Math.round(var8 * 255.0F) << 16 | Math.round(var9 * 255.0F) << 8 | Math.round(var10 * 255.0F);
   }

   private static int UuUVuuUu(float var0) {
      return class_3532.method_15340(Math.round(var0), 0, 255);
   }

   private static float UuUVuuUu(float var0, float var1) {
      return 1.0F - (float)Math.exp(-var0 * var1);
   }

   private static float vNVuvnUUnuUn() {
      return (float)(System.nanoTime() % 1000000000000L) / 1.0E9F;
   }

   private void UvnvNVnnnnNU() {
      this.vvUVNVvvNUv = false;
      this.UuNnnVnuNNV = 0.0F;
      this.uUVvnUuNvvN = 0L;
   }
}
