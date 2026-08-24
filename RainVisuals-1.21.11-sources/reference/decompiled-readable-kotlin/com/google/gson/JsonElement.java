package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

// $VF: Compiled from JsonElement.java
public abstract class JsonElement {
   public JsonPrimitive getAsJsonPrimitive() {
      if (this.isJsonPrimitive()) {
         return (JsonPrimitive)this;
      } else {
         throw new IllegalStateException("Not a JSON Primitive: " + this);
      }
   }

   public JsonArray getAsJsonArray() {
      if (this.isJsonArray()) {
         return (JsonArray)this;
      } else {
         throw new IllegalStateException("Not a JSON Array: " + this);
      }
   }

   public int getAsInt() {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public JsonNull getAsJsonNull() {
      if (this.isJsonNull()) {
         return (JsonNull)this;
      } else {
         throw new IllegalStateException("Not a JSON Null: " + this);
      }
   }

   public boolean isJsonPrimitive() {
      return this instanceof JsonPrimitive;
   }

   @Deprecated
   public char getAsCharacter() {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public double getAsDouble() {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public boolean isJsonObject() {
      return this instanceof JsonObject;
   }

   public BigDecimal getAsBigDecimal() {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public JsonObject getAsJsonObject() {
      if (this.isJsonObject()) {
         return (JsonObject)this;
      } else {
         throw new IllegalStateException("Not a JSON Object: " + this);
      }
   }

   public float getAsFloat() {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public BigInteger getAsBigInteger() {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public abstract JsonElement deepCopy();

   public long getAsLong() {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public boolean isJsonNull() {
      return this instanceof JsonNull;
   }

   public String getAsString() {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public short getAsShort() {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   @Override
   public String toString() {
      try {
         StringWriter stringWriter = new StringWriter();
         JsonWriter jsonWriter = new JsonWriter(stringWriter);
         jsonWriter.setLenient(true);
         Streams.write(this, jsonWriter);
         return stringWriter.toString();
      } catch (IOException var3) {
         throw new AssertionError(var3);
      }
   }

   public byte getAsByte() {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public boolean getAsBoolean() {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public Number getAsNumber() {
      throw new UnsupportedOperationException(this.getClass().getSimpleName());
   }

   public boolean isJsonArray() {
      return this instanceof JsonArray;
   }
}
