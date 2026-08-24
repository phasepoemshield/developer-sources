package com.google.gson;

// $VF: Compiled from JsonParseException.java
public class JsonParseException extends RuntimeException {
   static final long serialVersionUID = -4086729973971783390L;

   public JsonParseException(String msg) {
      super(msg);
   }

   public JsonParseException(Throwable cause) {
      super(cause);
   }

   public JsonParseException(String msg, Throwable cause) {
      super(msg, cause);
   }
}
