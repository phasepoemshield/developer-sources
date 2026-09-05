/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson;

import java.util.Objects;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonElement;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonObject$1;

final class JsonObject$Entry {
    protected String comment;
    protected String key;
    protected JsonElement value;

    /* synthetic */ JsonObject$Entry(JsonObject$1 jsonObject$1) {
        this();
    }

    private JsonObject$Entry() {
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof JsonObject$Entry)) {
            return false;
        }
        JsonObject$Entry jsonObject$Entry = (JsonObject$Entry)object;
        if (!Objects.equals(this.comment, jsonObject$Entry.comment)) {
            return false;
        }
        if (!this.key.equals(jsonObject$Entry.key)) {
            return false;
        }
        return this.value.equals(jsonObject$Entry.value);
    }

    public int hashCode() {
        return Objects.hash(this.comment, this.key, this.value);
    }
}

