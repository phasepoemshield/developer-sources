/*
 * Decompiled with CFR 0.152.
 */
package jnr.a64asm;

public final class EXTEND_ENUM
extends Enum<EXTEND_ENUM> {
    public static final /* enum */ EXTEND_ENUM UXTH;
    public static final /* enum */ EXTEND_ENUM SXTB;
    private static final /* synthetic */ EXTEND_ENUM[] $VALUES;
    public static final /* enum */ EXTEND_ENUM SXTW;
    public static final /* enum */ EXTEND_ENUM SXTX;
    public static final /* enum */ EXTEND_ENUM UXTB;
    public static final /* enum */ EXTEND_ENUM UXTW;
    public static final /* enum */ EXTEND_ENUM LSL;
    public static final /* enum */ EXTEND_ENUM UXTX;
    public static final /* enum */ EXTEND_ENUM SXTH;

    public final int intValue() {
        return this.ordinal();
    }

    public static EXTEND_ENUM valueOf(String name) {
        return Enum.valueOf(EXTEND_ENUM.class, name);
    }

    static {
        UXTB = new EXTEND_ENUM();
        UXTH = new EXTEND_ENUM();
        UXTW = new EXTEND_ENUM();
        LSL = new EXTEND_ENUM();
        UXTX = new EXTEND_ENUM();
        SXTB = new EXTEND_ENUM();
        SXTH = new EXTEND_ENUM();
        SXTW = new EXTEND_ENUM();
        SXTX = new EXTEND_ENUM();
        EXTEND_ENUM[] eXTEND_ENUMArray = new EXTEND_ENUM[9];
        eXTEND_ENUMArray[0] = UXTB;
        eXTEND_ENUMArray[1] = UXTH;
        eXTEND_ENUMArray[2] = UXTW;
        eXTEND_ENUMArray[3] = LSL;
        eXTEND_ENUMArray[4] = UXTX;
        eXTEND_ENUMArray[5] = SXTB;
        eXTEND_ENUMArray[6] = SXTH;
        eXTEND_ENUMArray[7] = SXTW;
        eXTEND_ENUMArray[8] = SXTX;
        $VALUES = eXTEND_ENUMArray;
    }

    public static EXTEND_ENUM[] values() {
        return (EXTEND_ENUM[])$VALUES.clone();
    }
}

