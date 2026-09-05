/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.snakeyaml.DumperOptions
 *  com.viaversion.viaversion.libs.snakeyaml.DumperOptions$FlowStyle
 *  com.viaversion.viaversion.libs.snakeyaml.LoaderOptions
 *  com.viaversion.viaversion.libs.snakeyaml.Yaml
 *  com.viaversion.viaversion.libs.snakeyaml.constructor.BaseConstructor
 *  com.viaversion.viaversion.libs.snakeyaml.constructor.SafeConstructor
 *  com.viaversion.viaversion.libs.snakeyaml.constructor.SafeConstructor$ConstructYamlMap
 *  com.viaversion.viaversion.libs.snakeyaml.constructor.SafeConstructor$ConstructYamlOmap
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.NodeId
 *  com.viaversion.viaversion.libs.snakeyaml.nodes.Tag
 *  com.viaversion.viaversion.libs.snakeyaml.representer.Representer
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.util;

import com.viaversion.viaversion.libs.snakeyaml.DumperOptions;
import com.viaversion.viaversion.libs.snakeyaml.LoaderOptions;
import com.viaversion.viaversion.libs.snakeyaml.Yaml;
import com.viaversion.viaversion.libs.snakeyaml.constructor.BaseConstructor;
import com.viaversion.viaversion.libs.snakeyaml.constructor.SafeConstructor;
import com.viaversion.viaversion.libs.snakeyaml.nodes.NodeId;
import com.viaversion.viaversion.libs.snakeyaml.nodes.Tag;
import com.viaversion.viaversion.libs.snakeyaml.representer.Representer;
import com.viaversion.viaversion.util.CommentStore;
import com.viaversion.viaversion.util.ConfigSection;
import com.viaversion.viaversion.util.InputStreamSupplier;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;

public abstract class Config
extends ConfigSection {
    private static final ThreadLocal<Yaml> YAML = ThreadLocal.withInitial(() -> {
        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        options.setPrettyFlow(false);
        options.setSplitLines(false);
        options.setIndent(2);
        return new Yaml((BaseConstructor)new CustomSafeConstructor(), new Representer(options), options);
    });
    private final CommentStore commentStore = new CommentStore('.', 2);
    private final File configFile;
    protected final Logger logger;
    private ConfigSection originalRoot;

    protected Config(File configFile, Logger logger) {
        super(null, "");
        this.configFile = configFile;
        this.logger = logger;
    }

    public URL getDefaultConfigURL() {
        return this.getClass().getClassLoader().getResource("assets/viaversion/config.yml");
    }

    public InputStream getDefaultConfigInputStream() {
        return this.getClass().getClassLoader().getResourceAsStream("assets/viaversion/config.yml");
    }

    public Map<String, Object> loadConfig(File location) {
        URL defaultConfigUrl = this.getDefaultConfigURL();
        if (defaultConfigUrl != null) {
            return this.loadConfig(location, defaultConfigUrl);
        }
        return this.loadConfig(location, this::getDefaultConfigInputStream);
    }

    public synchronized Map<String, Object> loadConfig(File location, URL jarConfigFile) {
        return this.loadConfig(location, jarConfigFile::openStream);
    }

    private synchronized Map<String, Object> loadConfig(File location, InputStreamSupplier configSupplier) {
        Map mergedConfig;
        this.originalRoot = null;
        List<String> unsupported = this.getUnsupportedOptions();
        try (InputStream inputStream = configSupplier.get();){
            this.commentStore.storeComments(inputStream);
            for (String option : unsupported) {
                List<String> comments = this.commentStore.header(option);
                if (comments == null) continue;
                comments.clear();
            }
        }
        catch (IOException e) {
            throw new RuntimeException("Failed to load default config comments", e);
        }
        Map existingConfig = null;
        if (location.exists()) {
            try (FileInputStream input = new FileInputStream(location);){
                existingConfig = (Map)YAML.get().load((InputStream)input);
            }
            catch (IOException e) {
                throw new RuntimeException("Failed to load config", e);
            }
            catch (Exception e) {
                this.logger.severe("Failed to load config, make sure your input is valid");
                throw new RuntimeException("Failed to load config (malformed input?)", e);
            }
        }
        try (InputStream stream = configSupplier.get();){
            mergedConfig = (Map)YAML.get().load(stream);
        }
        catch (IOException e) {
            throw new RuntimeException("Failed to load default config", e);
        }
        for (String option : unsupported) {
            mergedConfig.remove(option);
        }
        if (existingConfig != null) {
            this.merge(null, existingConfig, mergedConfig);
        }
        this.handleConfig(mergedConfig);
        ConfigSection configSection = this.originalRoot = existingConfig != null ? new ConfigSection(this, "", existingConfig) : null;
        if (!mergedConfig.equals(existingConfig)) {
            this.save(location, mergedConfig);
        }
        return mergedConfig;
    }

    private void merge(@Nullable String currentSectionKey, Map<String, Object> loadedConfig, Map<String, Object> mergedConfig) {
        for (Map.Entry<String, Object> entry : loadedConfig.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                Map mapValue = (Map)value;
                Object object = mergedConfig.get(key);
                if (object instanceof Map) {
                    Map mergedMapValue = (Map)object;
                    this.merge(key, mapValue, mergedMapValue);
                    continue;
                }
            }
            if (currentSectionKey != null && this.getSectionsWithModifiableKeys().contains(currentSectionKey)) {
                mergedConfig.put(key, value);
                continue;
            }
            mergedConfig.computeIfPresent(key, (k, v) -> value);
        }
    }

    protected void handleConfig(Map<String, Object> config) {
    }

    public synchronized void save(File location, Map<String, Object> config) {
        try {
            this.commentStore.writeComments(YAML.get().dump(config), location);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getUnsupportedOptions() {
        return List.of();
    }

    public Set<String> getSectionsWithModifiableKeys() {
        return Set.of();
    }

    public void save() {
        if (this.configFile.getParentFile() != null) {
            this.configFile.getParentFile().mkdirs();
        }
        this.save(this.configFile, this.values);
    }

    public void save(File file) {
        this.save(file, this.values);
    }

    public void reload() {
        if (this.configFile.getParentFile() != null) {
            this.configFile.getParentFile().mkdirs();
        }
        this.values = Collections.synchronizedMap(this.loadConfig(this.configFile));
    }

    @Override
    public Config root() {
        return this;
    }

    @Override
    public Logger logger() {
        return this.logger;
    }

    public @Nullable ConfigSection originalRootSection() {
        return this.originalRoot;
    }

    private static final class CustomSafeConstructor
    extends SafeConstructor {
        public CustomSafeConstructor() {
            super(new LoaderOptions());
            this.yamlClassConstructors.put(NodeId.mapping, new SafeConstructor.ConstructYamlMap((SafeConstructor)this));
            this.yamlConstructors.put(Tag.OMAP, new SafeConstructor.ConstructYamlOmap((SafeConstructor)this));
        }
    }
}

