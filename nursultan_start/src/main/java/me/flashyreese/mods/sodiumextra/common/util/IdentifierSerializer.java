/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  minecraft.class01894
 *  minecraft.class05001
 */
package me.flashyreese.mods.sodiumextra.common.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import minecraft.class01894;
import minecraft.class05001;

public class IdentifierSerializer
implements JsonDeserializer<class01894>,
JsonSerializer<class01894> {
    public class01894 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return class01894.N((String)class05001.N((JsonElement)jsonElement, (String)"location"));
    }

    public JsonElement serialize(class01894 class018942, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(class018942.toString());
    }
}

