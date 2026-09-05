/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline;

import it.unimi.dsi.fastutil.Hash;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.ShapeComparisonCache$ShapeComparison;

public class ShapeComparisonCache$ShapeComparison$ShapeComparisonStrategy
implements Hash.Strategy<ShapeComparisonCache$ShapeComparison> {
    public static final ShapeComparisonCache$ShapeComparison$ShapeComparisonStrategy INSTANCE = new ShapeComparisonCache$ShapeComparison$ShapeComparisonStrategy();

    private ShapeComparisonCache$ShapeComparison$ShapeComparisonStrategy() {
    }

    public boolean equals(ShapeComparisonCache$ShapeComparison shapeComparisonCache$ShapeComparison, ShapeComparisonCache$ShapeComparison shapeComparisonCache$ShapeComparison2) {
        if (shapeComparisonCache$ShapeComparison == shapeComparisonCache$ShapeComparison2) {
            return true;
        }
        if (shapeComparisonCache$ShapeComparison == null || shapeComparisonCache$ShapeComparison2 == null) {
            return false;
        }
        return shapeComparisonCache$ShapeComparison.self == shapeComparisonCache$ShapeComparison2.self && shapeComparisonCache$ShapeComparison.other == shapeComparisonCache$ShapeComparison2.other && shapeComparisonCache$ShapeComparison.constraint == shapeComparisonCache$ShapeComparison2.constraint;
    }

    public int hashCode(ShapeComparisonCache$ShapeComparison shapeComparisonCache$ShapeComparison) {
        int n = System.identityHashCode(shapeComparisonCache$ShapeComparison.self);
        n = 31 * n + System.identityHashCode(shapeComparisonCache$ShapeComparison.other);
        n = 31 * n + System.identityHashCode(shapeComparisonCache$ShapeComparison.constraint);
        return n;
    }
}

