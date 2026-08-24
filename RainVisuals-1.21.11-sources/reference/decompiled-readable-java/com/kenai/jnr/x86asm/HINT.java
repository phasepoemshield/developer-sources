/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jnr.x86asm;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@Deprecated
public final class HINT
extends Enum<HINT> {
    public static final /* enum */ HINT HINT_NONE = new HINT(0);
    private static final /* synthetic */ HINT[] $VALUES;
    private final int value;
    public static final /* enum */ HINT HINT_TAKEN = new HINT(62);
    public static final /* enum */ HINT HINT_NOT_TAKEN = new HINT(46);

    private HINT(int value) {
        this.value = value;
    }

    static {
        HINT[] hINTArray = new HINT[3];
        hINTArray[0] = HINT_NONE;
        hINTArray[1] = HINT_TAKEN;
        hINTArray[2] = HINT_NOT_TAKEN;
        $VALUES = hINTArray;
    }

    public static HINT valueOf(String name) {
        return Enum.valueOf(HINT.class, name);
    }

    public final int value() {
        return this.value;
    }

    public static HINT[] values() {
        return (HINT[])$VALUES.clone();
    }

    public static final HINT valueOf(int value) {
        switch (value) {
            case 62: {
                return HINT_TAKEN;
            }
            case 46: {
                return HINT_NOT_TAKEN;
            }
        }
        return HINT_NONE;
    }
}

