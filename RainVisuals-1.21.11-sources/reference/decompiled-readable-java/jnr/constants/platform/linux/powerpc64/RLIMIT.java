/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.powerpc64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class RLIMIT
extends Enum<RLIMIT>
implements Constant {
    public static final /* enum */ RLIMIT RLIMIT_SIGPENDING;
    public static final /* enum */ RLIMIT RLIMIT_OFILE;
    public static final /* enum */ RLIMIT RLIMIT_MSGQUEUE;
    public static final long MAX_VALUE = 16L;
    public static final /* enum */ RLIMIT RLIMIT_CPU;
    public static final /* enum */ RLIMIT RLIMIT_NICE;
    public static final /* enum */ RLIMIT RLIMIT_FSIZE;
    private final long value;
    public static final /* enum */ RLIMIT RLIMIT_MEMLOCK;
    public static final /* enum */ RLIMIT RLIMIT_DATA;
    public static final /* enum */ RLIMIT RLIMIT_RTPRIO;
    public static final /* enum */ RLIMIT RLIMIT_NPROC;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ RLIMIT RLIMIT_STACK;
    public static final /* enum */ RLIMIT RLIMIT_LOCKS;
    private static final /* synthetic */ RLIMIT[] $VALUES;
    public static final /* enum */ RLIMIT RLIMIT_CORE;
    public static final /* enum */ RLIMIT RLIMIT_RTTIME;
    public static final /* enum */ RLIMIT RLIMIT_RSS;
    public static final /* enum */ RLIMIT RLIMIT_NOFILE;
    public static final /* enum */ RLIMIT RLIMIT_NLIMITS;
    public static final /* enum */ RLIMIT RLIMIT_AS;

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        RLIMIT_AS = new RLIMIT(9L);
        RLIMIT_CORE = new RLIMIT(4L);
        RLIMIT_CPU = new RLIMIT(0L);
        RLIMIT_DATA = new RLIMIT(2L);
        RLIMIT_FSIZE = new RLIMIT(1L);
        RLIMIT_LOCKS = new RLIMIT(10L);
        RLIMIT_MEMLOCK = new RLIMIT(8L);
        RLIMIT_MSGQUEUE = new RLIMIT(12L);
        RLIMIT_NICE = new RLIMIT(13L);
        RLIMIT_NLIMITS = new RLIMIT(16L);
        RLIMIT_NOFILE = new RLIMIT(7L);
        RLIMIT_NPROC = new RLIMIT(6L);
        RLIMIT_OFILE = new RLIMIT(7L);
        RLIMIT_RSS = new RLIMIT(5L);
        RLIMIT_RTPRIO = new RLIMIT(14L);
        RLIMIT_RTTIME = new RLIMIT(15L);
        RLIMIT_SIGPENDING = new RLIMIT(11L);
        RLIMIT_STACK = new RLIMIT(3L);
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

    public static RLIMIT[] values() {
        return (RLIMIT[])$VALUES.clone();
    }

    public static RLIMIT valueOf(String name) {
        return Enum.valueOf(RLIMIT.class, name);
    }

    static final class StringTable {
        public static final Map<RLIMIT, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<RLIMIT, String> generateTable() {
            EnumMap<RLIMIT, String> map = new EnumMap<RLIMIT, String>(RLIMIT.class);
            map.put(RLIMIT_AS, "RLIMIT_AS");
            map.put(RLIMIT_CORE, "RLIMIT_CORE");
            map.put(RLIMIT_CPU, "RLIMIT_CPU");
            map.put(RLIMIT_DATA, "RLIMIT_DATA");
            map.put(RLIMIT_FSIZE, "RLIMIT_FSIZE");
            map.put(RLIMIT_LOCKS, "RLIMIT_LOCKS");
            map.put(RLIMIT_MEMLOCK, "RLIMIT_MEMLOCK");
            map.put(RLIMIT_MSGQUEUE, "RLIMIT_MSGQUEUE");
            map.put(RLIMIT_NICE, "RLIMIT_NICE");
            map.put(RLIMIT_NLIMITS, "RLIMIT_NLIMITS");
            map.put(RLIMIT_NOFILE, "RLIMIT_NOFILE");
            map.put(RLIMIT_NPROC, "RLIMIT_NPROC");
            map.put(RLIMIT_OFILE, "RLIMIT_OFILE");
            map.put(RLIMIT_RSS, "RLIMIT_RSS");
            map.put(RLIMIT_RTPRIO, "RLIMIT_RTPRIO");
            map.put(RLIMIT_RTTIME, "RLIMIT_RTTIME");
            map.put(RLIMIT_SIGPENDING, "RLIMIT_SIGPENDING");
            map.put(RLIMIT_STACK, "RLIMIT_STACK");
            return map;
        }
    }
}

