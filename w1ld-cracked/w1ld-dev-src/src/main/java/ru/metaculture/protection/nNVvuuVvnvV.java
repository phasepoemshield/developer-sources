package ru.metaculture.protection;

import java.util.List;
import java.util.function.Function;

public final class nNVvuuVvnvV {
   public static final List<nNVvuuVvnvV.nvnNNunvv> UuUVuuUu = List.of(
      new nNVvuuVvnvV.nvnNNunvv(
         "Ferro HUD Starter",
         "matte host plate with rim, grain and hover light",
         VnuVUNUv.HUD,
         "Starter",
         List.of("Element Mask", "Mica Glass", "Rim Light", "Hover Glow"),
         var0 -> UuUVuuUu(var0, VnuVUNUv.HUD, "Ferro HUD Starter", "clean HUD plate shader", 0.72F, 0.07F, 0.34F, 0.6F)
      ),
      new nNVvuuVvnvV.nvnNNunvv(
         "Ferro Module Card",
         "module row glass without pulse or layout noise",
         VnuVUNUv.MODULE_CARD,
         "Starter",
         List.of("Element Mask", "Mica Glass", "Rim Light"),
         var0 -> UuUVuuUu(var0, VnuVUNUv.MODULE_CARD, "Ferro Module Card", "module card material starter", 0.62F, 0.045F, 0.22F, 0.42F)
      ),
      new nNVvuuVvnvV.nvnNNunvv(
         "Ferro Panel Surface",
         "dock panel surface with stable mica depth",
         VnuVUNUv.PANEL_BACKGROUND,
         "Starter",
         List.of("Element Mask", "Mica Glass", "Rim Light"),
         var0 -> UuUVuuUu(var0, VnuVUNUv.PANEL_BACKGROUND, "Ferro Panel Surface", "panel background material starter", 0.68F, 0.055F, 0.26F, 0.48F)
      ),
      new nNVvuuVvnvV.nvnNNunvv(
         "Ferro Button Surface",
         "button body with compact magnetic response",
         VnuVUNUv.BUTTON,
         "Starter",
         List.of("Element Mask", "Mica Glass", "Hover Glow"),
         var0 -> UuUVuuUu(var0, VnuVUNUv.BUTTON, "Ferro Button Surface", "interactive button material starter", 0.66F, 0.038F, 0.3F, 0.82F)
      ),
      new nNVvuuVvnvV.nvnNNunvv(
         "Clean Health Fill",
         "stable gradient fill for bars and shield surfaces",
         VnuVUNUv.HEALTH_BAR,
         "Starter",
         List.of("Element UV", "Gradient Map", "SDF Fill"),
         nNVvuuVvnvV::C00OOC00oO
      ),
      new nNVvuuVvnvV.nvnNNunvv(
         "Clean Menu Background",
         "quiet full-screen gradient background",
         VnuVUNUv.BACKGROUND,
         "Starter",
         List.of("Global UV", "Gradient Map"),
         var0 -> UuUVuuUu(var0, VnuVUNUv.BACKGROUND, "Clean Menu Background", "full-screen interface background starter")
      ),
      new nNVvuuVvnvV.nvnNNunvv(
         "Clean Sky Atmosphere",
         "soft atmospheric wash for sky target",
         VnuVUNUv.SKY,
         "Starter",
         List.of("Global UV", "Gradient Map"),
         var0 -> UuUVuuUu(var0, VnuVUNUv.SKY, "Clean Sky Atmosphere", "world atmosphere starter")
      ),
      new nNVvuuVvnvV.nvnNNunvv(
         "Clean ESP Silhouette",
         "entity-target rounded silhouette with rim",
         VnuVUNUv.ESP,
         "Starter",
         List.of("Element Mask", "SDF Fill", "Rim Light"),
         nNVvuuVvnvV::uUnuvNvvNU
      ),
      new nNVvuuVvnvV.nvnNNunvv(
         "Clean Chams Film",
         "texture-preserving entity film with stable fresnel",
         VnuVUNUv.CHAMS,
         "Starter",
         List.of("Base Texture", "Fresnel", "Screen Blend"),
         nNVvuuVvnvV::vVvUvVVuuNvV
      ),
      new nNVvuuVvnvV.nvnNNunvv(
         "Clean Nametag Plate",
         "billboard nametag mica plate",
         VnuVUNUv.NAMETAG,
         "Starter",
         List.of("Element Mask", "Mica Glass", "Rim Light"),
         var0 -> UuUVuuUu(var0, VnuVUNUv.NAMETAG, "Clean Nametag Plate", "nametag plate material starter", 0.64F, 0.042F, 0.28F, 0.34F)
      ),
      new nNVvuuVvnvV.nvnNNunvv(
         "Clean Trail Ribbon",
         "additive ribbon starter with stable edge energy",
         VnuVUNUv.TRAILS,
         "Starter",
         List.of("Fresnel", "Gradient Map", "Bloom Lift"),
         nNVvuuVvnvV::uNNnnnuuuN
      )
   );

