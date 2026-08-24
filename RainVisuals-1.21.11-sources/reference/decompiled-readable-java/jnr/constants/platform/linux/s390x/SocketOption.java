/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.s390x;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketOption
extends Enum<SocketOption>
implements Constant {
    public static final /* enum */ SocketOption SO_DEBUG = new SocketOption(1L);
    public static final /* enum */ SocketOption SO_SNDBUF;
    public static final /* enum */ SocketOption SO_ERROR;
    public static final /* enum */ SocketOption SO_SNDLOWAT;
    public static final /* enum */ SocketOption SO_TYPE;
    public static final /* enum */ SocketOption SO_BINDTODEVICE;
    public static final /* enum */ SocketOption SO_TIMESTAMP;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ SocketOption SO_PRIORITY;
    public static final /* enum */ SocketOption SO_RCVBUF;
    public static final long MAX_VALUE = 30L;
    public static final /* enum */ SocketOption SO_RCVLOWAT;
    public static final /* enum */ SocketOption SO_REUSEPORT;
    public static final /* enum */ SocketOption SO_PASSCRED;
    public static final /* enum */ SocketOption SO_ACCEPTCONN;
    public static final /* enum */ SocketOption SO_LINGER;
    public static final /* enum */ SocketOption SO_PEERCRED;
    public static final /* enum */ SocketOption SO_DETACH_FILTER;
    public static final /* enum */ SocketOption SO_RCVTIMEO;
    private static final /* synthetic */ SocketOption[] $VALUES;
    private final long value;
    public static final /* enum */ SocketOption SO_KEEPALIVE;
    public static final /* enum */ SocketOption SO_DONTROUTE;
    public static final /* enum */ SocketOption SO_SECURITY_ENCRYPTION_TRANSPORT;
    public static final /* enum */ SocketOption SO_ATTACH_FILTER;
    public static final /* enum */ SocketOption SO_SECURITY_AUTHENTICATION;
    public static final /* enum */ SocketOption SO_NO_CHECK;
    public static final /* enum */ SocketOption SO_OOBINLINE;
    public static final /* enum */ SocketOption SO_SECURITY_ENCRYPTION_NETWORK;
    public static final /* enum */ SocketOption SO_PEERNAME;
    public static final /* enum */ SocketOption SO_SNDTIMEO;
    public static final /* enum */ SocketOption SO_BROADCAST;
    public static final /* enum */ SocketOption SO_REUSEADDR;

    @Override
    public final long longValue() {
        return this.value;
    }

    public static SocketOption valueOf(String name) {
        return Enum.valueOf(SocketOption.class, name);
    }

    static {
        SO_ACCEPTCONN = new SocketOption(30L);
        SO_REUSEADDR = new SocketOption(2L);
        SO_KEEPALIVE = new SocketOption(9L);
        SO_DONTROUTE = new SocketOption(5L);
        SO_BROADCAST = new SocketOption(6L);
        SO_LINGER = new SocketOption(13L);
        SO_OOBINLINE = new SocketOption(10L);
        SO_REUSEPORT = new SocketOption(15L);
        SO_TIMESTAMP = new SocketOption(29L);
        SO_SNDBUF = new SocketOption(7L);
        SO_RCVBUF = new SocketOption(8L);
        SO_SNDLOWAT = new SocketOption(19L);
        SO_RCVLOWAT = new SocketOption(18L);
        SO_SNDTIMEO = new SocketOption(21L);
        SO_RCVTIMEO = new SocketOption(20L);
        SO_ERROR = new SocketOption(4L);
        SO_TYPE = new SocketOption(3L);
        SO_ATTACH_FILTER = new SocketOption(26L);
        SO_BINDTODEVICE = new SocketOption(25L);
        SO_DETACH_FILTER = new SocketOption(27L);
        SO_NO_CHECK = new SocketOption(11L);
        SO_PASSCRED = new SocketOption(16L);
        SO_PEERCRED = new SocketOption(17L);
        SO_PEERNAME = new SocketOption(28L);
        SO_PRIORITY = new SocketOption(12L);
        SO_SECURITY_AUTHENTICATION = new SocketOption(22L);
        SO_SECURITY_ENCRYPTION_NETWORK = new SocketOption(24L);
        SO_SECURITY_ENCRYPTION_TRANSPORT = new SocketOption(23L);
        SocketOption[] socketOptionArray = new SocketOption[29];
        socketOptionArray[0] = SO_DEBUG;
        socketOptionArray[1] = SO_ACCEPTCONN;
        socketOptionArray[2] = SO_REUSEADDR;
        socketOptionArray[3] = SO_KEEPALIVE;
        socketOptionArray[4] = SO_DONTROUTE;
        socketOptionArray[5] = SO_BROADCAST;
        socketOptionArray[6] = SO_LINGER;
        socketOptionArray[7] = SO_OOBINLINE;
        socketOptionArray[8] = SO_REUSEPORT;
        socketOptionArray[9] = SO_TIMESTAMP;
        socketOptionArray[10] = SO_SNDBUF;
        socketOptionArray[11] = SO_RCVBUF;
        socketOptionArray[12] = SO_SNDLOWAT;
        socketOptionArray[13] = SO_RCVLOWAT;
        socketOptionArray[14] = SO_SNDTIMEO;
        socketOptionArray[15] = SO_RCVTIMEO;
        socketOptionArray[16] = SO_ERROR;
        socketOptionArray[17] = SO_TYPE;
        socketOptionArray[18] = SO_ATTACH_FILTER;
        socketOptionArray[19] = SO_BINDTODEVICE;
        socketOptionArray[20] = SO_DETACH_FILTER;
        socketOptionArray[21] = SO_NO_CHECK;
        socketOptionArray[22] = SO_PASSCRED;
        socketOptionArray[23] = SO_PEERCRED;
        socketOptionArray[24] = SO_PEERNAME;
        socketOptionArray[25] = SO_PRIORITY;
        socketOptionArray[26] = SO_SECURITY_AUTHENTICATION;
        socketOptionArray[27] = SO_SECURITY_ENCRYPTION_NETWORK;
        socketOptionArray[28] = SO_SECURITY_ENCRYPTION_TRANSPORT;
        $VALUES = socketOptionArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static SocketOption[] values() {
        return (SocketOption[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private SocketOption(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static final class StringTable {
        public static final Map<SocketOption, String> descriptions = StringTable.generateTable();

        public static final Map<SocketOption, String> generateTable() {
            EnumMap<SocketOption, String> map = new EnumMap<SocketOption, String>(SocketOption.class);
            map.put(SO_DEBUG, "SO_DEBUG");
            map.put(SO_ACCEPTCONN, "SO_ACCEPTCONN");
            map.put(SO_REUSEADDR, "SO_REUSEADDR");
            map.put(SO_KEEPALIVE, "SO_KEEPALIVE");
            map.put(SO_DONTROUTE, "SO_DONTROUTE");
            map.put(SO_BROADCAST, "SO_BROADCAST");
            map.put(SO_LINGER, "SO_LINGER");
            map.put(SO_OOBINLINE, "SO_OOBINLINE");
            map.put(SO_REUSEPORT, "SO_REUSEPORT");
            map.put(SO_TIMESTAMP, "SO_TIMESTAMP");
            map.put(SO_SNDBUF, "SO_SNDBUF");
            map.put(SO_RCVBUF, "SO_RCVBUF");
            map.put(SO_SNDLOWAT, "SO_SNDLOWAT");
            map.put(SO_RCVLOWAT, "SO_RCVLOWAT");
            map.put(SO_SNDTIMEO, "SO_SNDTIMEO");
            map.put(SO_RCVTIMEO, "SO_RCVTIMEO");
            map.put(SO_ERROR, "SO_ERROR");
            map.put(SO_TYPE, "SO_TYPE");
            map.put(SO_ATTACH_FILTER, "SO_ATTACH_FILTER");
            map.put(SO_BINDTODEVICE, "SO_BINDTODEVICE");
            map.put(SO_DETACH_FILTER, "SO_DETACH_FILTER");
            map.put(SO_NO_CHECK, "SO_NO_CHECK");
            map.put(SO_PASSCRED, "SO_PASSCRED");
            map.put(SO_PEERCRED, "SO_PEERCRED");
            map.put(SO_PEERNAME, "SO_PEERNAME");
            map.put(SO_PRIORITY, "SO_PRIORITY");
            map.put(SO_SECURITY_AUTHENTICATION, "SO_SECURITY_AUTHENTICATION");
            map.put(SO_SECURITY_ENCRYPTION_NETWORK, "SO_SECURITY_ENCRYPTION_NETWORK");
            map.put(SO_SECURITY_ENCRYPTION_TRANSPORT, "SO_SECURITY_ENCRYPTION_TRANSPORT");
            return map;
        }

        StringTable() {
        }
    }
}

