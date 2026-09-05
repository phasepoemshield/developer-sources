/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.Gson
 *  com.viaversion.viaversion.libs.gson.GsonBuilder
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonParseException
 *  com.viaversion.viaversion.libs.gson.JsonParser
 *  com.viaversion.viaversion.libs.gson.stream.JsonReader
 *  com.viaversion.viaversion.libs.mcstructs.converter.ConsumerTracking
 *  com.viaversion.viaversion.libs.mcstructs.snbt.SNbt
 *  com.viaversion.viaversion.libs.mcstructs.text.Style
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEvent
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_14.TextDeserializer_v1_14
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_14.TextSerializer_v1_14
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_15.TextDeserializer_v1_15
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_15.TextSerializer_v1_15
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_16.HoverEventDeserializer_v1_16
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_16.HoverEventSerializer_v1_16
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_16.StyleDeserializer_v1_16
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_16.StyleSerializer_v1_16
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_16.TextDeserializer_v1_16
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_16.TextSerializer_v1_16
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_17.TextDeserializer_v1_17
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_17.TextSerializer_v1_17
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_18.HoverEventDeserializer_v1_18
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_19_4.TextDeserializer_v1_19_4
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_19_4.TextSerializer_v1_19_4
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_6.TextDeserializer_v1_6
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_6.TextSerializer_v1_6
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_7.StyleDeserializer_v1_7
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_7.StyleSerializer_v1_7
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_7.TextDeserializer_v1_7
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_7.TextSerializer_v1_7
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_8.TextDeserializer_v1_8
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_8.TextSerializer_v1_8
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_9.TextSerializer_v1_9
 *  com.viaversion.viaversion.libs.mcstructs.text.utils.LegacyGson
 *  javax.annotation.Nullable
 */
package com.viaversion.viaversion.libs.mcstructs.text.serializer;

