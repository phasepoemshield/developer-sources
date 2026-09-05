/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.Gson
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonDeserializationContext
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonDeserializer
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonParseException
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonSerializationContext
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonSerializer
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapterFactory
 *  fun.crashsystem.jdrpc.libs.com.google.gson.internal.Streams
 */
package fun.crashsystem.jdrpc.libs.com.google.gson.internal.bind;

import fun.crashsystem.jdrpc.libs.com.google.gson.Gson;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonDeserializationContext;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonDeserializer;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonParseException;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonSerializationContext;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonSerializer;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapterFactory;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.Streams;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import fun.crashsystem.jdrpc.libs.com.google.gson.reflect.TypeToken;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonReader;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonWriter;
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

    public T read(JsonReader in) throws IOException {
        if (this.deserializer == null) {
            return (T)this.delegate().read(in);
        }
        JsonElement value = Streams.parse((JsonReader)in);
        if (this.nullSafe && value.isJsonNull()) {
            return null;
        }
        return (T)this.deserializer.deserialize(value, this.typeToken.getType(), (JsonDeserializationContext)this.context);
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
        Streams.write((JsonElement)tree, (JsonWriter)out);
    }

    private TypeAdapter<T> delegate() {
        TypeAdapter d = this.delegate;
        if (d == null) {
            d = this.delegate = this.gson.getDelegateAdapter(this.skipPastForGetDelegateAdapter, this.typeToken);
        }
        return d;
    }

    @Override
    public TypeAdapter<T> getSerializationDelegate() {
        return this.serializer != null ? this : this.delegate();
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

    private final class GsonContextImpl
    implements JsonSerializationContext,
    JsonDeserializationContext {
        private GsonContextImpl() {
        }

        public JsonElement serialize(Object src) {
            return TreeTypeAdapter.this.gson.toJsonTree(src);
        }

        public JsonElement serialize(Object src, Type typeOfSrc) {
            return TreeTypeAdapter.this.gson.toJsonTree(src, typeOfSrc);
        }

        public <R> R deserialize(JsonElement json, Type typeOfT) throws JsonParseException {
            return (R)TreeTypeAdapter.this.gson.fromJson(json, typeOfT);
        }
    }

    private static final class SingleTypeFactory
    implements TypeAdapterFactory {
        private final TypeToken<?> exactType;
        private final boolean matchRawType;
        private final Class<?> hierarchyType;
        private final JsonSerializer<?> serializer;
        private final JsonDeserializer<?> deserializer;

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

        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            boolean matches = this.exactType != null ? this.exactType.equals(type) || this.matchRawType && this.exactType.getType() == type.getRawType() : this.hierarchyType.isAssignableFrom(type.getRawType());
            return matches ? new TreeTypeAdapter(this.serializer, this.deserializer, gson, type, this) : null;
        }
    }
}

