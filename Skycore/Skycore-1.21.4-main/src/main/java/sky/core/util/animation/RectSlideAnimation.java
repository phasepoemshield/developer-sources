package sky.core.util.animation;

import java.util.Objects;
import net.minecraft.util.math.MathHelper;

public final class RectSlideAnimation {
    private float x;
    private float y;
    private float width;
    private float height;
    private float fromX;
    private float fromY;
    private float fromWidth;
    private float fromHeight;
    private float targetX;
    private float targetY;
    private float targetWidth;
    private float targetHeight;
    private long startMs;
    private long durationMs = 200L;
    private boolean initialized;
    private boolean animating;
    private Object selectionKey;

    public void setSelection(Object key, float x, float y, float width, float height) {
        if (!this.initialized) {
            this.snapTo(x, y, width, height);
            this.selectionKey = key;
            this.initialized = true;
            return;
        }

        if (Objects.equals(this.selectionKey, key)) {
            this.targetX = x;
            this.targetY = y;
            this.targetWidth = width;
            this.targetHeight = height;
            if (!this.animating) {
                this.snapTo(x, y, width, height);
            }
            return;
        }

        this.selectionKey = key;
        this.fromX = this.x;
        this.fromY = this.y;
        this.fromWidth = this.width;
        this.fromHeight = this.height;
        this.targetX = x;
        this.targetY = y;
        this.targetWidth = width;
        this.targetHeight = height;
        this.startMs = System.currentTimeMillis();
        this.animating = true;
    }

    public void setDuration(long durationMs) {
        this.durationMs = Math.max(1L, durationMs);
    }

    public void update() {
        if (!this.initialized || !this.animating) {
            return;
        }

        float progress = MathHelper.clamp((System.currentTimeMillis() - this.startMs) / (float) this.durationMs, 0.0F, 1.0F);
        progress = progress * progress * (3.0F - 2.0F * progress);
        this.x = this.fromX + (this.targetX - this.fromX) * progress;
        this.y = this.fromY + (this.targetY - this.fromY) * progress;
        this.width = this.fromWidth + (this.targetWidth - this.fromWidth) * progress;
        this.height = this.fromHeight + (this.targetHeight - this.fromHeight) * progress;

        if (progress >= 1.0F) {
            this.snapTo(this.targetX, this.targetY, this.targetWidth, this.targetHeight);
            this.animating = false;
        }
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return this.height;
    }

    private void snapTo(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.fromX = x;
        this.fromY = y;
        this.fromWidth = width;
        this.fromHeight = height;
        this.targetX = x;
        this.targetY = y;
        this.targetWidth = width;
        this.targetHeight = height;
    }
}
