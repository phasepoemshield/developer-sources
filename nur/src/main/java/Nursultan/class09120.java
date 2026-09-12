package Nursultan;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class class09120 {
   private static String[] L;
   public static Object N_0;

   private static void L() {
      N_0 = (byte)1;
   }

   private class09120() {
      throw new UnsupportedOperationException(L[1]);
   }

   static {
      y();
      L();
   }

   private static void y() {
      L = new String[2];
      L[0] = "Unable to write Microsoft account data.";
      L[1] = "This is a utility class and cannot be instantiated";
   }

   public static String N(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         try {
            String var2;
            try (DataInputStream var1 = new DataInputStream(new ByteArrayInputStream(var0))) {
               var1.readByte();
               var2 = var1.readUTF();
            }

            return var2;
         } catch (IOException var6) {
            return null;
         }
      } else {
         return null;
      }
   }

   public static byte[] N(String var0) {
      try {
         byte[] var3;
         try (
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            DataOutputStream var2 = new DataOutputStream(var1);
         ) {
            var2.writeByte(1);
            var2.writeUTF(var0);
            var3 = var1.toByteArray();
         }

         return var3;
      } catch (IOException var9) {
         throw new IllegalStateException(L[0], var9);
      }
   }
}
