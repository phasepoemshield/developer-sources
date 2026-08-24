package kotakbaz.rain.client.render.main.program;

import java.util.HashMap;
import kotakbaz.rain.client.render.main.builders.GlProgramBuilder;
import oxxxde.حآ;

// $VF: Compiled from heavy
public record a(
   HashMap<حآ, kotakbaz.rain.client.render.main.compile.a> shaders, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniforms
) {
   public <T> void applyTo(GlProgramBuilder<T> builder) {
      this.shaders.forEach((type, glslFileEntry) -> builder.shader(glslFileEntry, type));
      this.uniforms.forEach(builder::uniform);
   }
}
