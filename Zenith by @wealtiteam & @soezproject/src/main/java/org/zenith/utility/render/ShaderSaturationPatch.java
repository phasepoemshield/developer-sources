package org.zenith.utility.render;

import java.util.regex.Pattern;

/**
 * Regexes used by the saturation shader patches.
 *
 * <p>They live outside the mixin classes on purpose: mixin copies static fields
 * into the target class but does not carry the mixin's static initialiser along,
 * so a {@code Pattern.compile(...)} field declared inside a mixin would read back
 * as null at runtime.
 */
public final class ShaderSaturationPatch {
   /** Matches the vanilla `vec4 color = texture(Sampler0, texCoord0);` line. */
   public static final Pattern COLOR_SAMPLE = Pattern.compile("(?m)^(\\s*vec4\\s+color\\s*=\\s*texture\\(Sampler0\\s*,\\s*texCoord0\\)[^;]*;)");
   /** Matches Sodium's `diffuseColor *= v_Color;` line. */
   public static final Pattern DIFFUSE_COLOR = Pattern.compile("(?m)^(\\s*diffuseColor\\s*\\*=\\s*v_Color\\s*;)");

   private ShaderSaturationPatch() {
   }
}
