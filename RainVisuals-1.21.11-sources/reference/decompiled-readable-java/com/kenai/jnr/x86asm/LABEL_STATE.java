/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jnr.x86asm;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@Deprecated
public final class LABEL_STATE
extends Enum<LABEL_STATE> {
    private static final /* synthetic */ LABEL_STATE[] $VALUES;
    public static final /* enum */ LABEL_STATE LABEL_STATE_LINKED;
    public static final /* enum */ LABEL_STATE LABEL_STATE_BOUND;
    public static final /* enum */ LABEL_STATE LABEL_STATE_UNUSED;

    public static LABEL_STATE valueOf(String name) {
        return Enum.valueOf(LABEL_STATE.class, name);
    }

    static {
        LABEL_STATE_UNUSED = new LABEL_STATE();
        LABEL_STATE_LINKED = new LABEL_STATE();
        LABEL_STATE_BOUND = new LABEL_STATE();
        LABEL_STATE[] lABEL_STATEArray = new LABEL_STATE[3];
        lABEL_STATEArray[0] = LABEL_STATE_UNUSED;
        lABEL_STATEArray[1] = LABEL_STATE_LINKED;
        lABEL_STATEArray[2] = LABEL_STATE_BOUND;
        $VALUES = lABEL_STATEArray;
    }

    public static LABEL_STATE[] values() {
        return (LABEL_STATE[])$VALUES.clone();
    }
}

