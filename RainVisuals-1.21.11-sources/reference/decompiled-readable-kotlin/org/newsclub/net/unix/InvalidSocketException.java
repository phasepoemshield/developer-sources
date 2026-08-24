package org.newsclub.net.unix;

import java.net.SocketException;

// $VF: Compiled from InvalidSocketException.java
public class InvalidSocketException extends SocketException {
   private static final long serialVersionUID = 1L;

   public InvalidSocketException() {
   }

   public InvalidSocketException(String msg) {
      super(msg);
   }
}
