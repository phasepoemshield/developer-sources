/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.dragonflybsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketLevel
extends Enum<SocketLevel>
implements Constant {
    public static final long MIN_VALUE = 65535L;
    public static final /* enum */ SocketLevel SOL_SOCKET = new SocketLevel(65535L);
    public static final long MAX_VALUE = 65535L;
    private final long value;
    private static final /* synthetic */ SocketLevel[] $VALUES;

    @Override
    public final long longValue() {
        return this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static SocketLevel valueOf(String name) {
        return Enum.valueOf(SocketLevel.class, name);
    }

    private SocketLevel(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static SocketLevel[] values() {
        return (SocketLevel[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        SocketLevel[] socketLevelArray = new SocketLevel[1];
        socketLevelArray[0] = SOL_SOCKET;
        $VALUES = socketLevelArray;
    }

    static final class StringTable {
        public static final Map<SocketLevel, String> descriptions = StringTable.generateTable();

        public static final Map<SocketLevel, String> generateTable() {
            EnumMap<SocketLevel, String> map = new EnumMap<SocketLevel, String>(SocketLevel.class);
            map.put(SOL_SOCKET, "SOL_SOCKET");
            return map;
        }

        StringTable() {
        }
    }
}

