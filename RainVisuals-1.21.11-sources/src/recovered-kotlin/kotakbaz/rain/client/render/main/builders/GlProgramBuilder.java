package kotakbaz.rain.client.render.main.builders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotakbaz.rain.client.render.main.compile.b;
import kotakbaz.rain.client.render.main.program.GlProgram;
import kotakbaz.rain.client.render.main.program.uniform.a;
import oxxxde.بت;
import oxxxde.تئ;
import oxxxde.حآ;
import oxxxde.دن;
import oxxxde.رب;
import oxxxde.رر;
import oxxxde.شٌ;
import oxxxde.طي;

// $VF: Compiled from heavy
public class GlProgramBuilder<T> {
   private final kotakbaz.rain.client.render.main.program.a[] snippets;
   private final HashMap<حآ, kotakbaz.rain.client.render.main.compile.a> shaders = new HashMap<>();
   private String name;
   private final تئ<T> loader;
   private final HashMap<String, a<?>> uniforms = new HashMap<>();

   public GlProgramBuilder<T> shader(String shaderPath, T name, حآ type) {
      if (this.shaders.containsKey(type)) {
         دن.printAndExit(new رب(name, type, this.shaders.get(type).name()));
      }

      this.shaders.put(type, this.loader.createGlslFileEntry(name, shaderPath));
      return this;
   }

   public GlProgram build() {
      if (this.name == null) {
         دن.printAndExit(new شٌ("Missing name in program builder."));
      }

      if (!this.shaders.containsKey(حآ.Compute)) {
         if (!this.shaders.containsKey(حآ.Vertex)) {
            دن.printAndExit(new شٌ(String.format("Missing vertex shader in program '%s'.", this.name)));
         }

         if (!this.shaders.containsKey(حآ.Fragment)) {
            دن.printAndExit(new شٌ(String.format("Missing fragment shader in program '%s'.", this.name)));
         }
      }

      List<رر> shaderList = new ArrayList();
      this.shaders.forEach((type, glslFileEntry) -> shaderList.add(b.compileShader(glslFileEntry, type)));
      return b.compileProgram(this.name, shaderList, this.snippets, this.uniforms);
   }

   public GlProgramBuilder<T> sampler(String name) {
      this.uniform(name, a.SAMPLER);
      return this;
   }

   public GlProgramBuilder<T> shader(kotakbaz.rain.client.render.main.compile.a shaderEntry, حآ type) {
      if (this.shaders.containsKey(type)) {
         دن.printAndExit(new رب(shaderEntry.name(), type, this.shaders.get(type).name()));
      }

      this.shaders.put(type, shaderEntry);
      return this;
   }

   public GlProgramBuilder(تئ<T> loader, kotakbaz.rain.client.render.main.program.a... snippets) {
      for (kotakbaz.rain.client.render.main.program.a snippet : snippets) {
         snippet.applyTo(this);
      }

      this.loader = loader;
      this.snippets = snippets;
   }

   public kotakbaz.rain.client.render.main.program.a buildSnippet() {
      return new kotakbaz.rain.client.render.main.program.a(this.shaders, this.uniforms);
   }

   public GlProgramBuilder<T> name(String name) {
      this.name = name;
      return this;
   }

   public <S extends طي> GlProgramBuilder<T> uniform(String uniformType, a<S> name) {
      if (this.uniforms.containsKey(name)) {
         دن.printAndExit(new بت(name));
      }

      this.uniforms.put(name, uniformType);
      return this;
   }
}
