/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson;

import java.util.Objects;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonElement;

class JsonArray$Entry {
    String comment;
    JsonElement value;

    public JsonArray$Entry() {
    }

    public JsonArray$Entry(JsonElement jsonElement) {
        this.value = jsonElement;
    }

    public boolean equals(Object object) {
        if (!(object instanceof JsonArray$Entry)) {
            return false;
        }
        JsonArray$Entry jsonArray$Entry = (JsonArray$Entry)object;
        return Objects.equals(this.comment, jsonArray$Entry.comment) && Objects.equals(this.value, jsonArray$Entry.value);
    }

    public int hashCode() {
        return Objects.hash(this.comment, this.value);
    }
}

