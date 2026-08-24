/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jnr.x86asm;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@Deprecated
public final class CONDITION
extends Enum<CONDITION> {
    public static final /* enum */ CONDITION C_PO;
    public static final /* enum */ CONDITION C_BE;
    public static final /* enum */ CONDITION C_NO;
    public static final /* enum */ CONDITION C_ZERO;
    public static final /* enum */ CONDITION C_BELOW;
    public static final /* enum */ CONDITION C_C;
    public static final /* enum */ CONDITION C_NS;
    public static final /* enum */ CONDITION C_NO_OVERFLOW;
    public static final /* enum */ CONDITION C_PARITY_ODD;
    public static final /* enum */ CONDITION C_POSITIVE;
    public static final /* enum */ CONDITION C_P;
    public static final /* enum */ CONDITION C_NG;
    public static final /* enum */ CONDITION C_L;
    public static final /* enum */ CONDITION C_NB;
    public static final /* enum */ CONDITION C_NAE;
    public static final /* enum */ CONDITION C_A;
    public static final /* enum */ CONDITION C_S;
    public static final /* enum */ CONDITION C_BELOW_EQUAL;
    public static final /* enum */ CONDITION C_NOT_SIGN;
    public static final /* enum */ CONDITION C_NLE;
    public static final /* enum */ CONDITION C_GE;
    public static final /* enum */ CONDITION C_NGE;
    public static final /* enum */ CONDITION C_NO_CONDITION;
    public static final /* enum */ CONDITION C_E;
    public static final /* enum */ CONDITION C_FP_NOT_UNORDERED;
    public static final /* enum */ CONDITION C_LESS;
    public static final /* enum */ CONDITION C_AE;
    private static final /* synthetic */ CONDITION[] $VALUES;
    public static final /* enum */ CONDITION C_OVERFLOW;
    public static final /* enum */ CONDITION C_NL;
    public static final /* enum */ CONDITION C_LESS_EQUAL;
    public static final /* enum */ CONDITION C_GREATER;
    public static final /* enum */ CONDITION C_LE;
    public static final /* enum */ CONDITION C_NBE;
    public static final /* enum */ CONDITION C_NOT_EQUAL;
    public static final /* enum */ CONDITION C_PE;
    public static final /* enum */ CONDITION C_SIGN;
    public static final /* enum */ CONDITION C_B;
    public static final /* enum */ CONDITION C_NC;
    public static final /* enum */ CONDITION C_NEGATIVE;
    public static final /* enum */ CONDITION C_ABOVE_EQUAL;
    public static final /* enum */ CONDITION C_O;
    public static final /* enum */ CONDITION C_GREATER_EQUAL;
    public static final /* enum */ CONDITION C_FP_UNORDERED;
    public static final /* enum */ CONDITION C_PARITY_EVEN;
    public static final /* enum */ CONDITION C_NE;
    public static final /* enum */ CONDITION C_EQUAL;
    public static final /* enum */ CONDITION C_NZ;
    public static final /* enum */ CONDITION C_NOT_ZERO;
    public static final /* enum */ CONDITION C_Z;
    public static final /* enum */ CONDITION C_G;
    private final int value;
    public static final /* enum */ CONDITION C_NA;
    public static final /* enum */ CONDITION C_ABOVE;
    public static final /* enum */ CONDITION C_NP;

    public static CONDITION[] values() {
        return (CONDITION[])$VALUES.clone();
    }

    private CONDITION(int value) {
        this.value = value;
    }

    public final int value() {
        return this.value;
    }

    public static CONDITION valueOf(String name) {
        return Enum.valueOf(CONDITION.class, name);
    }

    static {
        C_NO_CONDITION = new CONDITION(-1);
        C_A = new CONDITION(7);
        C_AE = new CONDITION(3);
        C_B = new CONDITION(2);
        C_BE = new CONDITION(6);
        C_C = new CONDITION(2);
        C_E = new CONDITION(4);
        C_G = new CONDITION(15);
        C_GE = new CONDITION(13);
        C_L = new CONDITION(12);
        C_LE = new CONDITION(14);
        C_NA = new CONDITION(6);
        C_NAE = new CONDITION(2);
        C_NB = new CONDITION(3);
        C_NBE = new CONDITION(7);
        C_NC = new CONDITION(3);
        C_NE = new CONDITION(5);
        C_NG = new CONDITION(14);
        C_NGE = new CONDITION(12);
        C_NL = new CONDITION(13);
        C_NLE = new CONDITION(15);
        C_NO = new CONDITION(1);
        C_NP = new CONDITION(11);
        C_NS = new CONDITION(9);
        C_NZ = new CONDITION(5);
        C_O = new CONDITION(0);
        C_P = new CONDITION(10);
        C_PE = new CONDITION(10);
        C_PO = new CONDITION(11);
        C_S = new CONDITION(8);
        C_Z = new CONDITION(4);
        C_OVERFLOW = new CONDITION(0);
        C_NO_OVERFLOW = new CONDITION(1);
        C_BELOW = new CONDITION(2);
        C_ABOVE_EQUAL = new CONDITION(3);
        C_EQUAL = new CONDITION(4);
        C_NOT_EQUAL = new CONDITION(5);
        C_BELOW_EQUAL = new CONDITION(6);
        C_ABOVE = new CONDITION(7);
        C_SIGN = new CONDITION(8);
        C_NOT_SIGN = new CONDITION(9);
        C_PARITY_EVEN = new CONDITION(10);
        C_PARITY_ODD = new CONDITION(11);
        C_LESS = new CONDITION(12);
        C_GREATER_EQUAL = new CONDITION(13);
        C_LESS_EQUAL = new CONDITION(14);
        C_GREATER = new CONDITION(15);
        C_ZERO = new CONDITION(4);
        C_NOT_ZERO = new CONDITION(5);
        C_NEGATIVE = new CONDITION(8);
        C_POSITIVE = new CONDITION(9);
        C_FP_UNORDERED = new CONDITION(16);
        C_FP_NOT_UNORDERED = new CONDITION(17);
        CONDITION[] cONDITIONArray = new CONDITION[53];
        cONDITIONArray[0] = C_NO_CONDITION;
        cONDITIONArray[1] = C_A;
        cONDITIONArray[2] = C_AE;
        cONDITIONArray[3] = C_B;
        cONDITIONArray[4] = C_BE;
        cONDITIONArray[5] = C_C;
        cONDITIONArray[6] = C_E;
        cONDITIONArray[7] = C_G;
        cONDITIONArray[8] = C_GE;
        cONDITIONArray[9] = C_L;
        cONDITIONArray[10] = C_LE;
        cONDITIONArray[11] = C_NA;
        cONDITIONArray[12] = C_NAE;
        cONDITIONArray[13] = C_NB;
        cONDITIONArray[14] = C_NBE;
        cONDITIONArray[15] = C_NC;
        cONDITIONArray[16] = C_NE;
        cONDITIONArray[17] = C_NG;
        cONDITIONArray[18] = C_NGE;
        cONDITIONArray[19] = C_NL;
        cONDITIONArray[20] = C_NLE;
        cONDITIONArray[21] = C_NO;
        cONDITIONArray[22] = C_NP;
        cONDITIONArray[23] = C_NS;
        cONDITIONArray[24] = C_NZ;
        cONDITIONArray[25] = C_O;
        cONDITIONArray[26] = C_P;
        cONDITIONArray[27] = C_PE;
        cONDITIONArray[28] = C_PO;
        cONDITIONArray[29] = C_S;
        cONDITIONArray[30] = C_Z;
        cONDITIONArray[31] = C_OVERFLOW;
        cONDITIONArray[32] = C_NO_OVERFLOW;
        cONDITIONArray[33] = C_BELOW;
        cONDITIONArray[34] = C_ABOVE_EQUAL;
        cONDITIONArray[35] = C_EQUAL;
        cONDITIONArray[36] = C_NOT_EQUAL;
        cONDITIONArray[37] = C_BELOW_EQUAL;
        cONDITIONArray[38] = C_ABOVE;
        cONDITIONArray[39] = C_SIGN;
        cONDITIONArray[40] = C_NOT_SIGN;
        cONDITIONArray[41] = C_PARITY_EVEN;
        cONDITIONArray[42] = C_PARITY_ODD;
        cONDITIONArray[43] = C_LESS;
        cONDITIONArray[44] = C_GREATER_EQUAL;
        cONDITIONArray[45] = C_LESS_EQUAL;
        cONDITIONArray[46] = C_GREATER;
        cONDITIONArray[47] = C_ZERO;
        cONDITIONArray[48] = C_NOT_ZERO;
        cONDITIONArray[49] = C_NEGATIVE;
        cONDITIONArray[50] = C_POSITIVE;
        cONDITIONArray[51] = C_FP_UNORDERED;
        cONDITIONArray[52] = C_FP_NOT_UNORDERED;
        $VALUES = cONDITIONArray;
    }
}

