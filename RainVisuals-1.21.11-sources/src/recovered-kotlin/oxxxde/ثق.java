package oxxxde;

// $VF: Compiled from heavy
public class ثق extends جأ {
   private static final long serialVersionUID = 8335265683030650497L;

   public ثق(String missingElements) {
      super(
         "Bad vertex structure.",
         "Missing elements in vertex: " + missingElements,
         new String[]{"When building vertex in VertexBuilder, you missed one or more elements."},
         new String[]{"Check your vertex building method and fix it."}
      );
   }
}
