package oxxxde;

// $VF: Compiled from heavy
public class حِ extends جأ {
   private static final long serialVersionUID = -6809337209489732866L;

   public حِ(Exception e) {
      super(
         "Load library content error.",
         "Cannot load library content. Reason:\n".concat(e.getMessage()),
         new String[]{"Error in content loader", "Inability to access content", "Another error"},
         new String[]{
            "Make sure your content loader is working properly (if you are using a custom loader)",
            "Make sure you store or have access to the library content",
            "Check out the details"
         }
      );
   }
}
