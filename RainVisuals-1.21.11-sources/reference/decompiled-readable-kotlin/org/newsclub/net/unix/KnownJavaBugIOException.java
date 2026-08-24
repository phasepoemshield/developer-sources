package org.newsclub.net.unix;

import java.io.IOException;

// $VF: Compiled from KnownJavaBugIOException.java
public class KnownJavaBugIOException extends IOException {
   private static final long serialVersionUID = 1L;

   public KnownJavaBugIOException() {
   }

   public KnownJavaBugIOException(String message) {
      super(message);
   }

   public KnownJavaBugIOException(String message, Throwable cause) {
      super(message, cause);
   }

   public KnownJavaBugIOException(Throwable cause) {
      super(cause);
   }
}
