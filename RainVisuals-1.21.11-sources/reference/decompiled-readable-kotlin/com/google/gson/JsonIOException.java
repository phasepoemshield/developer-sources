package com.google.gson;

// $VF: Compiled from JsonIOException.java
public final class JsonIOException extends JsonParseException {
   private static final long serialVersionUID = 1L;

   public JsonIOException(String cause, Throwable msg) {
      super(msg, cause);
   }

   public JsonIOException(String msg) {
      super(msg);
   }

   public JsonIOException(Throwable cause) {
      super(cause);
   }
}
