package fun.nexisdlc.modules.impl.combat;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.FastestEvent;
import fun.nexisdlc.client.events.impl.client.TickEvent;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.player.SprintEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.time.NewStopWatch;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.server.ServerTPSManager;
import fun.nexisdlc.mixins.accessors.ClientPlayerInteractionManagerAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeListSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import fun.nexisdlc.modules.impl.movement.AutoSprint;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;

import java.util.concurrent.ThreadLocalRandom;

@FunctionAdd(name = "TriggerBot", alias = "Trigger Bot", category = Category.Combat, description = "Автоматически атакует цель под прицелом")
public class TriggerBot extends Function {

    private static final long BASE_ATTACK_TIMER_DELAY_MS = 548L;
    private static final long BASE_ATTACK_PROGRESS_DELAY_MS = 548L;
    private static final long HASTE_ATTACK_TIMER_REDUCTION_MS = 70L;
    private static final long FASTEST_ROTATION_INTERVAL_NS = 5_000_000L;

    private final ModeSetting clickMode = new ModeSetting("Режим клика", "1.9", "1.9", "1.8");
    private final SliderSetting minCps = new SliderSetting("Мин. CPS", 7.0f, 1.0f, 20.0f, 0.5f);
    private final SliderSetting maxCps = new SliderSetting("Макс. CPS", 11.0f, 1.0f, 20.0f, 0.5f);
    private final BooleanSetting tpsSynchronization = new BooleanSetting("Синхронизация TPS", true);
    private final ModeSetting attackSpeedMode = new ModeSetting("Скорость атаки", "Медленная", "Медленная", "Быстрая", "Самая быстрая");
    private final BooleanSetting smartCrits = new BooleanSetting("Умные криты", false);
    private final ModeSetting sprintResetMode = new ModeSetting("Сброс спринта", "Обычный", "Выкл", "Обычный", "SpookyTime");

    public final ModeListSetting attack = new ModeListSetting("Атака",
            new BooleanSetting("Ломать щит", false),
            new BooleanSetting("Во время еды", false));

    private final SliderSetting attackRange = new SliderSetting("Дистанция атаки", 3.0f, 1.0f, 6.0f, 0.1f);
    private final BooleanSetting increaseRangeInBlocks = new BooleanSetting("Увеличить дистанцию в блоках", false);
    private final SliderSetting rangeIncreaseAmount = new SliderSetting("На сколько увеличить", 1.0f, 0.1f, 3.0f, 0.1f);
    private final BooleanSetting attackThroughBlocks = new BooleanSetting("Через блоки", false);
    private final ModeSetting raytraceMode = new ModeSetting("Режим рейтрейса", "Всегда", "Всегда", "Умный");
    private final BooleanSetting raytraceWhenFlying = new BooleanSetting("Проверка при полёте", true);
    private final BooleanSetting raytraceWhenSwimming = new BooleanSetting("Проверка при плавании", true);
    private final BooleanSetting raytraceWhenMoving = new BooleanSetting("Проверка при движении", true);

    @Setter
    @Getter
    private LivingEntity triggerTarget = null;

    public volatile long lastAttackTime = 0;
    private volatile long sprintResetUntil = 0;
    private int nextCpsDelay = 0;
    public boolean firstAttack = true;
    private volatile float cachedAttackCooldown = 1.0f;
    private volatile long cachedTimeUntilNextAttack = 0L;
    private volatile long lastFastestRotationNs = 0L;
    private long lastTargetActiveTime = 0;

    private final NewStopWatch cpsTimer = new NewStopWatch();

    public TriggerBot() {
        minCps.setVisible(() -> isLegacyClickMode());
        maxCps.setVisible(() -> isLegacyClickMode());

        rangeIncreaseAmount.setVisible(() -> increaseRangeInBlocks.get());
        raytraceWhenFlying.setVisible(() -> "Умный".equals(raytraceMode.get()));
        raytraceWhenSwimming.setVisible(() -> "Умный".equals(raytraceMode.get()));
        raytraceWhenMoving.setVisible(() -> "Умный".equals(raytraceMode.get()));

        addSettings(
                clickMode, minCps, maxCps,
                tpsSynchronization, attackSpeedMode, smartCrits, sprintResetMode,
                AuraModule.targets, attack, attackRange, increaseRangeInBlocks, rangeIncreaseAmount,
                attackThroughBlocks, raytraceMode,
                raytraceWhenFlying, raytraceWhenSwimming, raytraceWhenMoving
        );
    }

