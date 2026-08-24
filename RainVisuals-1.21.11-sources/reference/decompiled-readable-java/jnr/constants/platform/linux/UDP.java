/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class UDP
extends Enum<UDP>
implements Constant {
    public static final /* enum */ UDP UDP_CORK = new UDP(1L);
    public static final long MAX_VALUE = 1L;
    private final long value;
    public static final long MIN_VALUE = 1L;
    private static final /* synthetic */ UDP[] $VALUES;

    @Override
    public final boolean defined() {
        return true;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
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

    private UDP(long value) {
        this.value = value;
    }

    static {
        UDP[] uDPArray = new UDP[1];
        uDPArray[0] = UDP_CORK;
        $VALUES = uDPArray;
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

