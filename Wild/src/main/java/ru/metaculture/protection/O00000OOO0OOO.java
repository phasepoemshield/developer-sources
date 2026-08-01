package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class O00000OOO0OOO {
   private final Map<String, O00000OOO0O00O> O00000000 = new LinkedHashMap<>();

   public O00000OOO0OOO() {
      this.O000000000();
   }

   public O00000OOO0O00O O00000000(String string) {
      return this.O00000000.get(string);
   }

   public Collection<O00000OOO0O00O> O00000000() {
      return this.O00000000.values();
   }

   public List<O00000OOO0O00O> O000000000(String string) {
      if (string != null && !string.isBlank()) {
         String var2 = string.toLowerCase(Locale.ROOT).trim();
         ArrayList var3 = new ArrayList();

         for (O00000OOO0O00O var5 : this.O00000000.values()) {
            if (var5.O000000000().toLowerCase(Locale.ROOT).contains(var2)
               || var5.O0000000000().toLowerCase(Locale.ROOT).contains(var2)
               || var5.O00000000().toLowerCase(Locale.ROOT).contains(var2)) {
               var3.add(var5);
            }
         }

         return var3;
      } else {
         return new ArrayList<>(this.O00000000.values());
      }
   }

   public void O00000000(O00000OOO0O00O o00000OOO0O00O) {
      this.O00000000.put(o00000OOO0O00O.O00000000(), o00000OOO0O00O);
   }

   private void O000000000() {
      this.O00000000(
         new O00000OOO0O00O(
            "input_uv",
            "Centered UV",
            "Inputs",
            164.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("uv", "uv", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "uv"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_global_uv",
            "Global Screen UV",
            "Inputs",
            180.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("uv", "uv", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "globalUv"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_screen_uv",
            "Screen UV",
            "Inputs",
            180.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("uv", "uv", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "globalUv"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_time",
            "Time",
            "Inputs",
            164.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("time", "time", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "u_Time"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_mouse",
            "Mouse",
            "Inputs",
            164.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("mouse", "mouse", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "(u_Mouse / max(u_Resolution, vec2(1.0)))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_global_mouse",
            "Global Mouse",
            "Inputs",
            178.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("mouse", "mouse", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "((u_ElementRect.xy + u_Mouse) / max(u_Resolution, vec2(1.0)))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_element_uv",
            "Element UV",
            "Context",
            174.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("uv", "uv", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "normalizedUv"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_element_centered_uv",
            "Element Centered UV",
            "Context",
            204.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("uv", "uv", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "(normalizedUv - 0.5)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_element_rect",
            "Element Rect",
            "Context",
            184.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("rect", "rect", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "u_ElementRect"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_element_size",
            "Element Size",
            "Context",
            184.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("size", "size", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "u_ElementRect.zw"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_element_radius",
            "Element Radius",
            "Context",
            190.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("radius", "radius", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "u_ElementRadius"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_local_mouse",
            "Local Mouse",
            "Context",
            180.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("mouse", "mouse", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "clamp(u_Mouse / max(u_ElementRect.zw, vec2(1.0)), vec2(0.0), vec2(1.0))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_aspect",
            "Element Aspect",
            "Context",
            186.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("aspect", "aspect", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "(u_ElementRect.z / max(u_ElementRect.w, 1.0))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "theme_top",
            "Accent Top",
            "Inputs",
            174.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(u_AccentTop, 1.0)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "theme_bottom",
            "Accent Bottom",
            "Inputs",
            174.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(u_AccentBottom, 1.0)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "theme_panel",
            "Theme Panel",
            "Inputs",
            174.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "u_ThemeColors[0]"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "exposed_float",
            "Exposed Float",
            "Inputs",
            188.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> o00000OOO00O0O.O00000000(o00000OOO0OO0O)
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "exposed_color",
            "Exposed Color",
            "Inputs",
            194.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> o00000OOO00O0O.O00000000(o00000OOO0OO0O)
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "float_value",
            "Float",
            "Constants",
            154.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> o00000OOO00O0O.O00000000(o00000OOO0OO0O.O00000000("value", 0.5F))
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec2_value",
            "Vec2",
            "Constants",
            168.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.5"), O00000OOO0O0OO.input("y", "y", O00000OOO0OO.FLOAT, "0.5")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec2("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "y")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec3_value",
            "Vec3",
            "Constants",
            168.0F,
            List.of(
               O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("y", "y", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("z", "z", O00000OOO0OO.FLOAT, "0.0")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC3)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec3("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "y")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "z")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec4_value",
            "Vec4",
            "Constants",
            174.0F,
            List.of(
               O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "1.0"),
               O00000OOO0O0OO.input("y", "y", O00000OOO0OO.FLOAT, "1.0"),
               O00000OOO0O0OO.input("z", "z", O00000OOO0OO.FLOAT, "1.0"),
               O00000OOO0O0OO.input("w", "w", O00000OOO0OO.FLOAT, "1.0")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "y")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "z")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "w")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "base_texture",
            "Base Texture",
            "Texture",
            190.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "texture(u_DiffuseMap, wild_diffuse_uv())"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_entity_mask",
            "Entity Mask",
            "Entity Context",
            188.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("mask", "mask", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "step(0.001, texture(u_DiffuseMap, wild_diffuse_uv()).a)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_depth",
            "Depth",
            "Entity Context",
            164.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("depth", "depth", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "clamp(1.0 - texture(u_DiffuseMap, wild_diffuse_uv()).a, 0.0, 1.0)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_camera_distance",
            "Camera Distance",
            "Entity Context",
            196.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("distance", "distance", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "length((wild_screen_px() - u_Resolution * 0.5) / max(u_Resolution.y, 1.0))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_camera_dir",
            "Camera Direction",
            "World Context",
            198.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("dir", "dir", O00000OOO0OO.VEC3)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "normalize(vec3(wild_view_dir(vUv), 1.0))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_sun_dir",
            "Sun Direction",
            "World Context",
            184.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("dir", "dir", O00000OOO0OO.VEC3)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "normalize(vec3(cos(u_Time * 0.04), 0.42, sin(u_Time * 0.04)))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_world_time",
            "World Time",
            "World Context",
            178.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("time", "time", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "fract(u_Time * 0.012)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_rain",
            "Rain Strength",
            "World Context",
            178.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("rain", "rain", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "0.0"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_biome_tint",
            "Biome Tint",
            "World Context",
            178.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(mix(u_AccentBottom, u_AccentTop, 0.35), 1.0)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "color_alpha",
            "Alpha Channel",
            "Texture",
            184.0F,
            List.of(O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(1.0)")),
            List.of(O00000OOO0O0OO.output("alpha", "alpha", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color") + ").a"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "float_add",
            "Add Float",
            "Math",
            168.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.FLOAT, "0.0"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + " + "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "float_mul",
            "Multiply Float",
            "Math",
            182.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.FLOAT, "1.0"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + " * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "float_sin",
            "Sine",
            "Math",
            164.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0"), O00000OOO0O0OO.input("freq", "freq", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "(0.5 + 0.5 * sin(("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + ") * ("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "freq")
               + ")))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "float_smoothstep",
            "Smoothstep",
            "Math",
            188.0F,
            List.of(
               O00000OOO0O0OO.input("edge0", "edge0", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("edge1", "edge1", O00000OOO0OO.FLOAT, "1.0"),
               O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.5")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "smoothstep("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "edge0")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "edge1")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec4_mix",
            "Mix Color",
            "Color",
            184.0F,
            List.of(
               O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC4, "vec4(0.0, 0.0, 0.0, 1.0)"),
               O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC4, "vec4(1.0, 1.0, 1.0, 1.0)"),
               O00000OOO0O0OO.input("t", "t", O00000OOO0OO.FLOAT, "0.5")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "mix("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ", clamp("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "t")
               + ", 0.0, 1.0))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "sdf_fill",
            "SDF Fill",
            "Color",
            184.0F,
            List.of(
               O00000OOO0O0OO.input("mask", "distance", O00000OOO0OO.FLOAT, "-1.0"),
               O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "u_ThemeColors[0]"),
               O00000OOO0O0OO.input("alpha", "alpha", O00000OOO0OO.FLOAT, "1.0")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ").rgb, ("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ").a * wild_sdf_alpha("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "mask")
               + ") * wild_sat("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "alpha")
               + "))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "element_mask",
            "Element Mask",
            "Base Shape",
            184.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("mask", "distance", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_element_distance()"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "element_alpha",
            "Element Alpha",
            "Base Shape",
            184.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("alpha", "alpha", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_sdf_alpha(wild_element_distance())"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "element_inner_mask",
            "Inset Element Mask",
            "Base Shape",
            206.0F,
            List.of(O00000OOO0O0OO.input("inset", "inset", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("mask", "distance", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_element_distance_inset(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "inset") + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "glass_surface",
            "Mica Glass Surface",
            "Material",
            214.0F,
            List.of(
               O00000OOO0O0OO.input("mask", "mask", O00000OOO0OO.FLOAT, "wild_element_distance()"),
               O00000OOO0O0OO.input("tint", "tint", O00000OOO0OO.VEC4, "u_ThemeColors[0]"),
               O00000OOO0O0OO.input("opacity", "opacity", O00000OOO0OO.FLOAT, "0.58"),
               O00000OOO0O0OO.input("grain", "grain", O00000OOO0OO.FLOAT, "0.045")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_glass_surface("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "mask")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "tint")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "opacity")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "grain")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "rim_light",
            "Rim Light",
            "Material",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("mask", "mask", O00000OOO0OO.FLOAT, "wild_element_distance()"),
               O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(u_AccentTop, 1.0)"),
               O00000OOO0O0OO.input("thickness", "width", O00000OOO0OO.FLOAT, "1.0"),
               O00000OOO0O0OO.input("intensity", "power", O00000OOO0OO.FLOAT, "0.18")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_rim_light("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "mask")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "thickness")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "intensity")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "hover_glow",
            "Magnetic Hover Glow",
            "Material",
            220.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "normalizedUv"),
               O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(u_AccentBottom, 1.0)"),
               O00000OOO0O0OO.input("radius", "radius", O00000OOO0OO.FLOAT, "0.42"),
               O00000OOO0O0OO.input("intensity", "power", O00000OOO0OO.FLOAT, "0.58")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_hover_glow("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "radius")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "intensity")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "inner_shadow",
            "Inner Shadow",
            "Material",
            198.0F,
            List.of(
               O00000OOO0O0OO.input("mask", "mask", O00000OOO0OO.FLOAT, "wild_element_distance()"),
               O00000OOO0O0OO.input("strength", "power", O00000OOO0OO.FLOAT, "0.22"),
               O00000OOO0O0OO.input("width", "width", O00000OOO0OO.FLOAT, "12.0")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_inner_shadow("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "mask")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "strength")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "width")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "exposure_lift",
            "Photographic Exposure",
            "Material",
            226.0F,
            List.of(
               O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "u_ThemeColors[0]"),
               O00000OOO0O0OO.input("amount", "amount", O00000OOO0OO.FLOAT, "0.18"),
               O00000OOO0O0OO.input("decay", "decay", O00000OOO0OO.FLOAT, "2.0")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_exposure_lift("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "amount")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "decay")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "alpha_blend",
            "Alpha Blend",
            "Blend",
            190.0F,
            List.of(
               O00000OOO0O0OO.input("base", "base", O00000OOO0OO.VEC4, "vec4(0.0)"), O00000OOO0O0OO.input("layer", "layer", O00000OOO0OO.VEC4, "vec4(1.0)")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_alpha_over("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "layer")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "color_ramp",
            "Color Ramp",
            "Color",
            184.0F,
            List.of(
               O00000OOO0O0OO.input("t", "t", O00000OOO0OO.FLOAT, "0.5"),
               O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC4, "vec4(u_AccentBottom, 1.0)"),
               O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC4, "vec4(u_AccentTop, 1.0)")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "mix("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ", wild_sat("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "t")
               + "))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "color_multiply_scalar",
            "Color Multiply",
            "Color",
            198.0F,
            List.of(O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(1.0)"), O00000OOO0O0OO.input("factor", "factor", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ").rgb * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "factor")
               + ", ("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ").a)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "blend_screen",
            "Screen Blend",
            "Blend",
            188.0F,
            List.of(
               O00000OOO0O0OO.input("base", "base", O00000OOO0OO.VEC4, "vec4(0.02, 0.022, 0.028, 1.0)"),
               O00000OOO0O0OO.input("layer", "layer", O00000OOO0OO.VEC4, "vec4(u_AccentTop, 1.0)"),
               O00000OOO0O0OO.input("opacity", "opacity", O00000OOO0OO.FLOAT, "0.5")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_blend_screen("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "layer")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "opacity")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "blend_overlay",
            "Overlay Blend",
            "Blend",
            188.0F,
            List.of(
               O00000OOO0O0OO.input("base", "base", O00000OOO0OO.VEC4, "vec4(0.02, 0.022, 0.028, 1.0)"),
               O00000OOO0O0OO.input("layer", "layer", O00000OOO0OO.VEC4, "vec4(u_AccentBottom, 1.0)"),
               O00000OOO0O0OO.input("opacity", "opacity", O00000OOO0OO.FLOAT, "0.5")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_blend_overlay("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "layer")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "opacity")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "sdf_circle",
            "SDF Circle",
            "SDF",
            184.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "uv"),
               O00000OOO0O0OO.input("center", "center", O00000OOO0OO.VEC2, "vec2(0.0)"),
               O00000OOO0O0OO.input("radius", "radius", O00000OOO0OO.FLOAT, "0.25"),
               O00000OOO0O0OO.input("softness", "soft", O00000OOO0OO.FLOAT, "0.08")
            ),
            List.of(O00000OOO0O0OO.output("mask", "distance", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> o00000OOO00O0O.O000000000()
               ? "wild_sdf_circle("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
                  + ", ("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
                  + ") * (u_ElementRect.zw * 0.5), ("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "radius")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5, "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "softness")
                  + ")"
               : "wild_sdf_circle("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "radius")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "softness")
                  + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "sdf_round_box",
            "SDF Rounded Box",
            "SDF",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "uv"),
               O00000OOO0O0OO.input("center", "center", O00000OOO0OO.VEC2, "vec2(0.0)"),
               O00000OOO0O0OO.input("size", "size", O00000OOO0OO.VEC2, "vec2(0.95, 0.32)"),
               O00000OOO0O0OO.input("radius", "radius", O00000OOO0OO.FLOAT, "0.08"),
               O00000OOO0O0OO.input("softness", "soft", O00000OOO0OO.FLOAT, "0.06")
            ),
            List.of(O00000OOO0O0OO.output("mask", "distance", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> o00000OOO00O0O.O000000000()
               ? "wild_sdf_round_box("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
                  + ", ("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
                  + ") * (u_ElementRect.zw * 0.5), ("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "size")
                  + ") * (u_ElementRect.zw * 0.5), ("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "radius")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5, "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "softness")
                  + ")"
               : "wild_sdf_round_box("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "size")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "radius")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "softness")
                  + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "simplex_noise_3d",
            "Simplex Noise 3D",
            "Generator",
            202.0F,
            List.of(
               O00000OOO0O0OO.input("p", "p", O00000OOO0OO.VEC3, "vec3(globalUv * 2.0, u_Time * 0.08)"),
               O00000OOO0O0OO.input("scale", "scale", O00000OOO0OO.FLOAT, "3.0")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "(0.5 + 0.5 * wild_simplex3("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "p")
               + " * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "scale")
               + "))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "voronoi",
            "Voronoi",
            "Generator",
            190.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "globalUv"),
               O00000OOO0O0OO.input("scale", "scale", O00000OOO0OO.FLOAT, "7.0"),
               O00000OOO0O0OO.input("time", "time", O00000OOO0OO.FLOAT, "u_Time")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_voronoi("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
               + " * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "scale")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "time")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "chromatic_aberration",
            "Chromatic Aberration",
            "VFX",
            218.0F,
            List.of(
               O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(u_AccentTop, 1.0)"),
               O00000OOO0O0OO.input("amount", "amount", O00000OOO0OO.FLOAT, "0.08"),
               O00000OOO0O0OO.input("phase", "phase", O00000OOO0OO.FLOAT, "u_Time")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_chromatic("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ", vUv, "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "amount")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "phase")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "output_color",
            "Master Output",
            "Output",
            184.0F,
            List.of(
               O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(0.02, 0.022, 0.028, 1.0)"),
               O00000OOO0O0OO.input("alpha", "alpha", O00000OOO0OO.FLOAT, "1.0")
            ),
            List.of(),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ").rgb, ("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ").a * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "alpha")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "sdf_triangle",
            "SDF Triangle",
            "SDF",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "uv"),
               O00000OOO0O0OO.input("center", "center", O00000OOO0OO.VEC2, "vec2(0.0)"),
               O00000OOO0O0OO.input("radius", "radius", O00000OOO0OO.FLOAT, "0.35"),
               O00000OOO0O0OO.input("softness", "soft", O00000OOO0OO.FLOAT, "0.05")
            ),
            List.of(O00000OOO0O0OO.output("mask", "distance", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> o00000OOO00O0O.O000000000()
               ? "wild_sdf_triangle("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
                  + ", ("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
                  + ") * (u_ElementRect.zw * 0.5), ("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "radius")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5, "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "softness")
                  + ")"
               : "wild_sdf_triangle("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "radius")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "softness")
                  + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "sdf_hex",
            "SDF Hexagon",
            "SDF",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "uv"),
               O00000OOO0O0OO.input("center", "center", O00000OOO0OO.VEC2, "vec2(0.0)"),
               O00000OOO0O0OO.input("radius", "radius", O00000OOO0OO.FLOAT, "0.28"),
               O00000OOO0O0OO.input("softness", "soft", O00000OOO0OO.FLOAT, "0.05")
            ),
            List.of(O00000OOO0O0OO.output("mask", "distance", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> o00000OOO00O0O.O000000000()
               ? "wild_sdf_hex("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
                  + ", ("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
                  + ") * (u_ElementRect.zw * 0.5), ("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "radius")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5, "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "softness")
                  + ")"
               : "wild_sdf_hex("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "radius")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "softness")
                  + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "fbm_noise",
            "FBM Noise",
            "Generator",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("p", "p", O00000OOO0OO.VEC3, "vec3(globalUv * 3.0, u_Time * 0.12)"),
               O00000OOO0O0OO.input("octaves", "oct", O00000OOO0OO.FLOAT, "5.0"),
               O00000OOO0O0OO.input("scale", "scale", O00000OOO0OO.FLOAT, "1.8")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_fbm("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "p")
               + " * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "scale")
               + ", int(clamp("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "octaves")
               + ", 1.0, 8.0)))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "polar_uv",
            "Polar UV",
            "Coords",
            184.0F,
            List.of(O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "vUv"), O00000OOO0O0OO.input("center", "center", O00000OOO0OO.VEC2, "vec2(0.5)")),
            List.of(O00000OOO0O0OO.output("uv", "uv", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_polar("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "rotate_uv",
            "Rotate UV",
            "Coords",
            186.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "vUv"),
               O00000OOO0O0OO.input("center", "center", O00000OOO0OO.VEC2, "vec2(0.5)"),
               O00000OOO0O0OO.input("angle", "angle", O00000OOO0OO.FLOAT, "u_Time")
            ),
            List.of(O00000OOO0O0OO.output("uv", "uv", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_rotate_uv("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "angle")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "twist_uv",
            "Twist UV",
            "Coords",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "vUv"),
               O00000OOO0O0OO.input("center", "center", O00000OOO0OO.VEC2, "vec2(0.5)"),
               O00000OOO0O0OO.input("strength", "strength", O00000OOO0OO.FLOAT, "2.6")
            ),
            List.of(O00000OOO0O0OO.output("uv", "uv", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_twist_uv("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "strength")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vignette",
            "Vignette",
            "VFX",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "vUv"),
               O00000OOO0O0OO.input("intensity", "intensity", O00000OOO0OO.FLOAT, "1.0"),
               O00000OOO0O0OO.input("falloff", "falloff", O00000OOO0OO.FLOAT, "0.5")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_vignette("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "intensity")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "falloff")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "posterize",
            "Posterize",
            "VFX",
            196.0F,
            List.of(O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(0.5)"), O00000OOO0O0OO.input("steps", "steps", O00000OOO0OO.FLOAT, "6.0")),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(floor("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".rgb * max("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "steps")
               + ", 1.0)) / max("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "steps")
               + ", 1.0), "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".a)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "bloom_lift",
            "Bloom Lift",
            "VFX",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(0.5)"),
               O00000OOO0O0OO.input("threshold", "threshold", O00000OOO0OO.FLOAT, "0.6"),
               O00000OOO0O0OO.input("amount", "amount", O00000OOO0OO.FLOAT, "1.2")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_bloom_lift("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "threshold")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "amount")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "color_pulse",
            "Color Pulse",
            "Color",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC4, "vec4(u_AccentBottom, 1.0)"),
               O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC4, "vec4(u_AccentTop, 1.0)"),
               O00000OOO0O0OO.input("speed", "speed", O00000OOO0OO.FLOAT, "1.0")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "mix("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ", 0.5 + 0.5 * sin(u_Time * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "speed")
               + "))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "color_screen_split",
            "Channel Split",
            "Color",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(0.5)"), O00000OOO0O0OO.input("amount", "amount", O00000OOO0OO.FLOAT, "0.04")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_channel_split("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "amount")
               + ", u_Time)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "fresnel",
            "Fresnel Rim",
            "VFX",
            196.0F,
            List.of(O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "vUv"), O00000OOO0O0OO.input("power", "power", O00000OOO0OO.FLOAT, "3.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "pow(max(1.0 - 2.0 * length("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
               + " - 0.5), 0.0), max("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "power")
               + ", 0.001))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "step_threshold",
            "Step Threshold",
            "Math",
            184.0F,
            List.of(O00000OOO0O0OO.input("edge", "edge", O00000OOO0OO.FLOAT, "0.5"), O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.5")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "step("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "edge")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "fract_node",
            "Fract",
            "Math",
            174.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "fract(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x") + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "abs_node",
            "Abs",
            "Math",
            168.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "abs(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x") + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "saturate_node",
            "Saturate",
            "Math",
            174.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "clamp(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x") + ", 0.0, 1.0)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "blend_multiply",
            "Multiply Blend",
            "Blend",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("base", "base", O00000OOO0OO.VEC4, "vec4(0.02, 0.022, 0.028, 1.0)"),
               O00000OOO0O0OO.input("layer", "layer", O00000OOO0OO.VEC4, "vec4(u_AccentTop, 1.0)"),
               O00000OOO0O0OO.input("opacity", "opacity", O00000OOO0OO.FLOAT, "0.5")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(mix("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ".rgb, "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ".rgb * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "layer")
               + ".rgb, clamp("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "opacity")
               + ", 0.0, 1.0)), max("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ".a, "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "layer")
               + ".a))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "blend_add",
            "Additive Blend",
            "Blend",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("base", "base", O00000OOO0OO.VEC4, "vec4(0.02, 0.022, 0.028, 1.0)"),
               O00000OOO0O0OO.input("layer", "layer", O00000OOO0OO.VEC4, "vec4(u_AccentTop, 1.0)"),
               O00000OOO0O0OO.input("opacity", "opacity", O00000OOO0OO.FLOAT, "0.5")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(clamp("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ".rgb + "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "layer")
               + ".rgb * clamp("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "opacity")
               + ", 0.0, 1.0), 0.0, 1.0), max("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ".a, "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "layer")
               + ".a))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "iridescence",
            "Iridescence",
            "Color",
            200.0F,
            List.of(O00000OOO0O0OO.input("t", "t", O00000OOO0OO.FLOAT, "0.5"), O00000OOO0O0OO.input("speed", "speed", O00000OOO0OO.FLOAT, "0.8")),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_iridescence("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "t")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "speed")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "sdf_union",
            "SDF Union",
            "SDF Booleans",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("a", "a", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("b", "b", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("smoothness", "smooth", O00000OOO0OO.FLOAT, "0.05")
            ),
            List.of(O00000OOO0O0OO.output("mask", "distance", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> o00000OOO00O0O.O000000000()
               ? "wild_sdf_union("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
                  + ", ("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "smoothness")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5)"
               : "wild_sdf_union("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "smoothness")
                  + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "sdf_subtract",
            "SDF Subtract",
            "SDF Booleans",
            200.0F,
            List.of(
               O00000OOO0O0OO.input("a", "a", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("b", "b", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("smoothness", "smooth", O00000OOO0OO.FLOAT, "0.05")
            ),
            List.of(O00000OOO0O0OO.output("mask", "distance", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> o00000OOO00O0O.O000000000()
               ? "wild_sdf_subtract("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
                  + ", ("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "smoothness")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5)"
               : "wild_sdf_subtract("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "smoothness")
                  + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "sdf_intersect",
            "SDF Intersect",
            "SDF Booleans",
            204.0F,
            List.of(
               O00000OOO0O0OO.input("a", "a", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("b", "b", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("smoothness", "smooth", O00000OOO0OO.FLOAT, "0.05")
            ),
            List.of(O00000OOO0O0OO.output("mask", "distance", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> o00000OOO00O0O.O000000000()
               ? "wild_sdf_intersect("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
                  + ", ("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "smoothness")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5)"
               : "wild_sdf_intersect("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "smoothness")
                  + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "sdf_star",
            "SDF Star",
            "SDF",
            198.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "uv"),
               O00000OOO0O0OO.input("center", "center", O00000OOO0OO.VEC2, "vec2(0.0)"),
               O00000OOO0O0OO.input("radius", "radius", O00000OOO0OO.FLOAT, "0.32"),
               O00000OOO0O0OO.input("points", "points", O00000OOO0OO.FLOAT, "5.0"),
               O00000OOO0O0OO.input("softness", "soft", O00000OOO0OO.FLOAT, "0.05")
            ),
            List.of(O00000OOO0O0OO.output("mask", "distance", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> o00000OOO00O0O.O000000000()
               ? "wild_sdf_star("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
                  + ", ("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
                  + ") * (u_ElementRect.zw * 0.5), ("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "radius")
                  + ") * min(u_ElementRect.z, u_ElementRect.w) * 0.5, "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "points")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "softness")
                  + ")"
               : "wild_sdf_star("
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "radius")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "points")
                  + ", "
                  + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "softness")
                  + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_remap",
            "Remap",
            "Math",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("v", "v", O00000OOO0OO.FLOAT, "0.5"),
               O00000OOO0O0OO.input("inMin", "inMin", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("inMax", "inMax", O00000OOO0OO.FLOAT, "1.0"),
               O00000OOO0O0OO.input("outMin", "outMin", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("outMax", "outMax", O00000OOO0OO.FLOAT, "1.0")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_remap("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "inMin")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "inMax")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "outMin")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "outMax")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_clamp",
            "Clamp",
            "Math",
            184.0F,
            List.of(
               O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.5"),
               O00000OOO0O0OO.input("min", "min", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("max", "max", O00000OOO0OO.FLOAT, "1.0")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "clamp("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "min")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "max")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_floor",
            "Floor",
            "Math",
            168.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "floor(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x") + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_ceil",
            "Ceil",
            "Math",
            168.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "ceil(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x") + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_length",
            "Length",
            "Math",
            184.0F,
            List.of(O00000OOO0O0OO.input("v", "v", O00000OOO0OO.VEC2, "vUv - 0.5")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "length(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v") + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_distance",
            "Distance",
            "Math",
            192.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC2, "vUv"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC2, "vec2(0.5)")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "distance("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_power",
            "Power",
            "Math",
            192.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.5"), O00000OOO0O0OO.input("y", "y", O00000OOO0OO.FLOAT, "2.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "pow(max("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + ", 0.0), "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "y")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_mod",
            "Mod",
            "Math",
            188.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0"), O00000OOO0O0OO.input("y", "y", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "mod("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + ", (abs("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "y")
               + ") < 1e-5 ? 1e-5 : "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "y")
               + "))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_dot",
            "Dot",
            "Math",
            188.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC2, "vUv"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC2, "vec2(1.0)")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "dot("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_subtract",
            "Subtract",
            "Math",
            184.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.FLOAT, "0.0"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + " - "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_divide",
            "Divide",
            "Math",
            184.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.FLOAT, "1.0"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + " / max("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ", 1e-5))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "color_gradient_map",
            "Gradient Map",
            "Color",
            220.0F,
            List.of(
               O00000OOO0O0OO.input("t", "t", O00000OOO0OO.FLOAT, "0.5"),
               O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC4, "vec4(u_AccentBottom, 1.0)"),
               O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC4, "vec4(u_AccentTop, 1.0)"),
               O00000OOO0O0OO.input("c", "c", O00000OOO0OO.VEC4, "vec4(1.0)")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_gradient_map("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "t")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "c")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "color_desaturate",
            "Desaturate",
            "Color",
            192.0F,
            List.of(O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(1.0)"), O00000OOO0O0OO.input("amount", "amount", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(wild_desaturate("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".rgb, "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "amount")
               + "), "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".a)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "color_invert",
            "Invert",
            "Color",
            188.0F,
            List.of(O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(0.5)"), O00000OOO0O0OO.input("amount", "amount", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(wild_invert("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".rgb, "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "amount")
               + "), "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".a)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "color_hsv",
            "HSV → RGB",
            "Color",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("h", "hue", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("s", "sat", O00000OOO0OO.FLOAT, "1.0"),
               O00000OOO0O0OO.input("v", "val", O00000OOO0OO.FLOAT, "1.0")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(wild_hsv2rgb(vec3("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "h")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "s")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v")
               + ")), 1.0)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "time_bpm",
            "BPM Sync",
            "Time",
            192.0F,
            List.of(O00000OOO0O0OO.input("bpm", "bpm", O00000OOO0OO.FLOAT, "128.0"), O00000OOO0O0OO.input("strength", "shape", O00000OOO0OO.FLOAT, "2.0")),
            List.of(O00000OOO0O0OO.output("pulse", "pulse", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_bpm("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "bpm")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "strength")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "time_pulse",
            "Pulse",
            "Time",
            184.0F,
            List.of(O00000OOO0O0OO.input("t", "t", O00000OOO0OO.FLOAT, "u_Time"), O00000OOO0O0OO.input("duty", "duty", O00000OOO0OO.FLOAT, "0.5")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_pulse("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "t")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "duty")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_view_dir",
            "View Direction",
            "Inputs",
            178.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("dir", "dir", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_view_dir(vUv)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_normal",
            "Normal (UV slope)",
            "Inputs",
            192.0F,
            List.of(O00000OOO0O0OO.input("strength", "strength", O00000OOO0OO.FLOAT, "4.0")),
            List.of(O00000OOO0O0OO.output("normal", "normal", O00000OOO0OO.VEC3)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_normal_from_uv(vUv, " + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "strength") + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_resolution",
            "Resolution",
            "Inputs",
            178.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("res", "res", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "u_Resolution"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "input_alpha",
            "Alpha",
            "Inputs",
            178.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("alpha", "alpha", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "u_Alpha"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec2_split",
            "Split Vec2",
            "Math",
            188.0F,
            List.of(O00000OOO0O0OO.input("v", "v", O00000OOO0OO.VEC2, "vUv")),
            List.of(O00000OOO0O0OO.output("x", "x", O00000OOO0OO.FLOAT), O00000OOO0O0OO.output("y", "y", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "x".equals(string)
               ? "(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v") + ").x"
               : "(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v") + ").y"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_max",
            "Max",
            "Math",
            184.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.FLOAT, "0.0"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "max("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_min",
            "Min",
            "Math",
            184.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.FLOAT, "0.0"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "min("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_sign",
            "Sign",
            "Math",
            172.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "sign(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x") + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_sqrt",
            "Square Root",
            "Math",
            178.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "sqrt(max(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x") + ", 0.0))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_exp",
            "Exp",
            "Math",
            172.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "exp(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x") + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_log",
            "Log",
            "Math",
            172.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "log(max(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x") + ", 1e-6))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_one_minus",
            "One Minus",
            "Math",
            178.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "(1.0 - " + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x") + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_reciprocal",
            "Reciprocal",
            "Math",
            184.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "(1.0 / (abs("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + ") < 1e-5 ? 1e-5 : "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + "))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_round",
            "Round",
            "Math",
            172.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "floor(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x") + " + 0.5)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_cos",
            "Cosine",
            "Math",
            172.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0"), O00000OOO0O0OO.input("freq", "freq", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "cos(("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + ") * ("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "freq")
               + "))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_sin_raw",
            "Sine Raw",
            "Math",
            178.0F,
            List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0"), O00000OOO0O0OO.input("freq", "freq", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "sin(("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + ") * ("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "freq")
               + "))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "math_atan2",
            "Atan2",
            "Math",
            178.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.FLOAT, "1.0"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "atan("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec_add3",
            "Add Vec3",
            "Vector",
            178.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC3, "vec3(0.0)"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC3, "vec3(0.0)")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC3)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + " + "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec_sub3",
            "Subtract Vec3",
            "Vector",
            190.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC3, "vec3(0.0)"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC3, "vec3(0.0)")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC3)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + " - "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec_mul3",
            "Multiply Vec3",
            "Vector",
            190.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC3, "vec3(1.0)"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC3, "vec3(1.0)")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC3)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + " * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec_scale3",
            "Scale Vec3",
            "Vector",
            184.0F,
            List.of(O00000OOO0O0OO.input("v", "v", O00000OOO0OO.VEC3, "vec3(1.0)"), O00000OOO0O0OO.input("s", "s", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC3)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v")
               + " * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "s")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec_normalize",
            "Normalize",
            "Vector",
            184.0F,
            List.of(O00000OOO0O0OO.input("v", "v", O00000OOO0OO.VEC3, "vec3(0.0,0.0,1.0)")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC3)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "normalize(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v") + " + 1e-6)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec_cross",
            "Cross",
            "Vector",
            178.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC3, "vec3(0.0)"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC3, "vec3(0.0)")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC3)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "cross("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec_reflect",
            "Reflect",
            "Vector",
            184.0F,
            List.of(
               O00000OOO0O0OO.input("i", "i", O00000OOO0OO.VEC3, "vec3(0.0,0.0,-1.0)"), O00000OOO0O0OO.input("n", "n", O00000OOO0OO.VEC3, "vec3(0.0,0.0,1.0)")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC3)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "reflect("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "i")
               + ", normalize("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "n")
               + "))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec_dot3",
            "Dot Vec3",
            "Vector",
            178.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC3, "vec3(0.0)"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC3, "vec3(0.0)")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "dot("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec_lerp3",
            "Lerp Vec3",
            "Vector",
            184.0F,
            List.of(
               O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC3, "vec3(0.0)"),
               O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC3, "vec3(0.0)"),
               O00000OOO0O0OO.input("t", "t", O00000OOO0OO.FLOAT, "0.5")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC3)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "mix("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "t")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec2_add",
            "Add Vec2",
            "Vector",
            178.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC2, "vec2(0.0)"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC2, "vec2(0.0)")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + " + "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec2_mul",
            "Multiply Vec2",
            "Vector",
            190.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC2, "vec2(1.0)"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC2, "vec2(1.0)")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + " * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec4_add",
            "Add Vec4",
            "Vector",
            178.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC4, "vec4(0.0)"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC4, "vec4(0.0)")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + " + "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "vec4_scale",
            "Scale Vec4",
            "Vector",
            184.0F,
            List.of(O00000OOO0O0OO.input("v", "v", O00000OOO0OO.VEC4, "vec4(1.0)"), O00000OOO0O0OO.input("s", "s", O00000OOO0OO.FLOAT, "1.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v")
               + " * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "s")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "combine_vec3",
            "Combine Vec3",
            "Vector",
            184.0F,
            List.of(
               O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("y", "y", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("z", "z", O00000OOO0OO.FLOAT, "0.0")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC3)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec3("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "y")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "z")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "combine_vec4",
            "Combine Vec4",
            "Vector",
            190.0F,
            List.of(
               O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("y", "y", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("z", "z", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("w", "w", O00000OOO0OO.FLOAT, "1.0")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "y")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "z")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "w")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "split_vec3",
            "Split Vec3",
            "Vector",
            184.0F,
            List.of(O00000OOO0O0OO.input("v", "v", O00000OOO0OO.VEC3, "vec3(0.0)")),
            List.of(
               O00000OOO0O0OO.output("x", "x", O00000OOO0OO.FLOAT),
               O00000OOO0O0OO.output("y", "y", O00000OOO0OO.FLOAT),
               O00000OOO0O0OO.output("z", "z", O00000OOO0OO.FLOAT)
            ),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "x".equals(string)
               ? "(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v") + ").x"
               : (
                  "y".equals(string)
                     ? "(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v") + ").y"
                     : "(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v") + ").z"
               )
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "split_vec4",
            "Split Vec4",
            "Vector",
            190.0F,
            List.of(O00000OOO0O0OO.input("v", "v", O00000OOO0OO.VEC4, "vec4(0.0)")),
            List.of(
               O00000OOO0O0OO.output("x", "x", O00000OOO0OO.FLOAT),
               O00000OOO0O0OO.output("y", "y", O00000OOO0OO.FLOAT),
               O00000OOO0O0OO.output("z", "z", O00000OOO0OO.FLOAT),
               O00000OOO0O0OO.output("w", "w", O00000OOO0OO.FLOAT)
            ),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "x".equals(string)
               ? "(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v") + ").x"
               : (
                  "y".equals(string)
                     ? "(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v") + ").y"
                     : (
                        "z".equals(string)
                           ? "(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v") + ").z"
                           : "(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "v") + ").w"
                     )
               )
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "uv_tiling_offset",
            "Tiling And Offset",
            "Coords",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "uv"),
               O00000OOO0O0OO.input("tiling", "tiling", O00000OOO0OO.VEC2, "vec2(1.0)"),
               O00000OOO0O0OO.input("offset", "offset", O00000OOO0OO.VEC2, "vec2(0.0)")
            ),
            List.of(O00000OOO0O0OO.output("uv", "uv", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
               + " * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "tiling")
               + " + "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "offset")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "uv_panner",
            "Panner",
            "Coords",
            186.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "uv"),
               O00000OOO0O0OO.input("speed", "speed", O00000OOO0OO.VEC2, "vec2(0.1)"),
               O00000OOO0O0OO.input("time", "time", O00000OOO0OO.FLOAT, "u_Time")
            ),
            List.of(O00000OOO0O0OO.output("uv", "uv", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
               + " + "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "speed")
               + " * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "time")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "uv_radial_shear",
            "Radial Shear",
            "Coords",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "vUv"),
               O00000OOO0O0OO.input("center", "center", O00000OOO0OO.VEC2, "vec2(0.5)"),
               O00000OOO0O0OO.input("strength", "strength", O00000OOO0OO.FLOAT, "6.0")
            ),
            List.of(O00000OOO0O0OO.output("uv", "uv", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_radial_shear("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "strength")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "uv_spherize",
            "Spherize",
            "Coords",
            190.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "vUv"),
               O00000OOO0O0OO.input("center", "center", O00000OOO0OO.VEC2, "vec2(0.5)"),
               O00000OOO0O0OO.input("strength", "strength", O00000OOO0OO.FLOAT, "0.5")
            ),
            List.of(O00000OOO0O0OO.output("uv", "uv", O00000OOO0OO.VEC2)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_spherize("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "center")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "strength")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "checkerboard",
            "Checkerboard",
            "Generator",
            200.0F,
            List.of(
               O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "vUv"),
               O00000OOO0O0OO.input("freq", "freq", O00000OOO0OO.VEC2, "vec2(6.0)"),
               O00000OOO0O0OO.input("a", "a", O00000OOO0OO.VEC4, "vec4(0.05,0.05,0.06,1.0)"),
               O00000OOO0O0OO.input("b", "b", O00000OOO0OO.VEC4, "vec4(u_AccentTop,1.0)")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "mix("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ", wild_checker("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "freq")
               + "))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "simple_noise",
            "Simple Noise",
            "Generator",
            190.0F,
            List.of(O00000OOO0O0OO.input("uv", "uv", O00000OOO0OO.VEC2, "globalUv"), O00000OOO0O0OO.input("scale", "scale", O00000OOO0OO.FLOAT, "5.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "wild_gnoise2("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "uv")
               + " * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "scale")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "contrast",
            "Contrast",
            "Color",
            190.0F,
            List.of(O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(0.5)"), O00000OOO0O0OO.input("amount", "amount", O00000OOO0OO.FLOAT, "1.2")),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".rgb - 0.5) * "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "amount")
               + " + 0.5, "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".a)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "saturation",
            "Saturation",
            "Color",
            190.0F,
            List.of(O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(0.5)"), O00000OOO0O0OO.input("amount", "amount", O00000OOO0OO.FLOAT, "1.2")),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(mix(vec3(dot("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".rgb, vec3(0.299,0.587,0.114))), "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".rgb, "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "amount")
               + "), "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".a)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "brightness",
            "Brightness",
            "Color",
            190.0F,
            List.of(O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(0.5)"), O00000OOO0O0OO.input("amount", "amount", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".rgb + "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "amount")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".a)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "hue_shift",
            "Hue Shift",
            "Color",
            190.0F,
            List.of(
               O00000OOO0O0OO.input("color", "color", O00000OOO0OO.VEC4, "vec4(u_AccentTop,1.0)"),
               O00000OOO0O0OO.input("shift", "shift", O00000OOO0OO.FLOAT, "0.1")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(wild_hsv2rgb(vec3(fract(wild_rgb2hsv("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".rgb).x + "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "shift")
               + "), wild_rgb2hsv("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".rgb).yz)), "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
               + ".a)"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "blend_lighten",
            "Lighten Blend",
            "Blend",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("base", "base", O00000OOO0OO.VEC4, "vec4(0.1)"),
               O00000OOO0O0OO.input("layer", "layer", O00000OOO0OO.VEC4, "vec4(u_AccentTop,1.0)"),
               O00000OOO0O0OO.input("opacity", "opacity", O00000OOO0OO.FLOAT, "1.0")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(mix("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ".rgb, max("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ".rgb, "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "layer")
               + ".rgb), clamp("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "opacity")
               + ",0.0,1.0)), max("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ".a, "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "layer")
               + ".a))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "blend_darken",
            "Darken Blend",
            "Blend",
            196.0F,
            List.of(
               O00000OOO0O0OO.input("base", "base", O00000OOO0OO.VEC4, "vec4(0.1)"),
               O00000OOO0O0OO.input("layer", "layer", O00000OOO0OO.VEC4, "vec4(u_AccentTop,1.0)"),
               O00000OOO0O0OO.input("opacity", "opacity", O00000OOO0OO.FLOAT, "1.0")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(mix("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ".rgb, min("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ".rgb, "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "layer")
               + ".rgb), clamp("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "opacity")
               + ",0.0,1.0)), max("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ".a, "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "layer")
               + ".a))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "blend_difference",
            "Difference Blend",
            "Blend",
            200.0F,
            List.of(
               O00000OOO0O0OO.input("base", "base", O00000OOO0OO.VEC4, "vec4(0.1)"),
               O00000OOO0O0OO.input("layer", "layer", O00000OOO0OO.VEC4, "vec4(u_AccentTop,1.0)"),
               O00000OOO0O0OO.input("opacity", "opacity", O00000OOO0OO.FLOAT, "1.0")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "vec4(mix("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ".rgb, abs("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ".rgb - "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "layer")
               + ".rgb), clamp("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "opacity")
               + ",0.0,1.0)), max("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "base")
               + ".a, "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "layer")
               + ".a))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "branch",
            "Branch",
            "Logic",
            190.0F,
            List.of(
               O00000OOO0O0OO.input("pred", "pred", O00000OOO0OO.FLOAT, "0.0"),
               O00000OOO0O0OO.input("whenTrue", "true", O00000OOO0OO.VEC4, "vec4(u_AccentTop,1.0)"),
               O00000OOO0O0OO.input("whenFalse", "false", O00000OOO0OO.VEC4, "vec4(u_AccentBottom,1.0)")
            ),
            List.of(O00000OOO0O0OO.output("color", "color", O00000OOO0OO.VEC4)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "mix("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "whenFalse")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "whenTrue")
               + ", step(0.5, "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "pred")
               + "))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "compare_greater",
            "Greater Than",
            "Logic",
            196.0F,
            List.of(O00000OOO0O0OO.input("a", "a", O00000OOO0OO.FLOAT, "0.5"), O00000OOO0O0OO.input("b", "b", O00000OOO0OO.FLOAT, "0.0")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "step("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "b")
               + ", "
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "a")
               + ")"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "time_sine",
            "Time Sine",
            "Time",
            178.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "(0.5 + 0.5 * sin(u_Time))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "time_cosine",
            "Time Cosine",
            "Time",
            184.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "(0.5 + 0.5 * cos(u_Time))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "time_raw",
            "Time Raw",
            "Time",
            172.0F,
            List.of(),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "u_Time"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "fresnel_real",
            "Fresnel Effect",
            "VFX",
            200.0F,
            List.of(
               O00000OOO0O0OO.input("normal", "normal", O00000OOO0OO.VEC3, "vec3(0.0,0.0,1.0)"),
               O00000OOO0O0OO.input("viewDir", "view", O00000OOO0OO.VEC3, "vec3(0.0,0.0,1.0)"),
               O00000OOO0O0OO.input("power", "power", O00000OOO0OO.FLOAT, "3.0")
            ),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "pow(1.0 - clamp(dot(normalize("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "normal")
               + "), normalize("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "viewDir")
               + ")), 0.0, 1.0), max("
               + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "power")
               + ", 0.001))"
         )
      );
      this.O00000000(
         new O00000OOO0O00O(
            "dither",
            "Dither",
            "VFX",
            178.0F,
            List.of(O00000OOO0O0OO.input("amount", "amount", O00000OOO0OO.FLOAT, "0.02")),
            List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> "((wild_hash12(gl_FragCoord.xy) - 0.5) * " + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "amount") + ")"
         )
      );
   }
}
