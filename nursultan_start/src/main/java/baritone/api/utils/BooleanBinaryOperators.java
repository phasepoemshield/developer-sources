/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.utils;

import baritone.api.utils.BooleanBinaryOperator;

public enum BooleanBinaryOperators implements BooleanBinaryOperator
{
    OR((bl, bl2) -> bl || bl2),
    AND((bl, bl2) -> bl && bl2),
    XOR((bl, bl2) -> bl ^ bl2);

    private final BooleanBinaryOperator op;

    private BooleanBinaryOperators(BooleanBinaryOperator booleanBinaryOperator) {
        this.op = booleanBinaryOperator;
    }

    @Override
    public boolean applyAsBoolean(boolean bl, boolean bl2) {
        return this.op.applyAsBoolean(bl, bl2);
    }
}

