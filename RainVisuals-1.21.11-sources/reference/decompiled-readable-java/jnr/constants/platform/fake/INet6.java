/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class INet6
extends Enum<INet6>
implements Constant {
    public static final long MIN_VALUE = 1L;
    private static final /* synthetic */ INet6[] $VALUES;
    public static final /* enum */ INet6 INET6_ADDRSTRLEN = new INet6(1L);
    public static final long MAX_VALUE = 1L;
    private final long value;

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static INet6 valueOf(String name) {
        return Enum.valueOf(INet6.class, name);
    }

    static {
        INet6[] iNet6Array = new INet6[1];
        iNet6Array[0] = INET6_ADDRSTRLEN;
        $VALUES = iNet6Array;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static INet6[] values() {
        return (INet6[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    private INet6(long value) {
        this.value = value;
    }
}

