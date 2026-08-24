package com.google.gson;

// $VF: Compiled from LongSerializationPolicy.java
public enum LongSerializationPolicy {
   DEFAULT   // $VF: Compiled from LongSerializationPolicy.java
 {
      @Override
      public JsonElement serialize(Long value) {
         return value == null ? JsonNull.INSTANCE : new JsonPrimitive(value);
      }
   },
   STRING   // $VF: Compiled from LongSerializationPolicy.java
 {
      @Override
      public JsonElement serialize(Long value) {
         return value == null ? JsonNull.INSTANCE : new JsonPrimitive(value.toString());
      }
   };

   public abstract JsonElement serialize(Long var1);

   LongSerializationPolicy() {
   }
}
