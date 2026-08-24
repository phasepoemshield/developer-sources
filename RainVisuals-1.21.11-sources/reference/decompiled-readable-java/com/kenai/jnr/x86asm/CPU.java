/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jnr.x86asm;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@Deprecated
public final class CPU
extends Enum<CPU> {
    private static final /* synthetic */ CPU[] $VALUES;
    public static final /* enum */ CPU X86_32 = new CPU();
    public static final CPU I386;
    public static final /* enum */ CPU X86_64;

    static {
        X86_64 = new CPU();
        CPU[] cPUArray = new CPU[2];
        cPUArray[0] = X86_32;
        cPUArray[1] = X86_64;
        $VALUES = cPUArray;
        I386 = X86_32;
    }

    public static CPU[] values() {
        return (CPU[])$VALUES.clone();
    }

    public static CPU valueOf(String name) {
        return Enum.valueOf(CPU.class, name);
    }
}

