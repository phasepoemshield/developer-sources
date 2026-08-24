/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class UDP
extends Enum<UDP>
implements Constant {
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ UDP UDP_CORK = new UDP(1L);
    private static final /* synthetic */ UDP[] $VALUES;
    private final long value;
    public static final long MAX_VALUE = 1L;

    public static UDP valueOf(String name) {
        return Enum.valueOf(UDP.class, name);
    }

    private UDP(long value) {
        this.value = value;
    }

    public static UDP[] values() {
        return (UDP[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final int value() {
        return (int)this.value;
    }

    static {
        UDP[] uDPArray = new UDP[1];
        uDPArray[0] = UDP_CORK;
        $VALUES = uDPArray;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }
}

