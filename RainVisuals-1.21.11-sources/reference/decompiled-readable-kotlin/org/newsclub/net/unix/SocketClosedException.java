package org.newsclub.net.unix;

import java.net.SocketException;

// $VF: Compiled from SocketClosedException.java
public final class SocketClosedException extends SocketException {
   private static final long serialVersionUID = 1L;

   public SocketClosedException(String msg) {
      super(msg);
   }

   public SocketClosedException() {
   }
}
