/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject
 */
package fun.crashsystem.jdrpc.util;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import java.util.Optional;

public final class JsonUtils {
    public static String getString(JsonObject json, String field, String defaultValue) {
        return JsonUtils.optString(json, field).orElse(defaultValue);
    }

    private JsonUtils() {
    }

    public static boolean getBoolean(JsonObject json, String field, boolean defaultValue) {
        if (json == null || !json.has(field) || json.get(field).isJsonNull()) {
            return defaultValue;
        }
        return json.get(field).getAsBoolean();
    }

    public static int getInt(JsonObject json, String field, int defaultValue) {
        if (json == null || !json.has(field) || json.get(field).isJsonNull()) {
            return defaultValue;
        }
        return json.get(field).getAsInt();
    }

    public static Optional<JsonObject> optObject(JsonObject json, String field) {
        if (json == null || !json.has(field) || !json.get(field).isJsonObject()) {
            return Optional.empty();
        }
        return Optional.of(json.getAsJsonObject(field));
    }

    public static Optional<String> optString(JsonObject json, String field) {
        if (json == null || !json.has(field) || json.get(field).isJsonNull()) {
            return Optional.empty();
        }
        return Optional.of(json.get(field).getAsString());
    }
}

