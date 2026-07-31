package zenith.zov.utility.mixin.render;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Pseudo
@Mixin(
   targets = {"net.caffeinemc.mods.sodium.client.gl.shader.GlShader"},
   remap = false
)
public class MixinSodiumGlShader {
   @Unique
   private static final Pattern DIFFUSE_COLOR = Pattern.compile("(?m)^(\\s*diffuseColor\\s*\\*=\\s*v_Color\\s*;)");
   @Unique
   private static final String SATURATION_FUNCTION = "\nvec3 zenith_apply_saturation(vec3 color) {\n    float amount = max(ZenithSaturation, 0.0);\n    float luma = dot(color, vec3(0.299, 0.587, 0.114));\n    float boost = max(amount - 1.0, 0.0);\n    vec3 saturated = mix(vec3(luma), color, amount);\n    return clamp(saturated * (1.0 + boost * 0.35), 0.0, 1.0);\n}\n";

   @ModifyArg(
      method = {"<init>"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/caffeinemc/mods/sodium/client/gl/shader/ShaderWorkarounds;safeShaderSource(ILjava/lang/CharSequence;)V",
         remap = false
      ),
      index = 1,
      remap = false
   )
   private CharSequence injectSaturation(CharSequence charsequence) {
      String s = charsequence.toString();
      if (s.contains("uniform sampler2D u_BlockTex;") && s.contains("out vec4 fragColor;") && !s.contains("ZenithSaturation")) {
         Matcher matcher = DIFFUSE_COLOR.matcher(s);
         if (!matcher.find()) {
            return charsequence;
         } else {
            String s1 = s.replace("uniform sampler2D u_BlockTex;", "uniform sampler2D u_BlockTex;\nuniform float ZenithSaturation;")
               .replace(
                  "out vec4 fragColor;",
                  "out vec4 fragColor;\n\nvec3 zenith_apply_saturation(vec3 color) {\n    float amount = max(ZenithSaturation, 0.0);\n    float luma = dot(color, vec3(0.299, 0.587, 0.114));\n    float boost = max(amount - 1.0, 0.0);\n    vec3 saturated = mix(vec3(luma), color, amount);\n    return clamp(saturated * (1.0 + boost * 0.35), 0.0, 1.0);\n}\n"
               );
            return DIFFUSE_COLOR.matcher(s1).replaceFirst("$1\n    diffuseColor.rgb = zenith_apply_saturation(diffuseColor.rgb);");
         }
      } else {
         return charsequence;
      }
   }
}
