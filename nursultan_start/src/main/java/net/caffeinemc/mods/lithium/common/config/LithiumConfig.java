/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.caffeinemc.mods.lithium.common.config;

import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.function.BiConsumer;
import net.caffeinemc.mods.lithium.common.config.Option;
import net.caffeinemc.mods.lithium.common.services.PlatformMixinOverrides;
import net.caffeinemc.mods.lithium.common.services.PlatformMixinOverrides$MixinOverride;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LithiumConfig {
    private static final Logger LOGGER = LogManager.getLogger((String)"LithiumConfig");
    private static final String JSON_KEY_LITHIUM_OPTIONS = "lithium:options";
    private final Map<String, Option> options = new HashMap<String, Option>();
    private final Set<Option> optionsWithDependencies = new ObjectLinkedOpenHashSet();

    private LithiumConfig() {
        Object object3;
        Closeable closeable;
        InputStream inputStream = LithiumConfig.class.getResourceAsStream("/assets/lithium/lithium-mixin-config-default.properties");
        if (inputStream == null) {
            throw new IllegalStateException("Lithium mixin config default properties could not be read!");
        }
        try {
            closeable = new BufferedReader(new InputStreamReader(inputStream));
            try {
                object3 = new Properties();
                ((Properties)object3).load((Reader)closeable);
                ((Properties)object3).forEach((BiConsumer<? super Object, ? super Object>)((BiConsumer<Object, Object>)(object, object2) -> this.addMixinRule((String)object, Boolean.parseBoolean((String)object2))));
            }
            finally {
                closeable.close();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            throw new IllegalStateException("Lithium mixin config default properties could not be read!");
        }
        closeable = LithiumConfig.class.getResourceAsStream("/assets/lithium/lithium-mixin-config-dependencies.properties");
        if (closeable == null) {
            throw new IllegalStateException("Lithium mixin config dependencies could not be read!");
        }
        try {
            object3 = new BufferedReader(new InputStreamReader((InputStream)closeable));
            try {
                Properties properties = new Properties();
                properties.load((Reader)object3);
                properties.forEach((BiConsumer<? super Object, ? super Object>)((BiConsumer<Object, Object>)(object, object2) -> {
                    String[] stringArray;
                    String string = (String)object;
                    String string2 = (String)object2;
                    for (String string3 : stringArray = string2.split(",")) {
                        String[] stringArray2 = string3.split(":");
                        if (stringArray2.length != 2) {
                            return;
                        }
                        String string4 = stringArray2[0];
                        String string5 = stringArray2[1];
                        this.addRuleDependency(string, string4, Boolean.parseBoolean(string5));
                    }
                }));
            }
            finally {
                ((BufferedReader)object3).close();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            throw new IllegalStateException("Lithium mixin config dependencies could not be read!");
        }
    }

    public static LithiumConfig load(File file) {
        LithiumConfig lithiumConfig = new LithiumConfig();
        if (file.exists()) {
            Properties properties = new Properties();
            try (FileInputStream fileInputStream = new FileInputStream(file);){
                properties.load(fileInputStream);
            }
            catch (IOException iOException) {
                throw new RuntimeException("Could not load config file", iOException);
            }
            lithiumConfig.readProperties(properties);
        } else {
            try {
                LithiumConfig.writeDefaultConfig(file);
            }
            catch (IOException iOException) {
                LOGGER.warn("Could not write default configuration file", (Throwable)iOException);
            }
        }
        PlatformMixinOverrides.getInstance().applyModOverrides().forEach(lithiumConfig::applyModOverride);
        PlatformMixinOverrides.getInstance().applyLithiumCompat(lithiumConfig.options);
        lithiumConfig.applyDependencies();
        return lithiumConfig;
    }

    public Option getParent(Option option) {
        String string = option.getName();
        int n = string.lastIndexOf(46);
        if (n != -1) {
            String string2 = string.substring(0, n);
            return this.options.get(string2);
        }
        return null;
    }

    private void addRuleDependency(String string, String string2, boolean bl) {
        Option option = this.options.get(string);
        if (option == null) {
            LOGGER.error("Option {} for dependency '{} depends on {}={}' not found. Skipping.", (Object)string, (Object)string, (Object)string2, (Object)bl);
            return;
        }
        Option option2 = this.options.get(string2);
        if (option2 == null) {
            LOGGER.error("Option {} for dependency '{} depends on {}={}' not found. Skipping.", (Object)string2, (Object)string, (Object)string2, (Object)bl);
            return;
        }
        option.addDependency(option2, bl);
        this.optionsWithDependencies.add(option);
    }

    public boolean isOptionEnabled(String string) {
        return this.options.get(string).isEnabled();
    }

    public int getOptionOverrideCount() {
        return (int)this.options.values().stream().filter(Option::isOverridden).count();
    }

    public Option getEffectiveOptionForMixin(String string) {
        int n;
        int n2 = 0;
        Option option = null;
        while ((n = string.indexOf(46, n2)) != -1) {
            String string2 = LithiumConfig.getMixinRuleName(string.substring(0, n));
            Option option2 = this.options.get(string2);
            if (option2 != null && !(option = option2).isEnabled()) {
                return option;
            }
            n2 = n + 1;
        }
        return option;
    }

    private boolean applyDependenciesOnce() {
        boolean bl = false;
        for (Option option : this.optionsWithDependencies) {
            bl |= option.disableIfDependenciesNotMet(LOGGER, this);
        }
        return bl;
    }

    private void readProperties(Properties properties) {
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            boolean bl;
            String string = (String)entry.getKey();
            String string2 = (String)entry.getValue();
            Option option = this.options.get(string);
            if (option == null) {
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
            option.setEnabled(bl, true);
        }
    }

    private void applyDependencies() {
        while (this.applyDependenciesOnce()) {
        }
    }

    public int getOptionCount() {
        return this.options.size();
    }

    protected void applyModOverride(PlatformMixinOverrides$MixinOverride platformMixinOverrides$MixinOverride) {
        Option option = this.options.get(platformMixinOverrides$MixinOverride.option());
        if (option == null && !platformMixinOverrides$MixinOverride.option().startsWith("mixin.")) {
            option = this.options.get("mixin." + platformMixinOverrides$MixinOverride.option());
        }
        if (option == null) {
            LOGGER.warn("Mod '{}' attempted to override option '{}', which doesn't exist, ignoring", (Object)platformMixinOverrides$MixinOverride.modId(), (Object)platformMixinOverrides$MixinOverride.option());
            return;
        }
        if (!platformMixinOverrides$MixinOverride.enabled() && option.isEnabled()) {
            option.clearModsDefiningValue();
        }
        if (!platformMixinOverrides$MixinOverride.enabled() || option.isEnabled() || option.getDefiningMods().isEmpty()) {
            option.addModOverride(platformMixinOverrides$MixinOverride.enabled(), platformMixinOverrides$MixinOverride.modId());
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
            fileWriter.write("# This is the configuration file for Lithium.\n");
            fileWriter.write("#\n");
            fileWriter.write("# You can find information on editing this file and all the available options here:\n");
            fileWriter.write("# https://github.com/CaffeineMC/lithium-fabric/wiki/Configuration-File\n");
            fileWriter.write("#\n");
            fileWriter.write("# By default, this file will be empty except for this notice.\n");
        }
    }

    private void addMixinRule(String string, boolean bl) {
        if (this.options.putIfAbsent(string, new Option(string, bl, false)) != null) {
            throw new IllegalStateException("Mixin rule already defined: " + string);
        }
    }

    private static String getMixinRuleName(String string) {
        return "mixin." + string;
    }
}

