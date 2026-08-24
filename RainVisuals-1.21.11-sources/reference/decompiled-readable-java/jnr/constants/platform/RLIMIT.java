/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class RLIMIT
extends Enum<RLIMIT>
implements Constant {
    public static final /* enum */ RLIMIT RLIMIT_MEMLOCK;
    public static final /* enum */ RLIMIT RLIMIT_RTPRIO;
    public static final /* enum */ RLIMIT RLIMIT_FSIZE;
    public static final /* enum */ RLIMIT __UNKNOWN_CONSTANT__;
    public static final /* enum */ RLIMIT RLIMIT_RTTIME;
    public static final /* enum */ RLIMIT RLIMIT_SIGPENDING;
    public static final /* enum */ RLIMIT RLIMIT_CPU;
    public static final /* enum */ RLIMIT RLIMIT_RSS;
    public static final /* enum */ RLIMIT RLIMIT_OFILE;
    public static final /* enum */ RLIMIT RLIMIT_NPROC;
    public static final /* enum */ RLIMIT RLIMIT_NICE;
    private static final /* synthetic */ RLIMIT[] $VALUES;
    public static final /* enum */ RLIMIT RLIMIT_STACK;
    public static final /* enum */ RLIMIT RLIMIT_NLIMITS;
    public static final /* enum */ RLIMIT RLIMIT_LOCKS;
    public static final /* enum */ RLIMIT RLIMIT_AS;
    public static final /* enum */ RLIMIT RLIMIT_DATA;
    public static final /* enum */ RLIMIT RLIMIT_NOFILE;
    private static final ConstantResolver<RLIMIT> resolver;
    public static final /* enum */ RLIMIT RLIMIT_CORE;
    public static final /* enum */ RLIMIT RLIMIT_MSGQUEUE;

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public final String description() {
        return resolver.description(this);
    }

    static {
        RLIMIT_AS = new RLIMIT();
        RLIMIT_CORE = new RLIMIT();
        RLIMIT_CPU = new RLIMIT();
        RLIMIT_DATA = new RLIMIT();
        RLIMIT_FSIZE = new RLIMIT();
        RLIMIT_LOCKS = new RLIMIT();
        RLIMIT_MEMLOCK = new RLIMIT();
        RLIMIT_MSGQUEUE = new RLIMIT();
        RLIMIT_NICE = new RLIMIT();
        RLIMIT_NLIMITS = new RLIMIT();
        RLIMIT_NOFILE = new RLIMIT();
        RLIMIT_NPROC = new RLIMIT();
        RLIMIT_OFILE = new RLIMIT();
        RLIMIT_RSS = new RLIMIT();
        RLIMIT_RTPRIO = new RLIMIT();
        RLIMIT_RTTIME = new RLIMIT();
        RLIMIT_SIGPENDING = new RLIMIT();
        RLIMIT_STACK = new RLIMIT();
        __UNKNOWN_CONSTANT__ = new RLIMIT();
        RLIMIT[] rLIMITArray = new RLIMIT[19];
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
        rLIMITArray[18] = __UNKNOWN_CONSTANT__;
        $VALUES = rLIMITArray;
        resolver = ConstantResolver.getResolver(RLIMIT.class, 20000, 29999);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    public static RLIMIT[] values() {
        return (RLIMIT[])$VALUES.clone();
    }

    public static RLIMIT valueOf(long value) {
        return resolver.valueOf(value);
    }

    public static RLIMIT valueOf(String name) {
        return Enum.valueOf(RLIMIT.class, name);
    }

    public final String toString() {
        return this.description();
    }
}

