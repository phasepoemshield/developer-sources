package fun.nexisdlc.client.utils.render.animations.impl;

public class SmoothValue {
    private double currentValue;
    private double targetValue;
    private final double smoothingFactor;

    public SmoothValue(double initialValue, double smoothingFactor) {
        this.currentValue = initialValue;
        this.targetValue = initialValue;
        this.smoothingFactor = smoothingFactor;
    }

    public void setValue(double targetValue) {
        this.targetValue = targetValue;
    }

    public double getValue() {
        if (Math.abs(targetValue - currentValue) > 0.001) {
            currentValue += (targetValue - currentValue) * smoothingFactor;
        } else {
            currentValue = targetValue;
        }
        return currentValue;
    }

    public boolean isDone() {
        return Math.abs(targetValue - currentValue) < 0.001;
    }
}