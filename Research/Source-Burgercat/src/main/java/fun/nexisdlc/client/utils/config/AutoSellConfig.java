package fun.nexisdlc.client.utils.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import fun.nexisdlc.client.utils.client.IMinecraft;
import lombok.Getter;
import net.minecraft.client.MinecraftClient;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AutoSellConfig implements IMinecraft {
    private final File file;
    private final List<String> items = new ArrayList<>();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Type LIST_TYPE = new TypeToken<List<String>>() {}.getType();

    public AutoSellConfig() {
        this.file = new File(new File(MinecraftClient.getInstance().runDirectory, "nexis/files"), "autosell.json");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        load();
    }

    public void add(String itemId) {
        if (itemId == null || itemId.trim().isEmpty()) return;
        String trimmed = itemId.trim();
        if (items.stream().noneMatch(s -> s.equalsIgnoreCase(trimmed))) {
            items.add(trimmed);
            save();
        }
    }

    public void remove(String itemId) {
        if (itemId != null) {
            items.removeIf(s -> s.equalsIgnoreCase(itemId.trim()));
            save();
        }
    }

    public void clear() {
        items.clear();
        save();
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public boolean contains(String itemId) {
        if (itemId == null) return false;
        return items.stream().anyMatch(s -> s.equalsIgnoreCase(itemId.trim()));
    }

    private void save() {
        try (Writer writer = new FileWriter(file)) {
            GSON.toJson(items, LIST_TYPE, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void load() {
        if (!file.exists()) return;

        try (Reader reader = new FileReader(file)) {
            List<String> loaded = GSON.fromJson(reader, LIST_TYPE);
            if (loaded != null) {
                items.clear();
                items.addAll(loaded);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
