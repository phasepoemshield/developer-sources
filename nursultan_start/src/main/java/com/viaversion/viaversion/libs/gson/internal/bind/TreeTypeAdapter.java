/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.Gson
 *  com.viaversion.viaversion.libs.gson.JsonDeserializationContext
 *  com.viaversion.viaversion.libs.gson.JsonDeserializer
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonParseException
 *  com.viaversion.viaversion.libs.gson.JsonSerializationContext
 *  com.viaversion.viaversion.libs.gson.JsonSerializer
 *  com.viaversion.viaversion.libs.gson.TypeAdapter
 *  com.viaversion.viaversion.libs.gson.TypeAdapterFactory
 *  com.viaversion.viaversion.libs.gson.stream.JsonReader
 *  com.viaversion.viaversion.libs.gson.stream.JsonWriter
 */
package com.viaversion.viaversion.libs.gson.internal.bind;

import com.viaversion.viaversion.libs.gson.Gson;
import com.viaversion.viaversion.libs.gson.JsonDeserializationContext;
import com.viaversion.viaversion.libs.gson.JsonDeserializer;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonParseException;
import com.viaversion.viaversion.libs.gson.JsonSerializationContext;
import com.viaversion.viaversion.libs.gson.JsonSerializer;
import com.viaversion.viaversion.libs.gson.TypeAdapter;
import com.viaversion.viaversion.libs.gson.TypeAdapterFactory;
import com.viaversion.viaversion.libs.gson.internal.Streams;
import com.viaversion.viaversion.libs.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.viaversion.viaversion.libs.gson.reflect.TypeToken;
import com.viaversion.viaversion.libs.gson.stream.JsonReader;
import com.viaversion.viaversion.libs.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;

public final class TreeTypeAdapter<T>
extends SerializationDelegatingTypeAdapter<T> {
    private final JsonSerializer<T> serializer;
    private final JsonDeserializer<T> deserializer;
    final Gson gson;
    private final TypeToken<T> typeToken;
    private final TypeAdapterFactory skipPastForGetDelegateAdapter;
    private final GsonContextImpl context = new GsonContextImpl();
    private final boolean nullSafe;
    private volatile TypeAdapter<T> delegate;

    public TreeTypeAdapter(JsonSerializer<T> serializer, JsonDeserializer<T> deserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory skipPast, boolean nullSafe) {
        this.serializer = serializer;
        this.deserializer = deserializer;
        this.gson = gson;
        this.typeToken = typeToken;
        this.skipPastForGetDelegateAdapter = skipPast;
        this.nullSafe = nullSafe;
    }

    public TreeTypeAdapter(JsonSerializer<T> serializer, JsonDeserializer<T> deserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory skipPast) {
        this(serializer, deserializer, gson, typeToken, skipPast, true);
    }

    public void write(JsonWriter out, T value) throws IOException {
        if (this.serializer == null) {
            this.delegate().write(out, value);
            return;
        }
        if (this.nullSafe && value == null) {
            out.nullValue();
            return;
        }
        JsonElement tree = this.serializer.serialize(value, this.typeToken.getType(), (JsonSerializationContext)this.context);
        Streams.write(tree, out);
    }

    public T read(JsonReader in) throws IOException {
        if (this.deserializer == null) {
            return (T)this.delegate().read(in);
        }
        JsonElement value = Streams.parse(in);
        if (this.nullSafe && value.isJsonNull()) {
            return null;
        }
        return (T)this.deserializer.deserialize(value, this.typeToken.getType(), (JsonDeserializationContext)this.context);
    }

    private TypeAdapter<T> delegate() {
        TypeAdapter d = this.delegate;
        if (d == null) {
            d = this.delegate = this.gson.getDelegateAdapter(this.skipPastForGetDelegateAdapter, this.typeToken);
        }
        return d;
    }

    public static TypeAdapterFactory newFactory(TypeToken<?> exactType, Object typeAdapter) {
        return new SingleTypeFactory(typeAdapter, exactType, false, null);
    }

    public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken<?> exactType, Object typeAdapter) {
        boolean matchRawType = exactType.getType() == exactType.getRawType();
        return new SingleTypeFactory(typeAdapter, exactType, matchRawType, null);
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(Class<?> hierarchyType, Object typeAdapter) {
        return new SingleTypeFactory(typeAdapter, null, false, hierarchyType);
    }

    @Override
    public TypeAdapter<T> getSerializationDelegate() {
        return this.serializer != null ? this : this.delegate();
    }

    private final class GsonContextImpl
    implements JsonSerializationContext,
    JsonDeserializationContext {
        public <R> R deserialize(JsonElement json, Type typeOfT) throws JsonParseException {
            return (R)TreeTypeAdapter.this.gson.fromJson(json, typeOfT);
        }

        private GsonContextImpl() {
        }

        public JsonElement serialize(Object src) {
            return TreeTypeAdapter.this.gson.toJsonTree(src);
        }

        public JsonElement serialize(Object src, Type typeOfSrc) {
            return TreeTypeAdapter.this.gson.toJsonTree(src, typeOfSrc);
        }
    }

    private static final class SingleTypeFactory
    implements TypeAdapterFactory {
        private final TypeToken<?> exactType;
        private final boolean matchRawType;
        private final Class<?> hierarchyType;
        private final JsonSerializer<?> serializer;
        private final JsonDeserializer<?> deserializer;

        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            boolean matches = this.exactType != null ? this.exactType.equals(type) || this.matchRawType && this.exactType.getType() == type.getRawType() : this.hierarchyType.isAssignableFrom(type.getRawType());
            return matches ? new TreeTypeAdapter(this.serializer, this.deserializer, gson, type, this) : null;
        }

        SingleTypeFactory(Object typeAdapter, TypeToken<?> exactType, boolean matchRawType, Class<?> hierarchyType) {
            this.serializer = typeAdapter instanceof JsonSerializer ? (JsonSerializer)typeAdapter : null;
            JsonDeserializer jsonDeserializer = this.deserializer = typeAdapter instanceof JsonDeserializer ? (JsonDeserializer)typeAdapter : null;
            if (this.serializer == null && this.deserializer == null) {
                Objects.requireNonNull(typeAdapter);
                throw new IllegalArgumentException("Type adapter " + typeAdapter.getClass().getName() + " must implement JsonSerializer or JsonDeserializer");
            }
            this.exactType = exactType;
            this.matchRawType = matchRawType;
            this.hierarchyType = hierarchyType;
        }
    }
}

