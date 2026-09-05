/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.schematic.mask.shape;

import baritone.api.schematic.mask.AbstractMask;
import baritone.api.schematic.mask.StaticMask;

public final class SphereMask
extends AbstractMask
implements StaticMask {
    private final double centerX;
    private final double centerY;
    private final double centerZ;
    private final double radiusSqX;
    private final double radiusSqY;
    private final double radiusSqZ;
    private final boolean filled;

    public SphereMask(int n, int n2, int n3, boolean bl) {
        super(n, n2, n3);
        this.centerX = (double)n / 2.0;
        this.centerY = (double)n2 / 2.0;
        this.centerZ = (double)n3 / 2.0;
        this.radiusSqX = this.centerX * this.centerX;
        this.radiusSqY = this.centerY * this.centerY;
        this.radiusSqZ = this.centerZ * this.centerZ;
        this.filled = bl;
    }

    private boolean outside(double d, double d2, double d3) {
        return d * d / this.radiusSqX + d2 * d2 / this.radiusSqY + d3 * d3 / this.radiusSqZ > 1.0;
    }

    @Override
    public boolean partOfMask(int n, int n2, int n3) {
        double d;
        double d2;
        double d3 = Math.abs((double)n + 0.5 - this.centerX);
        if (this.outside(d3, d2 = Math.abs((double)n2 + 0.5 - this.centerY), d = Math.abs((double)n3 + 0.5 - this.centerZ))) {
            return false;
        }
        return this.filled || this.outside(d3 + 1.0, d2, d) || this.outside(d3, d2 + 1.0, d) || this.outside(d3, d2, d + 1.0);
    }
}

