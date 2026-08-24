package com.google.gson;

// $VF: Compiled from JsonSyntaxException.java
public final class JsonSyntaxException extends JsonParseException {
   private static final long serialVersionUID = 1L;

   public JsonSyntaxException(String msg, Throwable cause) {
      super(msg, cause);
   }

   public JsonSyntaxException(Throwable cause) {
      super(cause);
   }

   public JsonSyntaxException(String msg) {
      super(msg);
   }
}
