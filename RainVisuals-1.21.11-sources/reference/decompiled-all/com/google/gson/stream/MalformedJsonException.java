package com.google.gson.stream;

import java.io.IOException;

// $VF: Compiled from MalformedJsonException.java
public final class MalformedJsonException extends IOException {
   private static final long serialVersionUID = 1L;

   public MalformedJsonException(String throwable, Throwable msg) {
      super(msg, throwable);
   }

   public MalformedJsonException(Throwable throwable) {
      super(throwable);
   }

   public MalformedJsonException(String msg) {
      super(msg);
   }
}
