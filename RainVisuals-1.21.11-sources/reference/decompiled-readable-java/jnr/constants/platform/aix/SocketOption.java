/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class SocketOption
extends Enum<SocketOption>
implements Constant {
    public static final /* enum */ SocketOption SO_RCVBUF;
    public static final /* enum */ SocketOption SO_ERROR;
    public static final /* enum */ SocketOption SO_SNDLOWAT;
    public static final /* enum */ SocketOption SO_REUSEPORT;
    public static final /* enum */ SocketOption SO_REUSEADDR;
    public static final long MIN_VALUE = 1L;
    private final long value;
    public static final /* enum */ SocketOption SO_SNDTIMEO;
    public static final /* enum */ SocketOption SO_KEEPALIVE;
    public static final /* enum */ SocketOption SO_LINGER;
    public static final /* enum */ SocketOption SO_RCVTIMEO;
    public static final /* enum */ SocketOption SO_OOBINLINE;
    private static final /* synthetic */ SocketOption[] $VALUES;
    public static final /* enum */ SocketOption SO_RCVLOWAT;
    public static final /* enum */ SocketOption SO_BROADCAST;
    public static final /* enum */ SocketOption SO_DONTROUTE;
    public static final /* enum */ SocketOption SO_SNDBUF;
    public static final long MAX_VALUE = 4104L;
    public static final /* enum */ SocketOption SO_USELOOPBACK;
    public static final /* enum */ SocketOption SO_TYPE;
    public static final /* enum */ SocketOption SO_ACCEPTCONN;
    public static final /* enum */ SocketOption SO_DEBUG;

    public static SocketOption[] values() {
        return (SocketOption[])$VALUES.clone();
    }

    public static SocketOption valueOf(String name) {
        return Enum.valueOf(SocketOption.class, name);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    private SocketOption(long value) {
        this.value = value;
    }

    static {
        SO_DEBUG = new SocketOption(1L);
        SO_ACCEPTCONN = new SocketOption(2L);
        SO_REUSEADDR = new SocketOption(4L);
        SO_KEEPALIVE = new SocketOption(8L);
        SO_DONTROUTE = new SocketOption(16L);
        SO_BROADCAST = new SocketOption(32L);
        SO_USELOOPBACK = new SocketOption(64L);
        SO_LINGER = new SocketOption(128L);
        SO_OOBINLINE = new SocketOption(256L);
        SO_REUSEPORT = new SocketOption(512L);
        SO_SNDBUF = new SocketOption(4097L);
        SO_RCVBUF = new SocketOption(4098L);
        SO_SNDLOWAT = new SocketOption(4099L);
        SO_RCVLOWAT = new SocketOption(4100L);
        SO_SNDTIMEO = new SocketOption(4101L);
        SO_RCVTIMEO = new SocketOption(4102L);
        SO_ERROR = new SocketOption(4103L);
        SO_TYPE = new SocketOption(4104L);
        SocketOption[] socketOptionArray = new SocketOption[18];
        socketOptionArray[0] = SO_DEBUG;
        socketOptionArray[1] = SO_ACCEPTCONN;
        socketOptionArray[2] = SO_REUSEADDR;
        socketOptionArray[3] = SO_KEEPALIVE;
        socketOptionArray[4] = SO_DONTROUTE;
        socketOptionArray[5] = SO_BROADCAST;
        socketOptionArray[6] = SO_USELOOPBACK;
        socketOptionArray[7] = SO_LINGER;
        socketOptionArray[8] = SO_OOBINLINE;
        socketOptionArray[9] = SO_REUSEPORT;
        socketOptionArray[10] = SO_SNDBUF;
        socketOptionArray[11] = SO_RCVBUF;
        socketOptionArray[12] = SO_SNDLOWAT;
        socketOptionArray[13] = SO_RCVLOWAT;
        socketOptionArray[14] = SO_SNDTIMEO;
        socketOptionArray[15] = SO_RCVTIMEO;
        socketOptionArray[16] = SO_ERROR;
        socketOptionArray[17] = SO_TYPE;
        $VALUES = socketOptionArray;
    }
}

