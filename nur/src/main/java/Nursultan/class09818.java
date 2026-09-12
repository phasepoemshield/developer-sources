package Nursultan;

final class class09818 {
   private static final float N = 0.001F;

   private class09818() {
   }

   private static class10003 N(class10003 var0, class10003 var1, class10003 var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      boolean var9 = var3 + var5 <= var8;
      boolean var10 = var4 >= 0.0F;
      if (var0 == var1) {
         if (var9) {
            return var1;
         } else if (var10) {
            return var2;
         } else {
            return var6 > var7 ? var2 : var1;
         }
      } else if (var10) {
         return var2;
      } else if (var9) {
         return var1;
      } else {
         return var7 > var6 ? var1 : var2;
      }
   }

   private static float N(float var0, float var1, float var2) {
      float var3 = Math.max(0.0F, var2 - var1);
      return class09693.N(var0, 0.0F, var3);
   }

   private static void N(class10021 var0, float var1, float var2) {
      class09937 var3 = var0.c();
      var3.L(var3.y() + var1, var3.L() + var2);
      var3.N(var3.R() + var1, var3.M() + var2, var3.B(), var3.Z());

      for (int var4 = 0; var4 < var0.u(); var4++) {
         class10021 var5 = var0.N(var4);
         if (!class10019.N(var5)) {
            N(var5, var1, var2);
         }
      }
   }

   private static boolean N(float var0, float var1) {
      return Math.abs(var0 - var1) <= 0.001F;
   }

   static boolean N(class10021 var0, class09849 var1, float var2, float var3) {
      class09980 var4 = var0.o();
      class09937 var5 = var0.c();
      class09802 var6 = N(var4.D(), var4.h(), var4.r(), var4.NN(), var4.Ny(), var1, var5.u(), var5.i(), Math.max(0.0F, var2), Math.max(0.0F, var3));
      float var7 = var6.N() - var5.y();
      float var8 = var6.y() - var5.L();
      if (N(var7, 0.0F) && N(var8, 0.0F)) {
         return false;
      } else {
         N(var0, var7, var8);
         var0.u(1);
         return true;
      }
   }

   static class09802 N(
      class10003 var0, float var1, class09973 var2, boolean var3, boolean var4, class09849 var5, float var6, float var7, float var8, float var9
   ) {
      class10003 var10 = var3 ? N(var0, var1, var5, var6, var7, var8, var9) : var0;
      float var11;
      float var12;
      switch (var10) {
         case TOP:
            var12 = var5.y() + var1;
            var11 = N(var2, var5.i(), var5.M(), var6);
            break;
         case BOTTOM:
            var12 = var5.R() - var1 - var7;
            var11 = N(var2, var5.i(), var5.M(), var6);
            break;
         case LEFT:
            var11 = var5.N() + var1;
            var12 = N(var2, var5.R(), var5.B(), var7);
            break;
         case RIGHT:
            var11 = var5.i() - var1 - var6;
            var12 = N(var2, var5.R(), var5.B(), var7);
            break;
         default:
            throw new IllegalStateException("Unhandled side: " + var10);
      }

      if (var4) {
         var11 = N(var11, var6, var8);
         var12 = N(var12, var7, var9);
      }

      return new class09802(var11, var12, var10);
   }

   private static float N(class09973 var0, float var1, float var2, float var3) {
      return switch (var0) {
         case START -> var1;
         case CENTER -> var1 + (var2 - var3) * 0.5F;
         case END -> var1 + var2 - var3;
      };
   }

   private static class10003 N(class10003 var0, float var1, class09849 var2, float var3, float var4, float var5, float var6) {
      return switch (var0) {
         case TOP, BOTTOM -> N(
         var0, class10003.BOTTOM, class10003.TOP, var2.y() + var1, var2.R() - var1 - var4, var4, var2.R(), Math.max(0.0F, var6 - var2.y()), var6
      );
         case LEFT, RIGHT -> N(
         var0, class10003.RIGHT, class10003.LEFT, var2.N() + var1, var2.i() - var1 - var3, var3, var2.i(), Math.max(0.0F, var5 - var2.N()), var5
      );
      };
   }
}
