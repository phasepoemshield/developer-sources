package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;

// $VF: Compiled from JsonTreeReader.java
public final class JsonTreeReader extends JsonReader {
   private static final Reader UNREADABLE_READER = new Reader()   // $VF: Compiled from JsonTreeReader.java
 {
      @Override
      public void close() {
         throw new AssertionError();
      }

      @Override
      public int read(char[] buffer, int count, int offset) {
         throw new AssertionError();
      }
   };
   private int stackSize;
   private int[] pathIndices;
   private Object[] stack = new Object[32];
   private String[] pathNames;
   private static final Object SENTINEL_CLOSED = new Object();

   @Override
   public int nextInt() throws IOException {
      JsonToken token = this.peek();
      if (token != JsonToken.NUMBER && token != JsonToken.STRING) {
         throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + token + this.locationString());
      }

      int result = ((JsonPrimitive)this.peekStack()).getAsInt();
      this.popStack();
      if (this.stackSize > 0) {
         this.pathIndices[this.stackSize - 1]++;
      }

      return result;
   }

   @Override
   public void beginArray() throws IOException {
      this.expect(JsonToken.BEGIN_ARRAY);
      JsonArray array = (JsonArray)this.peekStack();
      this.push(array.iterator());
      this.pathIndices[this.stackSize - 1] = 0;
   }

   @Override
   public String nextName() throws IOException {
      return this.nextName(false);
   }

   @Override
   public JsonToken peek() throws IOException {
      if (this.stackSize == 0) {
         return JsonToken.END_DOCUMENT;
      }

      Object o = this.peekStack();
      if (o instanceof Iterator) {
         boolean var4 = this.stack[this.stackSize - 2] instanceof JsonObject;
         Iterator<?> iterator = (Iterator)o;
         if (iterator.hasNext()) {
            if (var4) {
               return JsonToken.NAME;
            }

            this.push(iterator.next());
            return this.peek();
         } else {
            return var4 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
         }
      } else {
         if (o instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
         }

         if (o instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
         }

         if (o instanceof JsonPrimitive) {
            JsonPrimitive primitive = (JsonPrimitive)o;
            if (primitive.isString()) {
               return JsonToken.STRING;
            } else if (primitive.isBoolean()) {
               return JsonToken.BOOLEAN;
            } else if (primitive.isNumber()) {
               return JsonToken.NUMBER;
            } else {
               throw new AssertionError();
            }
         } else if (o instanceof JsonNull) {
            return JsonToken.NULL;
         } else if (o == SENTINEL_CLOSED) {
            throw new IllegalStateException("JsonReader is closed");
         } else {
            throw new MalformedJsonException("Custom JsonElement subclass " + o.getClass().getName() + " is not supported");
         }
      }
   }

   @Override
   public String getPreviousPath() {
      return this.getPath(true);
   }

   private String getPath(boolean usePreviousPath) {
      StringBuilder result = new StringBuilder().append('$');

      for (int i = 0; i < this.stackSize; i++) {
         if (this.stack[i] instanceof JsonArray) {
            i++;
            if (i < this.stackSize && this.stack[i] instanceof Iterator) {
               int pathIndex = this.pathIndices[i];
               if (usePreviousPath && pathIndex > 0 && (i == this.stackSize - 1 || i == this.stackSize - 2)) {
                  pathIndex--;
               }

               result.append('[').append(pathIndex).append(']');
            }
         } else if (this.stack[i] instanceof JsonObject) {
            i++;
            if (i < this.stackSize && this.stack[i] instanceof Iterator) {
               result.append('.');
               if (this.pathNames[i] != null) {
                  result.append(this.pathNames[i]);
               }
            }
         }
      }

      return result.toString();
   }

   @Override
   public void skipValue() throws IOException {
      JsonToken peeked = this.peek();
      switch (peeked) {
         case NAME:
            String unused = this.nextName(true);
            break;
         case END_ARRAY:
            this.endArray();
            break;
         case END_OBJECT:
            this.endObject();
         case END_DOCUMENT:
            break;
         default:
            this.popStack();
            if (this.stackSize > 0) {
               this.pathIndices[this.stackSize - 1]++;
            }
      }
   }

   @Override
   public void endObject() throws IOException {
      this.expect(JsonToken.END_OBJECT);
      this.pathNames[this.stackSize - 1] = null;
      this.popStack();
      this.popStack();
      if (this.stackSize > 0) {
         this.pathIndices[this.stackSize - 1]++;
      }
   }

   @Override
   public void close() throws IOException {
      this.stack = new Object[]{SENTINEL_CLOSED};
      this.stackSize = 1;
   }

   @Override
   public boolean hasNext() throws IOException {
      JsonToken token = this.peek();
      return token != JsonToken.END_OBJECT && token != JsonToken.END_ARRAY && token != JsonToken.END_DOCUMENT;
   }

   private void expect(JsonToken expected) throws IOException {
      if (this.peek() != expected) {
         throw new IllegalStateException("Expected " + expected + " but was " + this.peek() + this.locationString());
      }
   }

   @Override
   public boolean nextBoolean() throws IOException {
      this.expect(JsonToken.BOOLEAN);
      boolean result = ((JsonPrimitive)this.popStack()).getAsBoolean();
      if (this.stackSize > 0) {
         this.pathIndices[this.stackSize - 1]++;
      }

      return result;
   }

   JsonElement nextJsonElement() throws IOException {
      JsonToken peeked = this.peek();
      if (peeked != JsonToken.NAME && peeked != JsonToken.END_ARRAY && peeked != JsonToken.END_OBJECT && peeked != JsonToken.END_DOCUMENT) {
         JsonElement element = (JsonElement)this.peekStack();
         this.skipValue();
         return element;
      } else {
         throw new IllegalStateException("Unexpected " + peeked + " when reading a JsonElement.");
      }
   }

   @Override
   public void endArray() throws IOException {
      this.expect(JsonToken.END_ARRAY);
      this.popStack();
      this.popStack();
      if (this.stackSize > 0) {
         this.pathIndices[this.stackSize - 1]++;
      }
   }

   @Override
   public void beginObject() throws IOException {
      this.expect(JsonToken.BEGIN_OBJECT);
      JsonObject object = (JsonObject)this.peekStack();
      this.push(object.entrySet().iterator());
   }

   @Override
   public long nextLong() throws IOException {
      JsonToken token = this.peek();
      if (token != JsonToken.NUMBER && token != JsonToken.STRING) {
         throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + token + this.locationString());
      }

      long result = ((JsonPrimitive)this.peekStack()).getAsLong();
      this.popStack();
      if (this.stackSize > 0) {
         this.pathIndices[this.stackSize - 1]++;
      }

      return result;
   }

   @Override
   public void nextNull() throws IOException {
      this.expect(JsonToken.NULL);
      this.popStack();
      if (this.stackSize > 0) {
         this.pathIndices[this.stackSize - 1]++;
      }
   }

   @Override
   public String getPath() {
      return this.getPath(false);
   }

   private String locationString() {
      return " at path " + this.getPath();
   }

   private void push(Object newTop) {
      if (this.stackSize == this.stack.length) {
         int newLength = this.stackSize * 2;
         this.stack = Arrays.copyOf(this.stack, newLength);
         this.pathIndices = Arrays.copyOf(this.pathIndices, newLength);
         this.pathNames = Arrays.copyOf(this.pathNames, newLength);
      }

      this.stack[this.stackSize++] = newTop;
   }

   @Override
   public String nextString() throws IOException {
      JsonToken token = this.peek();
      if (token != JsonToken.STRING && token != JsonToken.NUMBER) {
         throw new IllegalStateException("Expected " + JsonToken.STRING + " but was " + token + this.locationString());
      }

      String result = ((JsonPrimitive)this.popStack()).getAsString();
      if (this.stackSize > 0) {
         this.pathIndices[this.stackSize - 1]++;
      }

      return result;
   }

   private String nextName(boolean skipName) throws IOException {
      this.expect(JsonToken.NAME);
      Iterator<?> i = (Iterator<?>)this.peekStack();
      Entry<?, ?> entry = (Entry)i.next();
      String result = (String)entry.getKey();
      this.pathNames[this.stackSize - 1] = skipName ? "<skipped>" : result;
      this.push(entry.getValue());
      return result;
   }

   public void promoteNameToValue() throws IOException {
      this.expect(JsonToken.NAME);
      Iterator<?> i = (Iterator<?>)this.peekStack();
      Entry<?, ?> entry = (Entry<?, ?>)i.next();
      this.push(entry.getValue());
      this.push(new JsonPrimitive((String)entry.getKey()));
   }

   private Object popStack() {
      Object result = this.stack[--this.stackSize];
      this.stack[this.stackSize] = null;
      return result;
   }

   public JsonTreeReader(JsonElement element) {
      super(UNREADABLE_READER);
      this.stackSize = 0;
      this.pathNames = new String[32];
      this.pathIndices = new int[32];
      this.push(element);
   }

   private Object peekStack() {
      return this.stack[this.stackSize - 1];
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + this.locationString();
   }

   @Override
   public double nextDouble() throws IOException {
      JsonToken token = this.peek();
      if (token != JsonToken.NUMBER && token != JsonToken.STRING) {
         throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + token + this.locationString());
      }

      double result = ((JsonPrimitive)this.peekStack()).getAsDouble();
      if (this.isLenient() || !Double.isNaN(result) && !Double.isInfinite(result)) {
         this.popStack();
         if (this.stackSize > 0) {
            this.pathIndices[this.stackSize - 1]++;
         }

         return result;
      } else {
         throw new MalformedJsonException("JSON forbids NaN and infinities: " + result);
      }
   }
}
