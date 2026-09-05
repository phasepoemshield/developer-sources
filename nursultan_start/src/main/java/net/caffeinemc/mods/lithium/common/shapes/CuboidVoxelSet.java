/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07185
 *  minecraft.class07739
 */
package net.caffeinemc.mods.lithium.common.shapes;

import minecraft.class07185;
import minecraft.class07739;

public class CuboidVoxelSet
extends class07739 {
    private final int minX;
    private final int minY;
    private final int minZ;
    private final int maxX;
    private final int maxY;
    private final int maxZ;

    protected CuboidVoxelSet(int n, int n2, int n3, double d, double d2, double d3, double d4, double d5, double d6) {
        super(n, n2, n3);
        this.minX = (int)Math.round(d * (double)n);
        this.maxX = (int)Math.round(d4 * (double)n);
        this.minY = (int)Math.round(d2 * (double)n2);
        this.maxY = (int)Math.round(d5 * (double)n2);
        this.minZ = (int)Math.round(d3 * (double)n3);
        this.maxZ = (int)Math.round(d6 * (double)n3);
    }

    public int method_1045(class07185 class071852) {
        return class071852.N(this.maxX, this.maxY, this.maxZ);
    }

    public boolean method_1056() {
        return this.minX >= this.maxX || this.minY >= this.maxY || this.minZ >= this.maxZ;
    }

    public int method_1055(class07185 class071852) {
        return class071852.N(this.minX, this.minY, this.minZ);
    }

    public boolean method_1063(int n, int n2, int n3) {
        return n >= this.minX && n < this.maxX && n2 >= this.minY && n2 < this.maxY && n3 >= this.minZ && n3 < this.maxZ;
    }

    public void method_1049(int n, int n2, int n3) {
        throw new UnsupportedOperationException();
    }
}

