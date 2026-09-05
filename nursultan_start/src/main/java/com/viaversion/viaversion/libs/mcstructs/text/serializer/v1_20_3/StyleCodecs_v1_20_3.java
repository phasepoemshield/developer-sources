/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonParseException
 *  com.viaversion.viaversion.libs.gson.JsonParser
 *  com.viaversion.viaversion.libs.mcstructs.converter.ConsumerTracking
 *  com.viaversion.viaversion.libs.mcstructs.converter.DataConverter
 *  com.viaversion.viaversion.libs.mcstructs.converter.codec.Codec
 *  com.viaversion.viaversion.libs.mcstructs.converter.codec.map.MapCodecMerger
 *  com.viaversion.viaversion.libs.mcstructs.converter.codec.map.MapCodecMerger$I1
 *  com.viaversion.viaversion.libs.mcstructs.converter.impl.v1_20_3.JsonConverter_v1_20_3
 *  com.viaversion.viaversion.libs.mcstructs.converter.mapcodec.MapCodec
 *  com.viaversion.viaversion.libs.mcstructs.converter.model.Result
 *  com.viaversion.viaversion.libs.mcstructs.converter.types.NamedType
 *  com.viaversion.viaversion.libs.mcstructs.core.Identifier
 *  com.viaversion.viaversion.libs.mcstructs.snbt.SNbt
 *  com.viaversion.viaversion.libs.mcstructs.text.Style
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.TextFormatting
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.ClickEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.ClickEventAction
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.types.ChangePageClickEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.types.CopyToClipboardClickEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.types.OpenFileClickEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.types.OpenUrlClickEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.types.RunCommandClickEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.click.types.SuggestCommandClickEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEventAction
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.EntityHoverEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.font.ResourceFont
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_20_3.StyleCodecs_v1_20_3$1
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_20_3.StyleCodecs_v1_20_3$HoverEventCodec$Entity
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_20_3.StyleCodecs_v1_20_3$HoverEventCodec$Item
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_20_3.StyleCodecs_v1_20_3$HoverEventCodec$Text
 */
package com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_20_3;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonParseException;
import com.viaversion.viaversion.libs.gson.JsonParser;
import com.viaversion.viaversion.libs.mcstructs.converter.ConsumerTracking;
import com.viaversion.viaversion.libs.mcstructs.converter.DataConverter;
import com.viaversion.viaversion.libs.mcstructs.converter.codec.Codec;
import com.viaversion.viaversion.libs.mcstructs.converter.codec.map.MapCodecMerger;
import com.viaversion.viaversion.libs.mcstructs.converter.impl.v1_20_3.JsonConverter_v1_20_3;
import com.viaversion.viaversion.libs.mcstructs.converter.mapcodec.MapCodec;
import com.viaversion.viaversion.libs.mcstructs.converter.model.Result;
import com.viaversion.viaversion.libs.mcstructs.converter.types.NamedType;
import com.viaversion.viaversion.libs.mcstructs.core.Identifier;
import com.viaversion.viaversion.libs.mcstructs.snbt.SNbt;
import com.viaversion.viaversion.libs.mcstructs.text.Style;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.TextFormatting;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.ClickEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.ClickEventAction;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.types.ChangePageClickEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.types.CopyToClipboardClickEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.types.OpenFileClickEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.types.OpenUrlClickEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.types.RunCommandClickEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.click.types.SuggestCommandClickEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEventAction;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl.EntityHoverEvent;
import com.viaversion.viaversion.libs.mcstructs.text.font.ResourceFont;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_20_3.StyleCodecs_v1_20_3;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_20_3.TextCodecs_v1_20_3;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;

