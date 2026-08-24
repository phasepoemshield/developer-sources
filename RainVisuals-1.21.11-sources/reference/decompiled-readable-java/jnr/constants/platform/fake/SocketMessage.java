/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class SocketMessage
extends Enum<SocketMessage>
implements Constant {
    public static final /* enum */ SocketMessage MSG_EOR;
    public static final /* enum */ SocketMessage MSG_NOSIGNAL;
    public static final /* enum */ SocketMessage MSG_EOF;
    public static final /* enum */ SocketMessage MSG_COMPAT;
    public static final /* enum */ SocketMessage MSG_WAITALL;
    public static final /* enum */ SocketMessage MSG_CTRUNC;
    public static final /* enum */ SocketMessage MSG_SYN;
    public static final /* enum */ SocketMessage MSG_FASTOPEN;
    public static final /* enum */ SocketMessage MSG_RCVMORE;
    public static final /* enum */ SocketMessage MSG_DONTWAIT;
    public static final /* enum */ SocketMessage MSG_OOB;
    public static final /* enum */ SocketMessage MSG_FLUSH;
    public static final /* enum */ SocketMessage MSG_ERRQUEUE;
    public static final /* enum */ SocketMessage MSG_SEND;
    public static final /* enum */ SocketMessage MSG_CONFIRM;
    public static final /* enum */ SocketMessage MSG_HAVEMORE;
    public static final /* enum */ SocketMessage MSG_RST;
    public static final /* enum */ SocketMessage MSG_MORE;
    public static final /* enum */ SocketMessage MSG_PROXY;
    private final long value;
    public static final /* enum */ SocketMessage MSG_FIN;
    public static final /* enum */ SocketMessage MSG_PEEK;
    private static final /* synthetic */ SocketMessage[] $VALUES;
    public static final /* enum */ SocketMessage MSG_HOLD;
    public static final /* enum */ SocketMessage MSG_TRUNC;
    public static final long MAX_VALUE = 24L;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ SocketMessage MSG_DONTROUTE;

    public static SocketMessage[] values() {
        return (SocketMessage[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    private SocketMessage(long value) {
        this.value = value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static SocketMessage valueOf(String name) {
        return Enum.valueOf(SocketMessage.class, name);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    static {
        MSG_DONTWAIT = new SocketMessage(1L);
        MSG_OOB = new SocketMessage(2L);
        MSG_PEEK = new SocketMessage(3L);
        MSG_DONTROUTE = new SocketMessage(4L);
        MSG_EOR = new SocketMessage(5L);
        MSG_TRUNC = new SocketMessage(6L);
        MSG_CTRUNC = new SocketMessage(7L);
        MSG_WAITALL = new SocketMessage(8L);
        MSG_PROXY = new SocketMessage(9L);
        MSG_FIN = new SocketMessage(10L);
        MSG_SYN = new SocketMessage(11L);
        MSG_CONFIRM = new SocketMessage(12L);
        MSG_RST = new SocketMessage(13L);
        MSG_ERRQUEUE = new SocketMessage(14L);
        MSG_NOSIGNAL = new SocketMessage(15L);
        MSG_MORE = new SocketMessage(16L);
        MSG_FASTOPEN = new SocketMessage(17L);
        MSG_EOF = new SocketMessage(18L);
        MSG_FLUSH = new SocketMessage(19L);
        MSG_HOLD = new SocketMessage(20L);
        MSG_SEND = new SocketMessage(21L);
        MSG_HAVEMORE = new SocketMessage(22L);
        MSG_RCVMORE = new SocketMessage(23L);
        MSG_COMPAT = new SocketMessage(24L);
        SocketMessage[] socketMessageArray = new SocketMessage[24];
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
        $VALUES = socketMessageArray;
    }
}

