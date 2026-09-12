package Nursultan;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.nio.charset.StandardCharsets;

public class class10792 {
   private class10792() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static String N(ByteBuf var0, int var1) {
      int var2 = ByteBufUtil.utf8MaxBytes(var1);
      int var3 = class11952.N(var0);
      if (var3 > var2) {
         throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + var3 + " > " + var2 + ")");
      } else if (var3 < 0) {
         throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
      } else {
         int var4 = var0.readableBytes();
         if (var3 > var4) {
            throw new DecoderException("Not enough bytes in buffer, expected " + var3 + ", but got " + var4);
         } else {
            String var5 = var0.toString(var0.readerIndex(), var3, StandardCharsets.UTF_8);
            var0.skipBytes(var3);
            if (var5.length() > var1) {
               throw new DecoderException("The received string length is longer than maximum allowed (" + var5.length() + " > " + var1 + ")");
            } else {
               return var5;
            }
         }
      }
   }

   public static void N(ByteBuf var0, CharSequence var1, int var2) {
      int var3 = var1.length();
      if (var3 > var2) {
         throw new EncoderException("String too big (was " + var3 + " characters, max " + var2 + ")");
      } else {
         int var4 = ByteBufUtil.utf8MaxBytes(var1);
         ByteBuf var5 = var0.alloc().buffer(var4);

         try {
            int var6 = ByteBufUtil.writeUtf8(var5, var1);
            int var7 = ByteBufUtil.utf8MaxBytes(var2);
            if (var6 > var7) {
               throw new EncoderException("String too big (was " + var6 + " bytes encoded, max " + var7 + ")");
            }

            class11952.N(var0, var6);
            var0.writeBytes(var5);
         } finally {
            var5.release();
         }
      }
   }
}
