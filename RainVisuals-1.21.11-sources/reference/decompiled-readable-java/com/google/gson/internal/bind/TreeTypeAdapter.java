/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.$Gson$Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

public final class TreeTypeAdapter<T>
extends SerializationDelegatingTypeAdapter<T> {
    private final GsonContextImpl context = new GsonContextImpl();
    private volatile TypeAdapter<T> delegate;
    final Gson gson;
    private final JsonSerializer<T> serializer;
    private final TypeToken<T> typeToken;
    private final JsonDeserializer<T> deserializer;
    private final TypeAdapterFactory skipPast;
    private final boolean nullSafe;

    @Override
    public TypeAdapter<T> getSerializationDelegate() {
        return this.serializer != null ? this : this.delegate();
    }

    public TreeTypeAdapter(JsonSerializer<T> serializer2, JsonDeserializer<T> deserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory skipPast) {
        this(serializer2, deserializer, gson, typeToken, skipPast, true);
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

    private TypeAdapter<T> delegate() {
        TypeAdapter<T> d = this.delegate;
        return d != null ? d : (this.delegate = this.gson.getDelegateAdapter(this.skipPast, this.typeToken));
    }

    @Override
    public T read(JsonReader in) throws IOException {
        if (this.deserializer == null) {
            return this.delegate().read(in);
        }
        JsonElement value = Streams.parse(in);
        if (this.nullSafe) {
            if (value.isJsonNull()) {
                return null;
            }
        }
        return this.deserializer.deserialize(value, this.typeToken.getType(), this.context);
    }

    public TreeTypeAdapter(JsonSerializer<T> serializer2, JsonDeserializer<T> deserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory skipPast, boolean nullSafe) {
        this.serializer = serializer2;
        this.deserializer = deserializer;
        this.gson = gson;
        this.typeToken = typeToken;
        this.skipPast = skipPast;
        this.nullSafe = nullSafe;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void write(JsonWriter out, T value) throws IOException {
        void var1_1;
        if (this.serializer == null) {
            this.delegate().write(out, value);
            return;
        }
        if (this.nullSafe) {
            if (value == null) {
                out.nullValue();
                return;
            }
        }
        JsonElement tree = this.serializer.serialize(value, this.typeToken.getType(), this.context);
        Streams.write(tree, (JsonWriter)var1_1);
    }

    private static final class SingleTypeFactory
    implements TypeAdapterFactory {
        private final JsonSerializer<?> serializer;
        private final TypeToken<?> exactType;
        private final boolean matchRawType;
        private final JsonDeserializer<?> deserializer;
        private final Class<?> hierarchyType;

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            boolean bl;
            if (this.exactType != null) {
                if (!this.exactType.equals(type)) {
                    if (!this.matchRawType) return null;
                    if (this.exactType.getType() != type.getRawType()) return null;
                }
                bl = true;
            } else {
                bl = this.hierarchyType.isAssignableFrom(type.getRawType());
            }
            boolean matches = bl;
            if (!matches) return null;
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(this.serializer, this.deserializer, gson, type, this);
            return treeTypeAdapter;
        }

        /*
         * WARNING - void declaration
         */
        SingleTypeFactory(Object typeAdapter, TypeToken<?> exactType, boolean matchRawType, Class<?> hierarchyType) {
            void var4_4;
            this.serializer = typeAdapter instanceof JsonSerializer ? (JsonSerializer)typeAdapter : null;
            this.deserializer = typeAdapter instanceof JsonDeserializer ? (JsonDeserializer)typeAdapter : null;
            $Gson$Preconditions.checkArgument(this.serializer != null || this.deserializer != null);
            this.exactType = exactType;
            this.matchRawType = matchRawType;
            this.hierarchyType = var4_4;
        }
    }

    private final class GsonContextImpl
    implements JsonSerializationContext,
    JsonDeserializationContext {
        private GsonContextImpl() {
        }

        @Override
        public JsonElement serialize(Object src) {
            return TreeTypeAdapter.this.gson.toJsonTree(src);
        }

        @Override
        public JsonElement serialize(Object src, Type typeOfSrc) {
            return TreeTypeAdapter.this.gson.toJsonTree(src, typeOfSrc);
        }

        public <R> R deserialize(JsonElement json, Type typeOfT) throws JsonParseException {
            return (R)TreeTypeAdapter.this.gson.fromJson(json, typeOfT);
        }
    }
}

