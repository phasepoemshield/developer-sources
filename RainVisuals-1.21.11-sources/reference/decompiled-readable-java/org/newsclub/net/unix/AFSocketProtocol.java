/*
 * Decompiled with CFR 0.152.
 */
package org.newsclub.net.unix;

public final class AFSocketProtocol
extends Enum<AFSocketProtocol> {
    private final int id;
    private static final /* synthetic */ AFSocketProtocol[] $VALUES;
    public static final /* enum */ AFSocketProtocol DEFAULT = new AFSocketProtocol(0);

    public static AFSocketProtocol valueOf(String name) {
        return Enum.valueOf(AFSocketProtocol.class, name);
    }

    static {
        $VALUES = AFSocketProtocol.$values();
    }

    private AFSocketProtocol(int id) {
        this.id = id;
    }

    int getId() {
        return this.id;
    }

    private static /* synthetic */ AFSocketProtocol[] $values() {
        AFSocketProtocol[] aFSocketProtocolArray = new AFSocketProtocol[1];
        aFSocketProtocolArray[0] = DEFAULT;
        return aFSocketProtocolArray;
    }

    public static AFSocketProtocol[] values() {
        return (AFSocketProtocol[])$VALUES.clone();
    }
}

