/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jnr.x86asm;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@Deprecated
public final class RELOC_MODE
extends Enum<RELOC_MODE> {
    public static final /* enum */ RELOC_MODE RELOC_NONE = new RELOC_MODE();
    public static final /* enum */ RELOC_MODE RELOC_OVERWRITE = new RELOC_MODE();
    private static final /* synthetic */ RELOC_MODE[] $VALUES;

    public static RELOC_MODE[] values() {
        return (RELOC_MODE[])$VALUES.clone();
    }

    static {
        RELOC_MODE[] rELOC_MODEArray = new RELOC_MODE[2];
        rELOC_MODEArray[0] = RELOC_NONE;
        rELOC_MODEArray[1] = RELOC_OVERWRITE;
        $VALUES = rELOC_MODEArray;
    }

    public static RELOC_MODE valueOf(String name) {
        return Enum.valueOf(RELOC_MODE.class, name);
    }
}

