package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.events.impl.client.OptimizedUpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.time.StopWatch;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;

@FunctionAdd(name = "AntiAFK", alias = "Anti AFK", category = Category.Player, description = "Защищает от AFK-кика")
public class AntiAFK extends Function {
    private static final long ACTION_DELAY_MS = 8_000L;
    private static final float TURN_OFFSET = 25.0f;
    private static final float TURN_STEP = 3.5f;

    private final ModeSetting mode = new ModeSetting("Режим", "Прыжок", "Прыжок", "Поворот", "Взмах рукой");
    private final StopWatch timer = new StopWatch();

    private boolean yawFlip;
    private boolean smoothTurning;
    private float targetYaw;
    private int jumpHoldTicks;
    private boolean controlsJumpKey;

    public AntiAFK() {
        addSettings(mode);
    }

    @EventHandler
    public void onUpdate(OptimizedUpdateEvent event) {
        if (nullCheck()) return;

        if (smoothTurning) {
            float currentYaw = mc.player.getYaw();
            float delta = MathHelper.wrapDegrees(targetYaw - currentYaw);
            float step = MathHelper.clamp(delta, -TURN_STEP, TURN_STEP);
            mc.player.setYaw(currentYaw + step);
            if (Math.abs(delta) <= TURN_STEP + 0.01f) {
                mc.player.setYaw(currentYaw + delta);
                smoothTurning = false;
            }
        }

        if (controlsJumpKey) {
            if (mode.is("Прыжок") && jumpHoldTicks > 0) {
                mc.options.jumpKey.setPressed(true);
                jumpHoldTicks--;
            } else {
                mc.options.jumpKey.setPressed(false);
                controlsJumpKey = false;
                jumpHoldTicks = 0;
            }
        }

        if (!timer.hasReached(ACTION_DELAY_MS)) return;

        switch (mode.get()) {
            case "Поворот" -> {
                targetYaw = mc.player.getYaw() + (yawFlip ? TURN_OFFSET : -TURN_OFFSET);
                smoothTurning = true;
                yawFlip = !yawFlip;
            }
            case "Взмах рукой" -> mc.player.swingHand(Hand.MAIN_HAND);
            default -> {
                if (mc.player.isOnGround()) {
                    jumpHoldTicks = 3;
                    controlsJumpKey = true;
                }
            }
        }
        timer.reset();
    }

    @Override
    public void onEnable() {
        yawFlip = false;
        smoothTurning = false;
        jumpHoldTicks = 0;
        controlsJumpKey = false;
        if (mc.options != null) mc.options.jumpKey.setPressed(false);
        timer.reset();
        super.onEnable();
    }

    @Override
    public void onDisable() {
        jumpHoldTicks = 0;
        controlsJumpKey = false;
        if (mc.options != null) mc.options.jumpKey.setPressed(false);
        super.onDisable();
    }
}
