package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.util.OptionalDouble;
import net.minecraft.class_10799;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_746;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_4597.class_4598;
import net.minecraft.class_4668.class_4677;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday"}
)
@ModuleRegister(
   UuUVuuUu = "ElytraTarget",
   C00OOC00oO = "Преследует таргета на элитре",
   uUnuvNvvNU = oOOOo0.Combat,
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY}
)
public class ElytraTarget extends Module {
   public final vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Перегонять", true);
   public final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Режим предикта", "ReallyWorld", "ReallyWorld", "ReallyWorld - 2", "Default");
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Сила предикта", 2.7F, 1.0F, 5.0F, 0.1F, false);
   public static final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Радиус обнаружения элитры", 20.0F, 5.0F, 60.0F, 1.0F, false).UuUVuuUu(() -> !UuuNnUvUuv());
   public final nNUuNvVn NnUuNNU = new nNUuNvVn("Растояние преследования", 30.0F, 10.0F, 100.0F, 5.0F, false);
   public final vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Разворот на 180", false);
   public final vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Рисовать предикт", true);
   public final nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Прозрачность", 40.0F, 0.0F, 255.0F, 1.0F, false).UuUVuuUu(() -> !this.UnUNuUU.uUnuvNvvNU());
   public final vvNnnUNnVvn UvUvUNuvNU = new vvNnnUNnVvn("От темы", true).UuUVuuUu(() -> !this.UnUNuUU.uUnuvNvvNU());
   public final UvNnUnuNUUU c0oOOCcCoC0 = new UvNnUnuNUUU("Вид квадрата", "Обычный", "Обычный", "Пунктир", "Диагонали")
      .UuUVuuUu(() -> !this.UnUNuUU.uUnuvNvvNU());
   private static final double VVnVNnunVvu = 0.35;
   private static final float unNNVVNnvvV = 2.5F;
   private class_243 NuunnvnN = null;
   private boolean NVUunUNUN = false;
   private class_1309 UUVNuUNUvUnV = null;
   private static final int vuvnUnVnUNnV = 2048;
   private static final RenderPipeline nnuUVNUuvvVU = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("minecraft", "rendertype_lequal_depth_test"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderPipeline nVVUuvuNnUN = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("minecraft", "rendertype_lines"))
         .withVertexFormat(class_290.field_1576, class_5596.field_29344)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 nNnVnUNVV = class_1921.method_24049(
      "elytra_target_fill", 2048, false, true, nnuUVNUuvvVU, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 nuunNvv = class_1921.method_24049(
      "elytra_target_line", 2048, false, true, nVVUuvuNnUN, class_4688.method_23598().method_23609(new class_4677(OptionalDouble.of(2.0))).method_23617(false)
   );

   public ElytraTarget() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.NVNnnvnuunNv,
            this.uVunuUNVVUUV,
            this.UNnVVNvvnVvU,
            uNnUnnuNUnNu,
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            this.c0oOOCcCoC0
         }
      );
   }

   public static boolean UuuNnUvUuv() {
      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         ElytraTarget var0 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(ElytraTarget.class);
         return var0 != null && var0.nuUnNvnuUu;
      } else {
         return false;
      }
   }

   @Override
   public void C00OOC00oO() {
      this.NuunnvnN = null;
      this.NVUunUNUN = false;
      this.UUVNuUNUvUnV = null;
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      this.NuunnvnN = null;
      if (!VUUuVvvnNVUu.UuUVuuUu() && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (this.NVNnnvnuunNv.uUnuvNvvNU() && uUnuvNvvNU.field_1724.method_6128()) {
            class_1309 var2 = this.nUUVuvU();
            if (var2 == null) {
               this.NVUunUNUN = false;
            } else {
               float var3 = uUnuvNvvNU.field_1724.method_5739(var2);
               class_243 var4 = this.C00OOC00oO(var2);
               this.NuunnvnN = var4;
               class_243 var5 = var4.method_1020(uUnuvNvvNU.field_1724.method_33571());
               if (!(var5.method_1027() < 1.0E-7)) {
                  float var6 = (float)Math.toDegrees(Math.atan2(-var5.field_1352, var5.field_1350));
                  float var7 = (float)class_3532.method_15350(
                     -Math.toDegrees(Math.atan2(var5.field_1351, Math.hypot(var5.field_1352, var5.field_1350))), -90.0, 90.0
                  );
                  if (this.UuUVuuUu(var3)) {
                     var6 = class_3532.method_15393(var6 + 180.0F);
                  }

                  COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var6, var7), 32.0F, 32.0F, 360.0F, 360.0F, 0, 12, true);
               }
            }
         } else {
            this.NVUunUNUN = false;
            this.UUVNuUNUvUnV = null;
         }
      }
   }

   private class_1309 nUUVuvU() {
      float var1 = uNnUnnuNUnNu.uUnuvNvvNU();
      float var2 = Math.max(this.NnUuNNU.uUnuvNvvNU(), var1);
      if (this.UuUVuuUu(this.UUVNuUNUvUnV) && uUnuvNvvNU.field_1724.method_5739(this.UUVNuUNUvUnV) <= var2) {
         return this.UUVNuUNUvUnV;
      } else {
         this.UUVNuUNUvUnV = null;
         class_1309 var3 = AttackAura.ccOO0COcoco0;
         if (this.UuUVuuUu(var3) && uUnuvNvvNU.field_1724.method_5739(var3) <= var2) {
            this.UUVNuUNUvUnV = var3;
            return this.UUVNuUNUvUnV;
         } else {
            class_1309 var4 = null;
            double var5 = var1 * var1;

            for (class_1297 var8 : uUnuvNvvNU.field_1687.method_18112()) {
               if (var8 instanceof class_1309 var9 && this.UuUVuuUu(var9)) {
                  double var10 = uUnuvNvvNU.field_1724.method_5858(var9);
                  if (var10 <= var5) {
                     var5 = var10;
                     var4 = var9;
                  }
               }
            }

            this.UUVNuUNUvUnV = var4;
            return var4;
         }
      }
   }

   private boolean UuUVuuUu(class_1309 var1) {
      return var1 != null && var1.method_5805() && var1 != uUnuvNvvNU.field_1724 && !(var1 instanceof class_746) && var1.method_6128();
   }

   private class_243 C00OOC00oO(class_1309 var1) {
      class_243 var2 = var1.method_19538().method_1031(0.0, var1.method_17682() * 0.5, 0.0);
      class_243 var3 = var1.method_18798();
      double var4 = this.UNnVVNvvnVvU.uUnuvNvvNU();
      if (this.uVunuUNVVUUV.C00OOC00oO("Default")) {
         return var2;
      } else if (this.uVunuUNVVUUV.C00OOC00oO("ReallyWorld - 2")) {
         class_243 var6 = var1.method_5720().method_1029().method_1021(2.0);
         return var2.method_1019(var6).method_1019(var3.method_1021(var4));
      } else {
         return var2.method_1019(var3.method_1021(var4));
      }
   }

   private boolean UuUVuuUu(float var1) {
      if (!this.nNvNUVU.uUnuvNvvNU()) {
         this.NVUunUNUN = false;
         return false;
      } else {
         float var2 = Math.max(2.5F, this.UNnVVNvvnVvU.uUnuvNvvNU());
         float var3 = var2 + 3.0F;
         if (!this.NVUunUNUN && var1 <= 2.5F) {
            this.NVUunUNUN = true;
         }

         if (this.NVUunUNUN && var1 >= var3) {
            this.NVUunUNUN = false;
         }

         return this.NVUunUNUN;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (this.UnUNuUU.uUnuvNvvNU() && this.NuunnvnN != null && uUnuvNvvNU.field_1687 != null) {
         class_243 var2 = uUnuvNvvNU.field_1773.method_19418().method_19326();
         double var3 = this.NuunnvnN.field_1352 - 0.35 - var2.field_1352;
         double var5 = this.NuunnvnN.field_1351 - 0.35 - var2.field_1351;
         double var7 = this.NuunnvnN.field_1350 - 0.35 - var2.field_1350;
         double var9 = this.NuunnvnN.field_1352 + 0.35 - var2.field_1352;
         double var11 = this.NuunnvnN.field_1351 + 0.35 - var2.field_1351;
         double var13 = this.NuunnvnN.field_1350 + 0.35 - var2.field_1350;
         int var15 = this.UvUvUNuvNU.uUnuvNvvNU() ? VnVnuUn.UuUVuuUu() : VnVnuUn.uUnuvNvvNU(255, 255, 255, 255);
         int[] var16 = new int[]{var15, var15, var15, var15};
         int var17 = (int)this.uUVuVvuNUvnu.uUnuvNvvNU();
         boolean var18 = this.c0oOOCcCoC0.C00OOC00oO("Диагонали");
         double var19 = this.c0oOOCcCoC0.C00OOC00oO("Пунктир") ? 0.12 : 0.5;
         double var21 = this.c0oOOCcCoC0.C00OOC00oO("Пунктир") ? 0.1 : 0.0;
         class_4598 var23 = nNNnNvVVv.UuUVuuUu();
         boolean var29 = false /* VF: Semaphore variable */;

         try {
            var29 = true;
            class_4587 var24 = var1.uUnuvNvvNU();
            Matrix4f var25 = var24.method_23760().method_23761();
            if (var17 > 0) {
               class_4588 var26 = var23.getBuffer(nNnVnUNVV);
               NNVuVnVvNU.UuUVuuUu(var26, var25, var3, var5, var7, var9, var11, var13, var16, var17);
            }

            class_4588 var31 = var23.getBuffer(nuunNvv);
            NNVuVnVvNU.UuUVuuUu(var31, var25, var3, var5, var7, var9, var11, var13, var16, 255, var19, var21);
            if (var18) {
               this.UuUVuuUu(var31, var25, var15, var3, var5, var7, var9, var11, var13);
               var29 = false;
            } else {
               var29 = false;
            }
         } finally {
            if (var29) {
               nNNnNvVVv.C00OOC00oO();
            }
         }

         nNNnNvVVv.C00OOC00oO();
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, int var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      int var16 = var3 >> 16 & 0xFF;
      int var17 = var3 >> 8 & 0xFF;
      int var18 = var3 & 0xFF;
      short var19 = 255;
      double[][] var20 = new double[][]{
         {var4, var6, var8, var10, var12, var14},
         {var10, var6, var8, var4, var12, var14},
         {var4, var6, var14, var10, var12, var8},
         {var10, var6, var14, var4, var12, var8}
      };

      for (double[] var24 : var20) {
         var1.method_22918(var2, (float)var24[0], (float)var24[1], (float)var24[2]).method_1336(var16, var17, var18, var19);
         var1.method_22918(var2, (float)var24[3], (float)var24[4], (float)var24[5]).method_1336(var16, var17, var18, var19);
      }
   }
}
