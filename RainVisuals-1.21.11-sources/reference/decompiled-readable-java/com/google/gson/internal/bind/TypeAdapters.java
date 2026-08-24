/*
 * Decompiled with CFR 0.152.
 */
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
import com.google.gson.internal.bind.JsonTreeReader;
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
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {
    public static final TypeAdapter<URL> URL;
    public static final TypeAdapter<UUID> UUID;
    public static final TypeAdapter<Number> LONG;
    public static final TypeAdapter<JsonElement> JSON_ELEMENT;
    public static final TypeAdapter<String> STRING;
    public static final TypeAdapterFactory STRING_FACTORY;
    public static final TypeAdapter<StringBuilder> STRING_BUILDER;
    public static final TypeAdapterFactory SHORT_FACTORY;
    public static final TypeAdapterFactory URI_FACTORY;
    public static final TypeAdapter<Number> DOUBLE;
    public static final TypeAdapter<AtomicBoolean> ATOMIC_BOOLEAN;
    public static final TypeAdapterFactory ENUM_FACTORY;
    public static final TypeAdapter<Boolean> BOOLEAN_AS_STRING;
    public static final TypeAdapterFactory CHARACTER_FACTORY;
    public static final TypeAdapter<Calendar> CALENDAR;
    public static final TypeAdapterFactory CALENDAR_FACTORY;
    public static final TypeAdapter<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final TypeAdapter<Boolean> BOOLEAN;
    public static final TypeAdapterFactory BOOLEAN_FACTORY;
    public static final TypeAdapterFactory CURRENCY_FACTORY;
    public static final TypeAdapterFactory BIT_SET_FACTORY;
    public static final TypeAdapter<LazilyParsedNumber> LAZILY_PARSED_NUMBER;
    public static final TypeAdapter<Number> INTEGER;
    public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
    public static final TypeAdapterFactory CLASS_FACTORY;
    public static final TypeAdapter<InetAddress> INET_ADDRESS;
    public static final TypeAdapter<BigDecimal> BIG_DECIMAL;
    public static final TypeAdapterFactory UUID_FACTORY;
    public static final TypeAdapter<BigInteger> BIG_INTEGER;
    public static final TypeAdapterFactory URL_FACTORY;
    public static final TypeAdapter<Character> CHARACTER;
    public static final TypeAdapter<Currency> CURRENCY;
    public static final TypeAdapter<Number> BYTE;
    public static final TypeAdapter<Number> FLOAT;
    public static final TypeAdapter<BitSet> BIT_SET;
    public static final TypeAdapter<URI> URI;
    public static final TypeAdapterFactory LOCALE_FACTORY;
    public static final TypeAdapterFactory INTEGER_FACTORY;
    public static final TypeAdapter<AtomicInteger> ATOMIC_INTEGER;
    public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
    public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
    public static final TypeAdapterFactory BYTE_FACTORY;
    public static final TypeAdapter<Number> SHORT;
    public static final TypeAdapter<Class> CLASS;
    public static final TypeAdapter<StringBuffer> STRING_BUFFER;
    public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
    public static final TypeAdapter<Locale> LOCALE;
    public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;

    public static <TT> TypeAdapterFactory newFactory(final Class<TT> type, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory(){

            @Override
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                return typeToken.getRawType() == type ? typeAdapter : null;
            }

            public String toString() {
                return "Factory[type=" + type.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactory(final Class<TT> unboxed, final Class<TT> boxed, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory(){

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<T> rawType = typeToken.getRawType();
                if (rawType != unboxed) {
                    if (rawType != boxed) return null;
                }
                TypeAdapter typeAdapter2 = typeAdapter;
                return typeAdapter2;
            }

            public String toString() {
                return "Factory[type=" + boxed.getName() + "+" + unboxed.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactory(final TypeToken<TT> type, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory(){

            @Override
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                return typeToken.equals(type) ? typeAdapter : null;
            }
        };
    }

    static {
        CLASS = new TypeAdapter<Class>(){

            @Override
            public Class read(JsonReader in) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override
            public void write(JsonWriter out, Class value) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + value.getName() + ". Forgot to register a type adapter?");
            }
        }.nullSafe();
        CLASS_FACTORY = TypeAdapters.newFactory(Class.class, CLASS);
        BIT_SET = new TypeAdapter<BitSet>(){

            /*
             * WARNING - void declaration
             */
            @Override
            public void write(JsonWriter out, BitSet src) throws IOException {
                void var1_1;
                out.beginArray();
                int i = 0;
                int length = src.length();
                while (i < length) {
                    void var3_3;
                    void var5_5;
                    boolean value = src.get(i);
                    out.value((long)var5_5);
                    ++var3_3;
                }
                var1_1.endArray();
            }

            @Override
            public BitSet read(JsonReader in) throws IOException {
                BitSet bitset = new BitSet();
                in.beginArray();
                int i = 0;
                JsonToken tokenType = in.peek();
                while (tokenType != JsonToken.END_ARRAY) {
                    boolean set;
                    switch (tokenType) {
                        case NUMBER: 
                        case STRING: {
                            int intValue = in.nextInt();
                            if (intValue == 0) {
                                set = false;
                                break;
                            }
                            if (intValue == 1) {
                                set = true;
                                break;
                            }
                            throw new JsonSyntaxException("Invalid bitset value " + intValue + ", expected 0 or 1; at path " + in.getPreviousPath());
                        }
                        case BOOLEAN: {
                            set = in.nextBoolean();
                            break;
                        }
                        default: {
                            throw new JsonSyntaxException("Invalid bitset value type: " + (Object)((Object)tokenType) + "; at path " + in.getPath());
                        }
                    }
                    if (set) {
                        bitset.set(i);
                    }
                    ++i;
                    tokenType = in.peek();
                }
                in.endArray();
                return bitset;
            }
        }.nullSafe();
        BIT_SET_FACTORY = TypeAdapters.newFactory(BitSet.class, BIT_SET);
        BOOLEAN = new TypeAdapter<Boolean>(){

            @Override
            public void write(JsonWriter out, Boolean value) throws IOException {
                out.value(value);
            }

            @Override
            public Boolean read(JsonReader in) throws IOException {
                JsonToken peek = in.peek();
                if (peek == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                if (peek == JsonToken.STRING) {
                    return Boolean.parseBoolean(in.nextString());
                }
                return in.nextBoolean();
            }
        };
        BOOLEAN_AS_STRING = new TypeAdapter<Boolean>(){

            @Override
            public void write(JsonWriter out, Boolean value) throws IOException {
                out.value(value == null ? "null" : value.toString());
            }

            @Override
            public Boolean read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                return Boolean.valueOf(in.nextString());
            }
        };
        BOOLEAN_FACTORY = TypeAdapters.newFactory(Boolean.TYPE, Boolean.class, BOOLEAN);
        BYTE = new TypeAdapter<Number>(){

            /*
             * WARNING - void declaration
             */
            @Override
            public Number read(JsonReader in) throws IOException {
                void var2_2;
                block7: {
                    int intValue;
                    block6: {
                        if (in.peek() == JsonToken.NULL) {
                            in.nextNull();
                            return null;
                        }
                        try {
                            intValue = in.nextInt();
                        }
                        catch (NumberFormatException e) {
                            throw new JsonSyntaxException(e);
                        }
                        if (intValue > 255) break block6;
                        if (intValue >= -128) break block7;
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + intValue + " to byte; at path " + in.getPreviousPath());
                }
                return (byte)var2_2;
            }

            @Override
            public void write(JsonWriter out, Number value) throws IOException {
                if (value == null) {
                    out.nullValue();
                } else {
                    out.value(value.byteValue());
                }
            }
        };
        BYTE_FACTORY = TypeAdapters.newFactory(Byte.TYPE, Byte.class, BYTE);
        SHORT = new TypeAdapter<Number>(){

            @Override
            public void write(JsonWriter out, Number value) throws IOException {
                if (value == null) {
                    out.nullValue();
                } else {
                    out.value(value.shortValue());
                }
            }

            /*
             * WARNING - void declaration
             */
            @Override
            public Number read(JsonReader in) throws IOException {
                void var2_2;
                block7: {
                    int intValue;
                    block6: {
                        if (in.peek() == JsonToken.NULL) {
                            in.nextNull();
                            return null;
                        }
                        try {
                            intValue = in.nextInt();
                        }
                        catch (NumberFormatException e) {
                            throw new JsonSyntaxException(e);
                        }
                        if (intValue > 65535) break block6;
                        if (intValue >= Short.MIN_VALUE) break block7;
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + intValue + " to short; at path " + in.getPreviousPath());
                }
                return (short)var2_2;
            }
        };
        SHORT_FACTORY = TypeAdapters.newFactory(Short.TYPE, Short.class, SHORT);
        INTEGER = new TypeAdapter<Number>(){

            @Override
            public void write(JsonWriter out, Number value) throws IOException {
                if (value == null) {
                    out.nullValue();
                } else {
                    out.value(value.intValue());
                }
            }

            @Override
            public Number read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                try {
                    return in.nextInt();
                }
                catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }
        };
        INTEGER_FACTORY = TypeAdapters.newFactory(Integer.TYPE, Integer.class, INTEGER);
        ATOMIC_INTEGER = new TypeAdapter<AtomicInteger>(){

            @Override
            public void write(JsonWriter out, AtomicInteger value) throws IOException {
                out.value(value.get());
            }

            @Override
            public AtomicInteger read(JsonReader in) throws IOException {
                try {
                    return new AtomicInteger(in.nextInt());
                }
                catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }
        }.nullSafe();
        ATOMIC_INTEGER_FACTORY = TypeAdapters.newFactory(AtomicInteger.class, ATOMIC_INTEGER);
        ATOMIC_BOOLEAN = new TypeAdapter<AtomicBoolean>(){

            @Override
            public AtomicBoolean read(JsonReader in) throws IOException {
                return new AtomicBoolean(in.nextBoolean());
            }

            @Override
            public void write(JsonWriter out, AtomicBoolean value) throws IOException {
                out.value(value.get());
            }
        }.nullSafe();
        ATOMIC_BOOLEAN_FACTORY = TypeAdapters.newFactory(AtomicBoolean.class, ATOMIC_BOOLEAN);
        ATOMIC_INTEGER_ARRAY = new TypeAdapter<AtomicIntegerArray>(){

            /*
             * WARNING - void declaration
             */
            @Override
            public AtomicIntegerArray read(JsonReader in) throws IOException {
                void var4_5;
                ArrayList<Integer> list = new ArrayList<Integer>();
                in.beginArray();
                while (in.hasNext()) {
                    try {
                        int integer = in.nextInt();
                        list.add(integer);
                    }
                    catch (NumberFormatException e) {
                        throw new JsonSyntaxException(e);
                    }
                }
                in.endArray();
                int length = list.size();
                AtomicIntegerArray array = new AtomicIntegerArray(length);
                int i = 0;
                while (i < length) {
                    void var5_6;
                    array.set(i, (Integer)list.get(i));
                    ++var5_6;
                }
                return var4_5;
            }

            /*
             * WARNING - void declaration
             */
            @Override
            public void write(JsonWriter out, AtomicIntegerArray value) throws IOException {
                void var1_1;
                out.beginArray();
                int i = 0;
                int length = value.length();
                while (i < length) {
                    void var3_3;
                    out.value(value.get(i));
                    ++var3_3;
                }
                var1_1.endArray();
            }
        }.nullSafe();
        ATOMIC_INTEGER_ARRAY_FACTORY = TypeAdapters.newFactory(AtomicIntegerArray.class, ATOMIC_INTEGER_ARRAY);
        LONG = new TypeAdapter<Number>(){

            @Override
            public void write(JsonWriter out, Number value) throws IOException {
                if (value == null) {
                    out.nullValue();
                } else {
                    out.value(value.longValue());
                }
            }

            @Override
            public Number read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                try {
                    return in.nextLong();
                }
                catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }
        };
        FLOAT = new TypeAdapter<Number>(){

            /*
             * WARNING - void declaration
             */
            @Override
            public void write(JsonWriter out, Number value) throws IOException {
                if (value == null) {
                    out.nullValue();
                } else {
                    void var3_3;
                    Number floatNumber = value instanceof Float ? (Number)value : (Number)Float.valueOf(value.floatValue());
                    out.value((Number)var3_3);
                }
            }

            @Override
            public Number read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                return Float.valueOf((float)in.nextDouble());
            }
        };
        DOUBLE = new TypeAdapter<Number>(){

            @Override
            public Number read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                return in.nextDouble();
            }

            @Override
            public void write(JsonWriter out, Number value) throws IOException {
                if (value == null) {
                    out.nullValue();
                } else {
                    out.value(value.doubleValue());
                }
            }
        };
        CHARACTER = new TypeAdapter<Character>(){

            @Override
            public Character read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                String str = in.nextString();
                if (str.length() != 1) {
                    throw new JsonSyntaxException("Expecting character, got: " + str + "; at " + in.getPreviousPath());
                }
                return Character.valueOf(str.charAt(0));
            }

            @Override
            public void write(JsonWriter out, Character value) throws IOException {
                out.value(value == null ? null : String.valueOf(value));
            }
        };
        CHARACTER_FACTORY = TypeAdapters.newFactory(Character.TYPE, Character.class, CHARACTER);
        STRING = new TypeAdapter<String>(){

            /*
             * WARNING - void declaration
             */
            @Override
            public String read(JsonReader in) throws IOException {
                void var1_1;
                JsonToken peek = in.peek();
                if (peek == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                if (peek == JsonToken.BOOLEAN) {
                    return Boolean.toString(in.nextBoolean());
                }
                return var1_1.nextString();
            }

            @Override
            public void write(JsonWriter out, String value) throws IOException {
                out.value(value);
            }
        };
        BIG_DECIMAL = new TypeAdapter<BigDecimal>(){

            @Override
            public void write(JsonWriter out, BigDecimal value) throws IOException {
                out.value(value);
            }

            @Override
            public BigDecimal read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                String s = in.nextString();
                try {
                    return new BigDecimal(s);
                }
                catch (NumberFormatException e) {
                    throw new JsonSyntaxException("Failed parsing '" + s + "' as BigDecimal; at path " + in.getPreviousPath(), e);
                }
            }
        };
        BIG_INTEGER = new TypeAdapter<BigInteger>(){

            @Override
            public BigInteger read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                String s = in.nextString();
                try {
                    return new BigInteger(s);
                }
                catch (NumberFormatException e) {
                    throw new JsonSyntaxException("Failed parsing '" + s + "' as BigInteger; at path " + in.getPreviousPath(), e);
                }
            }

            @Override
            public void write(JsonWriter out, BigInteger value) throws IOException {
                out.value(value);
            }
        };
        LAZILY_PARSED_NUMBER = new TypeAdapter<LazilyParsedNumber>(){

            @Override
            public LazilyParsedNumber read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                return new LazilyParsedNumber(in.nextString());
            }

            @Override
            public void write(JsonWriter out, LazilyParsedNumber value) throws IOException {
                out.value(value);
            }
        };
        STRING_FACTORY = TypeAdapters.newFactory(String.class, STRING);
        STRING_BUILDER = new TypeAdapter<StringBuilder>(){

            @Override
            public StringBuilder read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                return new StringBuilder(in.nextString());
            }

            @Override
            public void write(JsonWriter out, StringBuilder value) throws IOException {
                out.value(value == null ? null : value.toString());
            }
        };
        STRING_BUILDER_FACTORY = TypeAdapters.newFactory(StringBuilder.class, STRING_BUILDER);
        STRING_BUFFER = new TypeAdapter<StringBuffer>(){

            @Override
            public void write(JsonWriter out, StringBuffer value) throws IOException {
                out.value(value == null ? null : value.toString());
            }

            @Override
            public StringBuffer read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                return new StringBuffer(in.nextString());
            }
        };
        STRING_BUFFER_FACTORY = TypeAdapters.newFactory(StringBuffer.class, STRING_BUFFER);
        URL = new TypeAdapter<URL>(){

            @Override
            public URL read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                String nextString = in.nextString();
                return "null".equals(nextString) ? null : new URL(nextString);
            }

            @Override
            public void write(JsonWriter out, URL value) throws IOException {
                out.value(value == null ? null : value.toExternalForm());
            }
        };
        URL_FACTORY = TypeAdapters.newFactory(URL.class, URL);
        URI = new TypeAdapter<URI>(){

            /*
             * WARNING - void declaration
             */
            @Override
            public URI read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                try {
                    void e;
                    String nextString = in.nextString();
                    return "null".equals(nextString) ? null : new URI((String)e);
                }
                catch (URISyntaxException e) {
                    void var2_3;
                    throw new JsonIOException((Throwable)var2_3);
                }
            }

            @Override
            public void write(JsonWriter out, URI value) throws IOException {
                out.value(value == null ? null : value.toASCIIString());
            }
        };
        URI_FACTORY = TypeAdapters.newFactory(URI.class, URI);
        INET_ADDRESS = new TypeAdapter<InetAddress>(){

            @Override
            public InetAddress read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                return InetAddress.getByName(in.nextString());
            }

            @Override
            public void write(JsonWriter out, InetAddress value) throws IOException {
                out.value(value == null ? null : value.getHostAddress());
            }
        };
        INET_ADDRESS_FACTORY = TypeAdapters.newTypeHierarchyFactory(InetAddress.class, INET_ADDRESS);
        UUID = new TypeAdapter<UUID>(){

            @Override
            public UUID read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }
                String s = in.nextString();
                try {
                    return java.util.UUID.fromString(s);
                }
                catch (IllegalArgumentException e) {
                    throw new JsonSyntaxException("Failed parsing '" + s + "' as UUID; at path " + in.getPreviousPath(), e);
                }
            }

            @Override
            public void write(JsonWriter out, UUID value) throws IOException {
                out.value(value == null ? null : value.toString());
            }
        };
        UUID_FACTORY = TypeAdapters.newFactory(UUID.class, UUID);
        CURRENCY = new TypeAdapter<Currency>(){

            @Override
            public Currency read(JsonReader in) throws IOException {
                String s = in.nextString();
                try {
                    return Currency.getInstance(s);
                }
                catch (IllegalArgumentException e) {
                    throw new JsonSyntaxException("Failed parsing '" + s + "' as Currency; at path " + in.getPreviousPath(), e);
                }
            }

            @Override
            public void write(JsonWriter out, Currency value) throws IOException {
                out.value(value.getCurrencyCode());
            }
        }.nullSafe();
        CURRENCY_FACTORY = TypeAdapters.newFactory(Currency.class, CURRENCY);
        CALENDAR = new TypeAdapter<Calendar>(){
            private static final String MONTH = "month";
            private static final String SECOND = "second";
            private static final String YEAR = "year";
            private static final String DAY_OF_MONTH = "dayOfMonth";
            private static final String HOUR_OF_DAY = "hourOfDay";
            private static final String MINUTE = "minute";

            /*
             * WARNING - void declaration
             */
            @Override
            public Calendar read(JsonReader in) throws IOException {
                void var7_7;
                void var6_6;
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
                boolean second = false;
                while (in.peek() != JsonToken.END_OBJECT) {
                    void var9_9;
                    String name = in.nextName();
                    int value = in.nextInt();
                    if (YEAR.equals(name)) {
                        year = value;
                        continue;
                    }
                    if (MONTH.equals(name)) {
                        month = value;
                        continue;
                    }
                    if (DAY_OF_MONTH.equals(name)) {
                        dayOfMonth = value;
                        continue;
                    }
                    if (HOUR_OF_DAY.equals(name)) {
                        hourOfDay = value;
                        continue;
                    }
                    if (MINUTE.equals(name)) {
                        minute = value;
                        continue;
                    }
                    if (!SECOND.equals(name)) continue;
                    second = var9_9;
                }
                in.endObject();
                return new GregorianCalendar(year, month, dayOfMonth, hourOfDay, (int)var6_6, (int)var7_7);
            }

            /*
             * WARNING - void declaration
             */
            @Override
            public void write(JsonWriter out, Calendar value) throws IOException {
                void var1_1;
                if (value == null) {
                    out.nullValue();
                    return;
                }
                out.beginObject();
                out.name(YEAR);
                out.value(value.get(1));
                out.name(MONTH);
                out.value(value.get(2));
                out.name(DAY_OF_MONTH);
                out.value(value.get(5));
                out.name(HOUR_OF_DAY);
                out.value(value.get(11));
                out.name(MINUTE);
                out.value(value.get(12));
                out.name(SECOND);
                out.value(value.get(13));
                var1_1.endObject();
            }
        };
        CALENDAR_FACTORY = TypeAdapters.newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, CALENDAR);
        LOCALE = new TypeAdapter<Locale>(){

            @Override
            public void write(JsonWriter out, Locale value) throws IOException {
                out.value(value == null ? null : value.toString());
            }

            /*
             * WARNING - void declaration
             */
            @Override
            public Locale read(JsonReader in) throws IOException {
                void var6_6;
                void var5_5;
                void var4_4;
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
                }
                if (variant == null) {
                    return new Locale(language, country);
                }
                return new Locale((String)var4_4, (String)var5_5, (String)var6_6);
            }
        };
        LOCALE_FACTORY = TypeAdapters.newFactory(Locale.class, LOCALE);
        JSON_ELEMENT = new TypeAdapter<JsonElement>(){

            private JsonElement tryBeginNesting(JsonReader in, JsonToken peeked) throws IOException {
                switch (peeked) {
                    case BEGIN_ARRAY: {
                        in.beginArray();
                        return new JsonArray();
                    }
                    case BEGIN_OBJECT: {
                        in.beginObject();
                        return new JsonObject();
                    }
                }
                return null;
            }

            /*
             * WARNING - void declaration
             */
            @Override
            public JsonElement read(JsonReader in) throws IOException {
                if (in instanceof JsonTreeReader) {
                    return ((JsonTreeReader)in).nextJsonElement();
                }
                JsonToken peeked = in.peek();
                JsonElement current = this.tryBeginNesting(in, peeked);
                if (current == null) {
                    return this.readTerminal(in, peeked);
                }
                ArrayDeque<JsonElement> stack = new ArrayDeque<JsonElement>();
                while (true) {
                    void var4_4;
                    if (in.hasNext()) {
                        void var6_6;
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
                        if (!isNesting) continue;
                        stack.addLast(current);
                        current = var6_6;
                        continue;
                    }
                    if (current instanceof JsonArray) {
                        in.endArray();
                    } else {
                        in.endObject();
                    }
                    if (stack.isEmpty()) {
                        return current;
                    }
                    JsonElement jsonElement = (JsonElement)var4_4.removeLast();
                }
            }

            /*
             * WARNING - void declaration
             * Enabled aggressive block sorting
             */
            @Override
            public void write(JsonWriter out, JsonElement value) throws IOException {
                block12: {
                    block11: {
                        if (value == null) break block11;
                        if (!value.isJsonNull()) break block12;
                    }
                    out.nullValue();
                    return;
                }
                if (value.isJsonPrimitive()) {
                    void var3_3;
                    JsonPrimitive primitive = value.getAsJsonPrimitive();
                    if (primitive.isNumber()) {
                        out.value(primitive.getAsNumber());
                        return;
                    }
                    if (primitive.isBoolean()) {
                        out.value(primitive.getAsBoolean());
                        return;
                    }
                    out.value(var3_3.getAsString());
                    return;
                }
                if (value.isJsonArray()) {
                    out.beginArray();
                    Iterator<JsonElement> iterator2 = value.getAsJsonArray().iterator();
                    while (true) {
                        if (!iterator2.hasNext()) {
                            out.endArray();
                            return;
                        }
                        JsonElement e = iterator2.next();
                        this.write(out, e);
                    }
                }
                if (!value.isJsonObject()) void var2_2;
                throw new IllegalArgumentException("Couldn't write " + var2_2.getClass());
                out.beginObject();
                Iterator<Map.Entry<String, JsonElement>> iterator3 = value.getAsJsonObject().entrySet().iterator();
                while (true) {
                    void var4_7;
                    if (!iterator3.hasNext()) {
                        out.endObject();
                        return;
                    }
                    Map.Entry<String, JsonElement> e = iterator3.next();
                    out.name(e.getKey());
                    this.write(out, (JsonElement)var4_7.getValue());
                }
            }

            private JsonElement readTerminal(JsonReader in, JsonToken peeked) throws IOException {
                switch (peeked) {
                    case STRING: {
                        return new JsonPrimitive(in.nextString());
                    }
                    case NUMBER: {
                        String number = in.nextString();
                        return new JsonPrimitive(new LazilyParsedNumber(number));
                    }
                    case BOOLEAN: {
                        return new JsonPrimitive(in.nextBoolean());
                    }
                    case NULL: {
                        in.nextNull();
                        return JsonNull.INSTANCE;
                    }
                }
                throw new IllegalStateException("Unexpected token: " + (Object)((Object)peeked));
            }
        };
        JSON_ELEMENT_FACTORY = TypeAdapters.newTypeHierarchyFactory(JsonElement.class, JSON_ELEMENT);
        ENUM_FACTORY = new TypeAdapterFactory(){

            @Override
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<T> rawType;
                block5: {
                    block4: {
                        rawType = typeToken.getRawType();
                        if (!Enum.class.isAssignableFrom(rawType)) break block4;
                        if (rawType != Enum.class) break block5;
                    }
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                EnumTypeAdapter<T> enumTypeAdapter = new EnumTypeAdapter<T>(rawType);
                return enumTypeAdapter;
            }
        };
    }

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    public static <TT> TypeAdapterFactory newFactoryForMultipleTypes(final Class<TT> base, final Class<? extends TT> sub, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory(){

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<T> rawType = typeToken.getRawType();
                if (rawType != base) {
                    if (rawType != sub) return null;
                }
                TypeAdapter typeAdapter2 = typeAdapter;
                return typeAdapter2;
            }

            public String toString() {
                return "Factory[type=" + base.getName() + "+" + sub.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <T1> TypeAdapterFactory newTypeHierarchyFactory(final Class<T1> clazz, final TypeAdapter<T1> typeAdapter) {
        return new TypeAdapterFactory(){

            public String toString() {
                return "Factory[typeHierarchy=" + clazz.getName() + ",adapter=" + typeAdapter + "]";
            }

            public <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
                final Class<T2> requestedType = typeToken.getRawType();
                if (!clazz.isAssignableFrom(requestedType)) {
                    return null;
                }
                return new TypeAdapter<T1>(){

                    @Override
                    public void write(JsonWriter out, T1 value) throws IOException {
                        typeAdapter.write(out, value);
                    }

                    /*
                     * WARNING - void declaration
                     */
                    @Override
                    public T1 read(JsonReader in) throws IOException {
                        void var2_2;
                        Object result = typeAdapter.read(in);
                        if (result != null) {
                            if (!requestedType.isInstance(result)) {
                                throw new JsonSyntaxException("Expected a " + requestedType.getName() + " but was " + result.getClass().getName() + "; at path " + in.getPreviousPath());
                            }
                        }
                        return var2_2;
                    }
                };
            }
        };
    }

    private static final class EnumTypeAdapter<T extends Enum<T>>
    extends TypeAdapter<T> {
        private final Map<String, T> nameToConstant = new HashMap<String, T>();
        private final Map<String, T> stringToConstant = new HashMap<String, T>();
        private final Map<T, String> constantToName = new HashMap<T, String>();

        @Override
        public void write(JsonWriter out, T value) throws IOException {
            out.value(value == null ? null : this.constantToName.get(value));
        }

        /*
         * WARNING - void declaration
         */
        public EnumTypeAdapter(final Class<T> classOfT) {
            try {
                Field[] constantFields = AccessController.doPrivileged(new PrivilegedAction<Field[]>(){

                    @Override
                    public Field[] run() {
                        AccessibleObject[] fields = classOfT.getDeclaredFields();
                        ArrayList<Field> constantFieldsList = new ArrayList<Field>(fields.length);
                        AccessibleObject[] accessibleObjectArray = fields;
                        int n = accessibleObjectArray.length;
                        for (int i = 0; i < n; ++i) {
                            Field f = accessibleObjectArray[i];
                            if (!f.isEnumConstant()) continue;
                            constantFieldsList.add(f);
                        }
                        Field[] constantFields = constantFieldsList.toArray(new Field[0]);
                        AccessibleObject.setAccessible(accessibleObjectArray, true);
                        return accessibleObjectArray;
                    }
                });
                Field[] fieldArray = constantFields;
                int n = fieldArray.length;
                for (int i = 0; i < n; ++i) {
                    Field constantField = fieldArray[i];
                    Enum constant = (Enum)constantField.get(null);
                    String name = constant.name();
                    String toStringVal = constant.toString();
                    SerializedName annotation = constantField.getAnnotation(SerializedName.class);
                    if (annotation != null) {
                        name = annotation.value();
                        String[] stringArray = annotation.alternate();
                        int n2 = stringArray.length;
                        for (int j = 0; j < n2; ++j) {
                            String alternate = stringArray[j];
                            this.nameToConstant.put(alternate, constant);
                        }
                    }
                    this.nameToConstant.put(name, constant);
                    this.stringToConstant.put(toStringVal, constant);
                    this.constantToName.put(constant, name);
                }
            }
            catch (IllegalAccessException e) {
                void var2_3;
                throw new AssertionError(var2_3);
            }
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public T read(JsonReader in) throws IOException {
            void var3_3;
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            String key = in.nextString();
            Enum constant = (Enum)this.nameToConstant.get(key);
            return (T)(constant == null ? (Enum)this.stringToConstant.get(key) : var3_3);
        }
    }
}

