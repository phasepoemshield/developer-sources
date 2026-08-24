/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketMessage
extends Enum<SocketMessage>
implements Constant {
    public static final /* enum */ SocketMessage MSG_EOF;
    public static final /* enum */ SocketMessage MSG_SEND;
    private static final /* synthetic */ SocketMessage[] $VALUES;
    public static final /* enum */ SocketMessage MSG_RCVMORE;
    public static final /* enum */ SocketMessage MSG_DONTROUTE;
    public static final /* enum */ SocketMessage MSG_OOB;
    public static final /* enum */ SocketMessage MSG_HOLD;
    public static final /* enum */ SocketMessage MSG_TRUNC;
    public static final long MAX_VALUE = 16384L;
    public static final /* enum */ SocketMessage MSG_CTRUNC;
    public static final /* enum */ SocketMessage MSG_DONTWAIT;
    public static final long MIN_VALUE = 1L;
    private final long value;
    public static final /* enum */ SocketMessage MSG_WAITALL;
    public static final /* enum */ SocketMessage MSG_FLUSH;
    public static final /* enum */ SocketMessage MSG_PEEK;
    public static final /* enum */ SocketMessage MSG_EOR;
    public static final /* enum */ SocketMessage MSG_HAVEMORE;

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private SocketMessage(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
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
        MSG_EOF = new SocketMessage(256L);
        MSG_FLUSH = new SocketMessage(1024L);
        MSG_HOLD = new SocketMessage(2048L);
        MSG_SEND = new SocketMessage(4096L);
        MSG_HAVEMORE = new SocketMessage(8192L);
        MSG_RCVMORE = new SocketMessage(16384L);
        SocketMessage[] socketMessageArray = new SocketMessage[14];
        socketMessageArray[0] = MSG_DONTWAIT;
        socketMessageArray[1] = MSG_OOB;
        socketMessageArray[2] = MSG_PEEK;
        socketMessageArray[3] = MSG_DONTROUTE;
        socketMessageArray[4] = MSG_EOR;
        socketMessageArray[5] = MSG_TRUNC;
        socketMessageArray[6] = MSG_CTRUNC;
        socketMessageArray[7] = MSG_WAITALL;
        socketMessageArray[8] = MSG_EOF;
        socketMessageArray[9] = MSG_FLUSH;
        socketMessageArray[10] = MSG_HOLD;
        socketMessageArray[11] = MSG_SEND;
        socketMessageArray[12] = MSG_HAVEMORE;
        socketMessageArray[13] = MSG_RCVMORE;
        $VALUES = socketMessageArray;
    }

    public static SocketMessage valueOf(String name) {
        return Enum.valueOf(SocketMessage.class, name);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static SocketMessage[] values() {
        return (SocketMessage[])$VALUES.clone();
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public final int value() {
        return (int)this.value;
    }

    static final class StringTable {
        public static final Map<SocketMessage, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

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
            map.put(MSG_EOF, "MSG_EOF");
            map.put(MSG_FLUSH, "MSG_FLUSH");
            map.put(MSG_HOLD, "MSG_HOLD");
            map.put(MSG_SEND, "MSG_SEND");
            map.put(MSG_HAVEMORE, "MSG_HAVEMORE");
            map.put(MSG_RCVMORE, "MSG_RCVMORE");
            return map;
        }
    }
}

