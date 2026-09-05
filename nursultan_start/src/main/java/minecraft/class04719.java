/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.util.UndashedUuid
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.util.UndashedUuid;
import java.time.Instant;
import java.util.UUID;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class04719 {
    public static Instant y(String string, JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get(string);
        if (jsonElement != null) {
            return Instant.ofEpochMilli(Long.parseLong(jsonElement.getAsString()));
        }
        return Instant.EPOCH;
    }

    public static <T> @Nullable T y(String string, JsonObject jsonObject, Function<JsonObject, T> function) {
        JsonElement jsonElement = jsonObject.get(string);
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return null;
        }
        if (!jsonElement.isJsonObject()) {
            throw new IllegalStateException("Required property " + string + " was not a JsonObject as espected");
        }
        return function.apply(jsonElement.getAsJsonObject());
    }

    public static int N(String string, JsonObject jsonObject, int n) {
        JsonElement jsonElement = jsonObject.get(string);
        if (jsonElement != null) {
            return jsonElement.isJsonNull() ? n : jsonElement.getAsInt();
        }
        return n;
    }

    public static long N(String string, JsonObject jsonObject, long l) {
        JsonElement jsonElement = jsonObject.get(string);
        if (jsonElement != null) {
            return jsonElement.isJsonNull() ? l : jsonElement.getAsLong();
        }
        return l;
    }

    public static boolean N(String string, JsonObject jsonObject, boolean bl) {
        JsonElement jsonElement = jsonObject.get(string);
        if (jsonElement != null) {
            return jsonElement.isJsonNull() ? bl : jsonElement.getAsBoolean();
        }
        return bl;
    }

    public static @Nullable UUID N(String string, JsonObject jsonObject, @Nullable UUID uUID) {
        String string2 = class04719.N(string, jsonObject, null);
        if (string2 == null) {
            return uUID;
        }
        return UndashedUuid.fromStringLenient((String)string2);
    }

    public static <T> T N(String string, JsonObject jsonObject, Function<JsonObject, T> function) {
        JsonElement jsonElement = jsonObject.get(string);
        if (jsonElement == null || jsonElement.isJsonNull()) {
            throw new IllegalStateException("Missing required property: " + string);
        }
        if (!jsonElement.isJsonObject()) {
            throw new IllegalStateException("Required property " + string + " was not a JsonObject as espected");
        }
        return function.apply(jsonElement.getAsJsonObject());
    }

    public static @Nullable String N(String string, JsonObject jsonObject, @Nullable String string2) {
        JsonElement jsonElement = jsonObject.get(string);
        if (jsonElement != null) {
            return jsonElement.isJsonNull() ? string2 : jsonElement.getAsString();
        }
        return string2;
    }

    public static String N(String string, JsonObject jsonObject) {
        String string2 = class04719.N(string, jsonObject, null);
        if (string2 == null) {
            throw new IllegalStateException("Missing required property: " + string);
        }
        return string2;
    }
}

