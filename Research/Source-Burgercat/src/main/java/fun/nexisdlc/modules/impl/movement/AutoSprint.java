package fun.nexisdlc.modules.impl.movement;

import fun.nexisdlc.client.events.impl.player.SprintEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeListSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Автоматически активирует спринт при движении вперед.
 * Поддерживает сохранение спринта после атаки и при низком уровне голода.
 */
@FunctionAdd(name = "AutoSprint", alias = "AutoSprint", category = Category.Movement, description = "Автоматически активирует спринт при движении вперёд")
public class AutoSprint extends Function {
    private static AutoSprint instance;

    private final ModeListSetting saveSprint = new ModeListSetting("Keep Sprint",
            new BooleanSetting("After Attack", true),
            new BooleanSetting("When Hungry", false));

    private final SliderSetting motionAfterAttack = new SliderSetting(
            "Motion After Attack",
            1.0f,
            0.0f,
            1.0f,
            0.1f
    );

    private final SliderSetting motionAfterAttackChance = new SliderSetting(
            "Keep Chance",
            100.0f,
            0.0f,
            100.0f,
            5.0f
    );

    private long keepSprintUntil = 0L;
    private volatile long sprintBlockedUntil = 0L;
    private double activeMotionAfterAttack = 1.0;

    public AutoSprint() {
        instance = this;
        addSettings(saveSprint, motionAfterAttack, motionAfterAttackChance);
    }

    public static AutoSprint getInstance() {
        return instance;
    }

    @EventHandler
    public void onSprint(SprintEvent event) {
        if (mc.player == null) return;

        if (isSprintBlocked()) {
            mc.options.sprintKey.setPressed(false);
            if (event.isSprinting()) {
                event.setSprinting(false);
            }
            return;
        }

        if (isKeepSprintWindowActive()) {
            if (!event.isSprinting()) {
                event.setSprinting(true);
            }
        }
        setSprinting(event);
    }

    /**
     * Активирует спринт при соблюдении условий
     */
    private void setSprinting(SprintEvent event) {
        boolean hardCollision = (mc.player.horizontalCollision && !mc.player.collidedSoftly) || hasAnySideCollision();
        boolean isSneaking = !mc.player.isSwimming() && mc.player.isSneaking();

        if (isSneaking || mc.player.isGliding()) {
            return;
        }

        // Отключаем спринт при жёсткой коллизии со стеной
        if (hardCollision) {
            if (event.isSprinting()) {
                event.setSprinting(false);
            }
            return;
        }

        if (mc.player.forwardSpeed > 0 && !mc.player.isSprinting()) {
            event.setSprinting(true);
        }
    }

    private boolean hasAnySideCollision() {
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

    /**
     * Отключает спринт
     */
    public void unsetSprinting() {
        if (mc.player != null) {
            mc.player.setSprinting(false);
        }
    }

    /**
     * Вычисляет множитель скорости после атаки
     * @return множитель скорости (0.6 по умолчанию, настраиваемое значение при срабатывании)
     */
    public double getMotion() {
        if (isSprintBlocked()) {
            return 1.0;
        }

        BooleanSetting afterAttack = saveSprint.getByName("After Attack");
        if (afterAttack == null || !afterAttack.get()) {
            return 1.0;
        }

        return isKeepSprintWindowActive() ? activeMotionAfterAttack : 1.0;
    }

    public void onAttackPerformed() {
        if (mc.player == null) return;
        if (isSprintBlocked()) return;
        
        BooleanSetting afterAttack = saveSprint.getByName("After Attack");
        if (afterAttack == null || !afterAttack.get()) return;

        boolean shouldKeep = ThreadLocalRandom.current().nextFloat() * 100.0f <= motionAfterAttackChance.get();
        activeMotionAfterAttack = shouldKeep ? motionAfterAttack.get() : 0.6;
        keepSprintUntil = System.currentTimeMillis() + 150L;
    }

    public void blockSprintUntil(long until) {
        sprintBlockedUntil = Math.max(sprintBlockedUntil, until);
        keepSprintUntil = 0L;
        activeMotionAfterAttack = 1.0;
    }

    private boolean isSprintBlocked() {
        return System.currentTimeMillis() <= sprintBlockedUntil;
    }

    private boolean isKeepSprintWindowActive() {
        return System.currentTimeMillis() <= keepSprintUntil;
    }

    @Override
    public void onDisable() {
        super.onDisable();

        unsetSprinting();
        keepSprintUntil = 0L;
        sprintBlockedUntil = 0L;
        activeMotionAfterAttack = 1.0;
    }
}
