/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  net.fabricmc.loader.api.FabricLoader
 */
package jerozgen.languagereload.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Collections;
import java.util.LinkedList;
import jerozgen.languagereload.LanguageReload;
import net.fabricmc.loader.api.FabricLoader;

public class Config {
    private static Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static Path PATH = FabricLoader.getInstance().getConfigDir().resolve("languagereload.json");
    private static Config INSTANCE;
    public int version = 0;
    public boolean multilingualItemSearch = true;
    public boolean removableDefaultLanguage = false;
    public LinkedList<String> fallbacks = new LinkedList();
    public LinkedList<String> previousFallbacks = new LinkedList();
    public String language = "";
    public String previousLanguage = "";

    private Config() {
    }

    public static void load() {
        if (Files.notExists(PATH, new LinkOption[0])) {
            INSTANCE = new Config();
            Config.save();
        } else {
            try {
                INSTANCE = (Config)GSON.fromJson(Files.readString(PATH), Config.class);
            }
            catch (Exception exception) {
                INSTANCE = new Config();
                LanguageReload.LOGGER.error("Couldn't load config file: ", (Throwable)exception);
            }
        }
        Config.migrateToVersion1();
        if (Config.INSTANCE.language.equals("*") && !Config.INSTANCE.fallbacks.isEmpty()) {
            Config.INSTANCE.language = Config.INSTANCE.fallbacks.pollFirst();
        }
        if (Config.INSTANCE.previousLanguage.equals("*") && !Config.INSTANCE.previousFallbacks.isEmpty()) {
            Config.INSTANCE.previousLanguage = Config.INSTANCE.previousFallbacks.pollFirst();
        }
    }

    public static Config getInstance() {
        if (INSTANCE == null) {
            Config.load();
        }
        return INSTANCE;
    }

    public static void save() {
        if (INSTANCE == null) {
            return;
        }
        try {
            Files.write(PATH, Collections.singleton(GSON.toJson((Object)INSTANCE)), new OpenOption[0]);
        }
        catch (Exception exception) {
            LanguageReload.LOGGER.error("Couldn't save config file: ", (Throwable)exception);
        }
    }

    private static void migrateToVersion1() {
        if (Config.INSTANCE.version >= 1) {
            return;
        }
        Config.INSTANCE.version = 1;
        if (!(Config.INSTANCE.language.isEmpty() || Config.INSTANCE.language.equals("en_us") || Config.INSTANCE.fallbacks.contains("en_us"))) {
            Config.INSTANCE.fallbacks.add("en_us");
        }
        if (!(Config.INSTANCE.previousLanguage.isEmpty() || Config.INSTANCE.previousLanguage.equals("en_us") || Config.INSTANCE.previousFallbacks.contains("en_us"))) {
            Config.INSTANCE.previousFallbacks.add("en_us");
        }
        Config.save();
    }
}

