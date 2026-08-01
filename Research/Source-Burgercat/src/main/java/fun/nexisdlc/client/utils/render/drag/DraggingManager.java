package fun.nexisdlc.client.utils.render.drag;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.drag.api.GridLine;
import fun.nexisdlc.modules.impl.render.Interface;
import net.minecraft.client.MinecraftClient;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static java.io.File.separator;

public class DraggingManager implements IMinecraft {

    public static final Logger logger = Logger.getLogger(DraggingManager.class.getName());
    public static LinkedHashMap<String, Dragging> draggables = new LinkedHashMap<>();
    public static LinkedHashMap<String, LinkedHashMap<String, Boolean>> hudSettings = new LinkedHashMap<>();
    public static LinkedHashMap<String, LinkedHashMap<String, String>> hudModeSettings = new LinkedHashMap<>();
    public static LinkedHashMap<String, LinkedHashMap<String, Float>> hudFloatSettings = new LinkedHashMap<>();
    private static final Map<String, float[]> pendingPositions = new ConcurrentHashMap<>();
    private static List<GridLine> activeGridLines = List.of();
    private static final int MAX_UNDO_DEPTH = 64;
    private static final Deque<PositionSnapshot> undoStack = new ArrayDeque<>(MAX_UNDO_DEPTH);

    private static final File DRAG_DATA = new File(MinecraftClient.getInstance().runDirectory, ClientContainer.getName() + separator + "files" + separator + "draggable.json");
    private static final File DRAG_DATA_BACKUP = new File(DRAG_DATA.getParentFile(), DRAG_DATA.getName() + ".bak");
    private static final File DRAG_DATA_TEMP = new File(DRAG_DATA.getParentFile(), DRAG_DATA.getName() + ".tmp");
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static boolean applyingData = false;
    private static boolean dirty = false;
    private static boolean loaded = false;
    private static final ScheduledExecutorService autosaver = Executors.newSingleThreadScheduledExecutor(r -> {
        Thread t = new Thread(r, "Nexis-Dragging-Autosave");
        t.setDaemon(true);
        return t;
    });