public class StyleCodecs_v1_20_3 {
    public static final MapCodec<Style> MAP_CODEC = MapCodecMerger.mapCodec((MapCodec)TextFormattingCodec.CODEC.mapCodec("color").optional().defaulted(null), Style::getColor, (MapCodec)Codec.BOOLEAN.mapCodec("obfuscated").optional().defaulted(null), Style::getObfuscated, (MapCodec)Codec.BOOLEAN.mapCodec("bold").optional().defaulted(null), Style::getBold, (MapCodec)Codec.BOOLEAN.mapCodec("strikethrough").optional().defaulted(null), Style::getStrikethrough, (MapCodec)Codec.BOOLEAN.mapCodec("underlined").optional().defaulted(null), Style::getUnderlined, (MapCodec)Codec.BOOLEAN.mapCodec("italic").optional().defaulted(null), Style::getItalic, (MapCodec)ClickEventCodec.CODEC.mapCodec("clickEvent").optional().defaulted(null), Style::getClickEvent, (MapCodec)HoverEventCodec.CODEC.mapCodec("hoverEvent").optional().defaulted(null), Style::getHoverEvent, (MapCodec)Codec.STRING.mapCodec("insertion").optional().defaulted(null), Style::getInsertion, (MapCodec)Codec.STRING_IDENTIFIER.mapCodec("font").optional().defaulted(null).mapThrowing(fontDescription -> {
        if (fontDescription == null) {
            return null;
        }
        return ((ResourceFont)fontDescription).getId();
    }, id -> {
        if (id == null) {
            return null;
        }
        return new ResourceFont(id);
    }), Style::getFont, Style::new);
    public static final Codec<Style> CODEC = MAP_CODEC.asCodec();

    public static Result<EntityHoverEvent> getEntityHoverEventResult(DataConverter<?> converter, TextComponent component, Codec<TextComponent> textCodec, JsonConverter_v1_20_3 jsonConverter) {
        try {
            converter = converter.forkIfDefault();
            CompoundTag tag = (CompoundTag)SNbt.V1_14.deserialize(component.asUnformattedString((ConsumerTracking)converter));
            JsonElement rawName = JsonParser.parseString((String)(tag.get("name") instanceof StringTag ? ((StringTag)tag.get("name")).getValue() : ""));
            TextComponent name = rawName == null ? null : (TextComponent)textCodec.deserialize(converter.fork((DataConverter)jsonConverter), (Object)rawName).getOrThrow(JsonParseException::new);
            Identifier type = Identifier.of((String)(tag.get("type") instanceof StringTag ? ((StringTag)tag.get("type")).getValue() : ""));
            UUID uuid = UUID.fromString(tag.get("id") instanceof StringTag ? ((StringTag)tag.get("id")).getValue() : "");
            return Result.success((Object)new EntityHoverEvent(type, uuid, name));
        }
        catch (Throwable t) {
            return Result.error((Throwable)t);
        }
    }

    public static class HoverEventCodec {
        private static final String CONTENTS = "contents";
        public static final Codec<HoverEvent> MODERN_CODEC = Codec.named((NamedType[])new HoverEventAction[]{HoverEventAction.SHOW_TEXT, HoverEventAction.SHOW_ITEM, HoverEventAction.SHOW_ENTITY}).verified(action -> {
            if (action.isUserDefinable()) {
                return null;
            }
            return Result.error((String)("The action " + action.getName() + " is not user definable"));
        }).typed("action", HoverEvent::getAction, action -> {
            switch (1.$SwitchMap$com$viaversion$viaversion$libs$mcstructs$text$events$hover$HoverEventAction[action.ordinal()]) {
                case 1: {
                    return Text.MAP_CODEC;
                }
                case 2: {
                    return Item.MAP_CODEC;
                }
                case 3: {
                    return Entity.MAP_CODEC;
                }
            }
            return MapCodec.failing((String)("Unknown hover event action: " + action));
        });
        public static final Codec<HoverEvent> LEGACY_CODEC = Codec.named((NamedType[])new HoverEventAction[]{HoverEventAction.SHOW_TEXT, HoverEventAction.SHOW_ITEM, HoverEventAction.SHOW_ENTITY}).verified(action -> {
            if (action.isUserDefinable()) {
                return null;
            }
            return Result.error((String)("The action " + action.getName() + " is not user definable"));
        }).typed("action", HoverEvent::getAction, action -> {
            switch (1.$SwitchMap$com$viaversion$viaversion$libs$mcstructs$text$events$hover$HoverEventAction[action.ordinal()]) {
                case 1: {
                    return Text.LEGACY_MAP_CODEC;
                }
                case 2: {
                    return Item.LEGACY_MAP_CODEC;
                }
                case 3: {
                    return Entity.LEGACY_MAP_CODEC;
                }
            }
            return MapCodec.failing((String)("Unknown hover event action: " + action));
        });
        public static final Codec<HoverEvent> CODEC = Codec.oneOf((Codec[])new Codec[]{MODERN_CODEC, LEGACY_CODEC});

