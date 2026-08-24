/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.dragonflybsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketControlMessage
extends Enum<SocketControlMessage>
implements Constant {
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ SocketControlMessage SCM_RIGHTS = new SocketControlMessage(1L);
    public static final /* enum */ SocketControlMessage SCM_TIMESTAMP = new SocketControlMessage(2L);
    public static final long MAX_VALUE = 3L;
    private static final /* synthetic */ SocketControlMessage[] $VALUES;
    private final long value;
    public static final /* enum */ SocketControlMessage SCM_CREDS = new SocketControlMessage(3L);

    @Override
    public final boolean defined() {
        return true;
    }

    public static SocketControlMessage[] values() {
        return (SocketControlMessage[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    private SocketControlMessage(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static SocketControlMessage valueOf(String name) {
        return Enum.valueOf(SocketControlMessage.class, name);
    }

    static {
        SocketControlMessage[] socketControlMessageArray = new SocketControlMessage[3];
        socketControlMessageArray[0] = SCM_RIGHTS;
        socketControlMessageArray[1] = SCM_TIMESTAMP;
        socketControlMessageArray[2] = SCM_CREDS;
        $VALUES = socketControlMessageArray;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    static final class StringTable {
        public static final Map<SocketControlMessage, String> descriptions = StringTable.generateTable();

        public static final Map<SocketControlMessage, String> generateTable() {
            EnumMap<SocketControlMessage, String> map = new EnumMap<SocketControlMessage, String>(SocketControlMessage.class);
            map.put(SCM_RIGHTS, "SCM_RIGHTS");
            map.put(SCM_TIMESTAMP, "SCM_TIMESTAMP");
            map.put(SCM_CREDS, "SCM_CREDS");
            return map;
        }

        StringTable() {
        }
    }
}

