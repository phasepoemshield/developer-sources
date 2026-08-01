package sky.core.util.animation;

public final class Animation {
    private static final long DEFAULT_DURATION_MS = 250L;

    private Phase phase = Phase.CLOSED;
    private long phaseStartMs;
    private long durationMs = DEFAULT_DURATION_MS;

    public void fadeIn() {
        this.fadeIn(DEFAULT_DURATION_MS);
    }

    public void fadeIn(long durationMs) {
        if (this.phase == Phase.OPEN || this.phase == Phase.FADING_IN) {
            return;
        }
        this.durationMs = Math.max(1L, durationMs);
        this.phase = Phase.FADING_IN;
        this.phaseStartMs = System.currentTimeMillis();
    }

    public void fadeOut() {
        this.fadeOut(DEFAULT_DURATION_MS);
    }

    public void fadeOut(long durationMs) {
        if (this.phase == Phase.CLOSED || this.phase == Phase.FADING_OUT) {
            return;
        }
        this.durationMs = Math.max(1L, durationMs);
        this.phase = Phase.FADING_OUT;
        this.phaseStartMs = System.currentTimeMillis();
    }

    public void reset() {
        this.phase = Phase.CLOSED;
    }

    public void update() {
        if (this.phase == Phase.FADING_IN && this.progress() >= 1.0F) {
            this.phase = Phase.OPEN;
        } else if (this.phase == Phase.FADING_OUT && this.progress() >= 1.0F) {
            this.phase = Phase.CLOSED;
        }
    }

    public float getAlpha() {
        return switch (this.phase) {
            case CLOSED -> 0.0F;
            case OPEN -> 1.0F;
            case FADING_IN -> smoothstep(this.progress());
            case FADING_OUT -> 1.0F - smoothstep(this.progress());
        };
    }

    public boolean isVisible() {
        return this.phase != Phase.CLOSED;
    }

    public boolean isOpen() {
        return this.phase == Phase.OPEN || this.phase == Phase.FADING_IN;
    }

    private float progress() {
        float elapsed = System.currentTimeMillis() - this.phaseStartMs;
        return Math.min(1.0F, Math.max(0.0F, elapsed / (float) this.durationMs));
    }

    private static float smoothstep(float value) {
        float t = value * value * (3.0F - 2.0F * value);
        return t * t * (3.0F - 2.0F * t);
    }

    private enum Phase {
        CLOSED,
        FADING_IN,
        OPEN,
        FADING_OUT
    }
}
