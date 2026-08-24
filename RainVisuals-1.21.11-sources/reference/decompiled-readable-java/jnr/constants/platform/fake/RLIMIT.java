/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class RLIMIT
extends Enum<RLIMIT>
implements Constant {
    public static final /* enum */ RLIMIT RLIMIT_NPROC;
    public static final /* enum */ RLIMIT RLIMIT_MEMLOCK;
    public static final /* enum */ RLIMIT RLIMIT_CORE;
    public static final /* enum */ RLIMIT RLIMIT_RTPRIO;
    public static final /* enum */ RLIMIT RLIMIT_MSGQUEUE;
    public static final /* enum */ RLIMIT RLIMIT_OFILE;
    private static final /* synthetic */ RLIMIT[] $VALUES;
    public static final /* enum */ RLIMIT RLIMIT_NOFILE;
    public static final /* enum */ RLIMIT RLIMIT_NICE;
    public static final long MAX_VALUE = 18L;
    public static final /* enum */ RLIMIT RLIMIT_RSS;
    public static final /* enum */ RLIMIT RLIMIT_CPU;
    public static final /* enum */ RLIMIT RLIMIT_DATA;
    public static final /* enum */ RLIMIT RLIMIT_LOCKS;
    public static final /* enum */ RLIMIT RLIMIT_RTTIME;
    public static final /* enum */ RLIMIT RLIMIT_SIGPENDING;
    public static final /* enum */ RLIMIT RLIMIT_STACK;
    public static final /* enum */ RLIMIT RLIMIT_AS;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ RLIMIT RLIMIT_NLIMITS;
    public static final /* enum */ RLIMIT RLIMIT_FSIZE;
    private final long value;

    static {
        RLIMIT_AS = new RLIMIT(1L);
        RLIMIT_CORE = new RLIMIT(2L);
        RLIMIT_CPU = new RLIMIT(3L);
        RLIMIT_DATA = new RLIMIT(4L);
        RLIMIT_FSIZE = new RLIMIT(5L);
        RLIMIT_LOCKS = new RLIMIT(6L);
        RLIMIT_MEMLOCK = new RLIMIT(7L);
        RLIMIT_MSGQUEUE = new RLIMIT(8L);
        RLIMIT_NICE = new RLIMIT(9L);
        RLIMIT_NLIMITS = new RLIMIT(10L);
        RLIMIT_NOFILE = new RLIMIT(11L);
        RLIMIT_NPROC = new RLIMIT(12L);
        RLIMIT_OFILE = new RLIMIT(13L);
        RLIMIT_RSS = new RLIMIT(14L);
        RLIMIT_RTPRIO = new RLIMIT(15L);
        RLIMIT_RTTIME = new RLIMIT(16L);
        RLIMIT_SIGPENDING = new RLIMIT(17L);
        RLIMIT_STACK = new RLIMIT(18L);
        RLIMIT[] rLIMITArray = new RLIMIT[18];
        rLIMITArray[0] = RLIMIT_AS;
        rLIMITArray[1] = RLIMIT_CORE;
        rLIMITArray[2] = RLIMIT_CPU;
        rLIMITArray[3] = RLIMIT_DATA;
        rLIMITArray[4] = RLIMIT_FSIZE;
        rLIMITArray[5] = RLIMIT_LOCKS;
        rLIMITArray[6] = RLIMIT_MEMLOCK;
        rLIMITArray[7] = RLIMIT_MSGQUEUE;
        rLIMITArray[8] = RLIMIT_NICE;
        rLIMITArray[9] = RLIMIT_NLIMITS;
        rLIMITArray[10] = RLIMIT_NOFILE;
        rLIMITArray[11] = RLIMIT_NPROC;
        rLIMITArray[12] = RLIMIT_OFILE;
        rLIMITArray[13] = RLIMIT_RSS;
        rLIMITArray[14] = RLIMIT_RTPRIO;
        rLIMITArray[15] = RLIMIT_RTTIME;
        rLIMITArray[16] = RLIMIT_SIGPENDING;
        rLIMITArray[17] = RLIMIT_STACK;
        $VALUES = rLIMITArray;
    }

    private RLIMIT(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static RLIMIT valueOf(String name) {
        return Enum.valueOf(RLIMIT.class, name);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final int value() {
        return (int)this.value;
    }

    public static RLIMIT[] values() {
        return (RLIMIT[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }
}

