/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonArray
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonPrimitive
 */
package fun.crashsystem.jdrpc.activity;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonArray;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonPrimitive;
import java.util.Optional;

public record ActivityParty(String id, int currentSize, int maxSize, Integer privacy) {
    public static final int PRIVACY_PRIVATE = 0;
    public static final int PRIVACY_PUBLIC = 1;

    public static ActivityParty of(String id, int currentSize, int maxSize) {
        return ActivityParty.of(id, currentSize, maxSize, null);
    }

    public static ActivityParty of(String id, int currentSize, int maxSize, Integer privacy) {
        if (currentSize < 0) {
            throw new IllegalArgumentException("currentSize must be non-negative, got " + currentSize);
        }
        if (maxSize < 0) {
            throw new IllegalArgumentException("maxSize must be non-negative, got " + maxSize);
        }
        if (currentSize > maxSize) {
            throw new IllegalArgumentException("currentSize (" + currentSize + ") must be <= maxSize (" + maxSize + ")");
        }
        return new ActivityParty(id, currentSize, maxSize, privacy);
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        Optional.ofNullable(this.id).ifPresent(arg_0 -> ActivityParty.lambda$toJson$0(json, arg_0));
        if (this.maxSize > 0) {
            JsonArray sizeArr = new JsonArray();
            sizeArr.add((JsonElement)new JsonPrimitive((Number)this.currentSize));
            sizeArr.add((JsonElement)new JsonPrimitive((Number)this.maxSize));
            json.add("size", (JsonElement)sizeArr);
        }
        Optional.ofNullable(this.privacy).ifPresent(arg_0 -> ActivityParty.lambda$toJson$1(json, arg_0));
        return json;
    }

    private static void lambda$toJson$0(JsonObject json, String v) {
        json.addProperty("id", v);
    }

    private static void lambda$toJson$1(JsonObject json, Integer p) {
        json.addProperty("privacy", (Number)p);
    }
}

