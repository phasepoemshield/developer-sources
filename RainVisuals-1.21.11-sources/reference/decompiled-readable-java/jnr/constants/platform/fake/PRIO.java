/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class PRIO
extends Enum<PRIO>
implements Constant {
    private static final /* synthetic */ PRIO[] $VALUES;
    public static final /* enum */ PRIO PRIO_PGRP;
    public static final /* enum */ PRIO PRIO_PROCESS;
    public static final /* enum */ PRIO PRIO_MAX;
    public static final long MIN_VALUE = 1L;
    public static final long MAX_VALUE = 5L;
    public static final /* enum */ PRIO PRIO_MIN;
    private final long value;
    public static final /* enum */ PRIO PRIO_USER;

    public static PRIO valueOf(String name) {
        return Enum.valueOf(PRIO.class, name);
    }

    static {
        PRIO_MIN = new PRIO(1L);
        PRIO_PROCESS = new PRIO(2L);
        PRIO_PGRP = new PRIO(3L);
        PRIO_USER = new PRIO(4L);
        PRIO_MAX = new PRIO(5L);
        PRIO[] pRIOArray = new PRIO[5];
        pRIOArray[0] = PRIO_MIN;
        pRIOArray[1] = PRIO_PROCESS;
        pRIOArray[2] = PRIO_PGRP;
        pRIOArray[3] = PRIO_USER;
        pRIOArray[4] = PRIO_MAX;
        $VALUES = pRIOArray;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static PRIO[] values() {
        return (PRIO[])$VALUES.clone();
    }

    private PRIO(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }
}

