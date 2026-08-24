/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class Shutdown
extends Enum<Shutdown>
implements Constant {
    public static final /* enum */ Shutdown SHUT_RD = new Shutdown(0L);
    public static final /* enum */ Shutdown SHUT_RDWR;
    private final long value;
    public static final /* enum */ Shutdown SHUT_WR;
    public static final long MIN_VALUE = 0L;
    public static final long MAX_VALUE = 2L;
    private static final /* synthetic */ Shutdown[] $VALUES;

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    static {
        SHUT_WR = new Shutdown(1L);
        SHUT_RDWR = new Shutdown(2L);
        Shutdown[] shutdownArray = new Shutdown[3];
        shutdownArray[0] = SHUT_RD;
        shutdownArray[1] = SHUT_WR;
        shutdownArray[2] = SHUT_RDWR;
        $VALUES = shutdownArray;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static Shutdown valueOf(String name) {
        return Enum.valueOf(Shutdown.class, name);
    }

    public static Shutdown[] values() {
        return (Shutdown[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    private Shutdown(long value) {
        this.value = value;
    }
}