    static {
        autosaver.scheduleAtFixedRate(DraggingManager::flushDirty, 1, 1, TimeUnit.MINUTES);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            autosaver.shutdownNow();
            if (dirty) {
                saveNow();
            }
        }, "Nexis-Dragging-Save"));
    }

    public static synchronized void save() {
        if (!loaded) return;
        if (applyingData) return;
        dirty = true;
    }

    public static synchronized void saveNow() {
        try {
            Files.createDirectories(DRAG_DATA.toPath().getParent());
            JsonObject root = new JsonObject();
            root.add("version", new com.google.gson.JsonPrimitive(2));
            root.add("draggables", writeDraggableSections());
            root.add("hudSettings", writeBooleanSections(hudSettings));
            root.add("hudModeSettings", writeStringSections(hudModeSettings));
            root.add("hudFloatSettings", writeFloatSections(hudFloatSettings));
            writeAtomically(DRAG_DATA.toPath(), DRAG_DATA_TEMP.toPath(), DRAG_DATA_BACKUP.toPath(), GSON.toJson(root));
            dirty = false;
        } catch (IOException ex) {
            Nexis.LOGGER.warn("[DraggingManager] I/O error during saveNow", ex);
        }
    }

    public static synchronized void load() {
        if (!DRAG_DATA.exists()) {
            DRAG_DATA.getParentFile().mkdirs();
            loaded = true;
            return;
        }

        try {
            JsonElement parsed = readSavedJson();
            if (parsed == null) {
                loaded = true;
                return;
            }

            if (parsed.isJsonArray()) {
                applyOldFormat(parsed.getAsJsonArray());
                loaded = true;
                saveNow();
                return;
            }

            if (!parsed.isJsonObject()) {
                loaded = true;
                return;
            }

            JsonObject root = parsed.getAsJsonObject();
            JsonArray draggablesArray = root.getAsJsonArray("draggables");
            if (draggablesArray != null) {
                applyDraggingData(draggablesArray);
            }

            hudSettings.clear();
            hudModeSettings.clear();
            hudFloatSettings.clear();
            readBooleanSections(root.get("hudSettings"), hudSettings);
            readStringSections(root.get("hudModeSettings"), hudModeSettings);
            readFloatSections(root.get("hudFloatSettings"), hudFloatSettings);

            loaded = true;
            dirty = false;
        } catch (IOException | RuntimeException ex) {
            Nexis.LOGGER.warn("[DraggingManager] I/O error during load", ex);
            loaded = true;
        }
    }

    public static synchronized void markDirty() {
        if (applyingData || !loaded) return;
        dirty = true;
    }

    public static synchronized void flushDirty() {
        if (dirty) {
            saveNow();
        }
    }

    public static synchronized boolean isApplyingData() {
        return applyingData;
    }

    public static List<GridLine> getActiveGridLines() {
        return activeGridLines;
    }

    public static void clearActiveGridLines() {
        activeGridLines = List.of();
    }

    public static void pushUndoSnapshot(String name, float x, float y) {
        if (name == null) return;
        undoStack.addLast(new PositionSnapshot(name, x, y));
        while (undoStack.size() > MAX_UNDO_DEPTH) {
            undoStack.removeFirst();
        }
    }

    public static boolean undo() {
        if (undoStack.isEmpty()) return false;
        PositionSnapshot snapshot = undoStack.removeLast();
        Dragging dragging = draggables.get(snapshot.name);
        if (dragging == null) return false;
        applyingData = true;
        try {
            dragging.setX(snapshot.x);
            dragging.setY(snapshot.y);
        } finally {
            applyingData = false;
        }
        saveNow();
        return true;
    }

    public static Dragging getActiveDragging() {
        for (Dragging dragging : draggables.values()) {
            if (dragging != null && dragging.isDragging()) {
                return dragging;
            }
        }
        return null;
    }

    public static Dragging getHoveredDragging(double mouseX, double mouseY) {
        for (Dragging dragging : draggables.values()) {
            if (dragging == null || dragging.getModule() == null || !dragging.getModule().isState()) continue;
            if (dragging.getWidth() <= 0 || dragging.getHeight() <= 0) continue;
            if (fun.nexisdlc.client.utils.math.MathUtil.isHovered(mouseX, mouseY, dragging.getX(), dragging.getY(), dragging.getWidth(), dragging.getHeight())) {
                return dragging;
            }
        }
        return null;
    }

    private record PositionSnapshot(String name, float x, float y) {
    }

    public static boolean getHudBoolean(String scope, String key, boolean defaultValue) {
        LinkedHashMap<String, Boolean> section = hudSettings.get(scope);
        if (section == null) return defaultValue;
        return section.getOrDefault(key, defaultValue);
    }

    public static void setHudBoolean(String scope, String key, boolean value) {
        hudSettings.computeIfAbsent(scope, k -> new LinkedHashMap<>()).put(key, value);
        save();
    }

    public static String getHudMode(String scope, String key, String defaultValue) {
        LinkedHashMap<String, String> section = hudModeSettings.get(scope);
        if (section == null) return defaultValue;
        String value = section.get(key);
        return value == null || value.isBlank() ? defaultValue : value;
    }

    public static void setHudMode(String scope, String key, String value) {
        if (value == null || value.isBlank()) {
            LinkedHashMap<String, String> section = hudModeSettings.get(scope);
            if (section != null) {
                section.remove(key);
                if (section.isEmpty()) hudModeSettings.remove(scope);
            }
        } else {
            hudModeSettings.computeIfAbsent(scope, k -> new LinkedHashMap<>()).put(key, value);
        }
        save();
    }

    public static float getHudFloat(String scope, String key, float defaultValue) {
        LinkedHashMap<String, Float> section = hudFloatSettings.get(scope);
        if (section == null) return defaultValue;
        Float value = section.get(key);
        return value == null || !Float.isFinite(value) ? defaultValue : value;
    }

    public static void setHudFloat(String scope, String key, float value) {
        if (!Float.isFinite(value)) return;
        hudFloatSettings.computeIfAbsent(scope, k -> new LinkedHashMap<>()).put(key, value);
        save();
    }

    private static void applyDraggingData(JsonArray array) {
        if (array == null) return;
        for (JsonElement elem : array) {
            if (elem == null || !elem.isJsonObject()) continue;
            JsonObject obj = elem.getAsJsonObject();
            String name = getString(obj, "name");
            if (name == null || name.isBlank()) continue;

            float x = getFloat(obj, "x", 10f);
            float y = getFloat(obj, "y", 10f);

            Dragging currentDrag = draggables.get(name);
            if (currentDrag == null) {
                pendingPositions.put(name, new float[]{x, y});
            } else {
                applyingData = true;
                try {
                    currentDrag.setX(x);
                    currentDrag.setY(y);
                } finally {
                    applyingData = false;
                }
                pendingPositions.remove(name);
            }
        }
    }

    private static void applyOldFormat(JsonArray array) {
        for (JsonElement elem : array) {
            if (elem == null || !elem.isJsonObject()) continue;
            JsonObject obj = elem.getAsJsonObject();
            String name = getString(obj, "name");
            if (name == null || name.isBlank()) continue;

            float x = getFloat(obj, "x", 10f);
            float y = getFloat(obj, "y", 10f);

            Dragging currentDrag = draggables.get(name);
            if (currentDrag == null) {
                pendingPositions.put(name, new float[]{x, y});
            } else {
                applyingData = true;
                try {
                    currentDrag.setX(x);
                    currentDrag.setY(y);
                } finally {
                    applyingData = false;
                }
                pendingPositions.remove(name);
            }
        }
    }

    public static Dragging registerDragging(Dragging dragging) {
        if (dragging == null) return null;
        float[] pending = pendingPositions.remove(dragging.getName());
        if (pending != null && pending.length >= 2) {
            applyingData = true;
            try {
                dragging.setX(pending[0]);
                dragging.setY(pending[1]);
            } finally {
                applyingData = false;
            }
        }
        draggables.put(dragging.getName(), dragging);
        return dragging;
    }

    private static JsonElement readSavedJson() throws IOException {
        JsonElement parsed = tryReadJson(DRAG_DATA.toPath());
        if (parsed != null) return parsed;
        parsed = tryReadJson(DRAG_DATA_BACKUP.toPath());
        if (parsed != null) {
            logger.warning("Restored HUD layout from draggable.json.bak");
            return parsed;
        }
        return null;
    }

    private static JsonElement tryReadJson(Path path) throws IOException {
        if (!Files.exists(path) || Files.size(path) <= 0) return null;
        try {
            String content = Files.readString(path, StandardCharsets.UTF_8);
            if (content == null || content.isBlank()) return null;
            return JsonParser.parseString(content);
        } catch (RuntimeException ex) {
            logger.warning("Failed to read HUD layout file " + path + ": " + ex.getMessage());
            return null;
        }
    }

    private static void writeAtomically(Path target, Path temp, Path backup, String content) throws IOException {
        Files.writeString(temp, content, StandardCharsets.UTF_8);
        if (Files.exists(target) && Files.size(target) > 0) {
            Files.copy(target, backup, StandardCopyOption.REPLACE_EXISTING);
        }
        try {
            Files.move(temp, target, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
        } catch (AtomicMoveNotSupportedException ex) {
            Files.move(temp, target, StandardCopyOption.REPLACE_EXISTING);
        }
    }

    private static JsonArray writeDraggableSections() {
        JsonArray output = new JsonArray();
        for (Dragging dragging : draggables.values()) {
            if (dragging == null || dragging.getName() == null || dragging.getName().isBlank()) continue;
            output.add(writeDraggable(dragging.getName(), dragging.getX(), dragging.getY(), dragging.initialXVal, dragging.initialYVal));
        }
        pendingPositions.forEach((name, pos) -> {
            if (name != null && !draggables.containsKey(name) && pos != null && pos.length >= 2) {
                output.add(writeDraggable(name, pos[0], pos[1], pos[0], pos[1]));
            }
        });
        return output;
    }

    private static JsonObject writeDraggable(String name, float x, float y, float initialX, float initialY) {
        JsonObject object = new JsonObject();
        object.addProperty("name", name);
        object.addProperty("x", Float.isFinite(x) ? x : initialX);
        object.addProperty("y", Float.isFinite(y) ? y : initialY);
        object.addProperty("initialX", Float.isFinite(initialX) ? initialX : 0f);
        object.addProperty("initialY", Float.isFinite(initialY) ? initialY : 0f);
        return object;
    }

    private static JsonObject writeBooleanSections(Map<String, ? extends Map<String, Boolean>> sections) {
        JsonObject root = new JsonObject();
        sections.forEach((scope, values) -> {
            if (scope == null || values == null) return;
            JsonObject section = new JsonObject();
            values.forEach((key, value) -> {
                if (key != null && value != null) section.addProperty(key, value);
            });
            root.add(scope, section);
        });
        return root;
    }

    private static JsonObject writeStringSections(Map<String, ? extends Map<String, String>> sections) {
        JsonObject root = new JsonObject();
        sections.forEach((scope, values) -> {
            if (scope == null || values == null) return;
            JsonObject section = new JsonObject();
            values.forEach((key, value) -> {
                if (key != null && value != null) section.addProperty(key, value);
            });
            root.add(scope, section);
        });
        return root;
    }

    private static JsonObject writeFloatSections(Map<String, ? extends Map<String, Float>> sections) {
        JsonObject root = new JsonObject();
        sections.forEach((scope, values) -> {
            if (scope == null || values == null) return;
            JsonObject section = new JsonObject();
            values.forEach((key, value) -> {
                if (key != null && value != null && Float.isFinite(value)) section.addProperty(key, value);
            });
            root.add(scope, section);
        });
        return root;
    }

    private static void readBooleanSections(JsonElement element, Map<String, LinkedHashMap<String, Boolean>> output) {
        if (element == null || element.isJsonNull() || !element.isJsonObject()) return;
        element.getAsJsonObject().entrySet().forEach(scopeEntry -> {
            if (!scopeEntry.getValue().isJsonObject()) return;
            LinkedHashMap<String, Boolean> section = new LinkedHashMap<>();
            scopeEntry.getValue().getAsJsonObject().entrySet().forEach(valueEntry -> {
                JsonElement value = valueEntry.getValue();
                if (value == null || value.isJsonNull()) return;
                try {
                    section.put(valueEntry.getKey(), value.getAsBoolean());
                } catch (RuntimeException ignored) {
                }
            });
            output.put(scopeEntry.getKey(), section);
        });
    }

    private static void readStringSections(JsonElement element, Map<String, LinkedHashMap<String, String>> output) {
        if (element == null || element.isJsonNull() || !element.isJsonObject()) return;
        element.getAsJsonObject().entrySet().forEach(scopeEntry -> {
            if (!scopeEntry.getValue().isJsonObject()) return;
            LinkedHashMap<String, String> section = new LinkedHashMap<>();
            scopeEntry.getValue().getAsJsonObject().entrySet().forEach(valueEntry -> {
                JsonElement value = valueEntry.getValue();
                if (value == null || value.isJsonNull()) return;
                try {
                    section.put(valueEntry.getKey(), value.getAsString());
                } catch (RuntimeException ignored) {
                }
            });
            output.put(scopeEntry.getKey(), section);
        });
    }

    private static void readFloatSections(JsonElement element, Map<String, LinkedHashMap<String, Float>> output) {
        if (element == null || element.isJsonNull() || !element.isJsonObject()) return;
        element.getAsJsonObject().entrySet().forEach(scopeEntry -> {
            if (!scopeEntry.getValue().isJsonObject()) return;
            LinkedHashMap<String, Float> section = new LinkedHashMap<>();
            scopeEntry.getValue().getAsJsonObject().entrySet().forEach(valueEntry -> {
                JsonElement value = valueEntry.getValue();
                if (value == null || value.isJsonNull()) return;
                try {
                    float parsedValue = value.getAsFloat();
                    if (Float.isFinite(parsedValue)) section.put(valueEntry.getKey(), parsedValue);
                } catch (RuntimeException ignored) {
                }
            });
            output.put(scopeEntry.getKey(), section);
        });
    }

    private static String getString(JsonObject obj, String key) {
        JsonElement el = obj.get(key);
        if (el == null || el.isJsonNull()) return null;
        try {
            return el.getAsString();
        } catch (RuntimeException ignored) {
            return null;
        }
    }

    private static float getFloat(JsonObject obj, String key, float defaultValue) {
        JsonElement el = obj.get(key);
        if (el == null || el.isJsonNull()) return defaultValue;
        try {
            float value = el.getAsFloat();
            return Float.isFinite(value) ? value : defaultValue;
        } catch (RuntimeException ignored) {
            return defaultValue;
        }
    }

    public static GridSnapResult computeSmartGrid(Dragging active, float maxWidth, float maxHeight) {
        List<GridLine> lines = new ArrayList<>();
        float edgeInset = 5f;

        lines.add(new GridLine(GridLine.Type.HORIZONTAL, GridLine.Align.EDGE, edgeInset));
        lines.add(new GridLine(GridLine.Type.HORIZONTAL, GridLine.Align.EDGE, Math.max(edgeInset, maxHeight - edgeInset)));
        lines.add(new GridLine(GridLine.Type.VERTICAL, GridLine.Align.EDGE, edgeInset));
        lines.add(new GridLine(GridLine.Type.VERTICAL, GridLine.Align.EDGE, Math.max(edgeInset, maxWidth - edgeInset)));

        lines.add(new GridLine(GridLine.Type.VERTICAL, GridLine.Align.CENTER, maxWidth * 0.5f));
        lines.add(new GridLine(GridLine.Type.HORIZONTAL, GridLine.Align.CENTER, maxHeight * 0.5f));
        lines.add(new GridLine(GridLine.Type.VERTICAL, GridLine.Align.CENTER, maxWidth * 0.25f));
        lines.add(new GridLine(GridLine.Type.VERTICAL, GridLine.Align.CENTER, maxWidth * 0.75f));
        lines.add(new GridLine(GridLine.Type.HORIZONTAL, GridLine.Align.CENTER, maxHeight * 0.25f));
        lines.add(new GridLine(GridLine.Type.HORIZONTAL, GridLine.Align.CENTER, maxHeight * 0.75f));

        for (Dragging dragging : draggables.values()) {
            if (dragging == null || dragging == active) continue;
            if (dragging.getModule() == null || !dragging.getModule().isState()) continue;
            if (dragging.getWidth() <= 0 || dragging.getHeight() <= 0) continue;

            // Edge snap lines
            lines.add(new GridLine(GridLine.Type.HORIZONTAL, GridLine.Align.EDGE, dragging.getY()));
            float otherCenter = dragging.getX() + dragging.getWidth() * 0.5f;
            if (otherCenter > maxWidth * 0.5f) {
                lines.add(new GridLine(GridLine.Type.VERTICAL, GridLine.Align.EDGE, dragging.getX() + dragging.getWidth()));
            } else {
                lines.add(new GridLine(GridLine.Type.VERTICAL, GridLine.Align.EDGE, dragging.getX()));
            }

            // Center snap lines — vertical through center, horizontal through center
            lines.add(new GridLine(GridLine.Type.VERTICAL, GridLine.Align.CENTER, dragging.getX() + dragging.getWidth() * 0.5f));
            lines.add(new GridLine(GridLine.Type.HORIZONTAL, GridLine.Align.CENTER, dragging.getY() + dragging.getHeight() * 0.5f));

            // Opposite edge snap lines
            lines.add(new GridLine(GridLine.Type.HORIZONTAL, GridLine.Align.EDGE, dragging.getY() + dragging.getHeight()));
            lines.add(new GridLine(GridLine.Type.VERTICAL, GridLine.Align.EDGE, dragging.getX()));
            lines.add(new GridLine(GridLine.Type.VERTICAL, GridLine.Align.EDGE, dragging.getX() + dragging.getWidth()));
        }

        GridSnapResult result = GridSnapResult.fromLines(lines, active);
        activeGridLines = result.lines;
        return result;
    }

    public static final class GridSnapResult {
        public final List<GridLine> lines;
        public final boolean snapXActive;
        public final boolean snapYActive;
        public final float snapX;
        public final float snapY;
        public final float snapLineX;
        public final float snapLineY;

        private GridSnapResult(List<GridLine> lines, boolean snapXActive, boolean snapYActive,
                               float snapX, float snapY, float snapLineX, float snapLineY) {
            this.lines = lines;
            this.snapXActive = snapXActive;
            this.snapYActive = snapYActive;
            this.snapX = snapX;
            this.snapY = snapY;
            this.snapLineX = snapLineX;
            this.snapLineY = snapLineY;
        }

        private static GridSnapResult fromLines(List<GridLine> lines, Dragging active) {
            float xPos = active.getX();
            float yPos = active.getY();
            float width = active.getWidth();
            float height = active.getHeight();
            float snapThreshold = Interface.getHudEditorSnapThreshold();

            float bestXDelta = snapThreshold + 1f;
            float bestYDelta = snapThreshold + 1f;
            GridLine bestV = null;
            GridLine bestH = null;
            float bestSnapX = xPos;
            float bestSnapY = yPos;

            for (GridLine line : lines) {
                if (line.getType() == GridLine.Type.VERTICAL) {
                    float candidate;
                    float delta;
                    if (line.getAlign() == GridLine.Align.CENTER) {
                        candidate = line.getPos() - width * 0.5f;
                        delta = Math.abs(xPos - candidate);
                    } else {
                        float left = line.getPos();
                        float right = line.getPos() - width;
                        float deltaLeft = Math.abs(xPos - left);
                        float deltaRight = Math.abs(xPos - right);
                        if (deltaLeft <= deltaRight) {
                            candidate = left;
                            delta = deltaLeft;
                        } else {
                            candidate = right;
                            delta = deltaRight;
                        }
                    }
                    if (delta < bestXDelta && delta <= snapThreshold) {
                        bestXDelta = delta;
                        bestV = line;
                        bestSnapX = candidate;
                    }
                } else {
                    float candidate;
                    float delta;
                    if (line.getAlign() == GridLine.Align.CENTER) {
                        candidate = line.getPos() - height * 0.5f;
                        delta = Math.abs(yPos - candidate);
                    } else {
                        float top = line.getPos();
                        float bottom = line.getPos() - height;
                        float deltaTop = Math.abs(yPos - top);
                        float deltaBottom = Math.abs(yPos - bottom);
                        if (deltaTop <= deltaBottom) {
                            candidate = top;
                            delta = deltaTop;
                        } else {
                            candidate = bottom;
                            delta = deltaBottom;
                        }
                    }
                    if (delta < bestYDelta && delta <= snapThreshold) {
                        bestYDelta = delta;
                        bestH = line;
                        bestSnapY = candidate;
                    }
                }
            }

            if (bestV != null) bestV.setActive(true);
            if (bestH != null) bestH.setActive(true);

            return new GridSnapResult(lines, bestV != null, bestH != null,
                    bestSnapX, bestSnapY,
                    bestV == null ? 0f : bestV.getPos(),
                    bestH == null ? 0f : bestH.getPos());
        }
    }

}
