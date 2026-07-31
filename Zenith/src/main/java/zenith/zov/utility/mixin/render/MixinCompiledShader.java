package zenith.zov.utility.mixin.render;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.gl.CompiledShader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({CompiledShader.class})
public class MixinCompiledShader {
   @Unique
   private static final Pattern COLOR_SAMPLE = Pattern.compile("(?m)^(\\s*vec4\\s+color\\s*=\\s*texture\\(Sampler0\\s*,\\s*texCoord0\\)[^;]*;)");
   @Unique
   private static final String SATURATION_FUNCTION = "\nvec3 zenith_apply_saturation(vec3 color) {\n    float amount = max(ZenithSaturation, 0.0);\n    float luma = dot(color, vec3(0.299, 0.587, 0.114));\n    float boost = max(amount - 1.0, 0.0);\n    vec3 saturated = mix(vec3(luma), color, amount);\n    return clamp(saturated * (1.0 + boost * 0.35), 0.0, 1.0);\n}\n";

   @ModifyArg(
      method = {"compile"},
      at = @At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/platform/GlStateManager;glShaderSource(ILjava/lang/String;)V"
      ),
      index = 1
   )
   private static String injectSaturation(String s) {
      if (s.contains("uniform sampler2D Sampler0;")
         && s.contains("uniform vec4 ColorModulator;")
         && s.contains("out vec4 fragColor;")
         && !s.contains("ZenithSaturation")) {
         Matcher matcher = COLOR_SAMPLE.matcher(s);
         if (!matcher.find()) {
            return s;
         } else {
            String s1 = s.replace("uniform vec4 ColorModulator;", "uniform vec4 ColorModulator;\nuniform float ZenithSaturation;")
               .replace(
                  "out vec4 fragColor;",
                  "out vec4 fragColor;\n\nvec3 zenith_apply_saturation(vec3 color) {\n    float amount = max(ZenithSaturation, 0.0);\n    float luma = dot(color, vec3(0.299, 0.587, 0.114));\n    float boost = max(amount - 1.0, 0.0);\n    vec3 saturated = mix(vec3(luma), color, amount);\n    return clamp(saturated * (1.0 + boost * 0.35), 0.0, 1.0);\n}\n"
               );
            return COLOR_SAMPLE.matcher(s1).replaceFirst("$1\n    color.rgb = zenith_apply_saturation(color.rgb);");
         }
      } else {
         return s;
      }
   }
}
