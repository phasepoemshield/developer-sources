package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Deque;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

// $VF: Compiled from TypeAdapters.java
public final class TypeAdapters {
   public static final TypeAdapter<URL> URL = new TypeAdapter<URL>()   // $VF: Compiled from TypeAdapters.java
 {
      public URL read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         } else {
            String nextString = in.nextString();
            return "null".equals(nextString) ? null : new URL(nextString);
         }
      }

      public void write(JsonWriter value, URL out) throws IOException {
         out.value(value == null ? null : value.toExternalForm());
      }
   };
   public static final TypeAdapter<UUID> UUID = new TypeAdapter<UUID>()   // $VF: Compiled from TypeAdapters.java
 {
      public UUID read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         }

         String s = in.nextString();

         try {
            return java.util.UUID.fromString(s);
         } catch (IllegalArgumentException var4) {
            throw new JsonSyntaxException("Failed parsing '" + s + "' as UUID; at path " + in.getPreviousPath(), var4);
         }
      }

      public void write(JsonWriter value, UUID out) throws IOException {
         out.value(value == null ? null : value.toString());
      }
   };
   public static final TypeAdapter<Number> LONG = new TypeAdapter<Number>()   // $VF: Compiled from TypeAdapters.java
 {
      public void write(JsonWriter value, Number out) throws IOException {
         if (value == null) {
            out.nullValue();
         } else {
            out.value(value.longValue());
         }
      }

      public Number read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         }

         try {
            return in.nextLong();
         } catch (NumberFormatException var3) {
            throw new JsonSyntaxException(var3);
         }
      }
   };
   public static final TypeAdapter<JsonElement> JSON_ELEMENT = new TypeAdapter<JsonElement>()   // $VF: Compiled from TypeAdapters.java
 {
      private JsonElement tryBeginNesting(JsonReader peeked, JsonToken in) throws IOException {
         switch (peeked) {
            case BEGIN_ARRAY:
               in.beginArray();
               return new JsonArray();
            case BEGIN_OBJECT:
               in.beginObject();
               return new JsonObject();
            default:
               return null;
         }
      }

      public JsonElement read(JsonReader in) throws IOException {
         if (in instanceof JsonTreeReader) {
            return ((JsonTreeReader)in).nextJsonElement();
         }

         JsonToken peeked = in.peek();
         JsonElement current = this.tryBeginNesting(in, peeked);
         if (current == null) {
            return this.readTerminal(in, peeked);
         }

         Deque<JsonElement> stack = new ArrayDeque();

         while (true) {
            while (!in.hasNext()) {
               if (current instanceof JsonArray) {
                  in.endArray();
               } else {
                  in.endObject();
               }

               if (stack.isEmpty()) {
                  return current;
               }

               current = (JsonElement)stack.removeLast();
            }

            String name = null;
            if (current instanceof JsonObject) {
               name = in.nextName();
            }

            peeked = in.peek();
            JsonElement value = this.tryBeginNesting(in, peeked);
            boolean isNesting = value != null;
            if (value == null) {
               value = this.readTerminal(in, peeked);
            }

            if (current instanceof JsonArray) {
               ((JsonArray)current).add(value);
            } else {
               ((JsonObject)current).add(name, value);
            }

            if (isNesting) {
               stack.addLast(current);
               current = value;
            }
         }
      }

      public void write(JsonWriter value, JsonElement out) throws IOException {
         if (value == null || value.isJsonNull()) {
            out.nullValue();
         } else if (value.isJsonPrimitive()) {
            JsonPrimitive primitive = value.getAsJsonPrimitive();
            if (primitive.isNumber()) {
               out.value(primitive.getAsNumber());
            } else if (primitive.isBoolean()) {
               out.value(primitive.getAsBoolean());
            } else {
               out.value(primitive.getAsString());
            }
         } else if (value.isJsonArray()) {
            out.beginArray();

            for (JsonElement e : value.getAsJsonArray()) {
               this.write(out, e);
            }

            out.endArray();
         } else {
            if (!value.isJsonObject()) {
               throw new IllegalArgumentException("Couldn't write " + value.getClass());
            }

            out.beginObject();

            for (Entry<String, JsonElement> var7 : value.getAsJsonObject().entrySet()) {
               out.name((String)var7.getKey());
               this.write(out, (JsonElement)var7.getValue());
            }

            out.endObject();
         }
      }

      private JsonElement readTerminal(JsonReader peeked, JsonToken in) throws IOException {
         switch (peeked) {
            case NUMBER:
               String number = in.nextString();
               return new JsonPrimitive(new LazilyParsedNumber(number));
            case STRING:
               return new JsonPrimitive(in.nextString());
            case BOOLEAN:
               return new JsonPrimitive(in.nextBoolean());
            case BEGIN_ARRAY:
            case BEGIN_OBJECT:
            default:
               throw new IllegalStateException("Unexpected token: " + peeked);
            case NULL:
               in.nextNull();
               return JsonNull.INSTANCE;
         }
      }
   };
   public static final TypeAdapter<String> STRING = new TypeAdapter<String>()   // $VF: Compiled from TypeAdapters.java
 {
      public String read(JsonReader in) throws IOException {
         JsonToken peek = in.peek();
         if (peek == JsonToken.NULL) {
            in.nextNull();
            return null;
         } else {
            return peek == JsonToken.BOOLEAN ? Boolean.toString(in.nextBoolean()) : in.nextString();
         }
      }

      public void write(JsonWriter value, String out) throws IOException {
         out.value(value);
      }
   };
   public static final TypeAdapterFactory STRING_FACTORY = newFactory(String.class, STRING);
   public static final TypeAdapter<StringBuilder> STRING_BUILDER = new TypeAdapter<StringBuilder>()   // $VF: Compiled from TypeAdapters.java
 {
      public StringBuilder read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         } else {
            return new StringBuilder(in.nextString());
         }
      }

      public void write(JsonWriter out, StringBuilder value) throws IOException {
         out.value(value == null ? null : value.toString());
      }
   };
   public static final TypeAdapterFactory SHORT_FACTORY = newFactory(short.class, Short.class, TypeAdapters.SHORT);
   public static final TypeAdapterFactory URI_FACTORY = newFactory(URI.class, TypeAdapters.URI);
   public static final TypeAdapter<Number> DOUBLE = new TypeAdapter<Number>()   // $VF: Compiled from TypeAdapters.java
 {
      public Number read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         } else {
            return in.nextDouble();
         }
      }

      public void write(JsonWriter out, Number value) throws IOException {
         if (value == null) {
            out.nullValue();
         } else {
            out.value(value.doubleValue());
         }
      }
   };
   public static final TypeAdapter<AtomicBoolean> ATOMIC_BOOLEAN = (new TypeAdapter<AtomicBoolean>()   // $VF: Compiled from TypeAdapters.java
 {
      public AtomicBoolean read(JsonReader in) throws IOException {
         return new AtomicBoolean(in.nextBoolean());
      }

      public void write(JsonWriter value, AtomicBoolean out) throws IOException {
         out.value(value.get());
      }
   }).nullSafe();
   public static final TypeAdapterFactory ENUM_FACTORY = new TypeAdapterFactory()   // $VF: Compiled from TypeAdapters.java
 {
      @Override
      public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
         Class<? super T> rawType = typeToken.getRawType();
         if (Enum.class.isAssignableFrom(rawType) && rawType != Enum.class) {
            if (!rawType.isEnum()) {
               rawType = rawType.getSuperclass();
            }

            return new TypeAdapters.EnumTypeAdapter(rawType);
         } else {
            return null;
         }
      }
   };
   public static final TypeAdapter<Boolean> BOOLEAN_AS_STRING = new TypeAdapter<Boolean>()   // $VF: Compiled from TypeAdapters.java
 {
      public void write(JsonWriter value, Boolean out) throws IOException {
         out.value(value == null ? "null" : value.toString());
      }

      public Boolean read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         } else {
            return Boolean.valueOf(in.nextString());
         }
      }
   };
   public static final TypeAdapterFactory CHARACTER_FACTORY = newFactory(char.class, Character.class, TypeAdapters.CHARACTER);
   public static final TypeAdapter<Calendar> CALENDAR = new TypeAdapter<Calendar>()   // $VF: Compiled from TypeAdapters.java
 {
      private static final String MONTH = "month";
      private static final String SECOND = "second";
      private static final String YEAR = "year";
      private static final String DAY_OF_MONTH = "dayOfMonth";
      private static final String HOUR_OF_DAY = "hourOfDay";
      private static final String MINUTE = "minute";

      public Calendar read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         }

         in.beginObject();
         int year = 0;
         int month = 0;
         int dayOfMonth = 0;
         int hourOfDay = 0;
         int minute = 0;
         int second = 0;

         while (in.peek() != JsonToken.END_OBJECT) {
            String name = in.nextName();
            int value = in.nextInt();
            if ("year".equals(name)) {
               year = value;
            } else if ("month".equals(name)) {
               month = value;
            } else if ("dayOfMonth".equals(name)) {
               dayOfMonth = value;
            } else if ("hourOfDay".equals(name)) {
               hourOfDay = value;
            } else if ("minute".equals(name)) {
               minute = value;
            } else if ("second".equals(name)) {
               second = value;
            }
         }

         in.endObject();
         return new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute, second);
      }

      public void write(JsonWriter value, Calendar out) throws IOException {
         if (value == null) {
            out.nullValue();
         } else {
            out.beginObject();
            out.name("year");
            out.value(value.get(1));
            out.name("month");
            out.value(value.get(2));
            out.name("dayOfMonth");
            out.value(value.get(5));
            out.name("hourOfDay");
            out.value(value.get(11));
            out.name("minute");
            out.value(value.get(12));
            out.name("second");
            out.value(value.get(13));
            out.endObject();
         }
      }
   };
   public static final TypeAdapterFactory CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, CALENDAR);
   public static final TypeAdapter<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY = (new TypeAdapter<AtomicIntegerArray>()   // $VF: Compiled from TypeAdapters.java
 {
      public AtomicIntegerArray read(JsonReader in) throws IOException {
         List<Integer> list = new ArrayList<>();
         in.beginArray();

         while (in.hasNext()) {
            try {
               int integer = in.nextInt();
               list.add(integer);
            } catch (NumberFormatException var6) {
               throw new JsonSyntaxException(var6);
            }
         }

         in.endArray();
         int var7 = list.size();
         AtomicIntegerArray array = new AtomicIntegerArray(var7);

         for (int i = 0; i < var7; i++) {
            array.set(i, list.get(i));
         }

         return array;
      }

      public void write(JsonWriter out, AtomicIntegerArray value) throws IOException {
         out.beginArray();
         int i = 0;

         for (int length = value.length(); i < length; i++) {
            out.value(value.get(i));
         }

         out.endArray();
      }
   }).nullSafe();
   public static final TypeAdapter<Boolean> BOOLEAN = new TypeAdapter<Boolean>()   // $VF: Compiled from TypeAdapters.java
 {
      public void write(JsonWriter value, Boolean out) throws IOException {
         out.value(value);
      }

      public Boolean read(JsonReader in) throws IOException {
         JsonToken peek = in.peek();
         if (peek == JsonToken.NULL) {
            in.nextNull();
            return null;
         } else {
            return peek == JsonToken.STRING ? Boolean.parseBoolean(in.nextString()) : in.nextBoolean();
         }
      }
   };
   public static final TypeAdapterFactory BOOLEAN_FACTORY = newFactory(boolean.class, Boolean.class, BOOLEAN);
   public static final TypeAdapterFactory CURRENCY_FACTORY = newFactory(Currency.class, TypeAdapters.CURRENCY);
   public static final TypeAdapterFactory BIT_SET_FACTORY = newFactory(BitSet.class, TypeAdapters.BIT_SET);
   public static final TypeAdapter<LazilyParsedNumber> LAZILY_PARSED_NUMBER = new TypeAdapter<LazilyParsedNumber>()   // $VF: Compiled from TypeAdapters.java
 {
      public LazilyParsedNumber read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         } else {
            return new LazilyParsedNumber(in.nextString());
         }
      }

      public void write(JsonWriter out, LazilyParsedNumber value) throws IOException {
         out.value(value);
      }
   };
   public static final TypeAdapter<Number> INTEGER = new TypeAdapter<Number>()   // $VF: Compiled from TypeAdapters.java
 {
      public void write(JsonWriter out, Number value) throws IOException {
         if (value == null) {
            out.nullValue();
         } else {
            out.value(value.intValue());
         }
      }

      public Number read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         }

         try {
            return in.nextInt();
         } catch (NumberFormatException var3) {
            throw new JsonSyntaxException(var3);
         }
      }
   };
   public static final TypeAdapterFactory INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, TypeAdapters.INET_ADDRESS);
   public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, ATOMIC_INTEGER_ARRAY);
   public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, TypeAdapters.ATOMIC_INTEGER);
   public static final TypeAdapterFactory CLASS_FACTORY = newFactory(Class.class, TypeAdapters.CLASS);
   public static final TypeAdapter<InetAddress> INET_ADDRESS = new TypeAdapter<InetAddress>()   // $VF: Compiled from TypeAdapters.java
 {
      public InetAddress read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         } else {
            return InetAddress.getByName(in.nextString());
         }
      }

      public void write(JsonWriter out, InetAddress value) throws IOException {
         out.value(value == null ? null : value.getHostAddress());
      }
   };
   public static final TypeAdapter<BigDecimal> BIG_DECIMAL = new TypeAdapter<BigDecimal>()   // $VF: Compiled from TypeAdapters.java
 {
      public void write(JsonWriter out, BigDecimal value) throws IOException {
         out.value(value);
      }

      public BigDecimal read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         }

         String s = in.nextString();

         try {
            return new BigDecimal(s);
         } catch (NumberFormatException var4) {
            throw new JsonSyntaxException("Failed parsing '" + s + "' as BigDecimal; at path " + in.getPreviousPath(), var4);
         }
      }
   };
   public static final TypeAdapterFactory UUID_FACTORY = newFactory(UUID.class, UUID);
   public static final TypeAdapter<BigInteger> BIG_INTEGER = new TypeAdapter<BigInteger>()   // $VF: Compiled from TypeAdapters.java
 {
      public BigInteger read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         }

         String s = in.nextString();

         try {
            return new BigInteger(s);
         } catch (NumberFormatException var4) {
            throw new JsonSyntaxException("Failed parsing '" + s + "' as BigInteger; at path " + in.getPreviousPath(), var4);
         }
      }

      public void write(JsonWriter value, BigInteger out) throws IOException {
         out.value(value);
      }
   };
   public static final TypeAdapterFactory URL_FACTORY = newFactory(URL.class, URL);
   public static final TypeAdapter<Character> CHARACTER = new TypeAdapter<Character>()   // $VF: Compiled from TypeAdapters.java
 {
      public Character read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         } else {
            String str = in.nextString();
            if (str.length() != 1) {
               throw new JsonSyntaxException("Expecting character, got: " + str + "; at " + in.getPreviousPath());
            } else {
               return str.charAt(0);
            }
         }
      }

      public void write(JsonWriter value, Character out) throws IOException {
         out.value(value == null ? null : String.valueOf(value));
      }
   };
   public static final TypeAdapter<Currency> CURRENCY = (new TypeAdapter<Currency>()   // $VF: Compiled from TypeAdapters.java
 {
      public Currency read(JsonReader in) throws IOException {
         String s = in.nextString();

         try {
            return Currency.getInstance(s);
         } catch (IllegalArgumentException var4) {
            throw new JsonSyntaxException("Failed parsing '" + s + "' as Currency; at path " + in.getPreviousPath(), var4);
         }
      }

      public void write(JsonWriter value, Currency out) throws IOException {
         out.value(value.getCurrencyCode());
      }
   }).nullSafe();
   public static final TypeAdapter<Number> BYTE = new TypeAdapter<Number>()   // $VF: Compiled from TypeAdapters.java
 {
      public Number read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         }

         int intValue;
         try {
            intValue = in.nextInt();
         } catch (NumberFormatException var4) {
            throw new JsonSyntaxException(var4);
         }

         if (intValue <= 255 && intValue >= -128) {
            return (byte)intValue;
         } else {
            throw new JsonSyntaxException("Lossy conversion from " + intValue + " to byte; at path " + in.getPreviousPath());
         }
      }

      public void write(JsonWriter out, Number value) throws IOException {
         if (value == null) {
            out.nullValue();
         } else {
            out.value(value.byteValue());
         }
      }
   };
   public static final TypeAdapter<Number> FLOAT = new TypeAdapter<Number>()   // $VF: Compiled from TypeAdapters.java
 {
      public void write(JsonWriter out, Number value) throws IOException {
         if (value == null) {
            out.nullValue();
         } else {
            Number floatNumber = value instanceof Float ? value : value.floatValue();
            out.value(floatNumber);
         }
      }

      public Number read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         } else {
            return (float)in.nextDouble();
         }
      }
   };
   public static final TypeAdapter<BitSet> BIT_SET = (new TypeAdapter<BitSet>()   // $VF: Compiled from TypeAdapters.java
 {
      public void write(JsonWriter src, BitSet out) throws IOException {
         out.beginArray();
         int i = 0;

         for (int length = src.length(); i < length; i++) {
            int value = src.get(i) ? 1 : 0;
            out.value(value);
         }

         out.endArray();
      }

      public BitSet read(JsonReader in) throws IOException {
         BitSet bitset = new BitSet();
         in.beginArray();
         int i = 0;

         for (JsonToken tokenType = in.peek(); tokenType != JsonToken.END_ARRAY; tokenType = in.peek()) {
            boolean set;
            switch (tokenType) {
               case NUMBER:
               case STRING:
                  int intValue = in.nextInt();
                  if (intValue == 0) {
                     set = false;
                  } else {
                     if (intValue != 1) {
                        throw new JsonSyntaxException("Invalid bitset value " + intValue + ", expected 0 or 1; at path " + in.getPreviousPath());
                     }

                     set = true;
                  }
                  break;
               case BOOLEAN:
                  set = in.nextBoolean();
                  break;
               default:
                  throw new JsonSyntaxException("Invalid bitset value type: " + tokenType + "; at path " + in.getPath());
            }

            if (set) {
               bitset.set(i);
            }

            i++;
         }

         in.endArray();
         return bitset;
      }
   }).nullSafe();
   public static final TypeAdapter<URI> URI = new TypeAdapter<URI>()   // $VF: Compiled from TypeAdapters.java
 {
      public URI read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         }

         try {
            String e = in.nextString();
            return "null".equals(e) ? null : new URI(e);
         } catch (URISyntaxException var3) {
            throw new JsonIOException(var3);
         }
      }

      public void write(JsonWriter out, URI value) throws IOException {
         out.value(value == null ? null : value.toASCIIString());
      }
   };
   public static final TypeAdapterFactory LOCALE_FACTORY = newFactory(Locale.class, TypeAdapters.LOCALE);
   public static final TypeAdapterFactory INTEGER_FACTORY = newFactory(int.class, Integer.class, INTEGER);
   public static final TypeAdapter<AtomicInteger> ATOMIC_INTEGER = (new TypeAdapter<AtomicInteger>()   // $VF: Compiled from TypeAdapters.java
 {
      public void write(JsonWriter out, AtomicInteger value) throws IOException {
         out.value(value.get());
      }

      public AtomicInteger read(JsonReader in) throws IOException {
         try {
            return new AtomicInteger(in.nextInt());
         } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
         }
      }
   }).nullSafe();
   public static final TypeAdapterFactory STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, STRING_BUILDER);
   public static final TypeAdapterFactory STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, TypeAdapters.STRING_BUFFER);
   public static final TypeAdapterFactory BYTE_FACTORY = newFactory(byte.class, Byte.class, BYTE);
   public static final TypeAdapter<Number> SHORT = new TypeAdapter<Number>()   // $VF: Compiled from TypeAdapters.java
 {
      public void write(JsonWriter out, Number value) throws IOException {
         if (value == null) {
            out.nullValue();
         } else {
            out.value(value.shortValue());
         }
      }

      public Number read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         }

         int intValue;
         try {
            intValue = in.nextInt();
         } catch (NumberFormatException var4) {
            throw new JsonSyntaxException(var4);
         }

         if (intValue <= 65535 && intValue >= -32768) {
            return (short)intValue;
         } else {
            throw new JsonSyntaxException("Lossy conversion from " + intValue + " to short; at path " + in.getPreviousPath());
         }
      }
   };
   public static final TypeAdapter<Class> CLASS = (new TypeAdapter<Class>()   // $VF: Compiled from TypeAdapters.java
 {
      public Class read(JsonReader in) throws IOException {
         throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
      }

      public void write(JsonWriter out, Class value) throws IOException {
         throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + value.getName() + ". Forgot to register a type adapter?");
      }
   }).nullSafe();
   public static final TypeAdapter<StringBuffer> STRING_BUFFER = new TypeAdapter<StringBuffer>()   // $VF: Compiled from TypeAdapters.java
 {
      public void write(JsonWriter out, StringBuffer value) throws IOException {
         out.value(value == null ? null : value.toString());
      }

      public StringBuffer read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         } else {
            return new StringBuffer(in.nextString());
         }
      }
   };
   public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, ATOMIC_BOOLEAN);
   public static final TypeAdapter<Locale> LOCALE = new TypeAdapter<Locale>()   // $VF: Compiled from TypeAdapters.java
 {
      public void write(JsonWriter value, Locale out) throws IOException {
         out.value(value == null ? null : value.toString());
      }

      public Locale read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         }

         String locale = in.nextString();
         StringTokenizer tokenizer = new StringTokenizer(locale, "_");
         String language = null;
         String country = null;
         String variant = null;
         if (tokenizer.hasMoreElements()) {
            language = tokenizer.nextToken();
         }

         if (tokenizer.hasMoreElements()) {
            country = tokenizer.nextToken();
         }

         if (tokenizer.hasMoreElements()) {
            variant = tokenizer.nextToken();
         }

         if (country == null && variant == null) {
            return new Locale(language);
         } else {
            return variant == null ? new Locale(language, country) : new Locale(language, country, variant);
         }
      }
   };
   public static final TypeAdapterFactory JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(JsonElement.class, JSON_ELEMENT);

   public static <TT> TypeAdapterFactory newFactory(Class<TT> type, TypeAdapter<TT> typeAdapter) {
      return new TypeAdapterFactory()      // $VF: Compiled from TypeAdapters.java
 {
         @Override
         public <T> TypeAdapter<T> create(Gson typeToken, TypeToken<T> gson) {
            return (TypeAdapter<T>)(typeToken.getRawType() == type ? typeAdapter : null);
         }

         @Override
         public String toString() {
            return "Factory[type=" + type.getName() + ",adapter=" + typeAdapter + "]";
         }
      };
   }

   public static <TT> TypeAdapterFactory newFactory(Class<TT> typeAdapter, Class<TT> boxed, TypeAdapter<? super TT> unboxed) {
      return new TypeAdapterFactory()      // $VF: Compiled from TypeAdapters.java
 {
         @Override
         public <T> TypeAdapter<T> create(Gson typeToken, TypeToken<T> gson) {
            Class<? super T> rawType = typeToken.getRawType();
            return (TypeAdapter<T>)(rawType != unboxed && rawType != boxed ? null : typeAdapter);
         }

         @Override
         public String toString() {
            return "Factory[type=" + boxed.getName() + "+" + unboxed.getName() + ",adapter=" + typeAdapter + "]";
         }
      };
   }

   public static <TT> TypeAdapterFactory newFactory(TypeToken<TT> typeAdapter, TypeAdapter<TT> type) {
      return new TypeAdapterFactory()      // $VF: Compiled from TypeAdapters.java
 {
         @Override
         public <T> TypeAdapter<T> create(Gson typeToken, TypeToken<T> gson) {
            return (TypeAdapter<T>)(typeToken.equals(type) ? typeAdapter : null);
         }
      };
   }

   private TypeAdapters() {
      throw new UnsupportedOperationException();
   }

   public static <TT> TypeAdapterFactory newFactoryForMultipleTypes(Class<TT> typeAdapter, Class<? extends TT> base, TypeAdapter<? super TT> sub) {
      return new TypeAdapterFactory()      // $VF: Compiled from TypeAdapters.java
 {
         @Override
         public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            return (TypeAdapter<T>)(rawType != base && rawType != sub ? null : typeAdapter);
         }

         @Override
         public String toString() {
            return "Factory[type=" + base.getName() + "+" + sub.getName() + ",adapter=" + typeAdapter + "]";
         }
      };
   }

   public static <T1> TypeAdapterFactory newTypeHierarchyFactory(Class<T1> clazz, TypeAdapter<T1> typeAdapter) {
      return new TypeAdapterFactory()      // $VF: Compiled from TypeAdapters.java
 {
         @Override
         public String toString() {
            return "Factory[typeHierarchy=" + clazz.getName() + ",adapter=" + typeAdapter + "]";
         }

         @Override
         public <T2> TypeAdapter<T2> create(Gson typeToken, TypeToken<T2> gson) {
            final Class<? super T2> requestedType = typeToken.getRawType();
            return (TypeAdapter<T2>)(!clazz.isAssignableFrom(requestedType)
               ? null
               : new TypeAdapter<T1>()            // $VF: Compiled from TypeAdapters.java
    {
                  @Override
                  public void write(JsonWriter out, T1 value) throws IOException {
                     typeAdapter.write(out, value);
                  }

                  @Override
                  public T1 read(JsonReader in) throws IOException {
                     T1 result = typeAdapter.read(in);
                     if (result != null && !requestedType.isInstance(result)) {
                        throw new JsonSyntaxException(
                           "Expected a " + requestedType.getName() + " but was " + result.getClass().getName() + "; at path " + in.getPreviousPath()
                        );
                     } else {
                        return result;
                     }
                  }
               });
         }
      };
   }

   // $VF: Compiled from TypeAdapters.java
   private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
      private final Map<String, T> nameToConstant = new HashMap<>();
      private final Map<String, T> stringToConstant = new HashMap<>();
      private final Map<T, String> constantToName = new HashMap<>();

      public void write(JsonWriter out, T value) throws IOException {
         out.value(value == null ? null : this.constantToName.get(value));
      }

      public EnumTypeAdapter(Class<T> classOfT) {
         try {
            Field[] constantFields = AccessController.doPrivileged(new PrivilegedAction<Field[]>()            // $VF: Compiled from TypeAdapters.java
 {
               public Field[] run() {
                  Field[] fields = classOfT.getDeclaredFields();
                  ArrayList<Field> constantFieldsList = new ArrayList<>(fields.length);

                  for (Field f : fields) {
                     if (f.isEnumConstant()) {
                        constantFieldsList.add(f);
                     }
                  }

                  Field[] var7 = constantFieldsList.toArray(new Field[0]);
                  AccessibleObject.setAccessible(var7, true);
                  return var7;
               }
            });

            for (Field constantField : constantFields) {
               T constant = (Enum)constantField.get(null);
               String name = constant.name();
               String toStringVal = constant.toString();
               SerializedName annotation = constantField.getAnnotation(SerializedName.class);
               if (annotation != null) {
                  name = annotation.value();

                  for (String alternate : annotation.alternate()) {
                     this.nameToConstant.put(alternate, (T)constant);
                  }
               }

               this.nameToConstant.put(name, (T)constant);
               this.stringToConstant.put(toStringVal, (T)constant);
               this.constantToName.put((T)constant, name);
            }
         } catch (IllegalAccessException var15) {
            throw new AssertionError(var15);
         }
      }

      public T read(JsonReader in) throws IOException {
         if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
         } else {
            String key = in.nextString();
            T constant = this.nameToConstant.get(key);
            return (T)(constant == null ? this.stringToConstant.get(key) : constant);
         }
      }
   }
}
