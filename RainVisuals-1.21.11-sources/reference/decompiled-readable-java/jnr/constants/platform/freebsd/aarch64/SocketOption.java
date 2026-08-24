/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketOption
extends Enum<SocketOption>
implements Constant {
    private static final /* synthetic */ SocketOption[] $VALUES;
    public static final /* enum */ SocketOption SO_RCVBUF;
    public static final /* enum */ SocketOption SO_TYPE;
    public static final long MAX_VALUE = 4112L;
    public static final /* enum */ SocketOption SO_NOSIGPIPE;
    public static final /* enum */ SocketOption SO_BROADCAST;
    public static final /* enum */ SocketOption SO_DONTROUTE;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ SocketOption SO_SNDBUF;
    public static final /* enum */ SocketOption SO_TIMESTAMP;
    public static final /* enum */ SocketOption SO_SNDTIMEO;
    public static final /* enum */ SocketOption SO_KEEPALIVE;
    public static final /* enum */ SocketOption SO_ACCEPTCONN;
    public static final /* enum */ SocketOption SO_SNDLOWAT;
    public static final /* enum */ SocketOption SO_USELOOPBACK;
    public static final /* enum */ SocketOption SO_RCVTIMEO;
    private final long value;
    public static final /* enum */ SocketOption SO_REUSEADDR;
    public static final /* enum */ SocketOption SO_LABEL;
    public static final /* enum */ SocketOption SO_ERROR;
    public static final /* enum */ SocketOption SO_PEERLABEL;
    public static final /* enum */ SocketOption SO_ACCEPTFILTER;
    public static final /* enum */ SocketOption SO_LINGER;
    public static final /* enum */ SocketOption SO_OOBINLINE;
    public static final /* enum */ SocketOption SO_DEBUG;
    public static final /* enum */ SocketOption SO_REUSEPORT;
    public static final /* enum */ SocketOption SO_RCVLOWAT;

    @Override
    public final boolean defined() {
        return true;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static SocketOption valueOf(String name) {
        return Enum.valueOf(SocketOption.class, name);
    }

    static {
        SO_DEBUG = new SocketOption(1L);
        SO_ACCEPTCONN = new SocketOption(2L);
        SO_REUSEADDR = new SocketOption(4L);
        SO_KEEPALIVE = new SocketOption(8L);
        SO_DONTROUTE = new SocketOption(16L);
        SO_BROADCAST = new SocketOption(32L);
        SO_USELOOPBACK = new SocketOption(64L);
        SO_LINGER = new SocketOption(128L);
        SO_OOBINLINE = new SocketOption(256L);
        SO_REUSEPORT = new SocketOption(512L);
        SO_TIMESTAMP = new SocketOption(1024L);
        SO_ACCEPTFILTER = new SocketOption(4096L);
        SO_SNDBUF = new SocketOption(4097L);
        SO_RCVBUF = new SocketOption(4098L);
        SO_SNDLOWAT = new SocketOption(4099L);
        SO_RCVLOWAT = new SocketOption(4100L);
        SO_SNDTIMEO = new SocketOption(4101L);
        SO_RCVTIMEO = new SocketOption(4102L);
        SO_ERROR = new SocketOption(4103L);
        SO_TYPE = new SocketOption(4104L);
        SO_NOSIGPIPE = new SocketOption(2048L);
        SO_LABEL = new SocketOption(4105L);
        SO_PEERLABEL = new SocketOption(4112L);
        SocketOption[] socketOptionArray = new SocketOption[23];
        socketOptionArray[0] = SO_DEBUG;
        socketOptionArray[1] = SO_ACCEPTCONN;
        socketOptionArray[2] = SO_REUSEADDR;
        socketOptionArray[3] = SO_KEEPALIVE;
        socketOptionArray[4] = SO_DONTROUTE;
        socketOptionArray[5] = SO_BROADCAST;
        socketOptionArray[6] = SO_USELOOPBACK;
        socketOptionArray[7] = SO_LINGER;
        socketOptionArray[8] = SO_OOBINLINE;
        socketOptionArray[9] = SO_REUSEPORT;
        socketOptionArray[10] = SO_TIMESTAMP;
        socketOptionArray[11] = SO_ACCEPTFILTER;
        socketOptionArray[12] = SO_SNDBUF;
        socketOptionArray[13] = SO_RCVBUF;
        socketOptionArray[14] = SO_SNDLOWAT;
        socketOptionArray[15] = SO_RCVLOWAT;
        socketOptionArray[16] = SO_SNDTIMEO;
        socketOptionArray[17] = SO_RCVTIMEO;
        socketOptionArray[18] = SO_ERROR;
        socketOptionArray[19] = SO_TYPE;
        socketOptionArray[20] = SO_NOSIGPIPE;
        socketOptionArray[21] = SO_LABEL;
        socketOptionArray[22] = SO_PEERLABEL;
        $VALUES = socketOptionArray;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    private SocketOption(long value) {
        this.value = value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static SocketOption[] values() {
        return (SocketOption[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
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
            map.put(SO_USELOOPBACK, "SO_USELOOPBACK");
            map.put(SO_LINGER, "SO_LINGER");
            map.put(SO_OOBINLINE, "SO_OOBINLINE");
            map.put(SO_REUSEPORT, "SO_REUSEPORT");
            map.put(SO_TIMESTAMP, "SO_TIMESTAMP");
            map.put(SO_ACCEPTFILTER, "SO_ACCEPTFILTER");
            map.put(SO_SNDBUF, "SO_SNDBUF");
            map.put(SO_RCVBUF, "SO_RCVBUF");
            map.put(SO_SNDLOWAT, "SO_SNDLOWAT");
            map.put(SO_RCVLOWAT, "SO_RCVLOWAT");
            map.put(SO_SNDTIMEO, "SO_SNDTIMEO");
            map.put(SO_RCVTIMEO, "SO_RCVTIMEO");
            map.put(SO_ERROR, "SO_ERROR");
            map.put(SO_TYPE, "SO_TYPE");
            map.put(SO_NOSIGPIPE, "SO_NOSIGPIPE");
            map.put(SO_LABEL, "SO_LABEL");
            map.put(SO_PEERLABEL, "SO_PEERLABEL");
            return map;
        }

        StringTable() {
        }
    }
}

