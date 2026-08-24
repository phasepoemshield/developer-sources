package org.newsclub.net.unix;

import java.net.SocketException;

// $VF: Compiled from ConnectionResetSocketException.java
public final class ConnectionResetSocketException extends SocketException {
   private static final long serialVersionUID = 1L;

   public ConnectionResetSocketException() {
   }

   public ConnectionResetSocketException(String msg) {
      super(msg);
   }
}
