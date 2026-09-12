package Nursultan;

import java.io.IOException;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;

public class class11529 {
   private class11529() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static void N(class11488 var0, byte[] var1) throws IOException {
      MessageUnpacker var3 = MessagePack.newDefaultUnpacker(class11509.N(var1));

      try {
         var0.N(var3);
      } catch (Throwable var7) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (var3 != null) {
         var3.close();
      }
   }

   public static byte[] N(class11488 var0) throws IOException {
      MessageBufferPacker var1 = MessagePack.newDefaultBufferPacker();

      byte[] var2;
      try {
         var0.y(var1);
         var2 = class11509.y(var1.toByteArray());
      } catch (Throwable var5) {
         if (var1 != null) {
            try {
               var1.close();
            } catch (Throwable var4) {
               var5.addSuppressed(var4);
            }
         }

         throw var5;
      }

      if (var1 != null) {
         var1.close();
      }

      return var2;
   }
}
