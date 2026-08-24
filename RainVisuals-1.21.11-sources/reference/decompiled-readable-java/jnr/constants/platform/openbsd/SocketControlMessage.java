/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketControlMessage
extends Enum<SocketControlMessage>
implements Constant {
    private static final /* synthetic */ SocketControlMessage[] $VALUES;
    public static final /* enum */ SocketControlMessage SCM_TIMESTAMP;
    private final long value;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ SocketControlMessage SCM_RIGHTS;
    public static final long MAX_VALUE = 4L;

    static {
        SCM_RIGHTS = new SocketControlMessage(1L);
        SCM_TIMESTAMP = new SocketControlMessage(4L);
        SocketControlMessage[] socketControlMessageArray = new SocketControlMessage[2];
        socketControlMessageArray[0] = SCM_RIGHTS;
        socketControlMessageArray[1] = SCM_TIMESTAMP;
        $VALUES = socketControlMessageArray;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    private SocketControlMessage(long value) {
        this.value = value;
    }

    public static SocketControlMessage[] values() {
        return (SocketControlMessage[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static SocketControlMessage valueOf(String name) {
        return Enum.valueOf(SocketControlMessage.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    static final class StringTable {
        public static final Map<SocketControlMessage, String> descriptions = StringTable.generateTable();

        public static final Map<SocketControlMessage, String> generateTable() {
            EnumMap<SocketControlMessage, String> map = new EnumMap<SocketControlMessage, String>(SocketControlMessage.class);
            map.put(SCM_RIGHTS, "SCM_RIGHTS");
            map.put(SCM_TIMESTAMP, "SCM_TIMESTAMP");
            return map;
        }

        StringTable() {
        }
    }
}