    @Override
    public void onEnable() {
        super.onEnable();
        triggerTarget = null;
        firstAttack = true;
        sprintResetUntil = 0;
        cachedAttackCooldown = 1.0f;
        cachedTimeUntilNextAttack = 0L;
        lastFastestRotationNs = 0L;
        updateAttackCooldownCache();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        clearTarget();
        firstAttack = true;
        sprintResetUntil = 0;
        cachedAttackCooldown = 1.0f;
        cachedTimeUntilNextAttack = 0L;
        lastFastestRotationNs = 0L;
    }

    @EventHandler
    public void onUpdate(TickEvent event) {
        if (!isState()) return;
        if (mc.player == null || mc.world == null) return;

        updateAttackCooldownCache();
        AntiBotSystem.scanWorld(mc.world);

        LivingEntity crosshairTarget = resolveCrosshairTarget();
        if (crosshairTarget != null) {
            lastTargetActiveTime = System.currentTimeMillis();
            setTarget(crosshairTarget);
        } else {
            clearTarget();
            return;
        }

        if (!"Быстрая".equals(attackSpeedMode.get()) && !"Самая быстрая".equals(attackSpeedMode.get())) {
            tryAttackCurrentTarget();
        }
    }

    @EventHandler
    public void onUpdateSlow(UpdateEvent event) {
        if (!isState() || mc.player == null) return;

        if ("Медленная".equals(attackSpeedMode.get()) && triggerTarget != null && triggerTarget.isAlive()) {
            tryAttackCurrentTarget();
        }
    }

    @EventHandler
    public void onFastest(FastestEvent event) {
        if (!isState() || mc.player == null) return;

        if ("Самая быстрая".equals(attackSpeedMode.get()) && triggerTarget != null && triggerTarget.isAlive()) {
            if (System.currentTimeMillis() - lastAttackTime >= 50L) {
                tryAttackCurrentTarget();
            }
        }
    }

    @EventHandler
    public void onSprint(SprintEvent event) {
        if (!isState() || mc.player == null) return;
        if ("Выкл".equals(sprintResetMode.get())) return;

        if (mc.player.isSubmergedInWater() || mc.player.isSwimming()) return;

        if ("SpookyTime".equals(sprintResetMode.get()) && triggerTarget != null) {
            event.cancel();
            event.setSprinting(false);
            return;
        }

        if ("Обычный".equals(sprintResetMode.get())) {
            setSprinting(event);
        }
    }

    private void setSprinting(SprintEvent event) {
        if (mc.player == null) return;

        boolean hardCollision = (mc.player.horizontalCollision && !mc.player.collidedSoftly) || hasAnySideCollision();

        if (hardCollision) {
            event.setSprinting(false);
        }

        float cooldown = 0.8f;

        if ((!mc.player.isOnGround() && mc.player.getVelocity().getY() < -0.073) && triggerTarget != null && getAttackCooldown() > cooldown) {
            event.setSprinting(false);
        }

        if (!hardCollision && mc.player.forwardSpeed > 0 && !mc.player.isSprinting()) {
            mc.options.sprintKey.setPressed(true);
        }
    }

    private boolean hasAnySideCollision() {
        if (mc.player == null) return false;
        Box box = mc.player.getBoundingBox();
        Box sideBox = new Box(
                box.minX - 0.06, box.minY + 0.05, box.minZ - 0.06,
                box.maxX + 0.06, box.maxY - 0.05, box.maxZ + 0.06
        );

        return BlockPos.stream(sideBox).anyMatch(pos -> {
            BlockState state = mc.world.getBlockState(pos);
            return !state.getCollisionShape(mc.world, pos).isEmpty()
                    && state.getCollisionShape(mc.world, pos).getBoundingBoxes().stream()
                    .map(shapeBox -> shapeBox.offset(pos.getX(), pos.getY(), pos.getZ()))
                    .anyMatch(sideBox::intersects);
        });
    }

