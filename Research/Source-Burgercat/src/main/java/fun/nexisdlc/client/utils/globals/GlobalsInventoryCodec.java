package fun.nexisdlc.client.utils.globals;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import ru.sterford.annotations.NativeCall;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class GlobalsInventoryCodec {
    public static final int MIN_SLOT = 0;
    public static final int MAX_SLOT = 35;

    private GlobalsInventoryCodec() {
    }

    public static JsonArray toJson(List<GlobalsInventoryItem> items) {
        JsonArray array = new JsonArray();
        if (items == null || items.isEmpty()) {
            return array;
        }

        items.stream()
                .filter(item -> item != null && isValidSlot(item.slot()) && item.itemId() != null && !item.itemId().isBlank())
                .sorted(Comparator.comparingInt(GlobalsInventoryItem::slot))
                .forEach(item -> {
                    JsonObject json = new JsonObject();
                    json.addProperty("slot", item.slot());
                    json.addProperty("item_id", item.itemId());
                    if (item.cooldownSeconds() > 0f) {
                        json.addProperty("cooldown_seconds", item.cooldownSeconds());
                    }
                    array.add(json);
                });
        return array;
    }

    @NativeCall
    public static List<GlobalsInventoryItem> parseInventory(JsonElement element) {
        JsonArray array = unwrapArray(element);
        if (array == null || array.isEmpty()) {
            return List.of();
        }

        Map<Integer, GlobalsInventoryItem> bySlot = new LinkedHashMap<>();
        for (JsonElement itemElement : array) {
            if (itemElement == null || !itemElement.isJsonObject()) {
                continue;
            }
            JsonObject item = itemElement.getAsJsonObject();
            int slot = getInt(item, "slot", -1);
            String itemId = getString(item, "item_id");
            if (itemId.isBlank()) {
                itemId = getString(item, "id");
            }
            if (!isValidSlot(slot) || itemId.isBlank()) {
                continue;
            }
            float cooldownSeconds = Math.max(0f, getFloat(item, "cooldown_seconds", 0f));
            bySlot.put(slot, new GlobalsInventoryItem(slot, itemId, cooldownSeconds));
        }

        List<GlobalsInventoryItem> result = new ArrayList<>(bySlot.values());
        result.sort(Comparator.comparingInt(GlobalsInventoryItem::slot));
        return List.copyOf(result);
    }

    public static boolean isValidSlot(int slot) {
        return slot >= MIN_SLOT && slot <= MAX_SLOT;
    }

    @NativeCall
    private static JsonArray unwrapArray(JsonElement element) {
        if (element == null || element.isJsonNull()) {
            return null;
        }
        if (element.isJsonArray()) {
            return element.getAsJsonArray();
        }
        if (!element.isJsonObject()) {
            return null;
        }
        JsonObject object = element.getAsJsonObject();
        if (object.has("items") && object.get("items").isJsonArray()) {
            return object.getAsJsonArray("items");
        }
        if (object.has("inventory") && object.get("inventory").isJsonArray()) {
            return object.getAsJsonArray("inventory");
        }
        return null;
    }

    private static String getString(JsonObject json, String key) {
        try {
            return json.has(key) && !json.get(key).isJsonNull() ? json.get(key).getAsString() : "";
        } catch (RuntimeException ignored) {
            return "";
        }
    }

    private static int getInt(JsonObject json, String key, int fallback) {
        try {
            return json.has(key) && !json.get(key).isJsonNull() ? json.get(key).getAsInt() : fallback;
        } catch (RuntimeException ignored) {
            return fallback;
        }
    }

    private static float getFloat(JsonObject json, String key, float fallback) {
        try {
            return json.has(key) && !json.get(key).isJsonNull() ? json.get(key).getAsFloat() : fallback;
        } catch (RuntimeException ignored) {
            return fallback;
        }
    }
}
