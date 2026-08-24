/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.dragonflybsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class RLIM
extends Enum<RLIM>
implements Constant {
    public static final /* enum */ RLIM RLIM_SAVED_MAX;
    public static final long MIN_VALUE = 12L;
    public static final /* enum */ RLIM RLIM_INFINITY;
    public static final /* enum */ RLIM RLIM_SAVED_CUR;
    private static final /* synthetic */ RLIM[] $VALUES;
    public static final long MAX_VALUE = Long.MAX_VALUE;
    private final long value;
    public static final /* enum */ RLIM RLIM_NLIMITS;

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static RLIM[] values() {
        return (RLIM[])$VALUES.clone();
    }

    static {
        RLIM_NLIMITS = new RLIM(12L);
        RLIM_INFINITY = new RLIM(Long.MAX_VALUE);
        RLIM_SAVED_MAX = new RLIM(Long.MAX_VALUE);
        RLIM_SAVED_CUR = new RLIM(Long.MAX_VALUE);
        RLIM[] rLIMArray = new RLIM[4];
        rLIMArray[0] = RLIM_NLIMITS;
        rLIMArray[1] = RLIM_INFINITY;
        rLIMArray[2] = RLIM_SAVED_MAX;
        rLIMArray[3] = RLIM_SAVED_CUR;
        $VALUES = rLIMArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static RLIM valueOf(String name) {
        return Enum.valueOf(RLIM.class, name);
    }

    private RLIM(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    static final class StringTable {
        public static final Map<RLIM, String> descriptions = StringTable.generateTable();

        public static final Map<RLIM, String> generateTable() {
            EnumMap<RLIM, String> map = new EnumMap<RLIM, String>(RLIM.class);
            map.put(RLIM_NLIMITS, "RLIM_NLIMITS");
            map.put(RLIM_INFINITY, "RLIM_INFINITY");
            map.put(RLIM_SAVED_MAX, "RLIM_SAVED_MAX");
            map.put(RLIM_SAVED_CUR, "RLIM_SAVED_CUR");
            return map;
        }

        StringTable() {
        }
    }
}

