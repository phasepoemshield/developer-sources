/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.Gson
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapterFactory
 *  fun.crashsystem.jdrpc.libs.com.google.gson.internal.LazilyParsedNumber
 */
package fun.crashsystem.jdrpc.libs.com.google.gson.internal.bind;

import fun.crashsystem.jdrpc.libs.com.google.gson.Gson;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapterFactory;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.LazilyParsedNumber;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.bind.TypeAdapters$34;
import fun.crashsystem.jdrpc.libs.com.google.gson.reflect.TypeToken;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {
    public static final TypeAdapter<Class> CLASS;
    public static final TypeAdapterFactory CLASS_FACTORY;
    public static final TypeAdapter<BitSet> BIT_SET;
    public static final TypeAdapterFactory BIT_SET_FACTORY;
    public static final TypeAdapter<Boolean> BOOLEAN;
    public static final TypeAdapter<Boolean> BOOLEAN_AS_STRING;
    public static final TypeAdapterFactory BOOLEAN_FACTORY;
    public static final TypeAdapter<Number> BYTE;
    public static final TypeAdapterFactory BYTE_FACTORY;
    public static final TypeAdapter<Number> SHORT;
    public static final TypeAdapterFactory SHORT_FACTORY;
    public static final TypeAdapter<Number> INTEGER;
    public static final TypeAdapterFactory INTEGER_FACTORY;
    public static final TypeAdapter<AtomicInteger> ATOMIC_INTEGER;
    public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
    public static final TypeAdapter<AtomicBoolean> ATOMIC_BOOLEAN;
    public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
    public static final TypeAdapter<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final TypeAdapter<Number> LONG;
    public static final TypeAdapter<Number> FLOAT;
    public static final TypeAdapter<Number> DOUBLE;
    public static final TypeAdapter<Character> CHARACTER;
    public static final TypeAdapterFactory CHARACTER_FACTORY;
    public static final TypeAdapter<String> STRING;
    public static final TypeAdapter<BigDecimal> BIG_DECIMAL;
    public static final TypeAdapter<BigInteger> BIG_INTEGER;
    public static final TypeAdapter<LazilyParsedNumber> LAZILY_PARSED_NUMBER;
    public static final TypeAdapterFactory STRING_FACTORY;
    public static final TypeAdapter<StringBuilder> STRING_BUILDER;
    public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
    public static final TypeAdapter<StringBuffer> STRING_BUFFER;
    public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
    public static final TypeAdapter<URL> URL;
    public static final TypeAdapterFactory URL_FACTORY;
    public static final TypeAdapter<URI> URI;
    public static final TypeAdapterFactory URI_FACTORY;
    public static final TypeAdapter<InetAddress> INET_ADDRESS;
    public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final TypeAdapter<UUID> UUID;
    public static final TypeAdapterFactory UUID_FACTORY;
    public static final TypeAdapter<Currency> CURRENCY;
    public static final TypeAdapterFactory CURRENCY_FACTORY;
    public static final TypeAdapter<Calendar> CALENDAR;
    public static final TypeAdapterFactory CALENDAR_FACTORY;
    public static final TypeAdapter<Locale> LOCALE;
    public static final TypeAdapterFactory LOCALE_FACTORY;
    public static final TypeAdapter<JsonElement> JSON_ELEMENT;
    public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
    public static final TypeAdapterFactory ENUM_FACTORY;

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    public static <TT> TypeAdapterFactory newFactory(final Class<TT> unboxed, final Class<TT> boxed, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory(){

            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<T> rawType = typeToken.getRawType();
                return rawType == unboxed || rawType == boxed ? typeAdapter : null;
            }

            public String toString() {
                return "Factory[type=" + boxed.getName() + "+" + unboxed.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactory(final TypeToken<TT> type, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory(){

            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                return typeToken.equals(type) ? typeAdapter : null;
            }
        };
    }

    public static <TT> TypeAdapterFactory newFactory(final Class<TT> type, final TypeAdapter<TT> typeAdapter) {
        return new TypeAdapterFactory(){

            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                return typeToken.getRawType() == type ? typeAdapter : null;
            }

            public String toString() {
                return "Factory[type=" + type.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <T1> TypeAdapterFactory newTypeHierarchyFactory(Class<T1> clazz, TypeAdapter<T1> typeAdapter) {
        return new TypeAdapters$34(clazz, typeAdapter);
    }

    public static <TT> TypeAdapterFactory newFactoryForMultipleTypes(final Class<TT> base, final Class<? extends TT> sub, final TypeAdapter<? super TT> typeAdapter) {
        return new TypeAdapterFactory(){

            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<T> rawType = typeToken.getRawType();
                return rawType == base || rawType == sub ? typeAdapter : null;
            }

            public String toString() {
                return "Factory[type=" + base.getName() + "+" + sub.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}

