/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.dragonflybsd;

import jnr.constants.Constant;

public enum UDP implements Constant
{

    public static final long MAX_VALUE = 0L;
    public static final long MIN_VALUE = 0L;
    private final long value;

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    private UDP(long value) {
        this.value = value;
    }
}

