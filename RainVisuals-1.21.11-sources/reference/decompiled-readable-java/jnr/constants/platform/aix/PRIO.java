/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class PRIO
extends Enum<PRIO>
implements Constant {
    public static final long MAX_VALUE = 20L;
    private final long value;
    private static final /* synthetic */ PRIO[] $VALUES;
    public static final /* enum */ PRIO PRIO_MAX;
    public static final /* enum */ PRIO PRIO_USER;
    public static final /* enum */ PRIO PRIO_MIN;
    public static final long MIN_VALUE = -20L;
    public static final /* enum */ PRIO PRIO_PROCESS;
    public static final /* enum */ PRIO PRIO_PGRP;

    @Override
    public final boolean defined() {
        return true;
    }

    private PRIO(long value) {
        this.value = value;
    }

    static {
        PRIO_MIN = new PRIO(-20L);
        PRIO_PROCESS = new PRIO(0L);
        PRIO_PGRP = new PRIO(1L);
        PRIO_USER = new PRIO(2L);
        PRIO_MAX = new PRIO(20L);
        PRIO[] pRIOArray = new PRIO[5];
        pRIOArray[0] = PRIO_MIN;
        pRIOArray[1] = PRIO_PROCESS;
        pRIOArray[2] = PRIO_PGRP;
        pRIOArray[3] = PRIO_USER;
        pRIOArray[4] = PRIO_MAX;
        $VALUES = pRIOArray;
    }

    public static PRIO valueOf(String name) {
        return Enum.valueOf(PRIO.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static PRIO[] values() {
        return (PRIO[])$VALUES.clone();
    }
}

