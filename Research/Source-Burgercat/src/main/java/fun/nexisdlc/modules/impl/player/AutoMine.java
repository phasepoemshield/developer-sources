package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.baritone.BaritoneHelper;
import fun.nexisdlc.client.utils.baritone.BaritoneRotationHook;
import fun.nexisdlc.client.utils.config.AutoMineConfig;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.time.StopWatch;
import fun.nexisdlc.client.utils.player.AnarchyUtil;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.client.utils.render.main.world.WorldGeometryEmitter;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderLayers;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderer;

import fun.nexisdlc.mixins.accessors.GameRendererAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeListSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import fun.nexisdlc.modules.api.settings.impl.StringSetting;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import ru.sterford.annotations.NativeCall;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@FunctionAdd(name = "AutoMine", alias = "Auto Mine", category = Category.Player,
        description = "Автоматически ищет и добывает руды через Baritone")
public class AutoMine extends Function {

    // ══════════════════════════════════════════════════════════════
    //  Настройки
    // ══════════════════════════════════════════════════════════════

    private final ModeListSetting ores = new ModeListSetting("Руды",
            new BooleanSetting("Уголь", false),
            new BooleanSetting("Медь", false),
            new BooleanSetting("Железо", false),
            new BooleanSetting("Золото", false),
            new BooleanSetting("Редстоун", false),
            new BooleanSetting("Лазурит", false),
            new BooleanSetting("Изумруд", false),
            new BooleanSetting("Алмаз", false),
            new BooleanSetting("Древние обломки", false));

    private final SliderSetting workDelay = new SliderSetting("Задержка между блоками", 200f, 0f, 2000f, 50f);
    private final StringSetting anarchyList = new StringSetting("Анки", "101,102,103,104,105", "", false);
    private final BooleanSetting autoSwap = new BooleanSetting("Авто-свап анок", true);
    private final BooleanSetting autoRepair = new BooleanSetting("Авто-починка", true);
    private final BooleanSetting autoTrash = new BooleanSetting("Авто-выкидывание мусора", true);
    private final ModeListSetting trashOres = new ModeListSetting("Выбрасывать",
            new BooleanSetting("Лазурит", false),
            new BooleanSetting("Уголь", false),
            new BooleanSetting("Редстоун", false),
            new BooleanSetting("Золотые слитки", false),
            new BooleanSetting("Железные слитки", false));

    // ══════════════════════════════════════════════════════════════
    //  Состояние
    // ══════════════════════════════════════════════════════════════

    private final AutoMineConfig autoMineConfig = new AutoMineConfig();
    private final StopWatch workTimer = new StopWatch();

    private BlockPos currentTarget;
    private BlockPos lastDiamondOreTarget;

    // Diamond loot
    private BlockPos diamondLootOrigin;
    private Vec3d diamondLootTarget;
    private long diamondLootUntilMs;
    private boolean diamondLootSeenItem;
    private long diamondLootArrivedMs;

    private long lastSearchMs;
    private long lastSpawnMs;
    private long lastTrashScanMs;
    private long worldTickMs;
    private long noTargetSinceMs;
    private long lastAnarchySwapMs;
    private int anarchyIndex;

    // Repair
    private boolean repairActive;
    private boolean repairThrowing;
    private int repairExpSlot = -1;
    private int repairPickaxeHotbarSlot = -1;
    private long repairLastThrowMs;
    private long repairStartMs;

    // Stuck
    private final LinkedList<BlockPos> stuckBlockQueue = new LinkedList<>();
    private long lastStuckScanMs;

    // Baritone state
    private boolean baritoneWasStarted = false;

    // Возобновить добычу на след. тик после выкидывания мусора
    private boolean trashResume;

    public AutoMine() {
        addSettings(ores, workDelay, anarchyList, autoSwap, autoRepair, autoTrash, trashOres);
    }

    // ══════════════════════════════════════════════════════════════
    //  onEnable / onDisable
    // ══════════════════════════════════════════════════════════════

