/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.Gson
 *  com.viaversion.viaversion.libs.gson.TypeAdapter
 *  com.viaversion.viaversion.libs.gson.TypeAdapterFactory
 *  com.viaversion.viaversion.libs.gson.internal.GsonTypes
 *  com.viaversion.viaversion.libs.gson.stream.JsonReader
 *  com.viaversion.viaversion.libs.gson.stream.JsonToken
 *  com.viaversion.viaversion.libs.gson.stream.JsonWriter
 */
package com.viaversion.viaversion.libs.gson.internal.bind;

import com.viaversion.viaversion.libs.gson.Gson;
import com.viaversion.viaversion.libs.gson.TypeAdapter;
import com.viaversion.viaversion.libs.gson.TypeAdapterFactory;
import com.viaversion.viaversion.libs.gson.internal.GsonTypes;
import com.viaversion.viaversion.libs.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.viaversion.viaversion.libs.gson.reflect.TypeToken;
import com.viaversion.viaversion.libs.gson.stream.JsonReader;
import com.viaversion.viaversion.libs.gson.stream.JsonToken;
import com.viaversion.viaversion.libs.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E>
extends TypeAdapter<Object> {
    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory(){

        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType || type instanceof Class && ((Class)type).isArray())) {
                return null;
            }
            Type componentType = GsonTypes.getArrayComponentType((Type)type);
            TypeAdapter componentTypeAdapter = gson.getAdapter(TypeToken.get(componentType));
            ArrayTypeAdapter arrayAdapter = new ArrayTypeAdapter(gson, componentTypeAdapter, GsonTypes.getRawType((Type)componentType));
            return arrayAdapter;
        }
    };
    private final Class<E> componentType;
    private final TypeAdapter<E> componentTypeAdapter;

    public ArrayTypeAdapter(Gson context, TypeAdapter<E> componentTypeAdapter, Class<E> componentType) {
        this.componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper<E>(context, componentTypeAdapter, componentType);
        this.componentType = componentType;
    }

    public Object read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        ArrayList<Object> list = new ArrayList<Object>();
        in.beginArray();
        while (in.hasNext()) {
            Object instance = this.componentTypeAdapter.read(in);
            list.add(instance);
        }
        in.endArray();
        int size = list.size();
        if (this.componentType.isPrimitive()) {
            Object array = Array.newInstance(this.componentType, size);
            for (int i = 0; i < size; ++i) {
                Array.set(array, i, list.get(i));
            }
            return array;
        }
        Object[] array = (Object[])Array.newInstance(this.componentType, size);
        return list.toArray(array);
    }

    public void write(JsonWriter out, Object array) throws IOException {
        if (array == null) {
            out.nullValue();
            return;
        }
        out.beginArray();
        int length = Array.getLength(array);
        for (int i = 0; i < length; ++i) {
            Object value = Array.get(array, i);
            this.componentTypeAdapter.write(out, value);
        }
        out.endArray();
    }
}

