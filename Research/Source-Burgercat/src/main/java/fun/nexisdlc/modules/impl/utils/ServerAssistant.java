package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.events.impl.client.EventKey;
import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.ProjectionUtil;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.player.ServerUtil;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BindSetting;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import fun.nexisdlc.modules.impl.render.Notifications;
import fun.nexisdlc.ui.hud.NotificationsOverlay;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.apache.commons.lang3.StringUtils;
import org.joml.Vector3d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionAdd(name = "ServerAssistant", alias = "Server Assistant", category = Category.Utilities, description = "Помощник для серверов: задержки, обходы и автоматизации")
public class ServerAssistant extends Function {
    private static final int ITEM_USE_ROTATION_PRIORITY = 999;
    private static final String ITEM_USE_ROTATION_TASK = "item_use";

    public static ModeSetting server = new ModeSetting("Ваш сервер", "FunTime",
            "FunTime", "HolyWorld", "SpookyTime", "ReallyWorld", "Свой", "Без разницы");
    public static BooleanSetting multiActionBypass = new BooleanSetting("Обход MultiAction", false);
    public static SliderSetting tickToRunAction = new SliderSetting("Тики до выполнения", 3, 0, 5, 1)
            .setVisible(ServerAssistant::isCustomServer);
    public static SliderSetting tickToReturnKeys = new SliderSetting("Тики до включения клавиш", 4, 0, 8, 1)
            .setVisible(ServerAssistant::isCustomServer);
    public static BooleanSetting extraBurstDelay = new BooleanSetting("Доп задержка при спаме", false)
            .setVisible(ServerAssistant::isCustomServer);

    public static BooleanSetting legitUse = new BooleanSetting("Легитный юз", false);
    public static SliderSetting waitStopTicks = new SliderSetting("Тики стоп", 2, 0, 5, 1)
            .setVisible(() -> legitUse.get());
    public static SliderSetting waitSwapTicks = new SliderSetting("Тики свап", 1, 0, 5, 1)
            .setVisible(() -> legitUse.get());
    public static SliderSetting waitUseTicks = new SliderSetting("Тики юз", 1, 0, 5, 1)
            .setVisible(() -> legitUse.get());
    public static SliderSetting waitReturnTicks = new SliderSetting("Тики возвращения", 2, 0, 6, 1)
            .setVisible(() -> legitUse.get());

    public static BooleanSetting autoMark = new BooleanSetting("Авто-метка", true)
            .setVisible(ServerAssistant::isFunTimeMode);
    public static BooleanSetting banReason = new BooleanSetting("Причина бана", false)
            .setVisible(ServerAssistant::isFunTimeMode);

    public List<KeyBind> keyBindings = new ArrayList<>();
    private final List<ServerEvent> serverEvents = new ArrayList<>();

    private long lastActionTime = 0;
    private long lastClickTime = 0;
    private int burstClicks = 0;
    private static int dynamicExtraDelayTicks = 0;

    private static final long KELP_ROTATION_TIME_MS = 1;

    private long kelpThrowTime = 0;
    private boolean kelpResetScheduled = false;

