/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07185
 */
package baritone.api.schematic.mask.shape;

import baritone.api.schematic.mask.AbstractMask;
import baritone.api.schematic.mask.StaticMask;
import minecraft.class07185;

public final class CylinderMask
extends AbstractMask
implements StaticMask {
    private final double centerA;
    private final double centerB;
    private final double radiusSqA;
    private final double radiusSqB;
    private final boolean filled;
    private final class07185 alignment;

    public CylinderMask(int n, int n2, int n3, boolean bl, class07185 class071852) {
        super(n, n2, n3);
        this.centerA = (double)CylinderMask.getA(n, n2, class071852) / 2.0;
        this.centerB = (double)CylinderMask.getB(n2, n3, class071852) / 2.0;
        this.radiusSqA = (this.centerA - 1.0) * (this.centerA - 1.0);
        this.radiusSqB = (this.centerB - 1.0) * (this.centerB - 1.0);
        this.filled = bl;
        this.alignment = class071852;
    }

    private static int getA(int n, int n2, class07185 class071852) {
        return class071852 == class07185.field_11048 ? n2 : n;
    }

    private static int getB(int n, int n2, class07185 class071852) {
        return class071852 == class07185.field_11051 ? n : n2;
    }

    private boolean outside(double d, double d2) {
        return d * d / this.radiusSqA + d2 * d2 / this.radiusSqB > 1.0;
    }

    @Override
    public boolean partOfMask(int n, int n2, int n3) {
        double d = Math.abs((double)CylinderMask.getA(n, n2, this.alignment) + 0.5 - this.centerA);
        double d2 = Math.abs((double)CylinderMask.getB(n2, n3, this.alignment) + 0.5 - this.centerB);
        if (this.outside(d, d2)) {
            return false;
        }
        return this.filled || this.outside(d + 1.0, d2) || this.outside(d, d2 + 1.0);
    }
}

