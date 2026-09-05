/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 */
package dev.isxander.yacl3.config.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.lang.reflect.Type;

public class CodecSerializerAdapter<T>
implements JsonDeserializer<T>,
JsonSerializer<T> {
    private final Codec<T> codec;

    public T deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return (T)this.codec.parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement).getOrThrow();
    }

    public CodecSerializerAdapter(Codec<T> codec) {
        this.codec = codec;
    }

    public JsonElement serialize(T t, Type type, JsonSerializationContext jsonSerializationContext) {
        return (JsonElement)this.codec.encodeStart((DynamicOps)JsonOps.INSTANCE, t).getOrThrow();
    }
}

