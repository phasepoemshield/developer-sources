/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenCustomHashMap
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class07003
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline;

import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenCustomHashMap;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class07003;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.ShapeComparisonCache$ShapeComparison;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.ShapeComparisonCache$ShapeComparison$ShapeComparisonStrategy;

public class ShapeComparisonCache {
    private static final int CACHE_SIZE = 512;
    private static final int ENTRY_ABSENT = -1;
    private static final int ENTRY_FALSE = 0;
    private static final int ENTRY_TRUE = 1;
    private final Object2IntLinkedOpenCustomHashMap<ShapeComparisonCache$ShapeComparison> comparisonLookupTable;
    private final ShapeComparisonCache$ShapeComparison cachedComparisonObject = new ShapeComparisonCache$ShapeComparison();

    public ShapeComparisonCache() {
        this.comparisonLookupTable = new Object2IntLinkedOpenCustomHashMap(512, 0.5f, (Hash.Strategy)ShapeComparisonCache$ShapeComparison$ShapeComparisonStrategy.INSTANCE);
        this.comparisonLookupTable.defaultReturnValue(-1);
    }

    public boolean lookup(class00494 class004942, class00494 class004943, class00494 class004944) {
        ShapeComparisonCache$ShapeComparison shapeComparisonCache$ShapeComparison = this.cachedComparisonObject;
        shapeComparisonCache$ShapeComparison.self = class004942;
        shapeComparisonCache$ShapeComparison.other = class004943;
        shapeComparisonCache$ShapeComparison.constraint = class004944;
        return switch (this.comparisonLookupTable.getAndMoveToFirst((Object)shapeComparisonCache$ShapeComparison)) {
            case 0 -> false;
            case 1 -> true;
            default -> this.calculate(shapeComparisonCache$ShapeComparison);
        };
    }

    public boolean lookup(class00494 class004942, class00494 class004943) {
        return this.lookup(class004942, class004943, null);
    }

    private boolean calculate(ShapeComparisonCache$ShapeComparison shapeComparisonCache$ShapeComparison) {
        class00494 class004942 = shapeComparisonCache$ShapeComparison.self;
        if (shapeComparisonCache$ShapeComparison.constraint != null && !shapeComparisonCache$ShapeComparison.constraint.method_1110()) {
            class004942 = class00389.N((class00494)shapeComparisonCache$ShapeComparison.self, (class00494)shapeComparisonCache$ShapeComparison.constraint, (class07003)class07003.i);
        }
        boolean bl = class00389.L((class00494)class004942, (class00494)shapeComparisonCache$ShapeComparison.other, (class07003)class07003.i);
        while (this.comparisonLookupTable.size() >= 512) {
            this.comparisonLookupTable.removeLastInt();
        }
        this.comparisonLookupTable.putAndMoveToFirst((Object)shapeComparisonCache$ShapeComparison.copy(), bl ? 1 : 0);
        return bl;
    }

    public static boolean isFullShape(class00494 class004942) {
        return class004942 == class00389.y();
    }

    public static boolean isEmptyShape(class00494 class004942) {
        return class004942 == class00389.N() || class004942.method_1110();
    }
}

