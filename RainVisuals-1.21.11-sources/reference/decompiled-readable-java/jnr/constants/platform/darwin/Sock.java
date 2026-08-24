/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Sock
extends Enum<Sock>
implements Constant {
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ Sock SOCK_SEQPACKET;
    public static final /* enum */ Sock SOCK_RAW;
    public static final long MAX_VALUE = 255L;
    private static final /* synthetic */ Sock[] $VALUES;
    public static final /* enum */ Sock SOCK_STREAM;
    public static final /* enum */ Sock SOCK_RDM;
    private final long value;
    public static final /* enum */ Sock SOCK_MAXADDRLEN;
    public static final /* enum */ Sock SOCK_DGRAM;

    public static Sock[] values() {
        return (Sock[])$VALUES.clone();
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final int value() {
        return (int)this.value;
    }

    static {
        SOCK_STREAM = new Sock(1L);
        SOCK_DGRAM = new Sock(2L);
        SOCK_RAW = new Sock(3L);
        SOCK_RDM = new Sock(4L);
        SOCK_SEQPACKET = new Sock(5L);
        SOCK_MAXADDRLEN = new Sock(255L);
        Sock[] sockArray = new Sock[6];
        sockArray[0] = SOCK_STREAM;
        sockArray[1] = SOCK_DGRAM;
        sockArray[2] = SOCK_RAW;
        sockArray[3] = SOCK_RDM;
        sockArray[4] = SOCK_SEQPACKET;
        sockArray[5] = SOCK_MAXADDRLEN;
        $VALUES = sockArray;
    }

    public static Sock valueOf(String name) {
        return Enum.valueOf(Sock.class, name);
    }

    private Sock(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static final class StringTable {
        public static final Map<Sock, String> descriptions = StringTable.generateTable();

        public static final Map<Sock, String> generateTable() {
            EnumMap<Sock, String> map = new EnumMap<Sock, String>(Sock.class);
            map.put(SOCK_STREAM, "SOCK_STREAM");
            map.put(SOCK_DGRAM, "SOCK_DGRAM");
            map.put(SOCK_RAW, "SOCK_RAW");
            map.put(SOCK_RDM, "SOCK_RDM");
            map.put(SOCK_SEQPACKET, "SOCK_SEQPACKET");
            map.put(SOCK_MAXADDRLEN, "SOCK_MAXADDRLEN");
            return map;
        }

        StringTable() {
        }
    }
}

