package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import net.minecraft.class_10799;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1921;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_4597.class_4598;
import net.minecraft.class_4668.class_4677;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ESP",
   C00OOC00oO = "Подцветка игроков",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class ESP extends Module {
   private static final int NnUuNNU = 2048;
   private static final int nNvNUVU = 96;
   private static final int UnUNuUU = VnVnuUn.uUnuvNvvNU(52, 255, 96, 255);
   public final VUVnvvnNN NVNnnvnuunNv = new VUVnvvnNN("Targets", new vvNnnUNnVvn("Players", true), new vvNnnUNnVvn("Mobs", true));
   public final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Distance", 72.0F, 8.0F, 200.0F, 1.0F, false);
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Fill", true);
   public final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Outline", true);
   private final List<class_1297> uUVuVvuNUvnu = new ArrayList<>(96);
   private final int[] UvUvUNuvNU = new int[4];
   private static final RenderPipeline c0oOOCcCoC0 = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("minecraft", "rendertype_lequal_depth_test"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderPipeline VVnVNnunVvu = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("minecraft", "rendertype_lines"))
         .withVertexFormat(class_290.field_1576, class_5596.field_29344)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 unNNVVNnvvV = class_1921.method_24049(
      "litka_esp_fill", 2048, false, true, c0oOOCcCoC0, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 NuunnvnN = class_1921.method_24049(
      "litka_esp_line", 2048, false, true, VVnVNnunVvu, class_4688.method_23598().method_23609(new class_4677(OptionalDouble.of(2.2))).method_23617(false)
   );

   public ESP() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         List var2 = this.UuuNnUvUuv();
         if (!var2.isEmpty()) {
            class_4598 var3 = nNNnNvVVv.UuUVuuUu();

            try {
               for (class_1297 var5 : var2) {
                  this.UuUVuuUu(var1.uUnuvNvvNU(), var3, var5, var1.vVvUvVVuuNvV());
               }
            } finally {
               nNNnNvVVv.C00OOC00oO();
            }
         }
      }
   }

   private List<class_1297> UuuNnUvUuv() {
      this.uUVuVvuNUvnu.clear();
      float var1 = this.uVunuUNVVUUV.uUnuvNvvNU() * this.uVunuUNVVUUV.uUnuvNvvNU();
      boolean var2 = this.NVNnnvnuunNv.C00OOC00oO("Players");
      boolean var3 = this.NVNnnvnuunNv.C00OOC00oO("Mobs");

      for (class_1297 var5 : uUnuvNvvNU.field_1687.method_18112()) {
         if (this.uUVuVvuNUvnu.size() >= 96) {
            break;
         }

         if (this.UuUVuuUu(var5, var2, var3) && !(uUnuvNvvNU.field_1724.method_5858(var5) > var1)) {
            this.uUVuVvuNUvnu.add(var5);
         }
      }

      return this.uUVuVvuNUvnu;
   }

   private boolean UuUVuuUu(class_1297 var1, boolean var2, boolean var3) {
      if (var1 != null && var1 != uUnuvNvvNU.field_1724) {
         if (!(var1 instanceof class_1309 var4 && var4.method_5805())) {
            return false;
         } else {
            return var1 instanceof class_1657 ? var2 : var3;
         }
      } else {
         return false;
      }
   }

   private void UuUVuuUu(class_4587 var1, class_4598 var2, class_1297 var3, float var4) {
      class_243 var5 = uUnuvNvvNU.field_1773.method_19418().method_19326();
      class_243 var6 = this.UuUVuuUu(var3, var4);
      class_238 var7 = var3.method_5829()
         .method_989(var6.field_1352 - var3.method_23317(), var6.field_1351 - var3.method_23318(), var6.field_1350 - var3.method_23321());
      float var8 = var3 instanceof class_1657 ? 0.09F : 0.06F;
      class_238 var9 = var7.method_1014(var8).method_989(-var5.field_1352, -var5.field_1351, -var5.field_1350);
      int var10 = this.C00OOC00oO(var3);
      float var11 = this.UuUVuuUu(var3);
      int var12 = VnVnuUn.nuUnNvnuUu(var10, 0.92F);
      int var13 = VnVnuUn.uNNnnnuuuN(var10, 0.62F);
      int var14 = VnVnuUn.uNNnnnuuuN(var10, 0.8F);
      int[] var15 = this.UvUvUNuvNU;
      var15[0] = VnVnuUn.C00OOC00oO(var12, var14, 0, 10);
      var15[1] = VnVnuUn.C00OOC00oO(var14, var13, 90, 10);
      var15[2] = VnVnuUn.C00OOC00oO(var13, var14, 180, 10);
      var15[3] = VnVnuUn.C00OOC00oO(var14, var12, 270, 10);
      Matrix4f var16 = var1.method_23760().method_23761();
      if (this.UNnVVNvvnVvU.uUnuvNvvNU()) {
         int var17 = (int)(class_3532.method_15363(var11, 0.1F, 1.0F) * 95.0F);
         class_4588 var18 = var2.getBuffer(unNNVVNnvvV);
         NNVuVnVvNU.UuUVuuUu(var18, var16, var9.field_1323, var9.field_1322, var9.field_1321, var9.field_1320, var9.field_1325, var9.field_1324, var15, var17);
      }

      if (this.uNnUnnuNUnNu.uUnuvNvvNU()) {
         int var19 = (int)(class_3532.method_15363(var11, 0.2F, 1.0F) * 255.0F);
         class_4588 var20 = var2.getBuffer(NuunnvnN);
         NNVuVnVvNU.UuUVuuUu(
            var20, var16, var9.field_1323, var9.field_1322, var9.field_1321, var9.field_1320, var9.field_1325, var9.field_1324, var15, var19, 0.18, 0.06
         );
      }
   }

   private class_243 UuUVuuUu(class_1297 var1, float var2) {
      double var3 = class_3532.method_16436(var2, var1.field_6038, var1.method_23317());
      double var5 = class_3532.method_16436(var2, var1.field_5971, var1.method_23318());
      double var7 = class_3532.method_16436(var2, var1.field_5989, var1.method_23321());
      return new class_243(var3, var5, var7);
   }

   private float UuUVuuUu(class_1297 var1) {
      float var2 = uUnuvNvvNU.field_1724.method_5739(var1);
      float var3 = Math.max(this.uVunuUNVVUUV.uUnuvNvvNU(), 1.0F);
      return 1.0F - class_3532.method_15363(var2 / var3, 0.0F, 1.0F);
   }

   private int C00OOC00oO(class_1297 var1) {
      if (var1 instanceof class_1657 var2) {
         String var3 = var2.method_7334() != null ? var2.method_7334().getName() : var2.method_5477().getString();
         return uNvUVUNvuUVV.UuUVuuUu(var3) ? UnUNuUU : VnVnuUn.uNnUnnuNUnNu(var2.method_5628() * 17);
      } else {
         return VnVnuUn.uNnUnnuNUnNu(var1.method_5628() * 11);
      }
   }
}
