package fun.wonderful.client.modules.impl.combat.components.rotations;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fun.wonderful.api.QClient;
import fun.wonderful.client.modules.impl.combat.components.RotationsSystem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.annotation.MBA;

public class ТестоваяРотация
extends RotationsSystem
implements QClient {
    private static final Path DATASET_PATH = Path.of(System.getProperty("user.home"), "Desktop", "data.json");
    private final List<DatasetFrame> frames = new ArrayList<DatasetFrame>();
    private LivingEntity trackedTarget;
    private LivingEntity trackedRotationTarget;
    private Vec3d currentAimPoint;
    private Vec3d targetAimPoint;
    private long lastModified = Long.MIN_VALUE;
    private long lastLoadAttempt;
    private boolean datasetReady;
    private int playbackIndex;
    private int aimPointTicks;
    private int aimPointRefreshTicks;
    private int smoothProfileTicks;
    private float smoothYawStep;
    private float smoothPitchStep;
    private float smoothYaw;
    private float smoothPitch;
    private float yawSmoothFactor = 1.0f;
    private float pitchSmoothFactor = 1.0f;
    private boolean hasRotationState;

    public void reset() {
        this.trackedTarget = null;
        this.trackedRotationTarget = null;
        this.currentAimPoint = null;
        this.targetAimPoint = null;
        this.playbackIndex = 0;
        this.aimPointTicks = 0;
        this.aimPointRefreshTicks = 0;
        this.smoothProfileTicks = 0;
        this.smoothYawStep = 0.0f;
        this.smoothPitchStep = 0.0f;
        this.smoothYaw = 0.0f;
        this.smoothPitch = 0.0f;
        this.yawSmoothFactor = 1.0f;
        this.pitchSmoothFactor = 1.0f;
        this.hasRotationState = false;
    }

    @Override
    @Compile
    public native void updateRotations(LivingEntity var1);

    private boolean shouldFocus() {
        float cooldown = ТестоваяРотация.mc.player.getAttackCooldownProgress(1.5f);
        boolean fallingForCrit = !ТестоваяРотация.mc.player.isOnGround() && ТестоваяРотация.mc.player.getVelocity().y < 0.0 && ТестоваяРотация.mc.player.fallDistance > 0.0f;
        return cooldown >= 0.88f || fallingForCrit;
    }

    private void ensureDatasetLoaded() {
        long now = System.currentTimeMillis();
        if (!this.shouldReload(now)) {
            return;
        }
        this.lastLoadAttempt = now;
        long modified = this.readLastModified();
        if (this.datasetReady && modified == this.lastModified) {
            return;
        }
        this.frames.clear();
        this.datasetReady = false;
        if (!Files.exists(DATASET_PATH, new LinkOption[0])) {
            this.lastModified = Long.MIN_VALUE;
            return;
        }
        try (BufferedReader reader = Files.newBufferedReader(DATASET_PATH);){
            JsonArray array = JsonParser.parseReader((Reader)reader).getAsJsonArray();
            for (JsonElement element : array) {
                DatasetFrame frame;
                if (!element.isJsonObject() || (frame = this.parseFrame(element.getAsJsonObject())) == null) continue;
                this.frames.add(frame);
            }
            this.datasetReady = !this.frames.isEmpty();
            this.lastModified = modified;
            this.reset();
        }
        catch (IOException | IllegalStateException ignored) {
            this.datasetReady = false;
            this.lastModified = Long.MIN_VALUE;
            this.reset();
        }
    }

    private boolean shouldReload(long now) {
        if (!this.datasetReady || this.frames.isEmpty()) {
            return now - this.lastLoadAttempt >= 1500L;
        }
        return now - this.lastLoadAttempt >= 3000L;
    }

    private long readLastModified() {
        try {
            return Files.exists(DATASET_PATH, new LinkOption[0]) ? Files.getLastModifiedTime(DATASET_PATH, new LinkOption[0]).toMillis() : Long.MIN_VALUE;
        }
        catch (IOException ignored) {
            return Long.MIN_VALUE;
        }
    }

    private DatasetFrame parseFrame(JsonObject object) {
        float fromYaw = this.getFloat(object, "fromYaw");
        float toYaw = this.getFloat(object, "toYaw");
        float fromPitch = this.getFloat(object, "fromPitch");
        float toPitch = this.getFloat(object, "toPitch");
        float signedYaw = MathHelper.wrapDegrees((float)(toYaw - fromYaw));
        float signedPitch = toPitch - fromPitch;
        float absYaw = Math.abs(signedYaw);
        float absPitch = Math.abs(signedPitch);
        float deltaYaw = Math.max(this.getFloat(object, "deltaYaw"), absYaw);
        float deltaPitch = Math.max(this.getFloat(object, "deltaPitch"), absPitch);
        if (deltaYaw <= 0.0f && deltaPitch <= 0.0f) {
            return null;
        }
        DatasetFrame frame = new DatasetFrame();
        frame.deltaYaw = deltaYaw;
        frame.deltaPitch = deltaPitch;
        frame.signedYaw = signedYaw != 0.0f ? signedYaw : Math.signum(this.getFloat(object, "jitterYawDir")) * deltaYaw;
        frame.signedPitch = signedPitch != 0.0f ? signedPitch : Math.signum(this.getFloat(object, "jitterPitchDir")) * deltaPitch;
        frame.rotationSpeed = Math.max(this.getFloat(object, "rotationSpeed"), 0.0f);
        frame.jitterScore = Math.max(this.getFloat(object, "jitterScore"), 0.0f);
        frame.jitterYawSpeed = Math.max(this.getFloat(object, "jitterYawSpeed"), 0.0f);
        frame.jitterPitchSpeed = Math.max(this.getFloat(object, "jitterPitchSpeed"), 0.0f);
        frame.isJittering = this.getBoolean(object, "isJittering");
        frame.attacking = this.getBoolean(object, "attacking");
        frame.combatFrame = this.getBoolean(object, "isCombatFrame");
        frame.instantSnap = this.getBoolean(object, "isInstantSnap");
        frame.timeDeltaMs = Math.max(1L, object.has("timeDeltaMs") ? object.get("timeDeltaMs").getAsLong() : 50L);
        return frame;
    }

    private DatasetFrame pickFrame(float remainingYaw, float remainingPitch, boolean focus) {
        float pressure = Math.abs(remainingYaw) + Math.abs(remainingPitch) * 0.82f;
        int size = this.frames.size();
        int window = Math.min(size, focus ? 78 : 56);
        int bestIndex = this.playbackIndex % size;
        float bestScore = Float.MAX_VALUE;
        for (int i2 = 0; i2 < window; ++i2) {
            int index = (this.playbackIndex + i2) % size;
            DatasetFrame frame = this.frames.get(index);
            float framePressure = frame.deltaYaw + frame.deltaPitch * 0.82f;
            float score = Math.abs(framePressure - pressure);
            if (focus) {
                if (!frame.isCombatLike()) {
                    score += 3.0f;
                }
                if (frame.instantSnap) {
                    score -= 0.5f;
                }
            } else if (frame.isCombatLike()) {
                score += 1.6f;
            }
            if (pressure < 10.0f && frame.isJittering) {
                score -= Math.min(frame.jitterScore, 2.6f) * 0.2f;
            }
            if (!((score += (float)i2 * 0.032f) < bestScore)) continue;
            bestScore = score;
            bestIndex = index;
        }
        this.playbackIndex = (bestIndex + 1) % size;
        return this.frames.get(bestIndex);
    }

    @Compile
    private native void updateSmoothProfile(DatasetFrame var1, float var2, float var3, boolean var4);

    @Compile
    private native float buildAxisStep(float var1, DatasetFrame var2, boolean var3, boolean var4);

    @MBA(mode=3)
    @Compile
    private native float buildJitter(DatasetFrame var1, float var2, boolean var3, float var4);

    private void syncRotationState(LivingEntity target, float currentYaw, float currentPitch) {
        if (!this.hasRotationState || this.trackedRotationTarget != target) {
            this.trackedRotationTarget = target;
            this.smoothYaw = currentYaw;
            this.smoothPitch = currentPitch;
            this.smoothYawStep = 0.0f;
            this.smoothPitchStep = 0.0f;
            this.yawSmoothFactor = 1.0f;
            this.pitchSmoothFactor = 1.0f;
            this.smoothProfileTicks = 0;
            this.hasRotationState = true;
        }
    }

    private float smoothAxisStep(float currentStep, float desiredStep, float remaining, boolean yawAxis, boolean focus) {
        float finishThreshold;
        float minCap;
        float desiredAbs = Math.abs(remaining);
        if (desiredAbs <= 1.0E-4f) {
            return 0.0f;
        }
        float baseAlpha = yawAxis ? (focus ? 0.092f : 0.06f) : (focus ? 0.082f : 0.055f);
        float alpha = baseAlpha * (yawAxis ? this.yawSmoothFactor : this.pitchSmoothFactor);
        float smoothed = currentStep + (desiredStep - currentStep) * MathHelper.clamp((float)alpha, (float)0.025f, (float)0.16f);
        float f2 = minCap = yawAxis ? 0.13f : 0.1f;
        float capScale = yawAxis ? (focus ? 0.056f : 0.036f) : (focus ? 0.046f : 0.032f);
        float randomFactor = yawAxis ? this.yawSmoothFactor : this.pitchSmoothFactor;
        float maxCap = minCap + desiredAbs * capScale * MathHelper.clamp((float)randomFactor, (float)0.88f, (float)1.18f);
        float f3 = finishThreshold = yawAxis ? 5.5f : 3.8f;
        if (desiredAbs < finishThreshold) {
            maxCap *= 1.12f;
        }
        smoothed = MathHelper.clamp((float)smoothed, (float)(-maxCap), (float)maxCap);
        if (Math.abs(remaining) < Math.abs(smoothed) && Math.signum(remaining) == Math.signum(smoothed)) {
            smoothed = remaining;
        }
        return smoothed;
    }

    private float quantizeDelta(float wantedDelta, float remaining, float gcd, boolean yawAxis) {
        float quantized;
        float limited = wantedDelta;
        if (Math.abs(remaining) < Math.abs(limited) && Math.signum(remaining) == Math.signum(limited)) {
            limited = remaining;
        }
        if ((quantized = (float)Math.round(limited / gcd) * gcd) == 0.0f && Math.abs(limited) >= gcd * 0.2f) {
            quantized = Math.signum(limited) * gcd;
        }
        if (Math.abs(remaining) < Math.abs(quantized) && Math.signum(remaining) == Math.signum(quantized)) {
            quantized = remaining;
        }
        if (!yawAxis) {
            quantized = MathHelper.clamp((float)quantized, (float)-89.0f, (float)89.0f);
        }
        return quantized;
    }

    private Vec3d selectAimPoint(LivingEntity target, boolean focus) {
        if (this.trackedTarget != target || this.currentAimPoint == null || this.targetAimPoint == null) {
            this.trackedTarget = target;
            this.currentAimPoint = this.targetAimPoint = this.createAimPoint(target, focus);
            this.aimPointTicks = 0;
            this.aimPointRefreshTicks = this.randomRefreshTicks(focus);
            return this.currentAimPoint;
        }
        if (this.aimPointTicks++ >= this.aimPointRefreshTicks) {
            this.targetAimPoint = this.createAimPoint(target, focus);
            this.aimPointTicks = 0;
            this.aimPointRefreshTicks = this.randomRefreshTicks(focus);
        }
        float lerp = focus ? 0.06f : 0.04f;
        this.currentAimPoint = new Vec3d(MathHelper.lerp((double)lerp, (double)this.currentAimPoint.x, (double)this.targetAimPoint.x), MathHelper.lerp((double)lerp, (double)this.currentAimPoint.y, (double)this.targetAimPoint.y), MathHelper.lerp((double)lerp, (double)this.currentAimPoint.z, (double)this.targetAimPoint.z));
        return this.currentAimPoint;
    }

    private int randomRefreshTicks(boolean focus) {
        return ThreadLocalRandom.current().nextInt(focus ? 7 : 10, focus ? 13 : 18);
    }

    private Vec3d createAimPoint(LivingEntity target, boolean focus) {
        Box box = this.getPredictedBox(target);
        ThreadLocalRandom random = ThreadLocalRandom.current();
        double x2 = MathHelper.lerp((double)random.nextDouble(0.45, 0.55), (double)box.minX, (double)box.maxX);
        double y2 = MathHelper.lerp((double)random.nextDouble(focus ? 0.53 : 0.49, focus ? 0.7 : 0.76), (double)box.minY, (double)box.maxY);
        double z2 = MathHelper.lerp((double)random.nextDouble(0.45, 0.55), (double)box.minZ, (double)box.maxZ);
        return new Vec3d(x2, y2, z2);
    }

    private float getFloat(JsonObject object, String key) {
        return object.has(key) ? object.get(key).getAsFloat() : 0.0f;
    }

    private boolean getBoolean(JsonObject object, String key) {
        return object.has(key) && object.get(key).getAsBoolean();
    }

    private static class DatasetFrame {
        float deltaYaw;
        float deltaPitch;
        float signedYaw;
        float signedPitch;
        float rotationSpeed;
        float jitterScore;
        float jitterYawSpeed;
        float jitterPitchSpeed;
        long timeDeltaMs;
        boolean isJittering;
        boolean attacking;
        boolean combatFrame;
        boolean instantSnap;

        private DatasetFrame() {
        }

        boolean isCombatLike() {
            return this.attacking || this.combatFrame || this.instantSnap;
        }
    }
}