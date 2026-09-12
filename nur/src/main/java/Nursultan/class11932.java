package Nursultan;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class class11932 {
   public static Object N_0;
   public Object y_0;
   public Object y_1;

   private void L() {
   }

   public class11932() {
      this.L();
      this.y_0 = new class11926();
      this.y_1 = new class11485();
   }

   static {
      i();
      byte[] var128 = new byte[]{79, 103, 103, 83};
      N_0 = var128;
   }

   private static void i() {
   }

   public class11885 N(InputStream var1) throws Exception {
      BufferedInputStream var2 = var1 instanceof BufferedInputStream ? (BufferedInputStream)var1 : new BufferedInputStream(var1);
      return (this.N(var2) ? (class11463)this.y_0 : (class11463)this.y_1).N(var2);
   }

   private boolean N(BufferedInputStream var1) throws IOException {
      var1.mark(((byte[])N_0).length);
      byte[] var2 = new byte[((byte[])N_0).length];
      int var3 = var1.readNBytes(var2, 0, var2.length);
      var1.reset();
      return var3 == ((byte[])N_0).length && Arrays.equals(var2, (byte[])N_0);
   }
}
