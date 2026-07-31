package ru.metaculture.protection;

import java.util.List;
import java.util.function.Function;

public final class O00000OOO0O00 {
   public static final List<O00000OOO0O00.W304> O00000000 = List.of(
      new O00000OOO0O00.W304(
         "Ferro HUD Starter",
         "matte host plate with rim, grain and hover light",
         O00000OOOO00O.HUD,
         "Starter",
         List.of("Element Mask", "Mica Glass", "Rim Light", "Hover Glow"),
         o00000OOO0OOO -> O00000000(o00000OOO0OOO, O00000OOOO00O.HUD, "Ferro HUD Starter", "clean HUD plate shader", 0.72F, 0.07F, 0.34F, 0.6F)
      ),
      new O00000OOO0O00.W304(
         "Ferro Module Card",
         "module row glass without pulse or layout noise",
         O00000OOOO00O.MODULE_CARD,
         "Starter",
         List.of("Element Mask", "Mica Glass", "Rim Light"),
         o00000OOO0OOO -> O00000000(o00000OOO0OOO, O00000OOOO00O.MODULE_CARD, "Ferro Module Card", "module card material starter", 0.62F, 0.045F, 0.22F, 0.42F)
      ),
      new O00000OOO0O00.W304(
         "Ferro Panel Surface",
         "dock panel surface with stable mica depth",
         O00000OOOO00O.PANEL_BACKGROUND,
         "Starter",
         List.of("Element Mask", "Mica Glass", "Rim Light"),
         o00000OOO0OOO -> O00000000(
            o00000OOO0OOO, O00000OOOO00O.PANEL_BACKGROUND, "Ferro Panel Surface", "panel background material starter", 0.68F, 0.055F, 0.26F, 0.48F
         )
      ),
      new O00000OOO0O00.W304(
         "Ferro Button Surface",
         "button body with compact magnetic response",
         O00000OOOO00O.BUTTON,
         "Starter",
         List.of("Element Mask", "Mica Glass", "Hover Glow"),
         o00000OOO0OOO -> O00000000(
            o00000OOO0OOO, O00000OOOO00O.BUTTON, "Ferro Button Surface", "interactive button material starter", 0.66F, 0.038F, 0.3F, 0.82F
         )
      ),
      new O00000OOO0O00.W304(
         "Clean Health Fill",
         "stable gradient fill for bars and shield surfaces",
         O00000OOOO00O.HEALTH_BAR,
         "Starter",
         List.of("Element UV", "Gradient Map", "SDF Fill"),
         O00000OOO0O00::O000000000
      ),
      new O00000OOO0O00.W304(
         "Clean Menu Background",
         "quiet full-screen gradient background",
         O00000OOOO00O.BACKGROUND,
         "Starter",
         List.of("Global UV", "Gradient Map"),
         o00000OOO0OOO -> O00000000(o00000OOO0OOO, O00000OOOO00O.BACKGROUND, "Clean Menu Background", "full-screen interface background starter")
      ),
      new O00000OOO0O00.W304(
         "Clean Sky Atmosphere",
         "soft atmospheric wash for sky target",
         O00000OOOO00O.SKY,
         "Starter",
         List.of("Global UV", "Gradient Map"),
         o00000OOO0OOO -> O00000000(o00000OOO0OOO, O00000OOOO00O.SKY, "Clean Sky Atmosphere", "world atmosphere starter")
      ),
      new O00000OOO0O00.W304(
         "Clean ESP Silhouette",
         "entity-target rounded silhouette with rim",
         O00000OOOO00O.ESP,
         "Starter",
         List.of("Element Mask", "SDF Fill", "Rim Light"),
         O00000OOO0O00::O0000000000
      ),
      new O00000OOO0O00.W304(
         "Clean Chams Film",
         "texture-preserving entity film with stable fresnel",
         O00000OOOO00O.CHAMS,
         "Starter",
         List.of("Base Texture", "Fresnel", "Screen Blend"),
         O00000OOO0O00::O00000000000
      ),
      new O00000OOO0O00.W304(
         "Clean Nametag Plate",
         "billboard nametag mica plate",
         O00000OOOO00O.NAMETAG,
         "Starter",
         List.of("Element Mask", "Mica Glass", "Rim Light"),
         o00000OOO0OOO -> O00000000(o00000OOO0OOO, O00000OOOO00O.NAMETAG, "Clean Nametag Plate", "nametag plate material starter", 0.64F, 0.042F, 0.28F, 0.34F)
      ),
      new O00000OOO0O00.W304(
         "Clean Trail Ribbon",
         "additive ribbon starter with stable edge energy",
         O00000OOOO00O.TRAILS,
         "Starter",
         List.of("Fresnel", "Gradient Map", "Bloom Lift"),
         O00000OOO0O00::O000000000000
      )
   );

