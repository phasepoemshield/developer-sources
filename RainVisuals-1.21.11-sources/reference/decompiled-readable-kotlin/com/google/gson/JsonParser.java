package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

// $VF: Compiled from JsonParser.java
public final class JsonParser {
   public static JsonElement parseReader(Reader reader) throws JsonIOException, JsonSyntaxException {
      try {
         JsonReader jsonReader = new JsonReader(reader);
         JsonElement element = parseReader(jsonReader);
         if (!element.isJsonNull() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
            throw new JsonSyntaxException("Did not consume the entire document.");
         } else {
            return element;
         }
      } catch (MalformedJsonException var3) {
         throw new JsonSyntaxException(var3);
      } catch (IOException var4) {
         throw new JsonIOException(var4);
      } catch (NumberFormatException var5) {
         throw new JsonSyntaxException(var5);
      }
   }

   public static JsonElement parseString(String json) throws JsonSyntaxException {
      return parseReader(new StringReader(json));
   }

   @Deprecated
   public JsonElement parse(JsonReader json) throws JsonIOException, JsonSyntaxException {
      return parseReader(json);
   }

   @Deprecated
   public JsonElement parse(String json) throws JsonSyntaxException {
      return parseString(json);
   }

   @Deprecated
   public JsonElement parse(Reader json) throws JsonSyntaxException, JsonIOException {
      return parseReader(json);
   }

   public static JsonElement parseReader(JsonReader reader) throws JsonSyntaxException, JsonIOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.util.collections.ListStack.pop(ListStack.java:31)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processBlock(ExprProcessor.java:448)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processStatement(ExprProcessor.java:141)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:227)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual com/google/gson/stream/JsonReader.isLenient ()Z
      // 04: istore 1
      // 05: aload 0
      // 06: bipush 1
      // 07: nop
      // 08: invokevirtual com/google/gson/stream/JsonReader.setLenient (Z)V
      // 0b: aload 0
      // 0c: invokestatic com/google/gson/internal/Streams.parse (Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;
      // 0f: astore 2
      // 10: aload 0
      // 11: iload 1
      // 12: invokevirtual com/google/gson/stream/JsonReader.setLenient (Z)V
      // 15: aload 2
      // 16: nop
      // 17: areturn
      // 18: astore 2
      // 19: new com/google/gson/JsonParseException
      // 1c: dup
      // 1d: new java/lang/StringBuilder
      // 20: dup
      // 21: invokespecial java/lang/StringBuilder.<init> ()V
      // 24: ldc "Failed parsing JSON source: "
      // 26: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29: aload 0
      // 2a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2d: ldc " to Json"
      // 2f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 35: aload 2
      // 36: nop
      // 37: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 3a: athrow
      // 3b: astore 2
      // 3c: new com/google/gson/JsonParseException
      // 3f: dup
      // 40: new java/lang/StringBuilder
      // 43: dup
      // 44: invokespecial java/lang/StringBuilder.<init> ()V
      // 47: ldc "Failed parsing JSON source: "
      // 49: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c: aload 0
      // 4d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 50: ldc " to Json"
      // 52: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 55: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 58: aload 2
      // 59: nop
      // 5a: invokespecial com/google/gson/JsonParseException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 5d: athrow
      // 5e: astore 3
      // 5f: aload 0
      // 60: iload 1
      // 61: invokevirtual com/google/gson/stream/JsonReader.setLenient (Z)V
      // 64: aload 3
      // 65: nop
      // 66: athrow
      // try (7 -> 10): 16 java/lang/StackOverflowError
      // try (7 -> 10): 33 java/lang/OutOfMemoryError
      // try (7 -> 10): 50 null
      // try (16 -> 51): 50 null
   }
}
