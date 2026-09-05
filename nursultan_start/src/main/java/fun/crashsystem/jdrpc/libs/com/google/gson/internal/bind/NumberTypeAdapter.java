/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.Gson
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonSyntaxException
 *  fun.crashsystem.jdrpc.libs.com.google.gson.ToNumberPolicy
 *  fun.crashsystem.jdrpc.libs.com.google.gson.ToNumberStrategy
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapterFactory
 */
package fun.crashsystem.jdrpc.libs.com.google.gson.internal.bind;

import fun.crashsystem.jdrpc.libs.com.google.gson.Gson;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonSyntaxException;
import fun.crashsystem.jdrpc.libs.com.google.gson.ToNumberPolicy;
import fun.crashsystem.jdrpc.libs.com.google.gson.ToNumberStrategy;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapterFactory;
import fun.crashsystem.jdrpc.libs.com.google.gson.reflect.TypeToken;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonReader;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonToken;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class NumberTypeAdapter
extends TypeAdapter<Number> {
    private static final TypeAdapterFactory LAZILY_PARSED_NUMBER_FACTORY = NumberTypeAdapter.newFactory((ToNumberStrategy)ToNumberPolicy.LAZILY_PARSED_NUMBER);
    private final ToNumberStrategy toNumberStrategy;

    private NumberTypeAdapter(ToNumberStrategy toNumberStrategy) {
        this.toNumberStrategy = toNumberStrategy;
    }

    private static TypeAdapterFactory newFactory(ToNumberStrategy toNumberStrategy) {
        final NumberTypeAdapter adapter = new NumberTypeAdapter(toNumberStrategy);
        return new TypeAdapterFactory(){

            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
                return type.getRawType() == Number.class ? adapter : null;
            }
        };
    }

    public static TypeAdapterFactory getFactory(ToNumberStrategy toNumberStrategy) {
        if (toNumberStrategy == ToNumberPolicy.LAZILY_PARSED_NUMBER) {
            return LAZILY_PARSED_NUMBER_FACTORY;
        }
        return NumberTypeAdapter.newFactory(toNumberStrategy);
    }

    public Number read(JsonReader in) throws IOException {
        JsonToken jsonToken = in.peek();
        switch (jsonToken) {
            case NULL: {
                in.nextNull();
                return null;
            }
            case NUMBER: 
            case STRING: {
                return this.toNumberStrategy.readNumber(in);
            }
        }
        throw new JsonSyntaxException("Expecting number, got: " + (Object)((Object)jsonToken) + "; at path " + in.getPath());
    }

    public void write(JsonWriter out, Number value) throws IOException {
        out.value(value);
    }
}

