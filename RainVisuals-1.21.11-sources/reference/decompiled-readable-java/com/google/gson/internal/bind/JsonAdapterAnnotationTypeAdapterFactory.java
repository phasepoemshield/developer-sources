/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.reflect.TypeToken;

public final class JsonAdapterAnnotationTypeAdapterFactory
implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> targetType) {
        Class<T> rawType = targetType.getRawType();
        JsonAdapter annotation = rawType.getAnnotation(JsonAdapter.class);
        if (annotation == null) {
            return null;
        }
        return this.getTypeAdapter(this.constructorConstructor, gson, targetType, annotation);
    }

    /*
     * WARNING - void declaration
     */
    TypeAdapter<?> getTypeAdapter(ConstructorConstructor constructorConstructor, Gson gson, TypeToken<?> type, JsonAdapter annotation) {
        TypeAdapter typeAdapter;
        TypeAdapter<?> typeAdapter2;
        Object instance = constructorConstructor.get(TypeToken.get(annotation.value())).construct();
        boolean nullSafe = annotation.nullSafe();
        if (instance instanceof TypeAdapter) {
            typeAdapter2 = (TypeAdapter<?>)instance;
        } else if (instance instanceof TypeAdapterFactory) {
            typeAdapter2 = ((TypeAdapterFactory)instance).create(gson, type);
        } else if (instance instanceof JsonSerializer || instance instanceof JsonDeserializer) {
            void var10_10;
            JsonSerializer serializer2 = instance instanceof JsonSerializer ? (JsonSerializer)instance : null;
            JsonDeserializer deserializer = instance instanceof JsonDeserializer ? (JsonDeserializer)instance : null;
            TreeTypeAdapter tempAdapter = new TreeTypeAdapter(serializer2, deserializer, gson, type, null, nullSafe);
            typeAdapter2 = var10_10;
            nullSafe = false;
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + instance.getClass().getName() + " as a @JsonAdapter for " + type.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (typeAdapter2 != null && nullSafe) {
            typeAdapter = typeAdapter2.nullSafe();
        }
        return typeAdapter;
    }
}

