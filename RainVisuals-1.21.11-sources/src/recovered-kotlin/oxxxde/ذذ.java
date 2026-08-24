package oxxxde;

import java.util.HashMap;
import java.util.function.Function;
import kotakbaz.rain.client.render.main.compile.GlShaderLibrary;
import kotakbaz.rain.client.render.main.program.uniform.a;

// $VF: Compiled from heavy
public class ذذ<T> {
   private final HashMap<String, a<?>> uniforms = new HashMap<>();
   private String name;
   private T libraryPath;
   private final Function<T, String> contentGetter;

   public ذذ(Function<T, String> contentGetter, kotakbaz.rain.client.render.main.program.a... snippets) {
      for (kotakbaz.rain.client.render.main.program.a snippet : snippets) {
         snippet.uniforms().forEach(this::uniform);
      }

      this.contentGetter = contentGetter;
   }

   public ذذ<T> sampler(String name) {
      this.uniform(name, a.SAMPLER);
      return this;
   }

   public GlShaderLibrary build() {
      if (this.name == null) {
         دن.printAndExit(new حج("Missing name in shader library builder."));
      }

      if (this.libraryPath == null) {
         دن.printAndExit(new حج(String.format("Missing libraryPath in library '%s'.", this.name)));
      }

      return new GlShaderLibrary(new kotakbaz.rain.client.render.main.compile.a(this.name, this.contentGetter.apply(this.libraryPath)), this.uniforms);
   }

   public ذذ<T> name(String name) {
      this.name = name;
      return this;
   }

   public ذذ<T> library(T libraryPath) {
      this.libraryPath = libraryPath;
      return this;
   }

   public <S extends طي> ذذ<T> uniform(String uniformType, a<S> name) {
      if (this.uniforms.containsKey(name)) {
         دن.printAndExit(new بت(name));
      }

      this.uniforms.put(name, uniformType);
      return this;
   }
}
