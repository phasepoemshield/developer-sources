/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.libs.com.google.gson;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement;

public final class JsonNull
extends JsonElement {
    public static final JsonNull INSTANCE = new JsonNull();

    @Deprecated
    public JsonNull() {
    }

    public boolean equals(Object other) {
        return other instanceof JsonNull;
    }

    public int hashCode() {
        return JsonNull.class.hashCode();
    }

    @Override
    public JsonNull deepCopy() {
        return INSTANCE;
    }
}

