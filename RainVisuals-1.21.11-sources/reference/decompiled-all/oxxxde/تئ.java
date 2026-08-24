package oxxxde;

import java.util.function.Function;

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

   public ذذ<T> createShaderLibraryBuilder(بِ... snippets) {
      return new ذذ<>(this.shaderLibraryContentGetter, snippets);
   }

   public حخ<T> createProgramBuilder(بِ... snippets) {
      return new حخ<>(this, snippets);
   }

   public خإ createGlslFileEntry(String path, T name) {
      return new خإ(name, this.glslContentGetter.apply(path));
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
