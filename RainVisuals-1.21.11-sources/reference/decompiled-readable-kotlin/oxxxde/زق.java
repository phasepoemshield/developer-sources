package oxxxde;

// $VF: Compiled from heavy
public class زق extends جأ {
   private static final long serialVersionUID = -3115145506278122458L;

   public زق(String shaderName, String reason) {
      super(
         "Compile shader error",
         String.format("Error compiling shader '%s', reason:\n%s", shaderName, reason),
         new String[]{"Error in shader structure", "Out of GPU Memory (Very Rare)"},
         new String[]{
            "Check the shader structure for errors and fix them",
            "Make sure you are not overloading the GPU memory (e.g. by loading something into the GPU in a infinity loop)"
         }
      );
   }
}
