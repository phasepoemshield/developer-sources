package fun.nexisdlc.client.utils.render.animations.impl;

import fun.nexisdlc.client.utils.render.animations.EasingFunction;
import fun.nexisdlc.client.utils.render.animations.Easings;

public class SimpleLinearAnimation {

    float target = 0f;
    float startValue = 0f;
    float currentValue = 0f;
    long startTime = 0;
    int DURATION_MS;

    private EasingFunction easing = Easings.EASE_OUT_CUBIC;

    public SimpleLinearAnimation(int duration) {
        this.DURATION_MS = duration;
    }

    public SimpleLinearAnimation(long duration, EasingFunction easing) {
        this.DURATION_MS = (int) duration;
        this.easing = easing;
    }

    public SimpleLinearAnimation() {
        this.DURATION_MS = 250;
    }

    public void setDuration(int duration) {
        this.DURATION_MS = Math.max(1, duration);
    }

    public void setEasing(EasingFunction easing) {
        if (easing != null) {
            this.easing = easing;
        }
    }

    public float getTarget() {
        return target;
    }

    public void show() {
        if (target == 255f) return;
        updateCurrentValue();
        this.startValue = this.currentValue;
        this.target = 255f;
        this.startTime = System.currentTimeMillis();
    }

    public void hide() {
        if (target == 0f) return;
        updateCurrentValue();
        this.startValue = this.currentValue;
        this.target = 0f;
        this.startTime = System.currentTimeMillis();
    }

    public void setImmediate(boolean visible) {
        this.target = visible ? 255f : 0f;
        this.startValue = this.target;
        this.currentValue = this.target;
        this.startTime = System.currentTimeMillis() - DURATION_MS - 1L;
    }

    public int get() {
        updateCurrentValue();
        return Math.round(currentValue);
    }

    public float getProgress() {
        updateCurrentValue();
        return currentValue / 255f;
    }

    public boolean isFinished() {
        long now = System.currentTimeMillis();
        return (now - startTime) >= DURATION_MS;
    }

    public boolean isAnimating() {
        return !isFinished() || currentValue != target;
    }

    private void updateCurrentValue() {
        long now = System.currentTimeMillis();
        long elapsed = now - startTime;

        if (elapsed <= 0) {
            currentValue = startValue;
            return;
        }

        if (elapsed >= DURATION_MS) {
            currentValue = startValue + (target - startValue) * easing.ease(1f);
            return;
        }

        float t = elapsed / (float) DURATION_MS;
        float eased = easing.ease(t);
        currentValue = startValue + (target - startValue) * eased;
    }
}
