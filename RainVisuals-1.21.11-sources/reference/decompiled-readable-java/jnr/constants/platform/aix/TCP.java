/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class TCP
extends Enum<TCP>
implements Constant {
    public static final long MAX_VALUE = 65535L;
    public static final /* enum */ TCP TCP_MAXWIN;
    public static final /* enum */ TCP TCP_MAXBURST;
    public static final long MIN_VALUE = 1L;
    private static final /* synthetic */ TCP[] $VALUES;
    public static final /* enum */ TCP TCP_MSS;
    public static final /* enum */ TCP TCP_NODELAY;
    private final long value;
    public static final /* enum */ TCP TCP_MAX_SACK;
    public static final /* enum */ TCP TCP_MAXSEG;

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static TCP valueOf(String name) {
        return Enum.valueOf(TCP.class, name);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    private TCP(long value) {
        this.value = value;
    }

    static {
        TCP_MAX_SACK = new TCP(4L);
        TCP_MSS = new TCP(1460L);
        TCP_MAXWIN = new TCP(65535L);
        TCP_MAXBURST = new TCP(8L);
        TCP_NODELAY = new TCP(1L);
        TCP_MAXSEG = new TCP(2L);
        TCP[] tCPArray = new TCP[6];
        tCPArray[0] = TCP_MAX_SACK;
        tCPArray[1] = TCP_MSS;
        tCPArray[2] = TCP_MAXWIN;
        tCPArray[3] = TCP_MAXBURST;
        tCPArray[4] = TCP_NODELAY;
        tCPArray[5] = TCP_MAXSEG;
        $VALUES = tCPArray;
    }

    public static TCP[] values() {
        return (TCP[])$VALUES.clone();
    }
}

