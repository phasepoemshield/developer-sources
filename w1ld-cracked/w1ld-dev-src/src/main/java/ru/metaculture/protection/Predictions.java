package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import net.minecraft.class_1044;
import net.minecraft.class_1060;
import net.minecraft.class_10799;
import net.minecraft.class_10868;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1671;
import net.minecraft.class_1676;
import net.minecraft.class_1682;
import net.minecraft.class_1753;
import net.minecraft.class_1764;
import net.minecraft.class_1771;
import net.minecraft.class_1776;
import net.minecraft.class_1779;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1823;
import net.minecraft.class_1835;
import net.minecraft.class_1921;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4184;
import net.minecraft.class_4537;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_640;
import net.minecraft.class_7923;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Predictions",
   C00OOC00oO = "Показ предикта траэктории полета",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class Predictions extends Module {
   private static final int NVNnnvnuunNv = 240;
   private static final int uVunuUNVVUUV = 96;
   private static final int UNnVVNvvnVvU = 2097152;
   private static final int uNnUnnuNUnNu = 72;
   private static final int NnUuNNU = 10;
   private static final int nNvNUVU = 6;
   private static final int UnUNuUU = 8;
   private static final int uUVuVvuNUvnu = 6;
   private static final long UvUvUNuvNU = System.nanoTime();
   private static final float c0oOOCcCoC0 = 1.5F;
   private static final float VVnVNnunVvu = 0.5F;
   private static final float unNNVVNnvvV = 0.7F;
   private static final float NuunnvnN = -20.0F;
   private static final double NVUunUNUN = 0.99;
   private static final double UUVNuUNUvUnV = 0.8;
   private static final float vuvnUnVnUNnV = 0.1F;
   private static final float nnuUVNUuvvVU = 0.1F;
   private static final float nVVUuvuNnUN = 0.1F;
   private static final double nNnVnUNVV = 64.0;
   private static final double nuunNvv = 16.0;
   private static final double[] uUVVvVVNvvn = new double[73];
   private static final double[] vvUVNVvvNUv = new double[73];
   private static final float[] UuNnnVnuNNV = new float[73];
   private static final double[] uUVvnUuNvvN = new double[7];
   private static final double[] UUuUnNVNuuv = new double[7];
   private static final float[] NVuNUuVnVUN = new float[7];
   private static final float[] NVuunNnvvvVu = new float[11];
   private static final class_2960 vNnNuuvVn;
   private static final BlendFunction VUuuVUnun;
   private static final RenderPipeline vVVuuVVv;
   private static final RenderPipeline VuunNUUUvu;
   private static final RenderPipeline NNUUNUuVNNVn;
   private static final RenderPipeline VvVvnNUnvuvV;
   private static final class_1921 ccOO0COcoco0;
   private static final class_1921 NUVvUUVuVNVv;
   private static final class_1921 nNuVunNUVu;
   private static final class_1921 UNvvunVVn;
   private final vvNnnUNnVvn UnvuVuVnNuvu = new vvNnnUNnVvn("ThroughWalls", true);
   private final vvNnnUNnVvn UvNNVUVNVuvV = new vvNnnUNnVvn("AimPreview", true);
   private final vvNnnUNnVvn NnunUUnU = new vvNnnUNnVvn("ShowOwner", false);
   private final nnvNuuNvvuu nvuVvuNnNUnv = new nnvNuuNvvuu() {};
   private final List<Predictions.nvnNNunvv> NnVnNVN = new ArrayList<>();
   private final Map<String, Predictions.nvnNNunvv> vnvvNvUnVv = new HashMap<>();
   private class_1799 OCOocoOoOO;
   private final List<Predictions.nvnNNunvv> o0Ooc0COOoc = new ArrayList<>();
   private long nvvnUnUn = Long.MIN_VALUE;
   private final double[] UnUUVuVunvVu = new double[11];
   private final double[] nnvuvUNuUnN = new double[11];

   public Predictions() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.UnvuVuVnNuvu, this.UvNNVUVNVuvV, this.NnunUUnU});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (uUnuvNvvNU.field_1687 == null || uUnuvNvvNU.field_1724 == null) {
         this.UuuNnUvUuv();
      } else if (uUnuvNvvNU.field_1690 != null && uUnuvNvvNU.field_1690.method_31044() != null && uUnuvNvvNU.field_1690.method_31044().method_31034()) {
         this.UuUVuuUu(var1.vVvUvVVuuNvV());
         if (!this.NnVnNVN.isEmpty()) {
            class_4587 var2 = var1.uUnuvNvvNU();
            Matrix4f var3 = var2.method_23760().method_23761();
            class_243 var4 = uUnuvNvvNU.field_1773.method_19418().method_19326();
            class_1921 var5 = this.UnvuVuVnNuvu.uUnuvNvvNU() ? NUVvUUVuVNVv : ccOO0COcoco0;
            class_1921 var6 = this.UnvuVuVnNuvu.uUnuvNvvNU() ? UNvvunVVn : nNuVunNUVu;
            int var7 = VnVnuUn.uNNnnnuuuN(VnVnuUn.UuUVuuUu(), 235);
            class_4598 var8 = nNNnNvVVv.UuUVuuUu();

            try {
               class_4588 var9 = var8.getBuffer(var5);

               for (Predictions.nvnNNunvv var11 : this.NnVnNVN) {
                  boolean var12 = var11.hitEntity() != null;
                  boolean var13 = var11.blockHit() != null && var11.blockHit().method_17783() != class_240.field_1333;
                  boolean var14 = var12 || var13;
                  int var15 = var12 ? -51112 : var7;
                  this.UuUVuuUu(var9, var3, var4, var11.path(), var15, var14);
               }
            } finally {
               nNNnNvVVv.C00OOC00oO();
            }

            var8 = nNNnNvVVv.UuUVuuUu();

            try {
               class_4588 var28 = var8.getBuffer(var6);

               for (Predictions.nvnNNunvv var30 : this.NnVnNVN) {
                  boolean var31 = var30.hitEntity() != null;
                  boolean var32 = var30.blockHit() != null && var30.blockHit().method_17783() != class_240.field_1333;
                  boolean var33 = var31 || var32;
                  int var34 = var31 ? -51112 : var7;
                  int var16 = var34 >> 16 & 0xFF;
                  int var17 = var34 >> 8 & 0xFF;
                  int var18 = var34 & 0xFF;
                  this.C00OOC00oO(var28, var3, var4, var30.path(), var34, var33);
                  if (var31) {
                     class_238 var19 = var30.targetBox() != null ? var30.targetBox() : var30.hitEntity().method_5829();
                     this.UuUVuuUu(
                        var28,
                        var3,
                        var19.field_1323 - var4.field_1352,
                        var19.field_1322 - var4.field_1351,
                        var19.field_1321 - var4.field_1350,
                        var19.field_1320 - var4.field_1352,
                        var19.field_1325 - var4.field_1351,
                        var19.field_1324 - var4.field_1350,
                        var16,
                        var17,
                        var18,
                        230
                     );
                     this.UuUVuuUu(var28, var3, var4, var19, var16, var17, var18);
                  } else if (var32) {
                     class_243 var35 = var30.blockRenderPos();
                     if (var35 != null) {
                        this.UuUVuuUu(
                           var28,
                           var3,
                           var35.field_1352 - var4.field_1352,
                           var35.field_1351 - var4.field_1351,
                           var35.field_1350 - var4.field_1350,
                           var35.field_1352 + 1.0 - var4.field_1352,
                           var35.field_1351 + 1.0 - var4.field_1351,
                           var35.field_1350 + 1.0 - var4.field_1350,
                           var16,
                           var17,
                           var18
                        );
                     }

                     this.UuUVuuUu(var28, var3, var4, var30.blockHit(), var30.landingPos(), var34);
                  }
               }
            } finally {
               nNNnNvVVv.C00OOC00oO();
            }
         }
      } else {
         this.UuuNnUvUuv();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         if (uUnuvNvvNU.field_1690 != null && uUnuvNvvNU.field_1690.method_31044() != null && uUnuvNvvNU.field_1690.method_31044().method_31034()) {
            if (!this.NnVnNVN.isEmpty()) {
               UnVNvNnU var2 = var1.vVvUvVVuuNvV();
               var2.UuUVuuUu(23.0F);

               for (Predictions.nvnNNunvv var4 : this.NnVnNVN) {
                  if (!var4.isPreAim()) {
                     class_243 var5 = VnNnNnvuvn.UuUVuuUu(var4.landingPos());
                     if (var5 != null && !(var5.field_1350 < 0.0) && !(var5.field_1350 > 1.0)) {
                        float var6 = (float)var5.field_1352;
                        float var7 = (float)var5.field_1351;
                        float var8 = 1.0F;
                        this.UuUVuuUu(var2, var6, var7, var8, var4);
                        if (this.NnunUUnU.uUnuvNvvNU() && this.C00OOC00oO(var4)) {
                           this.C00OOC00oO(var2, var6, var7 - 31.0F * var8, var8, var4);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void UuUVuuUu(float var1) {
      this.NnVnNVN.clear();
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         ArrayList var2 = new ArrayList();
         class_1799 var3 = uUnuvNvvNU.field_1724.method_6047();
         boolean var4 = false;
         if (var3.method_7960() || !this.UuUVuuUu(var3.method_7909())) {
            var3 = uUnuvNvvNU.field_1724.method_6079();
            var4 = true;
         }

         if (this.UvNNVUVNVuvV.uUnuvNvvNU() && !var3.method_7960() && this.UuUVuuUu(var3.method_7909())) {
            Predictions.nvnNNunvv var5 = this.UuUVuuUu(uUnuvNvvNU.field_1724, var3, var4, var1);
            if (var5 != null) {
               var2.add(var5);
            }
         }

         if (ClickPearl.uVunuUNVVUUV && (var3.method_7960() || !(var3.method_7909() instanceof class_1776))) {
            if (this.OCOocoOoOO == null) {
               this.OCOocoOoOO = new class_1799(class_1802.field_8634);
            }

            Predictions.nvnNNunvv var10 = this.UuUVuuUu(uUnuvNvvNU.field_1724, this.OCOocoOoOO, false, var1);
            if (var10 != null) {
               var2.add(var10);
            }
         }

         long var11 = uUnuvNvvNU.field_1687.method_8510();
         if (var11 != this.nvvnUnUn) {
            this.nvvnUnUn = var11;
            this.o0Ooc0COOoc.clear();

            for (class_1676 var8 : uUnuvNvvNU.field_1687
               .method_8390(class_1676.class, uUnuvNvvNU.field_1724.method_5829().method_1014(256.0), var0 -> !(var0 instanceof class_1671))) {
               Predictions.nvnNNunvv var9 = this.UuUVuuUu(var8, var1);
               if (var9 != null) {
                  this.o0Ooc0COOoc.add(var9);
               }
            }
         }

         var2.addAll(this.o0Ooc0COOoc);
         this.C00OOC00oO(var2);
      } else {
         this.vnvvNvUnVv.clear();
         this.o0Ooc0COOoc.clear();
         this.nvvnUnUn = Long.MIN_VALUE;
      }
   }

   private boolean UuUVuuUu(class_1792 var1) {
      return var1 instanceof class_1776
         || var1 instanceof class_1823
         || var1 instanceof class_1771
         || var1 instanceof class_1753
         || var1 instanceof class_1764
         || var1 instanceof class_1835
         || var1 instanceof class_4537
         || var1 instanceof class_1779;
   }

   private Predictions.nvnNNunvv UuUVuuUu(class_1657 var1, class_1799 var2, boolean var3, float var4) {
      class_1792 var5 = var2.method_7909();
      Predictions.NVnVnNnN var6 = this.UuUVuuUu(var1, var5);
      class_2960 var7 = this.C00OOC00oO(var5);
      class_4184 var8 = uUnuvNvvNU.field_1773.method_19418();
      float var9 = var8.method_19330();
      float var10 = var8.method_19329();
      class_243 var11 = this.UuUVuuUu(var1, var9, var10, var6.speed(), var6.pitchOffset());
      class_243 var12 = var8.method_19326().method_1023(0.0, 0.1, 0.0);
      class_243 var13 = class_243.method_1030(var10, var9);
      class_243 var14 = class_243.method_1030(0.0F, var9 + 90.0F);
      float var15 = var3 ? -0.3F : 0.3F;
      class_243 var16 = var12.method_1019(var13.method_1021(0.4)).method_1019(var14.method_1021(var15)).method_1023(0.0, 0.2, 0.0);
      class_243 var17 = var16.method_1020(var12);
      String var18 = (var3 ? "self:off:" : "self:main:") + class_7923.field_41178.method_10221(var5);
      return this.UuUVuuUu(var1, var12, var17, var11, var6.gravity(), 0.99, var6.applyPhysicsBeforeMove(), var4, var18, "You", var7, true);
   }

   private Predictions.NVnVnNnN UuUVuuUu(class_1657 var1, class_1792 var2) {
      double var3 = 1.5;
      double var5 = 0.03;
      float var7 = 0.0F;
      boolean var8 = var2 instanceof class_1776 || var2 instanceof class_1823 || var2 instanceof class_1771;
      if (var2 instanceof class_1753) {
         int var9 = var1.method_6048();
         float var10 = var9 == 0 ? 1.0F : class_1753.method_7722(var9);
         var3 = var10 * 3.0;
         var5 = 0.05;
         var8 = false;
      } else if (var2 instanceof class_1764) {
         var3 = 3.15;
         var5 = 0.05;
         var8 = false;
      } else if (var2 instanceof class_1835) {
         var3 = 2.5;
         var5 = 0.05;
         var8 = false;
      } else if (var2 instanceof class_1779) {
         var3 = 0.7F;
         var5 = 0.07;
         var7 = -20.0F;
         var8 = true;
      } else if (var2 instanceof class_4537) {
         var3 = 0.5;
         var5 = 0.05;
         var7 = -20.0F;
         var8 = true;
      }

      return new Predictions.NVnVnNnN(var3, var5, var7, var8);
   }

   private class_243 UuUVuuUu(class_1657 var1, float var2, float var3, double var4, float var6) {
      float var7 = var2 * (float) (Math.PI / 180.0);
      float var8 = var3 * (float) (Math.PI / 180.0);
      float var9 = (var3 + var6) * (float) (Math.PI / 180.0);
      double var10 = -class_3532.method_15374(var7) * class_3532.method_15362(var8);
      double var12 = -class_3532.method_15374(var9);
      double var14 = class_3532.method_15362(var7) * class_3532.method_15362(var8);
      class_243 var16 = new class_243(var10, var12, var14).method_1029().method_1021(var4);
      class_243 var17 = var1.method_60478();
      return var16.method_1031(var17.field_1352, var1.method_24828() ? 0.0 : var17.field_1351, var17.field_1350);
   }

   private Predictions.nvnNNunvv UuUVuuUu(class_1676 var1, float var2) {
      if (!var1.method_31481() && !(var1.method_18798().method_1027() < 0.001)) {
         class_243 var3 = var1.method_30950(var2);
         double var4 = var1.method_56989();
         class_2960 var6 = this.UuUVuuUu(var1);
         boolean var7 = var1 instanceof class_1682;
         double var8 = var7 && var1.method_5799() ? 0.8 : 0.99;
         return this.UuUVuuUu(
            var1,
            var3,
            class_243.field_1353,
            var1.method_18798(),
            var4,
            var8,
            var7,
            var2,
            "entity:" + var1.method_5628(),
            Predictions.nvnNNunvv.resolveOwnerName(var1),
            var6,
            false
         );
      } else {
         return null;
      }
   }

   private Predictions.nvnNNunvv UuUVuuUu(
      class_1297 var1,
      class_243 var2,
      class_243 var3,
      class_243 var4,
      double var5,
      double var7,
      boolean var9,
      float var10,
      String var11,
      String var12,
      class_2960 var13,
      boolean var14
   ) {
      if (uUnuvNvvNU.field_1687 == null) {
         return null;
      } else {
         class_243 var15 = var4;
         class_243 var16 = var2;
         ArrayList var17 = new ArrayList();
         var17.add(var2.method_1019(var3));
         int var18 = 0;
         class_3965 var19 = null;
         class_1297 var20 = null;
         byte var21 = 7;

         for (int var22 = 0; var22 < 240; var22++) {
            class_243 var23 = var9 ? this.UuUVuuUu(var15, var5, var7) : var15;
            class_243 var24 = var16.method_1019(var23);
            var19 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var16, var24, class_3960.field_17558, class_242.field_1348, var1));
            class_243 var25 = var19.method_17783() != class_240.field_1333 ? var19.method_17784() : var24;
            class_238 var26 = new class_238(var16, var25).method_1014(1.0);
            double var27 = Double.MAX_VALUE;
            class_243 var29 = null;
            class_1297 var30 = null;

            for (class_1297 var32 : uUnuvNvvNU.field_1687.method_8333(var1, var26, var0 -> !var0.method_7325() && var0.method_5805())) {
               class_238 var33 = var32.method_5829().method_1014(0.3);
               Optional var34 = var33.method_992(var16, var25);
               if (var34.isPresent()) {
                  double var35 = var16.method_1025((class_243)var34.get());
                  if (var35 < var27) {
                     var27 = var35;
                     var29 = (class_243)var34.get();
                     var30 = var32;
                  }
               }
            }

            double var38 = Math.max(0.0, 1.0 - (double)(var22 + 1) / var21);
            if (var30 != null) {
               var17.add(var29.method_1019(var3.method_1021(var38)));
               var20 = var30;
               var16 = var29;
               var18 = var22 + 1;
               break;
            }

            if (var19.method_17783() != class_240.field_1333) {
               var17.add(var19.method_17784().method_1019(var3.method_1021(var38)));
               var16 = var19.method_17784();
               var18 = var22 + 1;
               break;
            }

            var17.add(var24.method_1019(var3.method_1021(var38)));
            var16 = var24;
            var15 = var9 ? var23 : this.C00OOC00oO(var15, var5, var7);
            var18 = var22 + 1;
         }

         if (var17.size() < 2) {
            return null;
         } else {
            class_238 var37 = var20 != null ? this.UuUVuuUu(var20, var10) : null;
            return new Predictions.nvnNNunvv(var11, this.UuUVuuUu(var17), var16, this.UuUVuuUu(var19), var37, var18, var20, var19, var12, var13, var14);
         }
      }
   }

   private List<class_243> UuUVuuUu(List<class_243> var1) {
      int var2 = var1.size();
      if (var2 <= 96) {
         return var1;
      } else {
         int var3 = Math.max(2, (int)Math.ceil(var2 / 96.0));
         ArrayList var4 = new ArrayList(var2 / var3 + 2);

         for (int var5 = 0; var5 < var2; var5 += var3) {
            var4.add((class_243)var1.get(var5));
         }

         class_243 var6 = (class_243)var1.get(var2 - 1);
         if (var4.isEmpty() || var4.get(var4.size() - 1) != var6) {
            var4.add(var6);
         }

         return var4;
      }
   }

   private void C00OOC00oO(List<Predictions.nvnNNunvv> var1) {
      if (var1.isEmpty()) {
         this.vnvvNvUnVv.clear();
      } else {
         HashMap var2 = new HashMap();

         for (Predictions.nvnNNunvv var4 : var1) {
            Predictions.nvnNNunvv var5 = this.UuUVuuUu(var4);
            this.NnVnNVN.add(var5);
            var2.put(var5.key(), var5);
         }

         this.vnvvNvUnVv.clear();
         this.vnvvNvUnVv.putAll(var2);
      }
   }

   private Predictions.nvnNNunvv UuUVuuUu(Predictions.nvnNNunvv var1) {
      Predictions.nvnNNunvv var2 = this.vnvvNvUnVv.get(var1.key());
      if (var2 != null && var2.path().size() >= 2 && var1.path().size() >= 2) {
         if (var2.path().get(0).method_1025(var1.path().get(0)) > 256.0) {
            return var1;
         } else {
            List var3 = this.UuUVuuUu(var2.path(), var1.path(), 0.1F);
            float var4 = var1.isPreAim() ? 0.1F : 0.1F;
            class_243 var5 = this.UuUVuuUu(var2.landingPos(), var1.landingPos(), var4, 64.0);
            class_243 var6 = this.C00OOC00oO(var2.blockRenderPos(), var1.blockRenderPos(), var4, 64.0);
            class_238 var7 = this.UuUVuuUu(var2, var1, var1.isPreAim() ? 0.1F : 0.1F);
            return var1.withRenderState(var3, var5, var6, var7);
         }
      } else {
         return var1;
      }
   }

   private List<class_243> UuUVuuUu(List<class_243> var1, List<class_243> var2, float var3) {
      ArrayList var4 = new ArrayList(var2.size());

      for (int var5 = 0; var5 < var2.size(); var5++) {
         class_243 var6 = var5 < var1.size() ? this.UuUVuuUu((class_243)var1.get(var5), (class_243)var2.get(var5), var3) : (class_243)var2.get(var5);
         var4.add(var6);
      }

      return var4;
   }

   private class_243 UuUVuuUu(class_243 var1, class_243 var2, float var3) {
      return new class_243(
         class_3532.method_16436(var3, var1.field_1352, var2.field_1352),
         class_3532.method_16436(var3, var1.field_1351, var2.field_1351),
         class_3532.method_16436(var3, var1.field_1350, var2.field_1350)
      );
   }

   private class_243 UuUVuuUu(class_243 var1, class_243 var2, float var3, double var4) {
      return var1.method_1025(var2) > var4 ? var2 : this.UuUVuuUu(var1, var2, var3);
   }

   private class_243 C00OOC00oO(class_243 var1, class_243 var2, float var3, double var4) {
      if (var1 == null) {
         return var2;
      } else if (var2 == null) {
         return null;
      } else {
         return var1.method_1025(var2) > var4 ? var2 : this.UuUVuuUu(var1, var2, var3);
      }
   }

   private class_238 UuUVuuUu(Predictions.nvnNNunvv var1, Predictions.nvnNNunvv var2, float var3) {
      if (var2.targetBox() == null) {
         return null;
      } else if (var1.targetBox() != null && var1.hitEntity() != null && var2.hitEntity() != null) {
         if (var1.hitEntity().method_5628() != var2.hitEntity().method_5628()) {
            return var2.targetBox();
         } else {
            return this.UuUVuuUu(var1.targetBox(), var2.targetBox()) > 16.0 ? var2.targetBox() : this.UuUVuuUu(var1.targetBox(), var2.targetBox(), var3);
         }
      } else {
         return var2.targetBox();
      }
   }

   private class_238 UuUVuuUu(class_238 var1, class_238 var2, float var3) {
      return new class_238(
         class_3532.method_16436(var3, var1.field_1323, var2.field_1323),
         class_3532.method_16436(var3, var1.field_1322, var2.field_1322),
         class_3532.method_16436(var3, var1.field_1321, var2.field_1321),
         class_3532.method_16436(var3, var1.field_1320, var2.field_1320),
         class_3532.method_16436(var3, var1.field_1325, var2.field_1325),
         class_3532.method_16436(var3, var1.field_1324, var2.field_1324)
      );
   }

   private double UuUVuuUu(class_238 var1, class_238 var2) {
      double var3 = (var1.field_1323 + var1.field_1320 - var2.field_1323 - var2.field_1320) * 0.5;
      double var5 = (var1.field_1322 + var1.field_1325 - var2.field_1322 - var2.field_1325) * 0.5;
      double var7 = (var1.field_1321 + var1.field_1324 - var2.field_1321 - var2.field_1324) * 0.5;
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   private class_238 UuUVuuUu(class_1297 var1, float var2) {
      class_243 var3 = var1.method_30950(var2);
      class_243 var4 = var1.method_19538();
      return var1.method_5829().method_989(var3.field_1352 - var4.field_1352, var3.field_1351 - var4.field_1351, var3.field_1350 - var4.field_1350);
   }

   private class_243 UuUVuuUu(class_3965 var1) {
      if (var1 != null && var1.method_17783() != class_240.field_1333) {
         class_2338 var2 = var1.method_17777();
         return new class_243(var2.method_10263(), var2.method_10264(), var2.method_10260());
      } else {
         return null;
      }
   }

   private void UuuNnUvUuv() {
      this.NnVnNVN.clear();
      this.vnvvNvUnVv.clear();
      this.o0Ooc0COOoc.clear();
      this.nvvnUnUn = Long.MIN_VALUE;
   }

   private class_243 UuUVuuUu(class_243 var1, double var2, double var4) {
      return var1.method_1023(0.0, var2, 0.0).method_1021(var4);
   }

   private class_243 C00OOC00oO(class_243 var1, double var2, double var4) {
      return var1.method_1021(var4).method_1023(0.0, var2, 0.0);
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, class_243 var3, List<class_243> var4, int var5, boolean var6) {
      if (var4.size() >= 2) {
         float var7 = this.nUUVuvU() * 0.3125F;
         this.UuUVuuUu(var1, var2, var3, var4, var5, var6, 0.072F, 0.024F, 0.56F, var7 + 0.23F, 0.64F, 1.0F);
         this.UuUVuuUu(var1, var2, var3, var4, var5, var6, 0.042F, 0.014F, 0.94F, var7 + 0.37F, 1.0F, 1.0F);
      }
   }

   private void C00OOC00oO(class_4588 var1, Matrix4f var2, class_243 var3, List<class_243> var4, int var5, boolean var6) {
      if (var4.size() >= 2) {
         float var7 = this.nUUVuvU() * 0.3125F;
         this.UuUVuuUu(var1, var2, var3, var4, var5, var6, 0.235F, 0.066F, 0.16F, var7, 0.25F, 0.0F);
         this.UuUVuuUu(var1, var2, var3, var4, var5, var6, 0.126F, 0.036F, 0.34F, var7 + 0.19F, 0.58F, 0.0F);
      }
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      class_243 var3,
      List<class_243> var4,
      int var5,
      boolean var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12
   ) {
      int var13 = var4.size();
      int var14 = var13 - 1;
      int var15 = var5 >> 16 & 0xFF;
      int var16 = var5 >> 8 & 0xFF;
      int var17 = var5 & 0xFF;
      int var18 = Math.max(120, var5 >>> 24 & 0xFF);
      double var19 = var3.field_1352;
      double var21 = var3.field_1351;
      double var23 = var3.field_1350;

      for (int var25 = 0; var25 <= 10; var25++) {
         double var26 = (NVuunNnvvvVu[var25] + var10 * 0.07F) * Math.PI * 2.0;
         this.UnUUVuVunvVu[var25] = Math.cos(var26);
         this.nnvuvUNuUnN[var25] = Math.sin(var26);
      }

      for (int var101 = 0; var101 < var14; var101++) {
         class_243 var102 = (class_243)var4.get(var101);
         class_243 var27 = (class_243)var4.get(var101 + 1);
         double var28 = var102.field_1352 - var19;
         double var30 = var102.field_1351 - var21;
         double var32 = var102.field_1350 - var23;
         double var34 = var27.field_1352 - var19;
         double var36 = var27.field_1351 - var21;
         double var38 = var27.field_1350 - var23;
         double var40 = var34 - var28;
         double var42 = var36 - var30;
         double var44 = var38 - var32;
         double var46 = Math.sqrt(var40 * var40 + var42 * var42 + var44 * var44);
         if (!(var46 <= 1.0E-5)) {
            double var48 = var40 / var46;
            double var50 = var42 / var46;
            double var52 = var44 / var46;
            double var54 = Math.abs(var50) < 0.92 ? 0.0 : 1.0;
            double var56 = Math.abs(var50) < 0.92 ? 1.0 : 0.0;
            double var58 = 0.0;
            double var60 = var56 * var52 - var58 * var50;
            double var62 = var58 * var48 - var54 * var52;
            double var64 = var54 * var50 - var56 * var48;
            double var66 = Math.sqrt(var60 * var60 + var62 * var62 + var64 * var64);
            if (var66 <= 1.0E-5) {
               var60 = 1.0;
               var62 = 0.0;
               var64 = 0.0;
            } else {
               var60 /= var66;
               var62 /= var66;
               var64 /= var66;
            }

            double var68 = var50 * var64 - var52 * var62;
            double var70 = var52 * var60 - var48 * var64;
            double var72 = var48 * var62 - var50 * var60;
            float var74 = (float)var101 / var14;
            float var75 = (float)(var101 + 1) / var14;
            float var76 = this.UuUVuuUu(var74, var7, var8, var6);
            float var77 = this.UuUVuuUu(var75, var7, var8, var6);
            var76 *= 1.0F + 0.085F * (float)Math.sin((var74 * 2.7F - var10 * 3.8F + var11 * 0.31F) * Math.PI * 2.0);
            var77 *= 1.0F + 0.085F * (float)Math.sin((var75 * 2.7F - var10 * 3.8F + var11 * 0.31F) * Math.PI * 2.0);

            for (int var78 = 0; var78 < 10; var78++) {
               float var79 = NVuunNnvvvVu[var78];
               float var80 = NVuunNnvvvVu[var78 + 1];
               double var81 = this.UnUUVuVunvVu[var78];
               double var83 = this.nnvuvUNuUnN[var78];
               double var85 = this.UnUUVuVunvVu[var78 + 1];
               double var87 = this.nnvuvUNuUnN[var78 + 1];
               double var89 = var60 * var81 + var68 * var83;
               double var91 = var62 * var81 + var70 * var83;
               double var93 = var64 * var81 + var72 * var83;
               double var95 = var60 * var85 + var68 * var87;
               double var97 = var62 * var85 + var70 * var87;
               double var99 = var64 * var85 + var72 * var87;
               this.UuUVuuUu(
                  var1,
                  var2,
                  var28 + var89 * var76,
                  var30 + var91 * var76,
                  var32 + var93 * var76,
                  var15,
                  var16,
                  var17,
                  var18,
                  var74,
                  var12 + var79,
                  var10,
                  var9,
                  var11,
                  var89,
                  var91,
                  var93
               );
               this.UuUVuuUu(
                  var1,
                  var2,
                  var28 + var95 * var76,
                  var30 + var97 * var76,
                  var32 + var99 * var76,
                  var15,
                  var16,
                  var17,
                  var18,
                  var74,
                  var12 + var80,
                  var10,
                  var9,
                  var11,
                  var95,
                  var97,
                  var99
               );
               this.UuUVuuUu(
                  var1,
                  var2,
                  var34 + var95 * var77,
                  var36 + var97 * var77,
                  var38 + var99 * var77,
                  var15,
                  var16,
                  var17,
                  var18,
                  var75,
                  var12 + var80,
                  var10,
                  var9,
                  var11,
                  var95,
                  var97,
                  var99
               );
               this.UuUVuuUu(
                  var1,
                  var2,
                  var34 + var89 * var77,
                  var36 + var91 * var77,
                  var38 + var93 * var77,
                  var15,
                  var16,
                  var17,
                  var18,
                  var75,
                  var12 + var79,
                  var10,
                  var9,
                  var11,
                  var89,
                  var91,
                  var93
               );
            }
         }
      }
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      double var3,
      double var5,
      double var7,
      int var9,
      int var10,
      int var11,
      int var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      double var18,
      double var20,
      double var22
   ) {
      float var24 = this.C00OOC00oO(var13);
      int var25 = this.UuUVuuUu(var9, 255, var17 * 0.18F);
      int var26 = this.UuUVuuUu(var10, 255, var17 * 0.14F);
      int var27 = this.UuUVuuUu(var11, 255, var17 * 0.12F);
      int var28 = class_3532.method_15340(Math.round(var12 * var16 * var24), 0, 255);
      var1.method_22918(var2, (float)var3, (float)var5, (float)var7)
         .method_22913(var13 + var15 * 0.28F, var14)
         .method_1336(var25, var26, var27, var28)
         .method_22914((float)var18, (float)var20, (float)var22);
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, class_243 var3, class_3965 var4, class_243 var5, int var6) {
      if (var4 != null && var4.method_17783() != class_240.field_1333) {
         class_2350 var7 = var4.method_17780();
         class_243 var8 = var5 != null ? var5 : var4.method_17784();
         double var9 = var7.method_10148();
         double var11 = var7.method_10164();
         double var13 = var7.method_10165();
         double var15 = var8.field_1352 - var3.field_1352 + var9 * 0.01;
         double var17 = var8.field_1351 - var3.field_1351 + var11 * 0.01;
         double var19 = var8.field_1350 - var3.field_1350 + var13 * 0.01;
         double var21;
         double var23;
         double var25;
         double var27;
         double var29;
         double var31;
         if (var7.method_10166() == class_2351.field_11052) {
            var21 = 1.0;
            var23 = 0.0;
            var25 = 0.0;
            var27 = 0.0;
            var29 = 0.0;
            var31 = var7 == class_2350.field_11033 ? -1.0 : 1.0;
         } else if (var7.method_10166() == class_2351.field_11048) {
            var21 = 0.0;
            var23 = 0.0;
            var25 = var7 == class_2350.field_11039 ? -1.0 : 1.0;
            var27 = 0.0;
            var29 = 1.0;
            var31 = 0.0;
         } else {
            var21 = var7 == class_2350.field_11043 ? -1.0 : 1.0;
            var23 = 0.0;
            var25 = 0.0;
            var27 = 0.0;
            var29 = 1.0;
            var31 = 0.0;
         }

         float var33 = this.nUUVuvU() * 0.454545F;
         int var34 = var6 >> 16 & 0xFF;
         int var35 = var6 >> 8 & 0xFF;
         int var36 = var6 & 0xFF;
         float var37 = 0.92F + 0.08F * (float)Math.sin(var33 * Math.PI * 2.0);
         this.UuUVuuUu(
            var1, var2, var15, var17, var19, var9, var11, var13, var21, var23, var25, var27, var29, var31, 1.2F * var37, var34, var35, var36, 56, var33, 4.0F
         );
         this.UuUVuuUu(
            var1,
            var2,
            var15,
            var17,
            var19,
            var9,
            var11,
            var13,
            var21,
            var23,
            var25,
            var27,
            var29,
            var31,
            0.74F * var37,
            this.UuUVuuUu(var34, 255, 0.18F),
            this.UuUVuuUu(var35, 255, 0.14F),
            this.UuUVuuUu(var36, 255, 0.16F),
            100,
            var33 + 0.27F,
            4.0F
         );
         this.UuUVuuUu(
            var1,
            var2,
            var15,
            var17,
            var19,
            var9,
            var11,
            var13,
            var21,
            var23,
            var25,
            var27,
            var29,
            var31,
            0.54F * var37,
            0.3F * var37,
            this.UuUVuuUu(var34, 255, 0.32F),
            this.UuUVuuUu(var35, 255, 0.26F),
            this.UuUVuuUu(var36, 255, 0.28F),
            130,
            var33,
            4.0F
         );
         this.UuUVuuUu(
            var1,
            var2,
            var15,
            var17,
            var19,
            var21,
            var23,
            var25,
            var27,
            var29,
            var31,
            0.62F * var37,
            0.09F,
            var34,
            var35,
            var36,
            110,
            var33 + 0.21F,
            0.78F,
            2.0F
         );
         this.UuUVuuUu(
            var1,
            var2,
            var15,
            var17,
            var19,
            var21,
            var23,
            var25,
            var27,
            var29,
            var31,
            0.33F * var37,
            0.038F,
            this.UuUVuuUu(var34, 255, 0.36F),
            this.UuUVuuUu(var35, 255, 0.3F),
            this.UuUVuuUu(var36, 255, 0.32F),
            200,
            var33 + 0.46F,
            0.95F,
            2.0F
         );
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, class_243 var3, class_238 var4, int var5, int var6, int var7) {
      double var8 = (var4.field_1323 + var4.field_1320) * 0.5 - var3.field_1352;
      double var10 = var4.field_1322 - var3.field_1351 + 0.035;
      double var12 = (var4.field_1321 + var4.field_1324) * 0.5 - var3.field_1350;
      double var14 = var4.field_1325 - var4.field_1322;
      double var16 = Math.max(var4.field_1320 - var4.field_1323, var4.field_1324 - var4.field_1321) * 0.66 + 0.22;
      long var18 = System.currentTimeMillis();
      float var20 = (float)(var18 % 1800L) / 1800.0F;
      this.UuUVuuUu(var1, var2, var8, var10, var12, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, (float)var16, 0.058F, var5, var6, var7, 215, var20, 1.0F, 2.0F);
      this.UuUVuuUu(
         var1,
         var2,
         var8,
         var10 + var14 * 0.56,
         var12,
         1.0,
         0.0,
         0.0,
         0.0,
         0.0,
         1.0,
         (float)(var16 * 0.86),
         0.04F,
         var5,
         var6,
         var7,
         120,
         var20 + 0.33F,
         0.62F,
         2.0F
      );
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      double var21,
      double var23,
      double var25,
      float var27,
      int var28,
      int var29,
      int var30,
      int var31,
      float var32,
      float var33
   ) {
      for (int var34 = 0; var34 < 8; var34++) {
         float var35 = var34 / 8.0F;
         float var36 = (var34 + 1) / 8.0F;
         float var37 = var35;
         float var38 = var34 == 7 ? 0.999F : var36;
         double var39 = var27 * var35;
         double var41 = var27 * var36;
         int var43 = class_3532.method_15340(Math.round(var31 * (1.0F - var35) * (1.0F - var35)), 0, 255);
         int var44 = class_3532.method_15340(Math.round(var31 * (1.0F - var36) * (1.0F - var36)), 0, 255);

         for (int var45 = 0; var45 < 72; var45++) {
            float var46 = UuNnnVnuNNV[var45];
            float var47 = UuNnnVnuNNV[var45 + 1];
            double var48 = uUVVvVVNvvn[var45];
            double var50 = vvUVNVvvNUv[var45];
            double var52 = uUVVvVVNvvn[var45 + 1];
            double var54 = vvUVNVvvNUv[var45 + 1];
            this.UuUVuuUu(
               var1,
               var2,
               var3,
               var5,
               var7,
               var9,
               var11,
               var13,
               var15,
               var17,
               var19,
               var21,
               var23,
               var25,
               var48,
               var50,
               var41,
               var28,
               var29,
               var30,
               var44,
               var46 + var32 * 0.18F,
               var33 + var38
            );
            this.UuUVuuUu(
               var1,
               var2,
               var3,
               var5,
               var7,
               var9,
               var11,
               var13,
               var15,
               var17,
               var19,
               var21,
               var23,
               var25,
               var48,
               var50,
               var39,
               var28,
               var29,
               var30,
               var43,
               var46 + var32 * 0.18F,
               var33 + var37
            );
            this.UuUVuuUu(
               var1,
               var2,
               var3,
               var5,
               var7,
               var9,
               var11,
               var13,
               var15,
               var17,
               var19,
               var21,
               var23,
               var25,
               var52,
               var54,
               var39,
               var28,
               var29,
               var30,
               var43,
               var47 + var32 * 0.18F,
               var33 + var37
            );
            this.UuUVuuUu(
               var1,
               var2,
               var3,
               var5,
               var7,
               var9,
               var11,
               var13,
               var15,
               var17,
               var19,
               var21,
               var23,
               var25,
               var52,
               var54,
               var41,
               var28,
               var29,
               var30,
               var44,
               var47 + var32 * 0.18F,
               var33 + var38
            );
         }
      }
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      double var21,
      double var23,
      double var25,
      double var27,
      double var29,
      double var31,
      int var33,
      int var34,
      int var35,
      int var36,
      float var37,
      float var38
   ) {
      double var39 = var3 + (var15 * var27 + var21 * var29) * var31;
      double var41 = var5 + (var17 * var27 + var23 * var29) * var31;
      double var43 = var7 + (var19 * var27 + var25 * var29) * var31;
      var1.method_22918(var2, (float)var39, (float)var41, (float)var43)
         .method_22913(var37, var38)
         .method_1336(var33, var34, var35, var36)
         .method_22914((float)var9, (float)var11, (float)var13);
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      double var21,
      double var23,
      double var25,
      float var27,
      float var28,
      int var29,
      int var30,
      int var31,
      int var32,
      float var33,
      float var34
   ) {
      for (int var35 = 0; var35 < 6; var35++) {
         float var36 = var35 / 6.0F;
         float var37 = (var35 + 1) / 6.0F;
         float var38 = var36;
         float var39 = var35 == 5 ? 0.999F : var37;
         double var40 = var27 * var36;
         double var42 = var27 * var37;
         double var44 = var28 * (1.0 - var36 * var36);
         double var46 = var28 * (1.0 - var37 * var37);
         int var48 = class_3532.method_15340(Math.round(var32 * (1.0F - var36 * 0.62F)), 0, 255);
         int var49 = class_3532.method_15340(Math.round(var32 * (1.0F - var37 * 0.62F)), 0, 255);

         for (int var50 = 0; var50 < 72; var50++) {
            float var51 = UuNnnVnuNNV[var50];
            float var52 = UuNnnVnuNNV[var50 + 1];
            double var53 = uUVVvVVNvvn[var50];
            double var55 = vvUVNVvvNUv[var50];
            double var57 = uUVVvVVNvvn[var50 + 1];
            double var59 = vvUVNVvvNUv[var50 + 1];
            this.UuUVuuUu(
               var1,
               var2,
               var3,
               var5,
               var7,
               var9,
               var11,
               var13,
               var15,
               var17,
               var19,
               var21,
               var23,
               var25,
               var53,
               var55,
               var42,
               var46,
               var37,
               var29,
               var30,
               var31,
               var49,
               var51 + var33 * 0.26F,
               var34 + var39
            );
            this.UuUVuuUu(
               var1,
               var2,
               var3,
               var5,
               var7,
               var9,
               var11,
               var13,
               var15,
               var17,
               var19,
               var21,
               var23,
               var25,
               var53,
               var55,
               var40,
               var44,
               var36,
               var29,
               var30,
               var31,
               var48,
               var51 + var33 * 0.26F,
               var34 + var38
            );
            this.UuUVuuUu(
               var1,
               var2,
               var3,
               var5,
               var7,
               var9,
               var11,
               var13,
               var15,
               var17,
               var19,
               var21,
               var23,
               var25,
               var57,
               var59,
               var40,
               var44,
               var36,
               var29,
               var30,
               var31,
               var48,
               var52 + var33 * 0.26F,
               var34 + var38
            );
            this.UuUVuuUu(
               var1,
               var2,
               var3,
               var5,
               var7,
               var9,
               var11,
               var13,
               var15,
               var17,
               var19,
               var21,
               var23,
               var25,
               var57,
               var59,
               var42,
               var46,
               var37,
               var29,
               var30,
               var31,
               var49,
               var52 + var33 * 0.26F,
               var34 + var39
            );
         }
      }
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      double var21,
      double var23,
      double var25,
      double var27,
      double var29,
      double var31,
      double var33,
      float var35,
      int var36,
      int var37,
      int var38,
      int var39,
      float var40,
      float var41
   ) {
      double var42 = var15 * var27 + var21 * var29;
      double var44 = var17 * var27 + var23 * var29;
      double var46 = var19 * var27 + var25 * var29;
      double var48 = var3 + var42 * var31 + var9 * var33;
      double var50 = var5 + var44 * var31 + var11 * var33;
      double var52 = var7 + var46 * var31 + var13 * var33;
      double var54 = var9 * (1.0 - var35 * 0.32F) + var42 * var35 * 0.68F;
      double var56 = var11 * (1.0 - var35 * 0.32F) + var44 * var35 * 0.68F;
      double var58 = var13 * (1.0 - var35 * 0.32F) + var46 * var35 * 0.68F;
      double var60 = Math.sqrt(var54 * var54 + var56 * var56 + var58 * var58);
      if (var60 <= 1.0E-5) {
         var54 = var9;
         var56 = var11;
         var58 = var13;
      } else {
         var54 /= var60;
         var56 /= var60;
         var58 /= var60;
      }

      var1.method_22918(var2, (float)var48, (float)var50, (float)var52)
         .method_22913(var40, var41)
         .method_1336(var36, var37, var38, var39)
         .method_22914((float)var54, (float)var56, (float)var58);
   }

   private void UuUVuuUu(
      class_4588 var1, Matrix4f var2, double var3, double var5, double var7, double var9, double var11, double var13, int var15, int var16, int var17
   ) {
      double var18 = 0.004;
      double var20 = var3 - var18;
      double var22 = var5 - var18;
      double var24 = var7 - var18;
      double var26 = var9 + var18;
      double var28 = var11 + var18;
      double var30 = var13 + var18;
      int var32 = this.UuUVuuUu(var15, 255, 0.3F);
      int var33 = this.UuUVuuUu(var16, 255, 0.26F);
      int var34 = this.UuUVuuUu(var17, 255, 0.26F);
      this.UuUVuuUu(var1, var2, var20, var22, var24, var26, var28, var30, 0.046F, var15, var16, var17, 26);
      this.UuUVuuUu(var1, var2, var20, var22, var24, var26, var28, var30, 0.02F, var15, var16, var17, 60);
      this.UuUVuuUu(var1, var2, var20, var22, var24, var26, var28, var30, 0.008F, var32, var33, var34, 180);
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      float var15,
      int var16,
      int var17,
      int var18,
      int var19
   ) {
      this.UuUVuuUu(var1, var2, var3, var5, var7, var9, var5, var7, var15, var16, var17, var18, var19, 3.0F);
      this.UuUVuuUu(var1, var2, var9, var5, var7, var9, var5, var13, var15, var16, var17, var18, var19, 3.0F);
      this.UuUVuuUu(var1, var2, var9, var5, var13, var3, var5, var13, var15, var16, var17, var18, var19, 3.0F);
      this.UuUVuuUu(var1, var2, var3, var5, var13, var3, var5, var7, var15, var16, var17, var18, var19, 3.0F);
      this.UuUVuuUu(var1, var2, var3, var11, var7, var9, var11, var7, var15, var16, var17, var18, var19, 3.0F);
      this.UuUVuuUu(var1, var2, var9, var11, var7, var9, var11, var13, var15, var16, var17, var18, var19, 3.0F);
      this.UuUVuuUu(var1, var2, var9, var11, var13, var3, var11, var13, var15, var16, var17, var18, var19, 3.0F);
      this.UuUVuuUu(var1, var2, var3, var11, var13, var3, var11, var7, var15, var16, var17, var18, var19, 3.0F);
      this.UuUVuuUu(var1, var2, var3, var5, var7, var3, var11, var7, var15, var16, var17, var18, var19, 3.0F);
      this.UuUVuuUu(var1, var2, var9, var5, var7, var9, var11, var7, var15, var16, var17, var18, var19, 3.0F);
      this.UuUVuuUu(var1, var2, var9, var5, var13, var9, var11, var13, var15, var16, var17, var18, var19, 3.0F);
      this.UuUVuuUu(var1, var2, var3, var5, var13, var3, var11, var13, var15, var16, var17, var18, var19, 3.0F);
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      int var15,
      int var16,
      int var17,
      int var18
   ) {
      double var19 = var9 - var3;
      double var21 = var11 - var5;
      double var23 = var13 - var7;
      double var25 = Math.min(Math.min(var19, var21), var23) * 0.42;
      if (var25 < 0.18) {
         var25 = 0.18;
      }

      if (var25 > 0.38) {
         var25 = 0.38;
      }

      float var27 = 0.028F;
      this.UuUVuuUu(var1, var2, var3, var5, var7, 1.0, 1.0, 1.0, var25, var27, var15, var16, var17, var18);
      this.UuUVuuUu(var1, var2, var9, var5, var7, -1.0, 1.0, 1.0, var25, var27, var15, var16, var17, var18);
      this.UuUVuuUu(var1, var2, var9, var5, var13, -1.0, 1.0, -1.0, var25, var27, var15, var16, var17, var18);
      this.UuUVuuUu(var1, var2, var3, var5, var13, 1.0, 1.0, -1.0, var25, var27, var15, var16, var17, var18);
      this.UuUVuuUu(var1, var2, var3, var11, var7, 1.0, -1.0, 1.0, var25, var27, var15, var16, var17, var18);
      this.UuUVuuUu(var1, var2, var9, var11, var7, -1.0, -1.0, 1.0, var25, var27, var15, var16, var17, var18);
      this.UuUVuuUu(var1, var2, var9, var11, var13, -1.0, -1.0, -1.0, var25, var27, var15, var16, var17, var18);
      this.UuUVuuUu(var1, var2, var3, var11, var13, 1.0, -1.0, -1.0, var25, var27, var15, var16, var17, var18);
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      float var17,
      int var18,
      int var19,
      int var20,
      int var21
   ) {
      this.UuUVuuUu(var1, var2, var3, var5, var7, var3 + var9 * var15, var5, var7, var17, var18, var19, var20, var21, 3.0F);
      this.UuUVuuUu(var1, var2, var3, var5, var7, var3, var5 + var11 * var15, var7, var17, var18, var19, var20, var21, 3.0F);
      this.UuUVuuUu(var1, var2, var3, var5, var7, var3, var5, var7 + var13 * var15, var17, var18, var19, var20, var21, 3.0F);
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      float var21,
      float var22,
      int var23,
      int var24,
      int var25,
      int var26,
      float var27,
      float var28,
      float var29
   ) {
      double var30 = Math.max(0.01, (double)(var21 - var22 * 0.5F));
      double var32 = var21 + var22 * 0.5F;
      double var34 = var11 * var19 - var13 * var17;
      double var36 = var13 * var15 - var9 * var19;
      double var38 = var9 * var17 - var11 * var15;

      for (int var40 = 0; var40 < 72; var40++) {
         float var41 = UuNnnVnuNNV[var40];
         float var42 = UuNnnVnuNNV[var40 + 1];
         double var43 = uUVVvVVNvvn[var40];
         double var45 = vvUVNVvvNUv[var40];
         double var47 = uUVVvVVNvvn[var40 + 1];
         double var49 = vvUVNVvvNUv[var40 + 1];
         int var51 = this.UuUVuuUu(var26, var41, var27, var28);
         int var52 = this.UuUVuuUu(var26, var42, var27, var28);
         this.UuUVuuUu(
            var1,
            var2,
            var3,
            var5,
            var7,
            var9,
            var11,
            var13,
            var15,
            var17,
            var19,
            var43,
            var45,
            var32,
            var23,
            var24,
            var25,
            var51,
            var41 + var27 * 0.2F,
            var29 + 0.92F,
            var34,
            var36,
            var38
         );
         this.UuUVuuUu(
            var1,
            var2,
            var3,
            var5,
            var7,
            var9,
            var11,
            var13,
            var15,
            var17,
            var19,
            var43,
            var45,
            var30,
            var23,
            var24,
            var25,
            var51,
            var41 + var27 * 0.2F,
            var29 + 0.08F,
            var34,
            var36,
            var38
         );
         this.UuUVuuUu(
            var1,
            var2,
            var3,
            var5,
            var7,
            var9,
            var11,
            var13,
            var15,
            var17,
            var19,
            var47,
            var49,
            var30,
            var23,
            var24,
            var25,
            var52,
            var42 + var27 * 0.2F,
            var29 + 0.08F,
            var34,
            var36,
            var38
         );
         this.UuUVuuUu(
            var1,
            var2,
            var3,
            var5,
            var7,
            var9,
            var11,
            var13,
            var15,
            var17,
            var19,
            var47,
            var49,
            var32,
            var23,
            var24,
            var25,
            var52,
            var42 + var27 * 0.2F,
            var29 + 0.92F,
            var34,
            var36,
            var38
         );
      }
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      double var21,
      double var23,
      double var25,
      int var27,
      int var28,
      int var29,
      int var30,
      float var31,
      float var32,
      double var33,
      double var35,
      double var37
   ) {
      double var39 = var3 + (var9 * var21 + var15 * var23) * var25;
      double var41 = var5 + (var11 * var21 + var17 * var23) * var25;
      double var43 = var7 + (var13 * var21 + var19 * var23) * var25;
      var1.method_22918(var2, (float)var39, (float)var41, (float)var43)
         .method_22913(var31, var32)
         .method_1336(var27, var28, var29, var30)
         .method_22914((float)var33, (float)var35, (float)var37);
   }

   private int UuUVuuUu(int var1, float var2, float var3, float var4) {
      float var5 = 0.5F + 0.5F * (float)Math.sin((var2 * 3.0F - var3 * 2.0F) * Math.PI * 2.0);
      return class_3532.method_15340(Math.round(var1 * var4 * (0.48F + var5 * 0.52F)), 0, 255);
   }

   private void UuUVuuUu(
      class_4588 var1,
      Matrix4f var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      float var15,
      int var16,
      int var17,
      int var18,
      int var19,
      float var20
   ) {
      double var21 = var9 - var3;
      double var23 = var11 - var5;
      double var25 = var13 - var7;
      double var27 = Math.sqrt(var21 * var21 + var23 * var23 + var25 * var25);
      if (!(var27 <= 1.0E-5)) {
         double var29 = var21 / var27;
         double var31 = var23 / var27;
         double var33 = var25 / var27;
         double var35 = Math.abs(var31) < 0.92 ? 0.0 : 1.0;
         double var37 = Math.abs(var31) < 0.92 ? 1.0 : 0.0;
         double var39 = 0.0;
         double var41 = var37 * var33 - var39 * var31;
         double var43 = var39 * var29 - var35 * var33;
         double var45 = var35 * var31 - var37 * var29;
         double var47 = Math.sqrt(var41 * var41 + var43 * var43 + var45 * var45);
         if (var47 <= 1.0E-5) {
            var41 = 1.0;
            var43 = 0.0;
            var45 = 0.0;
         } else {
            var41 /= var47;
            var43 /= var47;
            var45 /= var47;
         }

         double var49 = var31 * var45 - var33 * var43;
         double var51 = var33 * var41 - var29 * var45;
         double var53 = var29 * var43 - var31 * var41;
         double var55 = var15 * 0.5;

         for (int var57 = 0; var57 < 6; var57++) {
            float var58 = NVuNUuVnVUN[var57];
            float var59 = NVuNUuVnVUN[var57 + 1];
            double var60 = uUVvnUuNvvN[var57];
            double var62 = UUuUnNVNuuv[var57];
            double var64 = uUVvnUuNvvN[var57 + 1];
            double var66 = UUuUnNVNuuv[var57 + 1];
            double var68 = var41 * var60 + var49 * var62;
            double var70 = var43 * var60 + var51 * var62;
            double var72 = var45 * var60 + var53 * var62;
            double var74 = var41 * var64 + var49 * var66;
            double var76 = var43 * var64 + var51 * var66;
            double var78 = var45 * var64 + var53 * var66;
            var1.method_22918(var2, (float)(var3 + var68 * var55), (float)(var5 + var70 * var55), (float)(var7 + var72 * var55))
               .method_22913(0.0F, var20 + var58)
               .method_1336(var16, var17, var18, var19)
               .method_22914((float)var68, (float)var70, (float)var72);
            var1.method_22918(var2, (float)(var3 + var74 * var55), (float)(var5 + var76 * var55), (float)(var7 + var78 * var55))
               .method_22913(0.0F, var20 + var59)
               .method_1336(var16, var17, var18, var19)
               .method_22914((float)var74, (float)var76, (float)var78);
            var1.method_22918(var2, (float)(var9 + var74 * var55), (float)(var11 + var76 * var55), (float)(var13 + var78 * var55))
               .method_22913(1.0F, var20 + var59)
               .method_1336(var16, var17, var18, var19)
               .method_22914((float)var74, (float)var76, (float)var78);
            var1.method_22918(var2, (float)(var9 + var68 * var55), (float)(var11 + var70 * var55), (float)(var13 + var72 * var55))
               .method_22913(1.0F, var20 + var58)
               .method_1336(var16, var17, var18, var19)
               .method_22914((float)var68, (float)var70, (float)var72);
         }
      }
   }

   private float UuUVuuUu(float var1, float var2, float var3, boolean var4) {
      float var5 = (float)Math.pow(this.uUnuvNvvNU(var1), 0.72F);
      float var6 = var2 + (var3 - var2) * var5;
      return var4 ? var6 : var6 * (1.0F - var5 * 0.36F);
   }

   private float C00OOC00oO(float var1) {
      return this.UuUVuuUu(0.0F, 0.055F, var1) * (1.0F - this.UuUVuuUu(0.885F, 1.0F, var1));
   }

   private float UuUVuuUu(float var1, float var2, float var3) {
      float var4 = this.uUnuvNvvNU((var3 - var1) / Math.max(1.0E-5F, var2 - var1));
      return var4 * var4 * (3.0F - 2.0F * var4);
   }

   private float uUnuvNvvNU(float var1) {
      return Math.max(0.0F, Math.min(1.0F, var1));
   }

   private int UuUVuuUu(int var1, int var2, float var3) {
      float var4 = this.uUnuvNvvNU(var3);
      return class_3532.method_15340(Math.round(var1 + (var2 - var1) * var4), 0, 255);
   }

   private float nUUVuvU() {
      return (float)(System.nanoTime() - UvUvUNuvNU) * 1.0E-9F;
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, Predictions.nvnNNunvv var5) {
      String var6 = this.vVvUvVVuuNvV(var5.ticks() / 20.0F);
      float var7 = 25.0F;
      float var8 = 3.0F;
      float var9 = 3.0F;
      float var10 = 22.0F;
      float var11 = 3.0F;
      float var12 = 6.0F;
      float var13 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var6, var7).UuUVuuUu;
      int var14 = this.UuUVuuUu(var5.icon());
      boolean var15 = var14 > 0;
      float var16 = var15 ? var10 + var11 : 0.0F;
      float var17 = var8 * 2.0F + var16 + var13 + var12;
      float var18 = var9 + Math.max(var15 ? var10 : 0.0F, var7);
      float var19 = var18 / 2.0F;
      var1.UuUVuuUu(var2, var3);
      var1.C00OOC00oO(var4, var4);
      float var20 = -var17 / 2.0F;
      float var21 = -var18;
      this.UuUVuuUu(var1, var20, var21, var17, var18, var19, 111.0F);
      float var22 = var20 + var8 + (var15 ? 0.0F : var12 / 2.0F);
      if (var15) {
         float var23 = var20 + var8;
         float var24 = var21 + (var18 - var10) / 2.0F;
         var1.UuUVuuUu(var23, var24 + var10);
         var1.C00OOC00oO(1.0F, -1.0F);
         var1.UuUVuuUu(var14, 0.0F, 0.0F, var10, var10);
         var1.uVUuuVnNVU();
         var1.vNUvnnVnUvu();
         var22 = var23 + var10 + var11;
      }

      float var25 = var21 + var9 + var7 - 10.0F;
      int var26 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.VVuuUN(1, 1), 230);
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var22 + 1.0F, var25 + 1.0F, var7, var6, var26);
      var1.uVUuuVnNVU();
      var1.vNUvnnVnUvu();
   }

   private boolean C00OOC00oO(Predictions.nvnNNunvv var1) {
      class_2960 var2 = var1.icon();
      return var2 != null && var2.method_12832().contains("ender_pearl");
   }

   private void C00OOC00oO(UnVNvNnU var1, float var2, float var3, float var4, Predictions.nvnNNunvv var5) {
      String var6 = var5.ownerName();
      if (var6 != null && !var6.isEmpty() && !var6.equals("Unknown") && !var6.equals("You")) {
         float var7 = 22.0F;
         float var8 = 4.0F;
         float var9 = 3.0F;
         float var10 = 18.0F;
         float var11 = 4.0F;
         float var12 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var6, var7).UuUVuuUu;
         float var13 = var8 * 2.0F + var10 + var11 + var12;
         float var14 = var9 + Math.max(var10, var7);
         float var15 = var14 / 2.0F;
         var1.UuUVuuUu(var2, var3);
         var1.C00OOC00oO(var4, var4);
         float var16 = -var13 / 2.0F;
         float var17 = -var14;
         this.UuUVuuUu(var1, var16, var17, var13, var14, var15, 111.0F);
         float var18 = var16 + var8;
         float var19 = var17 + (var14 - var10) / 2.0F;
         this.UuUVuuUu(var1, var6, var18, var19, var10, 1.0F);
         float var20 = var18 + var10 + var11;
         float var21 = var17 + var9 + var7 - 10.0F;
         int var22 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.VVuuUN(1, 1), 230);
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var20 + 1.0F, var21 + 1.0F, var7, var6, var22);
         var1.uVUuuVnNVU();
         var1.vNUvnnVnUvu();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, String var2, float var3, float var4, float var5, float var6) {
      if (uUnuvNvvNU.method_1562() != null) {
         class_640 var7 = null;

         for (class_640 var9 : uUnuvNvvNU.method_1562().method_2880()) {
            if (var9.method_2966().getName().equalsIgnoreCase(var2)) {
               var7 = var9;
               break;
            }
         }

         if (var7 != null) {
            try {
               class_2960 var13 = var7.method_52810().comp_1626();
               class_1044 var14 = uUnuvNvvNU.method_1531().method_4619(var13);
               if (var14 != null && var14.method_68004() instanceof class_10868 var10 && var10.method_68427() > 0) {
                  int var15 = var10.method_68427();
                  GlStateManager._bindTexture(var15);
                  var1.uNNnnnuuuN(var6);
                  var1.UuUVuuUu(var15, var3, var4, var5, var5, 0.125F, 0.125F, 0.25F, 0.25F, 3.0F);
                  var1.UuUVuuUu(var15, var3, var4, var5, var5, 0.625F, 0.125F, 0.75F, 0.25F, 3.0F);
                  var1.vuuuNvNuv();
               }
            } catch (Throwable var12) {
            }
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = var7 / 155.0F;
      int var9 = this.nvuVvuNnNUnv.UuUVuuUu(255.0F);
      int var10 = this.nvuVvuNnNUnv.vVvUvVVuuNvV(var8);
      var1.UuUVuuUu(var2, var3, var4, var5, 12.0F, var9);
   }

   private String vVvUvVVuuNvV(float var1) {
      String var2 = String.format(Locale.US, "%.1f", var1).replace('.', ',');
      return var2 + " сек";
   }

   private int UuUVuuUu(class_2960 var1) {
      if (var1 == null) {
         return -1;
      } else {
         class_1060 var2 = uUnuvNvvNU.method_1531();
         if (var2 == null) {
            return -1;
         } else {
            class_1044 var3 = var2.method_4619(var1);
            if (var3 == null) {
               return -1;
            } else if (var3.method_68004() instanceof class_10868 var5) {
               int var6 = var5.method_68427();
               return var6 > 0 ? var6 : -1;
            } else {
               return -1;
            }
         }
      }
   }

   private class_2960 C00OOC00oO(class_1792 var1) {
      if (var1 instanceof class_1835) {
         return class_2960.method_60655("minecraft", "textures/item/trident.png");
      } else if (var1 instanceof class_1753 || var1 instanceof class_1764) {
         return class_2960.method_60655("minecraft", "textures/item/arrow.png");
      } else if (var1 instanceof class_4537) {
         return class_2960.method_60655("minecraft", "textures/item/potion.png");
      } else if (var1 instanceof class_1823) {
         return class_2960.method_60655("minecraft", "textures/item/snowball.png");
      } else if (var1 instanceof class_1771) {
         return class_2960.method_60655("minecraft", "textures/item/egg.png");
      } else if (var1 instanceof class_1779) {
         return class_2960.method_60655("minecraft", "textures/item/experience_bottle.png");
      } else {
         return var1 instanceof class_1776 ? class_2960.method_60655("minecraft", "textures/item/ender_pearl.png") : null;
      }
   }

   private class_2960 UuUVuuUu(class_1676 var1) {
      String var2 = class_7923.field_41177.method_10221(var1.method_5864()).method_12832();
      if (var2.contains("trident")) {
         return class_2960.method_60655("minecraft", "textures/item/trident.png");
      } else if (var2.contains("snowball")) {
         return class_2960.method_60655("minecraft", "textures/item/snowball.png");
      } else if (var2.contains("arrow")) {
         return class_2960.method_60655("minecraft", "textures/item/arrow.png");
      } else if (var2.contains("potion")) {
         return class_2960.method_60655("minecraft", "textures/item/potion.png");
      } else if (var2.contains("pearl")) {
         return class_2960.method_60655("minecraft", "textures/item/ender_pearl.png");
      } else if (var2.contains("egg")) {
         return class_2960.method_60655("minecraft", "textures/item/egg.png");
      } else {
         return var2.contains("experience_bottle") ? class_2960.method_60655("minecraft", "textures/item/experience_bottle.png") : null;
      }
   }

   static {
      for (int var0 = 0; var0 <= 72; var0++) {
         float var1 = var0 / 72.0F;
         UuNnnVnuNNV[var0] = var1;
         double var2 = var1 * Math.PI * 2.0;
         uUVVvVVNvvn[var0] = Math.cos(var2);
         vvUVNVvvNUv[var0] = Math.sin(var2);
      }

      for (int var4 = 0; var4 <= 6; var4++) {
         float var6 = var4 < 6 ? var4 / 6.0F : 0.999F;
         NVuNUuVnVUN[var4] = var6;
         double var7 = var6 * Math.PI * 2.0;
         uUVvnUuNvvN[var4] = Math.cos(var7);
         UUuUnNVNuuv[var4] = Math.sin(var7);
      }

      for (int var5 = 0; var5 <= 10; var5++) {
         NVuunNnvvvVu[var5] = var5 < 10 ? var5 / 10.0F : 0.999F;
      }

      vNnNuuvVn = class_2960.method_60655("wild", "core/prediction_vfx");
      VUuuVUnun = new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE);
      vVVuuVVv = class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_60125, class_10799.field_60126})
            .withLocation(class_2960.method_60655("wild", "prediction_glass"))
            .withVertexShader(vNnNuuvVn)
            .withFragmentShader(vNnNuuvVn)
            .withVertexFormat(class_290.field_1577, class_5596.field_27382)
            .withCull(false)
            .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
            .withDepthWrite(false)
            .withBlend(BlendFunction.TRANSLUCENT)
            .build()
      );
      VuunNUUUvu = class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_60125, class_10799.field_60126})
            .withLocation(class_2960.method_60655("wild", "prediction_glass_no_depth"))
            .withVertexShader(vNnNuuvVn)
            .withFragmentShader(vNnNuuvVn)
            .withVertexFormat(class_290.field_1577, class_5596.field_27382)
            .withCull(false)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withBlend(BlendFunction.TRANSLUCENT)
            .build()
      );
      NNUUNUuVNNVn = class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_60125, class_10799.field_60126})
            .withLocation(class_2960.method_60655("wild", "prediction_emission"))
            .withVertexShader(vNnNuuvVn)
            .withFragmentShader(vNnNuuvVn)
            .withVertexFormat(class_290.field_1577, class_5596.field_27382)
            .withCull(false)
            .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
            .withDepthWrite(false)
            .withBlend(VUuuVUnun)
            .build()
      );
      VvVvnNUnvuvV = class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_60125, class_10799.field_60126})
            .withLocation(class_2960.method_60655("wild", "prediction_emission_no_depth"))
            .withVertexShader(vNnNuuvVn)
            .withFragmentShader(vNnNuuvVn)
            .withVertexFormat(class_290.field_1577, class_5596.field_27382)
            .withCull(false)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withBlend(VUuuVUnun)
            .build()
      );
      ccOO0COcoco0 = class_1921.method_24049("wild_prediction_glass", 2097152, false, true, vVVuuVVv, class_4688.method_23598().method_23617(false));
      NUVvUUVuVNVv = class_1921.method_24049("wild_prediction_glass_no_depth", 2097152, false, true, VuunNUUUvu, class_4688.method_23598().method_23617(false));
      nNuVunNUVu = class_1921.method_24049("wild_prediction_emission", 2097152, false, true, NNUUNUuVNNVn, class_4688.method_23598().method_23617(false));
      UNvvunVVn = class_1921.method_24049(
         "wild_prediction_emission_no_depth", 2097152, false, true, VvVvnNUnvuvV, class_4688.method_23598().method_23617(false)
      );
   }

   record NVnVnNnN(double speed, double gravity, float pitchOffset, boolean applyPhysicsBeforeMove) {
   }

   record nvnNNunvv(
      String key,
      List<class_243> path,
      class_243 landingPos,
      class_243 blockRenderPos,
      class_238 targetBox,
      int ticks,
      class_1297 hitEntity,
      class_3965 blockHit,
      String ownerName,
      class_2960 icon,
      boolean isPreAim
   ) {
      Predictions.nvnNNunvv withRenderState(List<class_243> var1, class_243 var2, class_243 var3, class_238 var4) {
         return new Predictions.nvnNNunvv(this.key, var1, var2, var3, var4, this.ticks, this.hitEntity, this.blockHit, this.ownerName, this.icon, this.isPreAim);
      }

      static String resolveOwnerName(class_1676 var0) {
         return var0.method_24921() instanceof class_1657 var2 ? var2.method_5477().getString() : "Unknown";
      }
   }
}
