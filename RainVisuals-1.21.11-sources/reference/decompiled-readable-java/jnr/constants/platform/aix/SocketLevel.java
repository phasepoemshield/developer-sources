/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class SocketLevel
extends Enum<SocketLevel>
implements Constant {
    public static final /* enum */ SocketLevel SOL_SOCKET = new SocketLevel(65535L);
    public static final long MIN_VALUE = 65535L;
    private static final /* synthetic */ SocketLevel[] $VALUES;
    private final long value;
    public static final long MAX_VALUE = 65535L;

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static {
        SocketLevel[] socketLevelArray = new SocketLevel[1];
        socketLevelArray[0] = SOL_SOCKET;
        $VALUES = socketLevelArray;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static SocketLevel[] values() {
        return (SocketLevel[])$VALUES.clone();
    }

    private SocketLevel(long value) {
        this.value = value;
    }

    public static SocketLevel valueOf(String name) {
        return Enum.valueOf(SocketLevel.class, name);
    }

    @Override
    public final long longValue() {
        return this.value;
    }
}