   private O00000OOO0O00() {
   }

   public static O00000OOO0OO00 O00000000(O00000OOO0O00.W304 o000000000, O00000OOO0OOO o00000OOO0OOO) {
      return o000000000 == null ? O00000000(o00000OOO0OOO) : o000000000.builder.apply(o00000OOO0OOO);
   }

   public static O00000OOO0OO00 O00000000(O00000OOO0OOO o00000OOO0OOO) {
      return O00000000(o00000OOO0OOO, O00000OOOO00O.HUD, "Ferro HUD Starter", "clean HUD plate shader", 0.72F, 0.07F, 0.34F, 0.6F);
   }

   private static O00000OOO0OO00 O00000000(
      O00000OOO0OOO o00000OOO0OOO, O00000OOOO00O o00000OOOO00O, String string, String string2, float f, float g, float h, float i
   ) {
      O00000OOO0OO00 var8 = new O00000OOO0OO00();
      O00000000(var8, string, string2, o00000OOOO00O, "Starter");
      O00000OOO0O00.W303 var9 = new O00000OOO0O00.W303(-780.0F, -180.0F, 224.0F, 108.0F);
      O00000OOO0OO0O var10 = O00000000(var8, o00000OOO0OOO, "input_element_uv", var9, 0, 0);
      O00000OOO0OO0O var11 = O00000000(var8, o00000OOO0OOO, "element_mask", var9, 0, 1);
      O00000OOO0OO0O var12 = O00000000(var8, o00000OOO0OOO, "theme_panel", var9, 0, 3);
      O00000OOO0OO0O var13 = O00000000(var8, o00000OOO0OOO, "theme_top", var9, 0, 4);
      O00000OOO0OO0O var14 = O00000000(var8, o00000OOO0OOO, "theme_bottom", var9, 0, 5);
      O00000OOO0OO0O var15 = O00000000(var8, o00000OOO0OOO, "exposed_float", var9, 1, 0);
      O00000OOO0OO0O var16 = O00000000(var8, o00000OOO0OOO, "exposed_float", var9, 1, 1);
      O00000OOO0OO0O var17 = O00000000(var8, o00000OOO0OOO, "exposed_float", var9, 1, 2);
      O00000OOO0OO0O var18 = O00000000(var8, o00000OOO0OOO, "exposed_float", var9, 1, 3);
      O00000OOO0OO0O var19 = O00000000(var8, o00000OOO0OOO, "exposed_float", var9, 1, 4);
      O00000OOO0OO0O var20 = O00000000(var8, o00000OOO0OOO, "exposed_float", var9, 1, 5);
      O00000OOO0OO0O var21 = O00000000(var8, o00000OOO0OOO, "glass_surface", var9, 2, 0);
      O00000OOO0OO0O var22 = O00000000(var8, o00000OOO0OOO, "rim_light", var9, 2, 2);
      O00000OOO0OO0O var23 = O00000000(var8, o00000OOO0OOO, "hover_glow", var9, 2, 4);
      O00000OOO0OO0O var24 = O00000000(var8, o00000OOO0OOO, "alpha_blend", var9, 3, 1);
      O00000OOO0OO0O var25 = O00000000(var8, o00000OOO0OOO, "alpha_blend", var9, 4, 1);
      O00000OOO0OO0O var26 = O00000000(var8, o00000OOO0OOO, "output_color", var9, 5, 1);
      O00000000(var15, "Opacity", f, 0.05F, 1.0F, 0.01F);
      O00000000(var16, "Grain", g, 0.0F, 0.18F, 0.002F);
      O00000000(var17, "Rim Width", 1.15F, 0.35F, 4.0F, 0.05F);
      O00000000(var18, "Rim Power", h, 0.0F, 1.0F, 0.01F);
      O00000000(var19, "Hover Radius", 0.44F, 0.05F, 1.2F, 0.01F);
      O00000000(var20, "Hover Power", i, 0.0F, 1.8F, 0.01F);
      var8.O00000000(var11.O00000000(), "mask", var21.O00000000(), "mask", o00000OOO0OOO);
      var8.O00000000(var12.O00000000(), "color", var21.O00000000(), "tint", o00000OOO0OOO);
      var8.O00000000(var15.O00000000(), "value", var21.O00000000(), "opacity", o00000OOO0OOO);
      var8.O00000000(var16.O00000000(), "value", var21.O00000000(), "grain", o00000OOO0OOO);
      var8.O00000000(var11.O00000000(), "mask", var22.O00000000(), "mask", o00000OOO0OOO);
      var8.O00000000(var13.O00000000(), "color", var22.O00000000(), "color", o00000OOO0OOO);
      var8.O00000000(var17.O00000000(), "value", var22.O00000000(), "thickness", o00000OOO0OOO);
      var8.O00000000(var18.O00000000(), "value", var22.O00000000(), "intensity", o00000OOO0OOO);
      var8.O00000000(var10.O00000000(), "uv", var23.O00000000(), "uv", o00000OOO0OOO);
      var8.O00000000(var14.O00000000(), "color", var23.O00000000(), "color", o00000OOO0OOO);
      var8.O00000000(var19.O00000000(), "value", var23.O00000000(), "radius", o00000OOO0OOO);
      var8.O00000000(var20.O00000000(), "value", var23.O00000000(), "intensity", o00000OOO0OOO);
      var8.O00000000(var21.O00000000(), "color", var24.O00000000(), "base", o00000OOO0OOO);
      var8.O00000000(var22.O00000000(), "color", var24.O00000000(), "layer", o00000OOO0OOO);
      var8.O00000000(var24.O00000000(), "color", var25.O00000000(), "base", o00000OOO0OOO);
      var8.O00000000(var23.O00000000(), "color", var25.O00000000(), "layer", o00000OOO0OOO);
      var8.O00000000(var25.O00000000(), "color", var26.O00000000(), "color", o00000OOO0OOO);
      return var8;
   }

