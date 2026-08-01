package fun.nexisdlc.client.utils.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

public class BlockEspStorage {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Type STRING_LIST_TYPE = new TypeToken<List<String>>() {}.getType();
    private static final BlockEspStorage INSTANCE = new BlockEspStorage();

    private final File file;
    private final Set<Identifier> blockIds = new HashSet<>();
    private volatile Set<Block> cachedBlocks = Collections.emptySet();

    public static BlockEspStorage getInstance() {
        return INSTANCE;
    }

    private BlockEspStorage() {
        File dir = new File(mc.runDirectory, "nexis/files");
        this.file = new File(dir, "blockesp.json");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        load();
        rebuildCache();
    }

    public synchronized boolean add(String rawId) {
        Identifier id = normalize(rawId);
        if (id == null || !Registries.BLOCK.containsId(id)) {
            return false;
        }
        boolean changed = blockIds.add(id);
        if (changed) {
            rebuildCache();
            save();
        }
        return changed;
    }

    public synchronized boolean remove(String rawId) {
        Identifier id = normalize(rawId);
        if (id == null) {
            return false;
        }
        boolean changed = blockIds.remove(id);
        if (changed) {
            rebuildCache();
            save();
        }
        return changed;
    }

    public synchronized void clear() {
        blockIds.clear();
        rebuildCache();
        save();
    }

    public synchronized boolean exists(String rawId) {
        Identifier id = normalize(rawId);
        return id != null && blockIds.contains(id);
    }

    public synchronized List<String> getBlockIds() {
        List<String> ids = new ArrayList<>();
        for (Identifier id : blockIds) {
            ids.add(id.toString());
        }
        ids.sort(String.CASE_INSENSITIVE_ORDER);
        return ids;
    }

    public Set<Block> getBlocks() {
        return cachedBlocks;
    }

    public boolean isEmpty() {
        return cachedBlocks.isEmpty();
    }

    public static Identifier normalize(String rawId) {
        if (rawId == null) {
            return null;
        }
        String value = rawId.trim().toLowerCase(Locale.US);
        if (value.isEmpty()) {
            return null;
        }
        if (!value.contains(":")) {
            value = "minecraft:" + value;
        }
        try {
            return Identifier.of(value);
        } catch (Exception ignored) {
            return null;
        }
    }

    public static StreamLike streamBlockIds(String filter) {
        String lower = filter == null ? "" : filter.toLowerCase(Locale.US);
        List<String> ids = new ArrayList<>();
        for (Identifier id : Registries.BLOCK.getIds()) {
            String value = id.toString();
            if (lower.isEmpty() || value.toLowerCase(Locale.US).contains(lower)) {
                ids.add(value);
            }
        }
        ids.sort(String.CASE_INSENSITIVE_ORDER);
        return new StreamLike(ids);
    }

    private void rebuildCache() {
        Set<Block> blocks = new HashSet<>();
        for (Identifier id : blockIds) {
            if (Registries.BLOCK.containsId(id)) {
                blocks.add(Registries.BLOCK.get(id));
            }
        }
        cachedBlocks = Collections.unmodifiableSet(blocks);
    }

    private synchronized void save() {
        try (Writer writer = new FileWriter(file)) {
            GSON.toJson(getBlockIds(), STRING_LIST_TYPE, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private synchronized void load() {
        if (!file.exists()) {
            return;
        }
        try (Reader reader = new FileReader(file)) {
            List<String> loaded = GSON.fromJson(reader, STRING_LIST_TYPE);
            if (loaded == null) {
                return;
            }
            blockIds.clear();
            for (String raw : loaded) {
                Identifier id = normalize(raw);
                if (id != null && Registries.BLOCK.containsId(id)) {
                    blockIds.add(id);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static final class StreamLike {
        private final List<String> values;

        private StreamLike(List<String> values) {
            this.values = values;
        }

        public List<String> limit(int max) {
            if (max >= values.size()) {
                return values;
            }
            return values.subList(0, Math.max(0, max));
        }
    }
}
