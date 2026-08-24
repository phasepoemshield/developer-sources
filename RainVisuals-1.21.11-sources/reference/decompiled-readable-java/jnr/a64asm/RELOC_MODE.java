/*
 * Decompiled with CFR 0.152.
 */
package jnr.a64asm;

public final class RELOC_MODE
extends Enum<RELOC_MODE> {
    private static final /* synthetic */ RELOC_MODE[] $VALUES;
    public static final /* enum */ RELOC_MODE RELOC_NONE = new RELOC_MODE();
    public static final /* enum */ RELOC_MODE RELOC_OVERWRITE = new RELOC_MODE();

    public static RELOC_MODE[] values() {
        return (RELOC_MODE[])$VALUES.clone();
    }

    public static RELOC_MODE valueOf(String name) {
        return Enum.valueOf(RELOC_MODE.class, name);
    }

    static {
        RELOC_MODE[] rELOC_MODEArray = new RELOC_MODE[2];
        rELOC_MODEArray[0] = RELOC_NONE;
        rELOC_MODEArray[1] = RELOC_OVERWRITE;
        $VALUES = rELOC_MODEArray;
    }
}

