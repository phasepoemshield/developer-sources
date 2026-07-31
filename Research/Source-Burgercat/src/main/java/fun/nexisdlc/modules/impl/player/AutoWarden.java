package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.baritone.BaritoneHelper;
import fun.nexisdlc.client.utils.baritone.BaritoneRotationHook;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.client.utils.render.main.world.WorldGeometryEmitter;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderLayers;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderer;
import fun.nexisdlc.mixins.accessors.BossBarHudAccessor;
import fun.nexisdlc.mixins.accessors.GameRendererAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import fun.nexisdlc.modules.api.settings.impl.StringSetting;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.WardenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PotionItem;
import net.minecraft.item.SplashPotionItem;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.joml.Matrix4f;

@FunctionAdd(name = "AutoWarden", alias = "Auto Warden", category = Category.Player,
        description = "Авто-лутер города вардена через Baritone")
public class AutoWarden extends Function {

    private static final int WARDEN_CHEST_Y_TOLERANCE = 1;
    private static final int EXTRA_CHEST_HOLOGRAM_Y_SCAN = 5;
    private static final int INVIS_SKIP_POTION_SECONDS = 180;
    private static final int MIN_DARENA_LEAVE_SECONDS = 12;
    private static final int MARKED_CHEST_APPROACH_SECONDS = 60;
    private static final double JOIN_HOLOGRAM_REFRESH_DISTANCE = 8.0;
    private static final List<BlockPos> WARDEN_CHESTS = List.of(
            new BlockPos(1982, -49, 1960),
            new BlockPos(1988, -56, 1946),
            new BlockPos(1940, -56, 1960),
            new BlockPos(1948, -56, 1957),
            new BlockPos(1941, -50, 1960),
            new BlockPos(1957, -56, 2014),
            new BlockPos(2016, -55, 1946),
            new BlockPos(1958, -55, 1987),
            new BlockPos(1988, -54, 1975),
            new BlockPos(1960, -55, 1993),
            new BlockPos(1985, -55, 2039),

            new BlockPos(2049, -55, 1957),
            new BlockPos(2033, -56, 1972),
            new BlockPos(1942, -55, 2041),
            new BlockPos(1948, -49, 2041),
            new BlockPos(2055, -49, 1968),

            new BlockPos(1968, -56, 2050)
    );

    private static final Set<BlockEntityType<?>> CHEST_TYPES = Set.of(
            BlockEntityType.CHEST,
            BlockEntityType.TRAPPED_CHEST
    );

    private static final Set<Item> VALUABLE_LOOT_ITEMS = Set.of(
            Items.NETHERITE_SCRAP,
            Items.NETHERITE_HELMET,
            Items.NETHERITE_CHESTPLATE,
            Items.NETHERITE_LEGGINGS,
            Items.NETHERITE_BOOTS,
            Items.TRIPWIRE_HOOK,
            Items.ENDER_EYE,
            Items.PAPER,
            Items.SPLASH_POTION,
            Items.SUGAR,
            Items.IRON_NUGGET,
            Items.ELYTRA,
            Items.NETHERITE_SWORD,
            Items.POPPED_CHORUS_FRUIT,
            Items.EXPERIENCE_BOTTLE,
            Items.TOTEM_OF_UNDYING,
            Items.GOLDEN_APPLE,
            Items.PLAYER_HEAD,
            Items.PHANTOM_MEMBRANE,
            Items.TNT,
            Items.EMERALD_ORE,
            Items.BEACON,
            Items.NETHERITE_PICKAXE,
            Items.DRIED_KELP,
            Items.AMETHYST_SHARD,
            Items.NETHER_STAR,
            Items.ENCHANTED_GOLDEN_APPLE,
            Items.FEATHER,
            Items.GUNPOWDER,
            Items.VILLAGER_SPAWN_EGG,
            Items.REDSTONE_TORCH
    );

    private static final Pattern TIMER_MMSS = Pattern.compile("(\\d{1,2})\\s*[:.]\\s*(\\d{1,2})");
    private static final Pattern TIMER_SECOND_UNIT = Pattern.compile("(\\d{1,3})\\s*(?:сек(?:унд(?:ы|у|а)?)?|s|sec|seconds?)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
    private static final Pattern TIMER_MINUTE_UNIT = Pattern.compile("(\\d{1,2})\\s*(?:мин(?:ут(?:ы|у|а)?)?|m|min|minutes?)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
    private static final Pattern TIMER_NUMBER = Pattern.compile("(\\d{1,3})");

    private static final int DARENA_SLOT = 24;
    private static final long COMMAND_DELAY_MS = 850L;
    private static final long PATH_REISSUE_MS = 1200L;
    private static final long DARENA_GUI_TIMEOUT_MS = 4000L;
    private static final long OPEN_RETRY_MS = 700L;
    private static final long INSPECT_COOLDOWN_MS = 30_000L;
    private static final long CHEST_INTERACTION_LOCK_MS = 0_000L;
    private static final long STORAGE_JOIN_JUMP_MS = 250L;
    private static final long DRINK_CLOSE_SCREEN_DELAY_MS = 120L;
    private static final long DRINK_SWAP_DELAY_MS = 180L;
    private static final long DRINK_SELECT_DELAY_MS = 80L;
    private static final long DRINK_MIN_USE_MS = 1200L;
    private static final long DRINK_TIMEOUT_MS = 5000L;
    private static final long DRINK_RESTORE_DELAY_MS = 120L;

    private static final float HUD_X = 150f;
    private static final float HUD_Y = 94f;
    private static final float HUD_PADDING_X = 9f;
    private static final float HUD_PADDING_Y = 7f;
    private static final float HUD_ROUNDING = 6f;
    private static final float HUD_TITLE_SIZE = 18f;
    private static final float HUD_TEXT_SIZE = 16f;
    private static final float HUD_LINE_GAP = 3f;

    private final StringSetting storageAnarchy = new StringSetting("Анархия склада", "308", "Номер анархии со складом", true);
    private final StringSetting wardenAnarchy = new StringSetting("Анархия вардена", "110", "Номер анархии с городом вардена", true);
    private final StringSetting homeName = new StringSetting("Название home", "home");
    private final SliderSetting carrotsToTake = new SliderSetting("Моркови брать", 3, 1, 16, 1);
    private final SliderSetting potionsToTake = new SliderSetting("Зелий брать", 1, 1, 4, 1);
    private final SliderSetting valuableItemsPerTrip = new SliderSetting("Количество ценных предметов за раз", 2, 1, 16, 1);
    private final SliderSetting lootTimerThreshold = new SliderSetting("Заходить при сек", 50, 15, 90, 1);
    private final SliderSetting homeWaitSeconds = new SliderSetting("Ожидание home", 8, 5, 12, 1);
    private final SliderSetting homeLeadSeconds = new SliderSetting("Запас до открытия", 2, 1, 5, 1);
    private final SliderSetting anarchyWaitSeconds = new SliderSetting("Ожидание /an", 4, 2, 10, 0.5f);
    private final SliderSetting stashScanRadius = new SliderSetting("Радиус склада", 8, 4, 16, 1);
    private final SliderSetting playerDangerRadius = new SliderSetting("Радиус игрока", 13, 5, 32, 1);
    private final SliderSetting wardenDangerRadius = new SliderSetting("Радиус вардена", 20, 8, 40, 1);
    private final BooleanSetting ignoreFriends = new BooleanSetting("Игнор друзей", true);
    private final BooleanSetting autoRespawn = new BooleanSetting("Авто-респавн", true);
    private final BooleanSetting showHud = new BooleanSetting("Показывать HUD", true);
    private final BooleanSetting showRoute = new BooleanSetting("Показывать маршрут", true);

    private final Map<BlockPos, ChestTimerInfo> chestTimers = new HashMap<>();
    private final Map<BlockPos, Long> inspectedCooldowns = new HashMap<>();
    private final Set<BlockPos> discoveredExtraWardenChests = new LinkedHashSet<>();
    private final Set<BlockPos> patrolVisitedChests = new LinkedHashSet<>();

    private Phase phase = Phase.IDLE;
    private long startedAt;
    private long phaseStartedAt;
    private long lastCommandAt;
    private long nextPathAt;
    private long nextOpenAt;
    private long nextRepathAt;
    private long wardenEnteredAt;
    private long targetOpenTime;
    private long storageJoinJumpStartedAt;

    private String action = "Ожидание";
    private BlockPos storageChest;
    private BlockPos supplyChest;
    private BlockPos currentGoal;
    private BlockPos currentChest;
    private BlockPos lastLootedChest;
    private BlockPos detourGoal;
    private BlockPos hologramRefreshGoal;

    private boolean pvpMode;
    private boolean wasDead;
    private boolean detouring;
    private boolean lastRouteRenderSetting;
    private boolean drinkingInvis;
    private boolean preparedWardenReturn;
    private boolean storageJoinJumpDone;
    private DrinkStage drinkStage = DrinkStage.IDLE;
    private long drinkStageStartedAt;
    private long drinkStartedAt;
    private boolean potionWasInventory;
    private int potionSourceSlot = -1;
    private int potionHotbarSlot = -1;
    private int restoreHotbarSlot = -1;

    private int cycles;
    private int lootedChests;
    private int valuableItemsThisTrip;
    private int collectedStacks;
    private int depositedStacks;
    private int depositSessionStart;
    private int deaths;

    public AutoWarden() {
        addSettings(storageAnarchy, wardenAnarchy, homeName, carrotsToTake, potionsToTake, valuableItemsPerTrip, lootTimerThreshold,
                homeWaitSeconds, homeLeadSeconds, anarchyWaitSeconds, stashScanRadius, playerDangerRadius,
                wardenDangerRadius, ignoreFriends, autoRespawn, showHud, showRoute);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        resetRuntime();
        applyAutoWardenBaritoneSettings();
        BaritoneRotationHook.enable();
        setPhase(Phase.GO_STORAGE_ANARCHY, "Перехожу на анархию склада");
    }

    @Override
    public void onDisable() {
        finishDrinkingIfNeeded();
        releaseUseKey();
        releaseStorageJoinJump();
        BaritoneHelper.stop();
        BaritoneRotationHook.disable();
        BaritoneHelper.applySettings(false, 2.0);
        super.onDisable();
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck()) {
            return;
        }

        scanWardenChestTimers();
        updatePvpMode();
        syncRouteRenderSetting();

        if (handleDeath()) {
            return;
        }

        if (handleWardenAggro()) {
            return;
        }

        updateDrinkingState();

        switch (phase) {
            case IDLE -> {
            }
            case GO_STORAGE_ANARCHY -> goStorageAnarchy();
            case WAIT_STORAGE_SWITCH -> waitStorageSwitch();
            case FIND_STASH -> findStash();
            case GO_STORAGE_CHEST -> goToStorageChest();
            case OPEN_STORAGE_CHEST -> openStorageChest();
            case DEPOSIT_LOOT -> depositLoot();
            case GO_SUPPLY_CHEST -> goToSupplyChest();
            case OPEN_SUPPLY_CHEST -> openSupplyChest();
            case TAKE_SUPPLIES -> takeSupplies();
            case GO_WARDEN_ANARCHY -> goWardenAnarchy();
            case WAIT_WARDEN_SWITCH -> waitWardenSwitch();
            case WAIT_HOME_TELEPORT -> waitHomeTeleport();
            case REFRESH_JOIN_HOLOGRAM_AWAY -> refreshJoinHologramAway();
            case REFRESH_JOIN_HOLOGRAM_BACK -> refreshJoinHologramBack();
            case PATROL_CITY -> patrolCity();
            case PATH_TO_SCAN_CHEST -> pathToScanChest();
            case INSPECT_CHEST -> inspectChest();
            case PREPARE_LOOT -> prepareLoot();
            case DARENA_COMMAND -> sendDarena();
            case DARENA_WAIT_GUI -> waitDarenaGui();
            case DARENA_CLICK -> clickDarenaSlot();
            case DARENA_STORAGE_COMMAND -> sendStorageDarena();
            case DARENA_STORAGE_WAIT_GUI -> waitStorageDarenaGui();
            case DARENA_STORAGE_CLICK -> clickStorageDarenaSlot();
            case WAIT_TIMER_HOME -> waitTimerHome();
            case WAIT_LOOT_TELEPORT -> waitLootTeleport();
            case OPEN_LOOT_CHEST -> openLootChest();
            case STEAL_LOOT -> stealLoot();
            case POST_LOOT_PATROL -> postLootPatrol();
            case WAIT_PVP_END_AT_CHEST -> waitPvpEndAtChest();
            case SET_HOME_AFTER_PVP -> setHomeAfterPvp();
            case RETURN_TO_STORAGE -> returnToStorage();
            case RECOVER_DEATH -> recoverAfterDeath();
            case BLOCKED -> {
            }
        }
    }

    @EventHandler
    public void onRenderHud(EventRender.Screen.UnderHud event) {
        if (!showHud.get() || mc.options.hudHidden || nullCheck()) {
            return;
        }

        Renderer2D renderer = event.getRenderer();
        var font = FontRegistry.INTER;
        List<String> lines = new ArrayList<>();
        lines.add("Текущая фаза: " + phase.label);
        lines.add("Прошло времени: " + formatDuration((System.currentTimeMillis() - startedAt) / 1000L));
        lines.add("Циклов: " + cycles);
        lines.add("Сундуков слутано: " + lootedChests);
        lines.add("Ценных за заход: " + valuableItemsThisTrip + "/" + valuableItemsPerTrip.get().intValue());
        lines.add("Ценностей собрано: " + collectedStacks);
        lines.add("Выгружено в хранилище: " + depositedStacks);
        lines.add("Смертей: " + deaths);
        lines.add("Действие: " + action);

        String title = "Auto Warden";
        float width = renderer.measureText(font, title, HUD_TITLE_SIZE).width;
        float height = HUD_PADDING_Y * 2f + renderer.measureText(font, title, HUD_TITLE_SIZE).height + HUD_LINE_GAP;
        for (String line : lines) {
            var metrics = renderer.measureText(font, line, HUD_TEXT_SIZE);
            width = Math.max(width, metrics.width);
            height += metrics.height + HUD_LINE_GAP;
        }
        width += HUD_PADDING_X * 2f;

        int bg = new Color(0, 0, 0, 178).getRGB();
        int titleColor = phase == Phase.BLOCKED ? 0xFFFF4D67 : 0xFFFF5A78;
        renderer.rect(HUD_X, HUD_Y, width, height, HUD_ROUNDING, bg);

        float y = HUD_Y + HUD_PADDING_Y;
        var titleMetrics = renderer.measureText(font, title, HUD_TITLE_SIZE);
        renderer.text(font, HUD_X + HUD_PADDING_X, y + titleMetrics.height, HUD_TITLE_SIZE, title, titleColor);
        y += titleMetrics.height + HUD_LINE_GAP + 1f;

        for (String line : lines) {
            var metrics = renderer.measureText(font, line, HUD_TEXT_SIZE);
            renderer.text(font, HUD_X + HUD_PADDING_X, y + metrics.height, HUD_TEXT_SIZE, line, 0xFFE7E7E7);
            y += metrics.height + HUD_LINE_GAP;
        }
    }

    @EventHandler
    public void onRenderWorld(EventRender.World event) {
        if (!showRoute.get() || nullCheck() || mc.world == null || mc.player == null) {
            return;
        }

        BlockPos target = getRouteRenderTarget();
        if (target == null) {
            return;
        }

        Camera camera = mc.gameRenderer.getCamera();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, event.getTicks(), true);
        Matrix4f posMatrix = new Matrix4f(event.getMatrixStack().peek().getPositionMatrix());
        Matrix4f projMatrix = new Matrix4f(mc.gameRenderer.getBasicProjectionMatrix(fov));
        int routeColor = detouring && detourGoal != null && detourGoal.equals(target)
                ? ColorUtils.rgba(255, 128, 48, 255)
                : ColorUtils.rgba(64, 210, 255, 255);

        try (WorldRenderer renderer = WorldRenderer.begin(mc, mc.getRenderTickCounter(), camera, posMatrix, projMatrix)) {
            Vec3d cameraPos = camera.getCameraPos();
            Vec3d start = mc.player.getEyePos().subtract(cameraPos);
            Vec3d end = target.toCenterPos().subtract(cameraPos);

            RenderLayer lineLayer = WorldRenderLayers.LINES_NO_DEPTH(3.0);
            WorldGeometryEmitter lineEmitter = renderer.lineEmitter(lineLayer);
            lineEmitter.emitLine(start, end, ColorUtils.injectAlpha(routeColor, 220));

            renderRouteTarget(renderer, camera, target, routeColor);
            renderer.flush();
        }
    }

