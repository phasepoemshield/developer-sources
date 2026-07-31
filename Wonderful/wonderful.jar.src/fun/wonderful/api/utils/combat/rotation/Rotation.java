package fun.wonderful.api.utils.combat.rotation;

import fun.wonderful.api.utils.combat.rotation.RotationDelta;
import lombok.Generated;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;

public class Rotation {
    private final float yaw;
    private final float pitch;
    private boolean isNormalized;
    public static final Rotation ZERO = new Rotation(0.0f, 0.0f);

    public Rotation(float yaw, float pitch) {
        this(yaw, pitch, false);
    }

    public Rotation(float yaw, float pitch, boolean isNormalized) {
        this.yaw = yaw;
        this.pitch = pitch;
        this.isNormalized = isNormalized;
    }

    public static Rotation lookingAt(Vec3d point, Vec3d from) {
        return Rotation.fromRotationVec(point.subtract(from));
    }

    public static Rotation fromRotationVec(Vec3d lookVec) {
        double diffX = lookVec.x;
        double diffY = lookVec.y;
        double diffZ = lookVec.z;
        return new Rotation((float)MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(diffZ, diffX)) - 90.0)), (float)MathHelper.wrapDegrees((double)(-Math.toDegrees(Math.atan2(diffY, Math.sqrt(diffX * diffX + diffZ * diffZ))))));
    }

    public static Rotation getRotations(Vec3d vec3d) {
        double deltaX = vec3d.x - MinecraftClient.getInstance().player.getX();
        double deltaY = vec3d.y - MinecraftClient.getInstance().player.getEyeY();
        double deltaZ = vec3d.z - MinecraftClient.getInstance().player.getZ();
        double distance = MathHelper.sqrt((float)((float)(deltaX * deltaX + deltaZ * deltaZ)));
        float yaw = (float)(MathHelper.atan2((double)deltaZ, (double)deltaX) * 57.29577951308232 - 90.0);
        float pitch = (float)(-MathHelper.atan2((double)deltaY, (double)distance) * 57.29577951308232);
        return new Rotation(yaw, pitch);
    }

    public float angleTo(Rotation other) {
        return Math.min(this.rotationDeltaTo(other).length(), 180.0f);
    }

    public RotationDelta rotationDeltaTo(Rotation other) {
        return new RotationDelta(this.angleDifference(other.yaw, this.yaw), this.angleDifference(other.pitch, this.pitch));
    }

    public float getDelta(Rotation target) {
        float yawDelta = MathHelper.wrapDegrees((float)(target.getYaw() - this.yaw));
        float pitchDelta = target.getPitch() - this.pitch;
        return (float)Math.hypot(Math.abs(yawDelta), Math.abs(pitchDelta));
    }

    private float angleDifference(float a2, float b2) {
        return MathHelper.wrapDegrees((float)(a2 - b2));
    }

    public boolean approximatelyEquals(Rotation other, float tolerance) {
        return this.angleTo(other) <= tolerance;
    }

    public boolean isNormalized() {
        return this.isNormalized;
    }

    public Vec3d getDirectionVector() {
        return Vec3d.fromPolar((float)this.pitch, (float)this.yaw);
    }

    public final Vec3d toVector() {
        float f2 = this.pitch * ((float)Math.PI / 180);
        float g2 = -this.yaw * ((float)Math.PI / 180);
        float h2 = MathHelper.cos((float)g2);
        float i2 = MathHelper.sin((float)g2);
        float j2 = MathHelper.cos((float)f2);
        float k2 = MathHelper.sin((float)f2);
        return new Vec3d((double)(i2 * j2), (double)(-k2), (double)(h2 * j2));
    }

    public Rotation towardsLinear(Rotation other, float horizontalFactor, float verticalFactor) {
        RotationDelta diff = this.rotationDeltaTo(other);
        float rotationDifference = diff.length();
        float straightLineYaw = Math.abs(diff.getDeltaYaw() / rotationDifference) * horizontalFactor;
        float straightLinePitch = Math.abs(diff.getDeltaPitch() / rotationDifference) * verticalFactor;
        float limitedYaw = MathHelper.clamp((float)diff.getDeltaYaw(), (float)(-straightLineYaw), (float)straightLineYaw);
        float limitedPitch = MathHelper.clamp((float)diff.getDeltaPitch(), (float)(-straightLinePitch), (float)straightLinePitch);
        return new Rotation(this.yaw + limitedYaw, this.pitch + limitedPitch);
    }

    public boolean check() {
        return Float.isInfinite(this.yaw) || Float.isNaN(this.yaw) || Float.isInfinite(this.pitch) || Float.isNaN(this.pitch);
    }

    public static float gcd() {
        double f2 = (Double)MinecraftClient.getInstance().options.getMouseSensitivity().getValue() * (double)0.6f + (double)0.2f;
        return (float)(f2 * f2 * f2 * 8.0 * (double)0.15f);
    }

    public Rotation normalize(Rotation currentRotation) {
        if (!this.isNormalized && !this.equals(currentRotation)) {
            RotationDelta rotationDelta = currentRotation.rotationDeltaTo(this);
            double gcd = Rotation.gcd();
            int targetX = (int)((double)rotationDelta.getDeltaYaw() / gcd);
            int targetY = (int)((double)rotationDelta.getDeltaPitch() / gcd);
            return new Rotation((float)((double)currentRotation.getYaw() + (double)targetX * gcd), (float)((double)currentRotation.getPitch() + (double)targetY * gcd), true);
        }
        return this;
    }

    public Rotation add(RotationDelta diff) {
        return new Rotation(this.yaw + diff.getDeltaYaw(), this.pitch + diff.getDeltaPitch());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Rotation)) {
            return false;
        }
        Rotation o2 = (Rotation)obj;
        return o2.yaw == this.yaw && o2.pitch == this.pitch;
    }

    @Generated
    public float getYaw() {
        return this.yaw;
    }

    @Generated
    public float getPitch() {
        return this.pitch;
    }
}