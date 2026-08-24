/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketControlMessage
extends Enum<SocketControlMessage>
implements Constant {
    public static final /* enum */ SocketControlMessage SCM_CREDS;
    public static final long MIN_VALUE = 1L;
    private final long value;
    private static final /* synthetic */ SocketControlMessage[] $VALUES;
    public static final /* enum */ SocketControlMessage SCM_RIGHTS;
    public static final long MAX_VALUE = 3L;
    public static final /* enum */ SocketControlMessage SCM_TIMESTAMP;

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static SocketControlMessage valueOf(String name) {
        return Enum.valueOf(SocketControlMessage.class, name);
    }

    public static SocketControlMessage[] values() {
        return (SocketControlMessage[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private SocketControlMessage(long value) {
        this.value = value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public final int value() {
        return (int)this.value;
    }

    static {
        SCM_RIGHTS = new SocketControlMessage(1L);
        SCM_TIMESTAMP = new SocketControlMessage(2L);
        SCM_CREDS = new SocketControlMessage(3L);
        SocketControlMessage[] socketControlMessageArray = new SocketControlMessage[3];
        socketControlMessageArray[0] = SCM_RIGHTS;
        socketControlMessageArray[1] = SCM_TIMESTAMP;
        socketControlMessageArray[2] = SCM_CREDS;
        $VALUES = socketControlMessageArray;
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

