package fun.nexisdlc.client.utils.render.animations;

import net.minecraft.util.math.MathHelper;

public class DecelerateAnimation {

    private long startTime;
    private long duration = 500;
    private float startValue = 0f;
    private float targetValue = 1f;
    private Direction direction = Direction.FORWARDS;

    public enum Direction {
        FORWARDS, BACKWARDS
    }

    public DecelerateAnimation() {
        this.startTime = System.currentTimeMillis();
    }

    public DecelerateAnimation setDuration(long ms) {
        this.duration = ms;
        return this;
    }

    public DecelerateAnimation setValue(float value) {
        this.startValue = value;
        this.startTime = System.currentTimeMillis();
        return this;
    }

    public DecelerateAnimation setTarget(float target) {
        this.targetValue = target;
        this.startTime = System.currentTimeMillis();
        return this;
    }

    public DecelerateAnimation setDirection(Direction dir) {
        this.direction = dir;
        this.startTime = System.currentTimeMillis();
        return this;
    }

    public float getOutput() {
        long elapsed = System.currentTimeMillis() - startTime;
        float t = MathHelper.clamp((float) elapsed / duration, 0f, 1f);

        float eased = 1f - (float) Math.pow(1f - t, 3);

        if (direction == Direction.BACKWARDS) {
            eased = 1f - eased;
        }

        return MathHelper.lerp(eased, startValue, targetValue);
    }

    public boolean isFinished() {
        long elapsed = System.currentTimeMillis() - startTime;
        return elapsed >= duration;
    }

    public DecelerateAnimation reset() {
        this.startTime = System.currentTimeMillis();
        return this;
    }
}