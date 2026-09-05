/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.services.PlatformMixinOverrides
 *  net.caffeinemc.mods.sodium.client.services.PlatformMixinOverrides$MixinOverride
 *  net.caffeinemc.mods.sodium.mixin.MixinOption
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.caffeinemc.mods.sodium.client.data.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import net.caffeinemc.mods.sodium.client.services.PlatformMixinOverrides;
import net.caffeinemc.mods.sodium.mixin.MixinOption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MixinConfig {
    protected static final Logger LOGGER = LogManager.getLogger((String)"SodiumConfig");
    protected static final String JSON_KEY_SODIUM_OPTIONS = "sodium:options";
    private final Map<String, MixinOption> options = new HashMap<String, MixinOption>();

    protected MixinConfig() {
        this.addMixinRule("core", true);
        this.addMixinRule("features", true);
        this.addMixinRule("features.gui", true);
        this.addMixinRule("features.gui.hooks", true);
        this.addMixinRule("features.gui.hooks.console", true);
        this.addMixinRule("features.gui.hooks.debug", true);
        this.addMixinRule("features.gui.hooks.settings", true);
        this.addMixinRule("features.gui.screen", true);
        this.addMixinRule("features.model", true);
        this.addMixinRule("features.render", true);
        this.addMixinRule("features.render.compositing", true);
        this.addMixinRule("features.render.entity", true);
        this.addMixinRule("features.render.entity.cull", true);
        this.addMixinRule("features.render.entity.shadow", true);
        this.addMixinRule("features.render.gui", true);
        this.addMixinRule("features.render.gui.font", true);
        this.addMixinRule("features.render.gui.outlines", true);
        this.addMixinRule("features.render.immediate", true);
        this.addMixinRule("features.render.immediate.buffer_builder", true);
        this.addMixinRule("features.render.immediate.matrix_stack", true);
        this.addMixinRule("features.render.model", true);
        this.addMixinRule("features.render.model.block", true);
        this.addMixinRule("features.render.model.item", true);
        this.addMixinRule("features.render.particle", true);
        this.addMixinRule("features.render.viewport", true);
        this.addMixinRule("features.render.world", true);
        this.addMixinRule("features.render.world.clouds", true);
        this.addMixinRule("features.render.world.sky", true);
        this.addMixinRule("features.textures", true);
        this.addMixinRule("features.textures.animations", true);
        this.addMixinRule("features.world", true);
        this.addMixinRule("features.world.biome", true);
        this.addMixinRule("workarounds", true);
        this.addMixinRule("workarounds.context_creation", true);
        this.addMixinRule("workarounds.event_loop", true);
        this.addMixinRule("workarounds.window_minimized_state", true);
    }

    public static MixinConfig load(File file) {
        Object object;
        if (!file.exists()) {
            try {
                MixinConfig.writeDefaultConfig(file);
            }
            catch (IOException iOException) {
                LOGGER.warn("Could not write default configuration file", (Throwable)iOException);
            }
            MixinConfig mixinConfig = new MixinConfig();
            PlatformMixinOverrides.getInstance().applyModOverrides().forEach(mixinConfig::applyModOverride);
            return mixinConfig;
        }
        Properties properties = new Properties();
        try {
            object = new FileInputStream(file);
            try {
                properties.load((InputStream)object);
            }
            finally {
                ((FileInputStream)object).close();
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException("Could not load config file", iOException);
        }
        object = new MixinConfig();
        ((MixinConfig)object).readProperties(properties);
        PlatformMixinOverrides.getInstance().applyModOverrides().forEach(((MixinConfig)object)::applyModOverride);
        return object;
    }

    public int getOptionOverrideCount() {
        return (int)this.options.values().stream().filter(MixinOption::isOverridden).count();
    }

    public MixinOption getEffectiveOptionForMixin(String string) {
        int n;
        int n2 = 0;
        MixinOption mixinOption = null;
        while ((n = string.indexOf(46, n2)) != -1) {
            String string2 = MixinConfig.getMixinRuleName(string.substring(0, n));
            MixinOption mixinOption2 = this.options.get(string2);
            if (mixinOption2 != null && !(mixinOption = mixinOption2).isEnabled()) {
                return mixinOption;
            }
            n2 = n + 1;
        }
        return mixinOption;
    }

    private void readProperties(Properties properties) {
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            boolean bl;
            String string = (String)entry.getKey();
            String string2 = (String)entry.getValue();
            MixinOption mixinOption = this.options.get(string);
            if (mixinOption == null) {
                LOGGER.warn("No configuration key exists with name '{}', ignoring", (Object)string);
                continue;
            }
            if (string2.equalsIgnoreCase("true")) {
                bl = true;
            } else if (string2.equalsIgnoreCase("false")) {
                bl = false;
            } else {
                LOGGER.warn("Invalid value '{}' encountered for configuration key '{}', ignoring", (Object)string2, (Object)string);
                continue;
            }
            mixinOption.setEnabled(bl, true);
        }
    }

    public int getOptionCount() {
        return this.options.size();
    }

    protected void applyModOverride(PlatformMixinOverrides.MixinOverride mixinOverride) {
        MixinOption mixinOption = this.options.get(mixinOverride.option());
        if (mixinOption == null) {
            LOGGER.warn("Mod '{}' attempted to override option '{}', which doesn't exist, ignoring", (Object)mixinOverride.modId(), (Object)mixinOverride.option());
            return;
        }
        if (!mixinOverride.enabled() && mixinOption.isEnabled()) {
            mixinOption.clearModsDefiningValue();
        }
        if (!mixinOverride.enabled() || mixinOption.isEnabled() || mixinOption.getDefiningMods().isEmpty()) {
            mixinOption.addModOverride(mixinOverride.enabled(), mixinOverride.modId());
        }
    }

    private static void writeDefaultConfig(File file) throws IOException {
        File file2 = file.getParentFile();
        if (!file2.exists()) {
            if (!file2.mkdirs()) {
                throw new IOException("Could not create parent directories");
            }
        } else if (!file2.isDirectory()) {
            throw new IOException("The parent file is not a directory");
        }
        try (FileWriter fileWriter = new FileWriter(file);){
            fileWriter.write("# This is the configuration file for Sodium.\n");
            fileWriter.write("#\n");
            fileWriter.write("# You can find information on editing this file and all the available options here:\n");
            fileWriter.write("# https://github.com/CaffeineMC/sodium/wiki/Configuration-File\n");
            fileWriter.write("#\n");
            fileWriter.write("# By default, this file will be empty except for this notice.\n");
        }
    }

    private void addMixinRule(String string, boolean bl) {
        String string2 = MixinConfig.getMixinRuleName(string);
        if (this.options.putIfAbsent(string2, new MixinOption(string2, bl, false)) != null) {
            throw new IllegalStateException("Mixin rule already defined: " + string);
        }
    }

    private static String getMixinRuleName(String string) {
        return "mixin." + string;
    }
}

