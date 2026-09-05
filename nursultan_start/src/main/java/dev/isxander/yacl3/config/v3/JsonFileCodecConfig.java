/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.JsonOps
 */
package dev.isxander.yacl3.config.v3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import dev.isxander.yacl3.config.v3.CodecConfig;
import dev.isxander.yacl3.config.v3.JsonFileCodecConfig$LoadError;
import dev.isxander.yacl3.config.v3.JsonFileCodecConfig$SaveError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public abstract class JsonFileCodecConfig<T extends JsonFileCodecConfig<T>>
extends CodecConfig<T> {
    private final Path configPath;
    private final Gson gson;

    public JsonFileCodecConfig(Path path) {
        this.configPath = path;
        this.gson = this.createGson();
    }

    public void saveToFile() {
        DataResult dataResult = this.encodeStart(JsonOps.INSTANCE);
        if (dataResult.error().isPresent()) {
            this.onSaveError(JsonFileCodecConfig$SaveError.ENCODING, new IllegalStateException("Failed to encode: " + ((DataResult.Error)dataResult.error().get()).message()));
            return;
        }
        JsonElement jsonElement = (JsonElement)dataResult.result().orElseThrow();
        String string = this.gson.toJson(jsonElement);
        try {
            Files.writeString(this.configPath, (CharSequence)string, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE);
        }
        catch (IOException iOException) {
            this.onSaveError(JsonFileCodecConfig$SaveError.WRITING, iOException);
        }
    }

    protected Gson createGson() {
        return new GsonBuilder().setPrettyPrinting().create();
    }

    public boolean loadFromFile() {
        JsonElement jsonElement;
        String string;
        if (Files.notExists(this.configPath, new LinkOption[0])) {
            return false;
        }
        try {
            string = Files.readString(this.configPath);
        }
        catch (IOException iOException) {
            this.onLoadError(JsonFileCodecConfig$LoadError.READING, iOException);
            return false;
        }
        try {
            jsonElement = JsonParser.parseString((String)string);
        }
        catch (JsonParseException jsonParseException) {
            this.onLoadError(JsonFileCodecConfig$LoadError.JSON_PARSING, jsonParseException);
            return false;
        }
        return this.decode(jsonElement, JsonOps.INSTANCE);
    }

    protected void onLoadError(JsonFileCodecConfig$LoadError jsonFileCodecConfig$LoadError, Throwable throwable) {
        throw new IllegalStateException("Error whilst " + jsonFileCodecConfig$LoadError.name().toLowerCase(), throwable);
    }

    protected void onSaveError(JsonFileCodecConfig$SaveError jsonFileCodecConfig$SaveError, Throwable throwable) {
        throw new IllegalStateException("Error whilst " + jsonFileCodecConfig$SaveError.name().toLowerCase(), throwable);
    }
}

