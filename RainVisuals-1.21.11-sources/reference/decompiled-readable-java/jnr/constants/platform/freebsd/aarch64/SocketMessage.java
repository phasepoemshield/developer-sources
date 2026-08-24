/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketMessage
extends Enum<SocketMessage>
implements Constant {
    public static final /* enum */ SocketMessage MSG_NOSIGNAL;
    public static final /* enum */ SocketMessage MSG_PEEK;
    public static final /* enum */ SocketMessage MSG_EOF;
    public static final /* enum */ SocketMessage MSG_CTRUNC;
    public static final /* enum */ SocketMessage MSG_OOB;
    public static final /* enum */ SocketMessage MSG_COMPAT;
    private static final /* synthetic */ SocketMessage[] $VALUES;
    public static final /* enum */ SocketMessage MSG_DONTWAIT;
    public static final /* enum */ SocketMessage MSG_TRUNC;
    public static final long MAX_VALUE = 131072L;
    public static final /* enum */ SocketMessage MSG_EOR;
    public static final /* enum */ SocketMessage MSG_DONTROUTE;
    public static final /* enum */ SocketMessage MSG_WAITALL;
    public static final long MIN_VALUE = 1L;
    private final long value;

    @Override
    public final boolean defined() {
        return true;
    }

    public static SocketMessage valueOf(String name) {
        return Enum.valueOf(SocketMessage.class, name);
    }

    static {
        MSG_DONTWAIT = new SocketMessage(128L);
        MSG_OOB = new SocketMessage(1L);
        MSG_PEEK = new SocketMessage(2L);
        MSG_DONTROUTE = new SocketMessage(4L);
        MSG_EOR = new SocketMessage(8L);
        MSG_TRUNC = new SocketMessage(16L);
        MSG_CTRUNC = new SocketMessage(32L);
        MSG_WAITALL = new SocketMessage(64L);
        MSG_NOSIGNAL = new SocketMessage(131072L);
        MSG_EOF = new SocketMessage(256L);
        MSG_COMPAT = new SocketMessage(32768L);
        SocketMessage[] socketMessageArray = new SocketMessage[11];
        socketMessageArray[0] = MSG_DONTWAIT;
        socketMessageArray[1] = MSG_OOB;
        socketMessageArray[2] = MSG_PEEK;
        socketMessageArray[3] = MSG_DONTROUTE;
        socketMessageArray[4] = MSG_EOR;
        socketMessageArray[5] = MSG_TRUNC;
        socketMessageArray[6] = MSG_CTRUNC;
        socketMessageArray[7] = MSG_WAITALL;
        socketMessageArray[8] = MSG_NOSIGNAL;
        socketMessageArray[9] = MSG_EOF;
        socketMessageArray[10] = MSG_COMPAT;
        $VALUES = socketMessageArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    private SocketMessage(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static SocketMessage[] values() {
        return (SocketMessage[])$VALUES.clone();
    }

    static final class StringTable {
        public static final Map<SocketMessage, String> descriptions = StringTable.generateTable();

        public static final Map<SocketMessage, String> generateTable() {
            EnumMap<SocketMessage, String> map = new EnumMap<SocketMessage, String>(SocketMessage.class);
            map.put(MSG_DONTWAIT, "MSG_DONTWAIT");
            map.put(MSG_OOB, "MSG_OOB");
            map.put(MSG_PEEK, "MSG_PEEK");
            map.put(MSG_DONTROUTE, "MSG_DONTROUTE");
            map.put(MSG_EOR, "MSG_EOR");
            map.put(MSG_TRUNC, "MSG_TRUNC");
            map.put(MSG_CTRUNC, "MSG_CTRUNC");
            map.put(MSG_WAITALL, "MSG_WAITALL");
            map.put(MSG_NOSIGNAL, "MSG_NOSIGNAL");
            map.put(MSG_EOF, "MSG_EOF");
            map.put(MSG_COMPAT, "MSG_COMPAT");
            return map;
        }

        StringTable() {
        }
    }
}

