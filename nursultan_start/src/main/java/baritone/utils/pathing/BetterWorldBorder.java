/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08057
 */
package baritone.utils.pathing;

import minecraft.class08057;

public class BetterWorldBorder {
    private final double minX;
    private final double maxX;
    private final double minZ;
    private final double maxZ;

    public BetterWorldBorder(class08057 class080572) {
        this.minX = class080572.L();
        this.maxX = class080572.i();
        this.minZ = class080572.u();
        this.maxZ = class080572.R();
    }

    public boolean canPlaceAt(int n, int n2) {
        return (double)n > this.minX && (double)(n + 1) < this.maxX && (double)n2 > this.minZ && (double)(n2 + 1) < this.maxZ;
    }

    public boolean entirelyContains(int n, int n2) {
        return (double)(n + 1) > this.minX && (double)n < this.maxX && (double)(n2 + 1) > this.minZ && (double)n2 < this.maxZ;
    }
}

