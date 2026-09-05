/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 */
package baritone.api.schematic.mask;

import baritone.api.schematic.mask.operator.BinaryOperatorMask;
import baritone.api.schematic.mask.operator.NotMask;
import baritone.api.utils.BooleanBinaryOperators;
import minecraft.class00500;

public interface Mask {
    default public Mask union(Mask mask) {
        return new BinaryOperatorMask(this, mask, BooleanBinaryOperators.OR);
    }

    public int lengthZ();

    default public Mask not() {
        return new NotMask(this);
    }

    default public Mask xor(Mask mask) {
        return new BinaryOperatorMask(this, mask, BooleanBinaryOperators.XOR);
    }

    default public Mask intersection(Mask mask) {
        return new BinaryOperatorMask(this, mask, BooleanBinaryOperators.AND);
    }

    public int widthX();

    public int heightY();

    public boolean partOfMask(int var1, int var2, int var3, class00500 var4);
}

