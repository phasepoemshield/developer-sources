/*
 * Decompiled with CFR 0.152.
 */
package org.newsclub.net.unix;

public final class AFSocketType
extends Enum<AFSocketType> {
    public static final /* enum */ AFSocketType SOCK_STREAM = new AFSocketType(1);
    public static final /* enum */ AFSocketType SOCK_DGRAM = new AFSocketType(2);
    public static final /* enum */ AFSocketType SOCK_RAW = new AFSocketType(3);
    public static final /* enum */ AFSocketType SOCK_RDM = new AFSocketType(4);
    public static final /* enum */ AFSocketType SOCK_SEQPACKET = new AFSocketType(5);
    private final int id;
    private static final /* synthetic */ AFSocketType[] $VALUES;

    public static AFSocketType[] values() {
        return (AFSocketType[])$VALUES.clone();
    }

    public static AFSocketType valueOf(String name) {
        return Enum.valueOf(AFSocketType.class, name);
    }

    private AFSocketType(int id) {
        this.id = id;
    }

    int getId() {
        return this.id;
    }

    private static /* synthetic */ AFSocketType[] $values() {
        AFSocketType[] aFSocketTypeArray = new AFSocketType[5];
        aFSocketTypeArray[0] = SOCK_STREAM;
        aFSocketTypeArray[1] = SOCK_DGRAM;
        aFSocketTypeArray[2] = SOCK_RAW;
        aFSocketTypeArray[3] = SOCK_RDM;
        aFSocketTypeArray[4] = SOCK_SEQPACKET;
        return aFSocketTypeArray;
    }

    static {
        $VALUES = AFSocketType.$values();
    }
}

