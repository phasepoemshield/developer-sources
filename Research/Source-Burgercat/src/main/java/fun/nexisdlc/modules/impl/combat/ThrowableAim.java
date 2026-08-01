package fun.nexisdlc.modules.impl.combat;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.FastestEvent;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.player.rotation.RotateVector;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeListSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import fun.nexisdlc.modules.impl.combat.throwableaim.ThrowableTargetSelector;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.concurrent.ThreadLocalRandom;

@FunctionAdd(name = "ThrowableAim", alias = "ThrowableAim", category = Category.Combat, description = "Автонаводка для лука, арбалета и трезубца")
public class ThrowableAim extends Function {
    int ROTATION_PRIORITY = 6;
    private final RotateVector headVector = new RotateVector(0f, 0f);

    public SliderSetting distance = new SliderSetting("Дистанция", 8, 4, 20, 1);

    public static final ModeListSetting targets = new ModeListSetting("Цели",
            new BooleanSetting("Игроки", true),
            new BooleanSetting("Игроки без брони", true),
            new BooleanSetting("Тиммейты", false),
            new BooleanSetting("Невидимые", true),
            new BooleanSetting("Боты", false),
            new BooleanSetting("Мобы", true),
            new BooleanSetting("Животные", false));

    ModeListSetting throwables = new ModeListSetting("Применять для",
            new BooleanSetting("Арбалета", true),
            new BooleanSetting("Лука", true),
            new BooleanSetting("Трезубца", true));

    public static LivingEntity target;
    boolean holdingThrowable = false;

    public ThrowableAim() {
        addSettings(distance, targets);
    }

    @Override
    public void onEnable() {
        target = null;
        holdingThrowable = false;
        super.onEnable();
    }

    @Override
    public void onDisable() {
        target = null;
        holdingThrowable = false;
        resetRotation();
        super.onDisable();
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck()) return;

        updateHoldingThrowable();
        AntiBotSystem.scanWorld(mc.world);

        if (!isCurrentTargetValid()) {
            ThrowableTargetSelector.TargetResult result = ThrowableTargetSelector.selectTargets(mc, this);
            if (holdingThrowable) target = result.mainTarget;
        }

        if (!holdingThrowable) {
            target = null;
            resetRotation();
        }
    }

    void updateHoldingThrowable() {
        var currentItem = mc.player.getMainHandStack();
        var item = currentItem.getItem();

        holdingThrowable = false;

        if (mc.player.isUsingItem()) {
            if (item == Items.BOW) {
                if (throwables.getByName("Лука").get()) {
                    holdingThrowable = true;
                }
            } else if (item == Items.TRIDENT) {
                if (throwables.getByName("Трезубца").get()) {
                    holdingThrowable = true;
                }
            } else if (item == Items.CROSSBOW) {
                if (throwables.getByName("Арбалета").get()) {
                    holdingThrowable = true;
                }
            }
        }
    }

    @EventHandler
    public void onFastest(FastestEvent event) {
        if (nullCheck()) return;

        if (target != null && target.isAlive() && holdingThrowable) {
            rotation();


            RotationTask.create("throwableaim", 101);

            RotationTask.setTargetRotation(
                    headVector.getYaw(),
                    headVector.getPitch(),
                    Float.MAX_VALUE,
                    Float.MAX_VALUE,
                    220f,
                    180f,
                    0,
                    ROTATION_PRIORITY,
                    -1L
            );
        }
    }

    void rotation() {
        var aim = calcAim(calculateTargetPoint(target));
        headVector.setRotation(aim);
    }

    private Vec3d calculateTargetPoint(LivingEntity target) {
        boolean safeDistancePassed = mc.player.distanceTo(target) < 1.9f;

        double heightPercent = safeDistancePassed ? 0.48f : 0.68;
        var basePos = targetPoint(target, heightPercent);

        Vec3d velocity = target.getVelocity();

        double predictionFactor = 10;

        double motionX = target.getX() - target.lastX;
        double motionZ = target.getZ() - target.lastZ;

        double speed = Math.sqrt(motionX * motionX + motionZ * motionZ);

        if (speed > 0.001 && !safeDistancePassed) {
            return new Vec3d(basePos.getX() + velocity.getX() * predictionFactor,
                    basePos.getY(),
                    basePos.getZ() + velocity.getZ() * predictionFactor);
        }

        return basePos;
    }

    float lastYaw = 0;
    float lastPitch = 0;

    protected RotateVector calcAim(Vec3d targetPoint) {
        if (mc.player == null) return new RotateVector(0, 0);

        Vec3d eyePos = mc.player.getEyePos();
        double dx = targetPoint.x - eyePos.x;
        double dy = targetPoint.y - eyePos.y;
        double dz = targetPoint.z - eyePos.z;
        double xz = Math.sqrt(dx * dx + dz * dz);

        boolean rayTracePassed = PlayerUtils.getMouseOver(target, headVector.getYaw(), headVector.getPitch(), 1.9f, 0.7f) != null;

        float yaw = rayTracePassed ? lastYaw : ThreadLocalRandom.current().nextFloat(-2, 2) + (float) Math.toDegrees(Math.atan2(dz, dx)) - 90.0f;
        float pitch = rayTracePassed ? lastPitch : ThreadLocalRandom.current().nextFloat(-1, 1) + (float) -Math.toDegrees(Math.atan2(dy, xz));
        pitch = MathHelper.clamp(pitch, -90.0f, 90.0f);

        lastYaw = yaw;
        lastPitch = pitch;

        return new RotateVector(yaw, pitch);
    }

    protected Vec3d targetPoint(LivingEntity target, double heightPercent) {
        if (target == null) return Vec3d.ZERO;

        double x = target.getX();
        double y = target.getY() + target.getHeight() * heightPercent;
        double z = target.getZ();

        return new Vec3d(x, y, z);
    }

    private boolean isCurrentTargetValid() {
        if (target == null || !target.isAlive() || mc.player == null || (target instanceof PlayerEntity player && Nexis.getInstance().getFriendStorage().isFriend(player.getName().getString())))
            return false;

        double safeRange = distance.get();
        if (mc.player.distanceTo(target) > safeRange) return false;

        return ThrowableTargetSelector.isValid(mc, target, safeRange * safeRange,
                new Vec3d(mc.player.getX(), mc.player.getY(), mc.player.getZ()));
    }

    void resetRotation() {
        if (RotationTask.rotationPriority > ROTATION_PRIORITY) {
            RotationTask.remove("throwableaim");
            return;
        }

        if (!RotationTask.isRotating()) {
            RotationTask.remove("throwableaim");
            return;
        }
        if (RotationTask.rotationState == RotationTask.RotationState.RESET) {
            return;
        }

        RotationTask.rotationState = RotationTask.RotationState.RESET;
        RotationTask.returnStartTime = System.currentTimeMillis() - 460;
        RotationTask.rotationPriority = 0;
        RotationTask.inactiveMs = 0L;
        RotationTask.needSmoothReset = true;
    }
}