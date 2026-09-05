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
 *  dev.isxander.yacl3.gui.utils.ItemRegistryHelper
 *  minecraft.class04206
 *  minecraft.class06581
 */
package dev.isxander.yacl3.config;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import dev.isxander.yacl3.gui.utils.ItemRegistryHelper;
import java.lang.reflect.Type;
import minecraft.class04206;
import minecraft.class06581;

public class GsonConfigInstance$ItemTypeAdapter
implements JsonDeserializer<class06581>,
JsonSerializer<class06581> {
    public class06581 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return ItemRegistryHelper.getItemFromName((String)jsonElement.getAsString());
    }

    public JsonElement serialize(class06581 class065812, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(class04206.B.y((Object)class065812).toString());
    }
}

