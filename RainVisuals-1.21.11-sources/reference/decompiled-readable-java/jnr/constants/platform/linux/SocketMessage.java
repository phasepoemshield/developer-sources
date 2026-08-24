/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketMessage
extends Enum<SocketMessage>
implements Constant {
    public static final /* enum */ SocketMessage MSG_OOB;
    public static final /* enum */ SocketMessage MSG_ERRQUEUE;
    public static final /* enum */ SocketMessage MSG_NOSIGNAL;
    public static final /* enum */ SocketMessage MSG_DONTROUTE;
    public static final /* enum */ SocketMessage MSG_RST;
    private static final /* synthetic */ SocketMessage[] $VALUES;
    public static final long MAX_VALUE = 0x20000000L;
    public static final /* enum */ SocketMessage MSG_SYN;
    public static final /* enum */ SocketMessage MSG_FIN;
    public static final /* enum */ SocketMessage MSG_MORE;
    public static final /* enum */ SocketMessage MSG_CTRUNC;
    public static final /* enum */ SocketMessage MSG_CONFIRM;
    public static final /* enum */ SocketMessage MSG_PEEK;
    public static final /* enum */ SocketMessage MSG_PROXY;
    private final long value;
    public static final /* enum */ SocketMessage MSG_EOR;
    public static final /* enum */ SocketMessage MSG_TRUNC;
    public static final /* enum */ SocketMessage MSG_DONTWAIT;
    public static final /* enum */ SocketMessage MSG_FASTOPEN;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ SocketMessage MSG_WAITALL;

    @Override
    public final long longValue() {
        return this.value;
    }

    public static SocketMessage valueOf(String name) {
        return Enum.valueOf(SocketMessage.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static SocketMessage[] values() {
        return (SocketMessage[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    private SocketMessage(long value) {
        this.value = value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static {
        MSG_DONTWAIT = new SocketMessage(64L);
        MSG_OOB = new SocketMessage(1L);
        MSG_PEEK = new SocketMessage(2L);
        MSG_DONTROUTE = new SocketMessage(4L);
        MSG_EOR = new SocketMessage(128L);
        MSG_TRUNC = new SocketMessage(32L);
        MSG_CTRUNC = new SocketMessage(8L);
        MSG_WAITALL = new SocketMessage(256L);
        MSG_PROXY = new SocketMessage(16L);
        MSG_FIN = new SocketMessage(512L);
        MSG_SYN = new SocketMessage(1024L);
        MSG_CONFIRM = new SocketMessage(2048L);
        MSG_RST = new SocketMessage(4096L);
        MSG_ERRQUEUE = new SocketMessage(8192L);
        MSG_NOSIGNAL = new SocketMessage(16384L);
        MSG_MORE = new SocketMessage(32768L);
        MSG_FASTOPEN = new SocketMessage(0x20000000L);
        SocketMessage[] socketMessageArray = new SocketMessage[17];
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
        $VALUES = socketMessageArray;
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
            map.put(MSG_PROXY, "MSG_PROXY");
            map.put(MSG_FIN, "MSG_FIN");
            map.put(MSG_SYN, "MSG_SYN");
            map.put(MSG_CONFIRM, "MSG_CONFIRM");
            map.put(MSG_RST, "MSG_RST");
            map.put(MSG_ERRQUEUE, "MSG_ERRQUEUE");
            map.put(MSG_NOSIGNAL, "MSG_NOSIGNAL");
            map.put(MSG_MORE, "MSG_MORE");
            map.put(MSG_FASTOPEN, "MSG_FASTOPEN");
            return map;
        }
    }
}

