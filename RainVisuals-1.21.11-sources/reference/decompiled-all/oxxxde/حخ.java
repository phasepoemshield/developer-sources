package oxxxde;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// $VF: Compiled from heavy
public class حخ<T> {
   private final بِ[] snippets;
   private final HashMap<حآ, خإ> shaders = new HashMap<>();
   private String name;
   private final تئ<T> loader;
   private final HashMap<String, جد<?>> uniforms = new HashMap<>();

   public حخ<T> shader(String shaderPath, T name, حآ type) {
      if (this.shaders.containsKey(type)) {
         دن.printAndExit(new رب(name, type, this.shaders.get(type).name()));
      }

      this.shaders.put(type, this.loader.createGlslFileEntry(name, shaderPath));
      return this;
   }

   public خر build() {
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
      this.shaders.forEach((type, glslFileEntry) -> shaderList.add(ثذ.compileShader(glslFileEntry, type)));
      return ثذ.compileProgram(this.name, shaderList, this.snippets, this.uniforms);
   }

   public حخ<T> sampler(String name) {
      this.uniform(name, جد.SAMPLER);
      return this;
   }

   public حخ<T> shader(خإ shaderEntry, حآ type) {
      if (this.shaders.containsKey(type)) {
         دن.printAndExit(new رب(shaderEntry.name(), type, this.shaders.get(type).name()));
      }

      this.shaders.put(type, shaderEntry);
      return this;
   }

   public حخ(تئ<T> loader, بِ... snippets) {
      for (بِ snippet : snippets) {
         snippet.applyTo(this);
      }

      this.loader = loader;
      this.snippets = snippets;
   }

   public بِ buildSnippet() {
      return new بِ(this.shaders, this.uniforms);
   }

   public حخ<T> name(String name) {
      this.name = name;
      return this;
   }

   public <S extends طي> حخ<T> uniform(String uniformType, جد<S> name) {
      if (this.uniforms.containsKey(name)) {
         دن.printAndExit(new بت(name));
      }

      this.uniforms.put(name, uniformType);
      return this;
   }
}