    private LivingEntity resolveCrosshairTarget() {
        if (mc.crosshairTarget == null || mc.crosshairTarget.getType() != HitResult.Type.ENTITY) {
            return null;
        }

        EntityHitResult hitResult = (EntityHitResult) mc.crosshairTarget;
        Entity entity = hitResult.getEntity();

        if (!(entity instanceof LivingEntity living) || !living.isAlive() || living == mc.player) {
            return null;
        }

        double range = getEffectiveAttackRange();
        if (mc.player.distanceTo(living) > range + 0.5) {
            return null;
        }

        Vec3d playerPos = new Vec3d(mc.player.getX(), mc.player.getY(), mc.player.getZ());
        Vec3d entityPos = new Vec3d(living.getX(), living.getY(), living.getZ());
        double rangeSq = (range + 0.5) * (range + 0.5);

        if (!isValidTarget(living, rangeSq, playerPos)) {
            return null;
        }

        return living;
    }

    private void setTarget(LivingEntity target) {
        this.triggerTarget = target;
        AuraModule.target = target;
        AuraModule.subconsciousTarget = target;
    }

    private void clearTarget() {
        if (triggerTarget != null && AuraModule.target == triggerTarget) {
            AuraModule.target = null;
            AuraModule.subconsciousTarget = null;
        }
        triggerTarget = null;
        firstAttack = true;
    }

    private boolean canAttack() {
        long now = System.currentTimeMillis();

        if (now - lastAttackTime < getAttackTimerDelay()) return false;

        if (isLegacyClickMode()) {
            if (now - lastAttackTime < nextCpsDelay) return false;
            double cps = randomCps();
            cps += ThreadLocalRandom.current().nextInt(-4, 2);
            cps = Math.max(1.0, cps);
            nextCpsDelay = (int) scaleByTps(Math.max(1L, Math.round(1000.0 / cps)));
            return true;
        } else {
            float cooldownThreshold = isHoldingCombatWeapon()
                    ? getTpsScaledCooldownThreshold(0.85f)
                    : 0.85f;
            if (isHoldingCombatWeapon() && cachedAttackCooldown < cooldownThreshold) return false;
            if (now - lastAttackTime < scaleByTps(50L)) return false;
            return cachedTimeUntilNextAttack <= 0;
        }
    }

    private boolean canAttackTarget() {
        if (triggerTarget == null) return false;
        if (!attack.getByName("Во время еды").get() && mc.player.isUsingItem() && !isUsingShield()) {
            return false;
        }
        return true;
    }

    private synchronized void tryAttackCurrentTarget() {
        if (mc.player == null || mc.interactionManager == null || triggerTarget == null || !triggerTarget.isAlive()) {
            return;
        }

        double effectiveRange = getEffectiveAttackRange();
        double safeRange = effectiveRange - 0.05;

        Vec3d playerPos = new Vec3d(mc.player.getX(), mc.player.getY(), mc.player.getZ());
        Vec3d targetPos = new Vec3d(triggerTarget.getX(), triggerTarget.getY(), triggerTarget.getZ());

        double horizontalDistanceSq = targetPos.subtract(playerPos).multiply(1, 0, 1).lengthSquared();
        double verticalDistance = Math.abs(targetPos.y - playerPos.y);

        if (horizontalDistanceSq > safeRange * safeRange) return;
        if (verticalDistance > effectiveRange + 1.0) return;

        if (canAttack() && canAttackTarget()) {
            attack(triggerTarget);
        }
    }

    private void attack(LivingEntity target) {
        if (isLegacyClickMode() || shouldBypassCritCheck()) {
            performAttack(target);
            return;
        }
        if (canDealCrit()) {
            performAttack(target);
        }
    }

