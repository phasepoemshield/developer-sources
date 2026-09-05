/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.interval_tree;

import net.caffeinemc.mods.sodium.client.util.interval_tree.Interval;
import net.caffeinemc.mods.sodium.client.util.interval_tree.Interval$Bounded;
import net.caffeinemc.mods.sodium.client.util.interval_tree.Interval$Unbounded;

public class DoubleInterval
extends Interval<Double> {
    private static final int OFFSET = 1000;

    @Override
    protected Interval<Double> create() {
        return new DoubleInterval();
    }

    public DoubleInterval() {
    }

    public DoubleInterval(Double d, Interval.Unbounded unbounded) {
        super(0.0 + d, unbounded);
    }

    public DoubleInterval(Double d, Double d2, Interval.Bounded bounded) {
        super(0.0 + d, 0.0 + d2, bounded);
    }

    @Override
    public boolean isEmpty() {
        if (this.getStart() != null && ((Double)this.getStart()).isNaN()) {
            return true;
        }
        if (this.getEnd() != null && ((Double)this.getEnd()).isNaN()) {
            return true;
        }
        if (this.getStart() != null && this.getEnd() != null) {
            if ((Double)this.getStart() == Double.POSITIVE_INFINITY && (Double)this.getEnd() == Double.POSITIVE_INFINITY) {
                return true;
            }
            if ((Double)this.getStart() == Double.NEGATIVE_INFINITY && (Double)this.getEnd() == Double.NEGATIVE_INFINITY) {
                return true;
            }
        }
        return super.isEmpty();
    }

    @Override
    public Double getMidpoint() {
        if (this.isEmpty()) {
            return null;
        }
        if (this.getStart() == null && this.getEnd() == null) {
            return 0.0;
        }
        if (this.getStart() == null) {
            return (Double)this.getEnd() - 1000.0;
        }
        if (this.getEnd() == null) {
            return (Double)this.getStart() + 1000.0;
        }
        if ((Double)this.getStart() == Double.NEGATIVE_INFINITY && (Double)this.getEnd() == Double.POSITIVE_INFINITY) {
            return 0.0;
        }
        if ((Double)this.getStart() == Double.NEGATIVE_INFINITY) {
            return (Double)this.getEnd() - 1000.0;
        }
        if ((Double)this.getEnd() == Double.POSITIVE_INFINITY) {
            return (Double)this.getStart() + 1000.0;
        }
        return (Double)this.getStart() + ((Double)this.getEnd() - (Double)this.getStart()) / 2.0;
    }
}

