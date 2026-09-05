/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder;

import de.maxhenkel.voicechat.configbuilder.CommentedProperties;
import de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig$Builder;
import de.maxhenkel.voicechat.configbuilder.Config;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

public class CommentedPropertyConfig
implements Config {
    private static final Logger LOGGER = Logger.getLogger(CommentedPropertyConfig.class.getName());
    private static final ExecutorService SAVE_EXECUTOR_SERVICE = Executors.newSingleThreadExecutor(runnable -> {
        Thread thread = new Thread(runnable);
        thread.setName("ConfigSaver");
        thread.setDaemon(true);
        return thread;
    });
    protected CommentedProperties properties;
    @Nullable
    protected Path path;

    public void reload() {
        this.properties.clear();
        try {
            this.load();
        }
        catch (IOException iOException) {
            LOGGER.log(Level.SEVERE, "Failed to reload config", iOException);
        }
    }

    public boolean has(String string) {
        return this.properties.containsKey(string);
    }

    public CommentedPropertyConfig(CommentedProperties commentedProperties) {
        this.properties = commentedProperties;
    }

    public String get(String string) {
        return this.properties.get(string);
    }

    public void load() throws IOException {
        if (this.path == null) {
            return;
        }
        if (Files.exists(this.path, new LinkOption[0])) {
            try (InputStream inputStream = Files.newInputStream(this.path, new OpenOption[0]);){
                this.properties.load(inputStream);
            }
        }
    }

    public static CommentedPropertyConfig$Builder builder() {
        return new CommentedPropertyConfig$Builder(null);
    }

    public void set(String string, String string2, String ... stringArray) {
        this.properties.set(string, string2, stringArray);
    }

    public CommentedProperties getProperties() {
        return this.properties;
    }

    public void save() {
        if (this.path == null) {
            return;
        }
        SAVE_EXECUTOR_SERVICE.execute(this::saveSync);
    }

    @Override
    public Map<String, String> getEntries() {
        return Collections.unmodifiableMap(this.properties);
    }

    public synchronized void saveSync() {
        if (this.path == null) {
            return;
        }
        try {
            Files.createDirectories(this.path.getParent(), new FileAttribute[0]);
        }
        catch (Exception exception) {
            LOGGER.log(Level.SEVERE, "Failed to create parent directories of config", exception);
        }
        try (OutputStream outputStream = Files.newOutputStream(this.path, StandardOpenOption.CREATE, StandardOpenOption.SYNC, StandardOpenOption.TRUNCATE_EXISTING);){
            this.properties.save(outputStream);
        }
        catch (Exception exception) {
            LOGGER.log(Level.SEVERE, "Failed to save config", exception);
        }
    }
}

