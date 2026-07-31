package fun.nexisdlc.ui.gui;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fun.nexisdlc.client.utils.config.Config;

import java.io.FileReader;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public final class CsConfigMeta {
    public static final Map<String, Meta> CACHE = new HashMap<>();
    private static long lastScan = 0L;

    private CsConfigMeta() {}

    public static final class Meta {
        public String author = "Unknown";
        public long updatedAt = 0L;
    }

    public static void resetLastScan() {
        lastScan = 0L;
    }

    public static Meta get(Config cfg) {
        Meta meta = CACHE.get(cfg.getName());
        long now = System.currentTimeMillis();
        if (meta != null && now - lastScan < 2000L) return meta;
        Meta m = new Meta();
        try (FileReader reader = new FileReader(cfg.getFile())) {
            JsonElement el = JsonParser.parseReader(reader);
            if (el != null && el.isJsonObject()) {
                JsonObject obj = el.getAsJsonObject();
                if (obj.has("meta") && obj.get("meta").isJsonObject()) {
                    JsonObject mo = obj.getAsJsonObject("meta");
                    if (mo.has("author")) m.author = mo.get("author").getAsString();
                    if (mo.has("updatedAt")) m.updatedAt = mo.get("updatedAt").getAsLong();
                }
            }
        } catch (Exception ignored) {
            m.updatedAt = cfg.getFile().lastModified();
        }
        if (m.updatedAt == 0L) m.updatedAt = cfg.getFile().lastModified();
        CACHE.put(cfg.getName(), m);
        lastScan = now;
        return m;
    }

    public static String formatRelativeDate(long ts) {
        if (ts <= 0) return "\u2014";
        long diff = System.currentTimeMillis() - ts;
        long day = 24L * 60L * 60L * 1000L;
        if (diff < day) return "\u0421\u0435\u0433\u043e\u0434\u043d\u044f";
        if (diff < 2 * day) return "\u0412\u0447\u0435\u0440\u0430";
        long days = diff / day;
        if (days < 7) return days + " \u0434\u043d. \u043d\u0430\u0437\u0430\u0434";
        Instant inst = Instant.ofEpochMilli(ts);
        return DateTimeFormatter.ofPattern("dd.MM.yyyy").withZone(ZoneId.systemDefault()).format(inst);
    }
}
