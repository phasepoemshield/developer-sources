/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.config.v2.api.ConfigClassHandler
 *  dev.isxander.yacl3.config.v2.api.SerialEntry
 *  dev.isxander.yacl3.config.v2.api.serializer.GsonConfigSerializerBuilder
 */
package dev.isxander.yacl3.platform;

import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.SerialEntry;
import dev.isxander.yacl3.config.v2.api.serializer.GsonConfigSerializerBuilder;
import dev.isxander.yacl3.platform.YACLPlatform;

public class YACLConfig {
    public static final ConfigClassHandler<YACLConfig> HANDLER = ConfigClassHandler.createBuilder(YACLConfig.class).id(YACLPlatform.rl("config")).serializer(configClassHandler -> GsonConfigSerializerBuilder.create((ConfigClassHandler)configClassHandler).setPath(YACLPlatform.getConfigDir().resolve("yacl.json5")).setJson5(true).build()).build();
    @SerialEntry(comment="Show the flashing colour picker hint (auto disables after first use)")
    public boolean showColorPickerIndicator = true;
    @SerialEntry(comment="Load .webp and .gif during Minecraft resource reload instead of on-demand (can decrease startup time)")
    public boolean preloadComplexImageFormats = false;
}

