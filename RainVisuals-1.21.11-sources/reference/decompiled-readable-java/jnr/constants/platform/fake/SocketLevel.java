/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class SocketLevel
extends Enum<SocketLevel>
implements Constant {
    public static final /* enum */ SocketLevel SOL_UDP;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ SocketLevel SOL_SOCKET;
    public static final /* enum */ SocketLevel SOL_IP;
    private final long value;
    public static final long MAX_VALUE = 5L;
    public static final /* enum */ SocketLevel SOL_TCP;
    private static final /* synthetic */ SocketLevel[] $VALUES;
    public static final /* enum */ SocketLevel SOL_IPV6;

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private SocketLevel(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        SOL_SOCKET = new SocketLevel(1L);
        SOL_IP = new SocketLevel(2L);
        SOL_TCP = new SocketLevel(3L);
        SOL_UDP = new SocketLevel(4L);
        SOL_IPV6 = new SocketLevel(5L);
        SocketLevel[] socketLevelArray = new SocketLevel[5];
        socketLevelArray[0] = SOL_SOCKET;
        socketLevelArray[1] = SOL_IP;
        socketLevelArray[2] = SOL_TCP;
        socketLevelArray[3] = SOL_UDP;
        socketLevelArray[4] = SOL_IPV6;
        $VALUES = socketLevelArray;
    }

    public static SocketLevel[] values() {
        return (SocketLevel[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static SocketLevel valueOf(String name) {
        return Enum.valueOf(SocketLevel.class, name);
    }
}

