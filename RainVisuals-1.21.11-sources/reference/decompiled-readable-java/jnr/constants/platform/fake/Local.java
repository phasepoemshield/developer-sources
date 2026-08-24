/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class Local
extends Enum<Local>
implements Constant {
    public static final /* enum */ Local LOCAL_PEERCRED = new Local(1L);
    public static final long MAX_VALUE = 3L;
    public static final /* enum */ Local LOCAL_CONNWAIT;
    private final long value;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ Local LOCAL_CREDS;
    private static final /* synthetic */ Local[] $VALUES;

    static {
        LOCAL_CREDS = new Local(2L);
        LOCAL_CONNWAIT = new Local(3L);
        Local[] localArray = new Local[3];
        localArray[0] = LOCAL_PEERCRED;
        localArray[1] = LOCAL_CREDS;
        localArray[2] = LOCAL_CONNWAIT;
        $VALUES = localArray;
    }

    public static Local[] values() {
        return (Local[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private Local(long value) {
        this.value = value;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static Local valueOf(String name) {
        return Enum.valueOf(Local.class, name);
    }
}

