/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 *  dev.isxander.yacl3.impl.utils.YACLConstants
 *  dev.isxander.yacl3.platform.YACLPlatform
 *  org.quiltmc.parsers.json.JsonReader
 *  org.quiltmc.parsers.json.JsonWriter
 *  org.quiltmc.parsers.json.gson.GsonReader
 *  org.quiltmc.parsers.json.gson.GsonWriter
 */
package dev.isxander.yacl3.config.v2.impl.serializer;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.ConfigSerializer;
import dev.isxander.yacl3.config.v2.api.ConfigSerializer$LoadResult;
import dev.isxander.yacl3.config.v2.api.FieldAccess;
import dev.isxander.yacl3.config.v2.api.SerialField;
import dev.isxander.yacl3.impl.utils.YACLConstants;
import dev.isxander.yacl3.platform.YACLPlatform;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.quiltmc.parsers.json.JsonWriter;
import org.quiltmc.parsers.json.gson.GsonReader;
import org.quiltmc.parsers.json.gson.GsonWriter;

public class GsonConfigSerializer<T>
extends ConfigSerializer<T> {
    private final Gson gson;
    private final Path path;
    private final boolean json5;

    GsonConfigSerializer(ConfigClassHandler<T> configClassHandler, Path path, Gson gson, boolean bl) {
        super(configClassHandler);
        this.gson = gson;
        this.path = path;
        this.json5 = bl;
    }

    @Override
    @Deprecated
    public void load() {
        YACLConstants.LOGGER.warn("Calling ConfigSerializer#load() directly is deprecated. Please use ConfigClassHandler#load() instead.");
        this.config.load();
    }

    @Override
    public void save() {
        YACLConstants.LOGGER.info("Serializing {} to '{}'", this.config.configClass(), (Object)this.path);
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                JsonWriter jsonWriter = this.json5 ? JsonWriter.json5((Writer)stringWriter) : JsonWriter.json((Writer)stringWriter);
                GsonWriter gsonWriter = new GsonWriter(jsonWriter);
                jsonWriter.beginObject();
                for (ConfigField<?> configField : this.config.fields()) {
                    JsonElement jsonElement;
                    SerialField serialField = configField.serial().orElse(null);
                    if (serialField == null) continue;
                    if (!this.json5 && serialField.comment().isPresent() && YACLPlatform.isDevelopmentEnv()) {
                        YACLConstants.LOGGER.warn("Found comment in config field '{}', but json5 is not enabled. Enable it with `.setJson5(true)` on the `GsonConfigSerializerBuilder`. Comments will not be serialized. This warning is only visible in development environments.", (Object)serialField.serialName());
                    }
                    jsonWriter.comment((String)serialField.comment().orElse(null));
                    jsonWriter.name(serialField.serialName());
                    try {
                        jsonElement = this.gson.toJsonTree(configField.access().get(), configField.access().type());
                    }
                    catch (Exception exception) {
                        YACLConstants.LOGGER.error("Failed to serialize config field '{}'. Serializing as null.", (Object)serialField.serialName(), (Object)exception);
                        jsonWriter.nullValue();
                        continue;
                    }
                    try {
                        this.gson.toJson(jsonElement, (com.google.gson.stream.JsonWriter)gsonWriter);
                    }
                    catch (Exception exception) {
                        YACLConstants.LOGGER.error("Failed to serialize config field '{}'. Due to the error state this JSON writer cannot continue safely and the save will be abandoned.", (Object)serialField.serialName(), (Object)exception);
                        stringWriter.close();
                        return;
                    }
                }
                jsonWriter.endObject();
                jsonWriter.flush();
                Files.createDirectories(this.path.getParent(), new FileAttribute[0]);
                Files.writeString(this.path, (CharSequence)stringWriter.toString(), StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE);
            }
            finally {
                try {
                    stringWriter.close();
                }
                catch (Throwable throwable) {
                    Throwable throwable2;
                    throwable2.addSuppressed(throwable);
                }
            }
        }
        catch (IOException iOException) {
            YACLConstants.LOGGER.error("Failed to serialize config class '{}'.", (Object)this.config.configClass().getSimpleName(), (Object)iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public ConfigSerializer$LoadResult loadSafely(Map<ConfigField<?>, FieldAccess<?>> map) {
        ConfigSerializer$LoadResult configSerializer$LoadResult;
        if (!Files.exists(this.path, new LinkOption[0])) {
            YACLConstants.LOGGER.info("Config file '{}' does not exist. Creating it with default values.", (Object)this.path);
            this.save();
            return ConfigSerializer$LoadResult.NO_CHANGE;
        }
        YACLConstants.LOGGER.info("Deserializing {} from '{}'", (Object)this.config.configClass().getSimpleName(), (Object)this.path);
        Map map2 = Arrays.stream(this.config.fields()).filter(configField -> configField.serial().isPresent()).collect(Collectors.toMap(configField -> configField.serial().orElseThrow().serialName(), Function.identity()));
        Set<Object> set = map2.keySet();
        boolean bl = false;
        try {
            org.quiltmc.parsers.json.JsonReader jsonReader = this.json5 ? org.quiltmc.parsers.json.JsonReader.json5((Path)this.path) : org.quiltmc.parsers.json.JsonReader.json((Path)this.path);
            try {
                GsonReader gsonReader = new GsonReader(jsonReader);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    JsonElement jsonElement;
                    String string = jsonReader.nextName();
                    ConfigField configField2 = (ConfigField)map2.get(string);
                    set.remove(string);
                    if (configField2 == null) {
                        YACLConstants.LOGGER.warn("Found unknown config field '{}'.", (Object)string);
                        jsonReader.skipValue();
                        continue;
                    }
                    FieldAccess<?> fieldAccess = map.get(configField2);
                    SerialField serialField = configField2.serial().orElse(null);
                    if (serialField == null) continue;
                    try {
                        jsonElement = (JsonElement)this.gson.fromJson((JsonReader)gsonReader, JsonElement.class);
                    }
                    catch (Exception exception) {
                        YACLConstants.LOGGER.error("Failed to deserialize config field '{}'. Due to the error state this JSON reader cannot be re-used and loading will be aborted.", (Object)string, (Object)exception);
                        ConfigSerializer$LoadResult configSerializer$LoadResult2 = ConfigSerializer$LoadResult.FAILURE;
                        if (jsonReader == null) return configSerializer$LoadResult2;
                        jsonReader.close();
                        return configSerializer$LoadResult2;
                    }
                    if (jsonElement.isJsonNull() && !serialField.nullable()) {
                        YACLConstants.LOGGER.warn("Found null value in non-nullable config field '{}'. Leaving field as default and marking as dirty.", (Object)string);
                        bl = true;
                        continue;
                    }
                    try {
                        fieldAccess.set(this.gson.fromJson(jsonElement, fieldAccess.type()));
                    }
                    catch (Exception exception) {
                        YACLConstants.LOGGER.error("Failed to deserialize config field '{}'. Leaving as default.", (Object)string, (Object)exception);
                    }
                }
                jsonReader.endObject();
            }
            finally {
                if (jsonReader != null) {
                    try {
                        jsonReader.close();
                    }
                    catch (Throwable throwable) {
                        Throwable throwable2;
                        throwable2.addSuppressed(throwable);
                    }
                }
            }
        }
        catch (IOException iOException) {
            YACLConstants.LOGGER.error("Failed to deserialize config class.", (Throwable)iOException);
            return ConfigSerializer$LoadResult.FAILURE;
        }
        if (!set.isEmpty()) {
            for (String string : set) {
                if (!((ConfigField)map2.get(string)).serial().orElseThrow().required()) continue;
                bl = true;
                YACLConstants.LOGGER.warn("Missing required config field '{}''. Re-saving as default.", (Object)string);
            }
        }
        if (bl) {
            configSerializer$LoadResult = ConfigSerializer$LoadResult.DIRTY;
            return configSerializer$LoadResult;
        }
        configSerializer$LoadResult = ConfigSerializer$LoadResult.SUCCESS;
        return configSerializer$LoadResult;
    }
}