    private void performAttack(LivingEntity target) {
        boolean needRaytraceCheck = "Всегда".equals(raytraceMode.get());
        if ("Умный".equals(raytraceMode.get())) {
            needRaytraceCheck = false;
            boolean forceFlying = target.isGliding() && raytraceWhenFlying.get();
            boolean forceSwimming = target.isSwimming() && raytraceWhenSwimming.get();
            boolean forceMoving = (!target.isSwimming() && !target.isGliding()) && raytraceWhenMoving.get();
            if (forceFlying || forceSwimming || forceMoving) needRaytraceCheck = true;
            if (firstAttack) needRaytraceCheck = true;
        }

        if (needRaytraceCheck) {
            double raytraceRange = getEffectiveAttackRange();

            var directHit = PlayerUtils.raytraceEntity(
                    raytraceRange,
                    mc.player.getYaw(),
                    mc.player.getPitch(),
                    entity -> entity == target && !entity.isSpectator() && entity.canHit()
            );

            boolean crosshairHitsTarget = mc.crosshairTarget != null
                    && mc.crosshairTarget instanceof EntityHitResult entityHit
                    && entityHit.getEntity() == target;

            boolean raytraceCheckPassed = (directHit != null && directHit.getEntity() == target) || crosshairHitsTarget;

            if (!raytraceCheckPassed && !isInsideTargetHitbox(target)) return;

            if (!attackThroughBlocks.get()) {
                if (!canSeeThroughWall(target) || hasGrassOnRay(target)) return;
            }
        }

        if (target instanceof PlayerEntity player
                && Nexis.getInstance().getFriendStorage().isFriend(player.getName().getString())) {
            return;
        }

        if (isHoldingCombatWeapon() && !isLegacyClickMode()) {
            if (cachedAttackCooldown < 0.85f) return;
        }

        int slotToRestore = prepareShieldBreakerSlot(target);
        try {
            syncSelectedSlot();
            releaseShieldForAttack();

            mc.interactionManager.attackEntity(mc.player, target);
            mc.player.swingHand(Hand.MAIN_HAND);
        } finally {
            restoreSlot(slotToRestore);
        }

        lastAttackTime = System.currentTimeMillis();
        cachedAttackCooldown = 0.0f;
        cachedTimeUntilNextAttack = getAttackProgressDelay();
        firstAttack = false;

        AutoSprint autoSprint = AutoSprint.getInstance();

        if (!"Выкл".equals(sprintResetMode.get())) {
            int duration = Math.max(1, 50);
            sprintResetUntil = lastAttackTime + duration;
            if (autoSprint != null && autoSprint.isState()) {
                autoSprint.blockSprintUntil(sprintResetUntil);
            }
            forceStopSprintForReset();
        }

        if (autoSprint != null && autoSprint.isState()) {
            autoSprint.onAttackPerformed();
        }
    }

    // ========== Вспомогательные методы ==========

    private boolean isLegacyClickMode() {
        return "1.8".equals(clickMode.get());
    }

    private double randomCps() {
        double min = minCps.get();
        double max = maxCps.get();
        if (min > max) {
            double t = min;
            min = max;
            max = t;
        }
        if (Math.abs(max - min) < 0.0001) return min;
        return ThreadLocalRandom.current().nextDouble(min, max);
    }

    private boolean canDealCrit() {
        if (mc.player.isOnGround() && smartCrits.get() && !mc.options.jumpKey.isPressed()) return true;
        return mc.player.fallDistance > 0;
    }

    private boolean shouldBypassCritCheck() {
        return mc.player.isTouchingWater()
                || mc.player.isInLava()
                || mc.player.isClimbing()
                || isInCobweb()
                || mc.player.hasStatusEffect(StatusEffects.BLINDNESS)
                || mc.player.hasStatusEffect(StatusEffects.MINING_FATIGUE)
                || mc.player.hasStatusEffect(StatusEffects.SLOW_FALLING)
                || mc.player.hasStatusEffect(StatusEffects.LEVITATION)
                || mc.player.getAbilities().flying;
    }

    private boolean isInCobweb() {
        if (mc.player == null || mc.world == null) return false;
        Box box = mc.player.getBoundingBox().expand(0.001);
        return BlockPos.stream(box).anyMatch(pos -> mc.world.getBlockState(pos).isOf(Blocks.COBWEB));
    }

    private boolean isHoldingCombatWeapon() {
        if (mc.player == null) return false;
        ItemStack stack = mc.player.getMainHandStack();
        if (stack.isEmpty()) return false;

        return stack.isOf(Items.WOODEN_SWORD) || stack.isOf(Items.STONE_SWORD) ||
                stack.isOf(Items.IRON_SWORD) || stack.isOf(Items.GOLDEN_SWORD) ||
                stack.isOf(Items.DIAMOND_SWORD) || stack.isOf(Items.NETHERITE_SWORD) ||
                stack.isOf(Items.WOODEN_AXE) || stack.isOf(Items.STONE_AXE) ||
                stack.isOf(Items.IRON_AXE) || stack.isOf(Items.GOLDEN_AXE) ||
                stack.isOf(Items.DIAMOND_AXE) || stack.isOf(Items.NETHERITE_AXE) ||
                stack.isOf(Items.TRIDENT) || stack.isOf(Items.MACE);
    }

