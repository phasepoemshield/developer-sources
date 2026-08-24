/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketOption
extends Enum<SocketOption>
implements Constant {
    public static final /* enum */ SocketOption SO_NOFCS;
    public static final /* enum */ SocketOption SO_SECURITY_AUTHENTICATION;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ SocketOption SO_DEBUG;
    public static final /* enum */ SocketOption SO_PASSSEC;
    public static final /* enum */ SocketOption SO_TIMESTAMP;
    public static final /* enum */ SocketOption SO_PEEK_OFF;
    public static final /* enum */ SocketOption SO_SNDLOWAT;
    public static final /* enum */ SocketOption SO_ERROR;
    public static final /* enum */ SocketOption SO_SELECT_ERR_QUEUE;
    public static final long MAX_VALUE = 48L;
    public static final /* enum */ SocketOption SO_WIFI_STATUS;
    public static final /* enum */ SocketOption SO_KEEPALIVE;
    public static final /* enum */ SocketOption SO_RCVBUF;
    public static final /* enum */ SocketOption SO_PEERCRED;
    public static final /* enum */ SocketOption SO_TIMESTAMPNS;
    public static final /* enum */ SocketOption SO_LOCK_FILTER;
    public static final /* enum */ SocketOption SO_GET_FILTER;
    public static final /* enum */ SocketOption SO_BUSY_POLL;
    public static final /* enum */ SocketOption SO_RXQ_OVFL;
    public static final /* enum */ SocketOption SO_DOMAIN;
    public static final /* enum */ SocketOption SO_OOBINLINE;
    public static final /* enum */ SocketOption SO_TYPE;
    public static final /* enum */ SocketOption SO_RCVBUFFORCE;
    public static final /* enum */ SocketOption SO_SNDBUF;
    public static final /* enum */ SocketOption SO_NO_CHECK;
    public static final /* enum */ SocketOption SO_PEERSEC;
    public static final /* enum */ SocketOption SO_ACCEPTCONN;
    public static final /* enum */ SocketOption SO_BROADCAST;
    private static final /* synthetic */ SocketOption[] $VALUES;
    private final long value;
    public static final /* enum */ SocketOption SO_LINGER;
    public static final /* enum */ SocketOption SO_PRIORITY;
    public static final /* enum */ SocketOption SO_PEERNAME;
    public static final /* enum */ SocketOption SO_REUSEPORT;
    public static final /* enum */ SocketOption SO_BINDTODEVICE;
    public static final /* enum */ SocketOption SO_MARK;
    public static final /* enum */ SocketOption SO_REUSEADDR;
    public static final /* enum */ SocketOption SO_SECURITY_ENCRYPTION_NETWORK;
    public static final /* enum */ SocketOption SO_ATTACH_FILTER;
    public static final /* enum */ SocketOption SO_PASSCRED;
    public static final /* enum */ SocketOption SO_SECURITY_ENCRYPTION_TRANSPORT;
    public static final /* enum */ SocketOption SO_SNDBUFFORCE;
    public static final /* enum */ SocketOption SO_DETACH_FILTER;
    public static final /* enum */ SocketOption SO_PROTOCOL;
    public static final /* enum */ SocketOption SO_RCVTIMEO;
    public static final /* enum */ SocketOption SO_BPF_EXTENSIONS;
    public static final /* enum */ SocketOption SO_TIMESTAMPING;
    public static final /* enum */ SocketOption SO_RCVLOWAT;
    public static final /* enum */ SocketOption SO_MAX_PACING_RATE;
    public static final /* enum */ SocketOption SO_SNDTIMEO;
    public static final /* enum */ SocketOption SO_DONTROUTE;

    @Override
    public final long longValue() {
        return this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    private SocketOption(long value) {
        this.value = value;
    }

    public static SocketOption[] values() {
        return (SocketOption[])$VALUES.clone();
    }

    public static SocketOption valueOf(String name) {
        return Enum.valueOf(SocketOption.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static {
        SO_DEBUG = new SocketOption(1L);
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
        SO_SNDBUFFORCE = new SocketOption(32L);
        SO_RCVBUFFORCE = new SocketOption(33L);
        SO_GET_FILTER = new SocketOption(26L);
        SO_TIMESTAMPNS = new SocketOption(35L);
        SO_PEERSEC = new SocketOption(31L);
        SO_PASSSEC = new SocketOption(34L);
        SO_MARK = new SocketOption(36L);
        SO_TIMESTAMPING = new SocketOption(37L);
        SO_PROTOCOL = new SocketOption(38L);
        SO_DOMAIN = new SocketOption(39L);
        SO_RXQ_OVFL = new SocketOption(40L);
        SO_WIFI_STATUS = new SocketOption(41L);
        SO_PEEK_OFF = new SocketOption(42L);
        SO_NOFCS = new SocketOption(43L);
        SO_LOCK_FILTER = new SocketOption(44L);
        SO_SELECT_ERR_QUEUE = new SocketOption(45L);
        SO_BUSY_POLL = new SocketOption(46L);
        SO_MAX_PACING_RATE = new SocketOption(47L);
        SO_BPF_EXTENSIONS = new SocketOption(48L);
        SO_SECURITY_AUTHENTICATION = new SocketOption(22L);
        SO_SECURITY_ENCRYPTION_NETWORK = new SocketOption(24L);
        SO_SECURITY_ENCRYPTION_TRANSPORT = new SocketOption(23L);
        SocketOption[] socketOptionArray = new SocketOption[48];
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
        socketOptionArray[26] = SO_SNDBUFFORCE;
        socketOptionArray[27] = SO_RCVBUFFORCE;
        socketOptionArray[28] = SO_GET_FILTER;
        socketOptionArray[29] = SO_TIMESTAMPNS;
        socketOptionArray[30] = SO_PEERSEC;
        socketOptionArray[31] = SO_PASSSEC;
        socketOptionArray[32] = SO_MARK;
        socketOptionArray[33] = SO_TIMESTAMPING;
        socketOptionArray[34] = SO_PROTOCOL;
        socketOptionArray[35] = SO_DOMAIN;
        socketOptionArray[36] = SO_RXQ_OVFL;
        socketOptionArray[37] = SO_WIFI_STATUS;
        socketOptionArray[38] = SO_PEEK_OFF;
        socketOptionArray[39] = SO_NOFCS;
        socketOptionArray[40] = SO_LOCK_FILTER;
        socketOptionArray[41] = SO_SELECT_ERR_QUEUE;
        socketOptionArray[42] = SO_BUSY_POLL;
        socketOptionArray[43] = SO_MAX_PACING_RATE;
        socketOptionArray[44] = SO_BPF_EXTENSIONS;
        socketOptionArray[45] = SO_SECURITY_AUTHENTICATION;
        socketOptionArray[46] = SO_SECURITY_ENCRYPTION_NETWORK;
        socketOptionArray[47] = SO_SECURITY_ENCRYPTION_TRANSPORT;
        $VALUES = socketOptionArray;
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
            map.put(SO_SNDBUFFORCE, "SO_SNDBUFFORCE");
            map.put(SO_RCVBUFFORCE, "SO_RCVBUFFORCE");
            map.put(SO_GET_FILTER, "SO_GET_FILTER");
            map.put(SO_TIMESTAMPNS, "SO_TIMESTAMPNS");
            map.put(SO_PEERSEC, "SO_PEERSEC");
            map.put(SO_PASSSEC, "SO_PASSSEC");
            map.put(SO_MARK, "SO_MARK");
            map.put(SO_TIMESTAMPING, "SO_TIMESTAMPING");
            map.put(SO_PROTOCOL, "SO_PROTOCOL");
            map.put(SO_DOMAIN, "SO_DOMAIN");
            map.put(SO_RXQ_OVFL, "SO_RXQ_OVFL");
            map.put(SO_WIFI_STATUS, "SO_WIFI_STATUS");
            map.put(SO_PEEK_OFF, "SO_PEEK_OFF");
            map.put(SO_NOFCS, "SO_NOFCS");
            map.put(SO_LOCK_FILTER, "SO_LOCK_FILTER");
            map.put(SO_SELECT_ERR_QUEUE, "SO_SELECT_ERR_QUEUE");
            map.put(SO_BUSY_POLL, "SO_BUSY_POLL");
            map.put(SO_MAX_PACING_RATE, "SO_MAX_PACING_RATE");
            map.put(SO_BPF_EXTENSIONS, "SO_BPF_EXTENSIONS");
            map.put(SO_SECURITY_AUTHENTICATION, "SO_SECURITY_AUTHENTICATION");
            map.put(SO_SECURITY_ENCRYPTION_NETWORK, "SO_SECURITY_ENCRYPTION_NETWORK");
            map.put(SO_SECURITY_ENCRYPTION_TRANSPORT, "SO_SECURITY_ENCRYPTION_TRANSPORT");
            return map;
        }

        StringTable() {
        }
    }
}

