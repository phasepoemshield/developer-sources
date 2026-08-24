/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class SocketOption
extends Enum<SocketOption>
implements Constant {
    public static final /* enum */ SocketOption SO_ERROR;
    public static final /* enum */ SocketOption SO_WANTOOBFLAG;
    public static final /* enum */ SocketOption SO_RCVTIMEO;
    public static final /* enum */ SocketOption SO_NOADDRERR;
    public static final /* enum */ SocketOption SO_BROADCAST;
    public static final /* enum */ SocketOption SO_OOBINLINE;
    public static final /* enum */ SocketOption SO_USELOOPBACK;
    public static final /* enum */ SocketOption SO_DEBUG;
    public static final /* enum */ SocketOption SO_TIMESTAMP;
    public static final /* enum */ SocketOption SO_TYPE;
    public static final /* enum */ SocketOption SO_KEEPALIVE;
    private static final /* synthetic */ SocketOption[] $VALUES;
    public static final /* enum */ SocketOption SO_REUSEPORT;
    public static final /* enum */ SocketOption SO_DONTTRUNC;
    public static final /* enum */ SocketOption SO_WANTMORE;
    public static final /* enum */ SocketOption SO_LINGER;
    public static final /* enum */ SocketOption SO_DONTROUTE;
    public static final /* enum */ SocketOption SO_NWRITE;
    public static final /* enum */ SocketOption SO_NOSIGPIPE;
    public static final /* enum */ SocketOption SO_LABEL;
    public static final /* enum */ SocketOption SO_RCVBUF;
    public static final /* enum */ SocketOption SO_REUSESHAREUID;
    public static final /* enum */ SocketOption SO_RCVLOWAT;
    public static final long MAX_VALUE = 32768L;
    public static final /* enum */ SocketOption SO_NREAD;
    private final long value;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ SocketOption SO_ACCEPTCONN;
    public static final /* enum */ SocketOption SO_SNDBUF;
    public static final /* enum */ SocketOption SO_SNDLOWAT;
    public static final /* enum */ SocketOption SO_PEERLABEL;
    public static final /* enum */ SocketOption SO_SNDTIMEO;
    public static final /* enum */ SocketOption SO_NKE;
    public static final /* enum */ SocketOption SO_REUSEADDR;

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static SocketOption[] values() {
        return (SocketOption[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    private SocketOption(long value) {
        this.value = value;
    }

    public static SocketOption valueOf(String name) {
        return Enum.valueOf(SocketOption.class, name);
    }

    @Override
    public final long longValue() {
        return this.value;
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
        SO_DONTTRUNC = new SocketOption(8192L);
        SO_WANTMORE = new SocketOption(16384L);
        SO_WANTOOBFLAG = new SocketOption(32768L);
        SO_SNDBUF = new SocketOption(4097L);
        SO_RCVBUF = new SocketOption(4098L);
        SO_SNDLOWAT = new SocketOption(4099L);
        SO_RCVLOWAT = new SocketOption(4100L);
        SO_SNDTIMEO = new SocketOption(4101L);
        SO_RCVTIMEO = new SocketOption(4102L);
        SO_ERROR = new SocketOption(4103L);
        SO_TYPE = new SocketOption(4104L);
        SO_NREAD = new SocketOption(4128L);
        SO_NKE = new SocketOption(4129L);
        SO_NOSIGPIPE = new SocketOption(4130L);
        SO_NOADDRERR = new SocketOption(4131L);
        SO_NWRITE = new SocketOption(4132L);
        SO_REUSESHAREUID = new SocketOption(4133L);
        SO_LABEL = new SocketOption(4112L);
        SO_PEERLABEL = new SocketOption(4113L);
        SocketOption[] socketOptionArray = new SocketOption[30];
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
        socketOptionArray[11] = SO_DONTTRUNC;
        socketOptionArray[12] = SO_WANTMORE;
        socketOptionArray[13] = SO_WANTOOBFLAG;
        socketOptionArray[14] = SO_SNDBUF;
        socketOptionArray[15] = SO_RCVBUF;
        socketOptionArray[16] = SO_SNDLOWAT;
        socketOptionArray[17] = SO_RCVLOWAT;
        socketOptionArray[18] = SO_SNDTIMEO;
        socketOptionArray[19] = SO_RCVTIMEO;
        socketOptionArray[20] = SO_ERROR;
        socketOptionArray[21] = SO_TYPE;
        socketOptionArray[22] = SO_NREAD;
        socketOptionArray[23] = SO_NKE;
        socketOptionArray[24] = SO_NOSIGPIPE;
        socketOptionArray[25] = SO_NOADDRERR;
        socketOptionArray[26] = SO_NWRITE;
        socketOptionArray[27] = SO_REUSESHAREUID;
        socketOptionArray[28] = SO_LABEL;
        socketOptionArray[29] = SO_PEERLABEL;
        $VALUES = socketOptionArray;
    }

    public final int value() {
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
            map.put(SO_DONTTRUNC, "SO_DONTTRUNC");
            map.put(SO_WANTMORE, "SO_WANTMORE");
            map.put(SO_WANTOOBFLAG, "SO_WANTOOBFLAG");
            map.put(SO_SNDBUF, "SO_SNDBUF");
            map.put(SO_RCVBUF, "SO_RCVBUF");
            map.put(SO_SNDLOWAT, "SO_SNDLOWAT");
            map.put(SO_RCVLOWAT, "SO_RCVLOWAT");
            map.put(SO_SNDTIMEO, "SO_SNDTIMEO");
            map.put(SO_RCVTIMEO, "SO_RCVTIMEO");
            map.put(SO_ERROR, "SO_ERROR");
            map.put(SO_TYPE, "SO_TYPE");
            map.put(SO_NREAD, "SO_NREAD");
            map.put(SO_NKE, "SO_NKE");
            map.put(SO_NOSIGPIPE, "SO_NOSIGPIPE");
            map.put(SO_NOADDRERR, "SO_NOADDRERR");
            map.put(SO_NWRITE, "SO_NWRITE");
            map.put(SO_REUSESHAREUID, "SO_REUSESHAREUID");
            map.put(SO_LABEL, "SO_LABEL");
            map.put(SO_PEERLABEL, "SO_PEERLABEL");
            return map;
        }

        StringTable() {
        }
    }
}