   private nNVvuuVvnvV() {
   }

   public static nuVVnvn UuUVuuUu(nNVvuuVvnvV.nvnNNunvv var0, nvvuUNnNvN var1) {
      return var0 == null ? UuUVuuUu(var1) : var0.builder.apply(var1);
   }

   public static nuVVnvn UuUVuuUu(nvvuUNnNvN var0) {
      return UuUVuuUu(var0, VnuVUNUv.HUD, "Ferro HUD Starter", "clean HUD plate shader", 0.72F, 0.07F, 0.34F, 0.6F);
   }

   private static nuVVnvn UuUVuuUu(nvvuUNnNvN var0, VnuVUNUv var1, String var2, String var3, float var4, float var5, float var6, float var7) {
      nuVVnvn var8 = new nuVVnvn();
      UuUVuuUu(var8, var2, var3, var1, "Starter");
      nNVvuuVvnvV.NVnVnNnN var9 = new nNVvuuVvnvV.NVnVnNnN(-780.0F, -180.0F, 224.0F, 108.0F);
      VUnvuNuVUUn var10 = UuUVuuUu(var8, var0, "input_element_uv", var9, 0, 0);
      VUnvuNuVUUn var11 = UuUVuuUu(var8, var0, "element_mask", var9, 0, 1);
      VUnvuNuVUUn var12 = UuUVuuUu(var8, var0, "theme_panel", var9, 0, 3);
      VUnvuNuVUUn var13 = UuUVuuUu(var8, var0, "theme_top", var9, 0, 4);
      VUnvuNuVUUn var14 = UuUVuuUu(var8, var0, "theme_bottom", var9, 0, 5);
      VUnvuNuVUUn var15 = UuUVuuUu(var8, var0, "exposed_float", var9, 1, 0);
      VUnvuNuVUUn var16 = UuUVuuUu(var8, var0, "exposed_float", var9, 1, 1);
      VUnvuNuVUUn var17 = UuUVuuUu(var8, var0, "exposed_float", var9, 1, 2);
      VUnvuNuVUUn var18 = UuUVuuUu(var8, var0, "exposed_float", var9, 1, 3);
      VUnvuNuVUUn var19 = UuUVuuUu(var8, var0, "exposed_float", var9, 1, 4);
      VUnvuNuVUUn var20 = UuUVuuUu(var8, var0, "exposed_float", var9, 1, 5);
      VUnvuNuVUUn var21 = UuUVuuUu(var8, var0, "glass_surface", var9, 2, 0);
      VUnvuNuVUUn var22 = UuUVuuUu(var8, var0, "rim_light", var9, 2, 2);
      VUnvuNuVUUn var23 = UuUVuuUu(var8, var0, "hover_glow", var9, 2, 4);
      VUnvuNuVUUn var24 = UuUVuuUu(var8, var0, "alpha_blend", var9, 3, 1);
      VUnvuNuVUUn var25 = UuUVuuUu(var8, var0, "alpha_blend", var9, 4, 1);
      VUnvuNuVUUn var26 = UuUVuuUu(var8, var0, "output_color", var9, 5, 1);
      UuUVuuUu(var15, "Opacity", var4, 0.05F, 1.0F, 0.01F);
      UuUVuuUu(var16, "Grain", var5, 0.0F, 0.18F, 0.002F);
      UuUVuuUu(var17, "Rim Width", 1.15F, 0.35F, 4.0F, 0.05F);
      UuUVuuUu(var18, "Rim Power", var6, 0.0F, 1.0F, 0.01F);
      UuUVuuUu(var19, "Hover Radius", 0.44F, 0.05F, 1.2F, 0.01F);
      UuUVuuUu(var20, "Hover Power", var7, 0.0F, 1.8F, 0.01F);
      var8.UuUVuuUu(var11.UuUVuuUu(), "mask", var21.UuUVuuUu(), "mask", var0);
      var8.UuUVuuUu(var12.UuUVuuUu(), "color", var21.UuUVuuUu(), "tint", var0);
      var8.UuUVuuUu(var15.UuUVuuUu(), "value", var21.UuUVuuUu(), "opacity", var0);
      var8.UuUVuuUu(var16.UuUVuuUu(), "value", var21.UuUVuuUu(), "grain", var0);
      var8.UuUVuuUu(var11.UuUVuuUu(), "mask", var22.UuUVuuUu(), "mask", var0);
      var8.UuUVuuUu(var13.UuUVuuUu(), "color", var22.UuUVuuUu(), "color", var0);
      var8.UuUVuuUu(var17.UuUVuuUu(), "value", var22.UuUVuuUu(), "thickness", var0);
      var8.UuUVuuUu(var18.UuUVuuUu(), "value", var22.UuUVuuUu(), "intensity", var0);
      var8.UuUVuuUu(var10.UuUVuuUu(), "uv", var23.UuUVuuUu(), "uv", var0);
      var8.UuUVuuUu(var14.UuUVuuUu(), "color", var23.UuUVuuUu(), "color", var0);
      var8.UuUVuuUu(var19.UuUVuuUu(), "value", var23.UuUVuuUu(), "radius", var0);
      var8.UuUVuuUu(var20.UuUVuuUu(), "value", var23.UuUVuuUu(), "intensity", var0);
      var8.UuUVuuUu(var21.UuUVuuUu(), "color", var24.UuUVuuUu(), "base", var0);
      var8.UuUVuuUu(var22.UuUVuuUu(), "color", var24.UuUVuuUu(), "layer", var0);
      var8.UuUVuuUu(var24.UuUVuuUu(), "color", var25.UuUVuuUu(), "base", var0);
      var8.UuUVuuUu(var23.UuUVuuUu(), "color", var25.UuUVuuUu(), "layer", var0);
      var8.UuUVuuUu(var25.UuUVuuUu(), "color", var26.UuUVuuUu(), "color", var0);
      return var8;
   }

