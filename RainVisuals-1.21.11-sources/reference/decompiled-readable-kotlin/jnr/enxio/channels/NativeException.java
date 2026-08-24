package jnr.enxio.channels;

import java.io.IOException;
import jnr.constants.platform.Errno;

// $VF: Compiled from NativeException.java
public class NativeException extends IOException {
   private final Errno errno;

   public Errno getErrno() {
      return this.errno;
   }

   public NativeException(String message, Errno errno) {
      super(message);
      this.errno = errno;
   }
}
