package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.client.events.impl.client.PostEvent;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.ProjectionUtil;
import fun.nexisdlc.client.utils.math.time.StopWatch;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.ui.hud.NotificationsOverlay;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionAdd(name = "DanjTags", alias = "Danj Tags", category = Category.Render, description = "Таймеры сундуков и их статус")
public class DanjTags extends Function {

    private static final DanjTags INSTANCE = new DanjTags();

    public static DanjTags getInstance() {
        return INSTANCE;
    }

    private static final Set<BlockEntityType<?>> LOOT_BLOCK_TYPES = Set.of(
            BlockEntityType.CHEST,
            BlockEntityType.TRAPPED_CHEST,
            BlockEntityType.BARREL,
            BlockEntityType.SHULKER_BOX
    );

    private static final Pattern TIMER_MMSS = Pattern.compile("(\\d{1,2})\\s*[:.]\\s*(\\d{1,2})");
    private static final Pattern TIMER_SECOND_UNIT = Pattern.compile("(\\d{1,3})\\s*(?:сек(?:унд(?:ы|у|а)?)?|s|sec|seconds?)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
    private static final Pattern TIMER_MINUTE_UNIT = Pattern.compile("(\\d{1,2})\\s*(?:мин(?:ут(?:ы|у|а)?)?|m|min|minutes?)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
    private static final Pattern TIMER_NUMBER = Pattern.compile("(\\d{1,3})");

    private static final int SCAN_RADIUS = 25;
    private static final double LOOTABLE_RADIUS = 15.0;
    private static final int NOTIFY_COOLDOWN_MS = 5000;
    private static final int HUD_MAX_ROWS = 6;
    private static final float HUD_X = 10f;
    private static final float HUD_Y = 10f;
    private static final float HUD_PADDING_X = 8f;
    private static final float HUD_PADDING_Y = 6f;
    private static final float HUD_HEADER_HEIGHT = 20f;
    private static final float HUD_ROW_HEIGHT = 24f;
    private static final float HUD_ROUNDING = 6f;
    private static final float HUD_TITLE_SIZE = 20f;
    private static final float HUD_TEXT_SIZE = 24;

    private static final float WORLD_LABEL_FONT_SIZE = 16f;
    private static final float WORLD_LABEL_PADDING_X = 6f;
    private static final float WORLD_LABEL_PADDING_Y = 3f;
    private static final float WORLD_LABEL_BG_ROUNDING = 4f;

    private final Map<BlockPos, ChestTimerInfo> chestTimers = new HashMap<>();
    private final StopWatch notifyCooldown = new StopWatch();
    private BlockPos lastNotifiedChest = null;
    private boolean lastNotifiedLootable = false;

    public DanjTags() {
        addSettings();
    }

    private static class ChestTimerInfo {
        int timerSeconds;
        long timerEndTime;
        String blockType;
        boolean lootable;
        boolean hologramSeen;
        boolean hologramVisibleLastScan;
        boolean hologramDisappeared;

        ChestTimerInfo(int timerSeconds, String blockType) {
            updateTimer(timerSeconds, blockType);
        }

        void updateTimer(int timerSeconds, String blockType) {
            this.timerSeconds = timerSeconds;
            this.timerEndTime = System.currentTimeMillis() + (timerSeconds * 1000L);
            this.blockType = blockType;
            this.lootable = false;
            this.hologramSeen = true;
            this.hologramVisibleLastScan = true;
            this.hologramDisappeared = false;
        }

        void updateMissingHologram(String blockType) {
            this.blockType = blockType;
            if (hologramSeen && hologramVisibleLastScan) {
                hologramDisappeared = true;
            }
            hologramVisibleLastScan = false;
            lootable = hologramDisappeared;
        }

        int getRemainingSeconds() {
            return (int) Math.max(0, (timerEndTime - System.currentTimeMillis()) / 1000L);
        }

        boolean isLootable() {
            return lootable;
        }
    }

    private static class ChestHudEntry {
        final BlockPos pos;
        final ChestTimerInfo info;
        final double distance;
        final double distance3d;
        final String direction;

        ChestHudEntry(BlockPos pos, ChestTimerInfo info, double distance, double distance3d, String direction) {
            this.pos = pos;
            this.info = info;
            this.distance = distance;
            this.distance3d = distance3d;
            this.direction = direction;
        }

        boolean isLootableVisible() {
            return info.lootable && distance3d <= LOOTABLE_RADIUS;
        }

        String line() {
            String status = isLootableVisible() ? "МОЖНО ЛУТАТЬ" : formatStaticTimer(info.getRemainingSeconds());
            return direction + " " + info.blockType + " [" + pos.getX() + " " + pos.getY() + " " + pos.getZ() + "] "
                    + String.format(Locale.ROOT, "%.0fм", distance) + " • " + status;
        }
    }

    @Override
    public void onEnable() {
        chestTimers.clear();
        lastNotifiedChest = null;
        lastNotifiedLootable = false;
        notifyCooldown.reset();
        super.onEnable();
    }

    @Override
    public void onDisable() {
        chestTimers.clear();
        lastNotifiedChest = null;
        lastNotifiedLootable = false;
        super.onDisable();
    }

    @EventHandler
    public void onTick(PostEvent event) {
        if (nullCheck()) return;
        if (!this.isState()) return;

        scanChests();
        showNearestChestTimer();
    }

    @EventHandler
    public void onRenderHud(EventRender.Screen.UnderHud event) {
        if (!this.isState()) return;
        if (nullCheck() || mc.options.hudHidden || chestTimers.isEmpty()) {
            return;
        }

        Renderer2D renderer = event.getRenderer();
        int screenW = mc.getWindow().getWidth();
        int screenH = mc.getWindow().getHeight();

        // ── 1. Список в левом верхнем углу (HUD) ──
        List<ChestHudEntry> entries = collectHudEntries();
        if (!entries.isEmpty()) {
            String title = "Таймеры сундуков";
            var font = FontRegistry.INTER;
            float width = renderer.measureText(font, title, HUD_TITLE_SIZE).width + HUD_PADDING_X * 2f;

            for (ChestHudEntry entry : entries) {
                width = Math.max(width, renderer.measureText(font, entry.line(), HUD_TEXT_SIZE).width + HUD_PADDING_X * 2f);
            }

            float currentY = HUD_Y + HUD_HEADER_HEIGHT + HUD_PADDING_Y + FontRegistry.centeredBaselineOffset(font, 'H', HUD_TEXT_SIZE);
            for (int i = 0; i < entries.size(); i++) {
                ChestHudEntry entry = entries.get(i);
                int color = entry.isLootableVisible() ? new Color(120, 255, 120).getRGB() : (i == 0 ? 0xFFFFFFFF : 0xFFD7D7D7);
                renderer.text(font, HUD_X + HUD_PADDING_X, currentY + 4, HUD_TEXT_SIZE, entry.line(), color);
                currentY += HUD_ROW_HEIGHT;
            }
        }

        // ── 2. World-space labels над каждым сундуком (поверх hologram'ов, видно через стены) ──
        var labelFont = FontRegistry.INTER;
        float paddingX = WORLD_LABEL_PADDING_X;
        float paddingY = WORLD_LABEL_PADDING_Y;

        for (Map.Entry<BlockPos, ChestTimerInfo> e : chestTimers.entrySet()) {
            BlockPos pos = e.getKey();
            ChestTimerInfo info = e.getValue();

            double dx = pos.getX() + 0.5 - mc.player.getX();
            double dy = pos.getY() + 1.15 - mc.player.getY();
            double dz = pos.getZ() + 0.5 - mc.player.getZ();
            double dist3d = Math.sqrt(dx * dx + dy * dy + dz * dz);
            if (dist3d > SCAN_RADIUS * 1.5) continue;

            var screenPos = ProjectionUtil.toScreen(pos.getX() + 0.5, pos.getY() + 1.15, pos.getZ() + 0.5);
            if (screenPos.z < 0) continue;

            float sx = (float) Math.max(0, Math.min(screenW, screenPos.x));
            float sy = (float) Math.max(0, Math.min(screenH, screenPos.y));

            String labelText = info.blockType + " • " + (info.isLootable()
                    ? "МОЖНО ЛУТАТЬ"
                    : formatStaticTimer(info.getRemainingSeconds()));

            var metrics = renderer.measureText(labelFont, labelText, WORLD_LABEL_FONT_SIZE);
            float bgW = metrics.width + paddingX * 2;
            float bgH = metrics.height + paddingY * 2;
            int textColor = info.isLootable() ? new Color(120, 255, 120).getRGB() : 0xFFFFFFFF;

            renderer.pushTranslation(sx, sy);
            renderer.rect(-bgW / 2, -bgH, bgW, bgH, WORLD_LABEL_BG_ROUNDING, new Color(0, 0, 0, 170).getRGB());
            renderer.text(labelFont, -metrics.width / 2, -bgH + paddingY + metrics.height - 5, WORLD_LABEL_FONT_SIZE, labelText, textColor);
            renderer.popTransform();
        }
    }

    private void scanChests() {
        BlockPos playerPos = mc.player.getBlockPos();
        Set<BlockPos> scannedPositions = new HashSet<>();

        for (int x = -SCAN_RADIUS; x <= SCAN_RADIUS; x++) {
            for (int y = -3; y <= 3; y++) {
                for (int z = -SCAN_RADIUS; z <= SCAN_RADIUS; z++) {
                    BlockPos pos = playerPos.add(x, y, z);
                    BlockEntity entity = mc.world.getBlockEntity(pos);

                    if (entity == null || !LOOT_BLOCK_TYPES.contains(entity.getType())) {
                        continue;
                    }

                    scannedPositions.add(pos);
                    String blockType = getBlockTypeName(entity.getType());
                    int timer = findTimerNearBlock(pos);
                    ChestTimerInfo info = chestTimers.get(pos);

                    if (timer >= 0) {
                        if (info == null) {
                            chestTimers.put(pos, new ChestTimerInfo(timer, blockType));
                        } else {
                            info.updateTimer(timer, blockType);
                        }
                    } else if (info != null) {
                        info.updateMissingHologram(blockType);
                    }
                }
            }
        }

        chestTimers.entrySet().removeIf(entry -> !scannedPositions.contains(entry.getKey()));
    }

    private void showNearestChestTimer() {
        List<ChestHudEntry> entries = collectHudEntries();
        if (entries.isEmpty()) {
            lastNotifiedChest = null;
            lastNotifiedLootable = false;
            return;
        }

        ChestHudEntry nearest = entries.get(0);
        boolean chestChanged = lastNotifiedChest == null || !lastNotifiedChest.equals(nearest.pos);
        boolean nearestLootableVisible = nearest.isLootableVisible();
        boolean lootableChanged = chestChanged || lastNotifiedLootable != nearestLootableVisible;

        if (notifyCooldown.hasReached(NOTIFY_COOLDOWN_MS) || chestChanged || lootableChanged && this.isState()) {
            String status = nearestLootableVisible ? "МОЖНО ЛУТАТЬ" : formatTimer(nearest.info.getRemainingSeconds());
            NotificationsOverlay.push(
                    String.format(Locale.ROOT, "%s %s: %s", nearest.direction, nearest.info.blockType, status),
                    3000,
                    NotificationsOverlay.Kind.COOLDOWN,
                    nearest.info.blockType
            );

            lastNotifiedChest = nearest.pos;
            lastNotifiedLootable = nearestLootableVisible;
            notifyCooldown.reset();
        }
    }

    private List<ChestHudEntry> collectHudEntries() {
        if (nullCheck()) {
            return List.of();
        }

        List<ChestHudEntry> result = new ArrayList<>();
        double playerX = mc.player.getX();
        double playerZ = mc.player.getZ();

        for (Map.Entry<BlockPos, ChestTimerInfo> entry : chestTimers.entrySet()) {
            BlockPos pos = entry.getKey();
            double dx = pos.getX() + 0.5 - playerX;
            double dy = pos.getY() + 0.5 - mc.player.getY();
            double dz = pos.getZ() + 0.5 - playerZ;
            double distance = Math.sqrt(dx * dx + dz * dz);
            double distance3d = Math.sqrt(dx * dx + dy * dy + dz * dz);
            result.add(new ChestHudEntry(pos, entry.getValue(), distance, distance3d, getDirectionArrow(dx, dz)));
        }

        result.sort(Comparator.comparingDouble(entry -> entry.distance));
        if (result.size() > HUD_MAX_ROWS) {
            return new ArrayList<>(result.subList(0, HUD_MAX_ROWS));
        }
        return result;
    }

    private String getDirectionArrow(double dx, double dz) {
        double targetYaw = Math.toDegrees(Math.atan2(dz, dx)) - 90.0;
        double delta = MathHelper.wrapDegrees((float) (targetYaw - mc.player.getYaw()));

        if (delta >= -22.5 && delta < 22.5) return "↑";
        if (delta >= 22.5 && delta < 67.5) return "↗";
        if (delta >= 67.5 && delta < 112.5) return "→";
        if (delta >= 112.5 && delta < 157.5) return "↘";
        if (delta >= 157.5 || delta < -157.5) return "↓";
        if (delta >= -157.5 && delta < -112.5) return "↙";
        if (delta >= -112.5 && delta < -67.5) return "←";
        return "↖";
    }

    private String getBlockTypeName(BlockEntityType<?> type) {
        if (type == BlockEntityType.CHEST) return "Сундук";
        if (type == BlockEntityType.TRAPPED_CHEST) return "Сундук";
        if (type == BlockEntityType.BARREL) return "Бочка";
        if (type == BlockEntityType.SHULKER_BOX) return "Шалкер";
        return "Контейнер";
    }

    private int findTimerNearBlock(BlockPos blockPos) {
        if (mc.world == null || blockPos == null) return -1;

        return mc.world.getEntitiesByClass(
                        ArmorStandEntity.class,
                        new Box(blockPos).expand(3),
                        entity -> entity.isCustomNameVisible() && entity.getCustomName() != null
                ).stream()
                .mapToInt(entity -> parseTimer(entity.getCustomName()))
                .filter(t -> t >= 0)
                .min()
                .orElse(-1);
    }

    private int parseTimer(Text customName) {
        if (customName == null) return -1;
        String raw = customName.getString();
        if (raw.isEmpty()) return -1;

        String cleaned = raw
                .replaceAll("§[0-9a-fk-or]", "")
                .replace('\r', ' ')
                .replace('\n', ' ')
                .replaceAll("[^\\p{L}\\p{N}:.]+", " ")
                .trim()
                .toLowerCase(Locale.ROOT);

        if (cleaned.isEmpty()) return -1;

        Matcher m = TIMER_MMSS.matcher(cleaned);
        if (m.find()) {
            int minutes = MathHelper.clamp(Integer.parseInt(m.group(1)), 0, 99);
            int seconds = MathHelper.clamp(Integer.parseInt(m.group(2)), 0, 59);
            return minutes * 60 + seconds;
        }

        m = TIMER_MINUTE_UNIT.matcher(cleaned);
        if (m.find()) {
            return MathHelper.clamp(Integer.parseInt(m.group(1)), 0, 99) * 60;
        }

        m = TIMER_SECOND_UNIT.matcher(cleaned);
        if (m.find()) {
            return MathHelper.clamp(Integer.parseInt(m.group(1)), 0, 599);
        }

        m = TIMER_NUMBER.matcher(cleaned);
        if (m.find()) {
            return MathHelper.clamp(Integer.parseInt(m.group(1)), 0, 999);
        }

        return -1;
    }

    private String formatTimer(int seconds) {
        return formatStaticTimer(seconds);
    }

    private static String formatStaticTimer(int seconds) {
        int m = seconds / 60;
        int s = seconds % 60;
        if (m > 0) {
            return String.format(Locale.ROOT, "%d мин %d сек", m, s);
        }
        return String.format(Locale.ROOT, "%d сек", s);
    }
}
