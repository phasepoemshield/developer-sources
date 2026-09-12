package Nursultan;

import org.joml.Vector2f;
import org.joml.Vector4f;

public class class11609 {
   public static Object N_0 = new class11609()::N;

   private static void L() {
      N_0 = null;
   }

   private class11609() {
   }

   static {
      y();
      N();
      L();
   }

   private static void y() {
   }

   private static class09991 N(class11613 var0) {
      Vector2f var1 = var0.y().L();
      return var1 == null ? class09991.N : class09991.N().N(class09969.FLOATING).U(var1.x).E(var1.y);
   }

   private static void N() {
   }

   private class09798 N(class11613 var1, class09809 var2) {
      class11598<? super class11613> var3 = (class11598<? super class11613>)(var1.R() == null ? (class11623)class11623.L_0 : var1.R());
      return class09778.N(class09991.N(var1.i(), N(var1)), var3x -> {
         var3x.N(var1.N());
         var3x.N(var1.M());
         var3x.N(class09867.POINTER_DOWN, var2xx -> var3.L(var2xx, var1));
         var3x.N(class09867.POINTER_UP, var2xx -> var3.N(var2xx, var1));
         var3x.N(class09867.POINTER_MOVE, var2xx -> var3.y(var2xx, var1));
         var1.B().accept(var3x, var2);
      });
   }

   public static class09785<Vector2f> N(class09785<Vector4f> var0) {
      Vector2f var1 = new Vector2f();
      return new class11638(var0, var1);
   }
}
