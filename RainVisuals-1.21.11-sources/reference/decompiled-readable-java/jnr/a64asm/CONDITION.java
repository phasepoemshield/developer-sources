/*
 * Decompiled with CFR 0.152.
 */
package jnr.a64asm;

public final class CONDITION
extends Enum<CONDITION> {
    public static final /* enum */ CONDITION C_ABOVE_EQUAL;
    public static final /* enum */ CONDITION C_VC;
    public static final /* enum */ CONDITION C_LESS_EQUAL;
    public static final /* enum */ CONDITION C_EQUAL;
    public static final /* enum */ CONDITION C_OVERFLOW;
    public static final /* enum */ CONDITION C_GE;
    public static final /* enum */ CONDITION C_SIGN;
    public static final /* enum */ CONDITION C_BELOW_EQUAL;
    public static final /* enum */ CONDITION C_CS;
    public static final /* enum */ CONDITION C_NE;
    public static final /* enum */ CONDITION C_BELOW;
    public static final /* enum */ CONDITION C_LESS;
    public static final /* enum */ CONDITION C_NV;
    public static final /* enum */ CONDITION C_POSITIVE;
    public static final /* enum */ CONDITION C_VS;
    private static final /* synthetic */ CONDITION[] $VALUES;
    public static final /* enum */ CONDITION C_AL;
    public static final /* enum */ CONDITION C_DEFAULT;
    public static final /* enum */ CONDITION C_LT;
    public static final /* enum */ CONDITION C_HS;
    public static final /* enum */ CONDITION C_NOT_EQUAL;
    public static final /* enum */ CONDITION C_EQ;
    public static final /* enum */ CONDITION C_LE;
    public static final /* enum */ CONDITION C_POSITIVE_ZERO;
    public static final /* enum */ CONDITION C_NO_OVERFLOW;
    public static final /* enum */ CONDITION C_GT;
    public static final /* enum */ CONDITION C_ABOVE;
    public static final /* enum */ CONDITION C_ZERO;
    public static final /* enum */ CONDITION C_LS;
    private final int value;
    public static final /* enum */ CONDITION C_LO;
    public static final /* enum */ CONDITION C_PL;
    public static final /* enum */ CONDITION C_MI;
    public static final /* enum */ CONDITION C_CC;
    public static final /* enum */ CONDITION C_NO_CONDITION;
    public static final /* enum */ CONDITION C_GREATER_EQUAL;
    public static final /* enum */ CONDITION C_NEGATIVE;
    public static final /* enum */ CONDITION C_HI;
    public static final /* enum */ CONDITION C_GREATER;
    public static final /* enum */ CONDITION C_NOT_ZERO;

    public final int value() {
        return this.value;
    }

    private CONDITION(int value) {
        this.value = value;
    }

    public static CONDITION[] values() {
        return (CONDITION[])$VALUES.clone();
    }

    static {
        C_NO_CONDITION = new CONDITION(-1);
        C_EQ = new CONDITION(0);
        C_NE = new CONDITION(1);
        C_CS = new CONDITION(2);
        C_CC = new CONDITION(3);
        C_MI = new CONDITION(4);
        C_PL = new CONDITION(5);
        C_VS = new CONDITION(6);
        C_VC = new CONDITION(7);
        C_HI = new CONDITION(8);
        C_LS = new CONDITION(9);
        C_GE = new CONDITION(16);
        C_LT = new CONDITION(17);
        C_GT = new CONDITION(18);
        C_LE = new CONDITION(19);
        C_AL = new CONDITION(20);
        C_NV = new CONDITION(21);
        C_HS = new CONDITION(2);
        C_LO = new CONDITION(3);
        C_EQUAL = new CONDITION(0);
        C_NOT_EQUAL = new CONDITION(1);
        C_ABOVE_EQUAL = new CONDITION(2);
        C_BELOW = new CONDITION(3);
        C_SIGN = new CONDITION(4);
        C_POSITIVE_ZERO = new CONDITION(5);
        C_OVERFLOW = new CONDITION(6);
        C_NO_OVERFLOW = new CONDITION(7);
        C_ABOVE = new CONDITION(8);
        C_BELOW_EQUAL = new CONDITION(9);
        C_GREATER_EQUAL = new CONDITION(10);
        C_LESS = new CONDITION(11);
        C_GREATER = new CONDITION(12);
        C_LESS_EQUAL = new CONDITION(13);
        C_DEFAULT = new CONDITION(14);
        C_ZERO = new CONDITION(0);
        C_NOT_ZERO = new CONDITION(1);
        C_NEGATIVE = new CONDITION(4);
        C_POSITIVE = new CONDITION(5);
        CONDITION[] cONDITIONArray = new CONDITION[38];
        cONDITIONArray[0] = C_NO_CONDITION;
        cONDITIONArray[1] = C_EQ;
        cONDITIONArray[2] = C_NE;
        cONDITIONArray[3] = C_CS;
        cONDITIONArray[4] = C_CC;
        cONDITIONArray[5] = C_MI;
        cONDITIONArray[6] = C_PL;
        cONDITIONArray[7] = C_VS;
        cONDITIONArray[8] = C_VC;
        cONDITIONArray[9] = C_HI;
        cONDITIONArray[10] = C_LS;
        cONDITIONArray[11] = C_GE;
        cONDITIONArray[12] = C_LT;
        cONDITIONArray[13] = C_GT;
        cONDITIONArray[14] = C_LE;
        cONDITIONArray[15] = C_AL;
        cONDITIONArray[16] = C_NV;
        cONDITIONArray[17] = C_HS;
        cONDITIONArray[18] = C_LO;
        cONDITIONArray[19] = C_EQUAL;
        cONDITIONArray[20] = C_NOT_EQUAL;
        cONDITIONArray[21] = C_ABOVE_EQUAL;
        cONDITIONArray[22] = C_BELOW;
        cONDITIONArray[23] = C_SIGN;
        cONDITIONArray[24] = C_POSITIVE_ZERO;
        cONDITIONArray[25] = C_OVERFLOW;
        cONDITIONArray[26] = C_NO_OVERFLOW;
        cONDITIONArray[27] = C_ABOVE;
        cONDITIONArray[28] = C_BELOW_EQUAL;
        cONDITIONArray[29] = C_GREATER_EQUAL;
        cONDITIONArray[30] = C_LESS;
        cONDITIONArray[31] = C_GREATER;
        cONDITIONArray[32] = C_LESS_EQUAL;
        cONDITIONArray[33] = C_DEFAULT;
        cONDITIONArray[34] = C_ZERO;
        cONDITIONArray[35] = C_NOT_ZERO;
        cONDITIONArray[36] = C_NEGATIVE;
        cONDITIONArray[37] = C_POSITIVE;
        $VALUES = cONDITIONArray;
    }

    public static CONDITION valueOf(String name) {
        return Enum.valueOf(CONDITION.class, name);
    }
}