   private static nuVVnvn C00OOC00oO(nvvuUNnNvN var0) {
      nuVVnvn var1 = new nuVVnvn();
      UuUVuuUu(var1, "Clean Health Fill", "stable health bar shader starter", VnuVUNUv.HEALTH_BAR, "Starter");
      nNVvuuVvnvV.NVnVnNnN var2 = new nNVvuuVvnvV.NVnVnNnN(-720.0F, -150.0F, 216.0F, 104.0F);
      VUnvuNuVUUn var3 = UuUVuuUu(var1, var0, "input_element_uv", var2, 0, 0);
      VUnvuNuVUUn var4 = UuUVuuUu(var1, var0, "vec2_split", var2, 1, 0);
      VUnvuNuVUUn var5 = UuUVuuUu(var1, var0, "element_mask", var2, 0, 2);
      VUnvuNuVUUn var6 = UuUVuuUu(var1, var0, "theme_bottom", var2, 1, 2);
      VUnvuNuVUUn var7 = UuUVuuUu(var1, var0, "theme_top", var2, 1, 3);
      VUnvuNuVUUn var8 = UuUVuuUu(var1, var0, "exposed_float", var2, 2, 0);
      VUnvuNuVUUn var9 = UuUVuuUu(var1, var0, "color_ramp", var2, 2, 2);
      VUnvuNuVUUn var10 = UuUVuuUu(var1, var0, "sdf_fill", var2, 3, 2);
      VUnvuNuVUUn var11 = UuUVuuUu(var1, var0, "output_color", var2, 4, 2);
      UuUVuuUu(var8, "Fill Alpha", 0.92F, 0.0F, 1.0F, 0.01F);
      var1.UuUVuuUu(var3.UuUVuuUu(), "uv", var4.UuUVuuUu(), "v", var0);
      var1.UuUVuuUu(var4.UuUVuuUu(), "x", var9.UuUVuuUu(), "t", var0);
      var1.UuUVuuUu(var6.UuUVuuUu(), "color", var9.UuUVuuUu(), "a", var0);
      var1.UuUVuuUu(var7.UuUVuuUu(), "color", var9.UuUVuuUu(), "b", var0);
      var1.UuUVuuUu(var5.UuUVuuUu(), "mask", var10.UuUVuuUu(), "mask", var0);
      var1.UuUVuuUu(var9.UuUVuuUu(), "color", var10.UuUVuuUu(), "color", var0);
      var1.UuUVuuUu(var8.UuUVuuUu(), "value", var10.UuUVuuUu(), "alpha", var0);
      var1.UuUVuuUu(var10.UuUVuuUu(), "color", var11.UuUVuuUu(), "color", var0);
      return var1;
   }

