/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 */
package com.terraformersmc.modmenu.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Optional;

public class JsonUtil {
    public static Optional<String> getString(JsonObject jsonObject, String string) {
        if (!jsonObject.has(string)) {
            return Optional.empty();
        }
        JsonElement jsonElement = jsonObject.get(string);
        if (!jsonElement.isJsonPrimitive() || !((JsonPrimitive)jsonElement).isString()) {
            return Optional.empty();
        }
        return Optional.of(jsonElement.getAsString());
    }

    private JsonUtil() {
    }

    public static Optional<Boolean> getBoolean(JsonObject jsonObject, String string) {
        if (!jsonObject.has(string)) {
            return Optional.empty();
        }
        JsonElement jsonElement = jsonObject.get(string);
        if (!jsonElement.isJsonPrimitive() || !((JsonPrimitive)jsonElement).isBoolean()) {
            return Optional.empty();
        }
        return Optional.of(jsonElement.getAsBoolean());
    }
}

