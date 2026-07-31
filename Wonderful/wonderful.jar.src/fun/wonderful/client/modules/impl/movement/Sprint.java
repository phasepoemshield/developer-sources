package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.player.MoveUtils;
import fun.wonderful.api.utils.player.ViaProtocolUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import lombok.Generated;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

public class Sprint
extends Module {
    public static Sprint INSTANCE = new Sprint();
    private static final MinecraftClient CLIENT = MinecraftClient.getInstance();
    private final BooleanSetting keepInWater = new BooleanSetting("Сохранять в воде", false);
    private static boolean sprinting;
    private static long time;
    private static int pauseDepth;
    private static boolean restoreAfterPause;
    private static boolean combatSprintAllowed;
    private ClientPlayerEntity lastPlayer;

    public Sprint() {
        super("Sprint", "Автоматический бег", Module.ModuleCategory.MOVEMENT);
        this.addSettings(this.keepInWater);
    }

    @Override
    public void onEnable() {
        Sprint.resetPauseState();
        sprinting = true;
        super.onEnable();
    }

    @Override
    public void onDisable() {
        Sprint.resetPauseState();
        sprinting = false;
        this.lastPlayer = null;
        if (Sprint.mc.options != null) {
            Sprint.mc.options.sprintKey.setPressed(false);
        }
        if (Sprint.mc.player != null) {
            Sprint.mc.player.setSprinting(false);
        }
        super.onDisable();
    }

    @EventLink
    public void onEvent(EventUpdate ignored) {
        boolean shouldSprint;
        boolean inWater;
        if (Sprint.mc.player == null) {
            this.lastPlayer = null;
            Sprint.resetPauseState();
            if (Sprint.mc.options != null) {
                Sprint.mc.options.sprintKey.setPressed(false);
            }
            return;
        }
        if (this.lastPlayer != Sprint.mc.player) {
            this.lastPlayer = Sprint.mc.player;
            Sprint.resetPauseState();
            sprinting = true;
        }
        boolean legacyWaterMovement = ViaProtocolUtils.usesLegacyWaterMovement();
        boolean bl = inWater = Sprint.mc.player.isTouchingWater() || Sprint.mc.player.isSubmergedInWater();
        if (legacyWaterMovement && inWater) {
            if (this.keepInWater.isState()) {
                Sprint.mc.player.setSprinting(this.canKeepLegacyWaterSprint());
            }
            return;
        }
        Sprint.mc.options.sprintKey.setPressed(false);
        boolean bl2 = shouldSprint = pauseDepth == 0 && combatSprintAllowed && System.currentTimeMillis() >= time && sprinting && MoveUtils.isMoving() && this.canStartSprint() && !Sprint.mc.player.isSneaking() && !Sprint.mc.player.isUsingItem() && (!inWater || Sprint.mc.player.isSwimming() && Sprint.mc.player.isSubmergedInWater() || this.keepInWater.isState()) && !Sprint.mc.player.hasStatusEffect(StatusEffects.BLINDNESS) && !Sprint.mc.player.horizontalCollision && (!legacyWaterMovement || !Sprint.mc.player.horizontalCollision && !Sprint.mc.player.collidedSoftly) && !Sprint.mc.player.isGliding();
        if (this.keepInWater.isState() && inWater && Sprint.mc.player.isSprinting()) {
            shouldSprint = true;
        }
        Sprint.mc.player.setSprinting(shouldSprint);
    }

    private boolean canStartSprint() {
        return !(!(Sprint.mc.player.input.movementForward > 0.0f) || Sprint.mc.player.getHungerManager().getFoodLevel() <= 6 && !Sprint.mc.player.getAbilities().allowFlying || Sprint.mc.player.isTouchingWater() && !this.keepInWater.isState());
    }

    private boolean canKeepLegacyWaterSprint() {
        return pauseDepth == 0 && combatSprintAllowed && System.currentTimeMillis() >= time && sprinting && MoveUtils.isMoving() && Sprint.mc.player.input.movementForward > 0.0f && (Sprint.mc.player.getHungerManager().getFoodLevel() > 6 || Sprint.mc.player.getAbilities().allowFlying) && !Sprint.mc.player.isSneaking() && !Sprint.mc.player.isUsingItem() && !Sprint.mc.player.hasStatusEffect(StatusEffects.BLINDNESS) && !Sprint.mc.player.isGliding();
    }

    public boolean shouldKeepSprintInWater() {
        return this.isEnable() && this.keepInWater.isState();
    }

    public static void setCombatSprintAllowed(boolean allowed) {
        combatSprintAllowed = allowed;
        if (!allowed) {
            if (Sprint.CLIENT.options != null) {
                Sprint.CLIENT.options.sprintKey.setPressed(false);
            }
            if (Sprint.CLIENT.player != null) {
                Sprint.CLIENT.player.setSprinting(false);
            }
        }
    }

    public static void pushPause(long delayMs) {
        restoreAfterPause |= Sprint.shouldRestoreAfterPause();
        ++pauseDepth;
        time = Math.max(time, System.currentTimeMillis() + Math.max(0L, delayMs));
        sprinting = false;
        if (Sprint.CLIENT.options != null) {
            Sprint.CLIENT.options.sprintKey.setPressed(false);
        }
        if (Sprint.CLIENT.player != null) {
            Sprint.CLIENT.player.setSprinting(false);
        }
    }

    public static void popPause() {
        if (pauseDepth > 0) {
            --pauseDepth;
        }
        if (pauseDepth > 0) {
            return;
        }
        time = 0L;
        sprinting = restoreAfterPause;
        restoreAfterPause = false;
    }

    private static boolean shouldRestoreAfterPause() {
        if (Sprint.CLIENT.player != null && Sprint.CLIENT.player.isSprinting()) {
            return true;
        }
        return ModuleClass.sprint != null && ModuleClass.sprint.isEnable() && sprinting;
    }

    private static void resetPauseState() {
        pauseDepth = 0;
        restoreAfterPause = false;
        time = 0L;
        combatSprintAllowed = true;
    }

    @Generated
    public static boolean isSprinting() {
        return sprinting;
    }

    @Generated
    public static void setSprinting(boolean sprinting) {
        Sprint.sprinting = sprinting;
    }

    @Generated
    public static long getTime() {
        return time;
    }

    @Generated
    public static void setTime(long time) {
        Sprint.time = time;
    }

    static {
        time = 0L;
        pauseDepth = 0;
        restoreAfterPause = false;
        combatSprintAllowed = true;
    }
}