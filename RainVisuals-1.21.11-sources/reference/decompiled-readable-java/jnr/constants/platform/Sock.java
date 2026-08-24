/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class Sock
extends Enum<Sock>
implements Constant {
    public static final /* enum */ Sock SOCK_MAXADDRLEN;
    public static final /* enum */ Sock SOCK_RDM;
    private static final /* synthetic */ Sock[] $VALUES;
    public static final /* enum */ Sock __UNKNOWN_CONSTANT__;
    public static final /* enum */ Sock SOCK_SEQPACKET;
    public static final /* enum */ Sock SOCK_RAW;
    public static final /* enum */ Sock SOCK_CLOEXEC;
    public static final /* enum */ Sock SOCK_STREAM;
    public static final /* enum */ Sock SOCK_DGRAM;
    private static final ConstantResolver<Sock> resolver;
    public static final /* enum */ Sock SOCK_NONBLOCK;

    public final int value() {
        return (int)resolver.longValue(this);
    }

    static {
        SOCK_STREAM = new Sock();
        SOCK_DGRAM = new Sock();
        SOCK_RAW = new Sock();
        SOCK_RDM = new Sock();
        SOCK_SEQPACKET = new Sock();
        SOCK_NONBLOCK = new Sock();
        SOCK_CLOEXEC = new Sock();
        SOCK_MAXADDRLEN = new Sock();
        __UNKNOWN_CONSTANT__ = new Sock();
        Sock[] sockArray = new Sock[9];
        sockArray[0] = SOCK_STREAM;
        sockArray[1] = SOCK_DGRAM;
        sockArray[2] = SOCK_RAW;
        sockArray[3] = SOCK_RDM;
        sockArray[4] = SOCK_SEQPACKET;
        sockArray[5] = SOCK_NONBLOCK;
        sockArray[6] = SOCK_CLOEXEC;
        sockArray[7] = SOCK_MAXADDRLEN;
        sockArray[8] = __UNKNOWN_CONSTANT__;
        $VALUES = sockArray;
        resolver = ConstantResolver.getResolver(Sock.class, 20000, 29999);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public static Sock[] values() {
        return (Sock[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public static Sock valueOf(long value) {
        return resolver.valueOf(value);
    }

    public static Sock valueOf(String name) {
        return Enum.valueOf(Sock.class, name);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public final String toString() {
        return this.description();
    }

    public final String description() {
        return resolver.description(this);
    }
}

