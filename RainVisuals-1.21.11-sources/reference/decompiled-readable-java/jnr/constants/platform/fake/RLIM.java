/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class RLIM
extends Enum<RLIM>
implements Constant {
    public static final /* enum */ RLIM RLIM_INFINITY;
    public static final /* enum */ RLIM RLIM_NLIMITS;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ RLIM RLIM_SAVED_MAX;
    public static final long MAX_VALUE = 4L;
    private final long value;
    public static final /* enum */ RLIM RLIM_SAVED_CUR;
    private static final /* synthetic */ RLIM[] $VALUES;

    public static RLIM[] values() {
        return (RLIM[])$VALUES.clone();
    }

    static {
        RLIM_NLIMITS = new RLIM(1L);
        RLIM_INFINITY = new RLIM(2L);
        RLIM_SAVED_MAX = new RLIM(3L);
        RLIM_SAVED_CUR = new RLIM(4L);
        RLIM[] rLIMArray = new RLIM[4];
        rLIMArray[0] = RLIM_NLIMITS;
        rLIMArray[1] = RLIM_INFINITY;
        rLIMArray[2] = RLIM_SAVED_MAX;
        rLIMArray[3] = RLIM_SAVED_CUR;
        $VALUES = rLIMArray;
    }

    private RLIM(long value) {
        this.value = value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static RLIM valueOf(String name) {
        return Enum.valueOf(RLIM.class, name);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }
}

