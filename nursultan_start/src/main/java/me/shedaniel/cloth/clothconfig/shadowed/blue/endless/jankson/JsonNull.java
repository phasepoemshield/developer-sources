/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonElement;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonGrammar;

public class JsonNull
extends JsonElement {
    public static final JsonNull INSTANCE = new JsonNull();

    private JsonNull() {
    }

    public boolean equals(Object object) {
        return object == INSTANCE;
    }

    public String toString() {
        return "null";
    }

    public int hashCode() {
        return 0;
    }

    @Override
    public JsonNull clone() {
        return this;
    }

    @Override
    public String toJson(boolean bl, boolean bl2, int n) {
        return "null";
    }

    @Override
    public String toJson(JsonGrammar jsonGrammar, int n) {
        return "null";
    }
}

