package Nursultan;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.List;

public class class09370 extends ByteToMessageDecoder {
   public Object N_0;
   public static Object y_0 = InternalLoggerFactory.getInstance(String.class);

   public class09370(class11964 var1) {
      this.u();
      this.N_0 = var1;
   }

   static {
      R();
   }

   public void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) {
      if (var2.isReadable()) {
         class11959 var4 = (class11959)var1.channel().attr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_2).get();
         if (var4 == null) {
            throw new IllegalStateException("ProtocolType unknown for inbound frame");
         } else {
            int var5 = N(var1);
            int var6 = -1;

            try {
               var6 = class11952.N(var2);
               class11951<?> var7 = var4.N((class11964)this.N_0, var6, var5);
               if (var7 == null) {
                  ((InternalLogger)y_0)
                     .warn("Skipping unsupported packet id {} ({}/{}, protocol version {})", new Object[]{var6, var4.name(), (class11964)this.N_0, var5});
                  var2.skipBytes(var2.readableBytes());
                  return;
               }

               var7.y(new class11940(var2, (short)var5));
               int var8 = var2.readableBytes();
               if (var8 > 0) {
                  ((InternalLogger)y_0)
                     .warn("Packet {}/{} ({}) left {} extra bytes, skipping tail", new Object[]{var4.name(), var6, var7.getClass().getSimpleName(), var8});
                  var2.skipBytes(var8);
               }

               var3.add(var7);
            } catch (Exception var9) {
               ((InternalLogger)y_0)
                  .error(
                     "Failed to decode packet id {} ({}/{}, protocol version {}), skipping frame",
                     new Object[]{var6, var4.name(), (class11964)this.N_0, var5, var9}
                  );
               var2.skipBytes(var2.readableBytes());
            }
         }
      }
   }

   private void u() {
   }

   private static int N(ChannelHandlerContext var0) {
      Short var1 = (Short)var0.channel().attr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_3).get();
      return var1 != null ? var1 : 16;
   }

   private static void R() {
      y_0 = null;
   }
}
