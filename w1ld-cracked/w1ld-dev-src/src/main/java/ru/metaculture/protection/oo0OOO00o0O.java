package ru.metaculture.protection;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public final class oo0OOO00o0O {
   private static volatile Function<VnuVUNUv, String> UuUVuuUu;
   private final nvvuUNnNvN C00OOC00oO;

   public oo0OOO00o0O(nvvuUNnNvN var1) {
      this.C00OOC00oO = var1;
   }

   public static void UuUVuuUu(Function<VnuVUNUv, String> var0) {
      UuUVuuUu = var0;
   }

   private static String C00OOC00oO(VnuVUNUv var0) {
      Function var1 = UuUVuuUu;
      if (var1 == null) {
         return "";
      } else {
         String var2 = (String)var1.apply(var0);
         return var2 == null ? "" : var2;
      }
   }

   public NNnUUVVnuUV UuUVuuUu(nuVVnvn var1) {
      return this.UuUVuuUu(var1, null, null, null, VnuVUNUv.UuUVuuUu(var1 == null ? null : var1.C00OOC00oO()).vVvUvVVuuNvV());
   }

   public NNnUUVVnuUV UuUVuuUu(nuVVnvn var1, String var2, String var3, nnNVVnNnnV var4) {
      return this.UuUVuuUu(var1, var2, var3, var4, VnuVUNUv.PREVIEW_ONLY);
   }

   private NNnUUVVnuUV UuUVuuUu(nuVVnvn var1, String var2, String var3, nnNVVnNnnV var4, VnuVUNUv var5) {
      VnuVUNUv var6 = var5 == null ? VnuVUNUv.PREVIEW_ONLY : var5.vVvUvVVuuNvV();

      try {
         List var7 = this.C00OOC00oO(var1);
         HashMap var22 = new HashMap();
         HashMap var9 = new HashMap();
         List var10 = this.UuUVuuUu(var7, var9);
         NuuUuvvuVV var11 = new NuuUuvvuVV(var1, this.C00OOC00oO, var22, var9, var6);
         StringBuilder var12 = new StringBuilder(4096);
         String var13 = "vec4(0.02, 0.022, 0.028, 1.0)";

         for (VUnvuNuVUUn var15 : var7) {
            uuUnNVuuVUu var16 = this.C00OOC00oO.UuUVuuUu(var15.C00OOC00oO());
            if (var16 == null) {
               return new NNnUUVVnuUV(this.UuUVuuUu(var6), "invalid", "Unknown node: " + var15.C00OOC00oO());
            }

            if (!"output_color".equals(var16.UuUVuuUu())) {
               for (NUuvnUuVU var18 : var16.nuUnNvnuUu()) {
                  String var19 = var11.C00OOC00oO(var15, var18.id());
                  String var20 = var16.VVuuUN().emit(var11, var15, var18.id());
                  var12.append("    ").append(var18.type().UuUVuuUu()).append(" ").append(var19).append(" = ").append(var20).append(";\n");
                  var22.put(var15.UuUVuuUu() + "." + var18.id(), var19);
                  if (var2 != null && var2.equals(var15.UuUVuuUu()) && var18.id().equals(var3)) {
                     var13 = UuUVuuUu(var19, var4 == null ? var18.type() : var4, var3);
                  }
               }
            } else if (var2 == null || var2.equals(var15.UuUVuuUu())) {
               var13 = var16.VVuuUN().emit(var11, var15, "color");
            }
         }

         String var23 = this.UuUVuuUu(var1, var6, UuUVuuUu(var7), C00OOC00oO(var10), var12.toString(), var13);
         return new NNnUUVVnuUV(var23, C00OOC00oO(var23), null, var10);
      } catch (RuntimeException var21) {
         String var8 = this.UuUVuuUu(var6);
         return new NNnUUVVnuUV(var8, C00OOC00oO(var8), var21.getMessage());
      }
   }

   private static boolean UuUVuuUu(List<VUnvuNuVUUn> var0) {
      for (VUnvuNuVUUn var2 : var0) {
         if (var2 != null && "base_texture".equals(var2.C00OOC00oO())) {
            return true;
         }
      }

      return false;
   }

   private static String UuUVuuUu(String var0, nnNVVnNnnV var1, String var2) {
      if (var1 == null) {
         return "vec4(0.02, 0.022, 0.028, 1.0)";
      } else if ("mask".equals(var2)) {
         return "vec4(vec3(wild_sdf_alpha(" + var0 + ")), 1.0)";
      } else {
         return switch (var1) {
            case FLOAT -> "vec4(vec3(clamp(" + var0 + ", 0.0, 1.0)), 1.0)";
            case VEC2 -> "vec4(clamp(" + var0 + ", vec2(0.0), vec2(1.0)), 0.0, 1.0)";
            case VEC3 -> "vec4(clamp(" + var0 + ", vec3(0.0), vec3(1.0)), 1.0)";
            case VEC4 -> "vec4(clamp((" + var0 + ").rgb, vec3(0.0), vec3(1.0)), clamp((" + var0 + ").a, 0.0, 1.0))";
            case INT -> "vec4(vec3(clamp(float(" + var0 + ") / 8.0, 0.0, 1.0)), 1.0)";
         };
      }
   }

   private List<ccCoCoOCocoo> UuUVuuUu(List<VUnvuNuVUUn> var1, Map<String, String> var2) {
      ArrayList var3 = new ArrayList();
      LinkedHashMap var4 = new LinkedHashMap();

      for (VUnvuNuVUUn var6 : var1) {
         if ("exposed_float".equals(var6.C00OOC00oO()) || "exposed_color".equals(var6.C00OOC00oO())) {
            String var7 = UuUVuuUu(var6);
            String var8 = UuUVuuUu(var7);
            int var9 = var4.getOrDefault(var8, 0);
            var4.put(var8, var9 + 1);
            String var10 = "u_" + var8 + (var9 == 0 ? "" : "_" + (var9 + 1));
            var2.put(var6.UuUVuuUu(), var10);
            if ("exposed_float".equals(var6.C00OOC00oO())) {
               float var11 = var6.UuUVuuUu("value", 0.5F);
               float var12 = var6.UuUVuuUu("min", 0.0F);
               float var13 = var6.UuUVuuUu("max", 1.0F);
               float var14 = var6.UuUVuuUu("step", 0.01F);
               var3.add(new ccCoCoOCocoo(var7, var10, ccCoCoOCocoo.NVnVnNnN.FLOAT, new float[]{var11, 0.0F, 0.0F, 1.0F}, var12, var13, var14));
            } else {
               float var15 = var6.UuUVuuUu("r", 1.0F);
               float var16 = var6.UuUVuuUu("g", 1.0F);
               float var17 = var6.UuUVuuUu("b", 1.0F);
               float var18 = var6.UuUVuuUu("a", 1.0F);
               var3.add(new ccCoCoOCocoo(var7, var10, ccCoCoOCocoo.NVnVnNnN.COLOR, new float[]{var15, var16, var17, var18}, 0.0F, 1.0F, 0.01F));
            }
         }
      }

      return var3;
   }

   private static String C00OOC00oO(List<ccCoCoOCocoo> var0) {
      if (var0 != null && !var0.isEmpty()) {
         StringBuilder var1 = new StringBuilder(var0.size() * 28);

         for (ccCoCoOCocoo var3 : var0) {
            var1.append("uniform ").append(var3.kind() == ccCoCoOCocoo.NVnVnNnN.FLOAT ? "float " : "vec4 ").append(var3.uniformName()).append(";\n");
         }

         return var1.toString();
      } else {
         return "";
      }
   }

   private static String UuUVuuUu(VUnvuNuVUUn var0) {
      String var1 = "exposed_color".equals(var0.C00OOC00oO()) ? "Color" : "Value";
      String var2 = var0.UuUVuuUu("name", var1);
      return var2 != null && !var2.isBlank() ? var2.trim() : var1;
   }

   private static String UuUVuuUu(String var0) {
      String var1 = var0 == null ? "Value" : var0.trim();
      if (var1.isBlank()) {
         var1 = "Value";
      }

      StringBuilder var2 = new StringBuilder(var1.length());
      boolean var3 = true;

      for (int var4 = 0; var4 < var1.length(); var4++) {
         char var5 = var1.charAt(var4);
         if (Character.isLetterOrDigit(var5)) {
            var2.append(var3 ? Character.toUpperCase(var5) : var5);
            var3 = false;
         } else {
            var3 = true;
         }
      }

      if (var2.isEmpty()) {
         var2.append("Value");
      }

      if (Character.isDigit(var2.charAt(0))) {
         var2.insert(0, 'N');
      }

      return var2.toString();
   }

   private List<VUnvuNuVUUn> C00OOC00oO(nuVVnvn var1) {
      HashMap var2 = new HashMap();
      HashMap var3 = new HashMap();

      for (VUnvuNuVUUn var5 : var1.uUnuvNvvNU()) {
         var2.put(var5.UuUVuuUu(), 0);
         var3.put(var5.UuUVuuUu(), new ArrayList());
      }

      for (nNuNNVuNUu var13 : var1.vVvUvVVuuNvV()) {
         if (var2.containsKey(var13.UuUVuuUu()) && var2.containsKey(var13.uUnuvNvvNU())) {
            ((List)var3.get(var13.UuUVuuUu())).add(var13.uUnuvNvvNU());
            var2.put(var13.uUnuvNvvNU(), (Integer)var2.get(var13.uUnuvNvvNU()) + 1);
         }
      }

      ArrayDeque var12 = new ArrayDeque();

      for (Entry var6 : var2.entrySet()) {
         if ((Integer)var6.getValue() == 0) {
            var12.add((String)var6.getKey());
         }
      }

      ArrayList var15 = new ArrayList();

      while (!var12.isEmpty()) {
         String var16 = (String)var12.removeFirst();
         VUnvuNuVUUn var7 = var1.uUnuvNvvNU(var16);
         if (var7 != null) {
            var15.add(var7);
         }

         for (String var9 : var3.getOrDefault(var16, List.of())) {
            int var10 = (Integer)var2.get(var9) - 1;
            var2.put(var9, var10);
            if (var10 == 0) {
               var12.add(var9);
            }
         }
      }

      if (var15.size() == var2.size()) {
         return var15;
      } else {
         LinkedHashSet var17 = new LinkedHashSet(var2.keySet());

         for (VUnvuNuVUUn var19 : var15) {
            var17.remove(var19.UuUVuuUu());
         }

         throw new IllegalStateException("Circular dependency in graph: " + String.join(", ", var17));
      }
   }

   private String UuUVuuUu(nuVVnvn var1, VnuVUNUv var2, boolean var3, String var4, String var5, String var6) {
      VnuVUNUv var7 = var2 == null ? VnuVUNUv.PREVIEW_ONLY : var2.vVvUvVVuuNvV();
      String var8 = var7 == VnuVUNUv.HUD
         ? uUnuvNvvNU(var1)
         : (
            var7.vNUvnnVnUvu() && !var3
               ? "    float diffuseAlpha = texture(u_DiffuseMap, wild_diffuse_uv()).a;\n    fragColor = vec4(finalColor, finalAlpha * diffuseAlpha * clamp(u_Alpha, 0.0, 1.0));"
               : "    fragColor = vec4(finalColor, finalAlpha * clamp(u_Alpha, 0.0, 1.0));"
         );
      return "#version 330 core\nlayout(location = 0) out vec4 fragColor;\nin vec2 vUv;\nin vec2 vLocal;\nin vec2 vScreen;\nuniform vec2 uViewport;\nuniform vec4 uRect;\nuniform float u_Time;\nuniform vec2 u_Resolution;\nuniform vec2 u_Mouse;\nuniform vec4 u_ElementRect;\nuniform float u_ElementRadius;\nuniform vec2 u_GlobalUV;\nuniform vec3 u_AccentTop;\nuniform vec3 u_AccentBottom;\nuniform vec4 u_ThemeColors[4];\nuniform float u_Alpha;\nuniform sampler2D u_DiffuseMap;\n%s\n\nfloat wild_sat(float v) {\n    return clamp(v, 0.0, 1.0);\n}\n\nvec2 wild_screen_px() {\n    return vec2(gl_FragCoord.x, u_Resolution.y - gl_FragCoord.y);\n}\n\nvec2 wild_global_uv() {\n    return wild_screen_px() / max(u_Resolution, vec2(1.0));\n}\n\nfloat wild_sdf_alpha(float d) {\n    float aa = max(fwidth(d), 1.0);\n    return 1.0 - smoothstep(0.0, aa, d);\n}\n\nfloat wild_shadow_alpha(float d, vec2 size) {\n    float outside = max(d, 0.0);\n    float soft = clamp(min(size.x, size.y) * 0.32, 10.0, 54.0);\n    float gaussian = exp(-(outside * outside) / max(2.0 * soft * soft, 1.0));\n    float falloff = 1.0 - smoothstep(0.0, soft * 2.4, outside);\n    return gaussian * falloff * 0.28 * step(0.0, d);\n}\n\nvec2 wild_diffuse_uv() {\n    return vec2(vScreen.x / max(uViewport.x, 1.0), 1.0 - vScreen.y / max(uViewport.y, 1.0));\n}\n\nvec4 wild_blend_screen(vec4 base, vec4 layer, float opacity) {\n    vec3 v = 1.0 - (1.0 - base.rgb) * (1.0 - layer.rgb);\n    return vec4(mix(base.rgb, v, wild_sat(opacity)), max(base.a, layer.a));\n}\n\nvec4 wild_blend_overlay(vec4 base, vec4 layer, float opacity) {\n    vec3 lo = 2.0 * base.rgb * layer.rgb;\n    vec3 hi = 1.0 - 2.0 * (1.0 - base.rgb) * (1.0 - layer.rgb);\n    vec3 v = mix(lo, hi, step(vec3(0.5), base.rgb));\n    return vec4(mix(base.rgb, v, wild_sat(opacity)), max(base.a, layer.a));\n}\n\nfloat wild_hash12(vec2 p) {\n    vec3 p3 = fract(vec3(p.xyx) * 0.1031);\n    p3 += dot(p3, p3.yzx + 33.33);\n    return fract((p3.x + p3.y) * p3.z);\n}\n\nfloat wild_hash13(vec3 p3) {\n    p3 = fract(p3 * 0.1031);\n    p3 += dot(p3, p3.zyx + 31.32);\n    return fract((p3.x + p3.y) * p3.z);\n}\n\nfloat wild_noise3(vec3 p) {\n    vec3 i = floor(p);\n    vec3 f = fract(p);\n    vec3 u = f * f * (3.0 - 2.0 * f);\n    float n000 = wild_hash13(i + vec3(0.0, 0.0, 0.0));\n    float n100 = wild_hash13(i + vec3(1.0, 0.0, 0.0));\n    float n010 = wild_hash13(i + vec3(0.0, 1.0, 0.0));\n    float n110 = wild_hash13(i + vec3(1.0, 1.0, 0.0));\n    float n001 = wild_hash13(i + vec3(0.0, 0.0, 1.0));\n    float n101 = wild_hash13(i + vec3(1.0, 0.0, 1.0));\n    float n011 = wild_hash13(i + vec3(0.0, 1.0, 1.0));\n    float n111 = wild_hash13(i + vec3(1.0, 1.0, 1.0));\n    float nx00 = mix(n000, n100, u.x);\n    float nx10 = mix(n010, n110, u.x);\n    float nx01 = mix(n001, n101, u.x);\n    float nx11 = mix(n011, n111, u.x);\n    float nxy0 = mix(nx00, nx10, u.y);\n    float nxy1 = mix(nx01, nx11, u.y);\n    return mix(nxy0, nxy1, u.z);\n}\n\nfloat wild_simplex3(vec3 p) {\n    float v = 0.0;\n    float a = 0.5;\n    float f = 1.0;\n    for (int i = 0; i < 5; i++) {\n        v += (wild_noise3(p * f) * 2.0 - 1.0) * a;\n        f *= 2.03;\n        a *= 0.52;\n    }\n    return clamp(v, -1.0, 1.0);\n}\n\nfloat wild_voronoi(vec2 x, float time) {\n    vec2 n = floor(x);\n    vec2 f = fract(x);\n    float md = 8.0;\n    for (int j = -1; j <= 1; j++) {\n        for (int i = -1; i <= 1; i++) {\n            vec2 g = vec2(float(i), float(j));\n            vec2 o = vec2(wild_hash12(n + g), wild_hash12(n + g + 17.31));\n            o = 0.5 + 0.5 * sin(time * 0.45 + 6.2831 * o);\n            vec2 r = g + o - f;\n            md = min(md, dot(r, r));\n        }\n    }\n    return clamp(sqrt(md), 0.0, 1.0);\n}\n\nfloat wild_sdf_circle(vec2 uv, vec2 center, float radius, float softness) {\n    return length(uv - center) - max(radius, 0.0);\n}\n\nfloat wild_sdf_round_box(vec2 uv, vec2 center, vec2 size, float radius, float softness) {\n    vec2 p = uv - center;\n    vec2 safeSize = max(size, vec2(0.0001));\n    float safeRadius = clamp(radius, 0.0, min(safeSize.x, safeSize.y));\n    vec2 q = abs(p) - safeSize + safeRadius;\n    float d = length(max(q, 0.0)) - safeRadius + min(max(q.x, q.y), 0.0);\n    return d;\n}\n\nvec2 wild_local_pos() {\n    return wild_screen_px() - u_ElementRect.xy;\n}\n\nvec2 wild_center_pos() {\n    return wild_local_pos() - u_ElementRect.zw * 0.5;\n}\n\n%s\n\nvec4 wild_alpha_over(vec4 base, vec4 layer) {\n    float outA = layer.a + base.a * (1.0 - layer.a);\n    vec3 outRgb = outA <= 0.0001 ? vec3(0.0) : (layer.rgb * layer.a + base.rgb * base.a * (1.0 - layer.a)) / outA;\n    return vec4(outRgb, outA);\n}\n\nvec4 wild_glass_surface(float d, vec4 tint, float opacity, float grain) {\n    float mask = wild_sdf_alpha(d);\n    vec2 uvn = wild_local_pos() / max(u_ElementRect.zw, vec2(1.0));\n    float noise = wild_noise3(vec3(uvn * max(u_ElementRect.zw, vec2(1.0)) * 0.035, u_Time * 0.18));\n    float vertical = smoothstep(1.0, 0.0, uvn.y);\n    vec3 base = mix(vec3(0.018, 0.020, 0.028), tint.rgb, 0.18 + vertical * 0.10);\n    base += (noise - 0.5) * clamp(grain, 0.0, 0.18);\n    base += vec3(0.035) * smoothstep(0.85, 0.02, abs(uvn.y - 0.08));\n    return vec4(clamp(base, 0.0, 1.0), mask * clamp(opacity, 0.0, 1.0) * tint.a);\n}\n\nvec4 wild_rim_light(float d, vec4 color, float thickness, float intensity) {\n    float width = max(thickness, max(fwidth(d), 0.75));\n    float edge = exp(-(d * d) / max(width * width * 2.0, 0.0001));\n    float inside = wild_sdf_alpha(d);\n    float a = edge * inside * clamp(intensity, 0.0, 1.0) * color.a;\n    return vec4(color.rgb * a, a);\n}\n\nvec4 wild_hover_glow(vec2 uv, vec4 color, float radius, float intensity) {\n    vec2 mouse = clamp(u_Mouse / max(u_ElementRect.zw, vec2(1.0)), vec2(0.0), vec2(1.0));\n    float r = max(radius, 0.001);\n    float d = distance(uv, mouse);\n    float glow = exp(-(d * d) / max(r * r, 0.0001)) * clamp(intensity, 0.0, 2.0);\n    float mask = wild_sdf_alpha(wild_element_distance());\n    float a = glow * mask * color.a;\n    return vec4(color.rgb * glow, a);\n}\n\nfloat wild_inner_shadow(float d, float strength, float width) {\n    float w = max(width, max(fwidth(d), 1.0));\n    float edge = 1.0 - smoothstep(0.0, w, -d);\n    return edge * wild_sdf_alpha(d) * clamp(strength, 0.0, 1.0);\n}\n\nvec4 wild_exposure_lift(vec4 color, float amount, float decay) {\n    float pulse = exp(-fract(u_Time * max(decay, 0.001)) * 4.0);\n    vec3 lifted = color.rgb + color.rgb * pulse * max(amount, 0.0);\n    return vec4(clamp(lifted, 0.0, 1.0), color.a);\n}\n\nvec4 wild_chromatic(vec4 color, vec2 uv, float amount, float phase) {\n    vec2 c = uv - 0.5;\n    float r = color.r + sin(dot(c, vec2(21.7, 17.1)) + phase) * amount;\n    float b = color.b + cos(dot(c, vec2(15.1, 24.2)) - phase * 0.8) * amount;\n    return vec4(clamp(vec3(r, color.g, b), 0.0, 1.0), color.a);\n}\n\nfloat wild_sdf_triangle(vec2 uv, vec2 center, float radius, float softness) {\n    vec2 p = uv - center;\n    const float k = 1.7320508;\n    p.x = abs(p.x) - radius;\n    p.y = p.y + radius / k;\n    if (p.x + k * p.y > 0.0) {\n        p = vec2(p.x - k * p.y, -k * p.x - p.y) / 2.0;\n    }\n    p.x -= clamp(p.x, -2.0 * radius, 0.0);\n    float d = -length(p) * sign(p.y);\n    return d;\n}\n\nfloat wild_sdf_hex(vec2 uv, vec2 center, float radius, float softness) {\n    vec2 p = abs(uv - center);\n    const vec2 k = vec2(0.8660254, 0.5);\n    p -= 2.0 * min(dot(k, p), 0.0) * k;\n    p -= vec2(clamp(p.x, -k.y * radius, k.y * radius), radius);\n    float d = length(p) * sign(p.y);\n    return d;\n}\n\nfloat wild_fbm(vec3 p, int octaves) {\n    float v = 0.0;\n    float a = 0.5;\n    float f = 1.0;\n    for (int i = 0; i < 8; i++) {\n        if (i >= octaves) break;\n        v += (wild_noise3(p * f) * 2.0 - 1.0) * a;\n        f *= 2.07;\n        a *= 0.52;\n    }\n    return clamp(v * 0.5 + 0.5, 0.0, 1.0);\n}\n\nvec2 wild_polar(vec2 uv, vec2 center) {\n    vec2 p = uv - center;\n    float r = length(p);\n    float a = atan(p.y, p.x);\n    return vec2(a / 6.2831 + 0.5, clamp(r * 2.0, 0.0, 1.0));\n}\n\nvec2 wild_rotate_uv(vec2 uv, vec2 center, float angle) {\n    vec2 p = uv - center;\n    float s = sin(angle);\n    float c = cos(angle);\n    return center + vec2(p.x * c - p.y * s, p.x * s + p.y * c);\n}\n\nvec2 wild_twist_uv(vec2 uv, vec2 center, float strength) {\n    vec2 p = uv - center;\n    float r = length(p);\n    float a = atan(p.y, p.x) + r * strength;\n    return center + vec2(cos(a), sin(a)) * r;\n}\n\nfloat wild_vignette(vec2 uv, float intensity, float falloff) {\n    float d = length(uv - 0.5) * 1.4142;\n    return clamp(pow(1.0 - d * clamp(intensity, 0.0, 4.0), max(falloff, 0.0001) * 4.0), 0.0, 1.0);\n}\n\nvec4 wild_bloom_lift(vec4 color, float threshold, float amount) {\n    float lum = dot(color.rgb, vec3(0.2126, 0.7152, 0.0722));\n    float boost = smoothstep(threshold, threshold + 0.05, lum) * max(amount, 0.0);\n    return vec4(color.rgb + color.rgb * boost, color.a);\n}\n\nvec4 wild_channel_split(vec4 color, float amount, float t) {\n    float a = clamp(amount, 0.0, 0.5);\n    float r = color.r + sin(t * 1.3) * a;\n    float g = color.g + sin(t * 1.7 + 1.0) * a * 0.6;\n    float b = color.b + sin(t * 2.1 + 2.0) * a;\n    return vec4(clamp(vec3(r, g, b), 0.0, 1.0), color.a);\n}\n\nvec4 wild_iridescence(float t, float speed) {\n    float phase = t + u_Time * speed * 0.4;\n    vec3 col = 0.5 + 0.5 * cos(6.2831 * (phase + vec3(0.0, 0.33, 0.67)));\n    return vec4(col, 1.0);\n}\n\nfloat wild_smin(float a, float b, float k) {\n    float kk = max(k, 0.0001);\n    float h = clamp(0.5 + 0.5 * (b - a) / kk, 0.0, 1.0);\n    return mix(b, a, h) - kk * h * (1.0 - h);\n}\n\nfloat wild_smax(float a, float b, float k) {\n    float kk = max(k, 0.0001);\n    float h = clamp(0.5 - 0.5 * (b - a) / kk, 0.0, 1.0);\n    return mix(b, a, h) + kk * h * (1.0 - h);\n}\n\nfloat wild_sdf_union(float a, float b, float smoothness) {\n    return wild_smin(a, b, smoothness);\n}\n\nfloat wild_sdf_subtract(float a, float b, float smoothness) {\n    return wild_smax(a, -b, smoothness);\n}\n\nfloat wild_sdf_intersect(float a, float b, float smoothness) {\n    return wild_smax(a, b, smoothness);\n}\n\nfloat wild_remap(float v, float inMin, float inMax, float outMin, float outMax) {\n    float dn = inMax - inMin;\n    if (abs(dn) < 1e-5) return outMin;\n    float t = clamp((v - inMin) / dn, 0.0, 1.0);\n    return mix(outMin, outMax, t);\n}\n\nvec3 wild_gradient3(float t, vec3 a, vec3 b, vec3 c) {\n    float ct = clamp(t, 0.0, 1.0);\n    if (ct < 0.5) {\n        return mix(a, b, ct * 2.0);\n    }\n    return mix(b, c, (ct - 0.5) * 2.0);\n}\n\nvec4 wild_gradient_map(float t, vec4 a, vec4 b, vec4 c) {\n    float ct = clamp(t, 0.0, 1.0);\n    if (ct < 0.5) {\n        return mix(a, b, ct * 2.0);\n    }\n    return mix(b, c, (ct - 0.5) * 2.0);\n}\n\nvec3 wild_desaturate(vec3 col, float amount) {\n    float lum = dot(col, vec3(0.299, 0.587, 0.114));\n    return mix(col, vec3(lum), clamp(amount, 0.0, 1.0));\n}\n\nvec3 wild_invert(vec3 col, float amount) {\n    return mix(col, vec3(1.0) - col, clamp(amount, 0.0, 1.0));\n}\n\nvec3 wild_hsv2rgb(vec3 c) {\n    vec3 p = abs(fract(c.xxx + vec3(0.0, 2.0 / 3.0, 1.0 / 3.0)) * 6.0 - 3.0);\n    return c.z * mix(vec3(1.0), clamp(p - 1.0, 0.0, 1.0), c.y);\n}\n\nfloat wild_bpm(float bpm, float strength) {\n    float beats = u_Time * (max(bpm, 1.0) / 60.0);\n    float pulse = 0.5 + 0.5 * sin(beats * 6.2831);\n    return pow(pulse, max(strength, 0.0001));\n}\n\nvec2 wild_view_dir(vec2 uv) {\n    return normalize(uv - 0.5 + 1e-5);\n}\n\nvec3 wild_normal_from_uv(vec2 uv, float strength) {\n    vec3 nx = vec3(1.0, 0.0, dFdx(length(uv - 0.5)) * strength * 40.0);\n    vec3 ny = vec3(0.0, 1.0, dFdy(length(uv - 0.5)) * strength * 40.0);\n    return normalize(cross(nx, ny));\n}\n\nfloat wild_pulse(float t, float duty) {\n    float f = fract(t);\n    return step(f, clamp(duty, 0.0, 1.0));\n}\n\nvec4 wild_box_blur(vec2 uv, vec4 base, float radius, int samples) {\n    return base;\n}\n\nfloat wild_sdf_star(vec2 uv, vec2 center, float radius, float points, float softness) {\n    vec2 p = uv - center;\n    float a = atan(p.y, p.x);\n    float r = length(p);\n    float pts = max(points, 3.0);\n    float angle = 6.2831 / pts;\n    float c = cos(floor(0.5 + a / angle) * angle - a);\n    float d = r * c - radius;\n    return d;\n}\n\nvec3 wild_rgb2hsv(vec3 c) {\n    vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);\n    vec4 p = mix(vec4(c.bg, K.wz), vec4(c.gb, K.xy), step(c.b, c.g));\n    vec4 q = mix(vec4(p.xyw, c.r), vec4(c.r, p.yzx), step(p.x, c.r));\n    float d = q.x - min(q.w, q.y);\n    float e = 1.0e-10;\n    return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);\n}\n\nvec2 wild_radial_shear(vec2 uv, vec2 center, float strength) {\n    vec2 d = uv - center;\n    float r = dot(d, d);\n    return uv + vec2(d.y, -d.x) * r * strength;\n}\n\nvec2 wild_spherize(vec2 uv, vec2 center, float strength) {\n    vec2 d = uv - center;\n    float r = length(d);\n    vec2 dir = r > 1e-5 ? d / r : vec2(0.0);\n    float rr = mix(r, sin(r * 1.5708), clamp(strength, 0.0, 1.0));\n    return center + dir * rr;\n}\n\nfloat wild_checker(vec2 uv, vec2 freq) {\n    vec2 c = floor(uv * freq);\n    return mod(c.x + c.y, 2.0);\n}\n\nfloat wild_gnoise2(vec2 p) {\n    return wild_noise3(vec3(p, 0.0));\n}\n\nvoid main() {\n    vec2 screenPos = wild_screen_px();\n    vec2 globalUv = wild_global_uv();\n    vec2 localPos = screenPos - u_ElementRect.xy;\n    vec2 centerPos = localPos - (u_ElementRect.zw * 0.5);\n    vec2 normalizedUv = localPos / max(u_ElementRect.zw, vec2(1.0));\n    vec2 uv = %s;\n%s\n    vec4 color = %s;\n    float vignette = smoothstep(0.92, 0.18, length(normalizedUv - 0.5));\n    color.rgb *= 0.74 + vignette * 0.42;\n    color.rgb += pow(max(color.rgb, vec3(0.0)), vec3(2.2)) * 0.18;\n    vec3 finalColor = clamp(color.rgb, 0.0, 1.0);\n    float finalAlpha = clamp(color.a, 0.0, 1.0);\n%s\n}\n"
         .formatted(
            C00OOC00oO(var7) + (var4 == null ? "" : var4),
            vVvUvVVuuNvV(var1),
            var7 == VnuVUNUv.HUD ? "centerPos" : "((localPos - 0.5 * u_ElementRect.zw) / max(u_ElementRect.w, 1.0))",
            var5,
            var6,
            var8
         );
   }

   public String UuUVuuUu() {
      return this.UuUVuuUu(VnuVUNUv.PREVIEW_ONLY);
   }

   private static String uUnuvNvvNU(nuVVnvn var0) {
      return "Full Quad".equals(uNNnnnuuuN(var0))
         ? "    fragColor = vec4(finalColor, finalAlpha * clamp(u_Alpha, 0.0, 1.0));"
         : "    float hudDistance = wild_element_distance();\n    float hudInside = wild_sdf_alpha(hudDistance);\n    vec2 hudAabbMask = step(u_ElementRect.xy, screenPos) * step(screenPos, u_ElementRect.xy + u_ElementRect.zw);\n    float hudAabbInside = hudAabbMask.x * hudAabbMask.y;\n    float hudShadow = wild_shadow_alpha(hudDistance, u_ElementRect.zw) * (1.0 - hudAabbInside);\n    float hudAlpha = finalAlpha * clamp(u_Alpha, 0.0, 1.0) * hudInside;\n    float outAlpha = clamp(hudAlpha + hudShadow * (1.0 - hudAlpha), 0.0, 1.0);\n    vec3 outColor = outAlpha <= 0.0001 ? vec3(0.0) : (finalColor * hudAlpha) / outAlpha;\n    fragColor = vec4(outColor, outAlpha);";
   }

   private static String vVvUvVVuuNvV(nuVVnvn var0) {
      String var1 = uNNnnnuuuN(var0);
      String var2 = "float wild_host_element_distance(float inset) {\n    float px = max(inset, 0.0);\n    vec2 size = max(vec2(1.0), u_ElementRect.zw * 0.5 - vec2(px));\n    float radius = max(0.0, u_ElementRadius - px);\n    return wild_sdf_round_box(wild_center_pos(), vec2(0.0), size, radius, 0.0);\n}\n";
      if ("Full Quad".equals(var1)) {
         return var2
            + "float wild_element_distance() {\n    return -1.0;\n}\n\nfloat wild_element_distance_inset(float inset) {\n    return wild_host_element_distance(inset);\n}\n";
      } else {
         return "Inset Shape".equals(var1)
            ? var2
               + "float wild_element_distance() {\n    float inset = max(1.0, min(u_ElementRect.z, u_ElementRect.w) * 0.075);\n    return wild_host_element_distance(inset);\n}\n\nfloat wild_element_distance_inset(float inset) {\n    float baseInset = max(1.0, min(u_ElementRect.z, u_ElementRect.w) * 0.075);\n    return wild_host_element_distance(baseInset + max(inset, 0.0));\n}\n"
            : var2
               + "float wild_element_distance() {\n    return wild_host_element_distance(0.0);\n}\n\nfloat wild_element_distance_inset(float inset) {\n    return wild_host_element_distance(inset);\n}\n";
      }
   }

   private static String uNNnnnuuuN(nuVVnvn var0) {
      if (var0 != null && var0.UuUVuuUu() != null) {
         String var1 = var0.UuUVuuUu().VVuuUN();
         return !"Inset Shape".equals(var1) && !"Full Quad".equals(var1) ? "Host Rectangle" : var1;
      } else {
         return "Host Rectangle";
      }
   }

   public String UuUVuuUu(VnuVUNUv var1) {
      return this.UuUVuuUu(null, var1, false, "", "", "vec4(mix(vec3(0.018, 0.020, 0.027), u_AccentTop, 0.18 + 0.12 * sin(u_Time + vUv.x * 6.2831)), 1.0)");
   }

   private static String C00OOC00oO(String var0) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-256");
         byte[] var2 = var1.digest(var0.getBytes(StandardCharsets.UTF_8));
         StringBuilder var3 = new StringBuilder(16);

         for (int var4 = 0; var4 < 8; var4++) {
            var3.append(String.format("%02x", var2[var4] & 255));
         }

         return var3.toString();
      } catch (Exception var5) {
         return "0000000000000000";
      }
   }
}
