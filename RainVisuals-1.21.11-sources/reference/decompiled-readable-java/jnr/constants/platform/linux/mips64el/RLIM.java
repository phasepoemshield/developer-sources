/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.mips64el;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class RLIM
extends Enum<RLIM>
implements Constant {
    public static final long MIN_VALUE = 16L;
    public static final long MAX_VALUE = -1L;
    private static final /* synthetic */ RLIM[] $VALUES;
    public static final /* enum */ RLIM RLIM_INFINITY;
    public static final /* enum */ RLIM RLIM_SAVED_CUR;
    public static final /* enum */ RLIM RLIM_SAVED_MAX;
    public static final /* enum */ RLIM RLIM_NLIMITS;
    private final long value;

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

    public static RLIM[] values() {
        return (RLIM[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static {
        RLIM_NLIMITS = new RLIM(16L);
        RLIM_INFINITY = new RLIM(-1L);
        RLIM_SAVED_MAX = new RLIM(-1L);
        RLIM_SAVED_CUR = new RLIM(-1L);
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

    private RLIM(long value) {
        this.value = value;
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

