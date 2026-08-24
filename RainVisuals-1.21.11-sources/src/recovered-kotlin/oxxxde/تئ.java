package oxxxde;

import java.util.function.Function;
import kotakbaz.rain.client.render.main.builders.GlProgramBuilder;
import kotakbaz.rain.client.render.main.program.a;

// $VF: Compiled from ChromaLoader.java
public abstract class تئ<T> {
   private final Function<T, String> shaderLibraryContentGetter;
   private final Function<T, String> glslContentGetter = path -> {
      String content = null;

      try {
         content = this.getContent(path);
      } catch (Exception var4) {
         دن.printAndExit(new خ(var4));
      }

      return content;
   };

   public ذذ<T> createShaderLibraryBuilder(a... snippets) {
      return new ذذ<>(this.shaderLibraryContentGetter, snippets);
   }

   public GlProgramBuilder<T> createProgramBuilder(a... snippets) {
      return new GlProgramBuilder<>(this, snippets);
   }

   public kotakbaz.rain.client.render.main.compile.a createGlslFileEntry(String path, T name) {
      return new kotakbaz.rain.client.render.main.compile.a(name, this.glslContentGetter.apply(path));
   }

   public abstract String getContent(T var1) throws Exception;

   public تئ() {
      this.shaderLibraryContentGetter = path -> {
         String content = null;

         try {
            content = this.getContent(path);
         } catch (Exception var4) {
            دن.printAndExit(new حِ(var4));
         }

         return content;
      };
   }
}
