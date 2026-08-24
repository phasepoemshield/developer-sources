/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class SocketLevel
extends Enum<SocketLevel>
implements Constant {
    public static final /* enum */ SocketLevel SOL_SOCKET = new SocketLevel();
    public static final /* enum */ SocketLevel SOL_IP = new SocketLevel();
    private static final ConstantResolver<SocketLevel> resolver;
    public static final /* enum */ SocketLevel SOL_TCP;
    public static final /* enum */ SocketLevel SOL_IPV6;
    public static final /* enum */ SocketLevel SOL_UDP;
    public static final /* enum */ SocketLevel __UNKNOWN_CONSTANT__;
    private static final /* synthetic */ SocketLevel[] $VALUES;

    public static SocketLevel[] values() {
        return (SocketLevel[])$VALUES.clone();
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public final String description() {
        return resolver.description(this);
    }

    public static SocketLevel valueOf(long value) {
        return resolver.valueOf(value);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public static SocketLevel valueOf(String name) {
        return Enum.valueOf(SocketLevel.class, name);
    }

    public final String toString() {
        return this.description();
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    static {
        SOL_TCP = new SocketLevel();
        SOL_UDP = new SocketLevel();
        SOL_IPV6 = new SocketLevel();
        __UNKNOWN_CONSTANT__ = new SocketLevel();
        SocketLevel[] socketLevelArray = new SocketLevel[6];
        socketLevelArray[0] = SOL_SOCKET;
        socketLevelArray[1] = SOL_IP;
        socketLevelArray[2] = SOL_TCP;
        socketLevelArray[3] = SOL_UDP;
        socketLevelArray[4] = SOL_IPV6;
        socketLevelArray[5] = __UNKNOWN_CONSTANT__;
        $VALUES = socketLevelArray;
        resolver = ConstantResolver.getResolver(SocketLevel.class, 20000, 29999);
    }
}

