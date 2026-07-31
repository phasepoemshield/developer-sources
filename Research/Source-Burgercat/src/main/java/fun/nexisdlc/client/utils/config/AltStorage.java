package fun.nexisdlc.client.utils.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.utils.player.AltSessionUtil;
import net.minecraft.client.MinecraftClient;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class AltStorage {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Type ALT_LIST_TYPE = new TypeToken<List<AltEntry>>() {}.getType();
    private static final Type STRING_SET_TYPE = new TypeToken<Set<String>>() {}.getType();
    private static final List<AltEntry> ALTS = new ArrayList<>();
    private static final Set<String> FAVORITES = new HashSet<>();
    private static String lastSelectedAlt;

    private AltStorage() {
    }

    static {
        load();
        loadFavorites();
        loadLastSelectedAlt();
    }

    public static List<AltEntry> getAlts() {
        synchronized (ALTS) {
            return new ArrayList<>(ALTS);
        }
    }

    public static boolean addAlt(String rawNickname) {
        String nickname = normalizeNickname(rawNickname);
        if (nickname == null) {
            return false;
        }
        synchronized (ALTS) {
            if (containsIgnoreCase(nickname)) {
                return false;
            }
            ALTS.add(new AltEntry(nickname, System.currentTimeMillis()));
            ALTS.sort(Comparator.comparingLong(AltEntry::getCreatedAt).reversed());
        }
        save();
        return true;
    }

    public static boolean removeAlt(String nickname) {
        if (nickname == null || nickname.isBlank()) {
            return false;
        }
        String normalized = normalizeNickname(nickname);
        if (normalized == null) {
            return false;
        }
        boolean removed;
        boolean clearSelected = false;
        synchronized (ALTS) {
            removed = ALTS.removeIf(entry -> entry.getName().equalsIgnoreCase(normalized));
            if (removed && lastSelectedAlt != null && lastSelectedAlt.equalsIgnoreCase(normalized)) {
                lastSelectedAlt = null;
                clearSelected = true;
            }
            if (removed) {
                FAVORITES.removeIf(fav -> fav.equalsIgnoreCase(normalized));
            }
        }
        if (removed) {
            save();
            saveFavorites();
            if (clearSelected) {
                saveLastSelectedAlt();
            }
        }
        return removed;
    }

    public static boolean containsIgnoreCase(String nickname) {
        if (nickname == null) {
            return false;
        }
        synchronized (ALTS) {
            return ALTS.stream().anyMatch(entry -> entry.getName().equalsIgnoreCase(nickname));
        }
    }

    public static String normalizeNickname(String rawNickname) {
        if (rawNickname == null) {
            return null;
        }
        String nickname = rawNickname.trim();
        if (nickname.isEmpty() || nickname.length() > 16) {
            return null;
        }
        for (int i = 0; i < nickname.length(); i++) {
            char c = nickname.charAt(i);
            boolean valid = (c >= 'a' && c <= 'z')
                    || (c >= 'A' && c <= 'Z')
                    || (c >= '0' && c <= '9')
                    || c == '_';
            if (!valid) {
                return null;
            }
        }
        return nickname;
    }

    public static void load() {
        synchronized (ALTS) {
            ALTS.clear();
            File file = getFile();
            if (!file.exists()) {
                return;
            }
            try (FileReader reader = new FileReader(file)) {
                List<AltEntry> loaded = GSON.fromJson(reader, ALT_LIST_TYPE);
                if (loaded != null) {
                    ALTS.addAll(loaded.stream().filter(entry -> normalizeNickname(entry.getName()) != null).toList());
                    ALTS.sort(Comparator.comparingLong(AltEntry::getCreatedAt).reversed());
                }
            } catch (IOException ignored) {
            }
        }
    }

    public static void save() {
        synchronized (ALTS) {
            File file = getFile();
            File parent = file.getParentFile();
            if (parent != null && !parent.exists()) {
                parent.mkdirs();
            }
            try (FileWriter writer = new FileWriter(file)) {
                GSON.toJson(ALTS, ALT_LIST_TYPE, writer);
            } catch (IOException ignored) {
            }
        }
    }

    public static boolean isFavorite(String rawNickname) {
        String nickname = normalizeNickname(rawNickname);
        if (nickname == null) {
            return false;
        }
        synchronized (ALTS) {
            return FAVORITES.stream().anyMatch(fav -> fav.equalsIgnoreCase(nickname));
        }
    }

    public static Set<String> getFavorites() {
        synchronized (ALTS) {
            return new HashSet<>(FAVORITES);
        }
    }

    public static boolean setFavorite(String rawNickname, boolean favorite) {
        String nickname = normalizeNickname(rawNickname);
        if (nickname == null) {
            return false;
        }
        synchronized (ALTS) {
            if (!containsIgnoreCase(nickname)) {
                return false;
            }
            if (favorite) {
                FAVORITES.removeIf(fav -> fav.equalsIgnoreCase(nickname));
                FAVORITES.add(nickname);
            } else {
                FAVORITES.removeIf(fav -> fav.equalsIgnoreCase(nickname));
            }
        }
        saveFavorites();
        return true;
    }

    public static boolean toggleFavorite(String rawNickname) {
        String nickname = normalizeNickname(rawNickname);
        if (nickname == null) {
            return false;
        }
        boolean newState;
        synchronized (ALTS) {
            if (!containsIgnoreCase(nickname)) {
                return false;
            }
            boolean current = FAVORITES.stream().anyMatch(fav -> fav.equalsIgnoreCase(nickname));
            if (current) {
                FAVORITES.removeIf(fav -> fav.equalsIgnoreCase(nickname));
                newState = false;
            } else {
                FAVORITES.removeIf(fav -> fav.equalsIgnoreCase(nickname));
                FAVORITES.add(nickname);
                newState = true;
            }
        }
        saveFavorites();
        return newState;
    }

    public static String getLastSelectedAlt() {
        synchronized (ALTS) {
            return lastSelectedAlt;
        }
    }

    public static boolean setLastSelectedAlt(String rawNickname) {
        String nickname = normalizeNickname(rawNickname);
        if (nickname == null) {
            return false;
        }

        synchronized (ALTS) {
            if (!containsIgnoreCase(nickname)) {
                return false;
            }
            lastSelectedAlt = nickname;
        }
        saveLastSelectedAlt();
        return true;
    }

    public static void clearLastSelectedAlt() {
        synchronized (ALTS) {
            lastSelectedAlt = null;
        }
        saveLastSelectedAlt();
    }

    public static boolean applyLastSelectedAltSession() {
        String nickname;
        synchronized (ALTS) {
            nickname = lastSelectedAlt;
        }
        if (nickname == null || nickname.isBlank()) {
            return false;
        }
        if (!containsIgnoreCase(nickname)) {
            clearLastSelectedAlt();
            return false;
        }
        return AltSessionUtil.applyOfflineSession(nickname);
    }

    private static void loadLastSelectedAlt() {
        File file = getSelectedAltFile();
        if (!file.exists()) {
            synchronized (ALTS) {
                lastSelectedAlt = null;
            }
            return;
        }

        try {
            String value = Files.readString(file.toPath(), StandardCharsets.UTF_8).trim();
            String normalized = normalizeNickname(value);
            synchronized (ALTS) {
                lastSelectedAlt = normalized;
            }
        } catch (IOException ignored) {
            synchronized (ALTS) {
                lastSelectedAlt = null;
            }
        }
    }

    private static void saveLastSelectedAlt() {
        File file = getSelectedAltFile();
        File parent = file.getParentFile();
        if (parent != null && !parent.exists()) {
            parent.mkdirs();
        }

        String value;
        synchronized (ALTS) {
            value = lastSelectedAlt;
        }

        try {
            if (value == null || value.isBlank()) {
                Files.deleteIfExists(file.toPath());
            } else {
                Files.writeString(file.toPath(), value, StandardCharsets.UTF_8);
            }
        } catch (IOException ignored) {
        }
    }

    private static void loadFavorites() {
        synchronized (ALTS) {
            FAVORITES.clear();
            File file = getFavoritesFile();
            if (!file.exists()) {
                return;
            }
            try (FileReader reader = new FileReader(file)) {
                Set<String> loaded = GSON.fromJson(reader, STRING_SET_TYPE);
                if (loaded != null) {
                    for (String nickname : loaded) {
                        String normalized = normalizeNickname(nickname);
                        if (normalized != null && containsIgnoreCase(normalized)) {
                            FAVORITES.add(normalized);
                        }
                    }
                }
            } catch (IOException ignored) {
            }
        }
    }

    private static void saveFavorites() {
        synchronized (ALTS) {
            File file = getFavoritesFile();
            File parent = file.getParentFile();
            if (parent != null && !parent.exists()) {
                parent.mkdirs();
            }
            try (FileWriter writer = new FileWriter(file)) {
                GSON.toJson(FAVORITES, STRING_SET_TYPE, writer);
            } catch (IOException ignored) {
            }
        }
    }

    private static File getFile() {
        File directory = new File(MinecraftClient.getInstance().runDirectory, ClientContainer.getName());
        return new File(directory, "alts.json");
    }

    private static File getSelectedAltFile() {
        File directory = new File(MinecraftClient.getInstance().runDirectory, ClientContainer.getName());
        return new File(directory, "selected_alt.txt");
    }

    private static File getFavoritesFile() {
        File directory = new File(MinecraftClient.getInstance().runDirectory, ClientContainer.getName());
        return new File(directory, "favorite_alts.json");
    }

    public static final class AltEntry {
        private String name;
        private long createdAt;

        public AltEntry(String name, long createdAt) {
            this.name = name;
            this.createdAt = createdAt;
        }

        public String getName() {
            return name;
        }

        public long getCreatedAt() {
            return createdAt;
        }
    }
}
