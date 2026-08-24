package oxxxde;

// $VF: Compiled from heavy
public class تة<T> {
   private T path;
   private String name = null;
   private جش wrapping;
   private زآ filtering;
   private final ثؤ<T> loader;
   private ضو colorMode;

   public تة<T> colorMode(ضو colorMode) {
      this.colorMode = colorMode;
      return this;
   }

   private void checkArguments() {
      if (this.name == null) {
         throw new IllegalArgumentException("Name cannot be null.");
      }

      if (this.loader == null) {
         throw new IllegalArgumentException(String.format("Loader in texture '%s' cannot be null.", this.name));
      }

      if (this.path == null) {
         throw new IllegalArgumentException(String.format("Path in texture '%s' cannot be null.", this.name));
      }

      if (this.colorMode == null) {
         throw new IllegalArgumentException(String.format("ColorMode in texture '%s' cannot be null.", this.name));
      }

      if (this.filtering == null) {
         throw new IllegalArgumentException(String.format("TextureFiltering in texture '%s' cannot be null.", this.name));
      }

      if (this.wrapping == null) {
         throw new IllegalArgumentException(String.format("TextureWrapping in texture '%s' cannot be null.", this.name));
      }
   }

   public تة(ثؤ<T> loader) {
      this.path = null;
      this.colorMode = ضو.RGBA;
      this.filtering = null;
      this.wrapping = null;
      this.loader = loader;
   }

   public تة<T> wrapping(جش wrapping) {
      this.wrapping = wrapping;
      return this;
   }

   public ض build() {
      try {
         this.checkArguments();
         return ض.of(this.name, this.loader.load(this.path, this.colorMode, this.filtering, this.wrapping));
      } catch (Exception e) {
         throw new UnsupportedOperationException(e);
      }
   }

   public تة<T> name(String name) {
      this.name = name;
      return this;
   }

   public تة<T> path(T path) {
      this.path = path;
      return this;
   }

   public تة<T> filtering(زآ filtering) {
      this.filtering = filtering;
      return this;
   }
}
