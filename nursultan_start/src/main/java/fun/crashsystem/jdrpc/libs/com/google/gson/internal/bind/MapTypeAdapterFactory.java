/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.Gson
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonPrimitive
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonSyntaxException
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter
 *  fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapterFactory
 *  fun.crashsystem.jdrpc.libs.com.google.gson.internal.ConstructorConstructor
 *  fun.crashsystem.jdrpc.libs.com.google.gson.internal.GsonTypes
 *  fun.crashsystem.jdrpc.libs.com.google.gson.internal.JsonReaderInternalAccess
 *  fun.crashsystem.jdrpc.libs.com.google.gson.internal.ObjectConstructor
 *  fun.crashsystem.jdrpc.libs.com.google.gson.internal.Streams
 */
package fun.crashsystem.jdrpc.libs.com.google.gson.internal.bind;

import fun.crashsystem.jdrpc.libs.com.google.gson.Gson;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonPrimitive;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonSyntaxException;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapter;
import fun.crashsystem.jdrpc.libs.com.google.gson.TypeAdapterFactory;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.ConstructorConstructor;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.GsonTypes;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.JsonReaderInternalAccess;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.ObjectConstructor;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.Streams;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import fun.crashsystem.jdrpc.libs.com.google.gson.internal.bind.TypeAdapters;
import fun.crashsystem.jdrpc.libs.com.google.gson.reflect.TypeToken;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonReader;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonToken;
import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public final class MapTypeAdapterFactory
implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;
    final boolean complexMapKeySerialization;

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean complexMapKeySerialization) {
        this.constructorConstructor = constructorConstructor;
        this.complexMapKeySerialization = complexMapKeySerialization;
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<T> rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] keyAndValueTypes = GsonTypes.getMapKeyAndValueTypes((Type)type, rawType);
        Type keyType = keyAndValueTypes[0];
        Type valueType = keyAndValueTypes[1];
        TypeAdapter<?> keyAdapter = this.getKeyAdapter(gson, keyType);
        TypeAdapterRuntimeTypeWrapper wrappedKeyAdapter = new TypeAdapterRuntimeTypeWrapper(gson, keyAdapter, keyType);
        TypeAdapter valueAdapter = gson.getAdapter(TypeToken.get(valueType));
        TypeAdapterRuntimeTypeWrapper wrappedValueAdapter = new TypeAdapterRuntimeTypeWrapper(gson, valueAdapter, valueType);
        boolean allowUnsafe = false;
        ObjectConstructor constructor = this.constructorConstructor.get(typeToken, allowUnsafe);
        Adapter result = new Adapter(wrappedKeyAdapter, wrappedValueAdapter, constructor);
        return result;
    }

    private TypeAdapter<?> getKeyAdapter(Gson context, Type keyType) {
        return keyType == Boolean.TYPE || keyType == Boolean.class ? TypeAdapters.BOOLEAN_AS_STRING : context.getAdapter(TypeToken.get(keyType));
    }

    private final class Adapter<K, V>
    extends TypeAdapter<Map<K, V>> {
        private final TypeAdapter<K> keyTypeAdapter;
        private final TypeAdapter<V> valueTypeAdapter;
        private final ObjectConstructor<? extends Map<K, V>> constructor;

        Adapter(TypeAdapter<K> keyTypeAdapter, TypeAdapter<V> valueTypeAdapter, ObjectConstructor<? extends Map<K, V>> constructor) {
            this.keyTypeAdapter = keyTypeAdapter;
            this.valueTypeAdapter = valueTypeAdapter;
            this.constructor = constructor;
        }

        public Map<K, V> read(JsonReader in) throws IOException {
            JsonToken peek = in.peek();
            if (peek == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            Map map = (Map)this.constructor.construct();
            if (peek == JsonToken.BEGIN_ARRAY) {
                in.beginArray();
                while (in.hasNext()) {
                    in.beginArray();
                    Object key = this.keyTypeAdapter.read(in);
                    Object value = this.valueTypeAdapter.read(in);
                    Object replaced = map.put(key, value);
                    if (replaced != null) {
                        throw new JsonSyntaxException("duplicate key: " + key);
                    }
                    in.endArray();
                }
                in.endArray();
            } else {
                in.beginObject();
                while (in.hasNext()) {
                    Object value;
                    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(in);
                    Object key = this.keyTypeAdapter.read(in);
                    Object replaced = map.put(key, value = this.valueTypeAdapter.read(in));
                    if (replaced == null) continue;
                    throw new JsonSyntaxException("duplicate key: " + key);
                }
                in.endObject();
            }
            return map;
        }

        public void write(JsonWriter out, Map<K, V> map) throws IOException {
            JsonElement keyElement;
            if (map == null) {
                out.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.complexMapKeySerialization) {
                out.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    out.name(String.valueOf(entry.getKey()));
                    this.valueTypeAdapter.write(out, entry.getValue());
                }
                out.endObject();
                return;
            }
            boolean hasComplexKeys = false;
            ArrayList<JsonElement> keys = new ArrayList<JsonElement>(map.size());
            ArrayList<V> values = new ArrayList<V>(map.size());
            for (Map.Entry<K, V> entry : map.entrySet()) {
                keyElement = this.keyTypeAdapter.toJsonTree(entry.getKey());
                keys.add(keyElement);
                values.add(entry.getValue());
                hasComplexKeys |= keyElement.isJsonArray() || keyElement.isJsonObject();
            }
            if (hasComplexKeys) {
                out.beginArray();
                int size = keys.size();
                for (int i = 0; i < size; ++i) {
                    out.beginArray();
                    Streams.write((JsonElement)((JsonElement)keys.get(i)), (JsonWriter)out);
                    this.valueTypeAdapter.write(out, values.get(i));
                    out.endArray();
                }
                out.endArray();
            } else {
                out.beginObject();
                int size = keys.size();
                for (int i = 0; i < size; ++i) {
                    keyElement = (JsonElement)keys.get(i);
                    out.name(this.keyToString(keyElement));
                    this.valueTypeAdapter.write(out, values.get(i));
                }
                out.endObject();
            }
        }

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
    }
}

