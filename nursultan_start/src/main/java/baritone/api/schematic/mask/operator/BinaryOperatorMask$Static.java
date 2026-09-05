/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.schematic.mask.operator;

import baritone.api.schematic.mask.AbstractMask;
import baritone.api.schematic.mask.StaticMask;
import baritone.api.utils.BooleanBinaryOperator;

public final class BinaryOperatorMask$Static
extends AbstractMask
implements StaticMask {
    private final StaticMask a;
    private final StaticMask b;
    private final BooleanBinaryOperator operator;

    public BinaryOperatorMask$Static(StaticMask staticMask, StaticMask staticMask2, BooleanBinaryOperator booleanBinaryOperator) {
        super(Math.max(staticMask.widthX(), staticMask2.widthX()), Math.max(staticMask.heightY(), staticMask2.heightY()), Math.max(staticMask.lengthZ(), staticMask2.lengthZ()));
        this.a = staticMask;
        this.b = staticMask2;
        this.operator = booleanBinaryOperator;
    }

    @Override
    public boolean partOfMask(int n, int n2, int n3) {
        return this.operator.applyAsBoolean(BinaryOperatorMask$Static.partOfMask(this.a, n, n2, n3), BinaryOperatorMask$Static.partOfMask(this.b, n, n2, n3));
    }

    private static boolean partOfMask(StaticMask staticMask, int n, int n2, int n3) {
        return n < staticMask.widthX() && n2 < staticMask.heightY() && n3 < staticMask.lengthZ() && staticMask.partOfMask(n, n2, n3);
    }
}

