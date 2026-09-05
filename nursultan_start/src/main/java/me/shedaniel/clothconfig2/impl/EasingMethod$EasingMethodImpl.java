/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.clothconfig2.impl;

import java.util.function.Function;
import me.shedaniel.clothconfig2.impl.EasingMethod;

public enum EasingMethod$EasingMethodImpl implements EasingMethod
{
    NONE(d -> 1.0),
    LINEAR(d -> d),
    EXPO(d -> d == 1.0 ? 1.0 : 1.0 * (-Math.pow(2.0, -10.0 * d) + 1.0)),
    QUAD(d -> {
        d = d / 1.0;
        return -1.0 * d * (d - 2.0);
    }),
    QUART(d -> {
        double d2;
        if (d == 1.0) {
            d2 = 1.0;
        } else {
            d = d - 1.0;
            d2 = 1.0 * (-1.0 * (d * d * d * d - 1.0));
        }
        return d2;
    }),
    SINE(d -> Math.sin(d * 1.5707963267948966)),
    CUBIC(d -> {
        d = d - 1.0;
        return d * d * d + 1.0;
    }),
    QUINTIC(d -> {
        d = d - 1.0;
        return d * d * d * d * d + 1.0;
    }),
    CIRC(d -> {
        d = d - 1.0;
        return Math.sqrt(1.0 - d * d);
    });

    private final Function<Double, Double> function;

    private EasingMethod$EasingMethodImpl(Function<Double, Double> function) {
        this.function = function;
    }

    public String toString() {
        return this.name();
    }

    @Override
    public double apply(double d) {
        return this.function.apply(d);
    }
}