        private static <T extends HoverEvent> MapCodec<T> createLegacy(BiFunction<DataConverter<?>, TextComponent, Result<T>> constructor) {
            return TextCodecs_v1_20_3.TEXT.converterFlatMap((dataConverter, t) -> Result.error((String)"Legacy hover events can't be serialized"), constructor).mapCodec("value").required();
        }

        static /* synthetic */ MapCodec access$000(BiFunction x0) {
            return HoverEventCodec.createLegacy(x0);
        }
    }

    public static class ClickEventCodec {
        public static final MapCodec<OpenUrlClickEvent> OPEN_URL = ClickEventCodec.create(OpenUrlClickEvent::asString, OpenUrlClickEvent::new);
        public static final MapCodec<OpenFileClickEvent> OPEN_FILE = ClickEventCodec.create(OpenFileClickEvent::getPath, OpenFileClickEvent::new);
        public static final MapCodec<RunCommandClickEvent> RUN_COMMAND = ClickEventCodec.create(RunCommandClickEvent::getCommand, RunCommandClickEvent::new);
        public static final MapCodec<SuggestCommandClickEvent> SUGGEST_COMMAND = ClickEventCodec.create(SuggestCommandClickEvent::getCommand, SuggestCommandClickEvent::new);
        public static final MapCodec<ChangePageClickEvent> CHANGE_PAGE = ClickEventCodec.create(ChangePageClickEvent::asString, ChangePageClickEvent::new);
        public static final MapCodec<CopyToClipboardClickEvent> COPY_TO_CLIPBOARD = ClickEventCodec.create(CopyToClipboardClickEvent::getValue, CopyToClipboardClickEvent::new);
        public static final Codec<ClickEvent> CODEC = Codec.named((NamedType[])new ClickEventAction[]{ClickEventAction.OPEN_URL, ClickEventAction.OPEN_FILE, ClickEventAction.RUN_COMMAND, ClickEventAction.SUGGEST_COMMAND, ClickEventAction.CHANGE_PAGE, ClickEventAction.COPY_TO_CLIPBOARD}).verified(action -> {
            if (action.isUserDefinable()) {
                return null;
            }
            return Result.error((String)("The action " + action.getName() + " is not user definable"));
        }).typed("action", ClickEvent::getAction, action -> {
            switch (1.$SwitchMap$com$viaversion$viaversion$libs$mcstructs$text$events$click$ClickEventAction[action.ordinal()]) {
                case 1: {
                    return OPEN_URL;
                }
                case 2: {
                    return OPEN_FILE;
                }
                case 3: {
                    return RUN_COMMAND;
                }
                case 4: {
                    return SUGGEST_COMMAND;
                }
                case 5: {
                    return CHANGE_PAGE;
                }
                case 6: {
                    return COPY_TO_CLIPBOARD;
                }
            }
            return MapCodec.failing((String)("Unknown click event action: " + action));
        });

        private static <T extends ClickEvent> MapCodec<T> create(Function<T, String> getter, MapCodecMerger.I1<String, T> constructor) {
            return MapCodecMerger.mapCodec((MapCodec)Codec.STRING.mapCodec("value").required(), getter, constructor);
        }
    }

    public static class TextFormattingCodec {
        public static final Codec<TextFormatting> CODEC = Codec.STRING.flatMap(formatting -> Result.success((Object)formatting.serialize()), s -> {
            TextFormatting formatting = TextFormatting.parse((String)s);
            if (formatting == null) {
                return Result.error((String)("Unknown formatting: " + s));
            }
            if (formatting.isRGBColor() && (formatting.getRgbValue() < 0 || formatting.getRgbValue() > 0xFFFFFF)) {
                return Result.error((String)("Out of range RGB value: " + s));
            }
            return Result.success((Object)formatting);
        });
    }
}

