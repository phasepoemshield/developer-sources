/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.caffeineconfig;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.ServiceLoader;
import java.util.Set;
import net.caffeinemc.caffeineconfig.CaffeineConfig$Builder;
import net.caffeinemc.caffeineconfig.CaffeineConfigPlatform;
import net.caffeinemc.caffeineconfig.Option;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class CaffeineConfig {
    private final Map<String, Option> options = new HashMap<String, Option>();
    private final Set<Option> optionsWithDependencies = new ObjectLinkedOpenHashSet();
    final String modName;
    Logger logger;
    static final CaffeineConfigPlatform PLATFORM = ServiceLoader.load(CaffeineConfigPlatform.class).findFirst().get();

    public Map<String, Option> getOptions() {
        return ImmutableMap.copyOf(this.options);
    }

    private CaffeineConfig(String string) {
        this.modName = string;
    }

    public static CaffeineConfig$Builder builder(String string) {
        CaffeineConfig caffeineConfig = new CaffeineConfig(string);
        caffeineConfig.logger = LoggerFactory.getLogger((String)(string + " Config"));
        String string2 = string.toLowerCase() + ":options";
        CaffeineConfig caffeineConfig2 = caffeineConfig;
        Objects.requireNonNull(caffeineConfig2);
        return new CaffeineConfig$Builder(caffeineConfig2).withSettingsKey(string2);
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

    public Logger getLogger() {
        return this.logger;
    }

    void applyChildOptionsStateChecks() {
        for (Option option : this.options.values()) {
            for (Option option2 : this.options.values()) {
                if (!option2.getName().startsWith(option.getName() + ".") || option2 == option) continue;
                if (option2.isOverrideable() && (option.isUserDefined() || option.isModDefined())) {
                    option2.setEnabled(option.isEnabled(), option.isUserDefined());
                    if (!option.isModDefined()) continue;
                    option.getDefiningMods().forEach(string -> option2.addModOverride(option.isEnabled(), (String)string));
                    continue;
                }
                if (option.isUserDefined()) {
                    this.logger.warn("User attempted to override option '{}' that is not overrideable by overriding '{}', ignoring", (Object)option2.getName(), (Object)option.getName());
                    continue;
                }
                if (!option.isModDefined()) continue;
                this.logger.warn("Mod '{}' attempted to override option '{}' that is not overrideable by overriding '{}', ignoring", new Object[]{option.getDefiningMods(), option2.getName(), option.getName()});
            }
        }
    }

    public int getOptionOverrideCount() {
        return (int)this.options.values().stream().filter(Option::isOverridden).count();
    }

    public Option getEffectiveOptionForMixin(String string) {
        int n;
        int n2 = 0;
        Option option = null;
        while ((n = string.indexOf(46, n2)) != -1) {
            String string2 = CaffeineConfig.getMixinOptionName(string.substring(0, n));
            Option option2 = this.options.get(string2);
            if (option2 != null && !(option = option2).isEnabled()) {
                return option;
            }
            n2 = n + 1;
        }
        return option;
    }

    void applyOverrideableChecks() {
        for (Option option : this.options.values()) {
            for (Option option2 : this.options.values()) {
                if (!option2.getName().startsWith(option.getName() + ".") || option2 == option || option.isOverrideable() || !option2.isOverrideable()) continue;
                this.logger.warn("Mixin option '{}' cannot be set as overrideable because its parent option '{}' is not overrideable. The mixin option will be treated as not overrideable.", (Object)option2.getName(), (Object)option.getName());
                option2.setOverrideable(false);
            }
        }
    }

    void addOptionDependency(String string, String string2, boolean bl) {
        String string3 = CaffeineConfig.getMixinOptionName(string);
        Option option = this.options.get(string3);
        if (option == null) {
            throw new IllegalArgumentException(String.format("Option %s for dependency '%s depends on %s=%s' not found", string, string, string2, bl));
        }
        String string4 = CaffeineConfig.getMixinOptionName(string2);
        Option option2 = this.options.get(string4);
        if (option2 == null) {
            throw new IllegalArgumentException(String.format("Option %s for dependency '%s depends on %s=%s' not found", string2, string, string2, bl));
        }
        option.addDependency(option2, bl);
        this.optionsWithDependencies.add(option);
    }

    public String getModName() {
        return this.modName;
    }

    void addMixinOption(String string, boolean bl) {
        this.addMixinOption(string, bl, true);
    }

    public void addMixinOption(String string, boolean bl, boolean bl2) {
        String string2 = CaffeineConfig.getMixinOptionName(string);
        if (this.options.putIfAbsent(string2, new Option(string2, bl, false, bl2)) != null) {
            throw new IllegalStateException("Mixin option already defined: " + string);
        }
    }

    void readProperties(Properties properties) {
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            boolean bl;
            String string = (String)entry.getKey();
            String string2 = (String)entry.getValue();
            Option option = this.options.get(string);
            if (option == null) {
                this.logger.warn("No configuration key exists with name '{}', ignoring", (Object)string);
                continue;
            }
            if (!option.isOverrideable()) {
                this.logger.warn("User attempted to override option '{}' that is not overrideable, ignoring", (Object)string);
                continue;
            }
            if (string2.equalsIgnoreCase("true")) {
                bl = true;
            } else if (string2.equalsIgnoreCase("false")) {
                bl = false;
            } else {
                this.logger.warn("Invalid value '{}' encountered for configuration key '{}', ignoring", (Object)string2, (Object)string);
                continue;
            }
            option.setEnabled(bl, true);
        }
    }

    boolean applyDependencies() {
        boolean bl = false;
        for (Option option : this.optionsWithDependencies) {
            bl |= option.disableIfDependenciesNotMet(this.logger, this);
        }
        return bl;
    }

    public int getOptionCount() {
        return this.options.size();
    }

    private static String getMixinOptionName(String string) {
        return "mixin." + string;
    }

    void applyModOverride(String string, String string2, boolean bl) {
        Option option = this.options.get(string2);
        if (option == null) {
            this.logger.warn("Mod '{}' attempted to override option '{}', which doesn't exist, ignoring", (Object)string, (Object)string2);
            return;
        }
        if (!option.isOverrideable()) {
            this.logger.warn("Mod '{}' attempted to override option '{}' that is not overrideable, ignoring", (Object)string, (Object)string2);
            return;
        }
        if (!bl && option.isEnabled()) {
            option.clearModsDefiningValue();
        }
        if (!bl || option.isEnabled() || option.getDefiningMods().isEmpty()) {
            option.addModOverride(bl, string);
        }
    }

    static void writeDefaultConfig(Path path, String string, String string2) throws IOException {
        Path path2 = path.getParent();
        if (!Files.exists(path2, new LinkOption[0])) {
            Files.createDirectories(path2, new FileAttribute[0]);
        } else if (!Files.isDirectory(path2, new LinkOption[0])) {
            throw new IOException("The parent file is not a directory");
        }
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0]);){
            bufferedWriter.write(String.format("# This is the configuration file for %s.\n", string));
            bufferedWriter.write("# This file exists for debugging purposes and should not be configured otherwise.\n");
            bufferedWriter.write("#\n");
            if (string2 != null) {
                bufferedWriter.write("# You can find information on editing this file and all the available options here:\n");
                bufferedWriter.write("# " + string2 + "\n");
                bufferedWriter.write("#\n");
            }
            bufferedWriter.write("# By default, this file will be empty except for this notice.\n");
        }
    }
}

