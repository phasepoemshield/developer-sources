/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonPrimitive
 */
package com.viaversion.viaversion.libs.mcstructs.converter.impl.v1_20_5;

import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonPrimitive;
import com.viaversion.viaversion.libs.mcstructs.converter.DataConverter;
import com.viaversion.viaversion.libs.mcstructs.converter.impl.v1_20_3.JsonConverter_v1_20_3;
import com.viaversion.viaversion.libs.mcstructs.converter.model.Result;

public class JsonConverter_v1_20_5
extends JsonConverter_v1_20_3 {
    public static final JsonConverter_v1_20_5 INSTANCE = new JsonConverter_v1_20_5();

    @Override
    public DataConverter<JsonElement> forkIfDefault() {
        return this == INSTANCE ? new JsonConverter_v1_20_3() : this;
    }

    @Override
    public Result<Boolean> asBoolean(JsonElement element) {
        JsonPrimitive primitive;
        if (element.isJsonPrimitive() && (primitive = element.getAsJsonPrimitive()).isBoolean()) {
            return Result.success(primitive.getAsBoolean());
        }
        return Result.unexpected((Object)element, "boolean");
    }

    @Override
    public Result<Number> asNumber(JsonElement element) {
        JsonPrimitive primitive;
        if (element.isJsonPrimitive() && (primitive = element.getAsJsonPrimitive()).isNumber()) {
            return Result.success(primitive.getAsNumber());
        }
        return Result.unexpected((Object)element, "number");
    }
}

