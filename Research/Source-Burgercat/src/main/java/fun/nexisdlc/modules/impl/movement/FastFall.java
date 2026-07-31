package fun.nexisdlc.modules.impl.movement;

import fun.nexisdlc.client.events.impl.client.TickEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import fun.nexisdlc.modules.impl.combat.AuraModule;
import fun.nexisdlc.modules.impl.combat.aura.AuraShieldBreaker;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;

@FunctionAdd(name = "FastFall", alias = "FastFall", category = Category.Movement, description = "Ускоряет безопасное падение перед землёй")
public class FastFall extends Function {
    private static final long EXTERNAL_BOOST_BLOCK_MS = 1200L;

    private final BooleanSetting onlyWithAura = new BooleanSetting("Только с Aura", true);
    private final SliderSetting ticks = new SliderSetting("Сила падения", 4.6f, 3.0f, 5.5f, 0.01f);
    private final SliderSetting triggerDistance = new SliderSetting("Включать когда до земли осталось", 1.5f, 0.5f, 3.0f, 0.1f);
    private final SliderSetting minFallDistance = new SliderSetting("Включать после падения с высоты", 2.0f, 0.0f, 6.0f, 0.1f);

    private long blockedUntil;

    public FastFall() {
        addSettings(onlyWithAura, ticks, triggerDistance, minFallDistance);
    }

    @EventHandler
    public void onTick(TickEvent event) {
        if (!isState() || mc.player == null || mc.world == null) return;

        updateExternalBoostBlock();
        if (!canFastFall()) return;

        applyVelocity(ticks.get());
    }

    private void updateExternalBoostBlock() {
        Vec3d velocity = mc.player.getVelocity();
        double horizontalSpeedSq = velocity.x * velocity.x + velocity.z * velocity.z;
        boolean explosionLikeBoost = mc.player.hurtTime > 0 || velocity.y > 0.25 || horizontalSpeedSq > 0.75;

        if (explosionLikeBoost) {
            blockedUntil = System.currentTimeMillis() + EXTERNAL_BOOST_BLOCK_MS;
        }
    }

    private boolean canFastFall() {
        // if (System.currentTimeMillis() < blockedUntil) return false;

        if (onlyWithAura.get()) {
            AuraModule aura = AuraModule.getInstance();
            if (aura == null || !aura.isState() || AuraModule.getTarget() == null || !AuraModule.getTarget().isAlive()) {
                return false;
            }
        }

        boolean blockFastFallBecauseItemUse = mc.player.isUsingItem() && !AuraShieldBreaker.isUsingShield(mc);
        if (blockFastFallBecauseItemUse) return false;

        if (mc.player.isOnGround()
                || mc.player.isTouchingWater()
                || mc.player.isSwimming()
                || mc.player.isInLava()
                || mc.player.isClimbing()
                || mc.player.hasStatusEffect(StatusEffects.JUMP_BOOST)
                || mc.player.hasStatusEffect(StatusEffects.SLOW_FALLING)
                || mc.player.hasStatusEffect(StatusEffects.LEVITATION)
                || mc.player.isGliding()
                || mc.player.getAbilities().flying) {
            return false;
        }

        // if (mc.player.hurtTime > 0 || mc.player.getVelocity().y >= -0.08) return false;
        if (mc.player.fallDistance < minFallDistance.get()) return false;

        return getDistanceToGround() <= triggerDistance.get();
    }

    private double getDistanceToGround() {
        Vec3d from = PlayerUtils.getPlayerPos();
        Vec3d to = from.subtract(0.0, triggerDistance.get() + 0.25, 0.0);
        BlockHitResult hit = mc.world.raycast(new RaycastContext(
                from,
                to,
                RaycastContext.ShapeType.COLLIDER,
                RaycastContext.FluidHandling.NONE,
                mc.player
        ));

        if (hit.getType() != HitResult.Type.BLOCK) return Double.MAX_VALUE;
        return from.y - hit.getPos().y;
    }

    private void applyVelocity(float ticks) {
        PlayerEntity player = mc.player;
        if (player == null) return;

        double motion = player.getVelocity().y;
        double apply = (ticks * 0.08) - motion - 0.01;

        if (apply < 0) {
            double max = -3.92 - motion;
            if (apply < max) apply = max;

            double maxDown = -0.015;
            if (apply < maxDown) apply = maxDown;

            player.setVelocity(
                    player.getVelocity().x,
                    player.getVelocity().y - 0.005,
                    player.getVelocity().z
            );
        }
    }
}
