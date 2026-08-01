package fun.nexisdlc.modules.impl.combat.aura.rotations;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import ru.sterford.annotations.NativeCall;

/**
 * Извлечение и нормализация фич.
 * <p>
 * cooldown убран полностью. Боевая фаза теперь только hurtTime.
 * Только относительное состояние: где цель относительно взгляда,
 * как движется относительно взгляда.
 */
public final class RotationFeatures {
    public static final int WINDOW = 10;
    public static final int FEATURES = 11;

    private static final float MAX_RANGE = 6.0f;
    private static final float MAX_SPEED = 1.0f;
    private static final float MAX_DELTA = 45.0f;
    private static final float MAX_HURT_TIME = 10.0f;

    private RotationFeatures() {
    }

    @NativeCall
    public static float[] extract(float headYaw, float headPitch, LivingEntity target,
                                  float prevDYaw, float prevDPitch) {
        MinecraftClient mc = MinecraftClient.getInstance();
        float[] f = new float[FEATURES];

        if (mc.player == null || target == null) {
            return f;
        }

        Vec3d eye = mc.player.getEyePos();
        Vec3d aimPoint = target.getBoundingBox().getCenter();

        double dx = aimPoint.x - eye.x;
        double dy = aimPoint.y - eye.y;
        double dz = aimPoint.z - eye.z;
        double xz = Math.sqrt(dx * dx + dz * dz);

        float aimYaw = (float) Math.toDegrees(Math.atan2(dz, dx)) - 90.0f;
        float aimPitch = MathHelper.clamp((float) -Math.toDegrees(Math.atan2(dy, xz)), -90f, 90f);

        float yawErr = normYaw(aimYaw - headYaw);
        float pitchErr = aimPitch - headPitch;
        double dist = eye.distanceTo(aimPoint);

        Vec3d playerVel = mc.player.getVelocity();
        Vec3d targetVel = target.getVelocity();
        Vec3d relVel = targetVel.subtract(playerVel);

        float yawRad = (float) Math.toRadians(headYaw);

        // Minecraft yaw: yaw 0 -> forward +Z
        float forwardX = -MathHelper.sin(yawRad);
        float forwardZ = MathHelper.cos(yawRad);

        float rightX = MathHelper.cos(yawRad);
        float rightZ = MathHelper.sin(yawRad);

        float relForward = (float) (relVel.x * forwardX + relVel.z * forwardZ);
        float relRight = (float) (relVel.x * rightX + relVel.z * rightZ);
        float relY = (float) relVel.y;

        float playerForward = (float) (playerVel.x * forwardX + playerVel.z * forwardZ);
        float playerRight = (float) (playerVel.x * rightX + playerVel.z * rightZ);

        f[0] = clamp(yawErr / 180.0f);
        f[1] = clamp(pitchErr / 90.0f);
        f[2] = clamp((float) (dist / MAX_RANGE));

        // Relative target movement in local view space.
        f[3] = clamp(relForward / MAX_SPEED);
        f[4] = clamp(relRight / MAX_SPEED);
        f[5] = clamp(relY / MAX_SPEED);

        // Player movement in local view space.
        f[6] = clamp(playerForward / MAX_SPEED);
        f[7] = clamp(playerRight / MAX_SPEED);

        // Previous rotation delta.
        f[8] = clamp(prevDYaw / MAX_DELTA);
        f[9] = clamp(prevDPitch / MAX_DELTA);

        // Combat phase (cooldown убран).
        f[10] = clamp01(target.hurtTime / MAX_HURT_TIME);

        return f;
    }

    private static float normYaw(float yaw) {
        yaw %= 360.0f;
        if (yaw >= 180.0f) yaw -= 360.0f;
        if (yaw < -180.0f) yaw += 360.0f;
        return yaw;
    }

    private static float clamp(float v) {
        return MathHelper.clamp(v, -1.0f, 1.0f);
    }

    private static float clamp01(float v) {
        return MathHelper.clamp(v, 0.0f, 1.0f);
    }
}