    private void resetRuntime() {
        startedAt = System.currentTimeMillis();
        phaseStartedAt = startedAt;
        lastCommandAt = 0L;
        nextPathAt = 0L;
        nextOpenAt = 0L;
        nextRepathAt = 0L;
        wardenEnteredAt = 0L;
        targetOpenTime = 0L;
        storageJoinJumpStartedAt = 0L;
        action = "Запуск";
        storageChest = null;
        supplyChest = null;
        currentGoal = null;
        currentChest = null;
        lastLootedChest = null;
        detourGoal = null;
        hologramRefreshGoal = null;
        pvpMode = false;
        wasDead = false;
        detouring = false;
        lastRouteRenderSetting = showRoute.get();
        drinkingInvis = false;
        preparedWardenReturn = false;
        storageJoinJumpDone = false;
        drinkStage = DrinkStage.IDLE;
        drinkStageStartedAt = 0L;
        drinkStartedAt = 0L;
        potionWasInventory = false;
        potionSourceSlot = -1;
        potionHotbarSlot = -1;
        restoreHotbarSlot = -1;
        cycles = 0;
        lootedChests = 0;
        valuableItemsThisTrip = 0;
        collectedStacks = 0;
        depositedStacks = 0;
        depositSessionStart = 0;
        deaths = 0;
        chestTimers.clear();
        inspectedCooldowns.clear();
        discoveredExtraWardenChests.clear();
        patrolVisitedChests.clear();
    }

    private void applyAutoWardenBaritoneSettings() {
        lastRouteRenderSetting = showRoute.get();
        BaritoneHelper.applySettings(true, 0.0, lastRouteRenderSetting);
    }

    private void syncRouteRenderSetting() {
        boolean current = showRoute.get();
        if (current == lastRouteRenderSetting) {
            return;
        }

        lastRouteRenderSetting = current;
        BaritoneHelper.applySettings(true, 0.0, current);
    }

    private BlockPos getRouteRenderTarget() {
        if (detouring && detourGoal != null) {
            return detourGoal;
        }
        if (currentGoal != null) {
            return currentGoal;
        }

        return switch (phase) {
            case GO_STORAGE_CHEST, OPEN_STORAGE_CHEST, DEPOSIT_LOOT -> storageChest;
            case GO_SUPPLY_CHEST, OPEN_SUPPLY_CHEST, TAKE_SUPPLIES -> supplyChest;
            case REFRESH_JOIN_HOLOGRAM_AWAY -> hologramRefreshGoal;
            case REFRESH_JOIN_HOLOGRAM_BACK -> currentChest;
            case PATH_TO_SCAN_CHEST, INSPECT_CHEST, PREPARE_LOOT, WAIT_TIMER_HOME,
                 WAIT_LOOT_TELEPORT, OPEN_LOOT_CHEST, STEAL_LOOT, POST_LOOT_PATROL,
                 WAIT_PVP_END_AT_CHEST, SET_HOME_AFTER_PVP, DARENA_STORAGE_COMMAND,
                 DARENA_STORAGE_WAIT_GUI, DARENA_STORAGE_CLICK -> currentChest;
            default -> null;
        };
    }

    private void renderRouteTarget(WorldRenderer renderer, Camera camera, BlockPos target, int color) {
        Vec3d cameraPos = camera.getCameraPos();
        Box box = new Box(target).expand(0.03).offset(-cameraPos.x, -cameraPos.y, -cameraPos.z);
        int fillColor = ColorUtils.injectAlpha(color, 58);
        int outlineColor = ColorUtils.injectAlpha(color, 235);

        MatrixStack identity = new MatrixStack();
        WorldGeometryEmitter fillEmitter = new WorldGeometryEmitter(
                camera,
                identity.peek(),
                renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_ADDITIVE_NO_DEPTH()));
        emitRouteBoxFill(fillEmitter, box, fillColor);

