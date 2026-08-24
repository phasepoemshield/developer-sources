/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class SocketMessage
extends Enum<SocketMessage>
implements Constant {
    public static final /* enum */ SocketMessage MSG_MORE;
    public static final /* enum */ SocketMessage MSG_WAITALL;
    public static final /* enum */ SocketMessage MSG_EOF;
    public static final /* enum */ SocketMessage MSG_PROXY;
    public static final /* enum */ SocketMessage MSG_SYN;
    public static final /* enum */ SocketMessage MSG_RCVMORE;
    private static final /* synthetic */ SocketMessage[] $VALUES;
    public static final /* enum */ SocketMessage MSG_SEND;
    public static final /* enum */ SocketMessage MSG_FASTOPEN;
    public static final /* enum */ SocketMessage MSG_ERRQUEUE;
    private static final ConstantResolver<SocketMessage> resolver;
    public static final /* enum */ SocketMessage MSG_HAVEMORE;
    public static final /* enum */ SocketMessage MSG_PEEK;
    public static final /* enum */ SocketMessage MSG_HOLD;
    public static final /* enum */ SocketMessage MSG_EOR;
    public static final /* enum */ SocketMessage MSG_OOB;
    public static final /* enum */ SocketMessage MSG_COMPAT;
    public static final /* enum */ SocketMessage MSG_NOSIGNAL;
    public static final /* enum */ SocketMessage MSG_CTRUNC;
    public static final /* enum */ SocketMessage MSG_CONFIRM;
    public static final /* enum */ SocketMessage MSG_DONTWAIT;
    public static final /* enum */ SocketMessage MSG_DONTROUTE;
    public static final /* enum */ SocketMessage __UNKNOWN_CONSTANT__;
    public static final /* enum */ SocketMessage MSG_FIN;
    public static final /* enum */ SocketMessage MSG_RST;
    public static final /* enum */ SocketMessage MSG_FLUSH;
    public static final /* enum */ SocketMessage MSG_TRUNC;

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    static {
        MSG_DONTWAIT = new SocketMessage();
        MSG_OOB = new SocketMessage();
        MSG_PEEK = new SocketMessage();
        MSG_DONTROUTE = new SocketMessage();
        MSG_EOR = new SocketMessage();
        MSG_TRUNC = new SocketMessage();
        MSG_CTRUNC = new SocketMessage();
        MSG_WAITALL = new SocketMessage();
        MSG_PROXY = new SocketMessage();
        MSG_FIN = new SocketMessage();
        MSG_SYN = new SocketMessage();
        MSG_CONFIRM = new SocketMessage();
        MSG_RST = new SocketMessage();
        MSG_ERRQUEUE = new SocketMessage();
        MSG_NOSIGNAL = new SocketMessage();
        MSG_MORE = new SocketMessage();
        MSG_FASTOPEN = new SocketMessage();
        MSG_EOF = new SocketMessage();
        MSG_FLUSH = new SocketMessage();
        MSG_HOLD = new SocketMessage();
        MSG_SEND = new SocketMessage();
        MSG_HAVEMORE = new SocketMessage();
        MSG_RCVMORE = new SocketMessage();
        MSG_COMPAT = new SocketMessage();
        __UNKNOWN_CONSTANT__ = new SocketMessage();
        SocketMessage[] socketMessageArray = new SocketMessage[25];
        socketMessageArray[0] = MSG_DONTWAIT;
        socketMessageArray[1] = MSG_OOB;
        socketMessageArray[2] = MSG_PEEK;
        socketMessageArray[3] = MSG_DONTROUTE;
        socketMessageArray[4] = MSG_EOR;
        socketMessageArray[5] = MSG_TRUNC;
        socketMessageArray[6] = MSG_CTRUNC;
        socketMessageArray[7] = MSG_WAITALL;
        socketMessageArray[8] = MSG_PROXY;
        socketMessageArray[9] = MSG_FIN;
        socketMessageArray[10] = MSG_SYN;
        socketMessageArray[11] = MSG_CONFIRM;
        socketMessageArray[12] = MSG_RST;
        socketMessageArray[13] = MSG_ERRQUEUE;
        socketMessageArray[14] = MSG_NOSIGNAL;
        socketMessageArray[15] = MSG_MORE;
        socketMessageArray[16] = MSG_FASTOPEN;
        socketMessageArray[17] = MSG_EOF;
        socketMessageArray[18] = MSG_FLUSH;
        socketMessageArray[19] = MSG_HOLD;
        socketMessageArray[20] = MSG_SEND;
        socketMessageArray[21] = MSG_HAVEMORE;
        socketMessageArray[22] = MSG_RCVMORE;
        socketMessageArray[23] = MSG_COMPAT;
        socketMessageArray[24] = __UNKNOWN_CONSTANT__;
        $VALUES = socketMessageArray;
        resolver = ConstantResolver.getResolver(SocketMessage.class, 20000, 29999);
    }

    public final String description() {
        return resolver.description(this);
    }

    public static SocketMessage valueOf(long value) {
        return resolver.valueOf(value);
    }

    public static SocketMessage[] values() {
        return (SocketMessage[])$VALUES.clone();
    }

    public static SocketMessage valueOf(String name) {
        return Enum.valueOf(SocketMessage.class, name);
    }

    public final String toString() {
        return this.description();
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }
}