    private boolean isInsideTargetHitbox(LivingEntity entity) {
        return mc.player != null && entity.getBoundingBox().expand(1.0E-4).contains(mc.player.getEyePos());
    }

    private boolean canSeeThroughWall(Entity entity) {
        if (entity == null || mc.player == null || mc.world == null) return false;
        return mc.world.raycast(new RaycastContext(
                mc.player.getEyePos(), entity.getEyePos(),
                RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, mc.player
        )).getType() == BlockHitResult.Type.MISS;
    }

    private boolean hasGrassOnRay(Entity entity) {
        if (entity == null || mc.player == null || mc.world == null) return false;
        HitResult outlineHit = mc.world.raycast(new RaycastContext(
                mc.player.getEyePos(), entity.getEyePos(),
                RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, mc.player
        ));
        if (outlineHit.getType() != HitResult.Type.BLOCK) return false;
        return true;
    }

    private long getAttackTimerDelay() {
        return scaleByTps(Math.max(0L, BASE_ATTACK_TIMER_DELAY_MS - getHasteAttackTimerReduction()));
    }

    private long getAttackProgressDelay() {
        return scaleByTps(Math.max(1L, BASE_ATTACK_PROGRESS_DELAY_MS - getHasteAttackTimerReduction()));
    }

    private long getHasteAttackTimerReduction() {
        if (mc.player == null) return 0L;
        var haste = mc.player.getStatusEffect(StatusEffects.HASTE);
        if (haste == null) return 0L;
        return (long) (haste.getAmplifier() + 1) * HASTE_ATTACK_TIMER_REDUCTION_MS;
    }

    private long scaleByTps(long ms) {
        if (!tpsSynchronization.get()) return ms;
        return Math.max(1L, Math.round(ms * ServerTPSManager.getInstance().getPreciseTpsFactor()));
    }

    private float getTpsScaledCooldownThreshold(float baseThreshold) {
        if (!tpsSynchronization.get()) return baseThreshold;
        float tps = ServerTPSManager.getInstance().getPreciseTps();
        if (tps >= 19.8f) return baseThreshold;
        float factor = 20.0f / Math.max(tps, 10.0f);
        return Math.min(0.95f, baseThreshold * factor);
    }

    public static float getAttackCooldown() {
        return 1.0f;
    }

    private void updateAttackCooldownCache() {
        long now = System.currentTimeMillis();
        if (mc.player == null) {
            cachedAttackCooldown = 1.0f;
            cachedTimeUntilNextAttack = 0L;
            return;
        }

        if (isHoldingCombatWeapon()) {
            float cooldown = mc.player.getAttackCooldownProgress(0.5f);
            cachedAttackCooldown = MathHelper.clamp(cooldown, 0.0f, 1.0f);
            if (cachedAttackCooldown >= 0.83f) {
                cachedTimeUntilNextAttack = 0L;
            } else {
                long rawTime = (long) ((0.83f - cachedAttackCooldown) * 1000.0f);
                cachedTimeUntilNextAttack = scaleByTps(rawTime);
            }
            return;
        }

        long timeSinceLastAttack = now - lastAttackTime;
        long progressDelay = getAttackProgressDelay();
        cachedAttackCooldown = Math.min(1.0f, (float) timeSinceLastAttack / progressDelay);
        cachedTimeUntilNextAttack = Math.max(0L, progressDelay - timeSinceLastAttack);
    }

    public double getEffectiveAttackRange() {
        double baseRange = attackRange.get();
        if (increaseRangeInBlocks.get() && isPlayerInBlocks()) {
            baseRange += rangeIncreaseAmount.get();
        }
        return baseRange - 0.38f;
    }

    private boolean isPlayerInBlocks() {
        if (mc.player == null || mc.world == null) return false;
        Box box = mc.player.getBoundingBox().contract(0.05);
        return BlockPos.stream(box).anyMatch(pos -> !mc.world.getBlockState(pos).isAir());
    }

    // ========== Shield breaker ==========

