/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class Access
extends Enum<Access>
implements Constant {
    public static final /* enum */ Access W_OK;
    private final long value;
    public static final /* enum */ Access X_OK;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ Access R_OK;
    private static final /* synthetic */ Access[] $VALUES;
    public static final long MAX_VALUE = 4L;
    public static final /* enum */ Access F_OK;

    static {
        F_OK = new Access(0L);
        X_OK = new Access(1L);
        W_OK = new Access(2L);
        R_OK = new Access(4L);
        Access[] accessArray = new Access[4];
        accessArray[0] = F_OK;
        accessArray[1] = X_OK;
        accessArray[2] = W_OK;
        accessArray[3] = R_OK;
        $VALUES = accessArray;
    }

    public static Access[] values() {
        return (Access[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    private Access(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static Access valueOf(String name) {
        return Enum.valueOf(Access.class, name);
    }
}