   private static nuVVnvn UuUVuuUu(nvvuUNnNvN var0, VnuVUNUv var1, String var2, String var3) {
      nuVVnvn var4 = new nuVVnvn();
      UuUVuuUu(var4, var2, var3, var1, "Starter");
      nNVvuuVvnvV.NVnVnNnN var5 = new nNVvuuVvnvV.NVnVnNnN(-700.0F, -130.0F, 216.0F, 104.0F);
      VUnvuNuVUUn var6 = UuUVuuUu(var4, var0, "input_global_uv", var5, 0, 0);
      VUnvuNuVUUn var7 = UuUVuuUu(var4, var0, "vec2_split", var5, 1, 0);
      VUnvuNuVUUn var8 = UuUVuuUu(var4, var0, "theme_bottom", var5, 1, 2);
      VUnvuNuVUUn var9 = UuUVuuUu(var4, var0, "theme_panel", var5, 1, 3);
      VUnvuNuVUUn var10 = UuUVuuUu(var4, var0, "theme_top", var5, 1, 4);
      VUnvuNuVUUn var11 = UuUVuuUu(var4, var0, "color_gradient_map", var5, 2, 1);
      VUnvuNuVUUn var12 = UuUVuuUu(var4, var0, "output_color", var5, 3, 1);
      var4.UuUVuuUu(var6.UuUVuuUu(), "uv", var7.UuUVuuUu(), "v", var0);
      var4.UuUVuuUu(var7.UuUVuuUu(), "y", var11.UuUVuuUu(), "t", var0);
      var4.UuUVuuUu(var8.UuUVuuUu(), "color", var11.UuUVuuUu(), "a", var0);
      var4.UuUVuuUu(var9.UuUVuuUu(), "color", var11.UuUVuuUu(), "b", var0);
      var4.UuUVuuUu(var10.UuUVuuUu(), "color", var11.UuUVuuUu(), "c", var0);
      var4.UuUVuuUu(var11.UuUVuuUu(), "color", var12.UuUVuuUu(), "color", var0);
      return var4;
   }

   private static nuVVnvn uUnuvNvvNU(nvvuUNnNvN var0) {
      nuVVnvn var1 = new nuVVnvn();
      UuUVuuUu(var1, "Clean ESP Silhouette", "stable entity silhouette shader starter", VnuVUNUv.ESP, "Starter");
      nNVvuuVvnvV.NVnVnNnN var2 = new nNVvuuVvnvV.NVnVnNnN(-720.0F, -160.0F, 216.0F, 106.0F);
      VUnvuNuVUUn var3 = UuUVuuUu(var1, var0, "element_mask", var2, 0, 0);
      VUnvuNuVUUn var4 = UuUVuuUu(var1, var0, "theme_bottom", var2, 0, 2);
      VUnvuNuVUUn var5 = UuUVuuUu(var1, var0, "theme_top", var2, 0, 3);
      VUnvuNuVUUn var6 = UuUVuuUu(var1, var0, "exposed_float", var2, 1, 0);
      VUnvuNuVUUn var7 = UuUVuuUu(var1, var0, "exposed_float", var2, 1, 1);
      VUnvuNuVUUn var8 = UuUVuuUu(var1, var0, "sdf_fill", var2, 2, 0);
      VUnvuNuVUUn var9 = UuUVuuUu(var1, var0, "rim_light", var2, 2, 2);
      VUnvuNuVUUn var10 = UuUVuuUu(var1, var0, "alpha_blend", var2, 3, 1);
      VUnvuNuVUUn var11 = UuUVuuUu(var1, var0, "output_color", var2, 4, 1);
      UuUVuuUu(var6, "Aura Alpha", 0.78F, 0.0F, 1.0F, 0.01F);
      UuUVuuUu(var7, "Rim Power", 0.46F, 0.0F, 1.2F, 0.01F);
      var1.UuUVuuUu(var3.UuUVuuUu(), "mask", var8.UuUVuuUu(), "mask", var0);
      var1.UuUVuuUu(var4.UuUVuuUu(), "color", var8.UuUVuuUu(), "color", var0);
      var1.UuUVuuUu(var6.UuUVuuUu(), "value", var8.UuUVuuUu(), "alpha", var0);
      var1.UuUVuuUu(var3.UuUVuuUu(), "mask", var9.UuUVuuUu(), "mask", var0);
      var1.UuUVuuUu(var5.UuUVuuUu(), "color", var9.UuUVuuUu(), "color", var0);
      var1.UuUVuuUu(var7.UuUVuuUu(), "value", var9.UuUVuuUu(), "intensity", var0);
      var1.UuUVuuUu(var8.UuUVuuUu(), "color", var10.UuUVuuUu(), "base", var0);
      var1.UuUVuuUu(var9.UuUVuuUu(), "color", var10.UuUVuuUu(), "layer", var0);
      var1.UuUVuuUu(var10.UuUVuuUu(), "color", var11.UuUVuuUu(), "color", var0);
      return var1;
   }

