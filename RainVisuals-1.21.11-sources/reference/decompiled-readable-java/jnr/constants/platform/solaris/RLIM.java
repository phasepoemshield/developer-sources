/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class RLIM
extends Enum<RLIM>
implements Constant {
    private final long value;
    public static final long MIN_VALUE = 7L;
    public static final /* enum */ RLIM RLIM_INFINITY;
    public static final /* enum */ RLIM RLIM_SAVED_CUR;
    public static final /* enum */ RLIM RLIM_SAVED_MAX;
    public static final long MAX_VALUE = -1L;
    public static final /* enum */ RLIM RLIM_NLIMITS;
    private static final /* synthetic */ RLIM[] $VALUES;

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static RLIM[] values() {
        return (RLIM[])$VALUES.clone();
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

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        RLIM_NLIMITS = new RLIM(7L);
        RLIM_INFINITY = new RLIM(-3L);
        RLIM_SAVED_MAX = new RLIM(-2L);
        RLIM_SAVED_CUR = new RLIM(-1L);
        RLIM[] rLIMArray = new RLIM[4];
        rLIMArray[0] = RLIM_NLIMITS;
        rLIMArray[1] = RLIM_INFINITY;
        rLIMArray[2] = RLIM_SAVED_MAX;
        rLIMArray[3] = RLIM_SAVED_CUR;
        $VALUES = rLIMArray;
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

