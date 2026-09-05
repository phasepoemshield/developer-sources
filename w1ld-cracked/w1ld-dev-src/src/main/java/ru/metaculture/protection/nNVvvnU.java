package ru.metaculture.protection;

import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.lwjgl.glfw.GLFW;

public class nNVvvnU extends class_437 {
   public vvNVnVNVnNNn UuUVuuUu;
   public class_310 C00OOC00oO = class_310.method_1551();
   private static volatile boolean uUnuvNvvNU = false;

   public nNVvvnU() {
      super(class_2561.method_43470("Gui"));
   }

   public static void UuUVuuUu() {
      if (!uUnuvNvvNU) {
         uUnuvNvvNU = true;
         NUvnVVNvvu.UuUVuuUu(new Object() {
            @vuVvUNNvVNV
            public void UuUVuuUu(uVNnNvUnNUNu var1) {
               class_310 var2 = var1.uUnuvNvvNU();
               if (var2 != null && var2.field_1755 instanceof nNVvvnU) {
                  double[] var3 = new double[1];
                  double[] var4 = new double[1];
                  if (var2.method_22683() != null) {
                     GLFW.glfwGetCursorPos(var2.method_22683().method_4490(), var3, var4);
                     if (var2.field_1729 != null) {
                        var2.field_1729.method_1610();
                     }
                  }

                  int var5 = (int)var3[0];
                  int var6 = (int)var4[0];
                  Object var7 = null;
                  VUUVuNv.UuUVuuUu(var1.vVvUvVVuuNvV(), (class_332)var7, var5, var6, var2.method_61966().method_60636());
               }
            }
         });
      }
   }

   public void method_25394(class_332 var1, int var2, int var3, float var4) {
   }

   public void method_25420(class_332 var1, int var2, int var3, float var4) {
   }

   public void method_52752(class_332 var1) {
   }

   public boolean method_25402(double var1, double var3, int var5) {
      UnVNvNnU var6 = NVnVnNnN.UuUVuuUu();
      return var6 != null && nnUVNuUunvv.UuUVuuUu(var6, var1, var3, var5) ? true : true;
   }

   public boolean method_25406(double var1, double var3, int var5) {
      vvUVvVN.C00OOC00oO();
      return true;
   }

   public boolean method_25403(double var1, double var3, int var5, double var6, double var8) {
      return nuNuNnNV.UuUVuuUu(var1, var3, var5, var6, var8) ? true : true;
   }

   public boolean method_25401(double var1, double var3, double var5, double var7) {
      if (Math.abs(var7) > 1.0E-4) {
         int var9 = var7 > 0.0 ? -200 : -201;
         if (UUVNUUUnNUv.uNnUnnuNUnNu != null) {
            UUVNUUUnNUv.uNnUnnuNUnNu.vVvUvVVuuNvV = var9;
            UUVNUUUnNUv.uNnUnnuNUnNu.VVuuUN = false;
            UUVNUUUnNUv.uNnUnnuNUnNu = null;
            if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
               NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
            }

            return true;
         }

         if (UUVNUUUnNUv.UnUNuUU != null) {
            UUVNUUUnNUv.UnUNuUU.uNNnnnuuuN = var9;
            UUVNUUUnNUv.UnUNuUU.nvUVNnuu = false;
            UUVNUUUnNUv.uUnuvNvvNU(UUVNUUUnNUv.UnUNuUU).UuUVuuUu(1.0, 0.2F, VnuVvnV.UNnVVNvvnVvU);
            UUVNUUUnNUv.UnUNuUU = null;
            if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
               NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
            }

            return true;
         }
      }

      return nnUVNuUunvv.UuUVuuUu(var1, var3, var7) ? true : true;
   }

   public boolean method_25404(int var1, int var2, int var3) {
      return VnnNUVunuVNv.UuUVuuUu(var1, var2, var3) ? true : super.method_25404(var1, var2, var3);
   }

   public boolean method_25400(char var1, int var2) {
      return uNNNNvUuvUu.UuUVuuUu(var1, var2) ? true : super.method_25400(var1, var2);
   }

   public boolean method_25422() {
      return vnuNnvVNUNN.C00OOC00oO();
   }

   public void method_25419() {
      NVnVnU.UuUVuuUu().C00OOC00oO("Search");
      UUVNUUUnNUv.unNNVVNnvvV = false;
      UUVNUUUnNUv.VVnVNnunVvu = "";
      NVnVnNnN.UuUVuuUu.nvUVNnuu.UuUVuuUu(UUVNUUUnNUv.VUuuVUnun);
      super.method_25419();
   }

   public void method_25393() {
      super.method_25393();
      if (UUVNUUUnNUv.nVVUuvuNnUN && UUVNUUUnNUv.vuuuNvNuv.uUnuvNvvNU()) {
         this.method_25419();
         UUVNUUUnNUv.nVVUuvuNnUN = false;
      }
   }

   public boolean method_25421() {
      return false;
   }

   public void method_25426() {
      super.method_25426();
      this.UuUVuuUu = new vvNVnVNVnNNn();
      VUVUvnNunNn.C00OOC00oO();
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.field_1729 != null) {
         var1.field_1729.method_1610();
      }

      UUVNUUUnNUv.UUuUnNVNuuv = oOOOo0.values();
      UUVNUUUnNUv.vNnNuuvVn = NvVNvUvunNNu.values();
      UUVNUUUnNUv.uUVVvVVNvvn = 366.475F;
      UUVNUUUnNUv.vvUVNVvvNUv = 238.805F;
      UUVNUUUnNUv.nNnVnUNVV = 480.0F - UUVNUUUnNUv.uUVVvVVNvvn / 2.0F;
      UUVNUUUnNUv.nuunNvv = 260.0F - UUVNUUUnNUv.vvUVNVvvNUv / 2.0F;
      UUVNUUUnNUv.C00OOC00oO.uUnuvNvvNU();
      if (NVnVnNnN.UuUVuuUu.nvUVNnuu == null) {
         NVnVnNnN.UuUVuuUu.nvUVNnuu = new VVNUvNvu();
         NVnVnNnN.UuUVuuUu.nvUVNnuu.UuUVuuUu();
      }

      UUVNUUUnNUv.NVuNUuVnVUN = NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO();
      UUVNUUUnNUv.NVuunNnvvvVu = NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO();
      UUVNUUUnNUv.VUuuVUnun = NVnVnNnN.UuUVuuUu.nvUVNnuu.uUnuvNvvNU();
      if (NVnVnNnN.UuUVuuUu.C00OOC00oO == null) {
         NVnVnNnN.UuUVuuUu.C00OOC00oO = new uVvnVvvUVUv();
      }

      UUVNUUUnNUv.vVVuuVVv = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(UUVNUUUnNUv.VUuuVUnun);
   }
}
