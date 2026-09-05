/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00405
 *  minecraft.class00411
 */
package dev.isxander.yacl3.config.v2.impl.serializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.lang.reflect.Type;
import minecraft.class00405;
import minecraft.class00411;

public class GsonConfigSerializer$StyleTypeAdapter
implements JsonDeserializer<class00405>,
JsonSerializer<class00405> {
    public class00405 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return class00411.y.parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement).result().orElse(class00405.N);
    }

    public JsonElement serialize(class00405 class004052, Type type, JsonSerializationContext jsonSerializationContext) {
        return (JsonElement)class00411.y.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)class004052).result().orElse(JsonNull.INSTANCE);
    }
}