   private static O00000OOO0OO00 O000000000(O00000OOO0OOO o00000OOO0OOO) {
      O00000OOO0OO00 var1 = new O00000OOO0OO00();
      O00000000(var1, "Clean Health Fill", "stable health bar shader starter", O00000OOOO00O.HEALTH_BAR, "Starter");
      O00000OOO0O00.W303 var2 = new O00000OOO0O00.W303(-720.0F, -150.0F, 216.0F, 104.0F);
      O00000OOO0OO0O var3 = O00000000(var1, o00000OOO0OOO, "input_element_uv", var2, 0, 0);
      O00000OOO0OO0O var4 = O00000000(var1, o00000OOO0OOO, "vec2_split", var2, 1, 0);
      O00000OOO0OO0O var5 = O00000000(var1, o00000OOO0OOO, "element_mask", var2, 0, 2);
      O00000OOO0OO0O var6 = O00000000(var1, o00000OOO0OOO, "theme_bottom", var2, 1, 2);
      O00000OOO0OO0O var7 = O00000000(var1, o00000OOO0OOO, "theme_top", var2, 1, 3);
      O00000OOO0OO0O var8 = O00000000(var1, o00000OOO0OOO, "exposed_float", var2, 2, 0);
      O00000OOO0OO0O var9 = O00000000(var1, o00000OOO0OOO, "color_ramp", var2, 2, 2);
      O00000OOO0OO0O var10 = O00000000(var1, o00000OOO0OOO, "sdf_fill", var2, 3, 2);
      O00000OOO0OO0O var11 = O00000000(var1, o00000OOO0OOO, "output_color", var2, 4, 2);
      O00000000(var8, "Fill Alpha", 0.92F, 0.0F, 1.0F, 0.01F);
      var1.O00000000(var3.O00000000(), "uv", var4.O00000000(), "v", o00000OOO0OOO);
      var1.O00000000(var4.O00000000(), "x", var9.O00000000(), "t", o00000OOO0OOO);
      var1.O00000000(var6.O00000000(), "color", var9.O00000000(), "a", o00000OOO0OOO);
      var1.O00000000(var7.O00000000(), "color", var9.O00000000(), "b", o00000OOO0OOO);
      var1.O00000000(var5.O00000000(), "mask", var10.O00000000(), "mask", o00000OOO0OOO);
      var1.O00000000(var9.O00000000(), "color", var10.O00000000(), "color", o00000OOO0OOO);
      var1.O00000000(var8.O00000000(), "value", var10.O00000000(), "alpha", o00000OOO0OOO);
      var1.O00000000(var10.O00000000(), "color", var11.O00000000(), "color", o00000OOO0OOO);
      return var1;
   }

