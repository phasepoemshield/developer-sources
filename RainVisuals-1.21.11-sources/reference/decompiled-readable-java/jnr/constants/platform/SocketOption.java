/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class SocketOption
extends Enum<SocketOption>
implements Constant {
    public static final /* enum */ SocketOption SO_MAC_EXEMPT;
    public static final /* enum */ SocketOption SO_BPF_EXTENSIONS;
    public static final /* enum */ SocketOption SO_SECURITY_AUTHENTICATION;
    public static final /* enum */ SocketOption SO_ALLZONES;
    private static final /* synthetic */ SocketOption[] $VALUES;
    public static final /* enum */ SocketOption SO_NOADDRERR;
    public static final /* enum */ SocketOption SO_PEERNAME;
    private static final ConstantResolver<SocketOption> resolver;
    public static final /* enum */ SocketOption SO_LOCK_FILTER;
    public static final /* enum */ SocketOption SO_BUSY_POLL;
    public static final /* enum */ SocketOption SO_PEERSEC;
    public static final /* enum */ SocketOption SO_DEBUG;
    public static final /* enum */ SocketOption SO_NREAD;
    public static final /* enum */ SocketOption SO_TYPE;
    public static final /* enum */ SocketOption SO_WIFI_STATUS;
    public static final /* enum */ SocketOption SO_DONTTRUNC;
    public static final /* enum */ SocketOption SO_TIMESTAMPNS;
    public static final /* enum */ SocketOption SO_SNDBUF;
    public static final /* enum */ SocketOption SO_PEERLABEL;
    public static final /* enum */ SocketOption SO_USELOOPBACK;
    public static final /* enum */ SocketOption SO_RCVBUFFORCE;
    public static final /* enum */ SocketOption SO_SNDBUFFORCE;
    public static final /* enum */ SocketOption SO_BROADCAST;
    public static final /* enum */ SocketOption SO_WANTOOBFLAG;
    public static final /* enum */ SocketOption SO_LABEL;
    public static final /* enum */ SocketOption SO_RCVBUF;
    public static final /* enum */ SocketOption SO_RCVTIMEO;
    public static final /* enum */ SocketOption SO_NOFCS;
    public static final /* enum */ SocketOption SO_SNDTIMEO;
    public static final /* enum */ SocketOption SO_PASSCRED;
    public static final /* enum */ SocketOption SO_PEERCRED;
    public static final /* enum */ SocketOption SO_SECURITY_ENCRYPTION_TRANSPORT;
    public static final /* enum */ SocketOption SO_NKE;
    public static final /* enum */ SocketOption SO_ACCEPTCONN;
    public static final /* enum */ SocketOption SO_PASSSEC;
    public static final /* enum */ SocketOption SO_RECVUCRED;
    public static final /* enum */ SocketOption SO_WANTMORE;
    public static final /* enum */ SocketOption SO_DETACH_FILTER;
    public static final /* enum */ SocketOption SO_KEEPALIVE;
    public static final /* enum */ SocketOption SO_GET_FILTER;
    public static final /* enum */ SocketOption SO_DOMAIN;
    public static final /* enum */ SocketOption SO_ATTACH_FILTER;
    public static final /* enum */ SocketOption SO_LINGER;
    public static final /* enum */ SocketOption SO_MAX_PACING_RATE;
    public static final /* enum */ SocketOption SO_REUSESHAREUID;
    public static final /* enum */ SocketOption SO_RCVLOWAT;
    public static final /* enum */ SocketOption SO_BINDTODEVICE;
    public static final /* enum */ SocketOption SO_MARK;
    public static final /* enum */ SocketOption SO_TIMESTAMPING;
    public static final /* enum */ SocketOption SO_SELECT_ERR_QUEUE;
    public static final /* enum */ SocketOption __UNKNOWN_CONSTANT__;
    public static final /* enum */ SocketOption SO_NOSIGPIPE;
    public static final /* enum */ SocketOption SO_REUSEADDR;
    public static final /* enum */ SocketOption SO_PROTOCOL;
    public static final /* enum */ SocketOption SO_DONTROUTE;
    public static final /* enum */ SocketOption SO_REUSEPORT;
    public static final /* enum */ SocketOption SO_NWRITE;
    public static final /* enum */ SocketOption SO_SECURITY_ENCRYPTION_NETWORK;
    public static final /* enum */ SocketOption SO_ACCEPTFILTER;
    public static final /* enum */ SocketOption SO_PRIORITY;
    public static final /* enum */ SocketOption SO_ERROR;
    public static final /* enum */ SocketOption SO_OOBINLINE;
    public static final /* enum */ SocketOption SO_RXQ_OVFL;
    public static final /* enum */ SocketOption SO_SNDLOWAT;
    public static final /* enum */ SocketOption SO_PEEK_OFF;
    public static final /* enum */ SocketOption SO_NO_CHECK;
    public static final /* enum */ SocketOption SO_TIMESTAMP;

    public static SocketOption valueOf(long value) {
        return resolver.valueOf(value);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public static SocketOption[] values() {
        return (SocketOption[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public final String description() {
        return resolver.description(this);
    }

    public final String toString() {
        return this.description();
    }

    public static SocketOption valueOf(String name) {
        return Enum.valueOf(SocketOption.class, name);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    static {
        SO_DEBUG = new SocketOption();
        SO_ACCEPTCONN = new SocketOption();
        SO_REUSEADDR = new SocketOption();
        SO_KEEPALIVE = new SocketOption();
        SO_DONTROUTE = new SocketOption();
        SO_BROADCAST = new SocketOption();
        SO_USELOOPBACK = new SocketOption();
        SO_LINGER = new SocketOption();
        SO_OOBINLINE = new SocketOption();
        SO_REUSEPORT = new SocketOption();
        SO_TIMESTAMP = new SocketOption();
        SO_ACCEPTFILTER = new SocketOption();
        SO_DONTTRUNC = new SocketOption();
        SO_WANTMORE = new SocketOption();
        SO_WANTOOBFLAG = new SocketOption();
        SO_SNDBUF = new SocketOption();
        SO_RCVBUF = new SocketOption();
        SO_SNDLOWAT = new SocketOption();
        SO_RCVLOWAT = new SocketOption();
        SO_SNDTIMEO = new SocketOption();
        SO_RCVTIMEO = new SocketOption();
        SO_ERROR = new SocketOption();
        SO_TYPE = new SocketOption();
        SO_NREAD = new SocketOption();
        SO_NKE = new SocketOption();
        SO_NOSIGPIPE = new SocketOption();
        SO_NOADDRERR = new SocketOption();
        SO_NWRITE = new SocketOption();
        SO_REUSESHAREUID = new SocketOption();
        SO_LABEL = new SocketOption();
        SO_PEERLABEL = new SocketOption();
        SO_ATTACH_FILTER = new SocketOption();
        SO_BINDTODEVICE = new SocketOption();
        SO_DETACH_FILTER = new SocketOption();
        SO_NO_CHECK = new SocketOption();
        SO_PASSCRED = new SocketOption();
        SO_PEERCRED = new SocketOption();
        SO_PEERNAME = new SocketOption();
        SO_PRIORITY = new SocketOption();
        SO_SNDBUFFORCE = new SocketOption();
        SO_RCVBUFFORCE = new SocketOption();
        SO_GET_FILTER = new SocketOption();
        SO_TIMESTAMPNS = new SocketOption();
        SO_RECVUCRED = new SocketOption();
        SO_MAC_EXEMPT = new SocketOption();
        SO_ALLZONES = new SocketOption();
        SO_PEERSEC = new SocketOption();
        SO_PASSSEC = new SocketOption();
        SO_MARK = new SocketOption();
        SO_TIMESTAMPING = new SocketOption();
        SO_PROTOCOL = new SocketOption();
        SO_DOMAIN = new SocketOption();
        SO_RXQ_OVFL = new SocketOption();
        SO_WIFI_STATUS = new SocketOption();
        SO_PEEK_OFF = new SocketOption();
        SO_NOFCS = new SocketOption();
        SO_LOCK_FILTER = new SocketOption();
        SO_SELECT_ERR_QUEUE = new SocketOption();
        SO_BUSY_POLL = new SocketOption();
        SO_MAX_PACING_RATE = new SocketOption();
        SO_BPF_EXTENSIONS = new SocketOption();
        SO_SECURITY_AUTHENTICATION = new SocketOption();
        SO_SECURITY_ENCRYPTION_NETWORK = new SocketOption();
        SO_SECURITY_ENCRYPTION_TRANSPORT = new SocketOption();
        __UNKNOWN_CONSTANT__ = new SocketOption();
        SocketOption[] socketOptionArray = new SocketOption[65];
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
        socketOptionArray[64] = __UNKNOWN_CONSTANT__;
        $VALUES = socketOptionArray;
        resolver = ConstantResolver.getResolver(SocketOption.class, 20000, 29999);
    }
}