    @Override
    public void onEnable() {
        if (!BaritoneHelper.isAvailable()) {
            this.setState(false);
            Function.sendMessage("§c[AutoMine] §fBaritone §cне установлен!");
            Function.sendMessage("§7Скачай Baritone для Fabric 1.21.11 и положи в папку mods.");
            return;
        }
        if (!hasArea()) {
            this.setState(false);
            Function.sendMessage("§c[AutoMine] §fУстанови позиции: §e.automine pos1 §fи §e.automine pos2");
            return;
        }
        if (!isAnyOreEnabled()) {
            this.setState(false);
            Function.sendMessage("§c[AutoMine] §fВключи хотя бы одну руду в настройках!");
            return;
        }

        mc.options.pauseOnLostFocus = false;
        workTimer.reset();
        noTargetSinceMs = 0L;
        lastAnarchySwapMs = 0L;
        worldTickMs = 0L;
        lastSearchMs = 0L;
        trashResume = false;
        stuckBlockQueue.clear();
        baritoneWasStarted = false;

        double delay = (float) workDelay.get() / 1000.0;
        BaritoneHelper.applySettings(true, delay);

        // Включаем редирект Baritone ротации через RotationTask:
        // сервер = Baritone ротация (ломание блоков), камера = RotationTask визуальная
        BaritoneRotationHook.enable();

        Function.sendMessage("§a[AutoMine] §fBaritone запущен!");
        super.onEnable();
    }

    @Override
    public void onDisable() {
        BaritoneHelper.setPaused(false);
        BaritoneHelper.stop();
        BaritoneRotationHook.disable();
        BaritoneHelper.applySettings(false, 2.0);

        currentTarget = null;
        lastDiamondOreTarget = null;
        clearDiamondLoot();
        workTimer.reset();
        noTargetSinceMs = 0L;
        lastAnarchySwapMs = 0L;
        worldTickMs = 0L;
        trashResume = false;
        stuckBlockQueue.clear();
        baritoneWasStarted = false;
        finishRepair();
        super.onDisable();
    }

    // ══════════════════════════════════════════════════════════════
    //  Запуск добычи
    // ══════════════════════════════════════════════════════════════

    private void startMining() {
        if (currentTarget == null) return;
        // GoalBlock на конкретную руду из зоны — НЕ mine(), который роумит по миру
        BaritoneHelper.goToExact(currentTarget);
        baritoneWasStarted = true;
    }

    // ══════════════════════════════════════════════════════════════
    //  Главный тик
    // ══════════════════════════════════════════════════════════════

    @NativeCall
    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (AutoSell.isSelling()) return;

        if (!BaritoneHelper.isAvailable()) {
            this.setState(false);
            Function.sendMessage("§c[AutoMine] §fBaritone недоступен — модуль отключён.");
            return;
        }

        if (mc.world == null) {
            worldTickMs = 0;
        } else if (worldTickMs == 0) {
            worldTickMs = System.currentTimeMillis();
        }

        if (nullCheck()) {
            BaritoneHelper.stop();
            return;
        }

        // ── Снять паузу после выкидывания мусора ──
        if (trashResume) {
            trashResume = false;
            BaritoneHelper.setPaused(false); // цель сохранилась — идём дальше, без startMining()
        }

        // ── Ротация через RotationTask ──
        updateBaritoneRotation();

        // ── Кирка ──
        int pickaxeSlot = getBestPickaxeSlot();
        if (pickaxeSlot < 0) {
            if (System.currentTimeMillis() - worldTickMs > 50L) returnToSpawn();
            BaritoneHelper.stop();
            return;
        }
        mc.player.getInventory().setSelectedSlot(pickaxeSlot);

        // ── Починка ──
        if (autoRepair.get()) {
            if (repairActive) {
                tickRepair();
                return;
            }
            ItemStack hand = mc.player.getMainHandStack();
            if (hasMending(hand) && getDurabilityPercent(hand) < 25) {
                startRepair();
                return;
            }
        }

        // ── Мусор раз в 5с: пауза → выкинуть → след. тик снять паузу ──
        if (autoTrash.get() && System.currentTimeMillis() - lastTrashScanMs > 5000L) {
            lastTrashScanMs = System.currentTimeMillis();
            if (hasTrash()) {
                BaritoneHelper.setPaused(true); // пауза, НЕ стоп — путь/цель сохраняются
                dropTrash();
                trashResume = true;             // на след. тик снимем паузу
                return;
            }
        }

