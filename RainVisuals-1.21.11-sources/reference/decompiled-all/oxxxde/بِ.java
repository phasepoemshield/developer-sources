package oxxxde;

import java.util.HashMap;

// $VF: Compiled from heavy
public record بِ(HashMap<حآ, خإ> shaders, HashMap<String, جد<?>> uniforms) {
   public <T> void applyTo(حخ<T> builder) {
      this.shaders.forEach((type, glslFileEntry) -> builder.shader(glslFileEntry, type));
      this.uniforms.forEach(builder::uniform);
   }
}
