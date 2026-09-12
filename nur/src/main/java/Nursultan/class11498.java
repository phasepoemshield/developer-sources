package Nursultan;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class class11498 {
   private class11498() {
   }

   private static byte[] N(long var0) {
      try {
         return MessageDigest.getInstance("SHA-256").digest(("nursultan-storage-xor-v1:" + var0).getBytes());
      } catch (NoSuchAlgorithmException var3) {
         throw new IllegalStateException("SHA-256 unavailable", var3);
      }
   }

   public static byte[] N(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         byte[] var1 = N((long)((class11472)class11938.L_2).M());
         byte[] var2 = new byte[var0.length];

         for (int var3 = 0; var3 < var0.length; var3++) {
            var2[var3] = (byte)(var0[var3] ^ var1[var3 % var1.length]);
         }

         return var2;
      } else {
         return var0;
      }
   }
}
