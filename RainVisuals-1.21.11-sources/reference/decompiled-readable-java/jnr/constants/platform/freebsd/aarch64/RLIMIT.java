/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class RLIMIT
extends Enum<RLIMIT>
implements Constant {
    public static final /* enum */ RLIMIT RLIMIT_DATA;
    public static final /* enum */ RLIMIT RLIMIT_CORE;
    public static final /* enum */ RLIMIT RLIMIT_NOFILE;
    public static final long MIN_VALUE = 0L;
    private static final /* synthetic */ RLIMIT[] $VALUES;
    public static final /* enum */ RLIMIT RLIMIT_STACK;
    public static final /* enum */ RLIMIT RLIMIT_NPROC;
    public static final /* enum */ RLIMIT RLIMIT_FSIZE;
    public static final /* enum */ RLIMIT RLIMIT_MEMLOCK;
    public static final /* enum */ RLIMIT RLIMIT_AS;
    public static final /* enum */ RLIMIT RLIMIT_RSS;
    public static final /* enum */ RLIMIT RLIMIT_CPU;
    public static final long MAX_VALUE = 10L;
    private final long value;

    public static RLIMIT valueOf(String name) {
        return Enum.valueOf(RLIMIT.class, name);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private RLIMIT(long value) {
        this.value = value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static {
        RLIMIT_AS = new RLIMIT(10L);
        RLIMIT_CORE = new RLIMIT(4L);
        RLIMIT_CPU = new RLIMIT(0L);
        RLIMIT_DATA = new RLIMIT(2L);
        RLIMIT_FSIZE = new RLIMIT(1L);
        RLIMIT_MEMLOCK = new RLIMIT(6L);
        RLIMIT_NOFILE = new RLIMIT(8L);
        RLIMIT_NPROC = new RLIMIT(7L);
        RLIMIT_RSS = new RLIMIT(5L);
        RLIMIT_STACK = new RLIMIT(3L);
        RLIMIT[] rLIMITArray = new RLIMIT[10];
        rLIMITArray[0] = RLIMIT_AS;
        rLIMITArray[1] = RLIMIT_CORE;
        rLIMITArray[2] = RLIMIT_CPU;
        rLIMITArray[3] = RLIMIT_DATA;
        rLIMITArray[4] = RLIMIT_FSIZE;
        rLIMITArray[5] = RLIMIT_MEMLOCK;
        rLIMITArray[6] = RLIMIT_NOFILE;
        rLIMITArray[7] = RLIMIT_NPROC;
        rLIMITArray[8] = RLIMIT_RSS;
        rLIMITArray[9] = RLIMIT_STACK;
        $VALUES = rLIMITArray;
    }

    public final int value() {
        return (int)this.value;
    }

    public static RLIMIT[] values() {
        return (RLIMIT[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static final class StringTable {
        public static final Map<RLIMIT, String> descriptions = StringTable.generateTable();

        public static final Map<RLIMIT, String> generateTable() {
            EnumMap<RLIMIT, String> map = new EnumMap<RLIMIT, String>(RLIMIT.class);
            map.put(RLIMIT_AS, "RLIMIT_AS");
            map.put(RLIMIT_CORE, "RLIMIT_CORE");
            map.put(RLIMIT_CPU, "RLIMIT_CPU");
            map.put(RLIMIT_DATA, "RLIMIT_DATA");
            map.put(RLIMIT_FSIZE, "RLIMIT_FSIZE");
            map.put(RLIMIT_MEMLOCK, "RLIMIT_MEMLOCK");
            map.put(RLIMIT_NOFILE, "RLIMIT_NOFILE");
            map.put(RLIMIT_NPROC, "RLIMIT_NPROC");
            map.put(RLIMIT_RSS, "RLIMIT_RSS");
            map.put(RLIMIT_STACK, "RLIMIT_STACK");
            return map;
        }

        StringTable() {
        }
    }
}

