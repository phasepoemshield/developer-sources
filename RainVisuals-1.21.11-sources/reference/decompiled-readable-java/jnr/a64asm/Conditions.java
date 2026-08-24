/*
 * Decompiled with CFR 0.152.
 */
package jnr.a64asm;

import jnr.a64asm.Operand;

public final class Conditions
extends Operand {
    private final int value;

    public long value() {
        return this.value;
    }

    public Conditions(int value) {
        super(7, 0);
        this.value = value;
    }
}