   private static O00000OOO0OO00 O00000000(O00000OOO0OOO o00000OOO0OOO, O00000OOOO00O o00000OOOO00O, String string, String string2) {
      O00000OOO0OO00 var4 = new O00000OOO0OO00();
      O00000000(var4, string, string2, o00000OOOO00O, "Starter");
      O00000OOO0O00.W303 var5 = new O00000OOO0O00.W303(-700.0F, -130.0F, 216.0F, 104.0F);
      O00000OOO0OO0O var6 = O00000000(var4, o00000OOO0OOO, "input_global_uv", var5, 0, 0);
      O00000OOO0OO0O var7 = O00000000(var4, o00000OOO0OOO, "vec2_split", var5, 1, 0);
      O00000OOO0OO0O var8 = O00000000(var4, o00000OOO0OOO, "theme_bottom", var5, 1, 2);
      O00000OOO0OO0O var9 = O00000000(var4, o00000OOO0OOO, "theme_panel", var5, 1, 3);
      O00000OOO0OO0O var10 = O00000000(var4, o00000OOO0OOO, "theme_top", var5, 1, 4);
      O00000OOO0OO0O var11 = O00000000(var4, o00000OOO0OOO, "color_gradient_map", var5, 2, 1);
      O00000OOO0OO0O var12 = O00000000(var4, o00000OOO0OOO, "output_color", var5, 3, 1);
      var4.O00000000(var6.O00000000(), "uv", var7.O00000000(), "v", o00000OOO0OOO);
      var4.O00000000(var7.O00000000(), "y", var11.O00000000(), "t", o00000OOO0OOO);
      var4.O00000000(var8.O00000000(), "color", var11.O00000000(), "a", o00000OOO0OOO);
      var4.O00000000(var9.O00000000(), "color", var11.O00000000(), "b", o00000OOO0OOO);
      var4.O00000000(var10.O00000000(), "color", var11.O00000000(), "c", o00000OOO0OOO);
      var4.O00000000(var11.O00000000(), "color", var12.O00000000(), "color", o00000OOO0OOO);
      return var4;
   }

   private static O00000OOO0OO00 O0000000000(O00000OOO0OOO o00000OOO0OOO) {
      O00000OOO0OO00 var1 = new O00000OOO0OO00();
      O00000000(var1, "Clean ESP Silhouette", "stable entity silhouette shader starter", O00000OOOO00O.ESP, "Starter");
      O00000OOO0O00.W303 var2 = new O00000OOO0O00.W303(-720.0F, -160.0F, 216.0F, 106.0F);
      O00000OOO0OO0O var3 = O00000000(var1, o00000OOO0OOO, "element_mask", var2, 0, 0);
      O00000OOO0OO0O var4 = O00000000(var1, o00000OOO0OOO, "theme_bottom", var2, 0, 2);
      O00000OOO0OO0O var5 = O00000000(var1, o00000OOO0OOO, "theme_top", var2, 0, 3);
      O00000OOO0OO0O var6 = O00000000(var1, o00000OOO0OOO, "exposed_float", var2, 1, 0);
      O00000OOO0OO0O var7 = O00000000(var1, o00000OOO0OOO, "exposed_float", var2, 1, 1);
      O00000OOO0OO0O var8 = O00000000(var1, o00000OOO0OOO, "sdf_fill", var2, 2, 0);
      O00000OOO0OO0O var9 = O00000000(var1, o00000OOO0OOO, "rim_light", var2, 2, 2);
      O00000OOO0OO0O var10 = O00000000(var1, o00000OOO0OOO, "alpha_blend", var2, 3, 1);
      O00000OOO0OO0O var11 = O00000000(var1, o00000OOO0OOO, "output_color", var2, 4, 1);
      O00000000(var6, "Aura Alpha", 0.78F, 0.0F, 1.0F, 0.01F);
      O00000000(var7, "Rim Power", 0.46F, 0.0F, 1.2F, 0.01F);
      var1.O00000000(var3.O00000000(), "mask", var8.O00000000(), "mask", o00000OOO0OOO);
      var1.O00000000(var4.O00000000(), "color", var8.O00000000(), "color", o00000OOO0OOO);
      var1.O00000000(var6.O00000000(), "value", var8.O00000000(), "alpha", o00000OOO0OOO);
      var1.O00000000(var3.O00000000(), "mask", var9.O00000000(), "mask", o00000OOO0OOO);
      var1.O00000000(var5.O00000000(), "color", var9.O00000000(), "color", o00000OOO0OOO);
      var1.O00000000(var7.O00000000(), "value", var9.O00000000(), "intensity", o00000OOO0OOO);
      var1.O00000000(var8.O00000000(), "color", var10.O00000000(), "base", o00000OOO0OOO);
      var1.O00000000(var9.O00000000(), "color", var10.O00000000(), "layer", o00000OOO0OOO);
      var1.O00000000(var10.O00000000(), "color", var11.O00000000(), "color", o00000OOO0OOO);
      return var1;
   }

