/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class Sock
extends Enum<Sock>
implements Constant {
    public static final /* enum */ Sock SOCK_SEQPACKET;
    public static final /* enum */ Sock SOCK_RDM;
    public static final /* enum */ Sock SOCK_DGRAM;
    public static final /* enum */ Sock SOCK_STREAM;
    public static final /* enum */ Sock SOCK_RAW;
    private final long value;
    private static final /* synthetic */ Sock[] $VALUES;
    public static final long MIN_VALUE = 1L;
    public static final long MAX_VALUE = 5L;

    static {
        SOCK_STREAM = new Sock(1L);
        SOCK_DGRAM = new Sock(2L);
        SOCK_RAW = new Sock(3L);
        SOCK_RDM = new Sock(4L);
        SOCK_SEQPACKET = new Sock(5L);
        Sock[] sockArray = new Sock[5];
        sockArray[0] = SOCK_STREAM;
        sockArray[1] = SOCK_DGRAM;
        sockArray[2] = SOCK_RAW;
        sockArray[3] = SOCK_RDM;
        sockArray[4] = SOCK_SEQPACKET;
        $VALUES = sockArray;
    }

    private Sock(long value) {
        this.value = value;
    }

    public static Sock valueOf(String name) {
        return Enum.valueOf(Sock.class, name);
    }

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

    public static Sock[] values() {
        return (Sock[])$VALUES.clone();
    }
}

