/*
 * Decompiled with CFR 0.152.
 */
package squeek.appleskin.shadowed.blue.endless.jankson;

import java.util.Map;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonElement;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonObject;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonObject$Entry;

class JsonObject$1
implements Map.Entry<String, JsonElement> {
    final /* synthetic */ JsonObject$Entry val$entry;
    final /* synthetic */ JsonObject this$0;

    JsonObject$1() {
        this.this$0 = var1_1;
        this.val$entry = var2_2;
    }

    @Override
    public JsonElement getValue() {
        return this.val$entry.value;
    }

    @Override
    public String getKey() {
        return this.val$entry.key;
    }

    @Override
    public JsonElement setValue(JsonElement jsonElement) {
        JsonElement jsonElement2 = this.val$entry.value;
        this.val$entry.value = jsonElement;
        return jsonElement2;
    }
}