   private static O00000OOO0OO00 O00000000000(O00000OOO0OOO o00000OOO0OOO) {
      O00000OOO0OO00 var1 = new O00000OOO0OO00();
      O00000000(var1, "Clean Chams Film", "stable chams material starter", O00000OOOO00O.CHAMS, "Starter");
      O00000OOO0O00.W303 var2 = new O00000OOO0O00.W303(-740.0F, -150.0F, 216.0F, 106.0F);
      O00000OOO0OO0O var3 = O00000000(var1, o00000OOO0OOO, "input_uv", var2, 0, 0);
      O00000OOO0OO0O var4 = O00000000(var1, o00000OOO0OOO, "base_texture", var2, 0, 2);
      O00000OOO0OO0O var5 = O00000000(var1, o00000OOO0OOO, "color_alpha", var2, 1, 2);
      O00000OOO0OO0O var6 = O00000000(var1, o00000OOO0OOO, "fresnel", var2, 1, 0);
      O00000OOO0OO0O var7 = O00000000(var1, o00000OOO0OOO, "theme_top", var2, 1, 4);
      O00000OOO0OO0O var8 = O00000000(var1, o00000OOO0OOO, "theme_bottom", var2, 1, 5);
      O00000OOO0OO0O var9 = O00000000(var1, o00000OOO0OOO, "color_ramp", var2, 2, 0);
      O00000OOO0OO0O var10 = O00000000(var1, o00000OOO0OOO, "color_multiply_scalar", var2, 3, 0);
      O00000OOO0OO0O var11 = O00000000(var1, o00000OOO0OOO, "blend_screen", var2, 4, 1);
      O00000OOO0OO0O var12 = O00000000(var1, o00000OOO0OOO, "output_color", var2, 5, 1);
      var1.O00000000(var3.O00000000(), "uv", var6.O00000000(), "uv", o00000OOO0OOO);
      var1.O00000000(var6.O00000000(), "value", var9.O00000000(), "t", o00000OOO0OOO);
      var1.O00000000(var8.O00000000(), "color", var9.O00000000(), "a", o00000OOO0OOO);
      var1.O00000000(var7.O00000000(), "color", var9.O00000000(), "b", o00000OOO0OOO);
      var1.O00000000(var4.O00000000(), "color", var5.O00000000(), "color", o00000OOO0OOO);
      var1.O00000000(var9.O00000000(), "color", var10.O00000000(), "color", o00000OOO0OOO);
      var1.O00000000(var5.O00000000(), "alpha", var10.O00000000(), "factor", o00000OOO0OOO);
      var1.O00000000(var4.O00000000(), "color", var11.O00000000(), "base", o00000OOO0OOO);
      var1.O00000000(var10.O00000000(), "color", var11.O00000000(), "layer", o00000OOO0OOO);
      var1.O00000000(var5.O00000000(), "alpha", var11.O00000000(), "opacity", o00000OOO0OOO);
      var1.O00000000(var11.O00000000(), "color", var12.O00000000(), "color", o00000OOO0OOO);
      var1.O00000000(var5.O00000000(), "alpha", var12.O00000000(), "alpha", o00000OOO0OOO);
      return var1;
   }