        RenderLayer outlineLayer = WorldRenderLayers.LINES_NO_DEPTH(2.2);
        WorldGeometryEmitter outlineEmitter = renderer.lineEmitter(outlineLayer);
        emitRouteBoxOutline(outlineEmitter, box, outlineColor);
    }

    private void emitRouteBoxFill(WorldGeometryEmitter emitter, Box box, int color) {
        Vec3d p000 = new Vec3d(box.minX, box.minY, box.minZ);
        Vec3d p001 = new Vec3d(box.minX, box.minY, box.maxZ);
        Vec3d p010 = new Vec3d(box.minX, box.maxY, box.minZ);
        Vec3d p011 = new Vec3d(box.minX, box.maxY, box.maxZ);
        Vec3d p100 = new Vec3d(box.maxX, box.minY, box.minZ);
        Vec3d p101 = new Vec3d(box.maxX, box.minY, box.maxZ);
        Vec3d p110 = new Vec3d(box.maxX, box.maxY, box.minZ);
        Vec3d p111 = new Vec3d(box.maxX, box.maxY, box.maxZ);

        emitter.emitQuad(p000, p100, p110, p010, color);
        emitter.emitQuad(p001, p011, p111, p101, color);
        emitter.emitQuad(p000, p001, p101, p100, color);
        emitter.emitQuad(p010, p110, p111, p011, color);
        emitter.emitQuad(p000, p010, p011, p001, color);
        emitter.emitQuad(p100, p101, p111, p110, color);
    }

    private void emitRouteBoxOutline(WorldGeometryEmitter emitter, Box box, int color) {
        Vec3d p000 = new Vec3d(box.minX, box.minY, box.minZ);
        Vec3d p001 = new Vec3d(box.minX, box.minY, box.maxZ);
        Vec3d p010 = new Vec3d(box.minX, box.maxY, box.minZ);
        Vec3d p011 = new Vec3d(box.minX, box.maxY, box.maxZ);
        Vec3d p100 = new Vec3d(box.maxX, box.minY, box.minZ);
        Vec3d p101 = new Vec3d(box.maxX, box.minY, box.maxZ);
        Vec3d p110 = new Vec3d(box.maxX, box.maxY, box.minZ);
        Vec3d p111 = new Vec3d(box.maxX, box.maxY, box.maxZ);

        emitter.emitLine(p000, p100, color);
        emitter.emitLine(p100, p101, color);
        emitter.emitLine(p101, p001, color);
        emitter.emitLine(p001, p000, color);
        emitter.emitLine(p010, p110, color);
        emitter.emitLine(p110, p111, color);
        emitter.emitLine(p111, p011, color);
        emitter.emitLine(p011, p010, color);
        emitter.emitLine(p000, p010, color);
        emitter.emitLine(p100, p110, color);
        emitter.emitLine(p101, p111, color);
        emitter.emitLine(p001, p011, color);
    }

    private void goStorageAnarchy() {
        closeHandledScreen();
        BaritoneHelper.stop();
        if (sendCommand("an" + sanitizeNumber(storageAnarchy.get(), "308"))) {
            storageChest = null;
            supplyChest = null;
            currentGoal = null;
            storageJoinJumpDone = false;
            storageJoinJumpStartedAt = 0L;
            setPhase(Phase.WAIT_STORAGE_SWITCH, "Жду переход на склад");
        }
    }

    private void waitStorageSwitch() {
        if (!phaseElapsed((long) (anarchyWaitSeconds.get() * 1000L))) {
            action = "Жду загрузку анархии склада";
            return;
        }

        if (!storageJoinJumpDone) {
            if (storageJoinJumpStartedAt == 0L) {
                storageJoinJumpStartedAt = System.currentTimeMillis();
                if (mc.options != null) {
                    mc.options.jumpKey.setPressed(true);
                }
                action = "Прыгаю после захода на склад";
                return;
            }

            if (System.currentTimeMillis() - storageJoinJumpStartedAt < STORAGE_JOIN_JUMP_MS) {
                if (mc.options != null) {
                    mc.options.jumpKey.setPressed(true);
                }
                action = "Прыгаю после захода на склад";
                return;
            }

            releaseStorageJoinJump();
            storageJoinJumpDone = true;
        }
        setPhase(Phase.FIND_STASH, "Ищу сундуки склада");
    }

    private void findStash() {
        StashPair pair = findStashPair();
        if (pair == null) {
            BaritoneHelper.stop();
            setPhase(Phase.BLOCKED, "Не найден склад: нужен сундук с табличкой и сундук без таблички рядом");
            return;
        }

        storageChest = pair.storageChest;
        supplyChest = pair.supplyChest;

        if (hasDepositableLoot()) {
            setPhase(Phase.GO_STORAGE_CHEST, "Иду к сундуку хранилища");
        } else {
            setPhase(Phase.GO_SUPPLY_CHEST, "Иду к сундуку расходников");
        }
    }

    private void goToStorageChest() {
        if (storageChest == null) {
            setPhase(Phase.FIND_STASH, "Повторно ищу сундук хранилища");
            return;
        }

        if (distanceTo(storageChest) <= 4.5) {
            BaritoneHelper.stop();
            setPhase(Phase.OPEN_STORAGE_CHEST, "Открываю хранилище");
            return;
        }
        ensurePathTo(storageChest, 2, "Иду к хранилищу");
    }

    private void openStorageChest() {
        if (storageChest == null || hasSignNear(storageChest)) {
            storageChest = null;
            setPhase(Phase.FIND_STASH, "Складовой сундук определён неверно, ищу стеш заново");
            return;
        }
        if (mc.currentScreen instanceof GenericContainerScreen) {
            depositSessionStart = depositedStacks;
            setPhase(Phase.DEPOSIT_LOOT, "Складываю лут");
            return;
        }
        retryOpenBlock(storageChest, "Открываю сундук хранилища");
    }

    private void depositLoot() {
        if (storageChest == null || hasSignNear(storageChest)) {
            closeHandledScreen();
            storageChest = null;
            setPhase(Phase.FIND_STASH, "Не складываю в сундук с табличкой, ищу склад заново");
            return;
        }
        if (!(mc.currentScreen instanceof GenericContainerScreen screen)) {
            setPhase(Phase.OPEN_STORAGE_CHEST, "Переоткрываю хранилище");
            return;
        }

        GenericContainerScreenHandler container = screen.getScreenHandler();
        if (depositOneLootStack(container)) {
            action = "Складываю лут в хранилище";
            return;
        }

        closeHandledScreen();
        if (depositedStacks > depositSessionStart) {
            cycles++;
        }
        valuableItemsThisTrip = 0;
        setPhase(Phase.GO_SUPPLY_CHEST, "Проверяю расходники");
    }

    private void goToSupplyChest() {
        if (supplyChest == null) {
            setPhase(Phase.FIND_STASH, "Повторно ищу сундук расходников");
            return;
        }

        if (hasRequiredSupplies()) {
            setPhase(Phase.GO_WARDEN_ANARCHY, "Расходники уже есть");
            return;
        }

        if (distanceTo(supplyChest) <= 4.5) {
            BaritoneHelper.stop();
            setPhase(Phase.OPEN_SUPPLY_CHEST, "Открываю расходники");
            return;
        }
        ensurePathTo(supplyChest, 2, "Иду к расходникам");
    }

    private void openSupplyChest() {
        if (mc.currentScreen instanceof GenericContainerScreen) {
            setPhase(Phase.TAKE_SUPPLIES, "Беру расходники");
            return;
        }
        retryOpenBlock(supplyChest, "Открываю сундук расходников");
    }

    private void takeSupplies() {
        if (hasRequiredSupplies()) {
            closeHandledScreen();
            selectEmptyHandSlot();
            setPhase(Phase.GO_WARDEN_ANARCHY, "Расходники собраны");
            return;
        }

        if (!(mc.currentScreen instanceof GenericContainerScreen screen)) {
            setPhase(Phase.OPEN_SUPPLY_CHEST, "Переоткрываю расходники");
            return;
        }

        if (takeOneSupplyStack(screen.getScreenHandler())) {
            action = "Добираю нужные расходники";
            return;
        }

        action = "Нет расходников, пополните сундук с табличкой";
        if (phaseElapsed(5000L)) {
            setPhase(Phase.BLOCKED, "Нет нужных расходников в сундуке с табличкой");
        }
    }

    private void goWardenAnarchy() {
        closeHandledScreen();
        BaritoneHelper.stop();
        if (!hasRequiredSupplies()) {
            setPhase(Phase.GO_STORAGE_ANARCHY, "Не хватает расходников, возвращаюсь на склад");
            return;
        }
        if (sendCommand("an" + sanitizeNumber(wardenAnarchy.get(), "110"))) {
            valuableItemsThisTrip = 0;
            currentGoal = null;
            patrolVisitedChests.clear();
            setPhase(Phase.WAIT_WARDEN_SWITCH, "Жду переход на анархию вардена");
        }
    }

    private void waitWardenSwitch() {
        if (!phaseElapsed((long) (anarchyWaitSeconds.get() * 1000L))) {
            action = "Жду загрузку анархии вардена";
            return;
        }

        wardenEnteredAt = System.currentTimeMillis();
        if (!hasInvisibilityEffect() && !drinkingInvis) {
            startDrinkInvis();
        }
        if (preparedWardenReturn && currentChest != null) {
            hologramRefreshGoal = null;
            setPhase(Phase.REFRESH_JOIN_HOLOGRAM_AWAY, "Уже у сохранённого сундука, обновляю голограмму");
            return;
        }
        if (sendCommand("home " + cleanHomeName())) {
            setPhase(Phase.WAIT_HOME_TELEPORT, "Пью невидимость и жду /home");
        }
    }

    private void waitHomeTeleport() {
        if (!phaseElapsed((long) (homeWaitSeconds.get() * 1000L))) {
            action = "Телепортируюсь на home";
            return;
        }
        setPhase(Phase.PATROL_CITY, "Начинаю патруль города");
    }

    private void refreshJoinHologramAway() {
        if (currentChest == null) {
            preparedWardenReturn = false;
            setPhase(Phase.PATROL_CITY, "Сохранённый сундук потерян, выбираю новый");
            return;
        }

        BlockPos targetChest = resolveWardenChestPos(currentChest);
        if (distanceTo(targetChest) >= JOIN_HOLOGRAM_REFRESH_DISTANCE - 1.0) {
            setPhase(Phase.REFRESH_JOIN_HOLOGRAM_BACK, "Далеко от сундука, возвращаюсь для обновления голограммы");
            return;
        }

        if (hologramRefreshGoal == null) {
            hologramRefreshGoal = computeHologramRefreshGoal(targetChest);
        }

        if (hologramRefreshGoal == null) {
            setPhase(Phase.REFRESH_JOIN_HOLOGRAM_BACK, "Не удалось выбрать точку отхода, возвращаюсь к сундуку");
            return;
        }

        if (distanceTo(hologramRefreshGoal) <= 2.5) {
            BaritoneHelper.stop();
            currentGoal = null;
            hologramRefreshGoal = null;
            setPhase(Phase.REFRESH_JOIN_HOLOGRAM_BACK, "Отошёл, возвращаюсь к сундуку");
            return;
        }

        ensurePathTo(hologramRefreshGoal, 2, "Отхожу от сундука, чтобы обновить голограмму");
    }

    private void refreshJoinHologramBack() {
        if (currentChest == null) {
            preparedWardenReturn = false;
            setPhase(Phase.PATROL_CITY, "Сохранённый сундук потерян, выбираю новый");
            return;
        }

        BlockPos targetChest = resolveWardenChestPos(currentChest);
        if (distanceTo(targetChest) > 2.5) {
            ensurePathTo(targetChest, 2, "Возвращаюсь к сундуку после обновления голограммы");
            return;
        }

        BaritoneHelper.stop();
        currentGoal = null;
        hologramRefreshGoal = null;
        preparedWardenReturn = false;
        setPhase(Phase.INSPECT_CHEST, "Голограмма обновлена, проверяю сундук");
    }

    private void patrolCity() {
        BlockPos target = selectNearestSafeChest(null);
        if (target == null) {
            BaritoneHelper.stop();
            action = formatMarkedChestWaitAction();
            return;
        }

        currentChest = target;
        setPhase(Phase.PATH_TO_SCAN_CHEST, "Иду к ближайшему сундуку");
    }

    private void pathToScanChest() {
        if (currentChest == null) {
            setPhase(Phase.PATROL_CITY, "Выбираю сундук для проверки");
            return;
        }

        BlockPos targetChest = resolveWardenChestPos(currentChest);
        if (handleRouteDanger(targetChest)) {
            return;
        }

        if (distanceTo(targetChest) <= 2.5) {
            BaritoneHelper.stop();
            setPhase(Phase.INSPECT_CHEST, "Проверяю таймер сундука");
            return;
        }

        ensurePathTo(targetChest, 2, "Бегу к сундуку для проверки");
    }

    private void inspectChest() {
        if (currentChest == null) {
            setPhase(Phase.PATROL_CITY, "Выбираю следующий сундук");
            return;
        }

        markPatrolVisited(currentChest);
        ChestTimerInfo info = chestTimers.get(currentChest);
        if (info != null && info.isLootable()) {
            targetOpenTime = System.currentTimeMillis();
            setPhase(Phase.OPEN_LOOT_CHEST, "Голограммы нет, открываю сундук");
            return;
        }
        if (info != null && info.getRemainingSeconds() <= lootTimerThreshold.get().intValue()) {
            targetOpenTime = info.timerEndTime;
            if (info.getRemainingSeconds() <= MIN_DARENA_LEAVE_SECONDS) {
                setPhase(Phase.OPEN_LOOT_CHEST, "До открытия меньше 12 сек, остаюсь у сундука");
                return;
            }
            setPhase(Phase.PREPARE_LOOT, "Сундук скоро откроется, сохраняю home");
            return;
        }
        if (info != null && shouldApproachMarkedChest(info)) {
            action = "Помеченный сундук скоро откроется: " + formatDuration(info.getRemainingSeconds());
            return;
        }
        if (info == null && isWardenOpenBlocked()) {
            long left = Math.max(0L, (CHEST_INTERACTION_LOCK_MS - (System.currentTimeMillis() - wardenEnteredAt)) / 1000L);
            action = "Жду серверную блокировку и голограмму: " + formatDuration(left);
            return;
        }
        if (info == null && !isWardenOpenBlocked()) {
            targetOpenTime = System.currentTimeMillis();
            setPhase(Phase.OPEN_LOOT_CHEST, "Голограммы нет, открываю сундук");
            return;
        }

        skipCurrentChest(info);
    }

    private void skipCurrentChest(ChestTimerInfo info) {
        if (currentChest == null) {
            setPhase(Phase.PATROL_CITY, "Выбираю следующий сундук");
            return;
        }

        BaritoneHelper.stop();
        currentGoal = null;
        markPatrolVisited(currentChest);
        inspectedCooldowns.put(currentChest, System.currentTimeMillis() + INSPECT_COOLDOWN_MS);
        String timerText = info == null ? "таймер не найден" : formatDuration(info.getRemainingSeconds());
        action = "Сундук не готов: " + timerText;
        BlockPos next = selectNearestSafeChest(currentChest);
        if (next == null) {
            setPhase(Phase.PATROL_CITY, formatMarkedChestWaitAction());
            return;
        }
        currentChest = next;
        setPhase(Phase.PATH_TO_SCAN_CHEST, "Иду к следующему сундуку");
    }

    private boolean isChestReadySoon(ChestTimerInfo info) {
        return info != null && (info.isLootable() || info.getRemainingSeconds() <= lootTimerThreshold.get().intValue());
    }

    private boolean shouldApproachMarkedChest(ChestTimerInfo info) {
        return info != null && (info.isLootable() || info.getRemainingSeconds() <= MARKED_CHEST_APPROACH_SECONDS);
    }

    private void prepareLoot() {
        ChestTimerInfo info = currentChest == null ? null : chestTimers.get(currentChest);
        if (info != null && info.getRemainingSeconds() <= MIN_DARENA_LEAVE_SECONDS) {
            targetOpenTime = info.timerEndTime;
            setPhase(Phase.OPEN_LOOT_CHEST, "До открытия меньше 12 сек, не ухожу на /darena");
            return;
        }

        BaritoneHelper.stop();
        if (sendCommand("sethome " + cleanHomeName())) {
            setPhase(Phase.DARENA_COMMAND, "Home сохранён, выхожу через /darena");
        }
    }

    private void sendDarena() {
        if (sendCommand("darena")) {
            setPhase(Phase.DARENA_WAIT_GUI, "Жду меню выхода с арены");
        }
    }

    private void waitDarenaGui() {
        if (mc.currentScreen != null && mc.player.currentScreenHandler instanceof GenericContainerScreenHandler) {
            setPhase(Phase.DARENA_CLICK, "Подтверждаю выход с арены");
            return;
        }
        if (phaseElapsed(DARENA_GUI_TIMEOUT_MS)) {
            setPhase(Phase.WAIT_TIMER_HOME, "Меню /darena не появилось, жду таймер");
        }
    }

    private void clickDarenaSlot() {
        if (mc.player.currentScreenHandler instanceof GenericContainerScreenHandler container) {
            mc.interactionManager.clickSlot(container.syncId, DARENA_SLOT, 0, SlotActionType.PICKUP, mc.player);
        }
        closeHandledScreen();
        setPhase(Phase.WAIT_TIMER_HOME, "Жду момент для /home к сундуку");
    }

    private void waitTimerHome() {
        if (currentChest == null) {
            setPhase(Phase.PATROL_CITY, "Потерян целевой сундук");
            return;
        }

        ChestTimerInfo info = chestTimers.get(currentChest);
        long remaining = info != null ? info.getRemainingSeconds() : Math.max(0L, (targetOpenTime - System.currentTimeMillis()) / 1000L);
        long sendHomeAt = homeWaitSeconds.get().longValue() + homeLeadSeconds.get().longValue();
        if (remaining > sendHomeAt) {
            action = "Жду открытия сундука: " + formatDuration(remaining);
            return;
        }

        if (!hasInvisibilityEffect() && !drinkingInvis) {
            startDrinkInvis();
        }
        if (sendCommand("home " + cleanHomeName())) {
            setPhase(Phase.WAIT_LOOT_TELEPORT, "Телепортируюсь к сундуку перед открытием");
        }
    }

    private void waitLootTeleport() {
        long remaining = Math.max(0L, (targetOpenTime - System.currentTimeMillis()) / 1000L);
        if (!phaseElapsed((long) (homeWaitSeconds.get() * 1000L))) {
            action = "Жду /home, до открытия: " + formatDuration(remaining);
            return;
        }
        setPhase(Phase.OPEN_LOOT_CHEST, "Открываю сундук вардена");
    }

    private void openLootChest() {
        if (currentChest == null) {
            setPhase(Phase.PATROL_CITY, "Целевой сундук потерян");
            return;
        }

        if (isWardenOpenBlocked()) {
            long left = Math.max(0L, (CHEST_INTERACTION_LOCK_MS - (System.currentTimeMillis() - wardenEnteredAt)) / 1000L);
            action = "Жду серверную блокировку сундуков: " + formatDuration(left);
            return;
        }

        ChestTimerInfo info = chestTimers.get(currentChest);
        if (info != null && !info.isLootable()) {
            int remaining = info.getRemainingSeconds();
            if (info.wasHologramSeen()) {
                action = remaining > 0
                        ? "До открытия: " + formatDuration(remaining)
                        : "Таймер 00:00, жду исчезновения голограммы";
                return;
            }
            if (remaining > 1) {
                action = "До открытия: " + formatDuration(remaining);
                return;
            }
        }

        if (mc.currentScreen instanceof GenericContainerScreen) {
            setPhase(Phase.STEAL_LOOT, "Лутаю сундук");
            return;
        }

        BlockPos targetChest = resolveWardenChestPos(currentChest);
        if (distanceTo(targetChest) > 2.5) {
            ensurePathTo(targetChest, 2, "Подхожу к сундуку для лута");
            return;
        }
        retryOpenBlock(targetChest, "Открываю сундук вардена");
    }

    private void stealLoot() {
        if (!(mc.currentScreen instanceof GenericContainerScreen screen)) {
            setPhase(Phase.OPEN_LOOT_CHEST, "Переоткрываю сундук для лута");
            return;
        }

        if (shouldReturnToStorage()) {
            closeHandledScreen();
            finishCurrentLoot("Лимит ценных предметов набран, ухожу на склад");
            return;
        }

        if (isInventoryFull()) {
            closeHandledScreen();
            finishCurrentLoot("Инвентарь заполнен, ухожу на склад");
            return;
        }

        if (stealOneLootStack(screen.getScreenHandler())) {
            action = "Забираю ценный предмет из сундука";
            return;
        }

        closeHandledScreen();
        finishCurrentLoot("В сундуке больше нет ценных предметов");
    }

    private void finishCurrentLoot(String actionText) {
        lootedChests++;
        lastLootedChest = currentChest;
        markPatrolVisited(currentChest);
        if (currentChest != null) {
            inspectedCooldowns.put(currentChest, System.currentTimeMillis() + INSPECT_COOLDOWN_MS);
        }
        setPhase(Phase.POST_LOOT_PATROL, actionText);
    }

    private void postLootPatrol() {
        if (shouldReturnToStorage()) {
            if (!pvpMode) {
                preparedWardenReturn = false;
                setPhase(Phase.RETURN_TO_STORAGE, "Ценные предметы набраны, ухожу на склад");
            } else {
                moveToSafeWaitChest("Ценные предметы набраны, жду PVP-кд перед складом");
            }
            return;
        }

        BlockPos target = selectNearestSafeChest(lastLootedChest);
        if (target == null) {
            if (!pvpMode) {
                setPhase(Phase.RETURN_TO_STORAGE, "PVP окончен, безопасных сундуков нет");
            } else {
                action = "Жду окончание PVP, безопасных сундуков нет";
            }
            return;
        }

        currentChest = target;
        if (pvpMode) {
            setPhase(Phase.WAIT_PVP_END_AT_CHEST, "Иду к следующему сундуку, пока идёт PVP");
        } else {
            setPhase(Phase.PATH_TO_SCAN_CHEST, "Иду к следующему сундуку");
        }
    }

    private void waitPvpEndAtChest() {
        if (currentChest == null) {
            setPhase(Phase.POST_LOOT_PATROL, "Выбираю сундук после лута");
            return;
        }

        BlockPos targetChest = resolveWardenChestPos(currentChest);
        if (handleRouteDanger(targetChest)) {
            return;
        }

        if (distanceTo(targetChest) > 2.5) {
            ensurePathTo(targetChest, 2, "Иду к следующему сундуку после лута");
            return;
        }

        BaritoneHelper.stop();
        currentGoal = null;
        if (pvpMode) {
            action = shouldReturnToStorage()
                    ? "Жду окончание PVP перед переходом на склад"
                    : "Жду окончание PVP у следующего сундука";
            return;
        }

        if (shouldReturnToStorage()) {
            preparedWardenReturn = false;
            setPhase(Phase.RETURN_TO_STORAGE, "PVP окончен, перехожу на склад");
        } else {
            setPhase(Phase.INSPECT_CHEST, "PVP окончен, проверяю следующий сундук");
        }
    }

    private boolean shouldReturnToStorage() {
        return isInventoryFull() || valuableItemsThisTrip >= valuableItemsPerTrip.get().intValue();
    }

    private void moveToSafeWaitChest(String actionText) {
        BlockPos target = selectNearestSafeChest(lastLootedChest);
        if (target == null) {
            preparedWardenReturn = false;
            if (!pvpMode) {
                setPhase(Phase.RETURN_TO_STORAGE, actionText + ", безопасных сундуков нет");
            } else {
                action = actionText + ", безопасных сундуков нет";
            }
            return;
        }

        currentChest = target;
        setPhase(Phase.WAIT_PVP_END_AT_CHEST, actionText);
    }

    private void returnToStorage() {
        if (pvpMode) {
            BaritoneHelper.stop();
            currentGoal = null;
            action = "Жду окончание PVP перед переходом на склад";
            return;
        }
        setPhase(Phase.GO_STORAGE_ANARCHY, "Возвращаюсь на склад");
    }

    private void setHomeAfterPvp() {
        if (sendCommand("sethome " + cleanHomeName())) {
            preparedWardenReturn = currentChest != null;
            setPhase(Phase.DARENA_STORAGE_COMMAND, "Home у следующего сундука сохранён, выхожу через /darena");
        }
    }

    private void sendStorageDarena() {
        if (sendCommand("darena")) {
            setPhase(Phase.DARENA_STORAGE_WAIT_GUI, "Жду меню выхода с арены перед складом");
        }
    }

    private void waitStorageDarenaGui() {
        if (mc.currentScreen != null && mc.player.currentScreenHandler instanceof GenericContainerScreenHandler) {
            setPhase(Phase.DARENA_STORAGE_CLICK, "Подтверждаю выход с арены перед складом");
            return;
        }
        if (phaseElapsed(DARENA_GUI_TIMEOUT_MS)) {
            setPhase(Phase.RETURN_TO_STORAGE, "Меню /darena не появилось, перехожу на склад");
        }
    }

    private void clickStorageDarenaSlot() {
        if (mc.player.currentScreenHandler instanceof GenericContainerScreenHandler container) {
            mc.interactionManager.clickSlot(container.syncId, DARENA_SLOT, 0, SlotActionType.PICKUP, mc.player);
        }
        closeHandledScreen();
        setPhase(Phase.RETURN_TO_STORAGE, "Вышел с арены, перехожу на склад");
    }

    private void recoverAfterDeath() {
        BaritoneHelper.stop();
        closeHandledScreen();
        if (phaseElapsed(1800L) && mc.player.isAlive()) {
            setPhase(Phase.GO_STORAGE_ANARCHY, "После смерти иду за расходниками");
        } else {
            action = "Восстановление после смерти";
        }
    }

    private boolean handleDeath() {
        boolean deathScreen = mc.currentScreen instanceof DeathScreen;
        boolean dead = deathScreen || !mc.player.isAlive();
        if (!dead) {
            if (wasDead) {
                wasDead = false;
                setPhase(Phase.GO_STORAGE_ANARCHY, "Смерть обработана, иду на склад");
            }
            return false;
        }

        if (!wasDead) {
            deaths++;
            wasDead = true;
            preparedWardenReturn = false;
            hologramRefreshGoal = null;
            finishDrinkingIfNeeded();
            releaseUseKey();
            BaritoneHelper.stop();
            setPhase(Phase.RECOVER_DEATH, "Бот погиб, восстанавливаю цикл");
        }

        if (deathScreen && autoRespawn.get()) {
            mc.player.requestRespawn();
        }
        return true;
    }

    private boolean handleWardenAggro() {
        if (isEmergencyDarenaPhase() || mc.world == null || mc.player == null) {
            return false;
        }

        WardenEntity warden = findAggroedWarden();
        if (warden == null) {
            return false;
        }

        finishDrinkingIfNeeded();
        releaseUseKey();
        closeHandledScreen();
        BaritoneHelper.stop();
        currentGoal = null;
        preparedWardenReturn = false;
        hologramRefreshGoal = null;
        setPhase(Phase.DARENA_STORAGE_COMMAND, "Варден заагрился, аварийно выхожу через /darena");
        return true;
    }

    private boolean isEmergencyDarenaPhase() {
        return phase == Phase.DARENA_COMMAND
                || phase == Phase.DARENA_WAIT_GUI
                || phase == Phase.DARENA_CLICK
                || phase == Phase.DARENA_STORAGE_COMMAND
                || phase == Phase.DARENA_STORAGE_WAIT_GUI
                || phase == Phase.DARENA_STORAGE_CLICK
                || phase == Phase.GO_STORAGE_ANARCHY
                || phase == Phase.WAIT_STORAGE_SWITCH
                || phase == Phase.FIND_STASH
                || phase == Phase.GO_STORAGE_CHEST
                || phase == Phase.OPEN_STORAGE_CHEST
                || phase == Phase.DEPOSIT_LOOT
                || phase == Phase.GO_SUPPLY_CHEST
                || phase == Phase.OPEN_SUPPLY_CHEST
                || phase == Phase.TAKE_SUPPLIES
                || phase == Phase.RETURN_TO_STORAGE
                || phase == Phase.RECOVER_DEATH
                || phase == Phase.BLOCKED;
    }

    private WardenEntity findAggroedWarden() {
        for (Entity entity : mc.world.getEntities()) {
            if (entity instanceof WardenEntity warden
                    && warden.isAlive()
                    && warden.getTarget() == mc.player) {
                return warden;
            }
        }
        return null;
    }

    private void updatePvpMode() {
        pvpMode = false;
        BossBarHud bossBarHud = mc.inGameHud == null ? null : mc.inGameHud.getBossBarHud();
        if (bossBarHud == null) {
            return;
        }

        try {
            Map<UUID, ClientBossBar> bossBars = ((BossBarHudAccessor) bossBarHud).getBossBars();
            if (bossBars == null) {
                return;
            }
            for (ClientBossBar bossBar : bossBars.values()) {
                String name = bossBar.getName().getString().toLowerCase(Locale.ROOT);
                if (name.contains("pvp") || name.contains("пвп") || name.contains("режим боя")) {
                    pvpMode = true;
                    return;
                }
            }
        } catch (Throwable ignored) {
        }
    }

    private void scanWardenChestTimers() {
        if (mc.world == null || mc.player == null) {
            return;
        }

        scanExtraWardenChestsFromHolograms();

        for (BlockPos pos : WARDEN_CHESTS) {
            if (distanceToWardenChest(pos) > 40.0) {
                continue;
            }

            int timer = findTimerNearWardenChest(pos);
            ChestTimerInfo info = chestTimers.get(pos);
            if (timer >= 0) {
                if (info == null) {
                    chestTimers.put(pos, new ChestTimerInfo(timer));
                } else {
                    info.updateTimer(timer);
                }
            } else if (info != null) {
                if (isWardenOpenBlocked()) {
                    info.updateMissingDuringProtection();
                } else {
                    info.updateMissingHologram();
                }
            }
        }
    }

    private void scanExtraWardenChestsFromHolograms() {
        Box scanBox = mc.player.getBoundingBox().expand(80.0);
        boolean added = false;

        for (ArmorStandEntity entity : mc.world.getEntitiesByClass(
                ArmorStandEntity.class,
                scanBox,
                armorStand -> armorStand.isCustomNameVisible()
                        && armorStand.getCustomName() != null
                        && parseTimer(armorStand.getCustomName()) >= 0
        )) {
            BlockPos chestPos = findChestInHologramColumn(entity.getBlockPos());
            if (chestPos == null || isKnownWardenChest(chestPos)) {
                continue;
            }

            if (discoveredExtraWardenChests.add(chestPos)) {
                added = true;
            }
        }

        if (added) {
            System.out.println("AutoWarden найденные коорды: " + formatDiscoveredExtraWardenChests());
        }
    }

    private BlockPos findChestInHologramColumn(BlockPos hologramPos) {
        if (hologramPos == null) {
            return null;
        }

        if (isChestBlock(hologramPos)) {
            return hologramPos;
        }

        for (int offset = 1; offset <= EXTRA_CHEST_HOLOGRAM_Y_SCAN; offset++) {
            BlockPos down = hologramPos.down(offset);
            if (isChestBlock(down)) {
                return down;
            }

            BlockPos up = hologramPos.up(offset);
            if (isChestBlock(up)) {
                return up;
            }
        }

        return null;
    }

    private boolean isKnownWardenChest(BlockPos pos) {
        if (pos == null) {
            return false;
        }

        for (BlockPos known : WARDEN_CHESTS) {
            if (known.getX() == pos.getX()
                    && known.getZ() == pos.getZ()
                    && Math.abs(known.getY() - pos.getY()) <= WARDEN_CHEST_Y_TOLERANCE) {
                return true;
            }
        }
        return false;
    }

    private String formatDiscoveredExtraWardenChests() {
        if (discoveredExtraWardenChests.isEmpty()) {
            return "";
        }

        return discoveredExtraWardenChests.stream()
                .map(pos -> pos.getX() + " " + pos.getY() + " " + pos.getZ())
                .reduce((left, right) -> left + " + " + right)
                .orElse("");
    }

    private int findTimerNearWardenChest(BlockPos basePos) {
        int bestTimer = -1;
        for (BlockPos pos : wardenChestVariants(basePos)) {
            int timer = findTimerNearBlock(pos);
            if (timer >= 0 && (bestTimer < 0 || timer < bestTimer)) {
                bestTimer = timer;
            }
        }
        return bestTimer;
    }

    private int findTimerNearBlock(BlockPos blockPos) {
        if (mc.world == null || blockPos == null) {
            return -1;
        }

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
        if (customName == null) {
            return -1;
        }
        String raw = customName.getString();
        if (raw.isEmpty()) {
            return -1;
        }

        String cleaned = raw
                .replaceAll("§[0-9a-fk-or]", "")
                .replace('\r', ' ')
                .replace('\n', ' ')
                .replaceAll("[^\\p{L}\\p{N}:.]+", " ")
                .trim()
                .toLowerCase(Locale.ROOT);

        if (cleaned.isEmpty()) {
            return -1;
        }

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

    private StashPair findStashPair() {
        BlockPos playerPos = mc.player.getBlockPos();
        int radius = stashScanRadius.get().intValue();
        List<BlockPos> signedChests = new ArrayList<>();
        List<BlockPos> normalChests = new ArrayList<>();

        for (int x = -radius; x <= radius; x++) {
            for (int y = -3; y <= 3; y++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos pos = playerPos.add(x, y, z);
                    BlockEntity blockEntity = mc.world.getBlockEntity(pos);
                    if (blockEntity == null || !CHEST_TYPES.contains(blockEntity.getType())) {
                        continue;
                    }

                    if (hasSignNear(pos)) {
                        signedChests.add(pos);
                    } else {
                        normalChests.add(pos);
                    }
                }
            }
        }

        signedChests.sort(Comparator.comparingDouble(this::distanceTo));
        List<BlockPos> storageCandidates = normalChests.stream()
                .filter(this::hasNormalChestNeighbor)
                .sorted(Comparator.comparingDouble(this::distanceTo))
                .toList();

        if (signedChests.isEmpty() || storageCandidates.isEmpty()) {
            return null;
        }
        return new StashPair(storageCandidates.get(0), signedChests.get(0));
    }

    private boolean hasNormalChestNeighbor(BlockPos chestPos) {
        for (Direction direction : List.of(Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST)) {
            BlockPos neighbor = chestPos.offset(direction);
            if (isChestBlock(neighbor) && !hasSignNear(neighbor)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasSignNear(BlockPos chestPos) {
        if (isSignBlock(chestPos.up())) {
            return true;
        }
        for (Direction direction : Direction.values()) {
            if (direction == Direction.DOWN) {
                continue;
            }
            if (isSignBlock(chestPos.offset(direction))) {
                return true;
            }
        }
        return false;
    }

    private boolean isSignBlock(BlockPos pos) {
        if (mc.world == null) {
            return false;
        }
        Block block = mc.world.getBlockState(pos).getBlock();
        String key = block.getTranslationKey().toLowerCase(Locale.ROOT);
        return key.contains("sign") || key.contains("таблич");
    }

    private boolean depositOneLootStack(GenericContainerScreenHandler container) {
        int containerSize = container.getInventory().size();
        for (int i = containerSize; i < container.slots.size(); i++) {
            Slot slot = container.slots.get(i);
            ItemStack stack = slot.getStack();
            if (!isValuableLootStack(stack)) {
                continue;
            }
            mc.interactionManager.clickSlot(container.syncId, slot.id, 0, SlotActionType.QUICK_MOVE, mc.player);
            depositedStacks++;
            return true;
        }
        return false;
    }

    private boolean takeOneSupplyStack(GenericContainerScreenHandler container) {
        int needCarrots = neededCarrots();
        int needPotions = neededDrinkableInvisPotions();
        if (needCarrots <= 0 && needPotions <= 0) {
            return false;
        }

        Inventory inventory = container.getInventory();
        if (needCarrots > 0) {
            for (int i = 0; i < inventory.size(); i++) {
                ItemStack stack = inventory.getStack(i);
                if (!stack.isOf(Items.GOLDEN_CARROT)) {
                    continue;
                }
                if (stack.getCount() <= needCarrots) {
                    mc.interactionManager.clickSlot(container.syncId, i, 0, SlotActionType.QUICK_MOVE, mc.player);
                    return true;
                }
                return takeExactCarrots(container, i, needCarrots);
            }
        }

        if (needPotions > 0) {
            for (int i = 0; i < inventory.size(); i++) {
                ItemStack stack = inventory.getStack(i);
                if (!isDrinkableInvisPotion(stack)) {
                    continue;
                }
                mc.interactionManager.clickSlot(container.syncId, i, 0, SlotActionType.QUICK_MOVE, mc.player);
                return true;
            }
        }
        return false;
    }

    private boolean takeExactCarrots(GenericContainerScreenHandler container, int sourceSlot, int amount) {
        if (amount <= 0 || !mc.player.currentScreenHandler.getCursorStack().isEmpty()) {
            return false;
        }

        int targetSlot = findCarrotTargetSlot(container, amount);
        if (targetSlot == -1) {
            return false;
        }

        mc.interactionManager.clickSlot(container.syncId, sourceSlot, 0, SlotActionType.PICKUP, mc.player);
        for (int i = 0; i < amount; i++) {
            mc.interactionManager.clickSlot(container.syncId, targetSlot, 1, SlotActionType.PICKUP, mc.player);
        }
        mc.interactionManager.clickSlot(container.syncId, sourceSlot, 0, SlotActionType.PICKUP, mc.player);
        return true;
    }

    private int findCarrotTargetSlot(GenericContainerScreenHandler container, int amount) {
        int containerSize = container.getInventory().size();
        for (int i = containerSize; i < container.slots.size(); i++) {
            Slot slot = container.slots.get(i);
            ItemStack stack = slot.getStack();
            if (stack.isOf(Items.GOLDEN_CARROT) && stack.getCount() + amount <= stack.getMaxCount()) {
                return slot.id;
            }
        }
        for (int i = containerSize; i < container.slots.size(); i++) {
            Slot slot = container.slots.get(i);
            if (slot.getStack().isEmpty()) {
                return slot.id;
            }
        }
        return -1;
    }

    private boolean stealOneLootStack(GenericContainerScreenHandler container) {
        Inventory inventory = container.getInventory();
        for (int i = 0; i < inventory.size(); i++) {
            ItemStack stack = inventory.getStack(i);
            if (!isValuableLootStack(stack)) {
                continue;
            }
            mc.interactionManager.clickSlot(container.syncId, i, 0, SlotActionType.QUICK_MOVE, mc.player);
            collectedStacks++;
            valuableItemsThisTrip++;
            return true;
        }
        return false;
    }

    private boolean hasDepositableLoot() {
        return mc.player.getInventory().getMainStacks().stream()
                .anyMatch(this::isValuableLootStack);
    }

    private boolean isValuableLootStack(ItemStack stack) {
        return stack != null && !stack.isEmpty() && VALUABLE_LOOT_ITEMS.contains(stack.getItem());
    }

    private boolean hasRequiredSupplies() {
        return neededCarrots() <= 0 && neededDrinkableInvisPotions() <= 0;
    }

    private int neededCarrots() {
        return Math.max(0, carrotsToTake.get().intValue() - countGoldenCarrots());
    }

    private int neededDrinkableInvisPotions() {
        if (getInvisibilitySecondsRemaining() > INVIS_SKIP_POTION_SECONDS) {
            return 0;
        }
        return Math.max(0, potionsToTake.get().intValue() - countDrinkableInvisPotions());
    }

    private int countGoldenCarrots() {
        return mc.player.getInventory().getMainStacks().stream()
                .filter(stack -> stack.isOf(Items.GOLDEN_CARROT))
                .mapToInt(ItemStack::getCount)
                .sum();
    }

    private int countDrinkableInvisPotions() {
        return (int) mc.player.getInventory().getMainStacks().stream()
                .filter(this::isDrinkableInvisPotion)
                .count();
    }

    private boolean isReservedSupplyStack(ItemStack stack) {
        return stack.isOf(Items.GOLDEN_CARROT) || isDrinkableInvisPotion(stack);
    }

    private boolean isDrinkableInvisPotion(ItemStack stack) {
        if (stack == null || stack.isEmpty()) {
            return false;
        }
        if (!(stack.getItem() instanceof PotionItem) || stack.getItem() instanceof SplashPotionItem) {
            return false;
        }

        PotionContentsComponent contents = stack.getOrDefault(DataComponentTypes.POTION_CONTENTS, PotionContentsComponent.DEFAULT);
        for (StatusEffectInstance effect : contents.getEffects()) {
            if (effect.getEffectType() == StatusEffects.INVISIBILITY) {
                return true;
            }
        }
        return false;
    }

    private boolean startDrinkInvis() {
        if (drinkingInvis) {
            return true;
        }
        if (mc.player == null || mc.interactionManager == null || mc.player.currentScreenHandler == null) {
            return false;
        }
        if (hasInvisibilityEffect()) {
            return false;
        }

        restoreHotbarSlot = mc.player.getInventory().getSelectedSlot();
        drinkingInvis = true;
        drinkStage = DrinkStage.FIND_POTION;
        drinkStageStartedAt = System.currentTimeMillis();
        drinkStartedAt = 0L;
        potionWasInventory = false;
        potionSourceSlot = -1;
        potionHotbarSlot = -1;
        action = "Готовлю зелье невидимости";

        if (mc.currentScreen != null) {
            closeHandledScreen();
        }
        return true;
    }

    private void updateDrinkingState() {
        if (!drinkingInvis) {
            return;
        }
        if (mc.player == null || mc.interactionManager == null || mc.player.currentScreenHandler == null) {
            resetDrinkState();
            return;
        }

        long now = System.currentTimeMillis();
        switch (drinkStage) {
            case FIND_POTION -> preparePotionForDrink(now);
            case WAIT_SWAP -> waitPotionSwap(now);
            case START_USE -> startUsingPotion(now);
            case DRINKING -> continueDrinking(now);
            case RESTORE -> restoreAfterDrink(now);
            case IDLE -> resetDrinkState();
        }
    }

    private void finishDrinkingIfNeeded() {
        if (!drinkingInvis) {
            resetDrinkState();
            return;
        }

        releaseUseKey();
        cleanupAfterDrink();
        resetDrinkState();
    }

    private void preparePotionForDrink(long now) {
        if (mc.currentScreen != null) {
            closeHandledScreen();
            drinkStageStartedAt = now;
            action = "Закрываю меню перед зельем";
            return;
        }
        if (now - drinkStageStartedAt < DRINK_CLOSE_SCREEN_DELAY_MS) {
            action = "Готовлю зелье невидимости";
            return;
        }
        if (mc.player.isUsingItem()) {
            action = "Жду текущий предмет перед зельем";
            return;
        }

        int hotbarPotionSlot = findHotbarSlot(this::isDrinkableInvisPotion);
        int slotId = hotbarPotionSlot >= 0 ? 36 + hotbarPotionSlot : findInventorySlot(this::isDrinkableInvisPotion);
        if (slotId == -1) {
            action = "Нет питьевого зелья невидимости";
            resetDrinkState();
            return;
        }

        potionSourceSlot = slotId;
        potionWasInventory = !isHotbarSlotId(slotId);
        potionHotbarSlot = potionWasInventory ? preferredPotionHotbarSlot() : slotId - 36;

        if (potionHotbarSlot < 0 || potionHotbarSlot > 8) {
            action = "Не могу выбрать слот зелья";
            resetDrinkState();
            return;
        }

        if (potionWasInventory) {
            mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, potionSourceSlot, potionHotbarSlot, SlotActionType.SWAP, mc.player);
            selectHotbarSlot(potionHotbarSlot);
            drinkStage = DrinkStage.WAIT_SWAP;
            drinkStageStartedAt = now;
            action = "Перекладываю зелье в хотбар";
            return;
        }

        selectHotbarSlot(potionHotbarSlot);
        drinkStage = DrinkStage.START_USE;
        drinkStageStartedAt = now;
        action = "Выбираю зелье невидимости";
    }

    private void waitPotionSwap(long now) {
        if (now - drinkStageStartedAt < DRINK_SWAP_DELAY_MS) {
            action = "Жду свап зелья";
            return;
        }

        if (!isDrinkableInvisPotion(mc.player.getInventory().getStack(potionHotbarSlot))) {
            int hotbarSlot = findHotbarSlot(this::isDrinkableInvisPotion);
            if (hotbarSlot == -1) {
                if (now - drinkStageStartedAt < 700L) {
                    action = "Жду появления зелья в хотбаре";
                    return;
                }
                action = "Зелье не попало в хотбар";
                resetDrinkState();
                return;
            }
            potionHotbarSlot = hotbarSlot;
        }

        selectHotbarSlot(potionHotbarSlot);
        drinkStage = DrinkStage.START_USE;
        drinkStageStartedAt = now;
        action = "Выбираю зелье невидимости";
    }

    private void startUsingPotion(long now) {
        if (now - drinkStageStartedAt < DRINK_SELECT_DELAY_MS) {
            action = "Жду выбор зелья";
            return;
        }
        if (mc.currentScreen != null) {
            closeHandledScreen();
            drinkStageStartedAt = now;
            action = "Закрываю меню перед питьём";
            return;
        }
        if (hasInvisibilityEffect()) {
            startRestoreAfterDrink(now);
            return;
        }
        if (potionHotbarSlot < 0 || potionHotbarSlot > 8 || !isDrinkableInvisPotion(mc.player.getInventory().getStack(potionHotbarSlot))) {
            int hotbarSlot = findHotbarSlot(this::isDrinkableInvisPotion);
            if (hotbarSlot == -1) {
                action = "Зелье невидимости не найдено в хотбаре";
                resetDrinkState();
                return;
            }
            potionHotbarSlot = hotbarSlot;
        }

        selectHotbarSlot(potionHotbarSlot);
        mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
        if (mc.options != null) {
            mc.options.useKey.setPressed(true);
        }
        drinkStage = DrinkStage.DRINKING;
        drinkStageStartedAt = now;
        drinkStartedAt = now;
        action = "Пью невидимость";
    }

    private void continueDrinking(long now) {
        action = "Пью невидимость";
        if (mc.options != null) {
            mc.options.useKey.setPressed(true);
        }
        if (hasInvisibilityEffect()) {
            startRestoreAfterDrink(now);
            return;
        }
        if (drinkStartedAt > 0L && now - drinkStartedAt < DRINK_MIN_USE_MS) {
            return;
        }
        if (!mc.player.isUsingItem() || now - drinkStartedAt >= DRINK_TIMEOUT_MS) {
            startRestoreAfterDrink(now);
        }
    }

    private void startRestoreAfterDrink(long now) {
        releaseUseKey();
        drinkStage = DrinkStage.RESTORE;
        drinkStageStartedAt = now;
        action = "Восстанавливаю слот после зелья";
    }

    private void restoreAfterDrink(long now) {
        if (now - drinkStageStartedAt < DRINK_RESTORE_DELAY_MS) {
            action = "Восстанавливаю слот после зелья";
            return;
        }
        if (mc.currentScreen != null) {
            closeHandledScreen();
            drinkStageStartedAt = now;
            action = "Закрываю меню перед восстановлением слота";
            return;
        }

        cleanupAfterDrink();
        resetDrinkState();
    }

    private void restorePotionSlot() {
        if (mc.player == null || mc.interactionManager == null || mc.player.currentScreenHandler == null) {
            return;
        }
        if (mc.currentScreen != null) {
            closeHandledScreen();
            return;
        }

        if (potionWasInventory && potionSourceSlot >= 0 && potionHotbarSlot >= 0 && potionHotbarSlot <= 8) {
            mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, potionSourceSlot, potionHotbarSlot, SlotActionType.SWAP, mc.player);
        }
        selectHotbarSlot(restoreHotbarSlot);
    }

    private void cleanupAfterDrink() {
        if (mc.player == null || mc.interactionManager == null || mc.player.currentScreenHandler == null) {
            return;
        }
        if (mc.currentScreen != null) {
            closeHandledScreen();
            return;
        }

        if (!dropBottleFromPotionSlot() && isPotionStillInTemporarySlot()) {
            restorePotionSlot();
            return;
        }

        selectEmptyHandSlot();
    }

    private boolean isPotionStillInTemporarySlot() {
        return potionWasInventory
                && potionHotbarSlot >= 0
                && potionHotbarSlot <= 8
                && isDrinkableInvisPotion(mc.player.getInventory().getStack(potionHotbarSlot));
    }

    private boolean dropBottleFromPotionSlot() {
        if (potionHotbarSlot < 0 || potionHotbarSlot > 8 || mc.player == null || mc.interactionManager == null) {
            return false;
        }

        ItemStack stack = mc.player.getInventory().getStack(potionHotbarSlot);
        if (!stack.isOf(Items.GLASS_BOTTLE)) {
            return false;
        }

        mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, 36 + potionHotbarSlot, 1, SlotActionType.THROW, mc.player);
        action = "Выкидываю пустой пузырёк";
        return true;
    }

    private void resetDrinkState() {
        drinkingInvis = false;
        drinkStage = DrinkStage.IDLE;
        drinkStageStartedAt = 0L;
        drinkStartedAt = 0L;
        potionWasInventory = false;
        potionSourceSlot = -1;
        potionHotbarSlot = -1;
        restoreHotbarSlot = -1;
    }

    private boolean hasInvisibilityEffect() {
        return getInvisibilityTicksRemaining() > 80;
    }

    private int getInvisibilitySecondsRemaining() {
        return getInvisibilityTicksRemaining() / 20;
    }

    private int getInvisibilityTicksRemaining() {
        if (mc.player == null) {
            return 0;
        }
        StatusEffectInstance effect = mc.player.getStatusEffect(StatusEffects.INVISIBILITY);
        return effect == null ? 0 : Math.max(0, effect.getDuration());
    }

    private int findInventorySlot(StackPredicate predicate) {
        for (Slot slot : mc.player.currentScreenHandler.slots) {
            if (slot.id < 9 || slot.id > 44) {
                continue;
            }
            if (predicate.test(slot.getStack())) {
                return slot.id;
            }
        }
        return -1;
    }

    private int preferredPotionHotbarSlot() {
        int emptySlot = findEmptyHotbarSlot();
        return emptySlot >= 0 ? emptySlot : restoreHotbarSlot;
    }

    private int findHotbarSlot(StackPredicate predicate) {
        for (int i = 0; i < 9; i++) {
            if (predicate.test(mc.player.getInventory().getStack(i))) {
                return i;
            }
        }
        return -1;
    }

    private int findEmptyHotbarSlot() {
        for (int i = 0; i < 9; i++) {
            if (mc.player.getInventory().getStack(i).isEmpty()) {
                return i;
            }
        }
        return -1;
    }

    private int findEmptyMainInventorySlotId() {
        if (mc.player == null || mc.player.currentScreenHandler == null) {
            return -1;
        }

        for (Slot slot : mc.player.currentScreenHandler.slots) {
            if (slot.id < 9 || slot.id > 35) {
                continue;
            }
            if (slot.getStack().isEmpty()) {
                return slot.id;
            }
        }
        return -1;
    }

    private void selectEmptyHandSlot() {
        if (mc.player == null || mc.interactionManager == null || mc.player.currentScreenHandler == null) {
            return;
        }
        if (mc.currentScreen != null) {
            closeHandledScreen();
            return;
        }

        int selectedSlot = mc.player.getInventory().getSelectedSlot();
        if (selectedSlot >= 0 && selectedSlot <= 8 && mc.player.getInventory().getStack(selectedSlot).isEmpty()) {
            selectHotbarSlot(selectedSlot);
            return;
        }

        int emptyHotbarSlot = findEmptyHotbarSlot();
        if (emptyHotbarSlot >= 0) {
            selectHotbarSlot(emptyHotbarSlot);
            return;
        }

        if (moveSelectedHotbarStackToInventory()) {
            selectHotbarSlot(selectedSlot);
        }
    }

    private boolean moveSelectedHotbarStackToInventory() {
        if (mc.player == null || mc.interactionManager == null || mc.player.currentScreenHandler == null) {
            return false;
        }
        if (!mc.player.currentScreenHandler.getCursorStack().isEmpty()) {
            return false;
        }

        int selectedSlot = mc.player.getInventory().getSelectedSlot();
        if (selectedSlot < 0 || selectedSlot > 8 || mc.player.getInventory().getStack(selectedSlot).isEmpty()) {
            return false;
        }

        int emptyInventorySlot = findEmptyMainInventorySlotId();
        if (emptyInventorySlot == -1) {
            return false;
        }

        int hotbarSlotId = 36 + selectedSlot;
        mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, hotbarSlotId, 0, SlotActionType.PICKUP, mc.player);
        mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, emptyInventorySlot, 0, SlotActionType.PICKUP, mc.player);
        if (!mc.player.currentScreenHandler.getCursorStack().isEmpty()) {
            mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, hotbarSlotId, 0, SlotActionType.PICKUP, mc.player);
            return false;
        }
        return mc.player.getInventory().getStack(selectedSlot).isEmpty();
    }

    private void selectHotbarSlot(int slot) {
        if (slot < 0 || slot > 8 || mc.player == null) {
            return;
        }

        mc.player.getInventory().setSelectedSlot(slot);
        if (mc.getNetworkHandler() != null) {
            mc.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(slot));
        }
    }

    private boolean isInventoryFull() {
        return mc.player.getInventory().getMainStacks().stream().noneMatch(ItemStack::isEmpty);
    }

    private void ensurePathTo(BlockPos pos, int range, String actionText) {
        if (pos == null) {
            return;
        }
        if (!BaritoneHelper.isAvailable()) {
            setPhase(Phase.BLOCKED, "Baritone не найден");
            return;
        }

        long now = System.currentTimeMillis();
        boolean needPath = currentGoal == null || !currentGoal.equals(pos) || !BaritoneHelper.isPathing();
        if (!needPath && now < nextPathAt) {
            action = actionText;
            return;
        }

        if (now < nextPathAt && currentGoal != null && currentGoal.equals(pos)) {
            action = actionText;
            return;
        }

        if (BaritoneHelper.goTo(pos, range)) {
            currentGoal = pos;
            nextPathAt = now + PATH_REISSUE_MS;
            action = actionText;
        }
    }

    private boolean handleRouteDanger(BlockPos target) {
        if (target == null || System.currentTimeMillis() < nextRepathAt) {
            return false;
        }

        Entity danger = findDangerOnRoute(target);
        if (danger == null) {
            return false;
        }

        BlockPos detour = computeDetour(danger, target);
        if (detour == null) {
            action = "Опасность на пути, жду";
            nextRepathAt = System.currentTimeMillis() + 2000L;
            BaritoneHelper.stop();
            return true;
        }

        BaritoneHelper.stop();
        currentGoal = null;
        detourGoal = detour;
        detouring = true;
        nextRepathAt = System.currentTimeMillis() + 2500L;
        ensurePathTo(detourGoal, 2, "Обход опасности: " + danger.getName().getString());
        return true;
    }

    private Entity findDangerOnRoute(BlockPos target) {
        Vec3d start = entityPos(mc.player);
        Vec3d end = target.toCenterPos();
        for (Entity entity : mc.world.getEntities()) {
            if (!isDangerEntity(entity)) {
                continue;
            }

            double radius = dangerRadius(entity);
            Vec3d entityPos = entityPos(entity);
            if (entityPos.distanceTo(start) <= radius || entityPos.distanceTo(end) <= radius) {
                return entity;
            }
            if (distanceToSegment(entityPos, start, end) <= radius) {
                return entity;
            }
        }
        return null;
    }

    private boolean isDangerEntity(Entity entity) {
        if (entity == null || entity == mc.player || !entity.isAlive()) {
            return false;
        }

        if (entity instanceof WardenEntity) {
            return true;
        }

        if (entity instanceof PlayerEntity player) {
            if (player.isSpectator()) {
                return false;
            }
            if (ignoreFriends.get() && Nexis.getInstance().getFriendStorage().isFriend(player.getName().getString())) {
                return false;
            }
            return true;
        }

        return false;
    }

    private double dangerRadius(Entity entity) {
        return entity instanceof WardenEntity ? wardenDangerRadius.get() : playerDangerRadius.get();
    }

    private BlockPos computeDetour(Entity danger, BlockPos target) {
        Vec3d player = entityPos(mc.player);
        Vec3d dangerPos = entityPos(danger);
        Vec3d away = player.subtract(dangerPos);
        if (away.horizontalLengthSquared() < 0.01) {
            Vec3d toTarget = target.toCenterPos().subtract(player);
            away = new Vec3d(-toTarget.z, 0.0, toTarget.x);
        }
        if (away.horizontalLengthSquared() < 0.01) {
            return null;
        }

        Vec3d normalized = new Vec3d(away.x, 0.0, away.z).normalize();
        double distance = dangerRadius(danger) + 8.0;
        Vec3d detour = dangerPos.add(normalized.multiply(distance));
        return BlockPos.ofFloored(detour.x, mc.player.getY(), detour.z);
    }

    private BlockPos selectNearestSafeChest(BlockPos exclude) {
        long now = System.currentTimeMillis();
        inspectedCooldowns.entrySet().removeIf(entry -> entry.getValue() <= now);

        BlockPos markedReady = WARDEN_CHESTS.stream()
                .filter(pos -> exclude == null || !pos.equals(exclude))
                .filter(pos -> inspectedCooldowns.getOrDefault(pos, 0L) <= now)
                .filter(pos -> shouldApproachMarkedChest(chestTimers.get(pos)))
                .filter(pos -> !isUnsafeAround(resolveWardenChestPos(pos)))
                .min(Comparator.comparingDouble(this::distanceToWardenChest))
                .orElse(null);

        if (markedReady != null) {
            return markedReady;
        }

        return WARDEN_CHESTS.stream()
                .filter(pos -> exclude == null || !pos.equals(exclude))
                .filter(pos -> chestTimers.get(pos) == null)
                .filter(pos -> !patrolVisitedChests.contains(pos))
                .filter(pos -> inspectedCooldowns.getOrDefault(pos, 0L) <= now)
                .filter(pos -> !isUnsafeAround(resolveWardenChestPos(pos)))
                .min(Comparator.comparingDouble(this::distanceToWardenChest))
                .orElse(null);
    }

    private String formatMarkedChestWaitAction() {
        int nearestMarked = chestTimers.values().stream()
                .filter(info -> !info.isLootable())
                .mapToInt(ChestTimerInfo::getRemainingSeconds)
                .min()
                .orElse(-1);

        if (nearestMarked >= 0) {
            return "Жду помеченный сундук: " + formatDuration(nearestMarked);
        }
        if (!patrolVisitedChests.isEmpty()) {
            return "Круг патруля завершён, жду новые таймеры";
        }
        return "Нет непомеченных безопасных сундуков, жду";
    }

    private void markPatrolVisited(BlockPos pos) {
        if (pos != null) {
            patrolVisitedChests.add(pos);
        }
    }

    private BlockPos resolveWardenChestPos(BlockPos basePos) {
        if (basePos == null || mc.world == null) {
            return basePos;
        }

        for (BlockPos pos : wardenChestVariants(basePos)) {
            if (isChestBlock(pos)) {
                return pos;
            }
        }
        return basePos;
    }

    private List<BlockPos> wardenChestVariants(BlockPos basePos) {
        if (basePos == null) {
            return List.of();
        }

        List<BlockPos> variants = new ArrayList<>(WARDEN_CHEST_Y_TOLERANCE * 2 + 1);
        variants.add(basePos);
        for (int offset = 1; offset <= WARDEN_CHEST_Y_TOLERANCE; offset++) {
            variants.add(basePos.down(offset));
            variants.add(basePos.up(offset));
        }
        return variants;
    }

    private boolean isChestBlock(BlockPos pos) {
        if (pos == null || mc.world == null) {
            return false;
        }

        BlockEntity blockEntity = mc.world.getBlockEntity(pos);
        return blockEntity != null && CHEST_TYPES.contains(blockEntity.getType());
    }

    private boolean isUnsafeAround(BlockPos pos) {
        Vec3d center = pos.toCenterPos();
        for (Entity entity : mc.world.getEntities()) {
            if (isDangerEntity(entity) && entityPos(entity).distanceTo(center) <= dangerRadius(entity)) {
                return true;
            }
        }
        return false;
    }

    private double distanceToSegment(Vec3d point, Vec3d start, Vec3d end) {
        Vec3d line = end.subtract(start);
        double lengthSq = line.lengthSquared();
        if (lengthSq <= 0.0001) {
            return point.distanceTo(start);
        }
        double t = point.subtract(start).dotProduct(line) / lengthSq;
        t = Math.max(0.0, Math.min(1.0, t));
        Vec3d projection = start.add(line.multiply(t));
        return point.distanceTo(projection);
    }

    private boolean isWardenOpenBlocked() {
        return wardenEnteredAt > 0L && System.currentTimeMillis() - wardenEnteredAt < CHEST_INTERACTION_LOCK_MS;
    }

    private void retryOpenBlock(BlockPos pos, String actionText) {
        if (pos == null) {
            return;
        }
        if (System.currentTimeMillis() < nextOpenAt) {
            action = actionText;
            return;
        }
        nextOpenAt = System.currentTimeMillis() + OPEN_RETRY_MS;
        openBlock(pos);
        action = actionText;
    }

    private void openBlock(BlockPos pos) {
        stopMovementForInteraction();
        interactBlockDirect(createBlockHitResult(pos));
    }

    private void interactBlockDirect(BlockHitResult hitResult) {
        if (mc.player == null || mc.interactionManager == null) {
            return;
        }
        stopMovementForInteraction();
        mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, hitResult);
        mc.player.swingHand(Hand.MAIN_HAND, false);
    }

    private BlockHitResult createBlockHitResult(BlockPos pos) {
        if (mc.world != null && mc.player != null) {
            Vec3d eye = mc.player.getEyePos();
            Vec3d center = pos.toCenterPos();
            BlockHitResult rayHit = mc.world.raycast(new RaycastContext(
                    eye,
                    center,
                    RaycastContext.ShapeType.OUTLINE,
                    RaycastContext.FluidHandling.NONE,
                    mc.player
            ));

            if (rayHit.getType() == HitResult.Type.BLOCK && rayHit.getBlockPos().equals(pos)) {
                return rayHit;
            }

            Direction side = nearestInteractSide(pos, eye);
            Vec3d hitVec = center.add(
                    side.getOffsetX() * 0.5,
                    side.getOffsetY() * 0.5,
                    side.getOffsetZ() * 0.5
            );
            return new BlockHitResult(hitVec, side, pos, false);
        }

        return new BlockHitResult(pos.toCenterPos(), Direction.UP, pos, false);
    }

    private Direction nearestInteractSide(BlockPos pos, Vec3d eye) {
        Vec3d center = pos.toCenterPos();
        double dx = eye.x - center.x;
        double dz = eye.z - center.z;

        if (Math.abs(dx) >= Math.abs(dz) && Math.abs(dx) > 0.15) {
            return dx > 0.0 ? Direction.EAST : Direction.WEST;
        }
        if (Math.abs(dz) > 0.15) {
            return dz > 0.0 ? Direction.SOUTH : Direction.NORTH;
        }
        return eye.y >= center.y ? Direction.UP : Direction.NORTH;
    }

    private void stopMovementForInteraction() {
        BaritoneHelper.stop();
        currentGoal = null;

        if (mc.options != null) {
            mc.options.forwardKey.setPressed(false);
            mc.options.backKey.setPressed(false);
            mc.options.leftKey.setPressed(false);
            mc.options.rightKey.setPressed(false);
            mc.options.jumpKey.setPressed(false);
            mc.options.sneakKey.setPressed(false);
            mc.options.sprintKey.setPressed(false);
        }

        if (mc.player != null) {
            mc.player.setSprinting(false);
            if (mc.player.input != null) {
                mc.player.input.playerInput = new PlayerInput(false, false, false, false, false, false, false);
            }
        }
    }

    private boolean sendCommand(String command) {
        if (command == null || command.isBlank() || mc.player == null || mc.player.networkHandler == null) {
            return false;
        }
        long now = System.currentTimeMillis();
        if (now - lastCommandAt < COMMAND_DELAY_MS) {
            return false;
        }
        lastCommandAt = now;
        String normalized = command.startsWith("/") ? command.substring(1) : command;
        mc.player.networkHandler.sendChatCommand(normalized);
        return true;
    }

    private void closeHandledScreen() {
        if (mc.player != null && mc.currentScreen != null) {
            mc.player.closeHandledScreen();
        }
    }

    private void releaseUseKey() {
        if (mc.options != null) {
            mc.options.useKey.setPressed(false);
        }
    }

    private void releaseStorageJoinJump() {
        if (mc.options != null) {
            mc.options.jumpKey.setPressed(false);
        }
        storageJoinJumpStartedAt = 0L;
    }

    private boolean phaseElapsed(long ms) {
        return System.currentTimeMillis() - phaseStartedAt >= ms;
    }

    private void setPhase(Phase phase, String action) {
        if (this.phase != phase) {
            this.phase = phase;
            this.phaseStartedAt = System.currentTimeMillis();
            this.currentGoal = null;
        }
        this.action = action;
    }

    private double distanceToWardenChest(BlockPos basePos) {
        if (basePos == null || mc.player == null) {
            return Double.MAX_VALUE;
        }

        return wardenChestVariants(basePos).stream()
                .mapToDouble(this::distanceTo)
                .min()
                .orElse(Double.MAX_VALUE);
    }

    private double distanceTo(BlockPos pos) {
        if (pos == null || mc.player == null) {
            return Double.MAX_VALUE;
        }
        return entityPos(mc.player).distanceTo(pos.toCenterPos());
    }

    private BlockPos computeHologramRefreshGoal(BlockPos chestPos) {
        if (chestPos == null || mc.player == null) {
            return null;
        }

        Vec3d chestCenter = chestPos.toCenterPos();
        Vec3d away = entityPos(mc.player).subtract(chestCenter);
        away = new Vec3d(away.x, 0.0, away.z);
        if (away.horizontalLengthSquared() < 0.01) {
            away = new Vec3d(1.0, 0.0, 0.0);
        }

        Vec3d target = chestCenter.add(away.normalize().multiply(JOIN_HOLOGRAM_REFRESH_DISTANCE));
        return BlockPos.ofFloored(target.x, mc.player.getY(), target.z);
    }

    private Vec3d entityPos(Entity entity) {
        return new Vec3d(entity.getX(), entity.getY(), entity.getZ());
    }

    private String cleanHomeName() {
        String value = homeName.get();
        if (value == null || value.isBlank()) {
            return "home";
        }
        return value.trim().replace("/", "").replace(" ", "");
    }

    private String sanitizeNumber(String value, String fallback) {
        if (value == null) {
            return fallback;
        }
        String cleaned = value.replaceAll("[^0-9]", "");
        return cleaned.isBlank() ? fallback : cleaned;
    }

    private String formatDuration(long seconds) {
        seconds = Math.max(0L, seconds);
        long minutes = seconds / 60L;
        long sec = seconds % 60L;
        return String.format(Locale.ROOT, "%02d:%02d", minutes, sec);
    }

    private boolean isHotbarSlotId(int slotId) {
        return slotId >= 36 && slotId <= 44;
    }

    private enum DrinkStage {
        IDLE,
        FIND_POTION,
        WAIT_SWAP,
        START_USE,
        DRINKING,
        RESTORE
    }

    private enum Phase {
        IDLE("Ожидание"),
        GO_STORAGE_ANARCHY("На склад через /an"),
        WAIT_STORAGE_SWITCH("Ожидание склада"),
        FIND_STASH("Поиск склада"),
        GO_STORAGE_CHEST("Путь к хранилищу"),
        OPEN_STORAGE_CHEST("Открытие хранилища"),
        DEPOSIT_LOOT("Складирование лута"),
        GO_SUPPLY_CHEST("Путь к расходникам"),
        OPEN_SUPPLY_CHEST("Открытие расходников"),
        TAKE_SUPPLIES("Забор расходников"),
        GO_WARDEN_ANARCHY("На город вардена"),
        WAIT_WARDEN_SWITCH("Ожидание города"),
        WAIT_HOME_TELEPORT("Ожидание /home"),
        REFRESH_JOIN_HOLOGRAM_AWAY("Отход от сундука"),
        REFRESH_JOIN_HOLOGRAM_BACK("Возврат к сундуку"),
        PATROL_CITY("Патруль города"),
        PATH_TO_SCAN_CHEST("Путь к сундуку"),
        INSPECT_CHEST("Проверка таймера"),
        PREPARE_LOOT("Подготовка лута"),
        DARENA_COMMAND("Выход с арены"),
        DARENA_WAIT_GUI("Ожидание меню"),
        DARENA_CLICK("Клик меню"),
        DARENA_STORAGE_COMMAND("Выход перед складом"),
        DARENA_STORAGE_WAIT_GUI("Меню выхода перед складом"),
        DARENA_STORAGE_CLICK("Клик выхода перед складом"),
        WAIT_TIMER_HOME("Ожидание открытия"),
        WAIT_LOOT_TELEPORT("Телепорт к луту"),
        OPEN_LOOT_CHEST("Открытие сундука"),
        STEAL_LOOT("Лутание"),
        POST_LOOT_PATROL("Патруль после лута"),
        WAIT_PVP_END_AT_CHEST("Ожидание PVP"),
        SET_HOME_AFTER_PVP("Сохранение home"),
        RETURN_TO_STORAGE("Возврат на склад"),
        RECOVER_DEATH("Восстановление"),
        BLOCKED("Остановлен");

        final String label;

        Phase(String label) {
            this.label = label;
        }
    }

    private static class ChestTimerInfo {
        int timerSeconds;
        long timerEndTime;
        boolean hologramSeen;
        boolean hologramVisibleLastScan;
        boolean hologramDisappeared;
        boolean lootable;

        ChestTimerInfo(int timerSeconds) {
            updateTimer(timerSeconds);
        }

        void updateTimer(int timerSeconds) {
            this.timerSeconds = timerSeconds;
            this.timerEndTime = System.currentTimeMillis() + timerSeconds * 1000L;
            this.hologramSeen = true;
            this.hologramVisibleLastScan = true;
            this.hologramDisappeared = false;
            this.lootable = false;
        }

        void updateMissingHologram() {
            if (hologramSeen && getRemainingSeconds() <= 1) {
                hologramDisappeared = true;
            }
            hologramVisibleLastScan = false;
            lootable = hologramDisappeared;
        }

        void updateMissingDuringProtection() {
            hologramVisibleLastScan = false;
        }

        int getRemainingSeconds() {
            return (int) Math.max(0L, (timerEndTime - System.currentTimeMillis()) / 1000L);
        }

        boolean wasHologramSeen() {
            return hologramSeen;
        }

        boolean isLootable() {
            return hologramSeen ? lootable : getRemainingSeconds() <= 0;
        }
    }

    private record StashPair(BlockPos storageChest, BlockPos supplyChest) {
    }

    private interface StackPredicate {
        boolean test(ItemStack stack);
    }
}
