package org.newsclub.net.unix;

import java.net.SocketException;

// $VF: Compiled from BrokenPipeSocketException.java
public final class BrokenPipeSocketException extends SocketException {
   private static final long serialVersionUID = 1L;

   public BrokenPipeSocketException() {
   }

   public BrokenPipeSocketException(String msg) {
      super(msg);
   }
}
