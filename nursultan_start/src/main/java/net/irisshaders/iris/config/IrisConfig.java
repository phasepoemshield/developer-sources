/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  minecraft.class01894
 *  net.irisshaders.iris.gui.option.IrisVideoSettings
 *  net.irisshaders.iris.pathways.colorspace.ColorSpace
 */
package net.irisshaders.iris.config;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import minecraft.class01894;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gui.option.IrisVideoSettings;
import net.irisshaders.iris.pathways.colorspace.ColorSpace;

public class IrisConfig {
    private static final String COMMENT = "This file stores configuration options for Iris, such as the currently active shaderpack";
    private final Path propertiesPath;
    private final Path excludedPath;
    private String shaderPackName = null;
    private boolean enableShaders = true;
    private boolean allowUnknownShaders = false;
    private boolean enableDebugOptions = false;
    private List<class01894> shadersToSkip = new ArrayList<class01894>();
    private boolean disableUpdateMessage = false;
    private static Gson GSON = new Gson();

    public void setDebugEnabled(boolean bl) {
        this.enableDebugOptions = bl;
    }

    public boolean areShadersEnabled() {
        return this.enableShaders;
    }

    public Optional<String> getShaderPackName() {
        return Optional.ofNullable(this.shaderPackName);
    }

    public void setShadersEnabled(boolean bl) {
        this.enableShaders = bl;
    }

    public IrisConfig(Path path, Path path2) {
        this.propertiesPath = path;
        this.excludedPath = path2;
    }

    public void load() throws IOException {
        Object object;
        if (Files.exists(this.excludedPath, new LinkOption[0])) {
            object = JsonParser.parseString((String)Files.readString(this.excludedPath)).getAsJsonObject().getAsJsonArray("excluded");
            for (int i = 0; i < object.size(); ++i) {
                class01894 class018942 = class01894.L((String)object.get(i).getAsString());
                if (class018942 == null) {
                    Iris.logger.warn("Unknown shader " + object.get(i).getAsString());
                }
                this.shadersToSkip.add(class018942);
            }
        } else {
            object = new JsonObject();
            JsonArray jsonArray = new JsonArray();
            jsonArray.add("put:valuesHere");
            object.add("excluded", (JsonElement)jsonArray);
            Files.writeString(this.excludedPath, (CharSequence)GSON.toJson((JsonElement)object), new OpenOption[0]);
        }
        if (!Files.exists(this.propertiesPath, new LinkOption[0])) {
            return;
        }
        object = new Properties();
        try (InputStream inputStream = Files.newInputStream(this.propertiesPath, new OpenOption[0]);){
            ((Properties)object).load(inputStream);
        }
        this.shaderPackName = ((Properties)object).getProperty("shaderPack");
        this.enableShaders = !"false".equals(((Properties)object).getProperty("enableShaders"));
        this.allowUnknownShaders = "true".equals(((Properties)object).getProperty("allowUnknownShaders"));
        this.enableDebugOptions = "true".equals(((Properties)object).getProperty("enableDebugOptions"));
        this.disableUpdateMessage = "true".equals(((Properties)object).getProperty("disableUpdateMessage"));
        try {
            IrisVideoSettings.shadowDistance = Integer.parseInt(((Properties)object).getProperty("maxShadowRenderDistance", "32"));
            IrisVideoSettings.colorSpace = ColorSpace.valueOf((String)((Properties)object).getProperty("colorSpace", "SRGB"));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            Iris.logger.error("Shadow distance setting reset; value is invalid.");
            IrisVideoSettings.shadowDistance = 32;
            IrisVideoSettings.colorSpace = ColorSpace.SRGB;
            this.save();
        }
        if (this.shaderPackName != null && (this.shaderPackName.equals("(internal)") || this.shaderPackName.isEmpty())) {
            this.shaderPackName = null;
        }
    }

    public void initialize() throws IOException {
        this.load();
        if (!Files.exists(this.propertiesPath, new LinkOption[0])) {
            this.save();
        }
    }

    public void save() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("shaderPack", this.getShaderPackName().orElse(""));
        properties.setProperty("enableShaders", this.enableShaders ? "true" : "false");
        properties.setProperty("allowUnknownShaders", this.allowUnknownShaders ? "true" : "false");
        properties.setProperty("enableDebugOptions", this.enableDebugOptions ? "true" : "false");
        properties.setProperty("disableUpdateMessage", this.disableUpdateMessage ? "true" : "false");
        properties.setProperty("maxShadowRenderDistance", String.valueOf(IrisVideoSettings.shadowDistance));
        properties.setProperty("colorSpace", IrisVideoSettings.colorSpace.name());
        try (OutputStream outputStream = Files.newOutputStream(this.propertiesPath, new OpenOption[0]);){
            properties.store(outputStream, COMMENT);
        }
    }

    public boolean isInternal() {
        return false;
    }

    public boolean shouldSkip(class01894 class018942) {
        return this.shadersToSkip.contains(class018942);
    }

    public boolean areDebugOptionsEnabled() {
        return this.enableDebugOptions;
    }

    public void setUnknown(boolean bl) throws IOException {
        this.allowUnknownShaders = bl;
        this.save();
    }

    public void setShaderPackName(String string) {
        this.shaderPackName = string == null || string.equals("(internal)") || string.isEmpty() ? null : string;
    }

    public boolean shouldAllowUnknownShaders() {
        return this.allowUnknownShaders;
    }

    public boolean shouldDisableUpdateMessage() {
        return this.disableUpdateMessage;
    }
}

