/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.JsonSerializationContext
 *  com.viaversion.viaversion.libs.gson.JsonSerializer
 *  com.viaversion.viaversion.libs.mcstructs.snbt.SNbt
 *  com.viaversion.viaversion.libs.mcstructs.text.Style
 */
package com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_8;

import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonSerializationContext;
import com.viaversion.viaversion.libs.gson.JsonSerializer;
import com.viaversion.viaversion.libs.mcstructs.snbt.SNbt;
import com.viaversion.viaversion.libs.mcstructs.text.Style;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_8.EventSerializers_v1_8;
import java.lang.reflect.Type;

public class StyleSerializer_v1_8
extends EventSerializers_v1_8
implements JsonSerializer<Style> {
    public StyleSerializer_v1_8(SNbt<?> sNbt) {
        super(sNbt);
    }

    public JsonElement serialize(Style src, Type typeOfSrc, JsonSerializationContext context) {
        if (src.isEmpty()) {
            return null;
        }
        JsonObject serializedStyle = new JsonObject();
        if (src.getBold() != null) {
            serializedStyle.addProperty("bold", Boolean.valueOf(src.isBold()));
        }
        if (src.getItalic() != null) {
            serializedStyle.addProperty("italic", Boolean.valueOf(src.isItalic()));
        }
        if (src.getUnderlined() != null) {
            serializedStyle.addProperty("underlined", Boolean.valueOf(src.isUnderlined()));
        }
        if (src.getStrikethrough() != null) {
            serializedStyle.addProperty("strikethrough", Boolean.valueOf(src.isStrikethrough()));
        }
        if (src.getObfuscated() != null) {
            serializedStyle.addProperty("obfuscated", Boolean.valueOf(src.isObfuscated()));
        }
        if (src.getColor() != null && !src.getColor().isRGBColor()) {
            serializedStyle.addProperty("color", src.getColor().serialize());
        }
        if (src.getInsertion() != null) {
            serializedStyle.add("insertion", context.serialize((Object)src.getInsertion()));
        }
        if (src.getClickEvent() != null) {
            JsonObject clickEvent = new JsonObject();
            clickEvent.addProperty("action", src.getClickEvent().getAction().getName());
            clickEvent.addProperty("value", (String)this.clickEventSerializer.serialize(src.getClickEvent()));
            serializedStyle.add("clickEvent", (JsonElement)clickEvent);
        }
        if (src.getHoverEvent() != null) {
            JsonObject hoverEvent = new JsonObject();
            hoverEvent.addProperty("action", src.getHoverEvent().getAction().getName());
            hoverEvent.add("value", context.serialize(this.hoverEventSerializer.serialize(src.getHoverEvent())));
            serializedStyle.add("hoverEvent", (JsonElement)hoverEvent);
        }
        return serializedStyle;
    }
}

