package Nursultan;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import minecraft.class01834;
import minecraft.class07321;
import minecraft.class07357;

public class class10739 extends ByteArrayOutputStream {
   private final class07321 y;

   public class10739(class07357 var1, class07321 var2) {
      super(8096);
      this.N = var1;
      super.write(0);
      super.write(0);
      super.write(0);
      super.write(0);
      super.write(var1.L.y());
      this.y = var2;
   }

   @Override
   public void close() throws IOException {
      ByteBuffer var1 = ByteBuffer.wrap(this.buf, 0, this.count);
      int var2 = this.count - 5 + 1;
      class01834.M.y(this.N.y, this.y, this.N.L, var2);
      var1.putInt(0, var2);
      this.N.N(this.y, var1);
   }
}
