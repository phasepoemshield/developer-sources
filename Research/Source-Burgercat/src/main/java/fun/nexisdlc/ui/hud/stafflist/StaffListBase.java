package fun.nexisdlc.ui.hud.stafflist;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.client.utils.config.StaffStorage;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.ui.hud.StaffEntry;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import net.minecraft.text.Text;

import java.util.*;
import java.util.regex.Pattern;

public abstract class StaffListBase implements IMinecraft {
    public static final String SETTINGS_SCOPE = "StaffList";
    public static final String SETTING_ALWAYS_SHOW = "alwaysShow";
    public static final String SETTING_VARIANT = "variant";
    public static final String VARIANT_DEFAULT = "Дефолт";
    public static final String VARIANT_NEW = "Новый";
    private static final Pattern NAME_PATTERN = Pattern.compile("^\\w{3,16}$");
    private static final String[] STAFF_PREFIXES = new String[]{
            "helper", "moder", "staff", "admin", "хелпер", "curator", "стажёр", "staff", "сотрудник", "помощник", "админ", "модер", "агент", "стафф"
    };

    public static float width;
    public static float height;
    final Dragging dragging;

    final Map<String, Float> staffAnim = new HashMap<>();
    final Map<String, Float> staffY = new HashMap<>();
    final Map<String, StaffEntry> staffEntries = new LinkedHashMap<>();
    final Set<String> detectedStaff = new HashSet<>();
    final Map<String, Text> displayCache = new HashMap<>();
    long lastAnimTime = System.currentTimeMillis();
    long lastScanTime = 0L;
    final SimpleLinearAnimation animation = new SimpleLinearAnimation();
    float lastDragX = Float.NaN;
    float lastDragY = Float.NaN;

    protected static final float ITEM_ANIM_DURATION_MS = 200f;

    protected StaffListBase(Dragging dragging) {
        this.dragging = dragging;
    }

    protected void scanStaff() {
        staffEntries.clear();
        detectedStaff.clear();
        displayCache.clear();
        StaffStorage storage = Nexis.getInstance().getStaffStorage();
        if (mc.getNetworkHandler() == null) {
            return;
        }

        Scoreboard scoreboard = mc.world != null ? mc.world.getScoreboard() : null;
        List<PlayerListEntry> players = new ArrayList<>(mc.getNetworkHandler().getPlayerList());
        Set<String> onlineLower = new HashSet<>();
        for (PlayerListEntry entry : players) {
            String name = entry.getProfile() != null ? entry.getProfile().name() : null;
            name = trimLeadingSpaces(name);
            String display = entry.getDisplayName() != null ? entry.getDisplayName().getString() : name;
            if (name != null) {
                onlineLower.add(name.toLowerCase());
            }
            if (name == null) {
                continue;
            }
            Text displayText = buildDisplayText(name, entry, scoreboard);
            if (displayText != null) {
                displayCache.put(name.toLowerCase(), displayText);
            }
            if (display == null) {
                continue;
            }
            String prefix = display.replace(name, "").trim();
            if (prefix.length() < 2) {
                continue;
            }
            if (NAME_PATTERN.matcher(name).matches()
                    && matchesStaffPrefix(prefix.toLowerCase(Locale.ROOT))) {
                detectedStaff.add(name);
            }
        }

        Map<String, StaffEntry> unique = new LinkedHashMap<>();
        for (StaffStorage.Staff staff : storage.getStaffs()) {
            String name = trimLeadingSpaces(staff.getName());
            if (name == null || name.isBlank()) {
                continue;
            }
            String key = name.toLowerCase();
            if (unique.containsKey(key)) {
                continue;
            }
            boolean online = onlineLower.contains(key);
            if (!online) {
                continue;
            }
            Text displayText = displayCache.getOrDefault(key, Text.literal(name));
            unique.put(key, new StaffEntry(name, displayText, online));
        }
        for (String name : detectedStaff) {
            name = trimLeadingSpaces(name);
            if (name == null || name.isBlank()) {
                continue;
            }
            String key = name.toLowerCase();
            if (unique.containsKey(key)) {
                continue;
            }
            boolean online = onlineLower.contains(key);
            if (!online) {
                continue;
            }
            Text displayText = displayCache.getOrDefault(key, Text.literal(name));
            unique.put(key, new StaffEntry(name, displayText, online));
        }

        staffEntries.putAll(unique);
    }

    protected static float centeredTextY(float y, float height, float size) {
        float offset = FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', size);
        return y + height * 0.5f + offset + 0.5f;
    }

