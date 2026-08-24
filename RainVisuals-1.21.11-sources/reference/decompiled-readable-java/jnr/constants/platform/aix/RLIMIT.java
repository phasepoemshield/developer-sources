/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class RLIMIT
extends Enum<RLIMIT>
implements Constant {
    public static final long MAX_VALUE = 9L;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ RLIMIT RLIMIT_AS = new RLIMIT(6L);
    public static final /* enum */ RLIMIT RLIMIT_NPROC;
    private static final /* synthetic */ RLIMIT[] $VALUES;
    public static final /* enum */ RLIMIT RLIMIT_CORE;
    public static final /* enum */ RLIMIT RLIMIT_DATA;
    public static final /* enum */ RLIMIT RLIMIT_NOFILE;
    public static final /* enum */ RLIMIT RLIMIT_RSS;
    public static final /* enum */ RLIMIT RLIMIT_FSIZE;
    public static final /* enum */ RLIMIT RLIMIT_STACK;
    public static final /* enum */ RLIMIT RLIMIT_CPU;
    private final long value;

    @Override
    public final long longValue() {
        return this.value;
    }

    static {
        RLIMIT_CORE = new RLIMIT(4L);
        RLIMIT_CPU = new RLIMIT(0L);
        RLIMIT_DATA = new RLIMIT(2L);
        RLIMIT_FSIZE = new RLIMIT(1L);
        RLIMIT_NOFILE = new RLIMIT(7L);
        RLIMIT_NPROC = new RLIMIT(9L);
        RLIMIT_RSS = new RLIMIT(5L);
        RLIMIT_STACK = new RLIMIT(3L);
        RLIMIT[] rLIMITArray = new RLIMIT[9];
        rLIMITArray[0] = RLIMIT_AS;
        rLIMITArray[1] = RLIMIT_CORE;
        rLIMITArray[2] = RLIMIT_CPU;
        rLIMITArray[3] = RLIMIT_DATA;
        rLIMITArray[4] = RLIMIT_FSIZE;
        rLIMITArray[5] = RLIMIT_NOFILE;
        rLIMITArray[6] = RLIMIT_NPROC;
        rLIMITArray[7] = RLIMIT_RSS;
        rLIMITArray[8] = RLIMIT_STACK;
        $VALUES = rLIMITArray;
    }

    private RLIMIT(long value) {
        this.value = value;
    }

    public static RLIMIT valueOf(String name) {
        return Enum.valueOf(RLIMIT.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static RLIMIT[] values() {
        return (RLIMIT[])$VALUES.clone();
    }
}

