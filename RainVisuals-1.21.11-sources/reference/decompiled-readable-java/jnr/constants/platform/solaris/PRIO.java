/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class PRIO
extends Enum<PRIO>
implements Constant {
    public static final /* enum */ PRIO PRIO_PROCESS = new PRIO(0L);
    private static final /* synthetic */ PRIO[] $VALUES;
    public static final long MAX_VALUE = 2L;
    private final long value;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ PRIO PRIO_PGRP = new PRIO(1L);
    public static final /* enum */ PRIO PRIO_USER = new PRIO(2L);

    static {
        PRIO[] pRIOArray = new PRIO[3];
        pRIOArray[0] = PRIO_PROCESS;
        pRIOArray[1] = PRIO_PGRP;
        pRIOArray[2] = PRIO_USER;
        $VALUES = pRIOArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private PRIO(long value) {
        this.value = value;
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

    @Override
    public final long longValue() {
        return this.value;
    }

    public static PRIO[] values() {
        return (PRIO[])$VALUES.clone();
    }

    static final class StringTable {
        public static final Map<PRIO, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<PRIO, String> generateTable() {
            EnumMap<PRIO, String> map = new EnumMap<PRIO, String>(PRIO.class);
            map.put(PRIO_PROCESS, "PRIO_PROCESS");
            map.put(PRIO_PGRP, "PRIO_PGRP");
            map.put(PRIO_USER, "PRIO_USER");
            return map;
        }
    }
}

