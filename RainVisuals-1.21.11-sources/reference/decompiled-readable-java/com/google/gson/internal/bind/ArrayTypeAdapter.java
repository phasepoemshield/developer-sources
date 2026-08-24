/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E>
extends TypeAdapter<Object> {
    private final Class<E> componentType;
    private final TypeAdapter<E> componentTypeAdapter;
    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory(){

        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Type type;
            block2: {
                block3: {
                    type = typeToken.getType();
                    if (type instanceof GenericArrayType) break block2;
                    if (!(type instanceof Class)) break block3;
                    if (((Class)type).isArray()) break block2;
                }
                return null;
            }
            Type componentType = $Gson$Types.getArrayComponentType(type);
            TypeAdapter<?> componentTypeAdapter = gson.getAdapter(TypeToken.get(componentType));
            ArrayTypeAdapter arrayTypeAdapter = new ArrayTypeAdapter(gson, componentTypeAdapter, $Gson$Types.getRawType(componentType));
            return arrayTypeAdapter;
        }
    };

    /*
     * WARNING - void declaration
     */
    @Override
    public Object read(JsonReader in) throws IOException {
        void var2_2;
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        ArrayList<E> list = new ArrayList<E>();
        in.beginArray();
        while (in.hasNext()) {
            E instance = this.componentTypeAdapter.read(in);
            list.add(instance);
        }
        in.endArray();
        int size = list.size();
        if (this.componentType.isPrimitive()) {
            Object array = Array.newInstance(this.componentType, size);
            int i = 0;
            while (i < size) {
                void var5_7;
                Array.set(array, i, list.get(i));
                ++var5_7;
            }
            return array;
        }
        Object[] objectArray = (Object[])Array.newInstance(this.componentType, size);
        return var2_2.toArray(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void write(JsonWriter out, Object array) throws IOException {
        void var1_1;
        if (array == null) {
            out.nullValue();
            return;
        }
        out.beginArray();
        int i = 0;
        int length = Array.getLength(array);
        while (i < length) {
            void var3_3;
            void var5_5;
            Object value = Array.get(array, i);
            this.componentTypeAdapter.write(out, var5_5);
            ++var3_3;
        }
        var1_1.endArray();
    }

    public ArrayTypeAdapter(Gson context, TypeAdapter<E> componentTypeAdapter, Class<E> componentType) {
        this.componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper<E>(context, componentTypeAdapter, componentType);
        this.componentType = componentType;
    }
}

