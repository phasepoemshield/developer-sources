package Nursultan;

import com.github.luben.zstd.Zstd;

public class class11509 {
   public static Object N_0;

   private class11509() {
   }

   static {
      y();
   }

   private static void y() {
      N_0 = 9;
   }

   public static byte[] y(byte[] var0) {
      return Zstd.compress(var0, 9);
   }

   public static byte[] N(byte[] var0) {
      long var1 = Zstd.getFrameContentSize(var0);
      return var1 <= 0L ? Zstd.decompress(var0, (int)Math.max((long)var0.length * 10L, 4096L)) : Zstd.decompress(var0, (int)var1);
   }
}
