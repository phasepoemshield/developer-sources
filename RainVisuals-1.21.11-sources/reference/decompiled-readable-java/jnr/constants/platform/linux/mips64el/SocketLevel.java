/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.mips64el;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketLevel
extends Enum<SocketLevel>
implements Constant {
    public static final long MIN_VALUE = 0L;
    private static final /* synthetic */ SocketLevel[] $VALUES;
    public static final /* enum */ SocketLevel SOL_IPV6;
    public static final /* enum */ SocketLevel SOL_UDP;
    private final long value;
    public static final /* enum */ SocketLevel SOL_IP;
    public static final /* enum */ SocketLevel SOL_TCP;
    public static final /* enum */ SocketLevel SOL_SOCKET;
    public static final long MAX_VALUE = 65535L;

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static SocketLevel[] values() {
        return (SocketLevel[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private SocketLevel(long value) {
        this.value = value;
    }

    public static SocketLevel valueOf(String name) {
        return Enum.valueOf(SocketLevel.class, name);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        SOL_SOCKET = new SocketLevel(65535L);
        SOL_IP = new SocketLevel(0L);
        SOL_TCP = new SocketLevel(6L);
        SOL_UDP = new SocketLevel(17L);
        SOL_IPV6 = new SocketLevel(41L);
        SocketLevel[] socketLevelArray = new SocketLevel[5];
        socketLevelArray[0] = SOL_SOCKET;
        socketLevelArray[1] = SOL_IP;
        socketLevelArray[2] = SOL_TCP;
        socketLevelArray[3] = SOL_UDP;
        socketLevelArray[4] = SOL_IPV6;
        $VALUES = socketLevelArray;
    }

    public final int value() {
        return (int)this.value;
    }

    static final class StringTable {
        public static final Map<SocketLevel, String> descriptions = StringTable.generateTable();

        public static final Map<SocketLevel, String> generateTable() {
            EnumMap<SocketLevel, String> map = new EnumMap<SocketLevel, String>(SocketLevel.class);
            map.put(SOL_SOCKET, "SOL_SOCKET");
            map.put(SOL_IP, "SOL_IP");
            map.put(SOL_TCP, "SOL_TCP");
            map.put(SOL_UDP, "SOL_UDP");
            map.put(SOL_IPV6, "SOL_IPV6");
            return map;
        }

        StringTable() {
        }
    }
}

