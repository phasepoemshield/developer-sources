/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Local
extends Enum<Local>
implements Constant {
    private static final /* synthetic */ Local[] $VALUES;
    public static final long MAX_VALUE = 1L;
    public static final /* enum */ Local LOCAL_PEERCRED = new Local(1L);
    public static final long MIN_VALUE = 1L;
    private final long value;

    private Local(long value) {
        this.value = value;
    }

    public static Local valueOf(String name) {
        return Enum.valueOf(Local.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static {
        Local[] localArray = new Local[1];
        localArray[0] = LOCAL_PEERCRED;
        $VALUES = localArray;
    }

    public static Local[] values() {
        return (Local[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    static final class StringTable {
        public static final Map<Local, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<Local, String> generateTable() {
            EnumMap<Local, String> map = new EnumMap<Local, String>(Local.class);
            map.put(LOCAL_PEERCRED, "LOCAL_PEERCRED");
            return map;
        }
    }
}

