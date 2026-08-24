/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketControlMessage
extends Enum<SocketControlMessage>
implements Constant {
    public static final long MIN_VALUE = 1L;
    private final long value;
    public static final /* enum */ SocketControlMessage SCM_TIMESTAMP;
    public static final /* enum */ SocketControlMessage SCM_CREDS;
    public static final /* enum */ SocketControlMessage SCM_RIGHTS;
    private static final /* synthetic */ SocketControlMessage[] $VALUES;
    public static final /* enum */ SocketControlMessage SCM_BINTIME;
    public static final long MAX_VALUE = 4L;

    private SocketControlMessage(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        SCM_RIGHTS = new SocketControlMessage(1L);
        SCM_TIMESTAMP = new SocketControlMessage(2L);
        SCM_BINTIME = new SocketControlMessage(4L);
        SCM_CREDS = new SocketControlMessage(3L);
        SocketControlMessage[] socketControlMessageArray = new SocketControlMessage[4];
        socketControlMessageArray[0] = SCM_RIGHTS;
        socketControlMessageArray[1] = SCM_TIMESTAMP;
        socketControlMessageArray[2] = SCM_BINTIME;
        socketControlMessageArray[3] = SCM_CREDS;
        $VALUES = socketControlMessageArray;
    }

    public static SocketControlMessage[] values() {
        return (SocketControlMessage[])$VALUES.clone();
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static SocketControlMessage valueOf(String name) {
        return Enum.valueOf(SocketControlMessage.class, name);
    }

    static final class StringTable {
        public static final Map<SocketControlMessage, String> descriptions = StringTable.generateTable();

        public static final Map<SocketControlMessage, String> generateTable() {
            EnumMap<SocketControlMessage, String> map = new EnumMap<SocketControlMessage, String>(SocketControlMessage.class);
            map.put(SCM_RIGHTS, "SCM_RIGHTS");
            map.put(SCM_TIMESTAMP, "SCM_TIMESTAMP");
            map.put(SCM_BINTIME, "SCM_BINTIME");
            map.put(SCM_CREDS, "SCM_CREDS");
            return map;
        }

        StringTable() {
        }
    }
}

