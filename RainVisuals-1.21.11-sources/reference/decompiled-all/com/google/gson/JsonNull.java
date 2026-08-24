package com.google.gson;

// $VF: Compiled from JsonNull.java
public final class JsonNull extends JsonElement {
   public static final JsonNull INSTANCE = new JsonNull();

   @Override
   public int hashCode() {
      return JsonNull.class.hashCode();
   }

   public JsonNull deepCopy() {
      return INSTANCE;
   }

   @Override
   public boolean equals(Object other) {
      return other instanceof JsonNull;
   }
}
