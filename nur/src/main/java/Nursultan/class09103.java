package Nursultan;

import minecraft.class00405;
import minecraft.class00949;
import minecraft.class01590;
import minecraft.class01923;
import minecraft.class05272;
import minecraft.class06202;
import minecraft.class09006;

public class class09103 {
   public static Object N_0;
   public static Object N_1;

   private class09103() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      N();
   }

   public static class09091 N(int var0, class00405 var1) {
      class00405 var2 = var1 == null ? class00405.N : var1;
      if (!(((class01590)class06202.Nq().i_3).N(var0, var2) instanceof class05272 var4) || var4.N() == class01923.field_37899) {
         return null;
      }

      if (var4.u instanceof class09006 var5 && !var5.isClosed()) {
         return new class09091(var5.texture().N(), var4.i, var4.M, var4.R, var4.B, var4.Z, var4.z, var4.U, var4.E, var4.N().N(var2.L()));
      }

      return null;
   }

   private static void N() {
      N_0 = 9.0F;
      N_1 = 7.0F;
   }

   public static boolean N(class00405 var0) {
      if (var0 == null) {
         return false;
      } else {
         class00949 var1 = var0.E();
         return var1 != class00949.y && !class00949.y.equals(var1);
      }
   }

   public static boolean N(int var0) {
      return var0 >= 57344 && var0 <= 63743 || var0 >= 983040 && var0 <= 1048573 || var0 >= 1048576 && var0 <= 1114109;
   }
}
