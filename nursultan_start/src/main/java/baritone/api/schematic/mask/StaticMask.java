/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 */
package baritone.api.schematic.mask;

import baritone.api.schematic.mask.Mask;
import baritone.api.schematic.mask.PreComputedMask;
import baritone.api.schematic.mask.operator.BinaryOperatorMask$Static;
import baritone.api.schematic.mask.operator.NotMask$Static;
import baritone.api.utils.BooleanBinaryOperators;
import minecraft.class00500;

public interface StaticMask
extends Mask {
    default public StaticMask union(StaticMask staticMask) {
        return new BinaryOperatorMask$Static(this, staticMask, BooleanBinaryOperators.OR);
    }

    default public StaticMask compute() {
        return new PreComputedMask(this);
    }

    @Override
    default public StaticMask not() {
        return new NotMask$Static(this);
    }

    default public StaticMask xor(StaticMask staticMask) {
        return new BinaryOperatorMask$Static(this, staticMask, BooleanBinaryOperators.XOR);
    }

    default public StaticMask intersection(StaticMask staticMask) {
        return new BinaryOperatorMask$Static(this, staticMask, BooleanBinaryOperators.AND);
    }

    @Override
    default public boolean partOfMask(int n, int n2, int n3, class00500 class005002) {
        return this.partOfMask(n, n2, n3);
    }

    public boolean partOfMask(int var1, int var2, int var3);
}