    private int prepareShieldBreakerSlot(LivingEntity attackTarget) {
        if (!attack.getByName("Ломать щит").get() || mc.player == null) return -1;
        if (!shouldUseShieldBreaker(attackTarget)) return -1;

        int axeSlot = findAxeSlotInHotbar();
        if (axeSlot == -1 || axeSlot == mc.player.getInventory().getSelectedSlot()) return -1;

        int originalSlot = mc.player.getInventory().getSelectedSlot();
        PlayerInventoryUtil.setSelectedSlotInstant(axeSlot);
        return originalSlot;
    }

    private boolean shouldUseShieldBreaker(LivingEntity attackTarget) {
        if (!(attackTarget instanceof PlayerEntity player) || !player.isBlocking()) return false;
        return player.getActiveItem().isOf(Items.SHIELD)
                || player.getMainHandStack().isOf(Items.SHIELD)
                || player.getOffHandStack().isOf(Items.SHIELD);
    }

    private int findAxeSlotInHotbar() {
        if (mc.player == null) return -1;
        int bestSlot = -1;
        int bestPriority = -1;
        for (int slot = 0; slot < 9; slot++) {
            ItemStack stack = mc.player.getInventory().getStack(slot);
            int priority = axePriority(stack);
            if (priority > bestPriority) {
                bestPriority = priority;
                bestSlot = slot;
            }
        }
        return bestSlot;
    }

    private int axePriority(ItemStack stack) {
        if (stack.isOf(Items.NETHERITE_AXE)) return 6;
        if (stack.isOf(Items.DIAMOND_AXE)) return 5;
        if (stack.isOf(Items.IRON_AXE)) return 4;
        if (stack.isOf(Items.STONE_AXE)) return 3;
        if (stack.isOf(Items.GOLDEN_AXE)) return 2;
        if (stack.isOf(Items.WOODEN_AXE)) return 1;
        return -1;
    }

    private void restoreSlot(int slot) {
        if (slot == -1 || mc.player == null) return;
        PlayerInventoryUtil.setSelectedSlotInstant(slot);
    }

    private void syncSelectedSlot() {
        if (mc.interactionManager instanceof ClientPlayerInteractionManagerAccessor accessor) {
            accessor.nexis$syncSelectedSlot();
        }
    }

    private boolean isUsingShield() {
        return mc.player != null && mc.player.isUsingItem() && mc.player.getActiveItem().isOf(Items.SHIELD);
    }

    private void releaseShieldForAttack() {
        if (mc.player == null || mc.interactionManager == null || !isUsingShield()) return;
        mc.interactionManager.stopUsingItem(mc.player);
    }

    private void forceStopSprintForReset() {
        if (mc.player == null) return;
        mc.options.sprintKey.setPressed(false);
        if (mc.player.isSprinting()) {
            mc.player.setSprinting(false);
        }
    }

    private boolean isValidTarget(LivingEntity entity, double rangeSq, Vec3d playerPos) {
        if (entity == null || mc.player == null) return false;
        if (entity == mc.player || !entity.isAlive() || entity.age < 2) return false;
        if (entity.isInvulnerable()) return false;

        Vec3d entityPos = new Vec3d(entity.getX(), entity.getY(), entity.getZ());
        double horizontalDistanceSq = entityPos.subtract(playerPos).multiply(1, 0, 1).lengthSquared();
        if (horizontalDistanceSq > rangeSq) return false;

        if (entity instanceof PlayerEntity player) {
            if (Nexis.getInstance().getFriendStorage().isFriend(player.getName().getString())) return false;
            if (mc.player.isTeammate(player) && !targetSetting("Тиммейты", false)) return false;
            if (AntiBotSystem.isBot(player) && !targetSetting("Боты", false)) return false;
            if (!targetSetting("Игроки", true)) return false;
            if (player.getArmor() == 0 && !targetSetting("Игроки без брони", true)) return false;
            if (player.isInvisible() && player.getArmor() == 0 && !targetSetting("Невидимые", true)) return false;
            return true;
        }

        if (entity instanceof net.minecraft.entity.mob.Monster || entity instanceof net.minecraft.entity.mob.HostileEntity) {
            return targetSetting("Мобы", true);
        }

        if (entity instanceof net.minecraft.entity.passive.AnimalEntity) {
            return targetSetting("Животные", false);
        }

        return false;
    }

    private static boolean targetSetting(String name, boolean fallback) {
        if (AuraModule.targets == null) return fallback;
        var value = AuraModule.targets.getByName(name);
        return value != null ? value.get() : fallback;
    }
}
