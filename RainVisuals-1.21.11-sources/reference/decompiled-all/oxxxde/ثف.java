package oxxxde;

// $VF: Compiled from heavy
public class ثف extends جأ {
   private static final long serialVersionUID = -1616138098256794198L;

   public ثف(int givenTarget, int requiredTaget) {
      super(
         "Wrong gpu buffer target.",
         String.format("The received gpu buffer has target '%s', but '%s' was expected..", givenTarget, requiredTaget),
         new String[]{"You are giving the method that caused the error an wrong gpu buffer"},
         new String[]{"Recheck the method call that caused the error and fix the buffer issue"}
      );
   }
}
