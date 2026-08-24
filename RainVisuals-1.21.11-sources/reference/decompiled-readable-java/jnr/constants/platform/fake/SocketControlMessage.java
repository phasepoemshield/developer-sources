/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class SocketControlMessage
extends Enum<SocketControlMessage>
implements Constant {
    private final long value;
    public static final /* enum */ SocketControlMessage SCM_TIMESTAMPING;
    public static final /* enum */ SocketControlMessage SCM_UCRED;
    public static final /* enum */ SocketControlMessage SCM_CREDENTIALS;
    private static final /* synthetic */ SocketControlMessage[] $VALUES;
    public static final /* enum */ SocketControlMessage SCM_WIFI_STATUS;
    public static final /* enum */ SocketControlMessage SCM_CREDS;
    public static final /* enum */ SocketControlMessage SCM_TIMESTAMPNS;
    public static final /* enum */ SocketControlMessage SCM_RIGHTS;
    public static final /* enum */ SocketControlMessage SCM_TIMESTAMP;
    public static final /* enum */ SocketControlMessage SCM_BINTIME;
    public static final long MIN_VALUE = 1L;
    public static final long MAX_VALUE = 9L;

    public static SocketControlMessage[] values() {
        return (SocketControlMessage[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    private SocketControlMessage(long value) {
        this.value = value;
    }

    public static SocketControlMessage valueOf(String name) {
        return Enum.valueOf(SocketControlMessage.class, name);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        SCM_RIGHTS = new SocketControlMessage(1L);
        SCM_TIMESTAMP = new SocketControlMessage(2L);
        SCM_TIMESTAMPNS = new SocketControlMessage(3L);
        SCM_TIMESTAMPING = new SocketControlMessage(4L);
        SCM_BINTIME = new SocketControlMessage(5L);
        SCM_CREDENTIALS = new SocketControlMessage(6L);
        SCM_CREDS = new SocketControlMessage(7L);
        SCM_UCRED = new SocketControlMessage(8L);
        SCM_WIFI_STATUS = new SocketControlMessage(9L);
        SocketControlMessage[] socketControlMessageArray = new SocketControlMessage[9];
        socketControlMessageArray[0] = SCM_RIGHTS;
        socketControlMessageArray[1] = SCM_TIMESTAMP;
        socketControlMessageArray[2] = SCM_TIMESTAMPNS;
        socketControlMessageArray[3] = SCM_TIMESTAMPING;
        socketControlMessageArray[4] = SCM_BINTIME;
        socketControlMessageArray[5] = SCM_CREDENTIALS;
        socketControlMessageArray[6] = SCM_CREDS;
        socketControlMessageArray[7] = SCM_UCRED;
        socketControlMessageArray[8] = SCM_WIFI_STATUS;
        $VALUES = socketControlMessageArray;
    }

    public final int value() {
        return (int)this.value;
    }
}

