/*
 * Decompiled with CFR 0.152.
 */
package jnr.x86asm;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class HINT
extends Enum<HINT> {
    private final int value;
    public static final /* enum */ HINT HINT_NOT_TAKEN;
    public static final /* enum */ HINT HINT_NONE;
    public static final /* enum */ HINT HINT_TAKEN;
    private static final /* synthetic */ HINT[] $VALUES;

    public static HINT valueOf(String name) {
        return Enum.valueOf(HINT.class, name);
    }

    private HINT(int value) {
        this.value = value;
    }

    public final int value() {
        return this.value;
    }

    static {
        HINT_NONE = new HINT(0);
        HINT_TAKEN = new HINT(62);
        HINT_NOT_TAKEN = new HINT(46);
        HINT[] hINTArray = new HINT[3];
        hINTArray[0] = HINT_NONE;
        hINTArray[1] = HINT_TAKEN;
        hINTArray[2] = HINT_NOT_TAKEN;
        $VALUES = hINTArray;
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

