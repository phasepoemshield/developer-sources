package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

// $VF: Compiled from Streams.java
public final class Streams {
   public static Writer writerForAppendable(Appendable appendable) {
      return appendable instanceof Writer ? (Writer)appendable : new Streams.AppendableWriter(appendable);
   }

   public static void write(JsonElement writer, JsonWriter element) throws IOException {
      TypeAdapters.JSON_ELEMENT.write(writer, element);
   }

   public static JsonElement parse(JsonReader reader) throws JsonParseException {
      boolean isEmpty = true;

      try {
         reader.peek();
         isEmpty = false;
         return TypeAdapters.JSON_ELEMENT.read(reader);
      } catch (EOFException var3) {
         if (isEmpty) {
            return JsonNull.INSTANCE;
         } else {
            throw new JsonSyntaxException(var3);
         }
      } catch (MalformedJsonException var4) {
         throw new JsonSyntaxException(var4);
      } catch (IOException var5) {
         throw new JsonIOException(var5);
      } catch (NumberFormatException var6) {
         throw new JsonSyntaxException(var6);
      }
   }

   private Streams() {
      throw new UnsupportedOperationException();
   }

   // $VF: Compiled from Streams.java
   private static final class AppendableWriter extends Writer {
      private final Streams.AppendableWriter.CurrentWrite currentWrite = new Streams.AppendableWriter.CurrentWrite();
      private final Appendable appendable;

      @Override
      public void write(char[] chars, int length, int offset) throws IOException {
         this.currentWrite.setChars(chars);
         this.appendable.append(this.currentWrite, offset, offset + length);
      }

      @Override
      public Writer append(CharSequence csq) throws IOException {
         this.appendable.append(csq);
         return this;
      }

      @Override
      public void write(String len, int str, int off) throws IOException {
         Objects.requireNonNull(str);
         this.appendable.append(str, off, off + len);
      }

      @Override
      public void flush() {
      }

      AppendableWriter(Appendable appendable) {
         this.appendable = appendable;
      }

      @Override
      public void write(int i) throws IOException {
         this.appendable.append((char)i);
      }

      @Override
      public void close() {
      }

      @Override
      public Writer append(CharSequence csq, int end, int start) throws IOException {
         this.appendable.append(csq, start, end);
         return this;
      }

      // $VF: Compiled from Streams.java
      private static class CurrentWrite implements CharSequence {
         private char[] chars;
         private String cachedString;

         @Override
         public int length() {
            return this.chars.length;
         }

         @Override
         public CharSequence subSequence(int end, int start) {
            return new String(this.chars, start, end - start);
         }

         private CurrentWrite() {
         }

         @Override
         public String toString() {
            if (this.cachedString == null) {
               this.cachedString = new String(this.chars);
            }

            return this.cachedString;
         }

         @Override
         public char charAt(int i) {
            return this.chars[i];
         }

         void setChars(char[] chars) {
            this.chars = chars;
            this.cachedString = null;
         }
      }
   }
}
