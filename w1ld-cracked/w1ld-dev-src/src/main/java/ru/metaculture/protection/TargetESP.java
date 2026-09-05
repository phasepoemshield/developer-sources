package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
import net.minecraft.class_10799;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1921;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4608;
import net.minecraft.class_7833;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_4597.class_4598;
import net.minecraft.class_4668.class_4683;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "TargetESP",
   C00OOC00oO = "Жозки таргет есп",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class TargetESP extends Module implements uvVVuUNNunn {
   private static final String uUVuVvuNUvnu = "target_esp";
   public static UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Текстура", "Картинка", "Картинка", "Призраки", "Кольцо", "Кубики", "Сфера");
   public static UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Режим призраков", "Обычный", "Обычный", "Новый", "Старый", "Орбита", "Спираль")
      .UuUVuuUu(() -> !NVNnnvnuunNv.C00OOC00oO("Призраки"));
   public static UvNnUnuNUUU UNnVVNvvnVvU = new UvNnUnuNUUU("Режим картинки", "Клиент", "Клиент", "Ромб", "Ромб 2")
      .UuUVuuUu(() -> !NVNnnvnuunNv.C00OOC00oO("Картинка"));
   public static UvNnUnuNUUU uNnUnnuNUnNu = new UvNnUnuNUUU("Режим кубиков", "Новый", "Новый", "Старый", "Орбита")
      .UuUVuuUu(() -> !NVNnnvnuunNv.C00OOC00oO("Кубики"));
   public static ili11Iii1Ii NnUuNNU = new ili11Iii1Ii("Foundry Shader", VnuVUNUv.ESP);
   private static final class_2960 UvUvUNuvNU = class_2960.method_60655("wild", "textures/world/target.png");
   private static final class_2960 c0oOOCcCoC0 = class_2960.method_60655("wild", "textures/world/targetn2.png");
   private static final class_2960 VVnVNnunVvu = class_2960.method_60655("wild", "textures/world/targetn.png");
   private static final class_2960 unNNVVNnvvV = class_2960.method_60655("wild", "textures/world/glow.png");
   private static final class_2960 NuunnvnN = class_2960.method_60655("wild", "textures/world/dashbloom.png");
   public static uVVuNvUUV nNvNUVU = new uVVuNvUUV();
   public static uVVuNvUUV UnUNuUU = new uVVuNvUUV();
   private class_1309 NVUunUNUN = null;
   private final Predicate<class_1297> UUVNuUNUvUnV = var1 -> var1 == AttackAura.ccOO0COcoco0 || var1 == this.NVUunUNUN;
   private static long vuvnUnVnUNnV = 0L;
   private float nnuUVNUuvvVU = 0.0F;
   private long nVVUuvuNnUN = 0L;
   private final ArrayList<TargetESP.NVnVnNnN> nNnVnUNVV = new ArrayList<>();
   private static long nuunNvv = System.currentTimeMillis();
   static float uUVVvVVNvvn = 0.0F;
   private static final long vvUVNVvvNUv = 1000L;
   private static final int UuNnnVnuNNV = 1;
   private static final float uUVvnUuNvvN = 0.02F;
   private static final int UUuUnNVNuuv = 50;
   private float NVuNUuVnVUN = 0.0F;
   private static final int NVuunNnvvvVu = 1024;
   private static final String vNnNuuvVn = "wild";
   private static final RenderPipeline VUuuVUnun = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56864})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/textured_quads"))
         .withVertexFormat(class_290.field_1575, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderPipeline vVVuuVVv = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56864})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/textured_quads"))
         .withVertexFormat(class_290.field_1575, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 VuunNUUUvu = UuUVuuUu(UvUvUNuvNU, vVVuuVVv);
   private static final class_1921 NNUUNUuVNNVn = UuUVuuUu(VVnVNnunVvu, vVVuuVVv);
   private static final class_1921 VvVvnNUnvuvV = UuUVuuUu(c0oOOCcCoC0, vVVuuVVv);
   private static final class_1921 ccOO0COcoco0 = UuUVuuUu(unNNVVNnvvV, VUuuVUnun);
   private static final class_1921 NUVvUUVuVNVv = UuUVuuUu(NuunnvnN, VUuuVUnun);
   private static final RenderPipeline nNuVunNUVu = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("minecraft", "rendertype_lequal_depth_test"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27380)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderPipeline UNvvunVVn = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("minecraft", "rendertype_lines"))
         .withVertexFormat(class_290.field_1576, class_5596.field_29345)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 UnvuVuVnNuvu = class_1921.method_24049(
      "ring_strip", 1024, false, true, nNuVunNUVu, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 UvNNVUVNVuvV = class_1921.method_24049(
      "ring_line", 1024, false, true, UNvvunVVn, class_4688.method_23598().method_23617(false)
   );
   private static final RenderPipeline NnunUUnU = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/color_quads"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 nvuVvuNnNUnv = class_1921.method_24049(
      "color_quads", 1024, false, true, NnunUUnU, class_4688.method_23598().method_23617(false)
   );
   private static final RenderPipeline NnVnNVN = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("minecraft", "rendertype_lines"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27377)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderPipeline vnvvNvUnVv = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "targetesp_cube_lines"))
         .withVertexFormat(class_290.field_1576, class_5596.field_29344)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 OCOocoOoOO = class_1921.method_24049(
      "targetesp_cube_lines", 1024, false, true, vnvvNvUnVv, class_4688.method_23598().method_23617(false)
   );
   private static final RenderPipeline o0Ooc0COOoc = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "targetesp_cube_fill"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   static final class_1921 nvvnUnUn = class_1921.method_24049(
      "targetesp_cube_fill", 1024, false, true, o0Ooc0COOoc, class_4688.method_23598().method_23617(false)
   );
   private static final RenderPipeline UnUUVuVunvVu = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "targetesp_cube_outline"))
         .withVertexFormat(class_290.field_1576, class_5596.field_29344)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   static final class_1921 nnvuvUNuUnN = class_1921.method_24049(
      "targetesp_cube_outline", 1024, false, true, UnUUVuVunvVu, class_4688.method_23598().method_23617(false)
   );

   public TargetESP() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, UNnVVNvvnVvU, uNnUnnuNUnNu, NnUuNNU});
   }

   @Override
   public VnuVUNUv uUnuvNvvNU() {
      return VnuVUNUv.ESP;
   }

   @Override
   public String vVvUvVVuuNvV() {
      String var1 = UuuNnUvUuv();
      return var1 != null && !var1.isBlank() ? var1 : null;
   }

   public static String UuuNnUvUuv() {
      String var0 = NnUuNNU == null ? "" : NnUuNNU.UuuNnUvUuv();
      return var0 == null ? "" : var0;
   }

   @Override
   public boolean uNNnnnuuuN() {
      return true;
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      vUnVuNUUUVu.UuUVuuUu().UuUVuuUu(this, this);
      this.nUUVuvU();
   }

   @Override
   public void C00OOC00oO() {
      nuVUnVnVvV.UuUVuuUu().UuUVuuUu("target_esp");
      vUnVuNUUUVu.UuUVuuUu().UuUVuuUu(this);
      this.nNnVnUNVV.clear();
      super.C00OOC00oO();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      vUnVuNUUUVu.UuUVuuUu().C00OOC00oO(this, this);
      this.nUUVuvU();
      nNvNUVU.UuUVuuUu();
      class_1309 var2 = AttackAura.ccOO0COcoco0 != null ? AttackAura.ccOO0COcoco0 : TriggerBot.UuuNnUvUuv();
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         AttackAura var3 = (AttackAura)ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(AttackAura.class);
         if (var3 != null) {
            nNvNUVU.UuUVuuUu(var2 == null ? 0.0 : 1.0, 0.35F, VnuVvnV.UnUNVVVNuv);
            if (nNvNUVU.nvUVNnuu() > 0.0) {
               if (var2 != null) {
                  if (this.NVUunUNUN != var2) {
                     vuvnUnVnUNnV = 0L;
                     this.nVVUuvuNnUN = 0L;
                     this.nnuUVNUuvvVU = 0.0F;
                  }

                  this.NVUunUNUN = var2;
               }

               if (this.NVUunUNUN != null && !NVNnnvnuunNv.C00OOC00oO("Не отображать")) {
                  class_4598 var4 = nNNnNvVVv.UuUVuuUu();
                  boolean var7 = false /* VF: Semaphore variable */;

                  try {
                     var7 = true;
                     if (NVNnnvnuunNv.C00OOC00oO("Картинка") && UNnVVNvvnVvU.C00OOC00oO("Ромб")) {
                        this.UuUVuuUu(var1.uUnuvNvvNU(), var4, this.NVUunUNUN, var1.vVvUvVVuuNvV());
                     }

                     if (NVNnnvnuunNv.C00OOC00oO("Картинка") && UNnVVNvvnVvU.C00OOC00oO("Клиент")) {
                        this.C00OOC00oO(var1.uUnuvNvvNU(), var4, this.NVUunUNUN, var1.vVvUvVVuuNvV());
                     }

                     if (NVNnnvnuunNv.C00OOC00oO("Картинка") && UNnVVNvvnVvU.C00OOC00oO("Ромб 2")) {
                        this.uUnuvNvvNU(var1.uUnuvNvvNU(), var4, this.NVUunUNUN, var1.vVvUvVVuuNvV());
                     }

                     if (NVNnnvnuunNv.C00OOC00oO("Призраки") && uVunuUNVVUUV.C00OOC00oO("Обычный")) {
                        this.nvUVNnuu(var1.uUnuvNvvNU(), var4, this.NVUunUNUN, var1.vVvUvVVuuNvV());
                     }

                     if (NVNnnvnuunNv.C00OOC00oO("Призраки") && uVunuUNVVUUV.C00OOC00oO("Новый")) {
                        this.uNNnnnuuuN(var1.uUnuvNvvNU(), var4, this.NVUunUNUN, var1.vVvUvVVuuNvV());
                     }

                     if (NVNnnvnuunNv.C00OOC00oO("Призраки") && uVunuUNVVUUV.C00OOC00oO("Старый")) {
                        this.nuUnNvnuUu(var1.uUnuvNvvNU(), var4, this.NVUunUNUN, var1.vVvUvVVuuNvV());
                     }

                     if (NVNnnvnuunNv.C00OOC00oO("Призраки") && uVunuUNVVUUV.C00OOC00oO("Орбита")) {
                        this.VVuuUN(var1.uUnuvNvvNU(), var4, this.NVUunUNUN, var1.vVvUvVVuuNvV());
                     }

                     if (NVNnnvnuunNv.C00OOC00oO("Призраки") && uVunuUNVVUUV.C00OOC00oO("Спираль")) {
                        this.vNUvnnVnUvu(var1.uUnuvNvvNU(), var4, this.NVUunUNUN, var1.vVvUvVVuuNvV());
                     }

                     if (NVNnnvnuunNv.C00OOC00oO("Кольцо")) {
                        this.vVvUvVVuuNvV(var1.uUnuvNvvNU(), var4, this.NVUunUNUN, var1.vVvUvVVuuNvV());
                     }

                     if (NVNnnvnuunNv.C00OOC00oO("Кубики") && uNnUnnuNUnNu.C00OOC00oO("Новый")) {
                        this.UuuNnUvUuv(var1.uUnuvNvvNU(), var4, this.NVUunUNUN, var1.vVvUvVVuuNvV());
                     }

                     if (NVNnnvnuunNv.C00OOC00oO("Кубики") && uNnUnnuNUnNu.C00OOC00oO("Старый")) {
                        this.nUUVuvU(var1.uUnuvNvvNU(), var4, this.NVUunUNUN, var1.vVvUvVVuuNvV());
                     }

                     if (NVNnnvnuunNv.C00OOC00oO("Кубики") && uNnUnnuNUnNu.C00OOC00oO("Орбита")) {
                        this.uVUuuVnNVU(var1.uUnuvNvvNU(), var4, this.NVUunUNUN, var1.vVvUvVVuuNvV());
                     }

                     if (NVNnnvnuunNv.C00OOC00oO("Сфера")) {
                        this.vuuuNvNuv(var1.uUnuvNvvNU(), var4, this.NVUunUNUN, var1.vVvUvVVuuNvV());
                        var7 = false;
                     } else {
                        var7 = false;
                     }
                  } finally {
                     if (var7) {
                        nNNnNvVVv.C00OOC00oO();
                     }
                  }

                  nNNnNvVVv.C00OOC00oO();
               }
            } else {
               this.NVUunUNUN = null;
               vuvnUnVnUNnV = 0L;
               this.nVVUuvuNnUN = 0L;
               this.nnuUVNUuvvVU = 0.0F;
               this.nNnVnUNVV.clear();
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null && var1 != null && var1.uUnuvNvvNU() != null) {
         String var2 = UuuNnUvUuv();
         if (!var2.isBlank() && this.NVUunUNUN != null && !(nNvNUVU.nvUVNnuu() <= 0.001F)) {
            float var3 = var1.uUnuvNvvNU().method_61966().method_60636();
            TargetESP.nvnNNunvv var4 = this.UuUVuuUu(this.NVUunUNUN, var3, var1.nuUnNvnuUu(), var1.VVuuUN());
            if (var4 != null) {
               UnVNvNnU var5 = var1.vVvUvVVuuNvV();
               if (var5 != null) {
                  var5.uUnuvNvvNU();
               }

               float var6 = (float)Math.min(0.92, nNvNUVU.nvUVNnuu() * 0.78);
               float var7 = var4.x + var4.w * 0.5F;
               float var8 = var4.y + var4.h * 0.5F;
               int var9 = nuVUnVnVvV.UuUVuuUu().vVvUvVVuuNvV();
               boolean var10 = VVNunVNVuuu.UuUVuuUu(
                  var2, var9, var4.x, var4.y, var4.w, var4.h, var1.nuUnNvnuUu(), var1.VVuuUN(), var7, var8, UnUNVVVNuv(), var6
               );
               if (var10 && var5 != null) {
                  var5.uUnuvNvvNU();
               }
            }
         }
      }
   }

   private void nUUVuvU() {
      nuVUnVnVvV.UuUVuuUu().UuUVuuUu("target_esp", this.nuUnNvnuUu && !UuuNnUvUuv().isBlank(), this.UUVNuUNUvUnV);
   }

   private TargetESP.nvnNNunvv UuUVuuUu(class_1309 var1, float var2, int var3, int var4) {
      if (var1 != null && !var1.method_31481() && var3 > 1 && var4 > 1 && uUnuvNvvNU.field_1773 != null && uUnuvNvvNU.field_1773.method_19418() != null) {
         class_243 var5 = var1.method_30950(var2);
         class_243 var6 = var1.method_19538();
         class_238 var7 = var1.method_5829()
            .method_989(var5.field_1352 - var6.field_1352, var5.field_1351 - var6.field_1351, var5.field_1350 - var6.field_1350)
            .method_1009(0.05, Math.max(0.05, var1.method_17682() * 0.035), 0.05);
         float var8 = Float.POSITIVE_INFINITY;
         float var9 = Float.POSITIVE_INFINITY;
         float var10 = Float.NEGATIVE_INFINITY;
         float var11 = Float.NEGATIVE_INFINITY;

         for (int var12 = 0; var12 < 2; var12++) {
            double var13 = var12 == 0 ? var7.field_1323 : var7.field_1320;

            for (int var15 = 0; var15 < 2; var15++) {
               double var16 = var15 == 0 ? var7.field_1322 : var7.field_1325;

               for (int var18 = 0; var18 < 2; var18++) {
                  double var19 = var18 == 0 ? var7.field_1321 : var7.field_1324;
                  class_243 var21 = VnNnNnvuvn.UuUVuuUu(new class_243(var13, var16, var19));
                  if (var21 == null || var21.field_1350 <= 0.001F || var21.field_1350 > 1.0) {
                     return null;
                  }

                  var8 = Math.min(var8, (float)var21.field_1352);
                  var9 = Math.min(var9, (float)var21.field_1351);
                  var10 = Math.max(var10, (float)var21.field_1352);
                  var11 = Math.max(var11, (float)var21.field_1351);
               }
            }
         }

         if (!Float.isFinite(var8) || !Float.isFinite(var9) || !Float.isFinite(var10) || !Float.isFinite(var11)) {
            return null;
         } else if (!(var10 < 0.0F) && !(var11 < 0.0F) && !(var8 > var3) && !(var9 > var4)) {
            float var22 = Math.max(1.0F, var10 - var8);
            float var23 = Math.max(1.0F, var11 - var9);
            float var14 = Math.min(96.0F, Math.max(18.0F, var22 * 0.28F));
            float var24 = Math.min(96.0F, Math.max(18.0F, var23 * 0.18F));
            float var25 = Math.max(0.0F, var8 - var14);
            float var17 = Math.max(0.0F, var9 - var24);
            float var26 = Math.min((float)var3, var10 + var14);
            float var27 = Math.min((float)var4, var11 + var24);
            float var20 = var26 - var25;
            float var28 = var27 - var17;
            return var20 > 2.0F && var28 > 2.0F ? new TargetESP.nvnNNunvv(var25, var17, var20, var28) : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static NUunUunuNV UnUNVVVNuv() {
      NvVNvUvunNNu var0 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
         : NvVNvUvunNNu.WILD;
      return NUunUunuNV.UuUVuuUu(var0, VVNunVNVuuu.vVvUvVVuuNvV());
   }

   private void UuUVuuUu(class_4587 var1, class_4598 var2, class_1309 var3, float var4) {
      class_243 var5 = var3.method_30950(var4);
      double var6 = var5.field_1352;
      double var8 = var5.field_1351;
      double var10 = var5.field_1350;
      class_243 var12 = uUnuvNvvNU.field_1773.method_19418().method_19326();
      var1.method_22903();
      var1.method_22904(var6 - var12.field_1352, var8 - var12.field_1351 + var3.method_17682() / 1.75F, var10 - var12.field_1350);
      var1.method_22907(class_7833.field_40716.rotationDegrees(-uUnuvNvvNU.field_1773.method_19418().method_19330()));
      var1.method_22907(class_7833.field_40714.rotationDegrees(uUnuvNvvNU.field_1773.method_19418().method_19329()));
      long var13 = System.currentTimeMillis();
      float var15 = (float)VnNnNnvuvn.vVvUvVVuuNvV(0.0, 720.0, (Math.sin(var13 / 900.0) + 1.0) / 2.0 * 360.0 * 2.0);
      var1.method_22907(class_7833.field_40718.rotationDegrees(var15));
      UnUNuUU.UuUVuuUu();
      int var16 = var3.field_6235;
      float var17 = (float)Math.sin(var16 * (Math.PI / 20));
      UnUNuUU.UuUVuuUu(var17, 0.4F, VnuVvnV.UnUNVVVNuv);
      float var18 = UnUNuUU.uNNnnnuuuN();
      float var19 = (float)nNvNUVU.nvUVNnuu();
      int var20 = VnVnuUn.uUnuvNvvNU(200, 70, 70, (int)(255.0F * var19));
      int var21 = VnVnuUn.uNNnnnuuuN(VnVnuUn.uUnuvNvvNU(VnVnuUn.UuUVuuUu(), var19), var20, UnUNuUU.uNNnnnuuuN());
      float var22 = 1.7F - 0.9F * var19 + (0.35F - 0.35F * var18);
      var1.method_22905(var22, var22, 1.0F);
      class_1921 var23 = VuunNUUUvu;
      Matrix4f var24 = var1.method_23760().method_23761();
      class_4588 var25 = var2.getBuffer(var23);
      UuUVuuUu(var25, var24, var21, (int)(255.0F * var19));
      var1.method_22909();
   }

   private void C00OOC00oO(class_4587 var1, class_4598 var2, class_1309 var3, float var4) {
      class_243 var5 = var3.method_30950(var4);
      double var6 = var5.field_1352;
      double var8 = var5.field_1351;
      double var10 = var5.field_1350;
      class_243 var12 = uUnuvNvvNU.field_1773.method_19418().method_19326();
      var1.method_22903();
      var1.method_22904(var6 - var12.field_1352, var8 - var12.field_1351 + var3.method_17682() / 1.75F, var10 - var12.field_1350);
      var1.method_22907(class_7833.field_40716.rotationDegrees(-uUnuvNvvNU.field_1773.method_19418().method_19330()));
      var1.method_22907(class_7833.field_40714.rotationDegrees(uUnuvNvvNU.field_1773.method_19418().method_19329()));
      long var13 = System.currentTimeMillis();
      float var15 = (float)VnNnNnvuvn.vVvUvVVuuNvV(0.0, 720.0, (Math.sin(var13 / 1600.0) + 1.0) / 2.0 * 360.0 * 2.0);
      var1.method_22907(class_7833.field_40718.rotationDegrees(var15));
      UnUNuUU.UuUVuuUu();
      int var16 = var3.field_6235;
      float var17 = (float)Math.sin(var16 * (Math.PI / 20));
      UnUNuUU.UuUVuuUu(var17, 0.4F, VnuVvnV.UnUNVVVNuv);
      float var18 = UnUNuUU.uNNnnnuuuN();
      float var19 = (float)nNvNUVU.nvUVNnuu();
      int var20 = VnVnuUn.uUnuvNvvNU(200, 70, 70, (int)(255.0F * var19));
      int var21 = VnVnuUn.uNNnnnuuuN(VnVnuUn.uUnuvNvvNU(VnVnuUn.UuUVuuUu(), var19), var20, UnUNuUU.uNNnnnuuuN());
      float var22 = 1.5F - 0.9F * var19 + (0.35F - 0.35F * var18);
      var1.method_22905(var22, var22, 1.0F);
      class_1921 var23 = NNUUNUuVNNVn;
      Matrix4f var24 = var1.method_23760().method_23761();
      class_4588 var25 = var2.getBuffer(var23);
      UuUVuuUu(var25, var24, var21, (int)(255.0F * var19));
      var1.method_22909();
   }

   private void uUnuvNvvNU(class_4587 var1, class_4598 var2, class_1309 var3, float var4) {
      class_243 var5 = var3.method_30950(var4);
      double var6 = var5.field_1352;
      double var8 = var5.field_1351;
      double var10 = var5.field_1350;
      class_243 var12 = uUnuvNvvNU.field_1773.method_19418().method_19326();
      var1.method_22903();
      var1.method_22904(var6 - var12.field_1352, var8 - var12.field_1351 + var3.method_17682() / 1.75F, var10 - var12.field_1350);
      var1.method_22907(class_7833.field_40716.rotationDegrees(-uUnuvNvvNU.field_1773.method_19418().method_19330()));
      var1.method_22907(class_7833.field_40714.rotationDegrees(uUnuvNvvNU.field_1773.method_19418().method_19329()));
      long var13 = System.currentTimeMillis();
      float var15 = (float)VnNnNnvuvn.vVvUvVVuuNvV(0.0, 720.0, (Math.sin(var13 / 1000.0) + 1.0) / 2.0 * 360.0 * 2.0);
      var1.method_22907(class_7833.field_40718.rotationDegrees(var15));
      UnUNuUU.UuUVuuUu();
      int var16 = var3.field_6235;
      float var17 = (float)Math.sin(var16 * (Math.PI / 20));
      UnUNuUU.UuUVuuUu(var17, 0.4F, VnuVvnV.UnUNVVVNuv);
      float var18 = UnUNuUU.uNNnnnuuuN();
      float var19 = (float)nNvNUVU.nvUVNnuu();
      int var20 = VnVnuUn.uUnuvNvvNU(200, 70, 70, (int)(255.0F * var19));
      int var21 = VnVnuUn.uNNnnnuuuN(VnVnuUn.uUnuvNvvNU(VnVnuUn.UuUVuuUu(), var19), var20, UnUNuUU.uNNnnnuuuN());
      float var22 = 1.25F - 0.6F * var19 + (0.35F - 0.35F * var18);
      var1.method_22905(var22, var22, 1.0F);
      class_1921 var23 = VvVvnNUnvuvV;
      Matrix4f var24 = var1.method_23760().method_23761();
      class_4588 var25 = var2.getBuffer(var23);
      UuUVuuUu(var25, var24, var21, (int)(255.0F * var19));
      var1.method_22909();
   }

   private void vVvUvVVuuNvV(class_4587 var1, class_4598 var2, class_1309 var3, float var4) {
      if (var3 != null) {
         class_243 var5 = uUnuvNvvNU.field_1773.method_19418().method_19326();
         double var6 = var3.field_6038 + (var3.method_23317() - var3.field_6038) * var4;
         double var8 = var3.field_5971 + (var3.method_23318() - var3.field_5971) * var4;
         double var10 = var3.field_5989 + (var3.method_23321() - var3.field_5989) * var4;
         var1.method_22903();
         var1.method_22904(var6 - var5.field_1352, var8 - var5.field_1351, var10 - var5.field_1350);
         float var12 = (float)nNvNUVU.nvUVNnuu();
         float var13 = var3.method_17682();
         double var14 = var3.method_17681() * 1.0F - 0.2F * UnUNuUU.uNNnnnuuuN();
         int var16 = VnVnuUn.uUnuvNvvNU(200, 70, 70, (int)(255.0F * var12));
         UnUNuUU.UuUVuuUu();
         int var17 = var3.field_6235;
         float var18 = (float)Math.sin(var17 * (Math.PI / 20));
         UnUNuUU.UuUVuuUu(var18, 0.4F, VnuVvnV.UnUNVVVNuv);
         Matrix4f var19 = var1.method_23760().method_23761();
         double var20 = 1800.0;
         double var22 = System.currentTimeMillis() % var20;
         boolean var24 = var22 > var20 / 2.0;
         double var25 = var22 / (var20 / 2.0);
         var25 = var24 ? var25 - 1.0 : 1.0 - var25;
         var25 = var25 < 0.5 ? 2.0 * var25 * var25 : 1.0 - Math.pow(-2.0 * var25 + 2.0, 2.0) / 2.0;
         double var27 = var13 / 1.25F * (var25 > 0.5 ? 1.0 - var25 : var25) * (var24 ? -1 : 1);
         class_4588 var29 = var2.getBuffer(UnvuVuVnNuvu);

         for (byte var30 = 0; var30 <= 360; var30 += 5) {
            double var31 = Math.toRadians(var30);
            float var33 = (float)(Math.cos(var31) * var14);
            float var34 = (float)(Math.sin(var31) * var14);
            int var35 = VnVnuUn.uNNnnnuuuN(
               VnVnuUn.uUnuvNvvNU(
                  VnVnuUn.C00OOC00oO(VnVnuUn.uNNnnnuuuN(VnVnuUn.UuUVuuUu(), 0.5F), VnVnuUn.uNNnnnuuuN(VnVnuUn.UuUVuuUu(), 1.0F), var30 * 4, 1), var12
               ),
               var16,
               UnUNuUU.uNNnnnuuuN()
            );
            int var36 = var35 >> 16 & 0xFF;
            int var37 = var35 >> 8 & 0xFF;
            int var38 = var35 & 0xFF;
            var29.method_22918(var19, var33, (float)(var13 * var25), var34).method_1336(var36, var37, var38, (int)(180.0F * var12));
            var29.method_22918(var19, var33, (float)(var13 * var25 + var27), var34).method_1336(var36, var37, var38, 0);
         }

         class_4588 var41 = var2.getBuffer(UvNNVUVNVuvV);

         for (byte var42 = 0; var42 <= 360; var42 += 5) {
            double var32 = Math.toRadians(var42);
            float var43 = (float)(Math.cos(var32) * var14);
            float var44 = (float)(Math.sin(var32) * var14);
            int var45 = VnVnuUn.uNNnnnuuuN(
               VnVnuUn.uUnuvNvvNU(
                  VnVnuUn.C00OOC00oO(VnVnuUn.uNNnnnuuuN(VnVnuUn.UuUVuuUu(), 0.5F), VnVnuUn.uNNnnnuuuN(VnVnuUn.UuUVuuUu(), 1.0F), var42 * 4, 1), var12
               ),
               var16,
               UnUNuUU.uNNnnnuuuN()
            );
            var41.method_22918(var19, var43, (float)(var13 * var25), var44).method_39415(VnVnuUn.uNNnnnuuuN(var45, (int)(255.0F * var12)));
         }

         var1.method_22909();
      }
   }

   private void uNNnnnuuuN(class_4587 var1, class_4598 var2, class_1309 var3, float var4) {
      if (var3 != null) {
         long var5 = System.currentTimeMillis();
         if (this.nVVUuvuNnUN == 0L) {
            this.nVVUuvuNnUN = var5;
         }

         long var7 = var5 - this.nVVUuvuNnUN;
         if (var7 > 0L) {
            this.nnuUVNUuvvVU += (float)(5L * var7) / 900.0F;
         }

         this.nVVUuvuNnUN = var5;
         class_243 var9 = var3.method_30950(var4);
         class_243 var10 = uUnuvNvvNU.field_1773.method_19418().method_19326();
         double var11 = var9.field_1352 - var10.field_1352;
         double var13 = var9.field_1351 - var10.field_1351;
         double var15 = var9.field_1350 - var10.field_1350;
         float var17 = (float)nNvNUVU.nvUVNnuu();
         UnUNuUU.UuUVuuUu();
         int var18 = var3.field_6235;
         float var19 = (float)Math.sin(var18 * (Math.PI / 20));
         UnUNuUU.UuUVuuUu(var19, 0.4F, VnuVvnV.UnUNVVVNuv);
         float var20 = UnUNuUU.uNNnnnuuuN();
         int var21 = VnVnuUn.UuUVuuUu();
         int var22 = VnVnuUn.uUnuvNvvNU(200, 70, 70, (int)(255.0F * var17));
         int var23 = VnVnuUn.uNNnnnuuuN(VnVnuUn.uUnuvNvvNU(var21, var17), var22, var20);
         class_1921 var24 = ccOO0COcoco0;
         byte var25 = 3;
         byte var26 = 12;
         int var27 = 3 * var25;
         var1.method_22903();
         class_4184 var28 = uUnuvNvvNU.field_1773.method_19418();

         for (byte var29 = 0; var29 < var27; var29 += var25) {
            for (int var30 = 0; var30 < var26; var30++) {
               float var31 = this.nnuUVNUuvvVU + var30 * 0.1F;
               float var32 = 0.75F;
               float var33 = 0.5F;
               int var34 = (int)Math.pow(var29, 2.0);
               var1.method_22903();
               double var35 = var11 + var32 * Math.sin(var31 + var34);
               double var37 = var13 + var33 + 0.3F * Math.sin(this.nnuUVNUuvvVU + var30 * 0.2F) + 0.2F * var29;
               double var39 = var15 + var32 * Math.cos(var31 - var34);
               var1.method_22904(var35, var37, var39);
               float var41 = 0.005F + var30 / 2000.0F;
               var1.method_22905(var41, var41, var41);
               var1.method_22907(class_7833.field_40716.rotationDegrees(-var28.method_19330()));
               var1.method_22907(class_7833.field_40714.rotationDegrees(var28.method_19329()));
               Matrix4f var42 = var1.method_23760().method_23761();
               class_4588 var43 = var2.getBuffer(var24);
               int var45 = var23 >> 16 & 0xFF;
               int var46 = var23 >> 8 & 0xFF;
               int var47 = var23 & 0xFF;
               int var48 = (int)(var17 * 255.0F);
               byte var49 = -25;
               byte var50 = 50;
               var43.method_22918(var42, var49, var49 + var50, 0.0F)
                  .method_1336(var45, var46, var47, var48)
                  .method_22913(0.0F, 1.0F)
                  .method_22922(class_4608.field_21444)
                  .method_60803(15728880)
                  .method_22914(0.0F, 0.0F, 1.0F);
               var43.method_22918(var42, var49 + var50, var49 + var50, 0.0F)
                  .method_1336(var45, var46, var47, var48)
                  .method_22913(1.0F, 1.0F)
                  .method_22922(class_4608.field_21444)
                  .method_60803(15728880)
                  .method_22914(0.0F, 0.0F, 1.0F);
               var43.method_22918(var42, var49 + var50, var49, 0.0F)
                  .method_1336(var45, var46, var47, var48)
                  .method_22913(1.0F, 0.0F)
                  .method_22922(class_4608.field_21444)
                  .method_60803(15728880)
                  .method_22914(0.0F, 0.0F, 1.0F);
               var43.method_22918(var42, var49, var49, 0.0F)
                  .method_1336(var45, var46, var47, var48)
                  .method_22913(0.0F, 0.0F)
                  .method_22922(class_4608.field_21444)
                  .method_60803(15728880)
                  .method_22914(0.0F, 0.0F, 1.0F);
               var1.method_22909();
            }
         }

         var1.method_22909();
      }
   }

   private void nuUnNvnuUu(class_4587 var1, class_4598 var2, class_1309 var3, float var4) {
      if (var3 != null) {
         long var5 = System.currentTimeMillis();
         if (this.nVVUuvuNnUN == 0L) {
            this.nVVUuvuNnUN = var5;
         }

         long var7 = var5 - this.nVVUuvuNnUN;
         if (var7 > 0L) {
            this.nnuUVNUuvvVU += (float)(5L * var7) / 200.0F;
         }

         this.nVVUuvuNnUN = var5;
         class_243 var9 = var3.method_30950(var4);
         class_243 var10 = uUnuvNvvNU.field_1773.method_19418().method_19326();
         double var11 = var9.field_1352 - var10.field_1352;
         double var13 = var9.field_1351 + 1.1F - var10.field_1351;
         double var15 = var9.field_1350 - var10.field_1350;
         float var17 = (float)nNvNUVU.nvUVNnuu();
         class_1921 var18 = ccOO0COcoco0;
         byte var19 = 17;
         byte var20 = 6;
         float var21 = 1.25F;
         float var22 = 1.1F;
         float var23 = this.nnuUVNUuvvVU;
         class_4184 var24 = uUnuvNvvNU.field_1773.method_19418();
         double var25 = var3.method_17681() + 0.12F;
         boolean var27 = uUnuvNvvNU.field_1724.method_6057(var3);
         class_4588 var28 = var2.getBuffer(var18);
         UnUNuUU.UuUVuuUu();
         int var29 = var3.field_6235;
         float var30 = (float)Math.sin(var29 * (Math.PI / 20));
         UnUNuUU.UuUVuuUu(var30, 0.4F, VnuVvnV.UnUNVVVNuv);
         float var31 = UnUNuUU.uNNnnnuuuN();
         int var32 = UuUVuuUu(255, var31);

         for (int var33 = 0; var33 < 3; var33++) {
            for (int var34 = 0; var34 <= var19; var34++) {
               double var35 = Math.toRadians(((var34 / 1.5F + var23) * var20 + var33 * 120) % (var20 * 360));
               double var37 = Math.sin(Math.toRadians(var23 * 2.0F + var34 * (var33 + 1)) * var22) / var21;
               float var39 = (float)var34 / var19;
               var1.method_22903();
               var1.method_22904(var11 + Math.cos(var35) * var25, var13 + var37, var15 + Math.sin(var35) * var25);
               var1.method_22907(class_7833.field_40716.rotationDegrees(-var24.method_19330()));
               var1.method_22907(class_7833.field_40714.rotationDegrees(var24.method_19329()));
               Matrix4f var40 = var1.method_23760().method_23761();
               int var41 = UuUVuuUu(var32, (int)(255.0F * var39 * var17));
               int var42 = var41 >> 16 & 0xFF;
               int var43 = var41 >> 8 & 0xFF;
               int var44 = var41 & 0xFF;
               int var45 = var41 >> 24 & 0xFF;
               float var46 = Math.max(0.25F * var39, 0.22F);
               var28.method_22918(var40, -var46, var46, 0.0F)
                  .method_1336(var42, var43, var44, var45)
                  .method_22913(0.0F, 1.0F)
                  .method_22922(class_4608.field_21444)
                  .method_60803(15728880)
                  .method_22914(0.0F, 0.0F, 1.0F);
               var28.method_22918(var40, var46, var46, 0.0F)
                  .method_1336(var42, var43, var44, var45)
                  .method_22913(1.0F, 1.0F)
                  .method_22922(class_4608.field_21444)
                  .method_60803(15728880)
                  .method_22914(0.0F, 0.0F, 1.0F);
               var28.method_22918(var40, var46, -var46, 0.0F)
                  .method_1336(var42, var43, var44, var45)
                  .method_22913(1.0F, 0.0F)
                  .method_22922(class_4608.field_21444)
                  .method_60803(15728880)
                  .method_22914(0.0F, 0.0F, 1.0F);
               var28.method_22918(var40, -var46, -var46, 0.0F)
                  .method_1336(var42, var43, var44, var45)
                  .method_22913(0.0F, 0.0F)
                  .method_22922(class_4608.field_21444)
                  .method_60803(15728880)
                  .method_22914(0.0F, 0.0F, 1.0F);
               var1.method_22909();
            }
         }
      }
   }

   private static float vNVuvnUUnuUn() {
      return (float)(System.currentTimeMillis() % 1000000L) / 1000.0F;
   }

   private float UuUVuuUu(class_1309 var1) {
      UnUNuUU.UuUVuuUu();
      int var2 = var1.field_6235;
      float var3 = (float)Math.sin(var2 * (Math.PI / 20));
      UnUNuUU.UuUVuuUu(var3, 0.4F, VnuVvnV.UnUNVVVNuv);
      return UnUNuUU.uNNnnnuuuN();
   }

   private void UuUVuuUu(
      class_4587 var1, class_4598 var2, class_4184 var3, class_1921 var4, double var5, double var7, double var9, float var11, int var12, int var13
   ) {
      if (var13 > 0) {
         var1.method_22903();
         var1.method_22904(var5, var7, var9);
         var1.method_22907(class_7833.field_40716.rotationDegrees(-var3.method_19330()));
         var1.method_22907(class_7833.field_40714.rotationDegrees(var3.method_19329()));
         var1.method_22905(var11, var11, var11);
         UuUVuuUu(var2.getBuffer(var4), var1.method_23760().method_23761(), var12, var13);
         var1.method_22909();
      }
   }

   private void VVuuUN(class_4587 var1, class_4598 var2, class_1309 var3, float var4) {
      if (var3 != null) {
         class_4184 var5 = uUnuvNvvNU.field_1773.method_19418();
         class_243 var6 = var5.method_19326();
         class_243 var7 = var3.method_30950(var4);
         float var8 = (float)nNvNUVU.nvUVNnuu();
         float var9 = this.UuUVuuUu(var3);
         int var10 = UuUVuuUu(255, var9) & 16777215;
         double var11 = var7.field_1352 - var6.field_1352;
         double var13 = var7.field_1350 - var6.field_1350;
         double var15 = var7.field_1351 - var6.field_1351 + var3.method_17682() * 0.5;
         double var17 = var3.method_17681() / 2.0 + 0.5;
         double var19 = var3.method_17682() * 0.18;
         byte var21 = 16;
         float var22 = vNVuvnUUnuUn();

         for (int var23 = 0; var23 < var21; var23++) {
            double var24 = (Math.PI * 2) / var21 * var23 + var22 * 1.4;
            double var26 = var11 + Math.cos(var24) * var17;
            double var28 = var13 + Math.sin(var24) * var17;
            double var30 = var15 + Math.sin(var22 * 2.2 + var23 * 0.6) * var19;
            float var32 = 0.55F + 0.45F * (float)Math.sin(var22 * 2.0 + var23);
            int var33 = (int)(215.0F * var8 * var32);
            float var34 = 0.3F + 0.06F * (float)Math.sin(var22 * 3.0 + var23);
            this.UuUVuuUu(var1, var2, var5, ccOO0COcoco0, var26, var30, var28, var34, var10, var33);
         }
      }
   }

   private void vNUvnnVnUvu(class_4587 var1, class_4598 var2, class_1309 var3, float var4) {
      if (var3 != null) {
         class_4184 var5 = uUnuvNvvNU.field_1773.method_19418();
         class_243 var6 = var5.method_19326();
         class_243 var7 = var3.method_30950(var4);
         float var8 = (float)nNvNUVU.nvUVNnuu();
         float var9 = this.UuUVuuUu(var3);
         int var10 = UuUVuuUu(255, var9) & 16777215;
         double var11 = var7.field_1352 - var6.field_1352;
         double var13 = var7.field_1350 - var6.field_1350;
         double var15 = var7.field_1351 - var6.field_1351 - 0.1;
         double var17 = var3.method_17681() / 2.0 + 0.32;
         double var19 = var3.method_17682() + 0.2;
         double var21 = 2.5;
         byte var23 = 18;
         float var24 = vNVuvnUUnuUn();

         for (int var25 = 0; var25 < 2; var25++) {
            for (int var26 = 0; var26 <= var23; var26++) {
               double var27 = (double)var26 / var23;
               double var29 = var27 * var21 * Math.PI * 2.0 + var24 * 2.0 + var25 * Math.PI;
               double var31 = var11 + Math.cos(var29) * var17;
               double var33 = var13 + Math.sin(var29) * var17;
               double var35 = var15 + var27 * var19;
               int var37 = (int)(220.0F * var8 * (0.3 + 0.7 * Math.sin(var27 * Math.PI)));
               this.UuUVuuUu(var1, var2, var5, ccOO0COcoco0, var31, var35, var33, 0.24F, var10, var37);
            }
         }
      }
   }

   private void uVUuuVnNVU(class_4587 var1, class_4598 var2, class_1309 var3, float var4) {
      if (var3 != null) {
         class_4184 var5 = uUnuvNvvNU.field_1773.method_19418();
         class_243 var6 = var5.method_19326();
         class_243 var7 = var3.method_30950(var4);
         float var8 = (float)nNvNUVU.nvUVNnuu();
         float var9 = this.UuUVuuUu(var3);
         int var10 = UuUVuuUu(255, var9) & 16777215;
         double var11 = var7.field_1352 - var6.field_1352;
         double var13 = var7.field_1350 - var6.field_1350;
         double var15 = var7.field_1351 - var6.field_1351 + var3.method_17682() * 0.5;
         double var17 = var3.method_17681() / 2.0 + 0.55;
         byte var19 = 14;
         float var20 = vNVuvnUUnuUn();

         for (int var21 = 0; var21 < var19; var21++) {
            double var22 = (Math.PI * 2) / var19 * var21 + var20 * 1.1;
            double var24 = var11 + Math.cos(var22) * var17;
            double var26 = var13 + Math.sin(var22) * var17;
            double var28 = var15 + Math.sin(var20 * 2.0 + var21) * 0.12;
            var1.method_22903();
            var1.method_22904(var24, var28, var26);
            var1.method_22903();
            float var30 = (var20 * 50.0F + var21 * 28.0F) % 360.0F;
            var1.method_22907(class_7833.field_40716.rotationDegrees(var30));
            var1.method_22907(class_7833.field_40714.rotationDegrees(var30 * 0.7F));
            Matrix4f var31 = var1.method_23760().method_23761();
            float var32 = 0.16F + 0.02F * (float)Math.sin(var20 * 3.0 + var21);
            uUVNNUvvn.NVnVnNnN.NVnVnNnN.UuUVuuUu(var2.getBuffer(nvvnUnUn), var31, UuUVuuUu(var10, (int)(70.0F * var8)), var32);
            uUVNNUvvn.NVnVnNnN.NVnVnNnN.C00OOC00oO(var2.getBuffer(nnvuvUNuUnN), var31, UuUVuuUu(var10, (int)(230.0F * var8)), var32);
            var1.method_22909();
            var1.method_22903();
            var1.method_22907(class_7833.field_40716.rotationDegrees(-var5.method_19330()));
            var1.method_22907(class_7833.field_40714.rotationDegrees(var5.method_19329()));
            float var33 = var32 * 2.4F;
            var1.method_22905(var33, var33, var33);
            UuUVuuUu(var2.getBuffer(NUVvUUVuVNVv), var1.method_23760().method_23761(), var10, (int)(60.0F * var8));
            var1.method_22909();
            var1.method_22909();
         }
      }
   }

   private void vuuuNvNuv(class_4587 var1, class_4598 var2, class_1309 var3, float var4) {
      if (var3 != null) {
         class_4184 var5 = uUnuvNvvNU.field_1773.method_19418();
         class_243 var6 = var5.method_19326();
         class_243 var7 = var3.method_30950(var4);
         float var8 = (float)nNvNUVU.nvUVNnuu();
         float var9 = this.UuUVuuUu(var3);
         int var10 = UuUVuuUu(UuUVuuUu(255, var9) & 16777215, (int)(220.0F * var8));
         double var11 = var7.field_1352 - var6.field_1352;
         double var13 = var7.field_1351 - var6.field_1351 + var3.method_17682() * 0.5;
         double var15 = var7.field_1350 - var6.field_1350;
         float var17 = (float)(Math.max((double)var3.method_17681(), var3.method_17682() * 0.5) * 0.72 + 0.3 + var9 * 0.2);
         float var18 = vNVuvnUUnuUn();
         var1.method_22903();
         var1.method_22904(var11, var13, var15);
         var1.method_22903();
         var1.method_22907(class_7833.field_40716.rotationDegrees(var18 * 38.0F));
         UuUVuuUu(var2.getBuffer(nnvuvUNuUnN), var1.method_23760().method_23761(), var17, 40, var10);
         var1.method_22909();
         var1.method_22903();
         var1.method_22907(class_7833.field_40718.rotationDegrees(var18 * 30.0F));
         var1.method_22907(class_7833.field_40714.rotationDegrees(90.0F));
         UuUVuuUu(var2.getBuffer(nnvuvUNuUnN), var1.method_23760().method_23761(), var17, 40, var10);
         var1.method_22909();
         var1.method_22903();
         var1.method_22907(class_7833.field_40714.rotationDegrees(var18 * 26.0F + 90.0F));
         var1.method_22907(class_7833.field_40718.rotationDegrees(90.0F));
         UuUVuuUu(var2.getBuffer(nnvuvUNuUnN), var1.method_23760().method_23761(), var17, 40, var10);
         var1.method_22909();
         var1.method_22909();
      }
   }

   private static void UuUVuuUu(class_4588 var0, Matrix4f var1, float var2, int var3, int var4) {
      int var5 = var4 >> 16 & 0xFF;
      int var6 = var4 >> 8 & 0xFF;
      int var7 = var4 & 0xFF;
      int var8 = var4 >>> 24 & 0xFF;

      for (int var9 = 0; var9 < var3; var9++) {
         double var10 = (Math.PI * 2) / var3 * var9;
         double var12 = (Math.PI * 2) / var3 * (var9 + 1);
         var0.method_22918(var1, (float)(Math.cos(var10) * var2), 0.0F, (float)(Math.sin(var10) * var2)).method_1336(var5, var6, var7, var8);
         var0.method_22918(var1, (float)(Math.cos(var12) * var2), 0.0F, (float)(Math.sin(var12) * var2)).method_1336(var5, var6, var7, var8);
      }
   }

   static void UuUVuuUu(class_4588 var0, Matrix4f var1, int var2, int var3) {
      int var4 = var2 >> 16 & 0xFF;
      int var5 = var2 >> 8 & 0xFF;
      int var6 = var2 & 0xFF;
      var0.method_22918(var1, -0.5F, -0.5F, 0.0F)
         .method_1336(var4, var5, var6, var3)
         .method_22913(0.0F, 1.0F)
         .method_22922(class_4608.field_21444)
         .method_60803(15728880)
         .method_22914(0.0F, 0.0F, 1.0F);
      var0.method_22918(var1, 0.5F, -0.5F, 0.0F)
         .method_1336(var4, var5, var6, var3)
         .method_22913(1.0F, 1.0F)
         .method_22922(class_4608.field_21444)
         .method_60803(15728880)
         .method_22914(0.0F, 0.0F, 1.0F);
      var0.method_22918(var1, 0.5F, 0.5F, 0.0F)
         .method_1336(var4, var5, var6, var3)
         .method_22913(1.0F, 0.0F)
         .method_22922(class_4608.field_21444)
         .method_60803(15728880)
         .method_22914(0.0F, 0.0F, 1.0F);
      var0.method_22918(var1, -0.5F, 0.5F, 0.0F)
         .method_1336(var4, var5, var6, var3)
         .method_22913(0.0F, 0.0F)
         .method_22922(class_4608.field_21444)
         .method_60803(15728880)
         .method_22914(0.0F, 0.0F, 1.0F);
   }

   private static class_1921 UuUVuuUu(class_2960 var0, RenderPipeline var1) {
      return class_1921.method_24049(
         var0.toString(), 1024, false, true, var1, class_4688.method_23598().method_34577(new class_4683(var0, false)).method_23617(false)
      );
   }

   private static int UuUVuuUu(int var0, float var1) {
      int var2 = 6061311;

      try {
         NvVNvUvunNNu var3 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
            ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
            : NvVNvUvunNNu.WILD;
         if (var3 == NvVNvUvunNNu.CUSTOM && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO != null) {
            var2 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO.vNUvnnVnUvu() & 16777215;
         } else if (var3 != null && var3.UuUVuuUu() != null) {
            var2 = var3.UuUVuuUu().getRGB() & 16777215;
         }
      } catch (Throwable var11) {
      }

      float var12 = var1 < 0.0F ? 0.0F : Math.min(var1, 1.0F);
      int var4 = var2 >> 16 & 0xFF;
      int var5 = var2 >> 8 & 0xFF;
      int var6 = var2 & 0xFF;
      int var7 = Math.round(var4 + (235 - var4) * var12);
      int var8 = Math.round(var5 + (70 - var5) * var12);
      int var9 = Math.round(var6 + (70 - var6) * var12);
      int var10 = Math.max(0, Math.min(255, var0));
      return var10 << 24 | var7 << 16 | var8 << 8 | var9;
   }

   static int UuUVuuUu(int var0, int var1) {
      return Math.max(0, Math.min(255, var1)) << 24 | var0 & 16777215;
   }

   private void nvUVNnuu(class_4587 var1, class_4598 var2, class_1309 var3, float var4) {
      class_310 var5 = class_310.method_1551();
      if (var3 != null) {
         double var6 = 0.3 + var3.method_17681() / 2.0F;
         UnUNuUU.UuUVuuUu();
         int var8 = var3.field_6235;
         float var9 = (float)Math.sin(var8 * (Math.PI / 20));
         UnUNuUU.UuUVuuUu(var9, 0.4F, VnuVvnV.UnUNVVVNuv);
         float var10 = UnUNuUU.uNNnnnuuuN();
         float var11 = 30.0F;
         float var12 = 0.4F - 0.1F * var10;
         double var13 = 6 - (int)(1.0F * var10);
         int var15 = 40 - (int)(12.0F * var10);
         class_243 var16 = var5.field_1773.method_19418().method_19326();
         class_4184 var17 = var5.field_1773.method_19418();
         if (vuvnUnVnUNnV == 0L) {
            vuvnUnVnUNnV = System.currentTimeMillis();
         }

         long var18 = System.currentTimeMillis();
         class_243 var20 = var3.method_30950(var4);
         var20 = new class_243(var20.field_1352, var20.field_1351 + 0.32 + var3.method_17682() / 2.0F, var20.field_1350);
         double var21 = var20.field_1352 + 0.2;
         double var23 = var20.field_1351;
         double var25 = var20.field_1350;
         class_1921 var27 = ccOO0COcoco0;
         class_4588 var28 = var2.getBuffer(var27);
         float var29 = (float)nNvNUVU.nvUVNnuu();
         int var30 = UuUVuuUu((int)(255.0F * var29), var10);
         int var31 = var30;
         int var32 = UuUVuuUu(var30, (int)(210.0F * var29));
         int var33 = UuUVuuUu(var30, (int)(150.0F * var29));
         int var34 = UuUVuuUu(var30, (int)(90.0F * var29));
         var1.method_22903();
         var1.method_22904(var21 - var16.field_1352, var23 - var16.field_1351, var25 - var16.field_1350);
         float var35 = 0.3F;

         for (int var36 = 0; var36 < var15; var36++) {
            double var37 = 0.05F * (var18 - vuvnUnVnUNnV - var36 * var13) / var11;
            double var39 = Math.sin(var37 * Math.PI) * var6;
            double var41 = Math.cos(var37 * Math.PI) * var6;
            double var43 = Math.cos(var37 * Math.PI) * var6;
            float var45 = (float)var36 / (var15 - 1);
            float var46 = 1.0F - var45 * var35;
            float var47 = var12 * var46;
            var1.method_22903();
            var1.method_22904(var39, var43, -var41);
            var1.method_46416(-var47 / 2.0F, -var47 / 2.0F, 0.0F);
            var1.method_22907(class_7833.field_40716.rotationDegrees(-var17.method_19330()));
            var1.method_22907(class_7833.field_40714.rotationDegrees(var17.method_19329()));
            var1.method_46416(var47 / 2.0F, var47 / 2.0F, 0.0F);
            Matrix4f var48 = var1.method_23760().method_23761();
            this.UuUVuuUu(var28, var48, var31, var32, var33, var34, var47);
            var1.method_22909();
         }

         for (int var50 = 0; var50 < var15; var50++) {
            double var52 = 0.05F * (var18 - vuvnUnVnUNnV - var50 * var13) / var11;
            double var54 = Math.sin(var52 * Math.PI) * var6;
            double var56 = Math.cos(var52 * Math.PI) * var6;
            double var58 = Math.sin(var52 * Math.PI) * var6;
            float var60 = (float)var50 / (var15 - 1);
            float var62 = 1.0F - var60 * var35;
            float var64 = var12 * var62;
            var1.method_22903();
            var1.method_22904(-var54, var58, -var56);
            var1.method_46416(-var64 / 2.0F, -var64 / 2.0F, 0.0F);
            var1.method_22907(class_7833.field_40716.rotationDegrees(-var17.method_19330()));
            var1.method_22907(class_7833.field_40714.rotationDegrees(var17.method_19329()));
            var1.method_46416(var64 / 2.0F, var64 / 2.0F, 0.0F);
            Matrix4f var66 = var1.method_23760().method_23761();
            this.UuUVuuUu(var28, var66, var31, var32, var33, var34, var64);
            var1.method_22909();
         }

         for (int var51 = 0; var51 < var15; var51++) {
            double var53 = 0.05F * (var18 - vuvnUnVnUNnV - var51 * var13) / var11;
            double var55 = Math.sin(var53 * Math.PI) * var6;
            double var57 = Math.cos(var53 * Math.PI) * var6;
            double var59 = Math.sin(var53 * Math.PI) * var6;
            float var61 = (float)var51 / (var15 - 1);
            float var63 = 1.0F - var61 * var35;
            float var65 = var12 * var63;
            var1.method_22903();
            var1.method_22904(var55, var59, var57);
            var1.method_46416(-var65 / 2.0F, -var65 / 2.0F, 0.0F);
            var1.method_22907(class_7833.field_40716.rotationDegrees(-var17.method_19330()));
            var1.method_22907(class_7833.field_40714.rotationDegrees(var17.method_19329()));
            var1.method_46416(var65 / 2.0F, var65 / 2.0F, 0.0F);
            Matrix4f var67 = var1.method_23760().method_23761();
            this.UuUVuuUu(var28, var67, var31, var32, var33, var34, var65);
            var1.method_22909();
         }

         var1.method_22909();
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, int var3, int var4, int var5, int var6, float var7) {
      int var8 = var3 >> 16 & 0xFF;
      int var9 = var3 >> 8 & 0xFF;
      int var10 = var3 & 0xFF;
      int var11 = var3 >> 24 & 0xFF;
      int var12 = var4 >> 16 & 0xFF;
      int var13 = var4 >> 8 & 0xFF;
      int var14 = var4 & 0xFF;
      int var15 = var4 >> 24 & 0xFF;
      int var16 = var5 >> 16 & 0xFF;
      int var17 = var5 >> 8 & 0xFF;
      int var18 = var5 & 0xFF;
      int var19 = var5 >> 24 & 0xFF;
      int var20 = var6 >> 16 & 0xFF;
      int var21 = var6 >> 8 & 0xFF;
      int var22 = var6 & 0xFF;
      int var23 = var6 >> 24 & 0xFF;
      var1.method_22918(var2, 0.0F, -var7, 0.0F).method_22913(0.0F, 0.0F).method_1336(var8, var9, var10, var11);
      var1.method_22918(var2, -var7, -var7, 0.0F).method_22913(0.0F, 1.0F).method_1336(var12, var13, var14, var15);
      var1.method_22918(var2, -var7, 0.0F, 0.0F).method_22913(1.0F, 1.0F).method_1336(var16, var17, var18, var19);
      var1.method_22918(var2, 0.0F, 0.0F, 0.0F).method_22913(1.0F, 0.0F).method_1336(var20, var21, var22, var23);
   }

   private void UuuNnUvUuv(class_4587 var1, class_4598 var2, class_1309 var3, float var4) {
      if (var3 != null) {
         class_243 var5 = uUnuvNvvNU.field_1773.method_19418().method_19326();
         long var6 = System.currentTimeMillis();
         byte var8 = 24;
         double var9 = 0.4 + var3.method_17681() / 2.0F + 0.35F - 0.35F * nNvNUVU.uNNnnnuuuN();
         double var11 = var3.method_17682();
         class_243 var13 = var3.method_30950(var4);
         float var14 = (float)nNvNUVU.nvUVNnuu();
         UnUNuUU.UuUVuuUu();
         int var15 = var3.field_6235;
         float var16 = (float)Math.sin(var15 * (Math.PI / 20));
         UnUNuUU.UuUVuuUu(var16, 0.4F, VnuVvnV.UnUNVVVNuv);
         float var17 = UnUNuUU.uNNnnnuuuN();
         int var18 = UuUVuuUu(Math.round(70.0F * var14), var17);
         int var19 = UuUVuuUu(Math.round(225.0F * var14), var17);
         int var20 = UuUVuuUu(255, var17);

         for (int var21 = 0; var21 < var8; var21++) {
            double var22 = Math.sin(var21 * 132.12 + 4.12);
            double var24 = Math.cos(var21 * 453.21 + 1.23);
            double var26 = Math.sin(var21 * 789.34 + 9.87);
            double var30 = 1.0;
            double var32 = (Math.PI * 2) / var8 * var21;
            double var34 = var6 / 6000.0 * (Math.PI * 2) * var30;
            double var36 = var34 + var32;
            double var38 = Math.cos(var36) * var9;
            double var40 = Math.sin(var36) * var9;
            double var42 = 1.0 + var22 * 0.2;
            double var44 = var32 + var26 * 2.0;
            double var46 = Math.sin(var6 / 9000.0 * (Math.PI * 2) * var42 + var44) * 0.45 + 0.55;
            double var48 = var46 * var11;
            double var50 = var13.field_1352 + var38 - var5.field_1352;
            double var52 = var13.field_1351 + var48 - var5.field_1351;
            double var54 = var13.field_1350 + var40 - var5.field_1350;
            var1.method_22903();
            var1.method_22904(var50, var52, var54);
            float var56 = 1.0F + 0.15F * (float)Math.sin(var6 / 400.0 + var21 * 1.5);
            float var57 = 0.19F * var56;
            double var58 = var17 * (0.5 + 0.5 * Math.sin(var21 * 123.45));
            if (var58 > 0.05) {
               var57 = (float)(var57 * (1.0 - var58 * 0.2));
               double var60 = var58 * 0.4;
               var1.method_22904(Math.cos(var36) * var60, 0.0, Math.sin(var36) * var60);
            }

            var1.method_22903();
            float var68 = 12000.0F + (float)var26 * 2000.0F;
            float var61 = (float)(var6 % (long)Math.abs(var68)) / Math.abs(var68) * 360.0F;
            if (var21 % 3 == 0) {
               var1.method_22907(class_7833.field_40716.rotationDegrees(var61));
               var1.method_22907(class_7833.field_40714.rotationDegrees(var61));
            } else if (var21 % 3 == 1) {
               var1.method_22907(class_7833.field_40718.rotationDegrees(var61));
               var1.method_22907(class_7833.field_40716.rotationDegrees(var61));
            } else {
               var1.method_22907(class_7833.field_40714.rotationDegrees(var61));
               var1.method_22907(class_7833.field_40718.rotationDegrees(var61));
            }

            class_4588 var62 = var2.getBuffer(nvvnUnUn);
            Matrix4f var63 = var1.method_23760().method_23761();
            uUVNNUvvn.NVnVnNnN.NVnVnNnN.UuUVuuUu(var62, var63, var18, var57);
            class_4588 var64 = var2.getBuffer(nnvuvUNuUnN);
            uUVNNUvvn.NVnVnNnN.NVnVnNnN.C00OOC00oO(var64, var63, var19, var57);
            var1.method_22909();
            var1.method_22903();
            var1.method_22907(class_7833.field_40716.rotationDegrees(-uUnuvNvvNU.field_1773.method_19418().method_19330()));
            var1.method_22907(class_7833.field_40714.rotationDegrees(uUnuvNvvNU.field_1773.method_19418().method_19329()));
            class_4588 var65 = var2.getBuffer(NUVvUUVuVNVv);
            Matrix4f var66 = var1.method_23760().method_23761();
            float var67 = var57 * 2.0F;
            var1.method_22905(var67, var67, var67);
            UuUVuuUu(var65, var66, var20, (int)(70.0F * var14));
            var1.method_22909();
            var1.method_22909();
         }
      }
   }

   private void nUUVuvU(class_4587 var1, class_4598 var2, class_1309 var3, float var4) {
      if (var3 == null) {
         this.nNnVnUNVV.clear();
      } else {
         Iterator var5 = this.nNnVnUNVV.iterator();

         while (var5.hasNext()) {
            TargetESP.NVnVnNnN var6 = (TargetESP.NVnVnNnN)var5.next();
            if (var6.UuuNnUvUuv.nuUnNvnuUu() != uununU.FORWARDS && var6.UuuNnUvUuv.uVUuuVnNVU() <= 0.0F) {
               var5.remove();
            }
         }

         long var19 = System.currentTimeMillis();
         uUVVvVVNvvn = Math.max(0.001F, Math.min(0.1F, (float)(var19 - nuunNvv) / 1000.0F));
         nuunNvv = var19;
         if (this.nNnVnUNVV.size() < 50) {
            this.NVuNUuVnVUN = this.NVuNUuVnVUN + uUVVvVVNvvn;

            while (this.NVuNUuVnVUN >= 0.02F && this.nNnVnUNVV.size() < 50) {
               this.NVuNUuVnVUN -= 0.02F;

               for (int var8 = 0; var8 < 1 && this.nNnVnUNVV.size() < 50; var8++) {
                  double var9 = UuvVnuU.UuUVuuUu(0.0F, 360.0F);
                  double var11 = Math.cos(var9 * Math.PI / 180.0) * 0.7F;
                  double var13 = UuvVnuU.UuuNnUvUuv(0.04F, 0.2F);
                  double var15 = Math.sin(var9 * Math.PI / 180.0) * 0.7F;
                  this.nNnVnUNVV.add(new TargetESP.NVnVnNnN(var3, var11, var13, var15));
               }
            }
         }

         if (!this.nNnVnUNVV.isEmpty()) {
            float var20 = (float)nNvNUVU.nvUVNnuu();
            UnUNuUU.UuUVuuUu();
            int var21 = var3.field_6235;
            float var10 = (float)Math.sin(var21 * (Math.PI / 20));
            UnUNuUU.UuUVuuUu(var10, 0.4F, VnuVvnV.UnUNVVVNuv);
            float var22 = UnUNuUU.uNNnnnuuuN();
            int var12 = UuUVuuUu(255, var22);
            int var23 = UuUVuuUu(255, var22);
            class_243 var14 = uUnuvNvvNU.field_1773.method_19418().method_19326();
            float var24 = uUnuvNvvNU.field_1773.method_19418().method_19329();
            float var16 = uUnuvNvvNU.field_1773.method_19418().method_19330();

            for (TargetESP.NVnVnNnN var18 : this.nNnVnUNVV) {
               var18.UuUVuuUu(var4);
               var18.UuUVuuUu(var1, var2, var12, var23, var20, var22, var4, var14, var24, var16, NUVvUUVuVNVv);
            }
         }
      }
   }

   static class NVnVnNnN {
      double UuUVuuUu;
      double C00OOC00oO;
      double uUnuvNvvNU;
      double vVvUvVVuuNvV;
      double uNNnnnuuuN;
      double nuUnNvnuUu;
      double VVuuUN;
      double vNUvnnVnUvu;
      double uVUuuVnNVU;
      long vuuuNvNuv;
      class_1309 nvUVNnuu;
      UUVVvUvuNNn UuuNnUvUuv = new VUnvnVNv(500, 1.0);
      private double nUUVuvU;

      public NVnVnNnN(class_1309 var1, double var2, double var4, double var6) {
         this.UuUVuuUu = var2;
         this.C00OOC00oO = var4;
         this.uUnuvNvvNU = var6;
         this.nvUVNnuu = var1;
         this.vuuuNvNuv = System.currentTimeMillis();
         this.nUUVuvU = UuvVnuU.UuuNnUvUuv(0.01F, 0.04F);
      }

      public long UuUVuuUu() {
         return this.vuuuNvNuv;
      }

      public void UuUVuuUu(float var1) {
         long var2 = System.currentTimeMillis();
         long var4 = var2 - this.UuUVuuUu();
         this.UuuNnUvUuv.C00OOC00oO(var4 <= 800L ? uununU.FORWARDS : uununU.BACKWARDS);
         this.C00OOC00oO = this.C00OOC00oO + this.nUUVuvU * (TargetESP.uUVVvVVNvvn * 60.0F);
         if (this.nvUVNnuu != null) {
            class_243 var6 = this.nvUVNnuu.method_30950(var1);
            this.VVuuUN = this.UuUVuuUu + var6.field_1352;
            this.vNUvnnVnUvu = this.C00OOC00oO + var6.field_1351;
            this.uVUuuVnNVU = this.uUnuvNvvNU + var6.field_1350;
         }
      }

      public void UuUVuuUu(
         class_4587 var1, class_4598 var2, int var3, int var4, float var5, float var6, float var7, class_243 var8, float var9, float var10, class_1921 var11
      ) {
         long var12 = System.currentTimeMillis();
         double var14 = (var12 - this.UuUVuuUu()) / 10.0;
         double var16 = UuvVnuU.VVuuUN(0.2F);
         this.vVvUvVVuuNvV = UuvVnuU.uUnuvNvvNU(this.vVvUvVVuuNvV, this.VVuuUN - var8.field_1352, var16);
         this.uNNnnnuuuN = UuvVnuU.uUnuvNvvNU(this.uNNnnnuuuN, this.vNUvnnVnUvu - var8.field_1351, var16);
         this.nuUnNvnuUu = UuvVnuU.uUnuvNvvNU(this.nuUnNvnuUu, this.uVUuuVnNVU - var8.field_1350, var16);
         float var18 = this.UuuNnUvUuv.uVUuuVnNVU();
         if (!(var18 <= 0.0F)) {
            float var19 = 1.0F + 0.15F * (float)Math.sin((var12 - this.UuUVuuUu()) / 400.0);
            float var20 = 0.12F + 0.04F * var18;
            var1.method_22903();
            var1.method_22904(this.vVvUvVVuuNvV, this.uNNnnnuuuN, this.nuUnNvnuUu);
            var1.method_22903();
            var1.method_22907(class_7833.field_40714.rotationDegrees((float)var14));
            var1.method_22907(class_7833.field_40716.rotationDegrees((float)var14));
            var1.method_22907(class_7833.field_40718.rotationDegrees((float)var14));
            Matrix4f var21 = var1.method_23760().method_23761();
            int var22 = TargetESP.UuUVuuUu(var3, (int)(70.0F * var5 * var18));
            class_4588 var23 = var2.getBuffer(TargetESP.nvvnUnUn);
            uUVNNUvvn.NVnVnNnN.NVnVnNnN.UuUVuuUu(var23, var21, var22, var20);
            int var24 = TargetESP.UuUVuuUu(var3, (int)(225.0F * var5 * var18));
            class_4588 var25 = var2.getBuffer(TargetESP.nnvuvUNuUnN);
            uUVNNUvvn.NVnVnNnN.NVnVnNnN.C00OOC00oO(var25, var21, var24, var20);
            var1.method_22909();
            var1.method_22903();
            var1.method_22907(class_7833.field_40716.rotationDegrees(-var10));
            var1.method_22907(class_7833.field_40714.rotationDegrees(var9));
            class_4588 var26 = var2.getBuffer(var11);
            Matrix4f var27 = var1.method_23760().method_23761();
            float var28 = var20 * 2.0F;
            var1.method_22905(var28, var28, var28);
            TargetESP.UuUVuuUu(var26, var27, var4, (int)(70.0F * var5 * var18));
            var1.method_22909();
            var1.method_22909();
         }
      }
   }

   record nvnNNunvv(float x, float y, float w, float h) {
   }
}