   private static nuVVnvn vVvUvVVuuNvV(nvvuUNnNvN var0) {
      nuVVnvn var1 = new nuVVnvn();
      UuUVuuUu(var1, "Clean Chams Film", "stable chams material starter", VnuVUNUv.CHAMS, "Starter");
      nNVvuuVvnvV.NVnVnNnN var2 = new nNVvuuVvnvV.NVnVnNnN(-740.0F, -150.0F, 216.0F, 106.0F);
      VUnvuNuVUUn var3 = UuUVuuUu(var1, var0, "input_uv", var2, 0, 0);
      VUnvuNuVUUn var4 = UuUVuuUu(var1, var0, "base_texture", var2, 0, 2);
      VUnvuNuVUUn var5 = UuUVuuUu(var1, var0, "color_alpha", var2, 1, 2);
      VUnvuNuVUUn var6 = UuUVuuUu(var1, var0, "fresnel", var2, 1, 0);
      VUnvuNuVUUn var7 = UuUVuuUu(var1, var0, "theme_top", var2, 1, 4);
      VUnvuNuVUUn var8 = UuUVuuUu(var1, var0, "theme_bottom", var2, 1, 5);
      VUnvuNuVUUn var9 = UuUVuuUu(var1, var0, "color_ramp", var2, 2, 0);
      VUnvuNuVUUn var10 = UuUVuuUu(var1, var0, "color_multiply_scalar", var2, 3, 0);
      VUnvuNuVUUn var11 = UuUVuuUu(var1, var0, "blend_screen", var2, 4, 1);
      VUnvuNuVUUn var12 = UuUVuuUu(var1, var0, "output_color", var2, 5, 1);
      var1.UuUVuuUu(var3.UuUVuuUu(), "uv", var6.UuUVuuUu(), "uv", var0);
      var1.UuUVuuUu(var6.UuUVuuUu(), "value", var9.UuUVuuUu(), "t", var0);
      var1.UuUVuuUu(var8.UuUVuuUu(), "color", var9.UuUVuuUu(), "a", var0);
      var1.UuUVuuUu(var7.UuUVuuUu(), "color", var9.UuUVuuUu(), "b", var0);
      var1.UuUVuuUu(var4.UuUVuuUu(), "color", var5.UuUVuuUu(), "color", var0);
      var1.UuUVuuUu(var9.UuUVuuUu(), "color", var10.UuUVuuUu(), "color", var0);
      var1.UuUVuuUu(var5.UuUVuuUu(), "alpha", var10.UuUVuuUu(), "factor", var0);
      var1.UuUVuuUu(var4.UuUVuuUu(), "color", var11.UuUVuuUu(), "base", var0);
      var1.UuUVuuUu(var10.UuUVuuUu(), "color", var11.UuUVuuUu(), "layer", var0);
      var1.UuUVuuUu(var5.UuUVuuUu(), "alpha", var11.UuUVuuUu(), "opacity", var0);
      var1.UuUVuuUu(var11.UuUVuuUu(), "color", var12.UuUVuuUu(), "color", var0);
      var1.UuUVuuUu(var5.UuUVuuUu(), "alpha", var12.UuUVuuUu(), "alpha", var0);
      return var1;
   }

