/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class SocketControlMessage
extends Enum<SocketControlMessage>
implements Constant {
    public static final /* enum */ SocketControlMessage SCM_BINTIME;
    public static final /* enum */ SocketControlMessage SCM_TIMESTAMP;
    private static final ConstantResolver<SocketControlMessage> resolver;
    public static final /* enum */ SocketControlMessage SCM_TIMESTAMPNS;
    public static final /* enum */ SocketControlMessage SCM_UCRED;
    public static final /* enum */ SocketControlMessage SCM_WIFI_STATUS;
    private static final /* synthetic */ SocketControlMessage[] $VALUES;
    public static final /* enum */ SocketControlMessage SCM_CREDS;
    public static final /* enum */ SocketControlMessage SCM_CREDENTIALS;
    public static final /* enum */ SocketControlMessage __UNKNOWN_CONSTANT__;
    public static final /* enum */ SocketControlMessage SCM_TIMESTAMPING;
    public static final /* enum */ SocketControlMessage SCM_RIGHTS;

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public final String toString() {
        return this.description();
    }

    public static SocketControlMessage valueOf(long value) {
        return resolver.valueOf(value);
    }

    public final String description() {
        return resolver.description(this);
    }

    public static SocketControlMessage valueOf(String name) {
        return Enum.valueOf(SocketControlMessage.class, name);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public static SocketControlMessage[] values() {
        return (SocketControlMessage[])$VALUES.clone();
    }

    static {
        SCM_RIGHTS = new SocketControlMessage();
        SCM_TIMESTAMP = new SocketControlMessage();
        SCM_TIMESTAMPNS = new SocketControlMessage();
        SCM_TIMESTAMPING = new SocketControlMessage();
        SCM_BINTIME = new SocketControlMessage();
        SCM_CREDENTIALS = new SocketControlMessage();
        SCM_CREDS = new SocketControlMessage();
        SCM_UCRED = new SocketControlMessage();
        SCM_WIFI_STATUS = new SocketControlMessage();
        __UNKNOWN_CONSTANT__ = new SocketControlMessage();
        SocketControlMessage[] socketControlMessageArray = new SocketControlMessage[10];
        socketControlMessageArray[0] = SCM_RIGHTS;
        socketControlMessageArray[1] = SCM_TIMESTAMP;
        socketControlMessageArray[2] = SCM_TIMESTAMPNS;
        socketControlMessageArray[3] = SCM_TIMESTAMPING;
        socketControlMessageArray[4] = SCM_BINTIME;
        socketControlMessageArray[5] = SCM_CREDENTIALS;
        socketControlMessageArray[6] = SCM_CREDS;
        socketControlMessageArray[7] = SCM_UCRED;
        socketControlMessageArray[8] = SCM_WIFI_STATUS;
        socketControlMessageArray[9] = __UNKNOWN_CONSTANT__;
        $VALUES = socketControlMessageArray;
        resolver = ConstantResolver.getResolver(SocketControlMessage.class, 20000, 29999);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }
}

