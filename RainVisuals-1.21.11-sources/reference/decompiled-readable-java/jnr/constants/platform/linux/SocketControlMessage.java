/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketControlMessage
extends Enum<SocketControlMessage>
implements Constant {
    public static final /* enum */ SocketControlMessage SCM_RIGHTS = new SocketControlMessage(1L);
    public static final /* enum */ SocketControlMessage SCM_TIMESTAMPING;
    public static final /* enum */ SocketControlMessage SCM_CREDENTIALS;
    private final long value;
    public static final /* enum */ SocketControlMessage SCM_TIMESTAMPNS;
    private static final /* synthetic */ SocketControlMessage[] $VALUES;
    public static final /* enum */ SocketControlMessage SCM_WIFI_STATUS;
    public static final long MAX_VALUE = 41L;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ SocketControlMessage SCM_TIMESTAMP;

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public final int value() {
        return (int)this.value;
    }

    static {
        SCM_TIMESTAMP = new SocketControlMessage(29L);
        SCM_TIMESTAMPNS = new SocketControlMessage(35L);
        SCM_TIMESTAMPING = new SocketControlMessage(37L);
        SCM_CREDENTIALS = new SocketControlMessage(2L);
        SCM_WIFI_STATUS = new SocketControlMessage(41L);
        SocketControlMessage[] socketControlMessageArray = new SocketControlMessage[6];
        socketControlMessageArray[0] = SCM_RIGHTS;
        socketControlMessageArray[1] = SCM_TIMESTAMP;
        socketControlMessageArray[2] = SCM_TIMESTAMPNS;
        socketControlMessageArray[3] = SCM_TIMESTAMPING;
        socketControlMessageArray[4] = SCM_CREDENTIALS;
        socketControlMessageArray[5] = SCM_WIFI_STATUS;
        $VALUES = socketControlMessageArray;
    }

    private SocketControlMessage(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static SocketControlMessage[] values() {
        return (SocketControlMessage[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static SocketControlMessage valueOf(String name) {
        return Enum.valueOf(SocketControlMessage.class, name);
    }

    static final class StringTable {
        public static final Map<SocketControlMessage, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<SocketControlMessage, String> generateTable() {
            EnumMap<SocketControlMessage, String> map = new EnumMap<SocketControlMessage, String>(SocketControlMessage.class);
            map.put(SCM_RIGHTS, "SCM_RIGHTS");
            map.put(SCM_TIMESTAMP, "SCM_TIMESTAMP");
            map.put(SCM_TIMESTAMPNS, "SCM_TIMESTAMPNS");
            map.put(SCM_TIMESTAMPING, "SCM_TIMESTAMPING");
            map.put(SCM_CREDENTIALS, "SCM_CREDENTIALS");
            map.put(SCM_WIFI_STATUS, "SCM_WIFI_STATUS");
            return map;
        }
    }
}

