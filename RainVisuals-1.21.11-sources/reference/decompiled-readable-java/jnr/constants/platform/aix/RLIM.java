/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class RLIM
extends Enum<RLIM>
implements Constant {
    public static final long MIN_VALUE = 10L;
    public static final /* enum */ RLIM RLIM_INFINITY;
    private final long value;
    public static final /* enum */ RLIM RLIM_SAVED_CUR;
    public static final long MAX_VALUE = Long.MAX_VALUE;
    private static final /* synthetic */ RLIM[] $VALUES;
    public static final /* enum */ RLIM RLIM_SAVED_MAX;
    public static final /* enum */ RLIM RLIM_NLIMITS;

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        RLIM_NLIMITS = new RLIM(10L);
        RLIM_INFINITY = new RLIM(Long.MAX_VALUE);
        RLIM_SAVED_MAX = new RLIM(0x7FFFFFFFFFFFFFFEL);
        RLIM_SAVED_CUR = new RLIM(0x7FFFFFFFFFFFFFFDL);
        RLIM[] rLIMArray = new RLIM[4];
        rLIMArray[0] = RLIM_NLIMITS;
        rLIMArray[1] = RLIM_INFINITY;
        rLIMArray[2] = RLIM_SAVED_MAX;
        rLIMArray[3] = RLIM_SAVED_CUR;
        $VALUES = rLIMArray;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private RLIM(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static RLIM valueOf(String name) {
        return Enum.valueOf(RLIM.class, name);
    }

    public static RLIM[] values() {
        return (RLIM[])$VALUES.clone();
    }
}

