/*
 * Decompiled with CFR 0.152.
 */
package jnr.a64asm;

public final class ERROR_CODE
extends Enum<ERROR_CODE> {
    private static final /* synthetic */ ERROR_CODE[] $VALUES;
    public static final /* enum */ ERROR_CODE ERROR_ILLEGAL_SHORT_JUMP;
    public static final /* enum */ ERROR_CODE ERROR_ILLEGAL_INSTRUCTION;
    public static final /* enum */ ERROR_CODE ERROR_NO_HEAP_MEMORY;
    public static final /* enum */ ERROR_CODE _ERROR_COUNT;
    public static final /* enum */ ERROR_CODE ERROR_NONE;
    public static final /* enum */ ERROR_CODE ERROR_ILLEGAL_ADDRESING;
    public static final /* enum */ ERROR_CODE ERROR_UNKNOWN_INSTRUCTION;
    public static final /* enum */ ERROR_CODE ERROR_NO_VIRTUAL_MEMORY;

    static {
        ERROR_NONE = new ERROR_CODE();
        ERROR_NO_HEAP_MEMORY = new ERROR_CODE();
        ERROR_NO_VIRTUAL_MEMORY = new ERROR_CODE();
        ERROR_UNKNOWN_INSTRUCTION = new ERROR_CODE();
        ERROR_ILLEGAL_INSTRUCTION = new ERROR_CODE();
        ERROR_ILLEGAL_ADDRESING = new ERROR_CODE();
        ERROR_ILLEGAL_SHORT_JUMP = new ERROR_CODE();
        _ERROR_COUNT = new ERROR_CODE();
        ERROR_CODE[] eRROR_CODEArray = new ERROR_CODE[8];
        eRROR_CODEArray[0] = ERROR_NONE;
        eRROR_CODEArray[1] = ERROR_NO_HEAP_MEMORY;
        eRROR_CODEArray[2] = ERROR_NO_VIRTUAL_MEMORY;
        eRROR_CODEArray[3] = ERROR_UNKNOWN_INSTRUCTION;
        eRROR_CODEArray[4] = ERROR_ILLEGAL_INSTRUCTION;
        eRROR_CODEArray[5] = ERROR_ILLEGAL_ADDRESING;
        eRROR_CODEArray[6] = ERROR_ILLEGAL_SHORT_JUMP;
        eRROR_CODEArray[7] = _ERROR_COUNT;
        $VALUES = eRROR_CODEArray;
    }

    public static ERROR_CODE valueOf(String name) {
        return Enum.valueOf(ERROR_CODE.class, name);
    }

    public final int intValue() {
        return this.ordinal();
    }

    public static ERROR_CODE[] values() {
        return (ERROR_CODE[])$VALUES.clone();
    }
}