        // ── Застряли ──
        if (isStuckInBlocks()) {
            BaritoneHelper.stop();
            scanStuckBlocks();
            BlockPos stuck = stuckBlockQueue.poll();
            if (stuck != null && mc.world != null && !mc.world.getBlockState(stuck).isAir()) {
                BaritoneHelper.goTo(stuck, 1);
            }
            return;
        } else {
            stuckBlockQueue.clear();
        }

        // ── Зона ──
        if (!hasArea() || !isAnyOreEnabled()) {
            BaritoneHelper.stop();
            return;
        }

        // ── Вышли за зону → жёстко вернуть внутрь ──
        if (!isInsideArea(mc.player.getBlockPos(), 3)) {
            BaritoneHelper.stop();
            BlockPos back = currentTarget != null ? currentTarget : areaCenter();
            if (back != null) BaritoneHelper.goToExact(back);
            return;
        }

        // ── Diamond loot ──
        if (diamondLootOrigin != null) {
            if (tickDiamondLoot()) return;
        }

        // ── Поиск руд (только в зоне) ──
        if (System.currentTimeMillis() - lastSearchMs > 200L) {
            BlockPos found = findNearestOreInArea();
            lastSearchMs = System.currentTimeMillis();

            if (found != null) {
                noTargetSinceMs = 0L;
                if (!found.equals(currentTarget)) {
                    currentTarget = found;
                    if (mc.world != null && isDiamondOre(mc.world.getBlockState(currentTarget))) {
                        lastDiamondOreTarget = currentTarget.toImmutable();
                    }
                    startMining();
                }
            } else {
                currentTarget = null;
                if (!BaritoneHelper.isPathing()) tickAnarchySwap();
            }
        }

        // ── Дойти/доломать цель ──
        if (currentTarget != null && !BaritoneHelper.isPathing()) {
            startMining();
        }

