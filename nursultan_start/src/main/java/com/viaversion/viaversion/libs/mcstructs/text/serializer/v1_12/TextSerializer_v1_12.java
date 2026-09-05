/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.JsonArray
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.JsonParseException
 *  com.viaversion.viaversion.libs.gson.JsonPrimitive
 *  com.viaversion.viaversion.libs.gson.JsonSerializationContext
 *  com.viaversion.viaversion.libs.gson.JsonSerializer
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.KeybindComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.ScoreComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.SelectorComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent
 */
package com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_12;

import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonParseException;
import com.viaversion.viaversion.libs.gson.JsonPrimitive;
import com.viaversion.viaversion.libs.gson.JsonSerializationContext;
import com.viaversion.viaversion.libs.gson.JsonSerializer;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.KeybindComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.ScoreComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.SelectorComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent;
import java.lang.reflect.Type;
import java.util.Map;

public class TextSerializer_v1_12
implements JsonSerializer<TextComponent> {
    public JsonElement serialize(TextComponent src, Type typeOfSrc, JsonSerializationContext context) {
        JsonElement serializedStyle;
        JsonObject serializedComponent = new JsonObject();
        if (!src.getStyle().isEmpty() && (serializedStyle = context.serialize((Object)src.getStyle())).isJsonObject()) {
            JsonObject serializedStyleObject = serializedStyle.getAsJsonObject();
            for (Map.Entry entry : serializedStyleObject.entrySet()) {
                serializedComponent.add((String)entry.getKey(), (JsonElement)entry.getValue());
            }
        }
        if (!src.getSiblings().isEmpty()) {
            JsonArray siblings = new JsonArray();
            for (TextComponent sibling : src.getSiblings()) {
                siblings.add(this.serialize(sibling, (Type)sibling.getClass(), context));
            }
            serializedComponent.add("extra", (JsonElement)siblings);
        }
        if (src instanceof StringComponent) {
            serializedComponent.addProperty("text", ((StringComponent)src).getText());
        } else if (src instanceof TranslationComponent) {
            TranslationComponent translationComponent = (TranslationComponent)src;
            serializedComponent.addProperty("translate", translationComponent.getKey());
            if (translationComponent.getArgs().length > 0) {
                Object[] args;
                JsonArray with = new JsonArray();
                for (Object arg : args = translationComponent.getArgs()) {
                    if (arg instanceof TextComponent) {
                        with.add(this.serialize((TextComponent)arg, (Type)arg.getClass(), context));
                        continue;
                    }
                    with.add((JsonElement)new JsonPrimitive(String.valueOf(arg)));
                }
                serializedComponent.add("with", (JsonElement)with);
            }
        } else if (src instanceof ScoreComponent) {
            ScoreComponent scoreComponent = (ScoreComponent)src;
            JsonObject serializedScore = new JsonObject();
            serializedScore.addProperty("name", scoreComponent.getName());
            serializedScore.addProperty("objective", scoreComponent.getObjective());
            serializedScore.addProperty("value", scoreComponent.getValue());
            serializedComponent.add("score", (JsonElement)serializedScore);
        } else if (src instanceof SelectorComponent) {
            serializedComponent.addProperty("selector", ((SelectorComponent)src).getSelector());
        } else if (src instanceof KeybindComponent) {
            serializedComponent.addProperty("keybind", ((KeybindComponent)src).getKeybind());
        } else {
            throw new JsonParseException("Don't know how to serialize " + src + " as a Component");
        }
        return serializedComponent;
    }
}

