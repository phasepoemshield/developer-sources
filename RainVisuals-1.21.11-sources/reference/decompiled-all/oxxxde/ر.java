package oxxxde;

// $VF: Compiled from heavy
public class ر {
   private اي decompileMode;
   private زٌ loader;
   private String name = null;

   private void checkArguments() {
      if (this.name == null) {
         throw new IllegalArgumentException("Name cannot be null.");
      }

      if (this.loader == null) {
         throw new IllegalArgumentException(String.format("Loader in gif '%s' cannot be null.", this.name));
      }

      if (this.decompileMode == null) {
         throw new IllegalArgumentException(String.format("DecompileMode in gif '%s' cannot be null.", this.name));
      }
   }

   public ر loader(زٌ loader) {
      this.loader = loader;
      return this;
   }

   public static ر builder() {
      return new ر();
   }

   public ر decompileMode(اي decompileMode) {
      this.decompileMode = decompileMode;
      return this;
   }

   public ر name(String name) {
      this.name = name;
      return this;
   }

   public ار build() {
      try {
         this.checkArguments();
         return ار.of(this.name, this.loader.load(this.decompileMode));
      } catch (Exception e) {
         throw new UnsupportedOperationException(e);
      }
   }

   private ر() {
      this.loader = null;
   }
}
