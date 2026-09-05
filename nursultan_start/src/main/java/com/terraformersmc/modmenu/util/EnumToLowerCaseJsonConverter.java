/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package com.terraformersmc.modmenu.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public final class EnumToLowerCaseJsonConverter
implements JsonDeserializer<Enum<?>>,
JsonSerializer<Enum<?>> {
    private static final Map<String, Class<? extends Enum<?>>> TYPE_CACHE = new HashMap();

    public Enum<?> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return null;
        }
        if (!jsonElement.isJsonPrimitive() || !jsonElement.getAsJsonPrimitive().isString()) {
            throw new JsonParseException("Expecting a String JsonPrimitive, getting " + String.valueOf(jsonElement));
        }
        try {
            String string = type.getTypeName();
            Class<Enum> clazz = TYPE_CACHE.get(string);
            if (clazz == null) {
                clazz = Class.forName(string);
                TYPE_CACHE.put(string, clazz);
            }
            return Enum.valueOf(clazz, jsonElement.getAsString().toUpperCase());
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new JsonParseException((Throwable)classNotFoundException);
        }
    }

    public JsonElement serialize(Enum<?> enum_, Type type, JsonSerializationContext jsonSerializationContext) {
        if (enum_ == null) {
            return JsonNull.INSTANCE;
        }
        return new JsonPrimitive(enum_.name().toLowerCase());
    }
}

