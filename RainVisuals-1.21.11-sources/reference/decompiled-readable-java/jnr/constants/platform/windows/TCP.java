/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class TCP
extends Enum<TCP>
implements Constant {
    public static final /* enum */ TCP TCP_NODELAY = new TCP(1L);
    public static final long MAX_VALUE = 1L;
    private static final /* synthetic */ TCP[] $VALUES;
    private final long value;
    public static final long MIN_VALUE = 1L;

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private TCP(long value) {
        this.value = value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static TCP valueOf(String name) {
        return Enum.valueOf(TCP.class, name);
    }

    public static TCP[] values() {
        return (TCP[])$VALUES.clone();
    }

    static {
        TCP[] tCPArray = new TCP[1];
        tCPArray[0] = TCP_NODELAY;
        $VALUES = tCPArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static final class StringTable {
        public static final Map<TCP, String> descriptions = StringTable.generateTable();

        public static final Map<TCP, String> generateTable() {
            EnumMap<TCP, String> map = new EnumMap<TCP, String>(TCP.class);
            map.put(TCP_NODELAY, "TCP_NODELAY");
            return map;
        }

        StringTable() {
        }
    }
}

