/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  minecraft.class01894
 *  minecraft.class08819
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import minecraft.class01894;
import minecraft.class08819;

public class class05416
implements class08819 {
    private final class01894 N;

    public class05416(class01894 class018942) {
        this.N = class018942;
    }

    public JsonElement get() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("parent", this.N.toString());
        return jsonObject;
    }
}

