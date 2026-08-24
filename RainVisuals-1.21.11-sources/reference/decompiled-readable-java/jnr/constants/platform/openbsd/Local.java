/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.openbsd;

import jnr.constants.Constant;

public enum Local implements Constant
{

    private final long value;
    public static final long MIN_VALUE = 0L;
    public static final long MAX_VALUE = 0L;

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    private Local(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final int value() {
        return (int)this.value;
    }
}