import com.viaversion.viaversion.libs.gson.Gson;
import com.viaversion.viaversion.libs.gson.GsonBuilder;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonParseException;
import com.viaversion.viaversion.libs.gson.JsonParser;
import com.viaversion.viaversion.libs.gson.stream.JsonReader;
import com.viaversion.viaversion.libs.mcstructs.converter.ConsumerTracking;
import com.viaversion.viaversion.libs.mcstructs.snbt.SNbt;
import com.viaversion.viaversion.libs.mcstructs.text.Style;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEvent;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentCodec;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_12.StyleDeserializer_v1_12;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_12.StyleSerializer_v1_12;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_12.TextDeserializer_v1_12;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_12.TextSerializer_v1_12;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_14.TextDeserializer_v1_14;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_14.TextSerializer_v1_14;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_15.TextDeserializer_v1_15;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_15.TextSerializer_v1_15;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_16.HoverEventDeserializer_v1_16;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_16.HoverEventSerializer_v1_16;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_16.StyleDeserializer_v1_16;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_16.StyleSerializer_v1_16;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_16.TextDeserializer_v1_16;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_16.TextSerializer_v1_16;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_17.TextDeserializer_v1_17;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_17.TextSerializer_v1_17;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_18.HoverEventDeserializer_v1_18;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_19_4.TextDeserializer_v1_19_4;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_19_4.TextSerializer_v1_19_4;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_6.TextDeserializer_v1_6;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_6.TextSerializer_v1_6;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_7.StyleDeserializer_v1_7;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_7.StyleSerializer_v1_7;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_7.TextDeserializer_v1_7;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_7.TextSerializer_v1_7;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_8.StyleDeserializer_v1_8;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_8.StyleSerializer_v1_8;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_8.TextDeserializer_v1_8;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_8.TextSerializer_v1_8;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_9.StyleDeserializer_v1_9;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_9.StyleSerializer_v1_9;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_9.TextSerializer_v1_9;
import com.viaversion.viaversion.libs.mcstructs.text.utils.LegacyGson;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class TextComponentSerializer
implements ConsumerTracking {
    private Consumer<String> stringConsumer;
    private boolean isDefault = true;
    public static final TextComponentSerializer V1_6 = new TextComponentSerializer(() -> new GsonBuilder().registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextSerializer_v1_6()).registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextDeserializer_v1_6()).create(), true);
    public static final TextComponentSerializer V1_7 = new TextComponentSerializer(() -> new GsonBuilder().registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextSerializer_v1_7()).registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextDeserializer_v1_7()).registerTypeAdapter(Style.class, (Object)new StyleDeserializer_v1_7(SNbt.V1_7)).registerTypeAdapter(Style.class, (Object)new StyleSerializer_v1_7(SNbt.V1_7)).create(), true);
    public static final TextComponentSerializer V1_8 = new TextComponentSerializer(() -> new GsonBuilder().registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextSerializer_v1_8()).registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextDeserializer_v1_8()).registerTypeAdapter(Style.class, (Object)new StyleDeserializer_v1_8(SNbt.V1_8)).registerTypeAdapter(Style.class, (Object)new StyleSerializer_v1_8(SNbt.V1_8)).create(), true);
    public static final TextComponentSerializer V1_9 = new TextComponentSerializer(() -> new GsonBuilder().registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextSerializer_v1_9()).registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextDeserializer_v1_8()).registerTypeAdapter(Style.class, (Object)new StyleDeserializer_v1_9(SNbt.V1_8)).registerTypeAdapter(Style.class, (Object)new StyleSerializer_v1_9(SNbt.V1_8)).create(), true);
    public static final TextComponentSerializer V1_12 = new TextComponentSerializer(() -> new GsonBuilder().registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextSerializer_v1_12()).registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextDeserializer_v1_12()).registerTypeAdapter(Style.class, (Object)new StyleDeserializer_v1_12(SNbt.V1_12)).registerTypeAdapter(Style.class, (Object)new StyleSerializer_v1_12(SNbt.V1_12)).create());
    public static final TextComponentSerializer V1_14 = new TextComponentSerializer(() -> new GsonBuilder().registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextSerializer_v1_14()).registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextDeserializer_v1_14()).registerTypeAdapter(Style.class, (Object)new StyleDeserializer_v1_12(SNbt.V1_14)).registerTypeAdapter(Style.class, (Object)new StyleSerializer_v1_12(SNbt.V1_14)).disableHtmlEscaping().create());
    public static final TextComponentSerializer V1_15 = new TextComponentSerializer(() -> new GsonBuilder().registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextSerializer_v1_15()).registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextDeserializer_v1_15()).registerTypeAdapter(Style.class, (Object)new StyleDeserializer_v1_12(SNbt.V1_14)).registerTypeAdapter(Style.class, (Object)new StyleSerializer_v1_12(SNbt.V1_14)).disableHtmlEscaping().create());
    public static final TextComponentSerializer V1_16 = new TextComponentSerializer(() -> new GsonBuilder().registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextSerializer_v1_16()).registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextDeserializer_v1_16()).registerTypeAdapter(Style.class, (Object)new StyleDeserializer_v1_16()).registerTypeAdapter(Style.class, (Object)new StyleSerializer_v1_16()).registerTypeHierarchyAdapter(HoverEvent.class, (Object)new HoverEventDeserializer_v1_16(V1_16, SNbt.V1_14)).registerTypeHierarchyAdapter(HoverEvent.class, (Object)new HoverEventSerializer_v1_16(V1_16, SNbt.V1_14)).disableHtmlEscaping().create());
    public static final TextComponentSerializer V1_17 = new TextComponentSerializer(() -> new GsonBuilder().registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextSerializer_v1_17()).registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextDeserializer_v1_17()).registerTypeAdapter(Style.class, (Object)new StyleDeserializer_v1_16()).registerTypeAdapter(Style.class, (Object)new StyleSerializer_v1_16()).registerTypeHierarchyAdapter(HoverEvent.class, (Object)new HoverEventDeserializer_v1_16(V1_17, SNbt.V1_14)).registerTypeHierarchyAdapter(HoverEvent.class, (Object)new HoverEventSerializer_v1_16(V1_17, SNbt.V1_14)).disableHtmlEscaping().create());
    public static final TextComponentSerializer V1_18 = new TextComponentSerializer(() -> new GsonBuilder().registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextSerializer_v1_17()).registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextDeserializer_v1_17()).registerTypeAdapter(Style.class, (Object)new StyleDeserializer_v1_16()).registerTypeAdapter(Style.class, (Object)new StyleSerializer_v1_16()).registerTypeHierarchyAdapter(HoverEvent.class, (Object)new HoverEventDeserializer_v1_18(V1_18, SNbt.V1_14)).registerTypeHierarchyAdapter(HoverEvent.class, (Object)new HoverEventSerializer_v1_16(V1_18, SNbt.V1_14)).disableHtmlEscaping().create());
    public static final TextComponentSerializer V1_19_4 = new TextComponentSerializer(() -> new GsonBuilder().registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextSerializer_v1_19_4()).registerTypeHierarchyAdapter(TextComponent.class, (Object)new TextDeserializer_v1_19_4()).registerTypeAdapter(Style.class, (Object)new StyleDeserializer_v1_16()).registerTypeAdapter(Style.class, (Object)new StyleSerializer_v1_16()).registerTypeHierarchyAdapter(HoverEvent.class, (Object)new HoverEventDeserializer_v1_18(V1_19_4, SNbt.V1_14)).registerTypeHierarchyAdapter(HoverEvent.class, (Object)new HoverEventSerializer_v1_16(V1_19_4, SNbt.V1_14)).disableHtmlEscaping().create());
    public static final TextComponentSerializer V1_20_3 = TextComponentCodec.V1_20_3.asSerializer();
    public static final TextComponentSerializer V1_20_5 = TextComponentCodec.V1_20_5.asSerializer();
    public static final TextComponentSerializer V1_21_2 = TextComponentCodec.V1_21_2.asSerializer();
    public static final TextComponentSerializer V1_21_4 = TextComponentCodec.V1_21_4.asSerializer();
    public static final TextComponentSerializer V1_21_5 = TextComponentCodec.V1_21_5.asSerializer();
    public static final TextComponentSerializer V1_21_6 = TextComponentCodec.V1_21_6.asSerializer();
    public static final TextComponentSerializer V1_21_9 = TextComponentCodec.V1_21_9.asSerializer();
    public static final TextComponentSerializer V26_1;
    public static final TextComponentSerializer LATEST;
    private final TextComponentCodec parentCodec;
    private final Supplier<Gson> gsonSupplier;
    private final boolean legacyGson;
    private Gson gson;

    public TextComponent deserialize(String string) {
        if (this.legacyGson) {
            LegacyGson.checkStartingType((String)string, (boolean)true);
            string = LegacyGson.fixInvalidEscapes((String)string);
        }
        return (TextComponent)this.getGson().fromJson(string, TextComponent.class);
    }

    public TextComponent deserialize(JsonElement jsonElement) {
        return (TextComponent)this.getGson().fromJson(jsonElement, TextComponent.class);
    }

    public boolean isCodec() {
        return this.parentCodec != null;
    }

    public TextComponentSerializer(Supplier<Gson> supplier) {
        this(supplier, false);
    }

    private TextComponentSerializer(TextComponentCodec textComponentCodec, Supplier<Gson> supplier, boolean bl) {
        this.parentCodec = textComponentCodec;
        this.gsonSupplier = supplier;
        this.legacyGson = bl;
        this.isDefault = false;
    }

    public TextComponentSerializer(TextComponentCodec textComponentCodec, Supplier<Gson> supplier) {
        this.parentCodec = textComponentCodec;
        this.gsonSupplier = supplier;
        this.legacyGson = false;
    }

    public TextComponentSerializer(Supplier<Gson> supplier, boolean bl) {
        this.parentCodec = null;
        this.gsonSupplier = supplier;
        this.legacyGson = bl;
    }

    public void setCurrentConsumer(Consumer<String> consumer) {
        this.stringConsumer = consumer;
    }

    public TextComponentSerializer forkIfDefault() {
        return this.isDefault ? new TextComponentSerializer(this.parentCodec, this.gsonSupplier, this.legacyGson) : this;
    }

    @Nullable
    public Consumer<String> currentConsumer() {
        return this.stringConsumer;
    }

    public String serialize(TextComponent textComponent) {
        return this.getGson().toJson((Object)textComponent);
    }

    public TextComponent deserializeLenientReader(String string) {
        if (this.parentCodec != null) {
            return this.parentCodec.deserializeLenientJson(string);
        }
        return this.deserializeReader(string, true);
    }

    public TextComponent deserializeReader(String string) {
        return this.deserializeReader(string, false);
    }

    public TextComponent deserializeReader(String string, boolean bl) {
        if (this.legacyGson) {
            LegacyGson.checkStartingType((String)string, (boolean)bl);
            string = LegacyGson.fixInvalidEscapes((String)string);
        }
        if (this.parentCodec != null) {
            if (bl) {
                return this.parentCodec.deserializeLenientJson(string);
            }
            return this.parentCodec.deserializeJsonReader(string);
        }
        try {
            JsonReader jsonReader = new JsonReader((Reader)new StringReader(string));
            jsonReader.setLenient(bl);
            return (TextComponent)this.getGson().getAdapter(TextComponent.class).read(jsonReader);
        }
        catch (IOException iOException) {
            throw new JsonParseException("Failed to parse json", (Throwable)iOException);
        }
    }

    public TextComponent deserializeParser(String string) {
        if (this.legacyGson) {
            LegacyGson.checkStartingType((String)string, (boolean)true);
            string = LegacyGson.fixInvalidEscapes((String)string);
        }
        if (this.parentCodec != null) {
            return this.parentCodec.deserializeJson(string);
        }
        return (TextComponent)this.getGson().fromJson(JsonParser.parseString((String)string), TextComponent.class);
    }

    @Nullable
    public TextComponentCodec getParentCodec() {
        return this.parentCodec;
    }

    public JsonElement serializeJson(TextComponent textComponent) {
        return this.getGson().toJsonTree((Object)textComponent);
    }

    public Gson getGson() {
        if (this.gson == null) {
            this.gson = this.gsonSupplier.get();
        }
        return this.gson;
    }

    static {
        LATEST = V26_1 = TextComponentCodec.V26_1.asSerializer();
    }
}

