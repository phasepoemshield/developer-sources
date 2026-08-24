/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.s390x;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class UDP
extends Enum<UDP>
implements Constant {
    public static final long MAX_VALUE = 1L;
    public static final /* enum */ UDP UDP_CORK = new UDP(1L);
    public static final long MIN_VALUE = 1L;
    private static final /* synthetic */ UDP[] $VALUES;
    private final long value;

    static {
        UDP[] uDPArray = new UDP[1];
        uDPArray[0] = UDP_CORK;
        $VALUES = uDPArray;
    }

    private UDP(long value) {
        this.value = value;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static UDP[] values() {
        return (UDP[])$VALUES.clone();
    }

    public static UDP valueOf(String name) {
        return Enum.valueOf(UDP.class, name);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static final class StringTable {
        public static final Map<UDP, String> descriptions = StringTable.generateTable();

        public static final Map<UDP, String> generateTable() {
            EnumMap<UDP, String> map = new EnumMap<UDP, String>(UDP.class);
            map.put(UDP_CORK, "UDP_CORK");
            return map;
        }

        StringTable() {
        }
    }
}

