/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.JsonDeserializationContext
 *  com.viaversion.viaversion.libs.gson.JsonDeserializer
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.gson.JsonParseException
 *  com.viaversion.viaversion.libs.gson.JsonPrimitive
 *  com.viaversion.viaversion.libs.mcstructs.snbt.SNbt
 *  com.viaversion.viaversion.libs.mcstructs.text.Style
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.TextFormatting
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.ClickEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.ClickEventAction
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEventAction
 */
package com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_8;

import com.viaversion.viaversion.libs.gson.JsonDeserializationContext;
import com.viaversion.viaversion.libs.gson.JsonDeserializer;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.gson.JsonParseException;
import com.viaversion.viaversion.libs.gson.JsonPrimitive;
import com.viaversion.viaversion.libs.mcstructs.snbt.SNbt;
import com.viaversion.viaversion.libs.mcstructs.text.Style;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.TextFormatting;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.ClickEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.ClickEventAction;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEventAction;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_8.EventSerializers_v1_8;
import java.lang.reflect.Type;

public class StyleDeserializer_v1_8
extends EventSerializers_v1_8
implements JsonDeserializer<Style> {
    public Style deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject rawHoverEvent;
        JsonPrimitive rawAction;
        JsonObject rawClickEvent;
        if (!json.isJsonObject()) {
            return null;
        }
        JsonObject rawStyle = json.getAsJsonObject();
        if (rawStyle == null) {
            return null;
        }
        Style style = new Style();
        if (rawStyle.has("bold")) {
            style.setBold(Boolean.valueOf(rawStyle.get("bold").getAsBoolean()));
        }
        if (rawStyle.has("italic")) {
            style.setItalic(Boolean.valueOf(rawStyle.get("italic").getAsBoolean()));
        }
        if (rawStyle.has("underlined")) {
            style.setUnderlined(Boolean.valueOf(rawStyle.get("underlined").getAsBoolean()));
        }
        if (rawStyle.has("strikethrough")) {
            style.setStrikethrough(Boolean.valueOf(rawStyle.get("strikethrough").getAsBoolean()));
        }
        if (rawStyle.has("obfuscated")) {
            style.setObfuscated(Boolean.valueOf(rawStyle.get("obfuscated").getAsBoolean()));
        }
        if (rawStyle.has("color")) {
            style.setFormatting(TextFormatting.getByName((String)rawStyle.get("color").getAsString()));
        }
        if (rawStyle.has("insertion")) {
            style.setInsertion(rawStyle.get("insertion").getAsString());
        }
        if (rawStyle.has("clickEvent") && (rawClickEvent = rawStyle.getAsJsonObject("clickEvent")) != null) {
            rawAction = rawClickEvent.getAsJsonPrimitive("action");
            JsonPrimitive rawValue = rawClickEvent.getAsJsonPrimitive("value");
            ClickEventAction action = null;
            String value = null;
            if (rawAction != null) {
                action = ClickEventAction.byName((String)rawAction.getAsString());
            }
            if (rawValue != null) {
                value = rawValue.getAsString();
            }
            if (action != null && value != null && action.isUserDefinable()) {
                style.setClickEvent((ClickEvent)this.clickEventSerializer.deserialize(action, value));
            }
        }
        if (rawStyle.has("hoverEvent") && (rawHoverEvent = rawStyle.getAsJsonObject("hoverEvent")) != null) {
            rawAction = rawHoverEvent.getAsJsonPrimitive("action");
            HoverEventAction action = null;
            TextComponent value = (TextComponent)context.deserialize(rawHoverEvent.get("value"), TextComponent.class);
            if (rawAction != null) {
                action = HoverEventAction.byName((String)rawAction.getAsString());
            }
            if (action != null && value != null && action.isUserDefinable()) {
                style.setHoverEvent((HoverEvent)this.hoverEventSerializer.deserialize(action, value));
            }
        }
        return style;
    }

    public StyleDeserializer_v1_8(SNbt<?> sNbt) {
        super(sNbt);
    }
}

