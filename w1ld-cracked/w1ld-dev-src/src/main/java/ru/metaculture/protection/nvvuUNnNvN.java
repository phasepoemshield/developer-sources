package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class nvvuUNnNvN {
   private final Map<String, uuUnNVuuVUu> UuUVuuUu = new LinkedHashMap<>();

   public nvvuUNnNvN() {
      this.C00OOC00oO();
   }

   public uuUnNVuuVUu UuUVuuUu(String var1) {
      return this.UuUVuuUu.get(var1);
   }

   public Collection<uuUnNVuuVUu> UuUVuuUu() {
      return this.UuUVuuUu.values();
   }

   public List<uuUnNVuuVUu> C00OOC00oO(String var1) {
      if (var1 != null && !var1.isBlank()) {
         String var2 = var1.toLowerCase(Locale.ROOT).trim();
         ArrayList var3 = new ArrayList();

         for (uuUnNVuuVUu var5 : this.UuUVuuUu.values()) {
            if (var5.C00OOC00oO().toLowerCase(Locale.ROOT).contains(var2)
               || var5.uUnuvNvvNU().toLowerCase(Locale.ROOT).contains(var2)
               || var5.UuUVuuUu().toLowerCase(Locale.ROOT).contains(var2)) {
               var3.add(var5);
            }
         }

         return var3;
      } else {
         return new ArrayList<>(this.UuUVuuUu.values());
      }
   }

   public void UuUVuuUu(uuUnNVuuVUu var1) {
      this.UuUVuuUu.put(var1.UuUVuuUu(), var1);
   }

   private void C00OOC00oO() {
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_uv", "Centered UV", "Inputs", 164.0F, List.of(), List.of(NUuvnUuVU.output("uv", "uv", nnNVVnNnnV.VEC2)), (var0, var1, var2) -> "uv"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_global_uv",
            "Global Screen UV",
            "Inputs",
            180.0F,
            List.of(),
            List.of(NUuvnUuVU.output("uv", "uv", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "globalUv"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_screen_uv",
            "Screen UV",
            "Inputs",
            180.0F,
            List.of(),
            List.of(NUuvnUuVU.output("uv", "uv", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "globalUv"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_time", "Time", "Inputs", 164.0F, List.of(), List.of(NUuvnUuVU.output("time", "time", nnNVVnNnnV.FLOAT)), (var0, var1, var2) -> "u_Time"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_mouse",
            "Mouse",
            "Inputs",
            164.0F,
            List.of(),
            List.of(NUuvnUuVU.output("mouse", "mouse", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "(u_Mouse / max(u_Resolution, vec2(1.0)))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_global_mouse",
            "Global Mouse",
            "Inputs",
            178.0F,
            List.of(),
            List.of(NUuvnUuVU.output("mouse", "mouse", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "((u_ElementRect.xy + u_Mouse) / max(u_Resolution, vec2(1.0)))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_element_uv",
            "Element UV",
            "Context",
            174.0F,
            List.of(),
            List.of(NUuvnUuVU.output("uv", "uv", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "normalizedUv"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_element_centered_uv",
            "Element Centered UV",
            "Context",
            204.0F,
            List.of(),
            List.of(NUuvnUuVU.output("uv", "uv", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "(normalizedUv - 0.5)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_element_rect",
            "Element Rect",
            "Context",
            184.0F,
            List.of(),
            List.of(NUuvnUuVU.output("rect", "rect", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "u_ElementRect"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_element_size",
            "Element Size",
            "Context",
            184.0F,
            List.of(),
            List.of(NUuvnUuVU.output("size", "size", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "u_ElementRect.zw"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_element_radius",
            "Element Radius",
            "Context",
            190.0F,
            List.of(),
            List.of(NUuvnUuVU.output("radius", "radius", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "u_ElementRadius"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_local_mouse",
            "Local Mouse",
            "Context",
            180.0F,
            List.of(),
            List.of(NUuvnUuVU.output("mouse", "mouse", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "clamp(u_Mouse / max(u_ElementRect.zw, vec2(1.0)), vec2(0.0), vec2(1.0))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_aspect",
            "Element Aspect",
            "Context",
            186.0F,
            List.of(),
            List.of(NUuvnUuVU.output("aspect", "aspect", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "(u_ElementRect.z / max(u_ElementRect.w, 1.0))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "theme_top",
            "Accent Top",
            "Inputs",
            174.0F,
            List.of(),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(u_AccentTop, 1.0)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "theme_bottom",
            "Accent Bottom",
            "Inputs",
            174.0F,
            List.of(),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(u_AccentBottom, 1.0)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "theme_panel",
            "Theme Panel",
            "Inputs",
            174.0F,
            List.of(),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "u_ThemeColors[0]"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "exposed_float",
            "Exposed Float",
            "Inputs",
            188.0F,
            List.of(),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> var0.UuUVuuUu(var1)
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "exposed_color",
            "Exposed Color",
            "Inputs",
            194.0F,
            List.of(),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> var0.UuUVuuUu(var1)
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "float_value",
            "Float",
            "Constants",
            154.0F,
            List.of(),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> var0.UuUVuuUu(var1.UuUVuuUu("value", 0.5F))
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec2_value",
            "Vec2",
            "Constants",
            168.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.5"), NUuvnUuVU.input("y", "y", nnNVVnNnnV.FLOAT, "0.5")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "vec2(" + var0.UuUVuuUu(var1, "x") + ", " + var0.UuUVuuUu(var1, "y") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec3_value",
            "Vec3",
            "Constants",
            168.0F,
            List.of(
               NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("y", "y", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("z", "z", nnNVVnNnnV.FLOAT, "0.0")
            ),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC3)),
            (var0, var1, var2) -> "vec3(" + var0.UuUVuuUu(var1, "x") + ", " + var0.UuUVuuUu(var1, "y") + ", " + var0.UuUVuuUu(var1, "z") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec4_value",
            "Vec4",
            "Constants",
            174.0F,
            List.of(
               NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "1.0"),
               NUuvnUuVU.input("y", "y", nnNVVnNnnV.FLOAT, "1.0"),
               NUuvnUuVU.input("z", "z", nnNVVnNnnV.FLOAT, "1.0"),
               NUuvnUuVU.input("w", "w", nnNVVnNnnV.FLOAT, "1.0")
            ),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4("
               + var0.UuUVuuUu(var1, "x")
               + ", "
               + var0.UuUVuuUu(var1, "y")
               + ", "
               + var0.UuUVuuUu(var1, "z")
               + ", "
               + var0.UuUVuuUu(var1, "w")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "base_texture",
            "Base Texture",
            "Texture",
            190.0F,
            List.of(),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "texture(u_DiffuseMap, wild_diffuse_uv())"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_entity_mask",
            "Entity Mask",
            "Entity Context",
            188.0F,
            List.of(),
            List.of(NUuvnUuVU.output("mask", "mask", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "step(0.001, texture(u_DiffuseMap, wild_diffuse_uv()).a)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_depth",
            "Depth",
            "Entity Context",
            164.0F,
            List.of(),
            List.of(NUuvnUuVU.output("depth", "depth", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "clamp(1.0 - texture(u_DiffuseMap, wild_diffuse_uv()).a, 0.0, 1.0)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_camera_distance",
            "Camera Distance",
            "Entity Context",
            196.0F,
            List.of(),
            List.of(NUuvnUuVU.output("distance", "distance", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "length((wild_screen_px() - u_Resolution * 0.5) / max(u_Resolution.y, 1.0))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_camera_dir",
            "Camera Direction",
            "World Context",
            198.0F,
            List.of(),
            List.of(NUuvnUuVU.output("dir", "dir", nnNVVnNnnV.VEC3)),
            (var0, var1, var2) -> "normalize(vec3(wild_view_dir(vUv), 1.0))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_sun_dir",
            "Sun Direction",
            "World Context",
            184.0F,
            List.of(),
            List.of(NUuvnUuVU.output("dir", "dir", nnNVVnNnnV.VEC3)),
            (var0, var1, var2) -> "normalize(vec3(cos(u_Time * 0.04), 0.42, sin(u_Time * 0.04)))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_world_time",
            "World Time",
            "World Context",
            178.0F,
            List.of(),
            List.of(NUuvnUuVU.output("time", "time", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "fract(u_Time * 0.012)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_rain",
            "Rain Strength",
            "World Context",
            178.0F,
            List.of(),
            List.of(NUuvnUuVU.output("rain", "rain", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "0.0"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_biome_tint",
            "Biome Tint",
            "World Context",
            178.0F,
            List.of(),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(mix(u_AccentBottom, u_AccentTop, 0.35), 1.0)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "color_alpha",
            "Alpha Channel",
            "Texture",
            184.0F,
            List.of(NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(1.0)")),
            List.of(NUuvnUuVU.output("alpha", "alpha", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "color") + ").a"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "float_add",
            "Add Float",
            "Math",
            168.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.FLOAT, "0.0"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "a") + " + " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "float_mul",
            "Multiply Float",
            "Math",
            182.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.FLOAT, "1.0"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "a") + " * " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "float_sin",
            "Sine",
            "Math",
            164.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0"), NUuvnUuVU.input("freq", "freq", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "(0.5 + 0.5 * sin((" + var0.UuUVuuUu(var1, "x") + ") * (" + var0.UuUVuuUu(var1, "freq") + ")))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "float_smoothstep",
            "Smoothstep",
            "Math",
            188.0F,
            List.of(
               NUuvnUuVU.input("edge0", "edge0", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("edge1", "edge1", nnNVVnNnnV.FLOAT, "1.0"),
               NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.5")
            ),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "smoothstep(" + var0.UuUVuuUu(var1, "edge0") + ", " + var0.UuUVuuUu(var1, "edge1") + ", " + var0.UuUVuuUu(var1, "x") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec4_mix",
            "Mix Color",
            "Color",
            184.0F,
            List.of(
               NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC4, "vec4(0.0, 0.0, 0.0, 1.0)"),
               NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC4, "vec4(1.0, 1.0, 1.0, 1.0)"),
               NUuvnUuVU.input("t", "t", nnNVVnNnnV.FLOAT, "0.5")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "mix(" + var0.UuUVuuUu(var1, "a") + ", " + var0.UuUVuuUu(var1, "b") + ", clamp(" + var0.UuUVuuUu(var1, "t") + ", 0.0, 1.0))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "sdf_fill",
            "SDF Fill",
            "Color",
            184.0F,
            List.of(
               NUuvnUuVU.input("mask", "distance", nnNVVnNnnV.FLOAT, "-1.0"),
               NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "u_ThemeColors[0]"),
               NUuvnUuVU.input("alpha", "alpha", nnNVVnNnnV.FLOAT, "1.0")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(("
               + var0.UuUVuuUu(var1, "color")
               + ").rgb, ("
               + var0.UuUVuuUu(var1, "color")
               + ").a * wild_sdf_alpha("
               + var0.UuUVuuUu(var1, "mask")
               + ") * wild_sat("
               + var0.UuUVuuUu(var1, "alpha")
               + "))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "element_mask",
            "Element Mask",
            "Base Shape",
            184.0F,
            List.of(),
            List.of(NUuvnUuVU.output("mask", "distance", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "wild_element_distance()"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "element_alpha",
            "Element Alpha",
            "Base Shape",
            184.0F,
            List.of(),
            List.of(NUuvnUuVU.output("alpha", "alpha", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "wild_sdf_alpha(wild_element_distance())"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "element_inner_mask",
            "Inset Element Mask",
            "Base Shape",
            206.0F,
            List.of(NUuvnUuVU.input("inset", "inset", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("mask", "distance", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "wild_element_distance_inset(" + var0.UuUVuuUu(var1, "inset") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "glass_surface",
            "Mica Glass Surface",
            "Material",
            214.0F,
            List.of(
               NUuvnUuVU.input("mask", "mask", nnNVVnNnnV.FLOAT, "wild_element_distance()"),
               NUuvnUuVU.input("tint", "tint", nnNVVnNnnV.VEC4, "u_ThemeColors[0]"),
               NUuvnUuVU.input("opacity", "opacity", nnNVVnNnnV.FLOAT, "0.58"),
               NUuvnUuVU.input("grain", "grain", nnNVVnNnnV.FLOAT, "0.045")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "wild_glass_surface("
               + var0.UuUVuuUu(var1, "mask")
               + ", "
               + var0.UuUVuuUu(var1, "tint")
               + ", "
               + var0.UuUVuuUu(var1, "opacity")
               + ", "
               + var0.UuUVuuUu(var1, "grain")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "rim_light",
            "Rim Light",
            "Material",
            196.0F,
            List.of(
               NUuvnUuVU.input("mask", "mask", nnNVVnNnnV.FLOAT, "wild_element_distance()"),
               NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(u_AccentTop, 1.0)"),
               NUuvnUuVU.input("thickness", "width", nnNVVnNnnV.FLOAT, "1.0"),
               NUuvnUuVU.input("intensity", "power", nnNVVnNnnV.FLOAT, "0.18")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "wild_rim_light("
               + var0.UuUVuuUu(var1, "mask")
               + ", "
               + var0.UuUVuuUu(var1, "color")
               + ", "
               + var0.UuUVuuUu(var1, "thickness")
               + ", "
               + var0.UuUVuuUu(var1, "intensity")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "hover_glow",
            "Magnetic Hover Glow",
            "Material",
            220.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "normalizedUv"),
               NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(u_AccentBottom, 1.0)"),
               NUuvnUuVU.input("radius", "radius", nnNVVnNnnV.FLOAT, "0.42"),
               NUuvnUuVU.input("intensity", "power", nnNVVnNnnV.FLOAT, "0.58")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "wild_hover_glow("
               + var0.UuUVuuUu(var1, "uv")
               + ", "
               + var0.UuUVuuUu(var1, "color")
               + ", "
               + var0.UuUVuuUu(var1, "radius")
               + ", "
               + var0.UuUVuuUu(var1, "intensity")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "inner_shadow",
            "Inner Shadow",
            "Material",
            198.0F,
            List.of(
               NUuvnUuVU.input("mask", "mask", nnNVVnNnnV.FLOAT, "wild_element_distance()"),
               NUuvnUuVU.input("strength", "power", nnNVVnNnnV.FLOAT, "0.22"),
               NUuvnUuVU.input("width", "width", nnNVVnNnnV.FLOAT, "12.0")
            ),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "wild_inner_shadow("
               + var0.UuUVuuUu(var1, "mask")
               + ", "
               + var0.UuUVuuUu(var1, "strength")
               + ", "
               + var0.UuUVuuUu(var1, "width")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "exposure_lift",
            "Photographic Exposure",
            "Material",
            226.0F,
            List.of(
               NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "u_ThemeColors[0]"),
               NUuvnUuVU.input("amount", "amount", nnNVVnNnnV.FLOAT, "0.18"),
               NUuvnUuVU.input("decay", "decay", nnNVVnNnnV.FLOAT, "2.0")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "wild_exposure_lift("
               + var0.UuUVuuUu(var1, "color")
               + ", "
               + var0.UuUVuuUu(var1, "amount")
               + ", "
               + var0.UuUVuuUu(var1, "decay")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "alpha_blend",
            "Alpha Blend",
            "Blend",
            190.0F,
            List.of(NUuvnUuVU.input("base", "base", nnNVVnNnnV.VEC4, "vec4(0.0)"), NUuvnUuVU.input("layer", "layer", nnNVVnNnnV.VEC4, "vec4(1.0)")),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "wild_alpha_over(" + var0.UuUVuuUu(var1, "base") + ", " + var0.UuUVuuUu(var1, "layer") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "color_ramp",
            "Color Ramp",
            "Color",
            184.0F,
            List.of(
               NUuvnUuVU.input("t", "t", nnNVVnNnnV.FLOAT, "0.5"),
               NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC4, "vec4(u_AccentBottom, 1.0)"),
               NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC4, "vec4(u_AccentTop, 1.0)")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "mix(" + var0.UuUVuuUu(var1, "a") + ", " + var0.UuUVuuUu(var1, "b") + ", wild_sat(" + var0.UuUVuuUu(var1, "t") + "))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "color_multiply_scalar",
            "Color Multiply",
            "Color",
            198.0F,
            List.of(NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(1.0)"), NUuvnUuVU.input("factor", "factor", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(("
               + var0.UuUVuuUu(var1, "color")
               + ").rgb * "
               + var0.UuUVuuUu(var1, "factor")
               + ", ("
               + var0.UuUVuuUu(var1, "color")
               + ").a)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "blend_screen",
            "Screen Blend",
            "Blend",
            188.0F,
            List.of(
               NUuvnUuVU.input("base", "base", nnNVVnNnnV.VEC4, "vec4(0.02, 0.022, 0.028, 1.0)"),
               NUuvnUuVU.input("layer", "layer", nnNVVnNnnV.VEC4, "vec4(u_AccentTop, 1.0)"),
               NUuvnUuVU.input("opacity", "opacity", nnNVVnNnnV.FLOAT, "0.5")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "wild_blend_screen("
               + var0.UuUVuuUu(var1, "base")
               + ", "
               + var0.UuUVuuUu(var1, "layer")
               + ", "
               + var0.UuUVuuUu(var1, "opacity")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "blend_overlay",
            "Overlay Blend",
            "Blend",
            188.0F,
            List.of(
               NUuvnUuVU.input("base", "base", nnNVVnNnnV.VEC4, "vec4(0.02, 0.022, 0.028, 1.0)"),
               NUuvnUuVU.input("layer", "layer", nnNVVnNnnV.VEC4, "vec4(u_AccentBottom, 1.0)"),
               NUuvnUuVU.input("opacity", "opacity", nnNVVnNnnV.FLOAT, "0.5")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "wild_blend_overlay("
               + var0.UuUVuuUu(var1, "base")
               + ", "
               + var0.UuUVuuUu(var1, "layer")
               + ", "
               + var0.UuUVuuUu(var1, "opacity")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "sdf_circle",
            "SDF Circle",
            "SDF",
            184.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "uv"),
               NUuvnUuVU.input("center", "center", nnNVVnNnnV.VEC2, "vec2(0.0)"),
               NUuvnUuVU.input("radius", "radius", nnNVVnNnnV.FLOAT, "0.25"),
               NUuvnUuVU.input("softness", "soft", nnNVVnNnnV.FLOAT, "0.08")
            ),
            List.of(NUuvnUuVU.output("mask", "distance", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> var0.C00OOC00oO()
               ? "wild_sdf_circle("
                  + var0.UuUVuuUu(var1, "uv")
                  + ", ("
                  + var0.UuUVuuUu(var1, "center")
                  + ") * (u_ElementRect.zw * 0.5), ("
                  + var0.UuUVuuUu(var1, "radius")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5, "
                  + var0.UuUVuuUu(var1, "softness")
                  + ")"
               : "wild_sdf_circle("
                  + var0.UuUVuuUu(var1, "uv")
                  + ", "
                  + var0.UuUVuuUu(var1, "center")
                  + ", "
                  + var0.UuUVuuUu(var1, "radius")
                  + ", "
                  + var0.UuUVuuUu(var1, "softness")
                  + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "sdf_round_box",
            "SDF Rounded Box",
            "SDF",
            196.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "uv"),
               NUuvnUuVU.input("center", "center", nnNVVnNnnV.VEC2, "vec2(0.0)"),
               NUuvnUuVU.input("size", "size", nnNVVnNnnV.VEC2, "vec2(0.95, 0.32)"),
               NUuvnUuVU.input("radius", "radius", nnNVVnNnnV.FLOAT, "0.08"),
               NUuvnUuVU.input("softness", "soft", nnNVVnNnnV.FLOAT, "0.06")
            ),
            List.of(NUuvnUuVU.output("mask", "distance", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> var0.C00OOC00oO()
               ? "wild_sdf_round_box("
                  + var0.UuUVuuUu(var1, "uv")
                  + ", ("
                  + var0.UuUVuuUu(var1, "center")
                  + ") * (u_ElementRect.zw * 0.5), ("
                  + var0.UuUVuuUu(var1, "size")
                  + ") * (u_ElementRect.zw * 0.5), ("
                  + var0.UuUVuuUu(var1, "radius")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5, "
                  + var0.UuUVuuUu(var1, "softness")
                  + ")"
               : "wild_sdf_round_box("
                  + var0.UuUVuuUu(var1, "uv")
                  + ", "
                  + var0.UuUVuuUu(var1, "center")
                  + ", "
                  + var0.UuUVuuUu(var1, "size")
                  + ", "
                  + var0.UuUVuuUu(var1, "radius")
                  + ", "
                  + var0.UuUVuuUu(var1, "softness")
                  + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "simplex_noise_3d",
            "Simplex Noise 3D",
            "Generator",
            202.0F,
            List.of(
               NUuvnUuVU.input("p", "p", nnNVVnNnnV.VEC3, "vec3(globalUv * 2.0, u_Time * 0.08)"), NUuvnUuVU.input("scale", "scale", nnNVVnNnnV.FLOAT, "3.0")
            ),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "(0.5 + 0.5 * wild_simplex3(" + var0.UuUVuuUu(var1, "p") + " * " + var0.UuUVuuUu(var1, "scale") + "))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "voronoi",
            "Voronoi",
            "Generator",
            190.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "globalUv"),
               NUuvnUuVU.input("scale", "scale", nnNVVnNnnV.FLOAT, "7.0"),
               NUuvnUuVU.input("time", "time", nnNVVnNnnV.FLOAT, "u_Time")
            ),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "wild_voronoi(" + var0.UuUVuuUu(var1, "uv") + " * " + var0.UuUVuuUu(var1, "scale") + ", " + var0.UuUVuuUu(var1, "time") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "chromatic_aberration",
            "Chromatic Aberration",
            "VFX",
            218.0F,
            List.of(
               NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(u_AccentTop, 1.0)"),
               NUuvnUuVU.input("amount", "amount", nnNVVnNnnV.FLOAT, "0.08"),
               NUuvnUuVU.input("phase", "phase", nnNVVnNnnV.FLOAT, "u_Time")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "wild_chromatic("
               + var0.UuUVuuUu(var1, "color")
               + ", vUv, "
               + var0.UuUVuuUu(var1, "amount")
               + ", "
               + var0.UuUVuuUu(var1, "phase")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "output_color",
            "Master Output",
            "Output",
            184.0F,
            List.of(
               NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(0.02, 0.022, 0.028, 1.0)"), NUuvnUuVU.input("alpha", "alpha", nnNVVnNnnV.FLOAT, "1.0")
            ),
            List.of(),
            (var0, var1, var2) -> "vec4(("
               + var0.UuUVuuUu(var1, "color")
               + ").rgb, ("
               + var0.UuUVuuUu(var1, "color")
               + ").a * "
               + var0.UuUVuuUu(var1, "alpha")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "sdf_triangle",
            "SDF Triangle",
            "SDF",
            196.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "uv"),
               NUuvnUuVU.input("center", "center", nnNVVnNnnV.VEC2, "vec2(0.0)"),
               NUuvnUuVU.input("radius", "radius", nnNVVnNnnV.FLOAT, "0.35"),
               NUuvnUuVU.input("softness", "soft", nnNVVnNnnV.FLOAT, "0.05")
            ),
            List.of(NUuvnUuVU.output("mask", "distance", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> var0.C00OOC00oO()
               ? "wild_sdf_triangle("
                  + var0.UuUVuuUu(var1, "uv")
                  + ", ("
                  + var0.UuUVuuUu(var1, "center")
                  + ") * (u_ElementRect.zw * 0.5), ("
                  + var0.UuUVuuUu(var1, "radius")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5, "
                  + var0.UuUVuuUu(var1, "softness")
                  + ")"
               : "wild_sdf_triangle("
                  + var0.UuUVuuUu(var1, "uv")
                  + ", "
                  + var0.UuUVuuUu(var1, "center")
                  + ", "
                  + var0.UuUVuuUu(var1, "radius")
                  + ", "
                  + var0.UuUVuuUu(var1, "softness")
                  + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "sdf_hex",
            "SDF Hexagon",
            "SDF",
            196.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "uv"),
               NUuvnUuVU.input("center", "center", nnNVVnNnnV.VEC2, "vec2(0.0)"),
               NUuvnUuVU.input("radius", "radius", nnNVVnNnnV.FLOAT, "0.28"),
               NUuvnUuVU.input("softness", "soft", nnNVVnNnnV.FLOAT, "0.05")
            ),
            List.of(NUuvnUuVU.output("mask", "distance", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> var0.C00OOC00oO()
               ? "wild_sdf_hex("
                  + var0.UuUVuuUu(var1, "uv")
                  + ", ("
                  + var0.UuUVuuUu(var1, "center")
                  + ") * (u_ElementRect.zw * 0.5), ("
                  + var0.UuUVuuUu(var1, "radius")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5, "
                  + var0.UuUVuuUu(var1, "softness")
                  + ")"
               : "wild_sdf_hex("
                  + var0.UuUVuuUu(var1, "uv")
                  + ", "
                  + var0.UuUVuuUu(var1, "center")
                  + ", "
                  + var0.UuUVuuUu(var1, "radius")
                  + ", "
                  + var0.UuUVuuUu(var1, "softness")
                  + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "fbm_noise",
            "FBM Noise",
            "Generator",
            196.0F,
            List.of(
               NUuvnUuVU.input("p", "p", nnNVVnNnnV.VEC3, "vec3(globalUv * 3.0, u_Time * 0.12)"),
               NUuvnUuVU.input("octaves", "oct", nnNVVnNnnV.FLOAT, "5.0"),
               NUuvnUuVU.input("scale", "scale", nnNVVnNnnV.FLOAT, "1.8")
            ),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "wild_fbm("
               + var0.UuUVuuUu(var1, "p")
               + " * "
               + var0.UuUVuuUu(var1, "scale")
               + ", int(clamp("
               + var0.UuUVuuUu(var1, "octaves")
               + ", 1.0, 8.0)))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "polar_uv",
            "Polar UV",
            "Coords",
            184.0F,
            List.of(NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "vUv"), NUuvnUuVU.input("center", "center", nnNVVnNnnV.VEC2, "vec2(0.5)")),
            List.of(NUuvnUuVU.output("uv", "uv", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "wild_polar(" + var0.UuUVuuUu(var1, "uv") + ", " + var0.UuUVuuUu(var1, "center") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "rotate_uv",
            "Rotate UV",
            "Coords",
            186.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "vUv"),
               NUuvnUuVU.input("center", "center", nnNVVnNnnV.VEC2, "vec2(0.5)"),
               NUuvnUuVU.input("angle", "angle", nnNVVnNnnV.FLOAT, "u_Time")
            ),
            List.of(NUuvnUuVU.output("uv", "uv", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "wild_rotate_uv("
               + var0.UuUVuuUu(var1, "uv")
               + ", "
               + var0.UuUVuuUu(var1, "center")
               + ", "
               + var0.UuUVuuUu(var1, "angle")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "twist_uv",
            "Twist UV",
            "Coords",
            196.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "vUv"),
               NUuvnUuVU.input("center", "center", nnNVVnNnnV.VEC2, "vec2(0.5)"),
               NUuvnUuVU.input("strength", "strength", nnNVVnNnnV.FLOAT, "2.6")
            ),
            List.of(NUuvnUuVU.output("uv", "uv", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "wild_twist_uv("
               + var0.UuUVuuUu(var1, "uv")
               + ", "
               + var0.UuUVuuUu(var1, "center")
               + ", "
               + var0.UuUVuuUu(var1, "strength")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vignette",
            "Vignette",
            "VFX",
            196.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "vUv"),
               NUuvnUuVU.input("intensity", "intensity", nnNVVnNnnV.FLOAT, "1.0"),
               NUuvnUuVU.input("falloff", "falloff", nnNVVnNnnV.FLOAT, "0.5")
            ),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "wild_vignette("
               + var0.UuUVuuUu(var1, "uv")
               + ", "
               + var0.UuUVuuUu(var1, "intensity")
               + ", "
               + var0.UuUVuuUu(var1, "falloff")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "posterize",
            "Posterize",
            "VFX",
            196.0F,
            List.of(NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(0.5)"), NUuvnUuVU.input("steps", "steps", nnNVVnNnnV.FLOAT, "6.0")),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(floor("
               + var0.UuUVuuUu(var1, "color")
               + ".rgb * max("
               + var0.UuUVuuUu(var1, "steps")
               + ", 1.0)) / max("
               + var0.UuUVuuUu(var1, "steps")
               + ", 1.0), "
               + var0.UuUVuuUu(var1, "color")
               + ".a)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "bloom_lift",
            "Bloom Lift",
            "VFX",
            196.0F,
            List.of(
               NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(0.5)"),
               NUuvnUuVU.input("threshold", "threshold", nnNVVnNnnV.FLOAT, "0.6"),
               NUuvnUuVU.input("amount", "amount", nnNVVnNnnV.FLOAT, "1.2")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "wild_bloom_lift("
               + var0.UuUVuuUu(var1, "color")
               + ", "
               + var0.UuUVuuUu(var1, "threshold")
               + ", "
               + var0.UuUVuuUu(var1, "amount")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "color_pulse",
            "Color Pulse",
            "Color",
            196.0F,
            List.of(
               NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC4, "vec4(u_AccentBottom, 1.0)"),
               NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC4, "vec4(u_AccentTop, 1.0)"),
               NUuvnUuVU.input("speed", "speed", nnNVVnNnnV.FLOAT, "1.0")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "mix("
               + var0.UuUVuuUu(var1, "a")
               + ", "
               + var0.UuUVuuUu(var1, "b")
               + ", 0.5 + 0.5 * sin(u_Time * "
               + var0.UuUVuuUu(var1, "speed")
               + "))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "color_screen_split",
            "Channel Split",
            "Color",
            196.0F,
            List.of(NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(0.5)"), NUuvnUuVU.input("amount", "amount", nnNVVnNnnV.FLOAT, "0.04")),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "wild_channel_split(" + var0.UuUVuuUu(var1, "color") + ", " + var0.UuUVuuUu(var1, "amount") + ", u_Time)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "fresnel",
            "Fresnel Rim",
            "VFX",
            196.0F,
            List.of(NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "vUv"), NUuvnUuVU.input("power", "power", nnNVVnNnnV.FLOAT, "3.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "pow(max(1.0 - 2.0 * length("
               + var0.UuUVuuUu(var1, "uv")
               + " - 0.5), 0.0), max("
               + var0.UuUVuuUu(var1, "power")
               + ", 0.001))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "step_threshold",
            "Step Threshold",
            "Math",
            184.0F,
            List.of(NUuvnUuVU.input("edge", "edge", nnNVVnNnnV.FLOAT, "0.5"), NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.5")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "step(" + var0.UuUVuuUu(var1, "edge") + ", " + var0.UuUVuuUu(var1, "x") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "fract_node",
            "Fract",
            "Math",
            174.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "fract(" + var0.UuUVuuUu(var1, "x") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "abs_node",
            "Abs",
            "Math",
            168.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "abs(" + var0.UuUVuuUu(var1, "x") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "saturate_node",
            "Saturate",
            "Math",
            174.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "clamp(" + var0.UuUVuuUu(var1, "x") + ", 0.0, 1.0)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "blend_multiply",
            "Multiply Blend",
            "Blend",
            196.0F,
            List.of(
               NUuvnUuVU.input("base", "base", nnNVVnNnnV.VEC4, "vec4(0.02, 0.022, 0.028, 1.0)"),
               NUuvnUuVU.input("layer", "layer", nnNVVnNnnV.VEC4, "vec4(u_AccentTop, 1.0)"),
               NUuvnUuVU.input("opacity", "opacity", nnNVVnNnnV.FLOAT, "0.5")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(mix("
               + var0.UuUVuuUu(var1, "base")
               + ".rgb, "
               + var0.UuUVuuUu(var1, "base")
               + ".rgb * "
               + var0.UuUVuuUu(var1, "layer")
               + ".rgb, clamp("
               + var0.UuUVuuUu(var1, "opacity")
               + ", 0.0, 1.0)), max("
               + var0.UuUVuuUu(var1, "base")
               + ".a, "
               + var0.UuUVuuUu(var1, "layer")
               + ".a))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "blend_add",
            "Additive Blend",
            "Blend",
            196.0F,
            List.of(
               NUuvnUuVU.input("base", "base", nnNVVnNnnV.VEC4, "vec4(0.02, 0.022, 0.028, 1.0)"),
               NUuvnUuVU.input("layer", "layer", nnNVVnNnnV.VEC4, "vec4(u_AccentTop, 1.0)"),
               NUuvnUuVU.input("opacity", "opacity", nnNVVnNnnV.FLOAT, "0.5")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(clamp("
               + var0.UuUVuuUu(var1, "base")
               + ".rgb + "
               + var0.UuUVuuUu(var1, "layer")
               + ".rgb * clamp("
               + var0.UuUVuuUu(var1, "opacity")
               + ", 0.0, 1.0), 0.0, 1.0), max("
               + var0.UuUVuuUu(var1, "base")
               + ".a, "
               + var0.UuUVuuUu(var1, "layer")
               + ".a))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "iridescence",
            "Iridescence",
            "Color",
            200.0F,
            List.of(NUuvnUuVU.input("t", "t", nnNVVnNnnV.FLOAT, "0.5"), NUuvnUuVU.input("speed", "speed", nnNVVnNnnV.FLOAT, "0.8")),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "wild_iridescence(" + var0.UuUVuuUu(var1, "t") + ", " + var0.UuUVuuUu(var1, "speed") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "sdf_union",
            "SDF Union",
            "SDF Booleans",
            196.0F,
            List.of(
               NUuvnUuVU.input("a", "a", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("b", "b", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("smoothness", "smooth", nnNVVnNnnV.FLOAT, "0.05")
            ),
            List.of(NUuvnUuVU.output("mask", "distance", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> var0.C00OOC00oO()
               ? "wild_sdf_union("
                  + var0.UuUVuuUu(var1, "a")
                  + ", "
                  + var0.UuUVuuUu(var1, "b")
                  + ", ("
                  + var0.UuUVuuUu(var1, "smoothness")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5)"
               : "wild_sdf_union(" + var0.UuUVuuUu(var1, "a") + ", " + var0.UuUVuuUu(var1, "b") + ", " + var0.UuUVuuUu(var1, "smoothness") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "sdf_subtract",
            "SDF Subtract",
            "SDF Booleans",
            200.0F,
            List.of(
               NUuvnUuVU.input("a", "a", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("b", "b", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("smoothness", "smooth", nnNVVnNnnV.FLOAT, "0.05")
            ),
            List.of(NUuvnUuVU.output("mask", "distance", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> var0.C00OOC00oO()
               ? "wild_sdf_subtract("
                  + var0.UuUVuuUu(var1, "a")
                  + ", "
                  + var0.UuUVuuUu(var1, "b")
                  + ", ("
                  + var0.UuUVuuUu(var1, "smoothness")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5)"
               : "wild_sdf_subtract(" + var0.UuUVuuUu(var1, "a") + ", " + var0.UuUVuuUu(var1, "b") + ", " + var0.UuUVuuUu(var1, "smoothness") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "sdf_intersect",
            "SDF Intersect",
            "SDF Booleans",
            204.0F,
            List.of(
               NUuvnUuVU.input("a", "a", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("b", "b", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("smoothness", "smooth", nnNVVnNnnV.FLOAT, "0.05")
            ),
            List.of(NUuvnUuVU.output("mask", "distance", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> var0.C00OOC00oO()
               ? "wild_sdf_intersect("
                  + var0.UuUVuuUu(var1, "a")
                  + ", "
                  + var0.UuUVuuUu(var1, "b")
                  + ", ("
                  + var0.UuUVuuUu(var1, "smoothness")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5)"
               : "wild_sdf_intersect(" + var0.UuUVuuUu(var1, "a") + ", " + var0.UuUVuuUu(var1, "b") + ", " + var0.UuUVuuUu(var1, "smoothness") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "sdf_star",
            "SDF Star",
            "SDF",
            198.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "uv"),
               NUuvnUuVU.input("center", "center", nnNVVnNnnV.VEC2, "vec2(0.0)"),
               NUuvnUuVU.input("radius", "radius", nnNVVnNnnV.FLOAT, "0.32"),
               NUuvnUuVU.input("points", "points", nnNVVnNnnV.FLOAT, "5.0"),
               NUuvnUuVU.input("softness", "soft", nnNVVnNnnV.FLOAT, "0.05")
            ),
            List.of(NUuvnUuVU.output("mask", "distance", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> var0.C00OOC00oO()
               ? "wild_sdf_star("
                  + var0.UuUVuuUu(var1, "uv")
                  + ", ("
                  + var0.UuUVuuUu(var1, "center")
                  + ") * (u_ElementRect.zw * 0.5), ("
                  + var0.UuUVuuUu(var1, "radius")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5, "
                  + var0.UuUVuuUu(var1, "points")
                  + ", "
                  + var0.UuUVuuUu(var1, "softness")
                  + ")"
               : "wild_sdf_star("
                  + var0.UuUVuuUu(var1, "uv")
                  + ", "
                  + var0.UuUVuuUu(var1, "center")
                  + ", "
                  + var0.UuUVuuUu(var1, "radius")
                  + ", "
                  + var0.UuUVuuUu(var1, "points")
                  + ", "
                  + var0.UuUVuuUu(var1, "softness")
                  + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_remap",
            "Remap",
            "Math",
            196.0F,
            List.of(
               NUuvnUuVU.input("v", "v", nnNVVnNnnV.FLOAT, "0.5"),
               NUuvnUuVU.input("inMin", "inMin", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("inMax", "inMax", nnNVVnNnnV.FLOAT, "1.0"),
               NUuvnUuVU.input("outMin", "outMin", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("outMax", "outMax", nnNVVnNnnV.FLOAT, "1.0")
            ),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "wild_remap("
               + var0.UuUVuuUu(var1, "v")
               + ", "
               + var0.UuUVuuUu(var1, "inMin")
               + ", "
               + var0.UuUVuuUu(var1, "inMax")
               + ", "
               + var0.UuUVuuUu(var1, "outMin")
               + ", "
               + var0.UuUVuuUu(var1, "outMax")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_clamp",
            "Clamp",
            "Math",
            184.0F,
            List.of(
               NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.5"),
               NUuvnUuVU.input("min", "min", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("max", "max", nnNVVnNnnV.FLOAT, "1.0")
            ),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "clamp(" + var0.UuUVuuUu(var1, "x") + ", " + var0.UuUVuuUu(var1, "min") + ", " + var0.UuUVuuUu(var1, "max") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_floor",
            "Floor",
            "Math",
            168.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "floor(" + var0.UuUVuuUu(var1, "x") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_ceil",
            "Ceil",
            "Math",
            168.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "ceil(" + var0.UuUVuuUu(var1, "x") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_length",
            "Length",
            "Math",
            184.0F,
            List.of(NUuvnUuVU.input("v", "v", nnNVVnNnnV.VEC2, "vUv - 0.5")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "length(" + var0.UuUVuuUu(var1, "v") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_distance",
            "Distance",
            "Math",
            192.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC2, "vUv"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC2, "vec2(0.5)")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "distance(" + var0.UuUVuuUu(var1, "a") + ", " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_power",
            "Power",
            "Math",
            192.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.5"), NUuvnUuVU.input("y", "y", nnNVVnNnnV.FLOAT, "2.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "pow(max(" + var0.UuUVuuUu(var1, "x") + ", 0.0), " + var0.UuUVuuUu(var1, "y") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_mod",
            "Mod",
            "Math",
            188.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0"), NUuvnUuVU.input("y", "y", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "mod("
               + var0.UuUVuuUu(var1, "x")
               + ", (abs("
               + var0.UuUVuuUu(var1, "y")
               + ") < 1e-5 ? 1e-5 : "
               + var0.UuUVuuUu(var1, "y")
               + "))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_dot",
            "Dot",
            "Math",
            188.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC2, "vUv"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC2, "vec2(1.0)")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "dot(" + var0.UuUVuuUu(var1, "a") + ", " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_subtract",
            "Subtract",
            "Math",
            184.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.FLOAT, "0.0"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "a") + " - " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_divide",
            "Divide",
            "Math",
            184.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.FLOAT, "1.0"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "a") + " / max(" + var0.UuUVuuUu(var1, "b") + ", 1e-5))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "color_gradient_map",
            "Gradient Map",
            "Color",
            220.0F,
            List.of(
               NUuvnUuVU.input("t", "t", nnNVVnNnnV.FLOAT, "0.5"),
               NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC4, "vec4(u_AccentBottom, 1.0)"),
               NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC4, "vec4(u_AccentTop, 1.0)"),
               NUuvnUuVU.input("c", "c", nnNVVnNnnV.VEC4, "vec4(1.0)")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "wild_gradient_map("
               + var0.UuUVuuUu(var1, "t")
               + ", "
               + var0.UuUVuuUu(var1, "a")
               + ", "
               + var0.UuUVuuUu(var1, "b")
               + ", "
               + var0.UuUVuuUu(var1, "c")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "color_desaturate",
            "Desaturate",
            "Color",
            192.0F,
            List.of(NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(1.0)"), NUuvnUuVU.input("amount", "amount", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(wild_desaturate("
               + var0.UuUVuuUu(var1, "color")
               + ".rgb, "
               + var0.UuUVuuUu(var1, "amount")
               + "), "
               + var0.UuUVuuUu(var1, "color")
               + ".a)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "color_invert",
            "Invert",
            "Color",
            188.0F,
            List.of(NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(0.5)"), NUuvnUuVU.input("amount", "amount", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(wild_invert("
               + var0.UuUVuuUu(var1, "color")
               + ".rgb, "
               + var0.UuUVuuUu(var1, "amount")
               + "), "
               + var0.UuUVuuUu(var1, "color")
               + ".a)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "color_hsv",
            "HSV → RGB",
            "Color",
            196.0F,
            List.of(
               NUuvnUuVU.input("h", "hue", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("s", "sat", nnNVVnNnnV.FLOAT, "1.0"),
               NUuvnUuVU.input("v", "val", nnNVVnNnnV.FLOAT, "1.0")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(wild_hsv2rgb(vec3("
               + var0.UuUVuuUu(var1, "h")
               + ", "
               + var0.UuUVuuUu(var1, "s")
               + ", "
               + var0.UuUVuuUu(var1, "v")
               + ")), 1.0)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "time_bpm",
            "BPM Sync",
            "Time",
            192.0F,
            List.of(NUuvnUuVU.input("bpm", "bpm", nnNVVnNnnV.FLOAT, "128.0"), NUuvnUuVU.input("strength", "shape", nnNVVnNnnV.FLOAT, "2.0")),
            List.of(NUuvnUuVU.output("pulse", "pulse", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "wild_bpm(" + var0.UuUVuuUu(var1, "bpm") + ", " + var0.UuUVuuUu(var1, "strength") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "time_pulse",
            "Pulse",
            "Time",
            184.0F,
            List.of(NUuvnUuVU.input("t", "t", nnNVVnNnnV.FLOAT, "u_Time"), NUuvnUuVU.input("duty", "duty", nnNVVnNnnV.FLOAT, "0.5")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "wild_pulse(" + var0.UuUVuuUu(var1, "t") + ", " + var0.UuUVuuUu(var1, "duty") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_view_dir",
            "View Direction",
            "Inputs",
            178.0F,
            List.of(),
            List.of(NUuvnUuVU.output("dir", "dir", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "wild_view_dir(vUv)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_normal",
            "Normal (UV slope)",
            "Inputs",
            192.0F,
            List.of(NUuvnUuVU.input("strength", "strength", nnNVVnNnnV.FLOAT, "4.0")),
            List.of(NUuvnUuVU.output("normal", "normal", nnNVVnNnnV.VEC3)),
            (var0, var1, var2) -> "wild_normal_from_uv(vUv, " + var0.UuUVuuUu(var1, "strength") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_resolution",
            "Resolution",
            "Inputs",
            178.0F,
            List.of(),
            List.of(NUuvnUuVU.output("res", "res", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "u_Resolution"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "input_alpha", "Alpha", "Inputs", 178.0F, List.of(), List.of(NUuvnUuVU.output("alpha", "alpha", nnNVVnNnnV.FLOAT)), (var0, var1, var2) -> "u_Alpha"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec2_split",
            "Split Vec2",
            "Math",
            188.0F,
            List.of(NUuvnUuVU.input("v", "v", nnNVVnNnnV.VEC2, "vUv")),
            List.of(NUuvnUuVU.output("x", "x", nnNVVnNnnV.FLOAT), NUuvnUuVU.output("y", "y", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "x".equals(var2) ? "(" + var0.UuUVuuUu(var1, "v") + ").x" : "(" + var0.UuUVuuUu(var1, "v") + ").y"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_max",
            "Max",
            "Math",
            184.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.FLOAT, "0.0"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "max(" + var0.UuUVuuUu(var1, "a") + ", " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_min",
            "Min",
            "Math",
            184.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.FLOAT, "0.0"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "min(" + var0.UuUVuuUu(var1, "a") + ", " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_sign",
            "Sign",
            "Math",
            172.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "sign(" + var0.UuUVuuUu(var1, "x") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_sqrt",
            "Square Root",
            "Math",
            178.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "sqrt(max(" + var0.UuUVuuUu(var1, "x") + ", 0.0))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_exp",
            "Exp",
            "Math",
            172.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "exp(" + var0.UuUVuuUu(var1, "x") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_log",
            "Log",
            "Math",
            172.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "log(max(" + var0.UuUVuuUu(var1, "x") + ", 1e-6))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_one_minus",
            "One Minus",
            "Math",
            178.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "(1.0 - " + var0.UuUVuuUu(var1, "x") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_reciprocal",
            "Reciprocal",
            "Math",
            184.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "(1.0 / (abs(" + var0.UuUVuuUu(var1, "x") + ") < 1e-5 ? 1e-5 : " + var0.UuUVuuUu(var1, "x") + "))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_round",
            "Round",
            "Math",
            172.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "floor(" + var0.UuUVuuUu(var1, "x") + " + 0.5)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_cos",
            "Cosine",
            "Math",
            172.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0"), NUuvnUuVU.input("freq", "freq", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "cos((" + var0.UuUVuuUu(var1, "x") + ") * (" + var0.UuUVuuUu(var1, "freq") + "))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_sin_raw",
            "Sine Raw",
            "Math",
            178.0F,
            List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0"), NUuvnUuVU.input("freq", "freq", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "sin((" + var0.UuUVuuUu(var1, "x") + ") * (" + var0.UuUVuuUu(var1, "freq") + "))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "math_atan2",
            "Atan2",
            "Math",
            178.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.FLOAT, "1.0"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "atan(" + var0.UuUVuuUu(var1, "a") + ", " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec_add3",
            "Add Vec3",
            "Vector",
            178.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC3, "vec3(0.0)"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC3, "vec3(0.0)")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC3)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "a") + " + " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec_sub3",
            "Subtract Vec3",
            "Vector",
            190.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC3, "vec3(0.0)"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC3, "vec3(0.0)")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC3)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "a") + " - " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec_mul3",
            "Multiply Vec3",
            "Vector",
            190.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC3, "vec3(1.0)"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC3, "vec3(1.0)")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC3)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "a") + " * " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec_scale3",
            "Scale Vec3",
            "Vector",
            184.0F,
            List.of(NUuvnUuVU.input("v", "v", nnNVVnNnnV.VEC3, "vec3(1.0)"), NUuvnUuVU.input("s", "s", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC3)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "v") + " * " + var0.UuUVuuUu(var1, "s") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec_normalize",
            "Normalize",
            "Vector",
            184.0F,
            List.of(NUuvnUuVU.input("v", "v", nnNVVnNnnV.VEC3, "vec3(0.0,0.0,1.0)")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC3)),
            (var0, var1, var2) -> "normalize(" + var0.UuUVuuUu(var1, "v") + " + 1e-6)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec_cross",
            "Cross",
            "Vector",
            178.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC3, "vec3(0.0)"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC3, "vec3(0.0)")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC3)),
            (var0, var1, var2) -> "cross(" + var0.UuUVuuUu(var1, "a") + ", " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec_reflect",
            "Reflect",
            "Vector",
            184.0F,
            List.of(NUuvnUuVU.input("i", "i", nnNVVnNnnV.VEC3, "vec3(0.0,0.0,-1.0)"), NUuvnUuVU.input("n", "n", nnNVVnNnnV.VEC3, "vec3(0.0,0.0,1.0)")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC3)),
            (var0, var1, var2) -> "reflect(" + var0.UuUVuuUu(var1, "i") + ", normalize(" + var0.UuUVuuUu(var1, "n") + "))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec_dot3",
            "Dot Vec3",
            "Vector",
            178.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC3, "vec3(0.0)"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC3, "vec3(0.0)")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "dot(" + var0.UuUVuuUu(var1, "a") + ", " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec_lerp3",
            "Lerp Vec3",
            "Vector",
            184.0F,
            List.of(
               NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC3, "vec3(0.0)"),
               NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC3, "vec3(0.0)"),
               NUuvnUuVU.input("t", "t", nnNVVnNnnV.FLOAT, "0.5")
            ),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC3)),
            (var0, var1, var2) -> "mix(" + var0.UuUVuuUu(var1, "a") + ", " + var0.UuUVuuUu(var1, "b") + ", " + var0.UuUVuuUu(var1, "t") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec2_add",
            "Add Vec2",
            "Vector",
            178.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC2, "vec2(0.0)"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC2, "vec2(0.0)")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "a") + " + " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec2_mul",
            "Multiply Vec2",
            "Vector",
            190.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC2, "vec2(1.0)"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC2, "vec2(1.0)")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "a") + " * " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec4_add",
            "Add Vec4",
            "Vector",
            178.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC4, "vec4(0.0)"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC4, "vec4(0.0)")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "a") + " + " + var0.UuUVuuUu(var1, "b") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "vec4_scale",
            "Scale Vec4",
            "Vector",
            184.0F,
            List.of(NUuvnUuVU.input("v", "v", nnNVVnNnnV.VEC4, "vec4(1.0)"), NUuvnUuVU.input("s", "s", nnNVVnNnnV.FLOAT, "1.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "v") + " * " + var0.UuUVuuUu(var1, "s") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "combine_vec3",
            "Combine Vec3",
            "Vector",
            184.0F,
            List.of(
               NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("y", "y", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("z", "z", nnNVVnNnnV.FLOAT, "0.0")
            ),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC3)),
            (var0, var1, var2) -> "vec3(" + var0.UuUVuuUu(var1, "x") + ", " + var0.UuUVuuUu(var1, "y") + ", " + var0.UuUVuuUu(var1, "z") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "combine_vec4",
            "Combine Vec4",
            "Vector",
            190.0F,
            List.of(
               NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("y", "y", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("z", "z", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("w", "w", nnNVVnNnnV.FLOAT, "1.0")
            ),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4("
               + var0.UuUVuuUu(var1, "x")
               + ", "
               + var0.UuUVuuUu(var1, "y")
               + ", "
               + var0.UuUVuuUu(var1, "z")
               + ", "
               + var0.UuUVuuUu(var1, "w")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "split_vec3",
            "Split Vec3",
            "Vector",
            184.0F,
            List.of(NUuvnUuVU.input("v", "v", nnNVVnNnnV.VEC3, "vec3(0.0)")),
            List.of(NUuvnUuVU.output("x", "x", nnNVVnNnnV.FLOAT), NUuvnUuVU.output("y", "y", nnNVVnNnnV.FLOAT), NUuvnUuVU.output("z", "z", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "x".equals(var2)
               ? "(" + var0.UuUVuuUu(var1, "v") + ").x"
               : ("y".equals(var2) ? "(" + var0.UuUVuuUu(var1, "v") + ").y" : "(" + var0.UuUVuuUu(var1, "v") + ").z")
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "split_vec4",
            "Split Vec4",
            "Vector",
            190.0F,
            List.of(NUuvnUuVU.input("v", "v", nnNVVnNnnV.VEC4, "vec4(0.0)")),
            List.of(
               NUuvnUuVU.output("x", "x", nnNVVnNnnV.FLOAT),
               NUuvnUuVU.output("y", "y", nnNVVnNnnV.FLOAT),
               NUuvnUuVU.output("z", "z", nnNVVnNnnV.FLOAT),
               NUuvnUuVU.output("w", "w", nnNVVnNnnV.FLOAT)
            ),
            (var0, var1, var2) -> "x".equals(var2)
               ? "(" + var0.UuUVuuUu(var1, "v") + ").x"
               : (
                  "y".equals(var2)
                     ? "(" + var0.UuUVuuUu(var1, "v") + ").y"
                     : ("z".equals(var2) ? "(" + var0.UuUVuuUu(var1, "v") + ").z" : "(" + var0.UuUVuuUu(var1, "v") + ").w")
               )
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "uv_tiling_offset",
            "Tiling And Offset",
            "Coords",
            196.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "uv"),
               NUuvnUuVU.input("tiling", "tiling", nnNVVnNnnV.VEC2, "vec2(1.0)"),
               NUuvnUuVU.input("offset", "offset", nnNVVnNnnV.VEC2, "vec2(0.0)")
            ),
            List.of(NUuvnUuVU.output("uv", "uv", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "uv") + " * " + var0.UuUVuuUu(var1, "tiling") + " + " + var0.UuUVuuUu(var1, "offset") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "uv_panner",
            "Panner",
            "Coords",
            186.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "uv"),
               NUuvnUuVU.input("speed", "speed", nnNVVnNnnV.VEC2, "vec2(0.1)"),
               NUuvnUuVU.input("time", "time", nnNVVnNnnV.FLOAT, "u_Time")
            ),
            List.of(NUuvnUuVU.output("uv", "uv", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "(" + var0.UuUVuuUu(var1, "uv") + " + " + var0.UuUVuuUu(var1, "speed") + " * " + var0.UuUVuuUu(var1, "time") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "uv_radial_shear",
            "Radial Shear",
            "Coords",
            196.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "vUv"),
               NUuvnUuVU.input("center", "center", nnNVVnNnnV.VEC2, "vec2(0.5)"),
               NUuvnUuVU.input("strength", "strength", nnNVVnNnnV.FLOAT, "6.0")
            ),
            List.of(NUuvnUuVU.output("uv", "uv", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "wild_radial_shear("
               + var0.UuUVuuUu(var1, "uv")
               + ", "
               + var0.UuUVuuUu(var1, "center")
               + ", "
               + var0.UuUVuuUu(var1, "strength")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "uv_spherize",
            "Spherize",
            "Coords",
            190.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "vUv"),
               NUuvnUuVU.input("center", "center", nnNVVnNnnV.VEC2, "vec2(0.5)"),
               NUuvnUuVU.input("strength", "strength", nnNVVnNnnV.FLOAT, "0.5")
            ),
            List.of(NUuvnUuVU.output("uv", "uv", nnNVVnNnnV.VEC2)),
            (var0, var1, var2) -> "wild_spherize("
               + var0.UuUVuuUu(var1, "uv")
               + ", "
               + var0.UuUVuuUu(var1, "center")
               + ", "
               + var0.UuUVuuUu(var1, "strength")
               + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "checkerboard",
            "Checkerboard",
            "Generator",
            200.0F,
            List.of(
               NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "vUv"),
               NUuvnUuVU.input("freq", "freq", nnNVVnNnnV.VEC2, "vec2(6.0)"),
               NUuvnUuVU.input("a", "a", nnNVVnNnnV.VEC4, "vec4(0.05,0.05,0.06,1.0)"),
               NUuvnUuVU.input("b", "b", nnNVVnNnnV.VEC4, "vec4(u_AccentTop,1.0)")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "mix("
               + var0.UuUVuuUu(var1, "a")
               + ", "
               + var0.UuUVuuUu(var1, "b")
               + ", wild_checker("
               + var0.UuUVuuUu(var1, "uv")
               + ", "
               + var0.UuUVuuUu(var1, "freq")
               + "))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "simple_noise",
            "Simple Noise",
            "Generator",
            190.0F,
            List.of(NUuvnUuVU.input("uv", "uv", nnNVVnNnnV.VEC2, "globalUv"), NUuvnUuVU.input("scale", "scale", nnNVVnNnnV.FLOAT, "5.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "wild_gnoise2(" + var0.UuUVuuUu(var1, "uv") + " * " + var0.UuUVuuUu(var1, "scale") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "contrast",
            "Contrast",
            "Color",
            190.0F,
            List.of(NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(0.5)"), NUuvnUuVU.input("amount", "amount", nnNVVnNnnV.FLOAT, "1.2")),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(("
               + var0.UuUVuuUu(var1, "color")
               + ".rgb - 0.5) * "
               + var0.UuUVuuUu(var1, "amount")
               + " + 0.5, "
               + var0.UuUVuuUu(var1, "color")
               + ".a)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "saturation",
            "Saturation",
            "Color",
            190.0F,
            List.of(NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(0.5)"), NUuvnUuVU.input("amount", "amount", nnNVVnNnnV.FLOAT, "1.2")),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(mix(vec3(dot("
               + var0.UuUVuuUu(var1, "color")
               + ".rgb, vec3(0.299,0.587,0.114))), "
               + var0.UuUVuuUu(var1, "color")
               + ".rgb, "
               + var0.UuUVuuUu(var1, "amount")
               + "), "
               + var0.UuUVuuUu(var1, "color")
               + ".a)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "brightness",
            "Brightness",
            "Color",
            190.0F,
            List.of(NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(0.5)"), NUuvnUuVU.input("amount", "amount", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4("
               + var0.UuUVuuUu(var1, "color")
               + ".rgb + "
               + var0.UuUVuuUu(var1, "amount")
               + ", "
               + var0.UuUVuuUu(var1, "color")
               + ".a)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "hue_shift",
            "Hue Shift",
            "Color",
            190.0F,
            List.of(NUuvnUuVU.input("color", "color", nnNVVnNnnV.VEC4, "vec4(u_AccentTop,1.0)"), NUuvnUuVU.input("shift", "shift", nnNVVnNnnV.FLOAT, "0.1")),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(wild_hsv2rgb(vec3(fract(wild_rgb2hsv("
               + var0.UuUVuuUu(var1, "color")
               + ".rgb).x + "
               + var0.UuUVuuUu(var1, "shift")
               + "), wild_rgb2hsv("
               + var0.UuUVuuUu(var1, "color")
               + ".rgb).yz)), "
               + var0.UuUVuuUu(var1, "color")
               + ".a)"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "blend_lighten",
            "Lighten Blend",
            "Blend",
            196.0F,
            List.of(
               NUuvnUuVU.input("base", "base", nnNVVnNnnV.VEC4, "vec4(0.1)"),
               NUuvnUuVU.input("layer", "layer", nnNVVnNnnV.VEC4, "vec4(u_AccentTop,1.0)"),
               NUuvnUuVU.input("opacity", "opacity", nnNVVnNnnV.FLOAT, "1.0")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(mix("
               + var0.UuUVuuUu(var1, "base")
               + ".rgb, max("
               + var0.UuUVuuUu(var1, "base")
               + ".rgb, "
               + var0.UuUVuuUu(var1, "layer")
               + ".rgb), clamp("
               + var0.UuUVuuUu(var1, "opacity")
               + ",0.0,1.0)), max("
               + var0.UuUVuuUu(var1, "base")
               + ".a, "
               + var0.UuUVuuUu(var1, "layer")
               + ".a))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "blend_darken",
            "Darken Blend",
            "Blend",
            196.0F,
            List.of(
               NUuvnUuVU.input("base", "base", nnNVVnNnnV.VEC4, "vec4(0.1)"),
               NUuvnUuVU.input("layer", "layer", nnNVVnNnnV.VEC4, "vec4(u_AccentTop,1.0)"),
               NUuvnUuVU.input("opacity", "opacity", nnNVVnNnnV.FLOAT, "1.0")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(mix("
               + var0.UuUVuuUu(var1, "base")
               + ".rgb, min("
               + var0.UuUVuuUu(var1, "base")
               + ".rgb, "
               + var0.UuUVuuUu(var1, "layer")
               + ".rgb), clamp("
               + var0.UuUVuuUu(var1, "opacity")
               + ",0.0,1.0)), max("
               + var0.UuUVuuUu(var1, "base")
               + ".a, "
               + var0.UuUVuuUu(var1, "layer")
               + ".a))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "blend_difference",
            "Difference Blend",
            "Blend",
            200.0F,
            List.of(
               NUuvnUuVU.input("base", "base", nnNVVnNnnV.VEC4, "vec4(0.1)"),
               NUuvnUuVU.input("layer", "layer", nnNVVnNnnV.VEC4, "vec4(u_AccentTop,1.0)"),
               NUuvnUuVU.input("opacity", "opacity", nnNVVnNnnV.FLOAT, "1.0")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "vec4(mix("
               + var0.UuUVuuUu(var1, "base")
               + ".rgb, abs("
               + var0.UuUVuuUu(var1, "base")
               + ".rgb - "
               + var0.UuUVuuUu(var1, "layer")
               + ".rgb), clamp("
               + var0.UuUVuuUu(var1, "opacity")
               + ",0.0,1.0)), max("
               + var0.UuUVuuUu(var1, "base")
               + ".a, "
               + var0.UuUVuuUu(var1, "layer")
               + ".a))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "branch",
            "Branch",
            "Logic",
            190.0F,
            List.of(
               NUuvnUuVU.input("pred", "pred", nnNVVnNnnV.FLOAT, "0.0"),
               NUuvnUuVU.input("whenTrue", "true", nnNVVnNnnV.VEC4, "vec4(u_AccentTop,1.0)"),
               NUuvnUuVU.input("whenFalse", "false", nnNVVnNnnV.VEC4, "vec4(u_AccentBottom,1.0)")
            ),
            List.of(NUuvnUuVU.output("color", "color", nnNVVnNnnV.VEC4)),
            (var0, var1, var2) -> "mix("
               + var0.UuUVuuUu(var1, "whenFalse")
               + ", "
               + var0.UuUVuuUu(var1, "whenTrue")
               + ", step(0.5, "
               + var0.UuUVuuUu(var1, "pred")
               + "))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "compare_greater",
            "Greater Than",
            "Logic",
            196.0F,
            List.of(NUuvnUuVU.input("a", "a", nnNVVnNnnV.FLOAT, "0.5"), NUuvnUuVU.input("b", "b", nnNVVnNnnV.FLOAT, "0.0")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "step(" + var0.UuUVuuUu(var1, "b") + ", " + var0.UuUVuuUu(var1, "a") + ")"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "time_sine",
            "Time Sine",
            "Time",
            178.0F,
            List.of(),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "(0.5 + 0.5 * sin(u_Time))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "time_cosine",
            "Time Cosine",
            "Time",
            184.0F,
            List.of(),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "(0.5 + 0.5 * cos(u_Time))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "time_raw", "Time Raw", "Time", 172.0F, List.of(), List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)), (var0, var1, var2) -> "u_Time"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "fresnel_real",
            "Fresnel Effect",
            "VFX",
            200.0F,
            List.of(
               NUuvnUuVU.input("normal", "normal", nnNVVnNnnV.VEC3, "vec3(0.0,0.0,1.0)"),
               NUuvnUuVU.input("viewDir", "view", nnNVVnNnnV.VEC3, "vec3(0.0,0.0,1.0)"),
               NUuvnUuVU.input("power", "power", nnNVVnNnnV.FLOAT, "3.0")
            ),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "pow(1.0 - clamp(dot(normalize("
               + var0.UuUVuuUu(var1, "normal")
               + "), normalize("
               + var0.UuUVuuUu(var1, "viewDir")
               + ")), 0.0, 1.0), max("
               + var0.UuUVuuUu(var1, "power")
               + ", 0.001))"
         )
      );
      this.UuUVuuUu(
         new uuUnNVuuVUu(
            "dither",
            "Dither",
            "VFX",
            178.0F,
            List.of(NUuvnUuVU.input("amount", "amount", nnNVVnNnnV.FLOAT, "0.02")),
            List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
            (var0, var1, var2) -> "((wild_hash12(gl_FragCoord.xy) - 0.5) * " + var0.UuUVuuUu(var1, "amount") + ")"
         )
      );
   }
}
