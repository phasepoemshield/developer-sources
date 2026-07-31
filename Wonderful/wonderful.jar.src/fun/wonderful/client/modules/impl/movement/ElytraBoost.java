package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.chat.ChatUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.combat.Aura;
import fun.wonderful.client.modules.impl.combat.ElytraTarget;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import lombok.Generated;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;

public class ElytraBoost
extends Module {
    private static final String[] RANGE_LABELS = new String[]{"0 - 5", "5 - 10", "10 - 15", "15 - 20", "20 - 25", "25 - 30", "30 - 35", "35 - 40", "40 - 45"};
    private static final long DEBUG_MESSAGE_INTERVAL_MS = 800L;
    public static ElytraBoost INSTANCE = new ElytraBoost();
    private final FloatSetting[] yawSpeeds = new FloatSetting[9];
    private final FloatSetting[] pitchSpeeds = new FloatSetting[9];
    private final ModeSetting mode = new ModeSetting("Сервер", "Custom", "Custom", "LonyGrief", "BravoHVH", "ReallyWorld", "SlimeWorld");
    private final BooleanSetting adaptToTarget = new BooleanSetting("Подстраиваться", true);
    private final BooleanSetting debug = new BooleanSetting("Дебаг", false).visible(this::isCustomMode);
    private long lastDebugMessageAt;

    public ElytraBoost() {
        super("ElytraBoost", "Ускоряет на элитрах", Module.ModuleCategory.MOVEMENT);
        int i2;
        for (i2 = 0; i2 < this.yawSpeeds.length; ++i2) {
            this.yawSpeeds[i2] = new FloatSetting("yaw " + RANGE_LABELS[i2], 1.5f, 1.5f, 2.5f, 0.01f).visible(this::isCustomMode);
        }
        for (i2 = 0; i2 < this.pitchSpeeds.length; ++i2) {
            this.pitchSpeeds[i2] = new FloatSetting("pitch " + RANGE_LABELS[i2], 1.5f, 1.5f, 2.5f, 0.01f).visible(this::isCustomMode);
        }
        this.addSettings(this.mode, this.adaptToTarget, this.debug);
        this.addSettings(this.yawSpeeds);
        this.addSettings(this.pitchSpeeds);
    }

    public boolean isCustomMode() {
        return this.mode.is("Custom");
    }

    public Vec2f getBoostV2() {
        Vec2f rotations;
        float yaw = ElytraBoost.mc.player != null ? ElytraBoost.mc.player.getYaw() : 0.0f;
        float pitch = ElytraBoost.mc.player != null ? ElytraBoost.mc.player.getPitch() : 0.0f;
        Aura aura = Aura.INSTANCE;
        if (aura != null && aura.isEnable() && aura.getTarget() != null && (rotations = aura.getTargetRotations()) != null) {
            yaw = rotations.x;
            pitch = rotations.y;
        }
        float normalizedYaw = this.convertValToRange(MathHelper.wrapDegrees((float)yaw));
        float normalizedPitch = this.convertValToRange(Math.abs(pitch));
        int yawIndex = this.getRangeIndex(normalizedYaw, this.yawSpeeds.length);
        int pitchIndex = this.getRangeIndex(normalizedPitch, this.pitchSpeeds.length);
        float yawSpeed = this.yawSpeeds[yawIndex].getValue().floatValue();
        float pitchSpeed = this.pitchSpeeds[pitchIndex].getValue().floatValue();
        if (pitchSpeed > yawSpeed) {
            yawSpeed = pitchSpeed;
        }
        float jitter = (float)(Math.random() * 0.002 - 0.001);
        this.logDebug(yawIndex, yawSpeed += jitter, pitchIndex, pitchSpeed += jitter * 0.7f);
        return new Vec2f(yawSpeed, pitchSpeed);
    }

    public Vec3d adaptBoost(Vec3d boost) {
        if (!this.adaptToTarget.isState() || ElytraBoost.mc.player == null || !ElytraBoost.mc.player.isGliding()) {
            return boost;
        }
        Aura aura = Aura.INSTANCE;
        ElytraTarget elytraTarget = ModuleClass.elytraTarget;
        if (aura == null || !aura.isEnable() || elytraTarget == null || !elytraTarget.isEnable()) {
            return boost;
        }
        LivingEntity target = aura.getTarget();
        if (target == null || !elytraTarget.shouldTarget(target)) {
            return boost;
        }
        double targetBps = this.getBps(target);
        double playerBps = this.getBps((LivingEntity)ElytraBoost.mc.player);
        double distance = ElytraBoost.mc.player.getEyePos().distanceTo(target.getEyePos());
        double desiredDistance = Math.max(elytraTarget.distance.getValue().doubleValue(), (double)(target.getWidth() + ElytraBoost.mc.player.getWidth()));
        double distanceError = (distance - desiredDistance) / Math.max(desiredDistance, 1.0);
        double predictedTargetEyeY = target.getEyeY();
        double heightError = predictedTargetEyeY - ElytraBoost.mc.player.getEyeY();
        double relativeY = target.getVelocity().y - ElytraBoost.mc.player.getVelocity().y;
        double fallHold = Math.max(0.0, -ElytraBoost.mc.player.getVelocity().y);
        double bpsFactor = targetBps / Math.max(playerBps, 0.05);
        double distanceFactor = 1.0 + MathHelper.clamp((double)distanceError, (double)-1.0, (double)1.0);
        double horizontalFactor = MathHelper.clamp((double)(bpsFactor * distanceFactor), (double)0.35, (double)1.08);
        double verticalFactor = MathHelper.clamp((double)(1.0 + (heightError * 0.72 + relativeY * 1.25 + fallHold * 2.4) / Math.max(distance, 1.0)), (double)0.62, (double)1.14);
        double baseHorizontal = Math.max(boost.x, boost.z);
        double horizontal = baseHorizontal * horizontalFactor;
        double vertical = boost.y * verticalFactor;
        return new Vec3d(horizontal, vertical, horizontal);
    }

    private double getBps(LivingEntity entity) {
        double dx = entity.getX() - entity.prevX;
        double dy = entity.getY() - entity.prevY;
        double dz = entity.getZ() - entity.prevZ;
        return Math.sqrt(dx * dx + dy * dy + dz * dz) * 20.0;
    }

    private void logDebug(int yawIndex, float yawSpeed, int pitchIndex, float pitchSpeed) {
        if (!this.debug.isState()) {
            return;
        }
        long now = System.currentTimeMillis();
        if (now - this.lastDebugMessageAt < 800L) {
            return;
        }
        this.lastDebugMessageAt = now;
        ChatUtils.sendMessage("yaw " + RANGE_LABELS[yawIndex] + ": " + yawSpeed + " | pitch " + RANGE_LABELS[pitchIndex] + ": " + pitchSpeed);
    }

    private int getRangeIndex(float value, int length) {
        return Math.min((int)(value / 5.0f), length - 1);
    }

    private float convertValToRange(float value) {
        float result = Math.abs(value);
        if (result > 90.0f) {
            result = 180.0f - result;
        }
        if (result > 45.0f) {
            result = 90.0f - result;
        }
        return result;
    }

    @Generated
    public FloatSetting[] getYawSpeeds() {
        return this.yawSpeeds;
    }

    @Generated
    public FloatSetting[] getPitchSpeeds() {
        return this.pitchSpeeds;
    }

    @Generated
    public ModeSetting getMode() {
        return this.mode;
    }

    @Generated
    public BooleanSetting getAdaptToTarget() {
        return this.adaptToTarget;
    }

    @Generated
    public BooleanSetting getDebug() {
        return this.debug;
    }

    @Generated
    public long getLastDebugMessageAt() {
        return this.lastDebugMessageAt;
    }

    @Generated
    public void setLastDebugMessageAt(long lastDebugMessageAt) {
        this.lastDebugMessageAt = lastDebugMessageAt;
    }
}