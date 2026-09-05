/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.mcstructs.text.Style
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.EntityHoverEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.ItemHoverEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentSerializer
 *  com.viaversion.viaversion.libs.mcstructs.text.stringformat.StringFormat
 *  com.viaversion.viaversion.libs.mcstructs.text.stringformat.handling.ColorHandling
 *  com.viaversion.viaversion.libs.mcstructs.text.stringformat.handling.DeserializerUnknownHandling
 *  com.viaversion.viaversion.libs.mcstructs.text.utils.TextUtils
 *  com.viaversion.viaversion.util.StringUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.util;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.mcstructs.text.Style;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.EntityHoverEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.ItemHoverEvent;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentSerializer;
import com.viaversion.viaversion.libs.mcstructs.text.stringformat.StringFormat;
import com.viaversion.viaversion.libs.mcstructs.text.stringformat.handling.ColorHandling;
import com.viaversion.viaversion.libs.mcstructs.text.stringformat.handling.DeserializerUnknownHandling;
import com.viaversion.viaversion.libs.mcstructs.text.utils.TextUtils;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.StringUtil;
import com.viaversion.viaversion.util.TagUtil;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class ComponentUtil {
    private static final int MAX_UNSIGNED_SHORT = 65535;

    private static JsonElement convert(SerializerVersion serializerVersion, SerializerVersion serializerVersion2, TextComponent textComponent2) {
        if (serializerVersion.ordinal() >= SerializerVersion.V1_16.ordinal() && serializerVersion2.ordinal() < SerializerVersion.V1_16.ordinal()) {
            textComponent2.forEach(textComponent -> ComponentUtil.convertHoverToLegacy(serializerVersion2, textComponent));
        }
        return serializerVersion2.toJson(textComponent2);
    }

    public static JsonElement legacyToJson(String string) {
        DeserializerUnknownHandling deserializerUnknownHandling = DeserializerUnknownHandling.WHITE;
        ColorHandling colorHandling = ColorHandling.RESET;
        String string2 = string;
        StringFormat stringFormat = StringFormat.vanilla();
        return SerializerVersion.V1_12.toJson(ComponentUtil.redirect$ebe000$viafabricplus$dontSkipEmptySections(stringFormat, string2, colorHandling, deserializerUnknownHandling));
    }

    public static CompoundTag deserializeLegacyShowItem(JsonElement jsonElement, SerializerVersion serializerVersion) {
        return (CompoundTag)serializerVersion.toTag(serializerVersion.toComponent(jsonElement).asUnformattedString());
    }

    public static CompoundTag deserializeShowItem(Tag tag, SerializerVersion serializerVersion) {
        return (CompoundTag)serializerVersion.toTag(serializerVersion.toComponent(tag).asUnformattedString());
    }

    public static Tag trimStrings(Tag tag2) {
        if (tag2 == null) {
            return null;
        }
        return TagUtil.handleDeep(tag2, (string, tag) -> {
            StringTag stringTag;
            byte[] byArray;
            if (tag instanceof StringTag && (byArray = (stringTag = (StringTag)tag).getValue().getBytes(StandardCharsets.UTF_8)).length > 65535) {
                stringTag.setValue("{}");
            }
            return tag;
        });
    }

    public static @Nullable Tag jsonToTag(@Nullable JsonElement jsonElement) {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return null;
        }
        try {
            TextComponent textComponent = SerializerVersion.V1_19_4.toComponent(jsonElement);
            return ComponentUtil.trimStrings(SerializerVersion.V1_20_3.toTag(textComponent));
        }
        catch (Exception exception) {
            if (Via.getConfig().logTextComponentConversionErrors()) {
                Via.getPlatform().getLogger().log(Level.SEVERE, "Error converting component: " + StringUtil.forLogging((Object)jsonElement), exception);
            }
            return new StringTag("<error>");
        }
    }

    public static @Nullable JsonElement tagToJson(@Nullable Tag tag) {
        try {
            TextComponent textComponent = SerializerVersion.V1_20_3.toComponent(tag);
            return textComponent != null ? SerializerVersion.V1_19_4.toJson(textComponent) : null;
        }
        catch (Exception exception) {
            if (Via.getConfig().logTextComponentConversionErrors()) {
                Via.getPlatform().getLogger().log(Level.SEVERE, "Error converting tag: " + StringUtil.forLogging((Object)tag), exception);
            }
            return ComponentUtil.plainToJson("<error>");
        }
    }

    public static String emptyJsonComponentString() {
        return "{\"text\":\"\"}";
    }

    private static TextComponent redirect$ebe000$viafabricplus$dontSkipEmptySections(StringFormat stringFormat, String string, ColorHandling colorHandling, DeserializerUnknownHandling deserializerUnknownHandling) {
        return stringFormat.fromString(string, colorHandling, deserializerUnknownHandling, false);
    }

    public static JsonObject plainToJson(String string) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("text", string);
        return jsonObject;
    }

    public static @Nullable JsonElement convertJsonOrEmpty(@Nullable String string, SerializerVersion serializerVersion, SerializerVersion serializerVersion2) {
        TextComponent textComponent = serializerVersion.toComponent(string);
        if (textComponent == null) {
            return ComponentUtil.emptyJsonComponent();
        }
        return serializerVersion2.toJson(textComponent);
    }

    public static JsonObject emptyJsonComponent() {
        return ComponentUtil.plainToJson("");
    }

    public static String legacyToJsonString(String string) {
        return ComponentUtil.legacyToJsonString(string, false);
    }

    public static String legacyToJsonString(String string, boolean bl) {
        DeserializerUnknownHandling deserializerUnknownHandling = DeserializerUnknownHandling.WHITE;
        ColorHandling colorHandling = ColorHandling.RESET;
        String string2 = string;
        StringFormat stringFormat = StringFormat.vanilla();
        TextComponent textComponent2 = ComponentUtil.redirect$ebe000$viafabricplus$dontSkipEmptySections(stringFormat, string2, colorHandling, deserializerUnknownHandling);
        if (bl) {
            TextUtils.iterateAll((TextComponent)textComponent2, textComponent -> {
                if (!textComponent.getStyle().isEmpty()) {
                    textComponent.setParentStyle(new Style().setItalic(Boolean.valueOf(false)));
                }
            });
        }
        return SerializerVersion.V1_12.toString(textComponent2);
    }

    public static String jsonToLegacy(String string) {
        return TextComponentSerializer.V1_12.deserializeReader(string).asLegacyFormatString();
    }

    public static String jsonToLegacy(JsonElement jsonElement) {
        return SerializerVersion.V1_12.toComponent(jsonElement).asLegacyFormatString();
    }

    public static @Nullable JsonElement convertJson(@Nullable String string, SerializerVersion serializerVersion, SerializerVersion serializerVersion2) {
        return string != null ? ComponentUtil.convert(serializerVersion, serializerVersion2, serializerVersion.toComponent(string)) : null;
    }

    public static @Nullable JsonElement convertJson(@Nullable JsonElement jsonElement, SerializerVersion serializerVersion, SerializerVersion serializerVersion2) {
        return jsonElement != null ? ComponentUtil.convert(serializerVersion, serializerVersion2, serializerVersion.toComponent(jsonElement)) : null;
    }

    public static @Nullable Tag jsonStringToTag(@Nullable String string, SerializerVersion serializerVersion, SerializerVersion serializerVersion2) {
        if (string == null) {
            return null;
        }
        return serializerVersion2.toTag(serializerVersion.jsonSerializer.deserialize(string));
    }

    public static @Nullable Tag jsonStringToTag(@Nullable String string) {
        return ComponentUtil.jsonStringToTag(string, SerializerVersion.V1_20_3, SerializerVersion.V1_20_5);
    }

    public static @Nullable String tagToJsonString(@Nullable Tag tag) {
        try {
            TextComponent textComponent = SerializerVersion.V1_20_5.toComponent(tag);
            return textComponent != null ? SerializerVersion.V1_20_3.toString(textComponent) : null;
        }
        catch (Exception exception) {
            if (Via.getConfig().logTextComponentConversionErrors()) {
                Via.getPlatform().getLogger().log(Level.SEVERE, "Error converting tag: " + StringUtil.forLogging((Object)tag), exception);
            }
            return ComponentUtil.plainToJson("<error>").toString();
        }
    }

    private static void convertHoverToLegacy(SerializerVersion serializerVersion, TextComponent textComponent) {
        ItemHoverEvent itemHoverEvent;
        EntityHoverEvent entityHoverEvent;
        CompoundTag compoundTag;
        HoverEvent hoverEvent;
        HoverEvent hoverEvent2;
        TranslationComponent translationComponent;
        if (textComponent instanceof TranslationComponent) {
            translationComponent = (TranslationComponent)textComponent;
            hoverEvent2 = translationComponent.getArgs();
            int n = ((HoverEvent)hoverEvent2).length;
            for (int i = 0; i < n; ++i) {
                hoverEvent = hoverEvent2[i];
                if (!(hoverEvent instanceof TextComponent)) continue;
                compoundTag = (TextComponent)hoverEvent;
                ComponentUtil.convertHoverToLegacy(serializerVersion, (TextComponent)compoundTag);
            }
        }
        if ((hoverEvent2 = (translationComponent = textComponent.getStyle()).getHoverEvent()) instanceof EntityHoverEvent && (entityHoverEvent = (EntityHoverEvent)hoverEvent2).isModern()) {
            hoverEvent = entityHoverEvent.asModern();
            compoundTag = new CompoundTag();
            compoundTag.putString("type", hoverEvent.getType().get());
            compoundTag.putString("id", hoverEvent.getUuid().toString());
            compoundTag.putString("name", serializerVersion.toString((TextComponent)(hoverEvent.getName() != null ? hoverEvent.getName() : new StringComponent(""))));
            entityHoverEvent.setLegacyData((TextComponent)new StringComponent(serializerVersion.toSNBT((Tag)compoundTag)));
        } else if (hoverEvent2 instanceof ItemHoverEvent && (itemHoverEvent = (ItemHoverEvent)hoverEvent2).isModern()) {
            hoverEvent = itemHoverEvent.asModern();
            compoundTag = new CompoundTag();
            compoundTag.putString("id", hoverEvent.getId().get());
            compoundTag.putByte("Count", (byte)hoverEvent.getCount());
            if (hoverEvent.getTag() != null) {
                compoundTag.put("tag", (Tag)hoverEvent.getTag());
            }
            itemHoverEvent.setLegacyData(serializerVersion.toSNBT((Tag)compoundTag));
        }
    }
}