   private static O00000OOO0OO00 O000000000000(O00000OOO0OOO o00000OOO0OOO) {
      O00000OOO0OO00 var1 = new O00000OOO0OO00();
      O00000000(var1, "Clean Trail Ribbon", "stable trail ribbon shader starter", O00000OOOO00O.TRAILS, "Starter");
      O00000OOO0O00.W303 var2 = new O00000OOO0O00.W303(-720.0F, -145.0F, 216.0F, 104.0F);
      O00000OOO0OO0O var3 = O00000000(var1, o00000OOO0OOO, "input_uv", var2, 0, 0);
      O00000OOO0OO0O var4 = O00000000(var1, o00000OOO0OOO, "fresnel", var2, 1, 0);
      O00000OOO0OO0O var5 = O00000000(var1, o00000OOO0OOO, "theme_top", var2, 1, 2);
      O00000OOO0OO0O var6 = O00000000(var1, o00000OOO0OOO, "theme_bottom", var2, 1, 3);
      O00000OOO0OO0O var7 = O00000000(var1, o00000OOO0OOO, "exposed_float", var2, 2, 0);
      O00000OOO0OO0O var8 = O00000000(var1, o00000OOO0OOO, "color_ramp", var2, 2, 2);
      O00000OOO0OO0O var9 = O00000000(var1, o00000OOO0OOO, "bloom_lift", var2, 3, 2);
      O00000OOO0OO0O var10 = O00000000(var1, o00000OOO0OOO, "output_color", var2, 4, 2);
      O00000000(var7, "Ribbon Alpha", 0.86F, 0.0F, 1.0F, 0.01F);
      var1.O00000000(var3.O00000000(), "uv", var4.O00000000(), "uv", o00000OOO0OOO);
      var1.O00000000(var4.O00000000(), "value", var8.O00000000(), "t", o00000OOO0OOO);
      var1.O00000000(var6.O00000000(), "color", var8.O00000000(), "a", o00000OOO0OOO);
      var1.O00000000(var5.O00000000(), "color", var8.O00000000(), "b", o00000OOO0OOO);
      var1.O00000000(var8.O00000000(), "color", var9.O00000000(), "color", o00000OOO0OOO);
      var1.O00000000(var9.O00000000(), "color", var10.O00000000(), "color", o00000OOO0OOO);
      var1.O00000000(var7.O00000000(), "value", var10.O00000000(), "alpha", o00000OOO0OOO);
      return var1;
   }

   private static void O00000000(O00000OOO0OO00 o00000OOO0OO00, String string, String string2, O00000OOOO00O o00000OOOO00O, String string3) {
      o00000OOO0OO00.O00000000().O00000000(string);
      o00000OOO0OO00.O00000000().O0000000000(string2);
      o00000OOO0OO00.O00000000().O00000000000(string3);
      o00000OOO0OO00.O00000000().O000000000000("preset");
      if (o00000OOOO00O != null) {
         o00000OOO0OO00.O00000000(o00000OOOO00O.O00000000());
      }
   }

   private static O00000OOO0OO0O O00000000(
      O00000OOO0OO00 o00000OOO0OO00, O00000OOO0OOO o00000OOO0OOO, String string, O00000OOO0O00.W303 o00000000, int i, int j
   ) {
      return o00000OOO0OO00.O00000000(string, o00000000.x(i), o00000000.y(j), o00000OOO0OOO);
   }

   private static void O00000000(O00000OOO0OO0O o00000OOO0OO0O, String string, float f, float g, float h, float i) {
      o00000OOO0OO0O.O000000000("name", string);
      o00000OOO0OO0O.O000000000("value", f);
      o00000OOO0OO0O.O000000000("min", g);
      o00000OOO0OO0O.O000000000("max", h);
      o00000OOO0OO0O.O000000000("step", i);
   }

   record W303(float originX, float originY, float column, float row) {
      float x(int i) {
         return this.originX + this.column * i;
      }

      float y(int i) {
         return this.originY + this.row * i;
      }
   }

   public record W304(
      String title, String description, O00000OOOO00O target, String complexity, List<String> nodes, Function<O00000OOO0OOO, O00000OOO0OO00> builder
   ) {
   }
}