    protected float updateAnimTime() {
        long now = System.currentTimeMillis();
        float dt = (now - lastAnimTime) / 1000f;
        lastAnimTime = now;
        if (!Float.isFinite(dt) || dt < 0f) {
            return 0f;
        }
        return Math.min(dt, 0.05f);
    }

    protected static float animate(float value, float target, float durationMs, float dt) {
        if (durationMs <= 0f) {
            return target;
        }
        float duration = Math.max(1e-6f, durationMs / 1000f);
        float k = (float) (-Math.log(0.05f) / duration);
        float t = 1f - (float) Math.exp(-k * Math.max(0f, dt));
        return value + (target - value) * MathUtil.clamp(t, 0f, 1f);
    }

    protected void applyDragDelta(float x, float y) {
        if (Float.isFinite(lastDragY)) {
            float dy = y - lastDragY;
            if (Math.abs(dy) > 0.001f) {
                for (Map.Entry<String, Float> entry : staffY.entrySet()) {
                    entry.setValue(entry.getValue() + dy);
                }
            }
        }
        lastDragX = x;
        lastDragY = y;
    }

    protected Text buildDisplayText(String name, PlayerListEntry entry, Scoreboard scoreboard) {
        name = trimLeadingSpaces(name);
        if (name == null || name.isBlank()) {
            return Text.empty();
        }
        Text displayName = entry != null ? entry.getDisplayName() : null;
        if (displayName != null && !displayName.getString().isBlank()) {
            return displayName;
        }
        if (scoreboard != null) {
            Team team = scoreboard.getTeam(name);
            if (team == null) {
                team = findTeamForPlayer(scoreboard, name);
            }
            if (team != null) {
                Text prefix = team.getPrefix();
                Text suffix = team.getSuffix();
                if ((prefix != null && !prefix.getString().isBlank())
                        || (suffix != null && !suffix.getString().isBlank())) {
                    var out = Text.empty();
                    if (prefix != null) {
                        out.append(prefix);
                    }
                    out.append(Text.literal(name));
                    if (suffix != null) {
                        out.append(suffix);
                    }
                    return out;
                }
            }
        }
        return Text.literal(name);
    }

    protected boolean matchesStaffPrefix(String prefixLower) {
        if (prefixLower == null || prefixLower.isBlank()) {
            return false;
        }
        for (String key : STAFF_PREFIXES) {
            if (prefixLower.contains(key)) {
                return true;
            }
        }
        return false;
    }

    protected Team findTeamForPlayer(Scoreboard scoreboard, String name) {
        if (scoreboard == null || name == null) {
            return null;
        }
        for (Team team : scoreboard.getTeams()) {
            if (team.getPlayerList().contains(name)) {
                return team;
            }
        }
        return null;
    }

    protected static String trimLeadingSpaces(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }
        int i = 0;
        while (i < name.length()) {
            int codePoint = name.codePointAt(i);
            if (isLeadingSpace(codePoint)) {
                i += Character.charCount(codePoint);
            } else {
                break;
            }
        }
        return i > 0 ? name.substring(i) : name;
    }

    protected static boolean isLeadingSpace(int codePoint) {
        if (Character.isWhitespace(codePoint) || Character.isSpaceChar(codePoint)) {
            return true;
        }
        int type = Character.getType(codePoint);
        if (type == Character.FORMAT) {
            return true;
        }
        return codePoint == 0x00A0
                || codePoint == 0x2007
                || codePoint == 0x202F
                || codePoint == 0x3000;
    }

    protected static Text trimDisplayText(Text displayText) {
        if (displayText == null) {
            return Text.empty();
        }
        String raw = displayText.getString();
        if (raw.isEmpty()) {
            return displayText;
        }
        String trimmed = trimLeadingSpaces(raw);
        if (trimmed.equals(raw)) {
            return displayText;
        }
        var out = Text.empty();
        final boolean[] trimming = {true};
        displayText.visit((style, part) -> {
            if (part == null || part.isEmpty()) {
                return java.util.Optional.empty();
            }
            String segment = part;
            if (trimming[0]) {
                int i = 0;
                while (i < segment.length()) {
                    int codePoint = segment.codePointAt(i);
                    if (isLeadingSpace(codePoint)) {
                        i += Character.charCount(codePoint);
                    } else {
                        break;
                    }
                }
                if (i >= segment.length()) {
                    return java.util.Optional.empty();
                }
                segment = segment.substring(i);
                trimming[0] = false;
            }
            if (!segment.isEmpty()) {
                out.append(Text.literal(segment).setStyle(style));
            }
            return java.util.Optional.empty();
        }, net.minecraft.text.Style.EMPTY);
        return out;
    }
}
