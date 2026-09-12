package Nursultan;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.jspecify.annotations.Nullable;
import org.lwjgl.stb.STBIWriteCallback;

public class class10939 extends STBIWriteCallback {
   private final WritableByteChannel N;
   @Nullable
   private IOException y;

   public void invoke(long var1, long var3, int var5) {
      ByteBuffer var6 = getData(var3, var5);

      try {
         this.N.write(var6);
      } catch (IOException var8) {
         this.y = var8;
      }
   }

   public class10939(WritableByteChannel var1) {
      this.N = var1;
   }

   public void N() throws IOException {
      if (this.y != null) {
         throw this.y;
      }
   }
}
