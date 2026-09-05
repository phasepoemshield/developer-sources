/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonGrammar;

public abstract class JsonElement
implements Cloneable {
    public abstract JsonElement clone();

    public abstract String toJson(JsonGrammar var1, int var2);

    public abstract String toJson(boolean var1, boolean var2, int var3);

    public String toJson(JsonGrammar jsonGrammar) {
        return this.toJson(jsonGrammar, 0);
    }

    public String toJson(boolean bl, boolean bl2) {
        return this.toJson(bl, bl2, 0);
    }

    public String toJson() {
        return this.toJson(false, false, 0);
    }
}

