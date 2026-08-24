/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class PRIO
extends Enum<PRIO>
implements Constant {
    public static final /* enum */ PRIO PRIO_PROCESS;
    public static final /* enum */ PRIO PRIO_MAX;
    public static final long MAX_VALUE = 20L;
    public static final /* enum */ PRIO PRIO_USER;
    public static final /* enum */ PRIO PRIO_MIN;
    private final long value;
    public static final long MIN_VALUE = -20L;
    private static final /* synthetic */ PRIO[] $VALUES;
    public static final /* enum */ PRIO PRIO_PGRP;

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static PRIO[] values() {
        return (PRIO[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static PRIO valueOf(String name) {
        return Enum.valueOf(PRIO.class, name);
    }

    static {
        PRIO_MIN = new PRIO(-20L);
        PRIO_PROCESS = new PRIO(0L);
        PRIO_PGRP = new PRIO(1L);
        PRIO_USER = new PRIO(2L);
        PRIO_MAX = new PRIO(20L);
        PRIO[] pRIOArray = new PRIO[5];
        pRIOArray[0] = PRIO_MIN;
        pRIOArray[1] = PRIO_PROCESS;
        pRIOArray[2] = PRIO_PGRP;
        pRIOArray[3] = PRIO_USER;
        pRIOArray[4] = PRIO_MAX;
        $VALUES = pRIOArray;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private PRIO(long value) {
        this.value = value;
    }

    static final class StringTable {
        public static final Map<PRIO, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<PRIO, String> generateTable() {
            EnumMap<PRIO, String> map = new EnumMap<PRIO, String>(PRIO.class);
            map.put(PRIO_MIN, "PRIO_MIN");
            map.put(PRIO_PROCESS, "PRIO_PROCESS");
            map.put(PRIO_PGRP, "PRIO_PGRP");
            map.put(PRIO_USER, "PRIO_USER");
            map.put(PRIO_MAX, "PRIO_MAX");
            return map;
        }
    }
}

