/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd;

import jnr.constants.Constant;

public enum UDP implements Constant
{

    public static final long MAX_VALUE = 0L;
    private final long value;
    public static final long MIN_VALUE = 0L;

    @Override
    public final long longValue() {
        return this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    private UDP(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }
}

