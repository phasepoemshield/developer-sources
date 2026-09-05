package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import net.minecraft.class_10799;
import net.minecraft.class_1921;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_1921.class_4687;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_4668.class_4677;
import net.minecraft.class_4668.class_4683;

public final class OOcCooOcCcO {
   private static final int UuUVuuUu = 1024;
   private static final int C00OOC00oO = 256;
   private static final String uUnuvNvvNU = "wild";
   private static final double vVvUvVVuuNvV = 0.0625;
   private static final double uNNnnnuuuN = 64.0;
   private static final int nuUnNvnuUu = 128;
   private static final RenderPipeline VVuuUN = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/position_color_quads"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(true)
         .build()
   );
   private static final RenderPipeline vNUvnnVnUvu = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/position_color_quads_no_depth"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .build()
   );
   private static final RenderPipeline uVUuuVnNVU = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/position_color_quads_no_depth_blend"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderPipeline vuuuNvNuv = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/position_color_quads_translucent"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline nvUVNnuu = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/position_color_quads_translucent_no_depth"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline UuuNnUvUuv = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56859})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/lines"))
         .withVertexFormat(class_290.field_29337, class_5596.field_27377)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(true)
         .build()
   );
   private static final RenderPipeline nUUVuvU = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56859})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/lines_no_depth"))
         .withVertexFormat(class_290.field_29337, class_5596.field_27377)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .build()
   );
   private static final RenderPipeline UnUNVVVNuv = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56864})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/textured_quads"))
         .withVertexFormat(class_290.field_1575, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline vNVuvnUUnuUn = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56864})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/textured_quads_additive"))
         .withVertexFormat(class_290.field_1575, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.ADDITIVE)
         .build()
   );
   private static final RenderPipeline UvnvNVnnnnNU = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56864})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/textured_quads_no_depth_additive"))
         .withVertexFormat(class_290.field_1575, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.ADDITIVE)
         .build()
   );
   private static final RenderPipeline uVUVnuvnuVuv = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56864})
         .withLocation(class_2960.method_60655("wild", "pipeline/world/textured_quads_no_depth"))
         .withVertexFormat(class_290.field_1575, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final class_1921 NVNnnvnuunNv = class_1921.method_24049(
      "wild/world/position_color_quads", 1024, false, true, VVuuUN, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 uVunuUNVVUUV = class_1921.method_24049(
      "wild/world/position_color_quads_no_depth", 1024, false, true, vNUvnnVnUvu, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 UNnVVNvvnVvU = class_1921.method_24049(
      "wild/world/position_color_quads_no_depth_blend", 1024, false, true, uVUuuVnNVU, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 uNnUnnuNUnNu = class_1921.method_24049(
      "wild/world/position_color_quads_translucent", 1024, false, true, vuuuNvNuv, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 NnUuNNU = class_1921.method_24049(
      "wild/world/position_color_quads_translucent_no_depth", 1024, false, true, nvUVNnuu, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 nNvNUVU = class_1921.method_24049(
      "wild/world/textured_quads", 1024, false, true, UnUNVVVNuv, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 UnUNuUU = class_1921.method_24049(
      "wild/world/textured_quads_additive", 1024, false, true, vNVuvnUUnuUn, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 uUVuVvuNUvnu = class_1921.method_24049(
      "wild/world/textured_quads_no_depth_additive", 1024, false, true, UvnvNVnnnnNU, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 UvUvUNuvNU = class_1921.method_24049(
      "wild/world/textured_quads_no_depth", 1024, false, true, uVUVnuvnuVuv, class_4688.method_23598().method_23617(false)
   );
   private static final Map<Double, class_1921> c0oOOCcCoC0 = new ConcurrentHashMap<>();
   private static final Map<Double, class_1921> VVnVNnunVvu = new ConcurrentHashMap<>();

   private OOcCooOcCcO() {
   }

   public static class_1921 UuUVuuUu() {
      return NVNnnvnuunNv;
   }

   public static class_1921 C00OOC00oO() {
      return uVunuUNVVUUV;
   }

   public static class_1921 uUnuvNvvNU() {
      return UNnVVNvvnVvU;
   }

   public static class_1921 vVvUvVVuuNvV() {
      return uNnUnnuNUnNu;
   }

   public static class_1921 uNNnnnuuuN() {
      return NnUuNNU;
   }

   public static class_1921 nuUnNvnuUu() {
      return nNvNUVU;
   }

   public static class_1921 UuUVuuUu(class_2960 var0) {
      return class_1921.method_24049(
         var0.toString(), 1024, false, true, uVUVnuvnuVuv, class_4688.method_23598().method_34577(new class_4683(var0, false)).method_23617(false)
      );
   }

   public static class_1921 C00OOC00oO(class_2960 var0) {
      return class_1921.method_24049(
         var0.toString(), 1024, false, true, UnUNVVVNuv, class_4688.method_23598().method_34577(new class_4683(var0, false)).method_23617(false)
      );
   }

   public static class_1921 uUnuvNvvNU(class_2960 var0) {
      return class_1921.method_24049(
         var0.toString(), 1024, false, true, vNVuvnUUnuUn, class_4688.method_23598().method_34577(new class_4683(var0, false)).method_23617(false)
      );
   }

   public static class_1921 vVvUvVVuuNvV(class_2960 var0) {
      return class_1921.method_24049(
         var0.toString(), 1024, false, true, UvnvNVnnnnNU, class_4688.method_23598().method_34577(new class_4683(var0, false)).method_23617(false)
      );
   }

   public static class_1921 UuUVuuUu(double var0) {
      UuUVuuUu(c0oOOCcCoC0);
      double var2 = uUnuvNvvNU(var0);
      return c0oOOCcCoC0.computeIfAbsent(var2, var0x -> UuUVuuUu(var0x, "wild/world/lines", UuuNnUvUuv));
   }

   public static class_1921 C00OOC00oO(double var0) {
      UuUVuuUu(VVnVNnunVvu);
      double var2 = uUnuvNvvNU(var0);
      return VVnVNnunVvu.computeIfAbsent(var2, var0x -> UuUVuuUu(var0x, "wild/world/lines_no_depth", nUUVuvU));
   }

   private static class_1921 UuUVuuUu(double var0, String var2, RenderPipeline var3) {
      class_4677 var4 = new class_4677(var0 == 0.0 ? OptionalDouble.empty() : OptionalDouble.of(var0));
      return class_1921.method_24049(
         var2 + "/" + (var0 == 0.0 ? "default" : Double.toHexString(var0)),
         256,
         false,
         true,
         var3,
         class_4688.method_23598().method_23609(var4).method_23617(false)
      );
   }

   public static class_4687 UuUVuuUu(class_1921 var0, Consumer<RenderPass> var1) {
      Objects.requireNonNull(var0, "renderLayer");
      if (var0 instanceof class_4687 var2) {
         Oc000Ooc.UuUVuuUu(var2).withRenderPassSetup(var1);
         return var2;
      } else {
         throw new IllegalArgumentException("Render layer must be a MultiPhase instance.");
      }
   }

   private static double uUnuvNvvNU(double var0) {
      if (!Double.isFinite(var0)) {
         throw new IllegalArgumentException("Line width must be finite.");
      } else if (var0 < 0.0) {
         throw new IllegalArgumentException("Line width cannot be negative.");
      } else if (var0 == 0.0) {
         return 0.0;
      } else {
         double var2 = Math.min(var0, 64.0);
         double var4 = Math.round(var2 / 0.0625) * 0.0625;
         if (var4 <= 0.0) {
            var4 = 0.0625;
         }

         return var4;
      }
   }

   private static void UuUVuuUu(Map<Double, class_1921> var0) {
      if (var0.size() > 128) {
         var0.clear();
      }
   }
}