    private static final Pattern BAN_NAME_PATTERN = Pattern.compile("\\]\\s*(\\S+)\\s+забанен", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
    private static final Pattern REASON_PATTERN = Pattern.compile("Пункт\\s*([0-9]+(?:\\.[0-9]+)?)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
    private static final Pattern DURATION_PATTERN = Pattern.compile("Окончание:\\s*([^\\n\\r]+?)(?:\\s+Сервер:|$)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
    private static final Pattern EVENT_COORDS_PATTERN = Pattern.compile("Появился на координатах\\s*(-?\\d+)\\s+(-?\\d+)\\s+(-?\\d+)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

    public void initialize() {
        keyBindings.add(new KeyBind(Items.FIREWORK_STAR, new BindSetting("Анти-полёт", -1).setVisible(() -> ServerUtil.isReallyWorld() || allowAllItems()), 0));
        keyBindings.add(new KeyBind(Items.FLOWER_BANNER_PATTERN, new BindSetting("Свиток опыта", -1).setVisible(() -> ServerUtil.isReallyWorld() || allowAllItems()), 0));
        keyBindings.add(new KeyBind(Items.PRISMARINE_SHARD, new BindSetting("Взрывная трапка", -1).setVisible(() -> ServerUtil.isHolyWorld() || allowAllItems()), 5));
        keyBindings.add(new KeyBind(Items.POPPED_CHORUS_FRUIT, new BindSetting("Обычная трапка", -1).setVisible(() -> ServerUtil.isHolyWorld() || allowAllItems()), 0));
        keyBindings.add(new KeyBind(Items.NETHER_STAR, new BindSetting("Стан", -1).setVisible(() -> ServerUtil.isHolyWorld() || allowAllItems()), 30));
        keyBindings.add(new KeyBind(Items.FIRE_CHARGE, new BindSetting("Взрывная штучка", -1).setVisible(() -> ServerUtil.isHolyWorld() || allowAllItems()), 0));
        keyBindings.add(new KeyBind(Items.SNOWBALL, new BindSetting("Снежок", -1).setVisible(() -> ServerUtil.isCopyTime() || ServerUtil.isHolyWorld() || allowAllItems()), 0));
        keyBindings.add(new KeyBind(Items.PHANTOM_MEMBRANE, new BindSetting("Божья аура", -1).setVisible(() -> ServerUtil.isCopyTime() || allowAllItems()), 0));
        keyBindings.add(new KeyBind(Items.NETHERITE_SCRAP, new BindSetting("Трапка", -1).setVisible(() -> ServerUtil.isCopyTime() || allowAllItems()), 0));
        keyBindings.add(new KeyBind(Items.DRIED_KELP, new BindSetting("Пласт", -1).setVisible(() -> ServerUtil.isCopyTime() || allowAllItems()), 0));
        keyBindings.add(new KeyBind(Items.SUGAR, new BindSetting("Явная пыль", -1).setVisible(() -> ServerUtil.isCopyTime() || allowAllItems()), 10));
        keyBindings.add(new KeyBind(Items.FIRE_CHARGE, new BindSetting("Огненный смерч", -1).setVisible(() -> ServerUtil.isCopyTime() || allowAllItems()), 10));
        keyBindings.add(new KeyBind(Items.ENDER_EYE, new BindSetting("Дезориентация", -1).setVisible(() -> ServerUtil.isCopyTime() || allowAllItems()), 10));
        keyBindings.forEach(bind -> addSettings(bind.setting));
        addSettings(server, multiActionBypass, tickToRunAction, tickToReturnKeys, extraBurstDelay,
                legitUse, waitStopTicks, waitSwapTicks, waitUseTicks, waitReturnTicks, autoMark, banReason);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        serverEvents.clear();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        serverEvents.clear();
    }

    @EventHandler
    public void onKey(EventKey e) {
        if (ClientContainer.isHide()) return;
        if (e.getAction() != 1 || mc.world == null || mc.player == null) return;

        long now = System.currentTimeMillis();
        updateBurstDelay(now);
        long requiredDelay = 100L + (dynamicExtraDelayTicks * 50L);
        if (now - lastActionTime < requiredDelay) return;

        int pressedKey = e.getConvertedKey();

        keyBindings.stream()
                .filter(bind -> bind.setting.isVisible() && bind.setting.get() == pressedKey)
                .forEach(bind -> {
                    Slot slot = PlayerInventoryUtil.getSlot(bind.item);
                    if (slot != null && PlayerInventoryUtil.isItemOnCooldown(slot.getStack())) {
                        return;
                    }

                    if (bind.item == Items.DRIED_KELP && mc.getCameraEntity() != null
                            && PlayerInventoryUtil.getSlot(Items.DRIED_KELP) != null) {
                        float cameraYaw = mc.getCameraEntity().getYaw();
                        float cameraPitch = mc.getCameraEntity().getPitch();
                        RotationTask.create(ITEM_USE_ROTATION_TASK, ITEM_USE_ROTATION_PRIORITY);
                        RotationTask.setTargetRotation(cameraYaw, cameraPitch, Float.MAX_VALUE, Float.MAX_VALUE,
                                Float.MAX_VALUE, Float.MAX_VALUE, 1.5, ITEM_USE_ROTATION_PRIORITY, 1L);
                        kelpThrowTime = now;
                        kelpResetScheduled = true;
                        RotationTask.scheduleActionAfterAim(() -> {
                            PlayerInventoryUtil.queueNextUseRotation(cameraYaw, cameraPitch);
                            PlayerInventoryUtil.swapAndUse(bind.item);
                            PlayerUtils.postScript.addTickStep(1, () -> RotationTask.remove(ITEM_USE_ROTATION_TASK));
                        });
                    } else {
                        PlayerInventoryUtil.swapAndUse(bind.item);
                    }
                    lastActionTime = now;
                });
    }

    @EventHandler
    public void onTick(UpdateEvent e) {
        if (kelpResetScheduled && System.currentTimeMillis() - kelpThrowTime >= KELP_ROTATION_TIME_MS) {
            kelpResetScheduled = false;
        }
    }

    @EventHandler
    public void onPacket(EventPacket event) {
        if (!event.isReceive()
                || !isState()
                || !isFunTimeMode()
                || !autoMark.get()
                || !(event.getPacket() instanceof GameMessageS2CPacket packet)
                || mc.world == null) {
            return;
        }

        Text content = packet.content();
        String message = content.getString();
        String name = StringUtils.substringBetween(message, "|||   [", "]   ");
        if (name == null || name.isBlank()) {
            return;
        }

        String contentString = content.toString();
        String position = StringUtils.substringBetween(contentString, "value='/gps ", "'");
        if (position == null) {
            Matcher coordsMatcher = EVENT_COORDS_PATTERN.matcher(message);
            if (coordsMatcher.find()) {
                position = coordsMatcher.group(1) + " " + coordsMatcher.group(2) + " " + coordsMatcher.group(3);
            }
        }

        String level = StringUtils.substringBetween(message, "Уровень лута: ", "\n ║");
        String owner = StringUtils.substringBetween(message, "Призван игроком: ", "\n ║");
        String worldKey = getCurrentWorldKey();
        int anarchy = ServerUtil.getAnarchy();

        if (position != null) {
            String[] xyz = position.trim().split("\\s+");
            if (xyz.length < 3) {
                return;
            }

            try {
                Vec3d center = BlockPos.ofFloored(
                        Integer.parseInt(xyz[0]),
                        Integer.parseInt(xyz[1]),
                        Integer.parseInt(xyz[2])
                ).toCenterPos();

                switch (name) {
                    case "Мистический сундук" -> addEvent(name, level, owner, center, worldKey, anarchy, 300, 0);
                    case "Вулкан" -> addEvent(name, level, owner, center, worldKey, anarchy, 300, 120);
                    case "Метеоритный дождь",
                         "Маяк убийца",
                         "Мистический Алтарь" -> addEvent(name, level, owner, center, worldKey, anarchy, 360, 0);
                    case "Загадочный маяк" -> addEvent(name, level, owner, center, worldKey, anarchy, 60, 180);
                    default -> {
                    }
                }
            } catch (NumberFormatException ignored) {
            }
            return;
        }

        switch (name) {
            case "Сундук смерти" ->
                    addEvent(name, level, owner, BlockPos.ofFloored(-155, 64, 205).toCenterPos(), worldKey, anarchy, 300, 0);
            case "Адская резня" ->
                    addEvent(name, level, owner, BlockPos.ofFloored(48, 87, 73).toCenterPos(), worldKey, anarchy, 180, 120);
            default -> {
            }
        }
    }

    @EventHandler
    public void onRender(EventRender.Screen.UnderHud event) {
        if (!isState() || !isFunTimeMode() || !autoMark.get() || mc.player == null || mc.world == null || serverEvents.isEmpty()) {
            return;
        }

        long now = System.currentTimeMillis();
        serverEvents.removeIf(serverEvent -> serverEvent.timeEnd + 90000L <= now);
        if (serverEvents.isEmpty()) {
            return;
        }

        var render = event.getRenderer();
        var font = FontRegistry.SF_MEDIUM;
        float fontSize = 18f;
        render.prepareBlur(8f);

        String currentWorldKey = getCurrentWorldKey();
        int currentAnarchy = ServerUtil.getAnarchy();

        for (ServerEvent serverEvent : serverEvents) {
            if (!serverEvent.worldKey.equals(currentWorldKey) || serverEvent.anarchy != currentAnarchy) {
                continue;
            }

            Vector3d screenPos = ProjectionUtil.toScreen(
                    serverEvent.position.x,
                    serverEvent.position.y + 2.0,
                    serverEvent.position.z
            );
            if (ProjectionUtil.noNeedRender(screenPos)) {
                continue;
            }

            double timeOpen = (serverEvent.timeOpen - now) / 1000.0;
            double timeEnd = (serverEvent.timeEnd - now) / 1000.0;
            String distance = " [" + String.format("%.1f", new Vec3d(mc.player.getX(), mc.player.getY(), mc.player.getZ()).distanceTo(serverEvent.position)).replace(',', '.') + "m]";
            String time = timeOpen > 0
                    ? ("До начала: " + formatTime(timeOpen))
                    : timeEnd > 0
                      ? ("До конца: " + formatTime(timeEnd))
                      : "Конец ивента!";

            List<String> lines = new ArrayList<>(Collections.singletonList(serverEvent.name + distance));
            if (serverEvent.owner != null && !serverEvent.owner.isBlank()) {
                lines.add("Призван: " + serverEvent.owner);
            }
            lines.add(time);
            if (serverEvent.level != null && !serverEvent.level.isBlank()) {
                lines.add(serverEvent.level);
            }

            float maxWidth = 0f;
            float totalHeight = 0f;
            List<float[]> metrics = new ArrayList<>(lines.size());
            for (String line : lines) {
                var lineMetrics = render.measureText(font, line, fontSize);
                metrics.add(new float[]{lineMetrics.width, lineMetrics.height});
                maxWidth = Math.max(maxWidth, lineMetrics.width);
                totalHeight += lineMetrics.height;
            }

            float paddingX = 8f;
            float paddingY = 5f;
            float lineSpacing = 2f;
            totalHeight += paddingY * 2 + lineSpacing * Math.max(0, lines.size() - 1);
            float totalWidth = maxWidth + paddingX * 2;
            float startX = (float) screenPos.x - totalWidth / 2f;
            float startY = (float) screenPos.y - totalHeight / 2f;


            float y = startY + paddingY;
            for (int i = 0; i < lines.size(); i++) {
                float textX = startX + (totalWidth - metrics.get(i)[0]) / 2f;
                render.text(font, textX, y + metrics.get(i)[1], fontSize, lines.get(i), 0xFFFFFFFF);
                y += metrics.get(i)[1] + lineSpacing;
            }
        }
    }

    public static Text rewriteBanMessage(Text message) {
        if (message == null) return null;

        var manager = Nexis.getFunctionManager();
        if (manager == null || manager.getServerAssistant() == null) return message;

        ServerAssistant assistant = manager.getServerAssistant();
        if (!assistant.isState() || !banReason.get() || !isFunTimeMode()) return message;

        String plain = message.getString();
        String lower = plain.toLowerCase();
        if (!lower.contains("забанен") || !lower.contains("подробнее")) return message;

        Text hover = findHoverText(message);
        if (hover == null) return message;

        String hoverPlain = hover.getString();
        if (hoverPlain == null || hoverPlain.isBlank()) return message;

        String playerName = extractPlayerName(plain);
        String reason = extractReason(hoverPlain);
        String duration = compactDuration(extractDuration(hoverPlain));

        if (playerName.isBlank() || reason.isBlank() || duration.isBlank()) {
            return message;
        }

        if (manager.getNotifications() != null
                && manager.getNotifications().isState()
                && NotificationsOverlay.isHudSettingEnabled(Notifications.SETTING_SHOW_BANS, true)) {
            String reasonText = "Пункт " + reason;
            NotificationsOverlay.push(
                    playerName + " забанен с причиной: \"" + reasonText + "\" на \"" + duration + "\"",
                    2400,
                    NotificationsOverlay.Kind.COOLDOWN,
                    reasonText
            );
        }

        Style nameStyle = findStyleByToken(message, playerName);
        Style reasonStyle = findStyleByToken(hover, reason);
        Style durationStyle = findStyleByToken(hover, duration.replace("д", " д"));
        if (durationStyle == null) {
            durationStyle = findStyleByToken(hover, duration);
        }

        String reasonText = "Пункт " + reason;
        MutableText result = Text.empty()
                .append(Text.literal("[☢] ").formatted(Formatting.RED))
                .append(styled(playerName, nameStyle, Formatting.WHITE))
                .append(Text.literal(" забанен с причиной: \"").formatted(Formatting.YELLOW))
                .append(styled(reasonText, reasonStyle, Formatting.RED))
                .append(Text.literal("\" на \"").formatted(Formatting.YELLOW))
                .append(styled(duration, durationStyle, Formatting.GOLD))
                .append(Text.literal("\"").formatted(Formatting.YELLOW));

        return result;
    }

    private static Text findHoverText(Text root) {
        if (root == null) return null;

        HoverEvent hoverEvent = root.getStyle().getHoverEvent();
        if (hoverEvent instanceof HoverEvent.ShowText showText) {
            Text value = showText.value();
            if (value != null && !value.getString().isBlank()) {
                return value;
            }
        }

        for (Text sibling : root.getSiblings()) {
            Text nested = findHoverText(sibling);
            if (nested != null) {
                return nested;
            }
        }
        return null;
    }

    private static String extractPlayerName(String plain) {
        Matcher matcher = BAN_NAME_PATTERN.matcher(plain);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    private static String extractReason(String hover) {
        Matcher matcher = REASON_PATTERN.matcher(hover);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    private static String extractDuration(String hover) {
        Matcher matcher = DURATION_PATTERN.matcher(hover);
        if (matcher.find()) {
            return matcher.group(1).trim();
        }
        return "";
    }

    private static String compactDuration(String raw) {
        if (raw == null) return "";
        return raw.replaceAll("\\s+", "");
    }

    private static boolean isForeverDuration(String duration) {
        if (duration == null) {
            return false;
        }
        String normalized = duration.toLowerCase().replace(" ", "");
        return normalized.equals("навсегда");
    }

    private static Style findStyleByToken(Text text, String token) {
        if (text == null || token == null || token.isBlank()) {
            return null;
        }
        final Style[] found = new Style[1];
        text.visit((style, part) -> {
            if (found[0] == null && part != null && part.contains(token)) {
                found[0] = style;
            }
            return Optional.empty();
        }, Style.EMPTY);
        return found[0];
    }

    private static MutableText styled(String value, Style style, Formatting fallback) {
        if (style != null) {
            return Text.literal(value).setStyle(style);
        }
        return Text.literal(value).formatted(fallback);
    }

    public record KeyBind(Item item, BindSetting setting, float distance) {
    }

    private record ServerEvent(String name, String level, String owner, Vec3d position, String worldKey, int anarchy,
                               long timeOpen, long timeEnd) {
    }

    public List<KeyBind> getKeyBindings() {
        return keyBindings;
    }

    public ServerAssistant() {
        initialize();
    }

    private void updateBurstDelay(long now) {
        if (!extraBurstDelay.get()) {
            burstClicks = 0;
            dynamicExtraDelayTicks = 0;
            return;
        }

        if (now - lastClickTime <= 400L) {
            burstClicks++;
        } else {
            burstClicks = 1;
        }
        lastClickTime = now;
        dynamicExtraDelayTicks = Math.max(0, burstClicks - 2);
    }

    public static int getDynamicExtraDelayTicks() {
        return Math.max(0, dynamicExtraDelayTicks);
    }

    private void addEvent(String name, String level, String owner, Vec3d position, String worldKey, int anarchy, int timeOpenSeconds, int timeLootSeconds) {
        if (serverEvents.stream().anyMatch(event -> event.position.equals(position))) {
            return;
        }

        long openTime = System.currentTimeMillis() + timeOpenSeconds * 1000L;
        long endTime = openTime + timeLootSeconds * 1000L;
        serverEvents.add(new ServerEvent(name, level, owner, position, worldKey, anarchy, openTime, endTime));
    }

    private String getCurrentWorldKey() {
        return mc.world == null ? "" : mc.world.getRegistryKey().getValue().toString();
    }

    private String formatTime(double seconds) {
        if (seconds < 30.0) {
            return String.format("%.1fс", seconds).replace(',', '.').replace(".0с", "с");
        }
        return String.format("%.0fс", seconds).replace(',', '.');
    }

    public static boolean isCustomServer() {
        return server.is("Свой");
    }

    public static boolean allowAllItems() {
        return server.is("Свой") || server.is("Без разницы");
    }

    public static boolean isFunTimeMode() {
        return server.is("FunTime") || allowAllItems();
    }

    public static boolean isSpookyTimeMode() {
        return server.is("SpookyTime");
    }

    private boolean validDistance(float dist) {
        return dist == 0 || mc.world.getPlayers().stream().anyMatch(p -> p != mc.player && !Nexis.getInstance().getFriendStorage().isFriend(p.getName().getString()) && mc.player.distanceTo(p) <= dist);
    }
}
