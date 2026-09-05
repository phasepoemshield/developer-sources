/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class class07404
extends RuntimeException {
    private final JsonElement N;
    private final JsonObject y;

    public class07404(JsonElement jsonElement, JsonObject jsonObject) {
        this.N = jsonElement;
        this.y = jsonObject;
    }

    private JsonElement y() {
        return this.N;
    }

    private JsonObject N() {
        return this.y;
    }
}

