package Nursultan;

public final class class10019 {
   public static boolean L(class10021 var0) {
      if (var0 == null) {
         return false;
      } else {
         class09969 var1 = var0.o().s();
         return var1 == class09969.FLOATING || var1 == class09969.FIXED;
      }
   }

   private class10019() {
   }

   public static boolean y(class10021 var0) {
      return var0 == null ? false : var0.o().s() == class09969.FLOW;
   }

   public static boolean N(class10021 var0) {
      return var0 != null && var0.o().s() == class09969.FIXED;
   }
}