        // ── Блок сломан → diamond loot ──
        if (currentTarget != null && mc.world != null && mc.world.getBlockState(currentTarget).isAir()) {
            BlockPos brokenPos = currentTarget.toImmutable();
            if (lastDiamondOreTarget != null && lastDiamondOreTarget.equals(currentTarget)) {
                currentTarget = null;
                beginDiamondLoot(brokenPos);
                return;
            }
            currentTarget = null;
            lastSearchMs = 0L;
        }
    }
    
    // ══════════════════════════════════════════════════════════════
    //  Diamond Loot
    // ══════════════════════════════════════════════════════════════

    private void beginDiamondLoot(BlockPos brokenOrePos) {
        if (mc.world == null) return;
        diamondLootOrigin = brokenOrePos.toImmutable();
        diamondLootUntilMs = System.currentTimeMillis() + 2500L;
        diamondLootSeenItem = false;
        diamondLootArrivedMs = 0L;
        diamondLootTarget = null;

        Box searchBox = new Box(diamondLootOrigin).expand(2.0);
        for (Entity entity : mc.world.getEntities()) {
            if (!(entity instanceof ItemEntity item)) continue;
            if (!searchBox.intersects(item.getBoundingBox())) continue;
            if (!isDiamondItem(item.getStack())) continue;
            diamondLootSeenItem = true;
            diamondLootTarget = new Vec3d(item.getX(), item.getY(), item.getZ());
            BaritoneHelper.goTo(BlockPos.ofFloored(diamondLootTarget), 1);
            return;
        }
        clearDiamondLoot();
    }

    private boolean tickDiamondLoot() {
        if (mc.world == null || mc.player == null || diamondLootOrigin == null) return false;
        long now = System.currentTimeMillis();
        if (now > diamondLootUntilMs) {
            clearDiamondLoot();
            return false;
        }

        ItemEntity best = null;
        double bestDist = Double.MAX_VALUE;
        Box searchBox = new Box(diamondLootOrigin).expand(2.0);
        for (Entity entity : mc.world.getEntities()) {
            if (!(entity instanceof ItemEntity item)) continue;
            if (!searchBox.intersects(item.getBoundingBox())) continue;
            if (!isDiamondItem(item.getStack())) continue;
            double d = item.squaredDistanceTo(mc.player);
            if (d < bestDist) {
                bestDist = d;
                best = item;
            }
        }

        if (best != null) {
            diamondLootSeenItem = true;
            diamondLootTarget = new Vec3d(best.getX(), best.getY(), best.getZ());
            BlockPos lootPos = BlockPos.ofFloored(diamondLootTarget);

            double dx = mc.player.getX() - diamondLootTarget.x;
            double dz = mc.player.getZ() - diamondLootTarget.z;
            if (dx * dx + dz * dz <= 0.16) {
                if (diamondLootArrivedMs == 0L) diamondLootArrivedMs = now;
                if (now - diamondLootArrivedMs < 100L) {
                    return true;
                }
                clearDiamondLoot();
                return false;
            }
            diamondLootArrivedMs = 0L;
            BaritoneHelper.goTo(lootPos, 1);
            return true;
        }

        if (diamondLootSeenItem) {
            clearDiamondLoot();
            return false;
        }

        BaritoneHelper.goTo(diamondLootOrigin, 1);
        return true;
    }

    private void clearDiamondLoot() {
        lastDiamondOreTarget = null;
        diamondLootOrigin = null;
        diamondLootTarget = null;
        diamondLootUntilMs = 0L;
        diamondLootSeenItem = false;
        diamondLootArrivedMs = 0L;
    }

    // ══════════════════════════════════════════════════════════════
    //  Рендер
    // ══════════════════════════════════════════════════════════════

    @EventHandler
    public void onRender3D(EventRender.World event) {
        BlockPos renderTarget = currentTarget != null ? currentTarget : diamondLootOrigin;
        if (nullCheck() || renderTarget == null || mc.world == null) return;

        Camera camera = mc.gameRenderer.getCamera();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, event.getTicks(), true);
        Matrix4f posMatrix = new Matrix4f(event.getMatrixStack().peek().getPositionMatrix());
        Matrix4f projMatrix = new Matrix4f(mc.gameRenderer.getBasicProjectionMatrix(fov));

        try (WorldRenderer renderer = WorldRenderer.begin(mc, mc.getRenderTickCounter(), camera, posMatrix, projMatrix)) {
            renderBlock(renderer, camera, event.getMatrixStack().peek(), renderTarget, ColorUtils.rgba(0, 255, 0, 255));
            renderer.flush();
        }
    }

    @EventHandler
    public void onRenderHud(EventRender.Screen.Hud event) {
        if (nullCheck() || !getState()) return;
        long elapsed = workTimer.getElapsedTime();
        int seconds = (int) (elapsed / 1000);
        int minutes = seconds / 60;
        seconds %= 60;

        String status = BaritoneHelper.isAvailable() ? "Baritone" : "§cОшибка";
        String text = String.format("AutoMine [%s]: %02d:%02d", status, minutes, seconds);
        event.getRenderer().centredText(FontRegistry.SF_SEMIBOLD,
                event.getViewportWidth() / 2f, 50f, 18f, text, 0xFFFFFFFF);
    }

    // ══════════════════════════════════════════════════════════════
    //  Поиск руд
    // ══════════════════════════════════════════════════════════════

    private BlockPos findNearestOreInArea() {
        if (mc.world == null || mc.player == null || !hasArea()) return null;
        BlockPos p1 = autoMineConfig.getPos1();
        BlockPos p2 = autoMineConfig.getPos2();
        BlockPos min = new BlockPos(Math.min(p1.getX(), p2.getX()), Math.min(p1.getY(), p2.getY()), Math.min(p1.getZ(), p2.getZ()));
        BlockPos max = new BlockPos(Math.max(p1.getX(), p2.getX()), Math.max(p1.getY(), p2.getY()), Math.max(p1.getZ(), p2.getZ()));

        BlockPos playerPos = mc.player.getBlockPos();
        BlockPos best = null;
        double bestDist = Double.MAX_VALUE;

        for (BlockPos pos : BlockPos.iterate(min, max)) {
            BlockState state = mc.world.getBlockState(pos);
            if (!isWantedOre(state)) continue;
            double dist = playerPos.getSquaredDistance(pos);
            if (dist < bestDist) {
                bestDist = dist;
                best = pos.toImmutable();
            }
        }
        return best;
    }

    // ══════════════════════════════════════════════════════════════
    //  Вспомогательные методы
    // ══════════════════════════════════════════════════════════════

    private boolean isWantedOre(BlockState state) {
        String id = String.valueOf(Registries.BLOCK.getId(state.getBlock()));
        return (ores.getByName("Уголь").get() && id.contains("coal_ore"))
                || (ores.getByName("Медь").get() && id.contains("copper_ore"))
                || (ores.getByName("Железо").get() && id.contains("iron_ore"))
                || (ores.getByName("Золото").get() && id.contains("gold_ore"))
                || (ores.getByName("Редстоун").get() && id.contains("redstone_ore"))
                || (ores.getByName("Лазурит").get() && id.contains("lapis_ore"))
                || (ores.getByName("Изумруд").get() && id.contains("emerald_ore"))
                || (ores.getByName("Алмаз").get() && id.contains("diamond_ore"))
                || (ores.getByName("Древние обломки").get() && id.contains("ancient_debris"));
    }

    private boolean isDiamondOre(BlockState state) {
        return String.valueOf(Registries.BLOCK.getId(state.getBlock())).contains("diamond_ore");
    }

    private boolean isDiamondItem(ItemStack stack) {
        return !stack.isEmpty() && stack.isOf(Items.DIAMOND);
    }

    private boolean isAnyOreEnabled() {
        for (BooleanSetting s : ores.get()) if (s.get()) return true;
        return false;
    }

    private int getBestPickaxeSlot() {
        if (mc.player == null) return -1;
        int bestSlot = -1, bestDur = -1;
        for (int i = 0; i < 9; i++) {
            ItemStack s = mc.player.getInventory().getStack(i);
            if (s.isEmpty()) continue;
            String id = String.valueOf(Registries.ITEM.getId(s.getItem()));
            if (!id.contains("pickaxe") && !id.contains("_pick") && !id.contains("drill") && !id.contains("hammer"))
                continue;
            int dur = s.getMaxDamage() - s.getDamage();
            if (dur <= 5) continue;
            if (dur > bestDur) {
                bestDur = dur;
                bestSlot = i;
            }
        }
        if (bestSlot < 0) {
            for (int i = 0; i < 9; i++) {
                if (!mc.player.getInventory().getStack(i).isEmpty()) return i;
            }
        }
        return bestSlot;
    }

    private void returnToSpawn() {
        if (System.currentTimeMillis() - lastSpawnMs < 1500L) return;
        lastSpawnMs = System.currentTimeMillis();
        BaritoneHelper.stop();
        if (mc.player != null) mc.player.networkHandler.sendChatCommand("spawn");
    }

    private void tickAnarchySwap() {
        if (mc.player == null || !autoSwap.get() || !AnarchyUtil.isOnAnarchy()) return;
        long now = System.currentTimeMillis();

        if (noTargetSinceMs == 0L) {
            noTargetSinceMs = now;
            return;
        }
        if (now - noTargetSinceMs < 3000L) return;   // ждём 3с, что руды реально нет
        if (now - lastAnarchySwapMs < 5000L) return; // кулдаун между свапами

        int[] list = parseAnarchies();
        if (list.length == 0) return;

        int current = AnarchyUtil.getCurrentAnarchy();

        // индекс следующей анки после текущей
        int nextIdx = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == current) {
                nextIdx = (i + 1) % list.length;
                break;
            }
        }
        int next = list[nextIdx];
        if (next == current && list.length > 1) next = list[(nextIdx + 1) % list.length];

        AnarchyUtil.joinAnarchy(next);
        anarchyIndex = nextIdx;
        lastAnarchySwapMs = now;
        noTargetSinceMs = 0L;
    }

    private int[] parseAnarchies() {
        String[] parts = anarchyList.get().split(",");
        List<Integer> out = new ArrayList<>();
        for (String p : parts) {
            try {
                out.add(Integer.parseInt(p.trim()));
            } catch (NumberFormatException ignored) {
            }
        }
        int[] arr = new int[out.size()];
        for (int i = 0; i < arr.length; i++) arr[i] = out.get(i);
        return arr;
    }

    // ── Repair ────────────────────────────────────────────────────

    private boolean hasMending(ItemStack stack) {
        if (stack.isEmpty()) return false;
        ItemEnchantmentsComponent enc = stack.get(DataComponentTypes.ENCHANTMENTS);
        if (enc == null) return false;
        for (RegistryEntry<Enchantment> e : enc.getEnchantments())
            if (e.matchesKey(Enchantments.MENDING)) return true;
        return false;
    }

    private int getDurabilityPercent(ItemStack stack) {
        if (stack.isEmpty() || stack.getMaxDamage() <= 0) return 100;
        return (stack.getMaxDamage() - stack.getDamage()) * 100 / stack.getMaxDamage();
    }

    private void startRepair() {
        if (mc.player == null) return;
        BaritoneHelper.stop();
        repairPickaxeHotbarSlot = mc.player.getInventory().getSelectedSlot();
        Slot expSlot = PlayerInventoryUtil.getHotbarSlot(Items.EXPERIENCE_BOTTLE);
        if (expSlot == null) {
            if (getDurabilityPercent(mc.player.getMainHandStack()) < 15) this.setState(false);
            return;
        }
        repairActive = true;
        repairThrowing = false;
        repairExpSlot = expSlot.id - 36;
        repairStartMs = System.currentTimeMillis();

        RotationTask.create("automine_repair", 50);
        RotationTask.setTargetRotation(mc.player.getYaw(), 90, 50);
        RotationTask.scheduleActionAfterAim(() -> {
            Slot ps = mc.player.currentScreenHandler.getSlot(36 + repairPickaxeHotbarSlot);
            PlayerInventoryUtil.swapHand(ps, Hand.OFF_HAND, false, true);
            mc.player.getInventory().setSelectedSlot(repairExpSlot);
            repairThrowing = true;
        });
    }

    private void tickRepair() {
        if (mc.player == null) {
            finishRepair();
            return;
        }
        if (!repairThrowing) {
            if (System.currentTimeMillis() - repairStartMs > 3000L) finishRepair();
            return;
        }
        ItemStack offhand = mc.player.getOffHandStack();
        if (offhand.isEmpty() || !hasMending(offhand)) {
            finishRepair();
            return;
        }
        if (offhand.getDamage() <= 0) {
            finishRepair();
            return;
        }
        ItemStack main = mc.player.getMainHandStack();
        if (main.getItem() != Items.EXPERIENCE_BOTTLE) {
            Slot expSlot = PlayerInventoryUtil.getHotbarSlot(Items.EXPERIENCE_BOTTLE);
            if (expSlot != null) {
                repairExpSlot = expSlot.id - 36;
                mc.player.getInventory().setSelectedSlot(repairExpSlot);
            } else {
                if (getDurabilityPercent(offhand) < 15) this.setState(false);
                finishRepair();
                return;
            }
        }
        long now = System.currentTimeMillis();
        if (now - repairLastThrowMs >= 50) {
            mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
            repairLastThrowMs = now;
        }
    }

    private void finishRepair() {
        if (repairActive && mc.player != null) {
            ItemStack offhand = mc.player.getOffHandStack();
            String id = String.valueOf(Registries.ITEM.getId(offhand.getItem()));
            if (id.contains("pickaxe") || id.contains("_pick") || id.contains("drill") || id.contains("hammer")) {
                Slot sl = mc.player.currentScreenHandler.getSlot(36 + repairPickaxeHotbarSlot);
                PlayerInventoryUtil.swapHand(sl, Hand.OFF_HAND, false, true);
            }
            mc.player.getInventory().setSelectedSlot(repairPickaxeHotbarSlot);
        }
        repairActive = false;
        repairThrowing = false;
        repairExpSlot = -1;
        repairPickaxeHotbarSlot = -1;
        repairLastThrowMs = 0;
        repairStartMs = 0;
        RotationTask.remove("automine_repair");

        if (getState() && BaritoneHelper.isAvailable()) startMining();
    }

    // ── Trash ─────────────────────────────────────────────────────

    private boolean hasTrash() {
        if (mc.player == null) return false;
        for (int slotId = 9; slotId <= 44; slotId++) {
            if (slotId >= mc.player.currentScreenHandler.slots.size()) continue;
            if (isTrashItem(mc.player.currentScreenHandler.getSlot(slotId).getStack())) return true;
        }
        return false;
    }

    private void dropTrash() {
        if (mc.player == null || mc.interactionManager == null) return;
        if (mc.currentScreen != null
                && !(mc.currentScreen instanceof net.minecraft.client.gui.screen.ingame.InventoryScreen)) return;
        for (int slotId = 9; slotId <= 44; slotId++) {
            if (slotId >= mc.player.currentScreenHandler.slots.size()) continue;
            ItemStack s = mc.player.currentScreenHandler.getSlot(slotId).getStack();
            if (isTrashItem(s)) PlayerInventoryUtil.clickSlot(slotId, 1, SlotActionType.THROW);
        }
    }

    private boolean isTrashItem(ItemStack stack) {
        if (stack.isEmpty() || isProtectedItem(stack)) return false;
        String id = String.valueOf(Registries.ITEM.getId(stack.getItem()));
        if (id.equals("minecraft:cobblestone") || id.equals("minecraft:stone")
                || id.equals("minecraft:diorite") || id.equals("minecraft:granite")) return true;
        if (trashOres.getByName("Лазурит").get() && id.equals("minecraft:lapis_lazuli")) return true;
        if (trashOres.getByName("Уголь").get() && id.equals("minecraft:coal")) return true;
        if (trashOres.getByName("Редстоун").get() && id.equals("minecraft:redstone")) return true;
        if (trashOres.getByName("Золотые слитки").get() && id.equals("minecraft:gold_ingot")) return true;
        if (trashOres.getByName("Железные слитки").get() && id.equals("minecraft:iron_ingot")) return true;
        return false;
    }

    private boolean isProtectedItem(ItemStack stack) {
        if (stack.isEmpty()) return false;
        if (stack.isOf(Items.DIAMOND)) return true;
        String id = String.valueOf(Registries.ITEM.getId(stack.getItem()));
        return id.contains("netherite_pickaxe") || id.contains("diamond_pickaxe");
    }

    // ── Stuck ─────────────────────────────────────────────────────

    private boolean isStuckInBlocks() {
        if (mc.player == null || mc.world == null) return false;
        BlockPos feet = mc.player.getBlockPos();
        return !mc.world.getBlockState(feet).isAir() || !mc.world.getBlockState(feet.up()).isAir();
    }

    private void scanStuckBlocks() {
        if (mc.player == null || mc.world == null) return;
        long now = System.currentTimeMillis();
        if (now - lastStuckScanMs < 500L && !stuckBlockQueue.isEmpty()) return;
        lastStuckScanMs = now;
        stuckBlockQueue.clear();
        BlockPos center = mc.player.getBlockPos();
        for (int dx = -1; dx <= 1; dx++)
            for (int dy = 0; dy <= 2; dy++)
                for (int dz = -1; dz <= 1; dz++) {
                    BlockPos p = center.add(dx, dy, dz);
                    if (!mc.world.getBlockState(p).isAir() && !isWantedOre(mc.world.getBlockState(p)))
                        stuckBlockQueue.add(p.toImmutable());
                }
    }

    // ── Rotation ──────────────────────────────────────────────────

    private void updateBaritoneRotation() {
        if (mc.player == null || repairActive) return; // во время починки рулит её ротация

        // БАРИТОН РОТАЦИЯ: теперь перехватывается автоматически через BaritoneRotationHook
        // + EntityMixin + RotationTask. НЕ нужно вручную вызывать applyRotation.
        // Весь хендл ротации Baritone идёт СТРОГО через RotationTask (без сглаживания/рандомизации).

        // Fallback: ручная ротация только для diamondLoot (когда Baritone не рулит)
        Vec3d look = null;
        if (diamondLootTarget != null) look = diamondLootTarget;
        else if (currentTarget != null) look = Vec3d.ofCenter(currentTarget);
        if (look == null) return;

        float[] rot = calcRotation(look);
        // Тупо pass-through — без сглаживания/рандомизации (весь Baritone хендл строго через RotationTask)
        RotationTask.setTargetRotation(rot[0], rot[1], 40);
    }

    private float[] calcRotation(Vec3d target) {
        Vec3d eye = mc.player.getEyePos();
        double dx = target.x - eye.x;
        double dy = target.y - eye.y;
        double dz = target.z - eye.z;
        double horiz = Math.sqrt(dx * dx + dz * dz);
        float yaw = (float) (Math.toDegrees(Math.atan2(dz, dx)) - 90.0);
        float pitch = (float) (-Math.toDegrees(Math.atan2(dy, horiz)));
        return new float[]{MathHelper.wrapDegrees(yaw), MathHelper.clamp(pitch, -90f, 90f)};
    }

    // ── Zone checks ──────────────────────────────────────────────

    private boolean isInsideArea(BlockPos pos, double margin) {
        if (!hasArea()) return true;
        BlockPos p1 = autoMineConfig.getPos1();
        BlockPos p2 = autoMineConfig.getPos2();
        double minX = Math.min(p1.getX(), p2.getX()) - margin;
        double maxX = Math.max(p1.getX(), p2.getX()) + 1 + margin;
        double minY = Math.min(p1.getY(), p2.getY()) - margin;
        double maxY = Math.max(p1.getY(), p2.getY()) + 1 + margin;
        double minZ = Math.min(p1.getZ(), p2.getZ()) - margin;
        double maxZ = Math.max(p1.getZ(), p2.getZ()) + 1 + margin;
        return pos.getX() >= minX && pos.getX() <= maxX
                && pos.getY() >= minY && pos.getY() <= maxY
                && pos.getZ() >= minZ && pos.getZ() <= maxZ;
    }

    private BlockPos areaCenter() {
        if (!hasArea()) return null;
        BlockPos p1 = autoMineConfig.getPos1();
        BlockPos p2 = autoMineConfig.getPos2();
        return new BlockPos(
                (p1.getX() + p2.getX()) / 2,
                (p1.getY() + p2.getY()) / 2,
                (p1.getZ() + p2.getZ()) / 2);
    }

    // ── Config ────────────────────────────────────────────────────

    public void setPos1(BlockPos pos) {
        autoMineConfig.setPos1(pos);
    }

    public void setPos2(BlockPos pos) {
        autoMineConfig.setPos2(pos);
    }

    public BlockPos getPos1() {
        return autoMineConfig.getPos1();
    }

    public BlockPos getPos2() {
        return autoMineConfig.getPos2();
    }

    private boolean hasArea() {
        return autoMineConfig.hasArea();
    }

    // ── Render helpers ────────────────────────────────────────────

    private void renderBlock(WorldRenderer renderer, Camera camera, MatrixStack.Entry entry, BlockPos pos, int rgba) {
        Vec3d cam = camera.getCameraPos();
        Box box = new Box(pos).expand(0.002).offset(-cam.x, -cam.y, -cam.z);
        int fill = ColorUtils.injectAlpha(rgba, 90);

        // ФИКС: матрица из begin (entry), а не new MatrixStack().peek()
        WorldGeometryEmitter emitter = new WorldGeometryEmitter(
                camera, entry,
                renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_ADDITIVE_NO_DEPTH()));
        emitBoxFill(emitter, box, fill);
    }

    private void emitBoxFill(WorldGeometryEmitter e, Box b, int c) {
        Vec3d p000 = new Vec3d(b.minX, b.minY, b.minZ), p001 = new Vec3d(b.minX, b.minY, b.maxZ),
                p010 = new Vec3d(b.minX, b.maxY, b.minZ), p011 = new Vec3d(b.minX, b.maxY, b.maxZ),
                p100 = new Vec3d(b.maxX, b.minY, b.minZ), p101 = new Vec3d(b.maxX, b.minY, b.maxZ),
                p110 = new Vec3d(b.maxX, b.maxY, b.minZ), p111 = new Vec3d(b.maxX, b.maxY, b.maxZ);
        e.emitQuad(p000, p100, p110, p010, c, c, c, c);
        e.emitQuad(p001, p011, p111, p101, c, c, c, c);
        e.emitQuad(p000, p001, p101, p100, c, c, c, c);
        e.emitQuad(p010, p110, p111, p011, c, c, c, c);
        e.emitQuad(p000, p010, p011, p001, c, c, c, c);
        e.emitQuad(p100, p101, p111, p110, c, c, c, c);
    }
}
