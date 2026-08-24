/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class INet
extends Enum<INet>
implements Constant {
    private final long value;
    public static final long MIN_VALUE = 1L;
    public static final long MAX_VALUE = 1L;
    public static final /* enum */ INet INET_ADDRSTRLEN = new INet(1L);
    private static final /* synthetic */ INet[] $VALUES;

    @Override
    public final long longValue() {
        return this.value;
    }

    static {
        INet[] iNetArray = new INet[1];
        iNetArray[0] = INET_ADDRSTRLEN;
        $VALUES = iNetArray;
    }

    public final int value() {
        return (int)this.value;
    }

    public static INet valueOf(String name) {
        return Enum.valueOf(INet.class, name);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static INet[] values() {
        return (INet[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private INet(long value) {
        this.value = value;
    }
}

