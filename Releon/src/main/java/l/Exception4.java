package l;

import java.io.IOException;

final class Exception4 extends RuntimeException {
   Exception4(IOException var1) {
      super(var1);
   }

   public synchronized IOException method1181() {
      return (IOException)super.getCause();
   }
}
