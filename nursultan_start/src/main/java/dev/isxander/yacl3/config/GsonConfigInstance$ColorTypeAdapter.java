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
 */
package dev.isxander.yacl3.config;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.awt.Color;
import java.lang.reflect.Type;

public class GsonConfigInstance$ColorTypeAdapter
implements JsonDeserializer<Color>,
JsonSerializer<Color> {
    public Color deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return new Color(jsonElement.getAsInt(), true);
    }

    public JsonElement serialize(Color color, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive((Number)color.getRGB());
    }
}

