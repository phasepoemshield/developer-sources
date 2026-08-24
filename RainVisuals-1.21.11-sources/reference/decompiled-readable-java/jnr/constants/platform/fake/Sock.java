/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class Sock
extends Enum<Sock>
implements Constant {
    public static final long MIN_VALUE = 1L;
    public static final long MAX_VALUE = 8L;
    public static final /* enum */ Sock SOCK_STREAM = new Sock(1L);
    private static final /* synthetic */ Sock[] $VALUES;
    public static final /* enum */ Sock SOCK_RAW;
    public static final /* enum */ Sock SOCK_RDM;
    public static final /* enum */ Sock SOCK_CLOEXEC;
    public static final /* enum */ Sock SOCK_SEQPACKET;
    public static final /* enum */ Sock SOCK_MAXADDRLEN;
    private final long value;
    public static final /* enum */ Sock SOCK_NONBLOCK;
    public static final /* enum */ Sock SOCK_DGRAM;

    public static Sock valueOf(String name) {
        return Enum.valueOf(Sock.class, name);
    }

    static {
        SOCK_DGRAM = new Sock(2L);
        SOCK_RAW = new Sock(3L);
        SOCK_RDM = new Sock(4L);
        SOCK_SEQPACKET = new Sock(5L);
        SOCK_NONBLOCK = new Sock(6L);
        SOCK_CLOEXEC = new Sock(7L);
        SOCK_MAXADDRLEN = new Sock(8L);
        Sock[] sockArray = new Sock[8];
        sockArray[0] = SOCK_STREAM;
        sockArray[1] = SOCK_DGRAM;
        sockArray[2] = SOCK_RAW;
        sockArray[3] = SOCK_RDM;
        sockArray[4] = SOCK_SEQPACKET;
        sockArray[5] = SOCK_NONBLOCK;
        sockArray[6] = SOCK_CLOEXEC;
        sockArray[7] = SOCK_MAXADDRLEN;
        $VALUES = sockArray;
    }

    public final int value() {
        return (int)this.value;
    }

    private Sock(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static Sock[] values() {
        return (Sock[])$VALUES.clone();
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }
}

