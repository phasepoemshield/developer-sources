/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00494
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline;

import minecraft.class00494;

final class ShapeComparisonCache$ShapeComparison {
    class00494 self;
    class00494 other;
    class00494 constraint;

    ShapeComparisonCache$ShapeComparison() {
    }

    private ShapeComparisonCache$ShapeComparison(class00494 class004942, class00494 class004943, class00494 class004944) {
        this.self = class004942;
        this.other = class004943;
        this.constraint = class004944;
    }

    public ShapeComparisonCache$ShapeComparison copy() {
        return new ShapeComparisonCache$ShapeComparison(this.self, this.other, this.constraint);
    }
}

