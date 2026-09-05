/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.FieldNamingPolicy
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation
 *  net.caffeinemc.mods.sodium.client.util.FileUtil
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.gui;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import net.caffeinemc.mods.sodium.client.gui.SodiumOptions$AdvancedSettings;
import net.caffeinemc.mods.sodium.client.gui.SodiumOptions$DebugSettings;
import net.caffeinemc.mods.sodium.client.gui.SodiumOptions$NotificationSettings;
import net.caffeinemc.mods.sodium.client.gui.SodiumOptions$PerformanceSettings;
import net.caffeinemc.mods.sodium.client.gui.SodiumOptions$QualitySettings;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import net.caffeinemc.mods.sodium.client.util.FileUtil;
import org.jspecify.annotations.NonNull;

public class SodiumOptions {
    private static final String DEFAULT_FILE_NAME = "sodium-options.json";
    public final SodiumOptions$QualitySettings quality = new SodiumOptions$QualitySettings();
    public final SodiumOptions$PerformanceSettings performance = new SodiumOptions$PerformanceSettings();
    public final SodiumOptions$AdvancedSettings advanced = new SodiumOptions$AdvancedSettings();
    public @NonNull SodiumOptions$DebugSettings debug = new SodiumOptions$DebugSettings();
    public final SodiumOptions$NotificationSettings notifications = new SodiumOptions$NotificationSettings();
    private boolean readOnly;
    private static final Gson GSON = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().excludeFieldsWithModifiers(new int[]{2}).create();

    private SodiumOptions() {
    }

    public void setReadOnly() {
        this.readOnly = true;
    }

    public static SodiumOptions defaults() {
        return new SodiumOptions();
    }

    public boolean isReadOnly() {
        return this.readOnly;
    }

    public static void writeToDisk(SodiumOptions sodiumOptions) throws IOException {
        if (sodiumOptions.isReadOnly()) {
            throw new IOException("Config file is read-only");
        }
        Path path = SodiumOptions.getConfigPath();
        Path path2 = path.getParent();
        if (!Files.exists(path2, new LinkOption[0])) {
            Files.createDirectories(path2, new FileAttribute[0]);
        } else if (!Files.isDirectory(path2, new LinkOption[0])) {
            throw new IOException("Not a directory: " + String.valueOf(path2));
        }
        FileUtil.writeTextRobustly((String)GSON.toJson((Object)sodiumOptions), (Path)path);
    }

    public static SodiumOptions loadFromDisk() {
        SodiumOptions sodiumOptions;
        block10: {
            Path path = SodiumOptions.getConfigPath();
            if (Files.exists(path, new LinkOption[0])) {
                try (FileReader fileReader = new FileReader(path.toFile());){
                    sodiumOptions = (SodiumOptions)GSON.fromJson((Reader)fileReader, SodiumOptions.class);
                    break block10;
                }
                catch (IOException iOException) {
                    throw new RuntimeException("Could not parse config", iOException);
                }
            }
            sodiumOptions = new SodiumOptions();
        }
        try {
            SodiumOptions.writeToDisk(sodiumOptions);
        }
        catch (IOException iOException) {
            throw new RuntimeException("Couldn't update config file", iOException);
        }
        return sodiumOptions;
    }

    private static Path getConfigPath() {
        return PlatformRuntimeInformation.getInstance().getConfigDirectory().resolve(DEFAULT_FILE_NAME);
    }
}

