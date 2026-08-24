/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class MapTypeAdapterFactory
implements TypeAdapterFactory {
    final boolean complexMapKeySerialization;
    private final ConstructorConstructor constructorConstructor;

    /*
     * Enabled aggressive block sorting
     */
    private TypeAdapter<?> getKeyAdapter(Gson context, Type keyType) {
        TypeAdapter<Boolean> typeAdapter;
        if (keyType != Boolean.TYPE) {
            if (keyType != Boolean.class) {
                typeAdapter = context.getAdapter(TypeToken.get(keyType));
                return typeAdapter;
            }
        }
        typeAdapter = TypeAdapters.BOOLEAN_AS_STRING;
        return typeAdapter;
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean complexMapKeySerialization) {
        this.constructorConstructor = constructorConstructor;
        this.complexMapKeySerialization = complexMapKeySerialization;
    }

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<T> rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] keyAndValueTypes = $Gson$Types.getMapKeyAndValueTypes(type, rawType);
        TypeAdapter<?> keyAdapter = this.getKeyAdapter(gson, keyAndValueTypes[0]);
        TypeAdapter<?> valueAdapter = gson.getAdapter(TypeToken.get(keyAndValueTypes[1]));
        ObjectConstructor<T> constructor = this.constructorConstructor.get(typeToken);
        Adapter adapter = new Adapter(gson, keyAndValueTypes[0], keyAdapter, keyAndValueTypes[1], valueAdapter, constructor);
        return adapter;
    }

    private final class Adapter<K, V>
    extends TypeAdapter<Map<K, V>> {
        private final TypeAdapter<K> keyTypeAdapter;
        private final TypeAdapter<V> valueTypeAdapter;
        private final ObjectConstructor<? extends Map<K, V>> constructor;

        private String keyToString(JsonElement keyElement) {
            if (keyElement.isJsonPrimitive()) {
                JsonPrimitive primitive = keyElement.getAsJsonPrimitive();
                if (primitive.isNumber()) {
                    return String.valueOf(primitive.getAsNumber());
                }
                if (primitive.isBoolean()) {
                    return Boolean.toString(primitive.getAsBoolean());
                }
                if (primitive.isString()) {
                    return primitive.getAsString();
                }
                throw new AssertionError();
            }
            if (keyElement.isJsonNull()) {
                return "null";
            }
            throw new AssertionError();
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public Map<K, V> read(JsonReader in) throws IOException {
            void var3_3;
            JsonToken peek = in.peek();
            if (peek == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            Map<K, V> map = this.constructor.construct();
            if (peek == JsonToken.BEGIN_ARRAY) {
                in.beginArray();
                while (in.hasNext()) {
                    in.beginArray();
                    K key = this.keyTypeAdapter.read(in);
                    V value = this.valueTypeAdapter.read(in);
                    V replaced = map.put(key, value);
                    if (replaced != null) {
                        throw new JsonSyntaxException("duplicate key: " + key);
                    }
                    in.endArray();
                }
                in.endArray();
            } else {
                void var1_1;
                in.beginObject();
                while (in.hasNext()) {
                    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(in);
                    K key = this.keyTypeAdapter.read(in);
                    V value = this.valueTypeAdapter.read(in);
                    V replaced = map.put(key, value);
                    if (replaced == null) continue;
                    throw new JsonSyntaxException("duplicate key: " + key);
                }
                var1_1.endObject();
            }
            return var3_3;
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public void write(JsonWriter out, Map<K, V> map) throws IOException {
            JsonElement keyElement;
            if (map == null) {
                out.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.complexMapKeySerialization) {
                out.beginObject();
                Iterator<Map.Entry<K, V>> iterator2 = map.entrySet().iterator();
                while (iterator2.hasNext()) {
                    Map.Entry<K, V> entry = iterator2.next();
                    out.name(String.valueOf(entry.getKey()));
                    this.valueTypeAdapter.write(out, entry.getValue());
                }
                out.endObject();
                return;
            }
            boolean hasComplexKeys = false;
            ArrayList<JsonElement> keys2 = new ArrayList<JsonElement>(map.size());
            ArrayList<V> values2 = new ArrayList<V>(map.size());
            for (Map.Entry<K, V> entry : map.entrySet()) {
                keyElement = this.keyTypeAdapter.toJsonTree(entry.getKey());
                keys2.add(keyElement);
                values2.add(entry.getValue());
                hasComplexKeys |= keyElement.isJsonArray() || keyElement.isJsonObject();
            }
            if (hasComplexKeys) {
                out.beginArray();
                int size = keys2.size();
                for (int i = 0; i < size; ++i) {
                    out.beginArray();
                    Streams.write((JsonElement)keys2.get(i), out);
                    this.valueTypeAdapter.write(out, values2.get(i));
                    out.endArray();
                }
                out.endArray();
            } else {
                void var1_1;
                out.beginObject();
                int i = 0;
                int size = keys2.size();
                while (i < size) {
                    void var6_10;
                    keyElement = (JsonElement)keys2.get(i);
                    out.name(this.keyToString(keyElement));
                    this.valueTypeAdapter.write(out, values2.get(i));
                    ++var6_10;
                }
                var1_1.endObject();
            }
        }

        public Adapter(Gson context, Type keyType, TypeAdapter<K> keyTypeAdapter, Type valueType, TypeAdapter<V> valueTypeAdapter, ObjectConstructor<? extends Map<K, V>> constructor) {
            this.keyTypeAdapter = new TypeAdapterRuntimeTypeWrapper<K>(context, keyTypeAdapter, keyType);
            this.valueTypeAdapter = new TypeAdapterRuntimeTypeWrapper<V>(context, valueTypeAdapter, valueType);
            this.constructor = constructor;
        }
    }
}

