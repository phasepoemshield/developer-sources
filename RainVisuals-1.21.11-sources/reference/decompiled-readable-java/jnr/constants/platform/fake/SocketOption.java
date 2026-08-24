/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class SocketOption
extends Enum<SocketOption>
implements Constant {
    public static final /* enum */ SocketOption SO_ALLZONES;
    public static final /* enum */ SocketOption SO_MARK;
    private static final /* synthetic */ SocketOption[] $VALUES;
    public static final /* enum */ SocketOption SO_NOFCS;
    public static final /* enum */ SocketOption SO_OOBINLINE;
    public static final /* enum */ SocketOption SO_DETACH_FILTER;
    public static final /* enum */ SocketOption SO_SNDBUFFORCE;
    public static final /* enum */ SocketOption SO_KEEPALIVE;
    public static final /* enum */ SocketOption SO_LABEL;
    public static final /* enum */ SocketOption SO_RCVBUF;
    public static final /* enum */ SocketOption SO_MAC_EXEMPT;
    public static final /* enum */ SocketOption SO_PEERLABEL;
    public static final /* enum */ SocketOption SO_ACCEPTFILTER;
    public static final /* enum */ SocketOption SO_PEERSEC;
    public static final /* enum */ SocketOption SO_REUSEADDR;
    public static final /* enum */ SocketOption SO_TYPE;
    public static final /* enum */ SocketOption SO_TIMESTAMPNS;
    public static final /* enum */ SocketOption SO_WANTMORE;
    public static final /* enum */ SocketOption SO_DOMAIN;
    public static final /* enum */ SocketOption SO_SELECT_ERR_QUEUE;
    public static final /* enum */ SocketOption SO_PRIORITY;
    public static final /* enum */ SocketOption SO_NKE;
    public static final /* enum */ SocketOption SO_BPF_EXTENSIONS;
    public static final /* enum */ SocketOption SO_NOSIGPIPE;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ SocketOption SO_REUSESHAREUID;
    public static final /* enum */ SocketOption SO_MAX_PACING_RATE;
    public static final /* enum */ SocketOption SO_SNDLOWAT;
    public static final /* enum */ SocketOption SO_NWRITE;
    public static final /* enum */ SocketOption SO_SNDTIMEO;
    public static final /* enum */ SocketOption SO_PASSSEC;
    public static final /* enum */ SocketOption SO_ATTACH_FILTER;
    public static final /* enum */ SocketOption SO_PEEK_OFF;
    public static final /* enum */ SocketOption SO_RCVBUFFORCE;
    public static final /* enum */ SocketOption SO_LOCK_FILTER;
    public static final /* enum */ SocketOption SO_PASSCRED;
    public static final /* enum */ SocketOption SO_DONTROUTE;
    public static final /* enum */ SocketOption SO_RCVTIMEO;
    public static final /* enum */ SocketOption SO_RXQ_OVFL;
    public static final /* enum */ SocketOption SO_USELOOPBACK;
    public static final /* enum */ SocketOption SO_ACCEPTCONN;
    public static final /* enum */ SocketOption SO_RECVUCRED;
    public static final /* enum */ SocketOption SO_RCVLOWAT;
    public static final /* enum */ SocketOption SO_REUSEPORT;
    public static final /* enum */ SocketOption SO_NO_CHECK;
    public static final /* enum */ SocketOption SO_SECURITY_ENCRYPTION_TRANSPORT;
    public static final /* enum */ SocketOption SO_SECURITY_ENCRYPTION_NETWORK;
    public static final /* enum */ SocketOption SO_PEERNAME;
    public static final /* enum */ SocketOption SO_NOADDRERR;
    public static final /* enum */ SocketOption SO_SECURITY_AUTHENTICATION;
    public static final /* enum */ SocketOption SO_WANTOOBFLAG;
    public static final /* enum */ SocketOption SO_TIMESTAMP;
    public static final /* enum */ SocketOption SO_SNDBUF;
    public static final /* enum */ SocketOption SO_DEBUG;
    public static final /* enum */ SocketOption SO_GET_FILTER;
    public static final /* enum */ SocketOption SO_TIMESTAMPING;
    public static final /* enum */ SocketOption SO_BUSY_POLL;
    public static final /* enum */ SocketOption SO_WIFI_STATUS;
    public static final /* enum */ SocketOption SO_PROTOCOL;
    public static final /* enum */ SocketOption SO_NREAD;
    public static final /* enum */ SocketOption SO_BROADCAST;
    public static final /* enum */ SocketOption SO_ERROR;
    public static final long MAX_VALUE = 64L;
    public static final /* enum */ SocketOption SO_BINDTODEVICE;
    private final long value;
    public static final /* enum */ SocketOption SO_PEERCRED;
    public static final /* enum */ SocketOption SO_LINGER;
    public static final /* enum */ SocketOption SO_DONTTRUNC;

    private SocketOption(long value) {
        this.value = value;
    }

    public static SocketOption valueOf(String name) {
        return Enum.valueOf(SocketOption.class, name);
    }

    public final int value() {
        return (int)this.value;
    }

    static {
        SO_DEBUG = new SocketOption(1L);
        SO_ACCEPTCONN = new SocketOption(2L);
        SO_REUSEADDR = new SocketOption(3L);
        SO_KEEPALIVE = new SocketOption(4L);
        SO_DONTROUTE = new SocketOption(5L);
        SO_BROADCAST = new SocketOption(6L);
        SO_USELOOPBACK = new SocketOption(7L);
        SO_LINGER = new SocketOption(8L);
        SO_OOBINLINE = new SocketOption(9L);
        SO_REUSEPORT = new SocketOption(10L);
        SO_TIMESTAMP = new SocketOption(11L);
        SO_ACCEPTFILTER = new SocketOption(12L);
        SO_DONTTRUNC = new SocketOption(13L);
        SO_WANTMORE = new SocketOption(14L);
        SO_WANTOOBFLAG = new SocketOption(15L);
        SO_SNDBUF = new SocketOption(16L);
        SO_RCVBUF = new SocketOption(17L);
        SO_SNDLOWAT = new SocketOption(18L);
        SO_RCVLOWAT = new SocketOption(19L);
        SO_SNDTIMEO = new SocketOption(20L);
        SO_RCVTIMEO = new SocketOption(21L);
        SO_ERROR = new SocketOption(22L);
        SO_TYPE = new SocketOption(23L);
        SO_NREAD = new SocketOption(24L);
        SO_NKE = new SocketOption(25L);
        SO_NOSIGPIPE = new SocketOption(26L);
        SO_NOADDRERR = new SocketOption(27L);
        SO_NWRITE = new SocketOption(28L);
        SO_REUSESHAREUID = new SocketOption(29L);
        SO_LABEL = new SocketOption(30L);
        SO_PEERLABEL = new SocketOption(31L);
        SO_ATTACH_FILTER = new SocketOption(32L);
        SO_BINDTODEVICE = new SocketOption(33L);
        SO_DETACH_FILTER = new SocketOption(34L);
        SO_NO_CHECK = new SocketOption(35L);
        SO_PASSCRED = new SocketOption(36L);
        SO_PEERCRED = new SocketOption(37L);
        SO_PEERNAME = new SocketOption(38L);
        SO_PRIORITY = new SocketOption(39L);
        SO_SNDBUFFORCE = new SocketOption(40L);
        SO_RCVBUFFORCE = new SocketOption(41L);
        SO_GET_FILTER = new SocketOption(42L);
        SO_TIMESTAMPNS = new SocketOption(43L);
        SO_RECVUCRED = new SocketOption(44L);
        SO_MAC_EXEMPT = new SocketOption(45L);
        SO_ALLZONES = new SocketOption(46L);
        SO_PEERSEC = new SocketOption(47L);
        SO_PASSSEC = new SocketOption(48L);
        SO_MARK = new SocketOption(49L);
        SO_TIMESTAMPING = new SocketOption(50L);
        SO_PROTOCOL = new SocketOption(51L);
        SO_DOMAIN = new SocketOption(52L);
        SO_RXQ_OVFL = new SocketOption(53L);
        SO_WIFI_STATUS = new SocketOption(54L);
        SO_PEEK_OFF = new SocketOption(55L);
        SO_NOFCS = new SocketOption(56L);
        SO_LOCK_FILTER = new SocketOption(57L);
        SO_SELECT_ERR_QUEUE = new SocketOption(58L);
        SO_BUSY_POLL = new SocketOption(59L);
        SO_MAX_PACING_RATE = new SocketOption(60L);
        SO_BPF_EXTENSIONS = new SocketOption(61L);
        SO_SECURITY_AUTHENTICATION = new SocketOption(62L);
        SO_SECURITY_ENCRYPTION_NETWORK = new SocketOption(63L);
        SO_SECURITY_ENCRYPTION_TRANSPORT = new SocketOption(64L);
        SocketOption[] socketOptionArray = new SocketOption[64];
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
        socketOptionArray[12] = SO_DONTTRUNC;
        socketOptionArray[13] = SO_WANTMORE;
        socketOptionArray[14] = SO_WANTOOBFLAG;
        socketOptionArray[15] = SO_SNDBUF;
        socketOptionArray[16] = SO_RCVBUF;
        socketOptionArray[17] = SO_SNDLOWAT;
        socketOptionArray[18] = SO_RCVLOWAT;
        socketOptionArray[19] = SO_SNDTIMEO;
        socketOptionArray[20] = SO_RCVTIMEO;
        socketOptionArray[21] = SO_ERROR;
        socketOptionArray[22] = SO_TYPE;
        socketOptionArray[23] = SO_NREAD;
        socketOptionArray[24] = SO_NKE;
        socketOptionArray[25] = SO_NOSIGPIPE;
        socketOptionArray[26] = SO_NOADDRERR;
        socketOptionArray[27] = SO_NWRITE;
        socketOptionArray[28] = SO_REUSESHAREUID;
        socketOptionArray[29] = SO_LABEL;
        socketOptionArray[30] = SO_PEERLABEL;
        socketOptionArray[31] = SO_ATTACH_FILTER;
        socketOptionArray[32] = SO_BINDTODEVICE;
        socketOptionArray[33] = SO_DETACH_FILTER;
        socketOptionArray[34] = SO_NO_CHECK;
        socketOptionArray[35] = SO_PASSCRED;
        socketOptionArray[36] = SO_PEERCRED;
        socketOptionArray[37] = SO_PEERNAME;
        socketOptionArray[38] = SO_PRIORITY;
        socketOptionArray[39] = SO_SNDBUFFORCE;
        socketOptionArray[40] = SO_RCVBUFFORCE;
        socketOptionArray[41] = SO_GET_FILTER;
        socketOptionArray[42] = SO_TIMESTAMPNS;
        socketOptionArray[43] = SO_RECVUCRED;
        socketOptionArray[44] = SO_MAC_EXEMPT;
        socketOptionArray[45] = SO_ALLZONES;
        socketOptionArray[46] = SO_PEERSEC;
        socketOptionArray[47] = SO_PASSSEC;
        socketOptionArray[48] = SO_MARK;
        socketOptionArray[49] = SO_TIMESTAMPING;
        socketOptionArray[50] = SO_PROTOCOL;
        socketOptionArray[51] = SO_DOMAIN;
        socketOptionArray[52] = SO_RXQ_OVFL;
        socketOptionArray[53] = SO_WIFI_STATUS;
        socketOptionArray[54] = SO_PEEK_OFF;
        socketOptionArray[55] = SO_NOFCS;
        socketOptionArray[56] = SO_LOCK_FILTER;
        socketOptionArray[57] = SO_SELECT_ERR_QUEUE;
        socketOptionArray[58] = SO_BUSY_POLL;
        socketOptionArray[59] = SO_MAX_PACING_RATE;
        socketOptionArray[60] = SO_BPF_EXTENSIONS;
        socketOptionArray[61] = SO_SECURITY_AUTHENTICATION;
        socketOptionArray[62] = SO_SECURITY_ENCRYPTION_NETWORK;
        socketOptionArray[63] = SO_SECURITY_ENCRYPTION_TRANSPORT;
        $VALUES = socketOptionArray;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static SocketOption[] values() {
        return (SocketOption[])$VALUES.clone();
    }
}

