package oxxxde;

// $VF: Compiled from heavy
public class حب extends جأ {
   private static final long serialVersionUID = 2211120929779008363L;

   public حب() {
      super(
         "VertexBuilder overflow.",
         String.format("The number of vertices in VertexBuilder exceeded the maximum value (%s).", 16777215),
         new String[]{"You may be adding vertices in an infinite loop.", "You're a monster who managed to manually exceed the maximum number of vertices."},
         new String[]{"Check the method where you add vertices to VertexBuilder and fix it."}
      );
   }
}
