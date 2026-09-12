package Nursultan;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

public class class11770 implements class11758 {
   class11770() {
   }

   @Override
   public byte[] N(String var1) throws IOException {
      byte[] var3;
      try (InputStream var2 = class11911.L(var1).method_14482()) {
         var3 = IOUtils.toByteArray(var2);
      }

      return var3;
   }
}
