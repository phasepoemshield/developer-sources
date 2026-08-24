/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketMessage
extends Enum<SocketMessage>
implements Constant {
    public static final /* enum */ SocketMessage MSG_WAITALL;
    public static final long MAX_VALUE = 8L;
    public static final long MIN_VALUE = 1L;
    private static final /* synthetic */ SocketMessage[] $VALUES;
    private final long value;
    public static final /* enum */ SocketMessage MSG_DONTROUTE;
    public static final /* enum */ SocketMessage MSG_PEEK;
    public static final /* enum */ SocketMessage MSG_OOB;

    @Override
    public final boolean defined() {
        return true;
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

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static {
        MSG_OOB = new SocketMessage(1L);
        MSG_PEEK = new SocketMessage(2L);
        MSG_DONTROUTE = new SocketMessage(4L);
        MSG_WAITALL = new SocketMessage(8L);
        SocketMessage[] socketMessageArray = new SocketMessage[4];
        socketMessageArray[0] = MSG_OOB;
        socketMessageArray[1] = MSG_PEEK;
        socketMessageArray[2] = MSG_DONTROUTE;
        socketMessageArray[3] = MSG_WAITALL;
        $VALUES = socketMessageArray;
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
            map.put(MSG_OOB, "MSG_OOB");
            map.put(MSG_PEEK, "MSG_PEEK");
            map.put(MSG_DONTROUTE, "MSG_DONTROUTE");
            map.put(MSG_WAITALL, "MSG_WAITALL");
            return map;
        }

        StringTable() {
        }
    }
}

