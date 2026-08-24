package oxxxde;

// $VF: Compiled from heavy
public class ظك extends جأ {
   private static final long serialVersionUID = 4302183795332301227L;

   public ظك(String message) {
      super(
         "Illegal argument in program pass builder.",
         message,
         new String[]{
            "You did not specify all the required arguments before building program pass builder", "The argument you specified in program pass builder is null"
         },
         new String[]{
            "Check if you are specifying all arguments when building program pass builder.", "Check if you are not passing any arguments that are null."
         }
      );
   }
}
