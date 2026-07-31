package fun.wonderful.client.modules.impl.player;

import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.bot.BotSessionManager;
import fun.wonderful.api.utils.chat.ChatUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.player.FastBreak;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;

public class AutoForest
extends Module {
    public static AutoForest INSTANCE = new AutoForest();
    private static final double MAX_RANGE = 4.0;
    private static final double MAX_RANGE_SQ = 16.0;
    private static final long DEFAULT_BREAK_DELAY_MS = 3L;
    private static final float AUTO_FAST_BREAK_SPEED = 1.0f;
    private static final float DEFAULT_PACKETS_PER_SECOND = 100.0f;
    private static final long VISUAL_TTL_MS = 300000L;
    private static final long NICK_REMINDER_DELAY_MS = 5000L;
    private static final String MODE_NORMAL_ALIAS = "normal";
    private static final String MODE_FAST_ALIAS = "fast";
    private final ModeSetting breakMode = new ModeSetting("Режим ломания", "Обычный", "Обычный", "Быстрый");
    private final FloatSetting packetsPerSecond = new FloatSetting("Пакетов в секунду", 100.0f, 1.0f, 100.0f, 1.0f).visible(() -> this.breakMode.is("Быстрый"));
    private final FloatSetting breakRadius = new FloatSetting("Радиус", 4.0f, 1.0f, 6.0f, 0.5f);
    private final BooleanSetting swing = new BooleanSetting("Махать рукой", true);
    private final BooleanSetting autoSell = new BooleanSetting("Авто продажа дерева", true);
    private final BooleanSetting autoPay = new BooleanSetting("AutoPay", false);
    private final BooleanSetting preserveVisuals = new BooleanSetting("Сохранять визуализацию", true);
    private final FloatSetting payAmount = new FloatSetting("Сумма перевода", 1000.0f, 500.0f, 25000.0f, 500.0f).visible(this.autoPay::isState);
    private final FloatSetting intervalSeconds = new FloatSetting("Задержка", 20.0f, 1.0f, 60.0f, 1.0f);
    private final Map<BlockPos, BlockState> preservedBlocks = new HashMap<BlockPos, BlockState>();
    private final Map<BlockPos, Long> lastUpdateTime = new HashMap<BlockPos, Long>();
    private final Set<BlockPos> managedBlocks = new HashSet<BlockPos>();
    private boolean currentSessionEnabled;
    private BlockPos targetPos;
    private String payTarget = "";
    private long lastBreakTime;
    private long lastPacketTime;
    private long lastSellTime;
    private long lastPayTime;
    private long lastNickReminderTime;

    public AutoForest() {
        super("AutoForest", "Автоматически ломает бревна и переводит деньги", Module.ModuleCategory.PLAYER);
        this.addSettings(this.breakMode, this.packetsPerSecond, this.breakRadius, this.swing, this.autoSell, this.autoPay, this.preserveVisuals, this.payAmount, this.intervalSeconds);
        EventInvoker.register(this);
    }

    @EventLink
    public void onUpdate(EventUpdate var1) {
    }

    private void tickCurrentSession() {
        if (AutoForest.mc.player == null || AutoForest.mc.world == null || mc.getNetworkHandler() == null) {
            this.targetPos = null;
            return;
        }
        long now = System.currentTimeMillis();
        long scheduleDelay = Math.max(1000L, (long)(this.intervalSeconds.get() * 500.0f));
        if (this.autoSell.isState() && now - this.lastSellTime >= scheduleDelay) {
            mc.getNetworkHandler().sendChatCommand("sellwood");
            this.lastSellTime = now;
        }
        if (this.autoPay.isState()) {
            if (this.payTarget.isBlank()) {
                if (now - this.lastNickReminderTime >= 5000L) {
                    this.lastNickReminderTime = now;
                    ChatUtils.sendMessage("Укажите ник для перевода через .autoles pay <nick>");
                }
            } else if (now - this.lastPayTime >= scheduleDelay + 200L) {
                mc.getNetworkHandler().sendChatCommand("pay " + this.payTarget + " " + (int)this.payAmount.get());
                this.lastPayTime = now;
            }
        }
        if (!(this.targetPos == null || this.isLog(this.targetPos) && this.isInRange(this.targetPos) && this.isVisible(this.targetPos))) {
            this.targetPos = null;
        }
        if (this.targetPos == null) {
            this.targetPos = this.findNearestLog();
        }
        if (this.targetPos != null) {
            this.breakTarget(now);
        }
        if (this.preserveVisuals.isState()) {
            this.updateVisualization(now);
        }
    }

    private void tickFrozenBots() {
        for (BotSessionManager.BotConnection bot : BotSessionManager.getConnections()) {
            SessionState state = bot.autoForestState();
            if (state == null || !state.enabled() || bot.player() == null || bot.world() == null || bot.handler() == null) continue;
            try {
                this.tickBotSession(bot, state);
            }
            catch (Exception ignored) {
                state.enabled(false);
                state.targetPos(null);
            }
        }
    }

    private void tickBotSession(BotSessionManager.BotConnection bot, SessionState state) {
        if (bot.player().isRemoved() || !bot.player().isAlive()) {
            state.enabled(false);
            state.targetPos(null);
            return;
        }
        long now = System.currentTimeMillis();
        long scheduleDelay = Math.max(1000L, (long)(Math.max(1.0f, state.intervalSeconds()) * 500.0f));
        if (state.autoSell() && now - state.lastSellTime() >= scheduleDelay) {
            bot.handler().sendChatCommand("sellwood");
            state.lastSellTime(now);
        }
        if (state.autoPay()) {
            if (state.payTarget().isBlank()) {
                if (now - state.lastNickReminderTime() >= 5000L) {
                    state.lastNickReminderTime(now);
                }
            } else if (now - state.lastPayTime() >= scheduleDelay + 200L) {
                bot.handler().sendChatCommand("pay " + state.payTarget() + " " + (int)state.payAmount());
                state.lastPayTime(now);
            }
        }
        if (!(state.targetPos() == null || this.isLog(bot.world(), state.targetPos()) && this.isInRange(bot.player(), state.targetPos()) && this.isVisible(bot.world(), bot.player(), state.targetPos()))) {
            state.targetPos(null);
        }
        if (state.targetPos() == null) {
            state.targetPos(this.findNearestLog(bot.world(), bot.player(), state.breakRadius()));
        }
        if (state.targetPos() == null) {
            return;
        }
        if (MODE_FAST_ALIAS.equals(state.modeAlias())) {
            long interval = Math.max(1L, (long)(1000.0f / Math.max(1.0f, state.packetsPerSecond())));
            if (now - state.lastPacketTime() < interval) {
                return;
            }
            this.performFastBreak(bot.handler(), bot.interactionManager(), bot.player(), bot.world(), state.targetPos(), state.swing());
            state.lastPacketTime(now);
            return;
        }
        if (now - state.lastBreakTime() < 3L) {
            return;
        }
        if (bot.interactionManager() != null) {
            bot.interactionManager().attackBlock(state.targetPos(), Direction.UP);
            bot.interactionManager().updateBlockBreakingProgress(state.targetPos(), Direction.UP);
        } else {
            this.performFastBreak(bot.handler(), bot.interactionManager(), bot.player(), bot.world(), state.targetPos(), state.swing());
        }
        if (state.swing()) {
            bot.handler().sendPacket((Packet)new HandSwingC2SPacket(Hand.MAIN_HAND));
        }
        state.lastBreakTime(now);
    }

    @EventLink
    public void onPacket(EventPacket event) {
        Packet<?> class_25962;
        if (!this.currentSessionEnabled || !this.preserveVisuals.isState() || AutoForest.mc.player == null || AutoForest.mc.world == null) {
            return;
        }
        if (event.getType() == EventPacket.Type.SEND && (class_25962 = event.getPacket()) instanceof PlayerActionC2SPacket) {
            PlayerActionC2SPacket packet = (PlayerActionC2SPacket)class_25962;
            this.handleDigPacket(packet);
            return;
        }
        if (event.getType() == EventPacket.Type.RECEIVE && (class_25962 = event.getPacket()) instanceof BlockUpdateS2CPacket) {
            BlockUpdateS2CPacket packet = (BlockUpdateS2CPacket)class_25962;
            BlockPos pos = packet.getPos();
            BlockState savedState = this.preservedBlocks.get(pos);
            if (savedState == null) {
                return;
            }
            BlockState serverState = packet.getState();
            if (serverState.isAir() || !serverState.equals(savedState)) {
                event.cancel();
                this.setClientBlock(pos, savedState);
                this.lastUpdateTime.put(pos, System.currentTimeMillis());
            }
        }
    }

    private void breakTarget(long now) {
        if (this.targetPos == null || AutoForest.mc.player == null || AutoForest.mc.player.networkHandler == null || AutoForest.mc.interactionManager == null) {
            return;
        }
        if (this.breakMode.is("Быстрый")) {
            long interval = Math.max(1L, (long)(1000.0f / Math.max(1.0f, this.packetsPerSecond.get())));
            if (now - this.lastPacketTime < interval) {
                return;
            }
            this.performFastBreak(this.targetPos);
            this.lastPacketTime = now;
            return;
        }
        if (now - this.lastBreakTime < 3L) {
            return;
        }
        AutoForest.mc.interactionManager.attackBlock(this.targetPos, Direction.UP);
        AutoForest.mc.interactionManager.updateBlockBreakingProgress(this.targetPos, Direction.UP);
        if (this.swing.isState()) {
            AutoForest.mc.player.swingHand(Hand.MAIN_HAND);
        }
        this.lastBreakTime = now;
    }

    private void performFastBreak(BlockPos pos) {
        if (AutoForest.mc.player == null || AutoForest.mc.world == null || AutoForest.mc.player.networkHandler == null) {
            return;
        }
        this.performFastBreak(AutoForest.mc.player.networkHandler, AutoForest.mc.interactionManager, AutoForest.mc.player, AutoForest.mc.world, pos, this.swing.isState());
    }

    private void performFastBreak(ClientPlayNetworkHandler handler, ClientPlayerInteractionManager interactionManager, ClientPlayerEntity player, ClientWorld world, BlockPos pos, boolean shouldSwing) {
        if (handler == null || player == null || pos == null) {
            return;
        }
        boolean accelerated = false;
        if (interactionManager != null && world != null) {
            interactionManager.attackBlock(pos, Direction.UP);
            accelerated = FastBreak.accelerateClientBreak(interactionManager, player, world, pos, Direction.UP, 1.0f, shouldSwing);
        }
        if (!accelerated) {
            FastBreak.packetBreak(handler, player, pos, Direction.UP, shouldSwing);
        }
    }

    private BlockPos findNearestLog() {
        return this.findNearestLog(AutoForest.mc.world, AutoForest.mc.player, this.breakRadius.get());
    }

    private BlockPos findNearestLog(ClientWorld world, ClientPlayerEntity player, float radiusValue) {
        if (player == null || world == null) {
            return null;
        }
        BlockPos playerPos = player.getBlockPos();
        int radius = Math.round(radiusValue);
        return BlockPos.stream((BlockPos)playerPos.add(-radius, -radius, -radius), (BlockPos)playerPos.add(radius, radius, radius)).map(BlockPos::toImmutable).filter(pos -> this.isLog(world, (BlockPos)pos)).filter(pos -> this.isInRange(player, (BlockPos)pos)).filter(pos -> this.isVisible(world, player, (BlockPos)pos)).min(Comparator.comparingDouble(pos -> player.squaredDistanceTo(Vec3d.ofCenter((Vec3i)pos)))).orElse(null);
    }

    private boolean isInRange(BlockPos pos) {
        return this.isInRange(AutoForest.mc.player, pos);
    }

    private boolean isInRange(ClientPlayerEntity player, BlockPos pos) {
        return player != null && player.squaredDistanceTo(Vec3d.ofCenter((Vec3i)pos)) <= 16.0;
    }

    private boolean isVisible(BlockPos pos) {
        return this.isVisible(AutoForest.mc.world, AutoForest.mc.player, pos);
    }

    private boolean isVisible(ClientWorld world, ClientPlayerEntity player, BlockPos pos) {
        Vec3d targetCenter;
        if (player == null || world == null) {
            return false;
        }
        Vec3d eyePos = player.getEyePos();
        BlockHitResult hit = world.raycast(new RaycastContext(eyePos, targetCenter = Vec3d.ofCenter((Vec3i)pos), RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)player));
        return hit == null || hit.getType() == HitResult.Type.MISS || pos.equals((Object)hit.getBlockPos());
    }

    private boolean isLog(BlockPos pos) {
        return this.isLog(AutoForest.mc.world, pos);
    }

    private boolean isLog(ClientWorld world, BlockPos pos) {
        return world != null && world.getBlockState(pos).isIn(BlockTags.LOGS);
    }

    private void handleDigPacket(PlayerActionC2SPacket packet) {
        PlayerActionC2SPacket.Action action = packet.getAction();
        if (action != PlayerActionC2SPacket.Action.START_DESTROY_BLOCK && action != PlayerActionC2SPacket.Action.STOP_DESTROY_BLOCK) {
            return;
        }
        BlockPos pos = packet.getPos();
        if (!this.isLog(pos)) {
            return;
        }
        BlockState state = AutoForest.mc.world.getBlockState(pos);
        if (state.isAir()) {
            return;
        }
        this.preservedBlocks.put(pos, state);
        this.managedBlocks.add(pos);
        this.lastUpdateTime.put(pos, System.currentTimeMillis());
        this.setClientBlock(pos, state);
    }

    private void updateVisualization(long now) {
        ClientWorld NarrationMessageBuilder = AutoForest.mc.world;
        if (!(NarrationMessageBuilder instanceof ClientWorld)) {
            return;
        }
        ClientWorld clientWorld = NarrationMessageBuilder;
        HashSet<BlockPos> toRemove = new HashSet<BlockPos>();
        for (Map.Entry<BlockPos, BlockState> entry : this.preservedBlocks.entrySet()) {
            Long lastSeen;
            BlockPos pos = entry.getKey();
            BlockState savedState = entry.getValue();
            BlockState currentState = clientWorld.getBlockState(pos);
            if (currentState == null || !currentState.equals(savedState)) {
                clientWorld.setBlockState(pos, savedState, 0);
                this.lastUpdateTime.put(pos, now);
            }
            if ((lastSeen = this.lastUpdateTime.get(pos)) == null || now - lastSeen <= 300000L) continue;
            toRemove.add(pos);
        }
        for (BlockPos pos : toRemove) {
            this.preservedBlocks.remove(pos);
            this.lastUpdateTime.remove(pos);
            this.managedBlocks.remove(pos);
        }
    }

    private void restoreVisualState() {
        ClientWorld NarrationMessageBuilder = AutoForest.mc.world;
        if (!(NarrationMessageBuilder instanceof ClientWorld)) {
            this.preservedBlocks.clear();
            this.lastUpdateTime.clear();
            this.managedBlocks.clear();
            return;
        }
        ClientWorld clientWorld = NarrationMessageBuilder;
        for (BlockPos pos : this.managedBlocks) {
            clientWorld.setBlockState(pos, AutoForest.mc.world.getBlockState(pos), 0);
        }
        this.preservedBlocks.clear();
        this.lastUpdateTime.clear();
        this.managedBlocks.clear();
    }

    private void setClientBlock(BlockPos pos, BlockState state) {
        ClientWorld NarrationMessageBuilder = AutoForest.mc.world;
        if (NarrationMessageBuilder instanceof ClientWorld) {
            ClientWorld clientWorld = NarrationMessageBuilder;
            clientWorld.setBlockState(pos, state, 0);
        }
    }

    public List<String> getModeSuggestions() {
        return List.of(MODE_NORMAL_ALIAS, MODE_FAST_ALIAS);
    }

    public boolean setModeAlias(String alias) {
        if (alias == null || alias.isBlank()) {
            return false;
        }
        return switch (alias.trim().toLowerCase(Locale.ROOT)) {
            case MODE_NORMAL_ALIAS, "default", "обычный" -> {
                this.breakMode.set(this.breakMode.getMods().get(0));
                yield true;
            }
            case MODE_FAST_ALIAS, "quick", "быстрый" -> {
                if (this.breakMode.getMods().size() < 2) {
                    yield false;
                }
                this.breakMode.set(this.breakMode.getMods().get(1));
                yield true;
            }
            default -> false;
        };
    }

    public String getModeAlias() {
        if (this.breakMode.getMods().size() > 1 && this.breakMode.is(this.breakMode.getMods().get(1))) {
            return MODE_FAST_ALIAS;
        }
        return MODE_NORMAL_ALIAS;
    }

    public void enableForCurrentSession() {
        this.currentSessionEnabled = true;
        this.resetRuntimeState();
        this.restoreVisualState();
    }

    public void disableForCurrentSession() {
        this.currentSessionEnabled = false;
        this.restoreVisualState();
        this.resetRuntimeState();
    }

    public boolean isCurrentSessionEnabled() {
        return this.currentSessionEnabled;
    }

    public void setSwingEnabled(boolean value) {
        this.swing.setState(value);
    }

    public boolean isSwingEnabled() {
        return this.swing.isState();
    }

    public void setAutoSellEnabled(boolean value) {
        this.autoSell.setState(value);
    }

    public boolean isAutoSellEnabled() {
        return this.autoSell.isState();
    }

    public void setAutoPayEnabled(boolean value) {
        this.autoPay.setState(value);
        if (!value) {
            this.lastNickReminderTime = 0L;
        }
    }

    public boolean isAutoPayEnabled() {
        return this.autoPay.isState();
    }

    public void setPreserveVisualsEnabled(boolean value) {
        this.preserveVisuals.setState(value);
    }

    public boolean isPreserveVisualsEnabled() {
        return this.preserveVisuals.isState();
    }

    public void setPacketsPerSecond(float value) {
        this.packetsPerSecond.setValue(value);
    }

    public float getPacketsPerSecond() {
        return this.packetsPerSecond.get();
    }

    public void setBreakRadius(float value) {
        this.breakRadius.setValue(value);
    }

    public float getBreakRadius() {
        return this.breakRadius.get();
    }

    public void setPayAmount(float value) {
        this.payAmount.setValue(value);
    }

    public float getPayAmount() {
        return this.payAmount.get();
    }

    public void setIntervalSeconds(float value) {
        this.intervalSeconds.setValue(value);
    }

    public float getIntervalSeconds() {
        return this.intervalSeconds.get();
    }

    public boolean setPayTarget(String target) {
        String trimmed;
        String string = trimmed = target == null ? "" : target.trim();
        if (trimmed.isEmpty()) {
            return false;
        }
        this.payTarget = trimmed;
        this.lastNickReminderTime = 0L;
        return true;
    }

    public String getPayTarget() {
        return this.payTarget;
    }

    public boolean capturePayTargetFromChat(String message) {
        return false;
    }

    public void clearPayTarget() {
        this.payTarget = "";
        this.lastNickReminderTime = 0L;
    }

    public SessionState captureState() {
        SessionState state = new SessionState();
        state.enabled(this.currentSessionEnabled);
        state.modeAlias(this.getModeAlias());
        state.packetsPerSecond(this.packetsPerSecond.get());
        state.breakRadius(this.breakRadius.get());
        state.swing(this.swing.isState());
        state.autoSell(this.autoSell.isState());
        state.autoPay(this.autoPay.isState());
        state.preserveVisuals(this.preserveVisuals.isState());
        state.payAmount(this.payAmount.get());
        state.intervalSeconds(this.intervalSeconds.get());
        state.payTarget(this.payTarget);
        state.targetPos(this.targetPos);
        state.lastBreakTime(this.lastBreakTime);
        state.lastPacketTime(this.lastPacketTime);
        state.lastSellTime(this.lastSellTime);
        state.lastPayTime(this.lastPayTime);
        state.lastNickReminderTime(this.lastNickReminderTime);
        state.preservedBlocks(new HashMap<BlockPos, BlockState>(this.preservedBlocks));
        state.lastUpdateTime(new HashMap<BlockPos, Long>(this.lastUpdateTime));
        state.managedBlocks(new HashSet<BlockPos>(this.managedBlocks));
        return state;
    }

    public void applyState(SessionState state) {
        if (state == null) {
            this.resetToDefaults();
            return;
        }
        this.currentSessionEnabled = state.enabled();
        this.setModeAlias(state.modeAlias());
        this.packetsPerSecond.setValue(state.packetsPerSecond());
        this.breakRadius.setValue(state.breakRadius());
        this.swing.setState(state.swing());
        this.autoSell.setState(state.autoSell());
        this.autoPay.setState(state.autoPay());
        this.preserveVisuals.setState(state.preserveVisuals());
        this.payAmount.setValue(state.payAmount());
        this.intervalSeconds.setValue(state.intervalSeconds());
        this.payTarget = state.payTarget();
        this.targetPos = state.targetPos();
        this.lastBreakTime = state.lastBreakTime();
        this.lastPacketTime = state.lastPacketTime();
        this.lastSellTime = state.lastSellTime();
        this.lastPayTime = state.lastPayTime();
        this.lastNickReminderTime = state.lastNickReminderTime();
        this.preservedBlocks.clear();
        this.preservedBlocks.putAll(state.preservedBlocks());
        this.lastUpdateTime.clear();
        this.lastUpdateTime.putAll(state.lastUpdateTime());
        this.managedBlocks.clear();
        this.managedBlocks.addAll(state.managedBlocks());
    }

    public void resetToDefaults() {
        this.currentSessionEnabled = false;
        this.setModeAlias(MODE_NORMAL_ALIAS);
        this.packetsPerSecond.setValue(100.0f);
        this.breakRadius.setValue(4.0f);
        this.swing.setState(true);
        this.autoSell.setState(true);
        this.autoPay.setState(false);
        this.preserveVisuals.setState(true);
        this.payAmount.setValue(1000.0f);
        this.intervalSeconds.setValue(20.0f);
        this.payTarget = "";
        this.restoreVisualState();
        this.resetRuntimeState();
    }

    private void resetRuntimeState() {
        this.targetPos = null;
        this.lastBreakTime = 0L;
        this.lastPacketTime = 0L;
        this.lastSellTime = 0L;
        this.lastPayTime = 0L;
        this.lastNickReminderTime = 0L;
        this.preservedBlocks.clear();
        this.lastUpdateTime.clear();
        this.managedBlocks.clear();
    }

    public static final class SessionState {
        private boolean enabled;
        private String modeAlias = "normal";
        private float packetsPerSecond = 100.0f;
        private float breakRadius = 4.0f;
        private boolean swing = true;
        private boolean autoSell = true;
        private boolean autoPay;
        private boolean preserveVisuals = true;
        private float payAmount = 1000.0f;
        private float intervalSeconds = 20.0f;
        private String payTarget = "";
        private BlockPos targetPos;
        private long lastBreakTime;
        private long lastPacketTime;
        private long lastSellTime;
        private long lastPayTime;
        private long lastNickReminderTime;
        private Map<BlockPos, BlockState> preservedBlocks = new HashMap<BlockPos, BlockState>();
        private Map<BlockPos, Long> lastUpdateTime = new HashMap<BlockPos, Long>();
        private Set<BlockPos> managedBlocks = new HashSet<BlockPos>();

        public boolean enabled() {
            return this.enabled;
        }

        public void enabled(boolean value) {
            this.enabled = value;
        }

        public String modeAlias() {
            return this.modeAlias;
        }

        public void modeAlias(String value) {
            this.modeAlias = value == null ? AutoForest.MODE_NORMAL_ALIAS : value;
        }

        public float packetsPerSecond() {
            return this.packetsPerSecond;
        }

        public void packetsPerSecond(float value) {
            this.packetsPerSecond = value;
        }

        public float breakRadius() {
            return this.breakRadius;
        }

        public void breakRadius(float value) {
            this.breakRadius = value;
        }

        public boolean swing() {
            return this.swing;
        }

        public void swing(boolean value) {
            this.swing = value;
        }

        public boolean autoSell() {
            return this.autoSell;
        }

        public void autoSell(boolean value) {
            this.autoSell = value;
        }

        public boolean autoPay() {
            return this.autoPay;
        }

        public void autoPay(boolean value) {
            this.autoPay = value;
        }

        public boolean preserveVisuals() {
            return this.preserveVisuals;
        }

        public void preserveVisuals(boolean value) {
            this.preserveVisuals = value;
        }

        public float payAmount() {
            return this.payAmount;
        }

        public void payAmount(float value) {
            this.payAmount = value;
        }

        public float intervalSeconds() {
            return this.intervalSeconds;
        }

        public void intervalSeconds(float value) {
            this.intervalSeconds = value;
        }

        public String payTarget() {
            return this.payTarget == null ? "" : this.payTarget;
        }

        public void payTarget(String value) {
            this.payTarget = value == null ? "" : value;
        }

        public BlockPos targetPos() {
            return this.targetPos;
        }

        public void targetPos(BlockPos value) {
            this.targetPos = value;
        }

        public long lastBreakTime() {
            return this.lastBreakTime;
        }

        public void lastBreakTime(long value) {
            this.lastBreakTime = value;
        }

        public long lastPacketTime() {
            return this.lastPacketTime;
        }

        public void lastPacketTime(long value) {
            this.lastPacketTime = value;
        }

        public long lastSellTime() {
            return this.lastSellTime;
        }

        public void lastSellTime(long value) {
            this.lastSellTime = value;
        }

        public long lastPayTime() {
            return this.lastPayTime;
        }

        public void lastPayTime(long value) {
            this.lastPayTime = value;
        }

        public long lastNickReminderTime() {
            return this.lastNickReminderTime;
        }

        public void lastNickReminderTime(long value) {
            this.lastNickReminderTime = value;
        }

        public Map<BlockPos, BlockState> preservedBlocks() {
            return this.preservedBlocks;
        }

        public void preservedBlocks(Map<BlockPos, BlockState> value) {
            this.preservedBlocks = value == null ? new HashMap() : value;
        }

        public Map<BlockPos, Long> lastUpdateTime() {
            return this.lastUpdateTime;
        }

        public void lastUpdateTime(Map<BlockPos, Long> value) {
            this.lastUpdateTime = value == null ? new HashMap() : value;
        }

        public Set<BlockPos> managedBlocks() {
            return this.managedBlocks;
        }

        public void managedBlocks(Set<BlockPos> value) {
            this.managedBlocks = value == null ? new HashSet() : value;
        }
    }
}