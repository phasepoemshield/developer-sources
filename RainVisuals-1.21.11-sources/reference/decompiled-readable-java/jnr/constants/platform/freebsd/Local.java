/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Local
extends Enum<Local>
implements Constant {
    public static final /* enum */ Local LOCAL_CREDS;
    public static final /* enum */ Local LOCAL_PEERCRED;
    private final long value;
    public static final long MAX_VALUE = 4L;
    private static final /* synthetic */ Local[] $VALUES;
    public static final /* enum */ Local LOCAL_CONNWAIT;
    public static final long MIN_VALUE = 1L;

    public static Local[] values() {
        return (Local[])$VALUES.clone();
    }

    static {
        LOCAL_PEERCRED = new Local(1L);
        LOCAL_CREDS = new Local(2L);
        LOCAL_CONNWAIT = new Local(4L);
        Local[] localArray = new Local[3];
        localArray[0] = LOCAL_PEERCRED;
        localArray[1] = LOCAL_CREDS;
        localArray[2] = LOCAL_CONNWAIT;
        $VALUES = localArray;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private Local(long value) {
        this.value = value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static Local valueOf(String name) {
        return Enum.valueOf(Local.class, name);
    }

    static final class StringTable {
        public static final Map<Local, String> descriptions = StringTable.generateTable();

        public static final Map<Local, String> generateTable() {
            EnumMap<Local, String> map = new EnumMap<Local, String>(Local.class);
            map.put(LOCAL_PEERCRED, "LOCAL_PEERCRED");
            map.put(LOCAL_CREDS, "LOCAL_CREDS");
            map.put(LOCAL_CONNWAIT, "LOCAL_CONNWAIT");
            return map;
        }

        StringTable() {
        }
    }
}

