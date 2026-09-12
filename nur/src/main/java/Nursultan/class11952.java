package Nursultan;

import io.netty.buffer.ByteBuf;

public class class11952 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;

   private class11952() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      i();
   }

   private static void i() {
      N_0 = 5;
      N_1 = 127;
      N_2 = 128;
      N_3 = 7;
   }

   public static int N(ByteBuf var0) {
      int var1 = 0;
      int var2 = 0;

      byte var3;
      do {
         var3 = var0.readByte();
         var1 |= (var3 & 127) << var2 * 7;
         if (++var2 > 5) {
            throw new RuntimeException("VarInt too big");
         }
      } while (N(var3));

      return var1;
   }

   public static boolean N(byte var0) {
      return (var0 & 128) == 128;
   }

   public static ByteBuf N(ByteBuf var0, int var1) {
      while ((var1 & -128) != 0) {
         var0.writeByte(var1 & 127 | 128);
         var1 >>>= 7;
      }

      var0.writeByte(var1);
      return var0;
   }
}
