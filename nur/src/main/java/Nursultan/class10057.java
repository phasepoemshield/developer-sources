package Nursultan;

public final class class10057 {
   public static final int N = 0;
   public static final int y = 1;
   public static final int L = 2;
   public static final int u = 4;
   public static final int i = 8;

   private class10057() {
   }

   public static int y(int var0, int var1) {
      int var2 = var0 | var1;
      if (N(var2, 2) || N(var2, 4) || N(var2, 8)) {
         var2 |= 1;
      }

      return var2;
   }

   public static boolean N(int var0, int var1) {
      return (var0 & var1) == var1;
   }
}
