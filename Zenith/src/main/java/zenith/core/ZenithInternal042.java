package zenith;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

class ZenithInternal042 {
   public static byte[] EventTarget(byte[] abyte) throws IOException {
      ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
      Deflater deflater = ConnectThread();
      DeflaterOutputStream deflateroutputstream = new DeflaterOutputStream(bytearrayoutputstream, deflater);
      deflateroutputstream.write(abyte, 0, abyte.length);
      deflateroutputstream.close();
      deflater.end();
      return bytearrayoutputstream.toByteArray();
   }

   private static Deflater ConnectThread() {
      return new Deflater(-1, true);
   }
}