   private static nuVVnvn uNNnnnuuuN(nvvuUNnNvN var0) {
      nuVVnvn var1 = new nuVVnvn();
      UuUVuuUu(var1, "Clean Trail Ribbon", "stable trail ribbon shader starter", VnuVUNUv.TRAILS, "Starter");
      nNVvuuVvnvV.NVnVnNnN var2 = new nNVvuuVvnvV.NVnVnNnN(-720.0F, -145.0F, 216.0F, 104.0F);
      VUnvuNuVUUn var3 = UuUVuuUu(var1, var0, "input_uv", var2, 0, 0);
      VUnvuNuVUUn var4 = UuUVuuUu(var1, var0, "fresnel", var2, 1, 0);
      VUnvuNuVUUn var5 = UuUVuuUu(var1, var0, "theme_top", var2, 1, 2);
      VUnvuNuVUUn var6 = UuUVuuUu(var1, var0, "theme_bottom", var2, 1, 3);
      VUnvuNuVUUn var7 = UuUVuuUu(var1, var0, "exposed_float", var2, 2, 0);
      VUnvuNuVUUn var8 = UuUVuuUu(var1, var0, "color_ramp", var2, 2, 2);
      VUnvuNuVUUn var9 = UuUVuuUu(var1, var0, "bloom_lift", var2, 3, 2);
      VUnvuNuVUUn var10 = UuUVuuUu(var1, var0, "output_color", var2, 4, 2);
      UuUVuuUu(var7, "Ribbon Alpha", 0.86F, 0.0F, 1.0F, 0.01F);
      var1.UuUVuuUu(var3.UuUVuuUu(), "uv", var4.UuUVuuUu(), "uv", var0);
      var1.UuUVuuUu(var4.UuUVuuUu(), "value", var8.UuUVuuUu(), "t", var0);
      var1.UuUVuuUu(var6.UuUVuuUu(), "color", var8.UuUVuuUu(), "a", var0);
      var1.UuUVuuUu(var5.UuUVuuUu(), "color", var8.UuUVuuUu(), "b", var0);
      var1.UuUVuuUu(var8.UuUVuuUu(), "color", var9.UuUVuuUu(), "color", var0);
      var1.UuUVuuUu(var9.UuUVuuUu(), "color", var10.UuUVuuUu(), "color", var0);
      var1.UuUVuuUu(var7.UuUVuuUu(), "value", var10.UuUVuuUu(), "alpha", var0);
      return var1;
   }

   private static void UuUVuuUu(nuVVnvn var0, String var1, String var2, VnuVUNUv var3, String var4) {
      var0.UuUVuuUu().UuUVuuUu(var1);
      var0.UuUVuuUu().uUnuvNvvNU(var2);
      var0.UuUVuuUu().vVvUvVVuuNvV(var4);
      var0.UuUVuuUu().uNNnnnuuuN("preset");
      if (var3 != null) {
         var0.UuUVuuUu(var3.UuUVuuUu());
      }
   }

   private static VUnvuNuVUUn UuUVuuUu(nuVVnvn var0, nvvuUNnNvN var1, String var2, nNVvuuVvnvV.NVnVnNnN var3, int var4, int var5) {
      return var0.UuUVuuUu(var2, var3.x(var4), var3.y(var5), var1);
   }

   private static void UuUVuuUu(VUnvuNuVUUn var0, String var1, float var2, float var3, float var4, float var5) {
      var0.C00OOC00oO("name", var1);
      var0.C00OOC00oO("value", var2);
      var0.C00OOC00oO("min", var3);
      var0.C00OOC00oO("max", var4);
      var0.C00OOC00oO("step", var5);
   }

   record NVnVnNnN(float originX, float originY, float column, float row) {
      float x(int var1) {
         return this.originX + this.column * var1;
      }

      float y(int var1) {
         return this.originY + this.row * var1;
      }
   }

   public record nvnNNunvv(String title, String description, VnuVUNUv target, String complexity, List<String> nodes, Function<nvvuUNnNvN, nuVVnvn> builder) {
   }
}
