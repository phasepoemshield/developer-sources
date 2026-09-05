/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.Gson
 *  com.viaversion.viaversion.libs.gson.TypeAdapter
 *  com.viaversion.viaversion.libs.gson.TypeAdapterFactory
 *  com.viaversion.viaversion.libs.gson.internal.ConstructorConstructor
 *  com.viaversion.viaversion.libs.gson.internal.GsonTypes
 *  com.viaversion.viaversion.libs.gson.stream.JsonReader
 *  com.viaversion.viaversion.libs.gson.stream.JsonToken
 *  com.viaversion.viaversion.libs.gson.stream.JsonWriter
 */
package com.viaversion.viaversion.libs.gson.internal.bind;

import com.viaversion.viaversion.libs.gson.Gson;
import com.viaversion.viaversion.libs.gson.TypeAdapter;
import com.viaversion.viaversion.libs.gson.TypeAdapterFactory;
import com.viaversion.viaversion.libs.gson.internal.ConstructorConstructor;
import com.viaversion.viaversion.libs.gson.internal.GsonTypes;
import com.viaversion.viaversion.libs.gson.internal.ObjectConstructor;
import com.viaversion.viaversion.libs.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.viaversion.viaversion.libs.gson.reflect.TypeToken;
import com.viaversion.viaversion.libs.gson.stream.JsonReader;
import com.viaversion.viaversion.libs.gson.stream.JsonToken;
import com.viaversion.viaversion.libs.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory
implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type elementType = GsonTypes.getCollectionElementType((Type)type, rawType);
        TypeAdapter elementTypeAdapter = gson.getAdapter(TypeToken.get(elementType));
        TypeAdapterRuntimeTypeWrapper wrappedTypeAdapter = new TypeAdapterRuntimeTypeWrapper(gson, elementTypeAdapter, elementType);
        boolean allowUnsafe = false;
        ObjectConstructor constructor = this.constructorConstructor.get(typeToken, allowUnsafe);
        Adapter result = new Adapter(wrappedTypeAdapter, constructor);
        return result;
    }

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    private static final class Adapter<E>
    extends TypeAdapter<Collection<E>> {
        private final TypeAdapter<E> elementTypeAdapter;
        private final ObjectConstructor<? extends Collection<E>> constructor;

        Adapter(TypeAdapter<E> elementTypeAdapter, ObjectConstructor<? extends Collection<E>> constructor) {
            this.elementTypeAdapter = elementTypeAdapter;
            this.constructor = constructor;
        }

        public Collection<E> read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            Collection<Object> collection = this.constructor.construct();
            in.beginArray();
            while (in.hasNext()) {
                Object instance = this.elementTypeAdapter.read(in);
                collection.add(instance);
            }
            in.endArray();
            return collection;
        }

        public void write(JsonWriter out, Collection<E> collection) throws IOException {
            if (collection == null) {
                out.nullValue();
                return;
            }
            out.beginArray();
            for (E element : collection) {
                this.elementTypeAdapter.write(out, element);
            }
            out.endArray();
        }
    }
}

