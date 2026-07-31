package sky.core.util.animation;

public final class SmoothFloat {
    private static final float SNAP_THRESHOLD = 0.01F;

    private float value;
    private float target;
    private final float smoothing;

    public SmoothFloat(float smoothing) {
        this.smoothing = smoothing;
    }

    public void setTarget(float target) {
        this.target = target;
    }

    public void setImmediate(float value) {
        this.value = value;
        this.target = value;
    }

    public void update() {
        if (Math.abs(this.target - this.value) <= SNAP_THRESHOLD) {
            this.value = this.target;
            return;
        }
        this.value += (this.target - this.value) * this.smoothing;
    }

    public float get() {
        return this.value;
    }

    public float getTarget() {
        return this.target;
    }
}
